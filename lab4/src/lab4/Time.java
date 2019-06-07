package lab4;

public class Time {
    public int hour, minute, second;

    public int getMinute(){ return this.minute;}
    public void setMin(int minute) { this.minute = newmin; }

    public Time(int hour, int minute, int second){
        this.second = second % 60;
        this.minute = (minute + second / 60) % 60;
        this.hour = (hour + (minute + second / 60) / 60) % 24;
    }

    public void setTime(int hour, int minute, int second){
        if (hour > 23 || minute > 59 || second > 50 || hour < 0 || minute < 0 || second < 0)
            System.out.println("Incorrect input");
        else{
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public String toUniversal(){
        int hr = hour, mn = minute, sc = second;
        String h = Integer.toString(hr);
        String m = Integer.toString(mn);
        String s = Integer.toString(sc);
        if (hr < 10)
            h = "0" + h;
        if (mn < 10)
            m = "0" + m;
        if (sc < 10)
            s = "0" + s;
        return h + ":" + m + ":" + s;
    }

    public String toStandard(){
        String suffix = " AM";
        int hr = hour, mn = minute, sc = second;
        if (hr > 12) {
            hr -= 12;
            suffix = " PM";
        }
        String h = Integer.toString(hr);
        String m = Integer.toString(mn);
        String s = Integer.toString(sc);
        if (hr < 10)
            h = "0" + h;
        if (mn < 10)
            m = "0" + m;
        if (sc < 10)
            s = "0" + s;
        return h + ":" + m + ":" + s + suffix;
    }

    public void add(Time t){
        int s = (this.second + t.second) % 60;
        int m = (this.minute + t.minute + (this.second + t.second) / 60) % 60;
        int h = (this.hour + t.hour + (this.minute + t.minute + (this.second + t.second) / 60) / 60) % 24;
        String hr = Integer.toString(h);
        String mn = Integer.toString(m);
        String sc = Integer.toString(s);
        if (h < 10)
            hr = "0" + hr;
        if (m < 10)
            mn = "0" + mn;
        if (s < 10)
            sc = "0" + sc;
        System.out.println(hr + ":" + mn + ":" + sc);
    }
}