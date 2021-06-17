public class HomeWorkApp5 {
    public static void main(String[] args) {
    Sotrudnik[] shtat = new Sotrudnik[7];
    shtat[0] = new Sotrudnik("Polyakov Igor Alexeyevich","machinist","igorpol@email.tu", "87654312323",80000,25);
    shtat[1] = new Sotrudnik("Saleiman Shamyl Yakubovich","engineer","shamylsal@email.tu","89076543213",80000,66);
    shtat[2] = new Sotrudnik("Andreyuk Alexander Nikolaevich","machinist","alexAndreyuk@email.tu","87689043256",80000,52);
    shtat[3] = new Sotrudnik("Baranov Alexey Vladimirovich","dep.dir", "baransranij@email.tu","89219538232",15000,39);
    shtat[4] = new Sotrudnik("Klimov Vladimir Yakovlevich","dir.eng.department","klimovboss@email.tu","89768754653",100000,71);
    shtat[5] = new Sotrudnik("Galovanov Anatolij Mikhailovich","engineer","mikhkhalich@emo.tu","86948562343",60000,60);
    shtat[6] = new Sotrudnik("Pirozhok Pavel Igorevich","assist.machinist","piromanpirozhok@tmail.ty","87866755634",70000,33);

    for (int i = 0; i < shtat.length; i++) {
        if (shtat[i].age < 40) {
        } else {
            shtat[i].printInfo();
        }
        }
}
}
