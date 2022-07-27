import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cityList = List.of(
                new City(1, "北海道", "札幌市"),
                new City(2, "青森県", "青森市"),
                new City(3, "岩手県", "盛岡市"),
                new City(4, "宮城県", "仙台市"),
                new City(5, "秋田県", "秋田市")
        );

//      noが奇数の都道府県を表示する
        for (City city : cityList) {
            if (city.getNo() % 2 == 1) {
                System.out.println(city.getPref() + "の県庁所在地は" + city.getCity() + "です。");
            }
        }

    }
}
