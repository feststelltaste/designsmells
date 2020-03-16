package de.feststelltaste.abstraction.dense;

public class HighComplexity {


    private boolean veryComplex(boolean a, boolean b, boolean c, boolean d) {
        if (a && d) {
            if (!b || a && !c) {
                return true;
            } else if (b) {
                return !c;
            } else if (c) {
                return d;
            } else {
                return a;
            }
        } else if (!a && !d) {
            if (b && c) {
                if (d) {
                    return !b && a;
                } else {
                    return !c;
                }
            }
        } else if (!a) {
            if (d) {
                if (b) {
                    if (c) {
                        return !a;
                    } else {
                        return a;
                    }
                } else {
                    return b && a;
                }
            }
        } else if (!d) {
            if (!d && b) {
                if (c || !a) {
                    if (c) {
                        return b;
                    } else {
                        return c;
                    }
                } else {
                    return a;
                }
            }
        }
        return a && b && c && d;
    }

    private boolean complex(boolean a, boolean b, boolean c, boolean d) {
        if (a && d) {
            if (!b || a && !c) {
                return true;
            } else if (b) {
                return !c;
            } else if (c) {
                return d;
            } else {
                return a;
            }
        } else if (!a && !d) {
            if (b && c) {
                if (d) {
                    return !b && a;
                } else {
                    return !c;
                }
            }
        } else if (!a) {
            if (d) {
                return true;
            } else {
                return false;
            }
        }
        return a && b && c && d;
    }

    private boolean lessComplex(boolean a, boolean b, boolean c, boolean d) {
        if (a && d) {
            if (!b || a && !c) {
                return true;
            } else if (b) {
                return !c;
            } else {
                return a;
            }
        }
        return true;
    }
}
