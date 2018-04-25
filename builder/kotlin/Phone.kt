package androidhot.github.io.designpatterndemo.builder.kotlin

class Phone private constructor(builder: Builder) {
    // Required parameters
    private val mName: String
    private val mPrice: Float

    // Optional parameters
    private val mCpu: String
    private val mMemory: Int
    private val mStorage: Int
    private val mWeight: Float

    init {
        mName = builder.getName()
        mPrice = builder.getPrice()
        mCpu = builder.getCpu()
        mMemory = builder.getMemory()
        mStorage = builder.getStorage()
        mWeight = builder.getWeight()
    }

    // some function

    class Builder(private val name: String, private val price: Float) {

        // Optional parameters, initialized to default values.
        private var cpu = ""
        private var memory = 0
        private var storage = 0
        private var weight = 0f

        fun getName(): String {
            return name
        }

        fun getPrice(): Float {
            return price
        }

        fun setCpu(cpu: String): Builder {
            this.cpu = cpu
            return this
        }

        fun getCpu(): String {
            return cpu
        }

        fun setMemory(memory: Int): Builder {
            this.memory = memory
            return this
        }

        fun getMemory(): Int {
            return memory
        }

        fun setStorage(storage: Int): Builder {
            this.storage = storage
            return this
        }

        fun getStorage(): Int {
            return storage
        }

        fun setWeight(weight: Float): Builder {
            this.weight = weight
            return this
        }

        fun getWeight(): Float {
            return weight
        }

        fun build(): Phone {
            return Phone(this)
        }
    }
}
