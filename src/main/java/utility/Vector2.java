package utility;

public class Vector2 {

    public float x;
    public float y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Calculates the distance between vectors.
     * 
     * @param other The vector we want to compare the distance to.
     * @return The distance
     */
    public float dist(Vector2 other) {
        float dx = other.x - this.x;
        float dy = other.y - this.x;
        return (float) Math.sqrt(dx*dx + dy*dy);
    }

    public Vector2 add(Vector2 other){
        return new Vector2(this.x + other.x, this.y + other.y);
    }

    public Vector2 sub(Vector2 other) {
        return new Vector2(this.x - other.x, this.y - other.y);
    }

    public Vector2 mult(float mult) {
        return new Vector2(this.x * mult, this.y * mult); 
    }

    public Vector2 normalize() {
        double length = Math.sqrt(this.x * this.x + this.y * this.y);
        if (length == 0) {
            return new Vector2();
        }
        return new Vector2((float) (this.x / length), (float) (this.y / length));
    }
}
