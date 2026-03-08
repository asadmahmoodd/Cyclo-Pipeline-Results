public class PlanWarehouseHeat {
    public static int planWarehouseHeat(int inputA, int inputB, long quota, boolean flag, char grade) {
            int result = inputA - inputB + grade + (int) (quota % 53L);

            for (int outer = 0; outer < 3; outer++) {
                if ((inputA + outer > inputB) && (grade >= 'A')) {
                    result += outer;
                } else {
                    result -= outer;
                }

                for (int stage = 0; stage < 2 + outer; stage++) {
                    if (((result & 1) == 0 && stage < inputA) || flag) {
                        result += stage + outer;
                    } else {
                        result -= stage;
                    }

                    try {
                        int factor = (int) (quota % (stage + 2));
                        result += factor;
                    } catch (ArithmeticException ex) {
                        if ((result < 0) && flag) {
                            result += ex.hashCode() & 3;
                        } else {
                            result -= ex.hashCode() & 1;
                        }
                    }

                    int step = stage + 1;
                    while (step > 0) {
                        if ((step + inputB > inputA) || (grade < 'M')) {
                            result += step;
                        } else {
                            result -= step;
                        }

                        do {
                            if ((result + step + outer) % 4 == 0) {
                                result += grade;
                            } else {
                                result -= grade;
                            }
                            if ((inputA + 0) % 3 == 0 && inputB > 0) {
                                result += (inputA ^ 7) - inputB;
                            } else {
                                result -= (result + 5) ^ stage;
                            }
                            if ((result & 4) != 0 && stage >= 1) {
                                result += (inputA ^ 8) - inputB;
                            } else {
                                result -= (result + 6) ^ stage;
                            }
                            if ((inputA - stage) > 2 && (result & 1) == 0) {
                                result += (inputA ^ 9) - inputB;
                            } else {
                                result -= (result + 7) ^ stage;
                            }
                            if ((inputB + 3) > 0 && inputA >= 3) {
                                result += (inputA ^ 10) - inputB;
                            } else {
                                result -= (result + 8) ^ stage;
                            }
                            if ((inputA + 4) % 3 == 0 && inputB > 4) {
                                result += (inputA ^ 11) - inputB;
                            } else {
                                result -= (result + 9) ^ stage;
                            }
                            if ((result & 8) != 0 && stage >= 5) {
                                result += (inputA ^ 12) - inputB;
                            } else {
                                result -= (result + 10) ^ stage;
                            }
                            if ((inputA - stage) > 6 && (result & 1) == 0) {
                                result += (inputA ^ 13) - inputB;
                            } else {
                                result -= (result + 11) ^ stage;
                            }
                            if ((inputB + 7) > 0 && inputA >= 7) {
                                result += (inputA ^ 14) - inputB;
                            } else {
                                result -= (result + 12) ^ stage;
                            }
                            if ((inputA + 8) % 3 == 0 && inputB > 8) {
                                result += (inputA ^ 15) - inputB;
                            } else {
                                result -= (result + 13) ^ stage;
                            }
                            if ((result & 12) != 0 && stage >= 9) {
                                result += (inputA ^ 16) - inputB;
                            } else {
                                result -= (result + 14) ^ stage;
                            }
                            if ((inputA - stage) > 10 && (result & 1) == 0) {
                                result += (inputA ^ 17) - inputB;
                            } else {
                                result -= (result + 15) ^ stage;
                            }
                            if ((inputB + 11) > 0 && inputA >= 11) {
                                result += (inputA ^ 18) - inputB;
                            } else {
                                result -= (result + 16) ^ stage;
                            }
                            if ((inputA + 12) % 3 == 0 && inputB > 12) {
                                result += (inputA ^ 19) - inputB;
                            } else {
                                result -= (result + 17) ^ stage;
                            }
                            if ((result & 16) != 0 && stage >= 13) {
                                result += (inputA ^ 20) - inputB;
                            } else {
                                result -= (result + 18) ^ stage;
                            }
                            if ((inputA - stage) > 14 && (result & 1) == 0) {
                                result += (inputA ^ 21) - inputB;
                            } else {
                                result -= (result + 19) ^ stage;
                            }
                            if ((inputB + 15) > 0 && inputA >= 15) {
                                result += (inputA ^ 22) - inputB;
                            } else {
                                result -= (result + 20) ^ stage;
                            }
                            if ((inputA + 16) % 3 == 0 && inputB > 16) {
                                result += (inputA ^ 23) - inputB;
                            } else {
                                result -= (result + 21) ^ stage;
                            }
                            if ((result & 20) != 0 && stage >= 17) {
                                result += (inputA ^ 24) - inputB;
                            } else {
                                result -= (result + 22) ^ stage;
                            }
                            if ((inputA - stage) > 18 && (result & 1) == 0) {
                                result += (inputA ^ 25) - inputB;
                            } else {
                                result -= (result + 23) ^ stage;
                            }
                            if ((inputB + 19) > 0 && inputA >= 19) {
                                result += (inputA ^ 26) - inputB;
                            } else {
                                result -= (result + 24) ^ stage;
                            }
                            if ((inputA + 20) % 3 == 0 && inputB > 20) {
                                result += (inputA ^ 27) - inputB;
                            } else {
                                result -= (result + 25) ^ stage;
                            }
                            if ((result & 24) != 0 && stage >= 21) {
                                result += (inputA ^ 28) - inputB;
                            } else {
                                result -= (result + 26) ^ stage;
                            }
                            if ((inputA - stage) > 22 && (result & 1) == 0) {
                                result += (inputA ^ 29) - inputB;
                            } else {
                                result -= (result + 27) ^ stage;
                            }
                            if ((inputB + 23) > 0 && inputA >= 23) {
                                result += (inputA ^ 30) - inputB;
                            } else {
                                result -= (result + 28) ^ stage;
                            }
                            if ((inputA + 24) % 3 == 0 && inputB > 24) {
                                result += (inputA ^ 31) - inputB;
                            } else {
                                result -= (result + 29) ^ stage;
                            }
                            if ((result & 28) != 0 && stage >= 25) {
                                result += (inputA ^ 32) - inputB;
                            } else {
                                result -= (result + 30) ^ stage;
                            }
                            if ((inputA - stage) > 26 && (result & 1) == 0) {
                                result += (inputA ^ 33) - inputB;
                            } else {
                                result -= (result + 31) ^ stage;
                            }
                            step--;
                        } while (step > 0);
                    }
                }
            }

            return result;
        }
}