package com.ang.part9;

/**
 * @author: 于昂
 * @date: 2022/11/9
 **/
public class MenuTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("煎饼屋", "早餐");
        MenuComponent dinerMenu = new Menu("正餐厅", "午餐");
        MenuComponent cafeMenu = new Menu("咖啡厅", "晚餐");
        MenuComponent dessertMenu = new Menu("甜品菜单", "中式和西式甜品");

        MenuComponent allMenus = new Menu("全部菜单", "全部菜单合集");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("蔬菜沙拉", "各种蔬菜配合沙拉酱", true, 7.99));
        dinerMenu.add(new MenuItem("牛肉烧土豆", "进口牛肉配合新挖土豆", false, 12.99));
        dessertMenu.add(new MenuItem("月饼", "五仁月饼", false, 0.99));
        dinerMenu.add(dessertMenu);


        pancakeHouseMenu.add(new MenuItem("煎饼果子", "加烤肠的煎饼果子", false, 3.99));


        cafeMenu.add(new MenuItem("拿铁咖啡", "3分糖", false, 3.99));


        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();
    }
}
