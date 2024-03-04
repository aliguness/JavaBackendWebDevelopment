package java101.testN11;

import java.util.*;

public class Main {

    // __define-ocg__ Başlangıç
    // Bu fonksiyon, döngü içermeyen bir grafikteki en kısa yolu bulur.
    public static String GraphChallenge(String[] strArr) {
        // __define-ocg__ Son

        // Giriş dizisini grafik temsiline dönüştür
        int N = Integer.parseInt(strArr[0]);
        Map<String, List<String>> graph = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            graph.put(strArr[i], new ArrayList<>());
        }

        for (int i = N + 1; i < strArr.length; i++) {
            String[] nodes = strArr[i].split("-");
            graph.get(nodes[0]).add(nodes[1]);
            graph.get(nodes[1]).add(nodes[0]);
        }

        // BFS kullanarak en kısa yolu bul
        String startNode = strArr[1];
        String endNode = strArr[N];
        Map<String, String> parentMap = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(startNode);

        while (!queue.isEmpty()) {
            String currentNode = queue.poll();
            for (String neighbor : graph.get(currentNode)) {
                if (!parentMap.containsKey(neighbor)) {
                    parentMap.put(neighbor, currentNode);
                    queue.add(neighbor);

                    if (neighbor.equals(endNode)) {
                        // Yolu yeniden oluştur
                        StringBuilder path = new StringBuilder();
                        while (!currentNode.equals(startNode)) {
                            path.insert(0, "-" + currentNode);
                            currentNode = parentMap.get(currentNode);
                        }
                        return startNode + path.toString();
                    }
                }
            }
        }

        // Hiçbir yol bulunamadı
        return "-1";
    }

    // __define-ocg__ Başlangıç
    // Bu, girişi okuyan ve GraphChallenge fonksiyonunu çağıran ana fonksiyondur.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] strArr = input.split(",");
        System.out.println(GraphChallenge(strArr));
    }
    // __define-ocg__ Son
}
