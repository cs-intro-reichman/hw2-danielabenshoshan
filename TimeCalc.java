public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (hours*60)+minutes+minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHour = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours*60);
        String solTime = "0";
        if( newHour < 10 ){
            solTime = solTime + newHour;
        } else { 
            solTime = "" + newHour;
        }
        if(newMinutes < 10){
            solTime = solTime + ":0" + newMinutes;
        } else {
            solTime = solTime + ":" + newMinutes;
        }
        System.out.println(solTime);
    }
}
