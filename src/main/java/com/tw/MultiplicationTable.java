package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        if( isValid(start, end) )
            return generateTable(start, end);
        return null;
    }

    public Boolean isValid(int start, int end) {
        return  isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end) ;
    }

    public Boolean isInRange(int number) {
        return number>=1 && number<1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String table = "";

        for (int i=start; i<=end; i++){

            if (i == end)
                table +=  generateLine(start, i);
            else
                table +=  generateLine(start, i) + "\r\n";
        }
        return table;
    }

    public String generateLine(int start, int row) {
        String line = "";
        for (int i=start; i<= row; i++){
            //line = line + generateSingleExpression(i, row) + "  ";
            if (i == row)
                line +=  generateSingleExpression(i, row);
            else
                line += generateSingleExpression(i, row) + "  ";
        }

        return line;


    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        String result = multiplicand + "*" + multiplier + "=" + multiplicand*multiplier;
        return result;

    }
}