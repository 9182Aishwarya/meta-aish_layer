SUMMARY = "Student data application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI =  "\
    file://makefile \
    file://include/student.h \
    file://src/main.c \
    file://src/student.c \
    file://src/Process_student.c \
    file://src/makefile \
"

S = "${UNPACKDIR}" 
#"${WORKDIR}/sorce"

do_configure() {
    export CFLAGS="${CFLAGS} -Wall"
}

do_compile() {
    make
}

do_install() {
    install -d ${D}${bindir}
     install -m 0755 bin/week1_project ${D}${bindir}/student-data
}
