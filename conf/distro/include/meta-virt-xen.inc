# Install Xen in the raspberry pi root filesystem.
FATPAYLOAD += "/boot/xen"

# Xen dom0 console.
KERNEL_CONSOLE = "hvc0"
SERIAL_CONSOLES = "115200;hvc0"

# Xen uses u-boot for configuration and uses the uart.
RPI_USE_U_BOOT = "1"
ENABLE_UART = "1"

# Make sure xen mode is enabled in qemu
PACKAGECONFIG_append_pn-qemu = " xen"
# For ARM platforms, include fdt as well
PACKAGECONFIG_append_pn-qemu_arm = " fdt"
PACKAGECONFIG_append_pn-qemu_aarch64 = " fdt"
