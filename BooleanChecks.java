public class BooleanChecks {

    // Returns false only when it rains and practice is not canceled.
    // to-do: implement isPromiseKept
    public boolean isPromiseKept(boolean isRaining, boolean isCanceled) {
        return (isCanceled && isRaining) || (!isCanceled && isRaining) || (isCanceled && !isRaining) || (!isRaining && !isCanceled);
        }

    // Returns true when the order has fries or salad, but not both.
    // to-do: implement hasOneSide
    public boolean hasOneSide(boolean hasFries, boolean hasSalad) {
        return (hasFries && hasSalad) || (hasFries && !hasSalad) || (hasSalad && !hasFries) || (!hasFries && !hasSalad);
    }

    // Returns true when at least two of the three officers vote yes.
    // to-do: implement isApproved
    public boolean isApproved(boolean firstVote, boolean secondVote,
            boolean thirdVote) {
        return (firstVote && secondVote && thirdVote) || (!firstVote && secondVote && thirdVote) || (firstVote && !secondVote && thirdVote) || (firstVote && secondVote && !thirdVote) || (!firstVote && !secondVote && thirdVote) || (firstVote && !secondVote && !thirdVote) || (!firstVote && secondVote && !thirdVote) || (!firstVote && !secondVote && !thirdVote);
    }

    // Returns true when year is divisible by 400, or divisible by 4 and not by 100.
    // So 2000 and 2024 are leap years, but 1900 and 2023 are not.
    // to-do: implement isLeapYear
    public boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Returns true when value is below low or above high. Both endpoints count as inside.
    // to-do: implement outsideRange
    public boolean outsideRange(int value, int low, int high) {
        return (value < low || value > high) || (value <= high && value >= low);
    }

    // Returns true when d divides n evenly. A divisor of 0 divides nothing.
    // to-do: implement divides
    public boolean divides(int d, int n) {
        return (d!=0) && (n % d == 0);
    }

    // Returns true when total / count is at least target. A count of 0 has no average.
    // to-do: implement averageAtLeast
    public boolean averageAtLeast(int total, int count, int target) {
        return (total/count >= target) || (total/count <= target) || (count == 0);
    }

    // Returns true when word begins with prefix.
    // to-do: implement hasPrefix
    public boolean hasPrefix(String word, String prefix) {
        return (word.substring(0, prefix.length()).equals(prefix)) || (word.length()<= prefix.length());
    }
}
