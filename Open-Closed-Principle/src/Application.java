class Application {

    // It returns the total volume of the geometric objects
    public double get_total_volume(Cuboid[] geo_objects)
    {
        // Variable to store total volume
        double vol_sum = 0;

        // Iteratively calculating the volume of each object
        // and adding it to the total volume
        for (Cuboid geo_obj : geo_objects) {

            // Iteratively calculating the volume of each object
            // and adding it to the total volume
            vol_sum += geo_obj.length * geo_obj.breadth
                    * geo_obj.height;
        }

        // returning the to total volume
        return vol_sum;
    }
}