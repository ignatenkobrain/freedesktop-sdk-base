#
# Copyright (C) 2011 Colin Walters <walters@verbum.org>
#
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"
ALLOW_EMPTY_${PN} = "1"

PR = "3"

# We explicitly want -dbg packages
INSANE_SKIP_${PN} = "debug-deps dev-deps"

RDEPENDS_${PN} += "     \
         bc \
         chrpath \
         diffutils \
         file \
         patch \
         rpm \
         strace \
         \
         autoconf \
         automake \
         binutils \
         binutils-symlinks \
         bison \
         ccache \
         cmake \
         cpp \
         cpp-symlinks \
         flex \
         g++ \
         g++-symlinks \
         gcc \
         gcc-symlinks \
         gcov \
         gdb \
         gettext \
         git \
         git-perltools \
         git-bash-completion \
         gperf \
         intltool \
         ldd \
         libtool \
         libtool-dev \
         make \
         pkgconfig \
         texinfo \
         valgrind \
         valgrind-dev \
         e2fsprogs-dev \
         libgomp-dev \
         libgomp-staticdev \
         libatomic-dev \
         libatomic-staticdev \
         openssh-ssh \
         openssh-scp \
         openssh-sftp \
         perf \
         sgml-common \
         docbook-xml-dtd4 \
         docbook-xsl-stylesheets \
         \
         libxml-parser-perl \
         libxml-parser-perl-dev \
         perl-modules \
         python-dev \
         python-modules \
         python-misc \
         python3-dev \
         python3-modules \
         python3-misc \
         python-mako \
         python3-pip \
         python-pip \
         ruby \
         \
         gdbm-dev \
         gettext-dev \
         libffi-dev \
         libpam-dev \
         libssp-dev \
         libssp-staticdev \
         util-linux-libuuid-dev \
         util-linux-bash-completion \
         libpcre-dev \
         \
         cracklib-dev \
         curl-dev \
         db-dev \
         icu-dev \
         krb5-dev \
         acl-dev \
         attr-dev \
         libcap-bin \
         libcap-dev \
         libsqlite3-dev \
         libstdc++-dev \
         libstdc++-staticdev \
         ncurses-dev \
         nspr-dev \
         nss-dev \
         \
         libexif-dev \
         libjpeg-turbo-dev \
         libogg-dev \
         libpng-dev \
         libsndfile1-dev \
         libvorbis-dev \
         libvpx-dev \
         libwebp-dev \
         giflib-dev \
         libtheora-dev \
         tiff-dev \
         flac-dev \
         speex-dev \
         libsamplerate0-dev \
         \
         bzip2-dev \
         libarchive-dev \
         xz-dev \
         zlib-dev \
         \
         gnutls-dev \
         libgcrypt-dev \
         libgpg-error-dev \
         libtasn1-bin \
         libtasn1-dev \
         nettle-dev \
         openssl-dev \
         libassuan-dev \
         gpgme-dev \
         \
         cyrus-sasl-dev \
         elfutils-binutils \
         elfutils-dev \
         expat-dev \
         gmp-dev \
         iso-codes-dev \
         json-c-dev \
         lcms-dev \
         libatomic-ops-dev \
         libatomic-ops-staticdev \
         libgcc-dev \
         libxml2-dev \
         libxml2-python \
         libxslt-bin \
         libxslt-dev \
         popt-dev \
         readline-dev \
         \
         python-smartpm \
         smartpm \
         \
         perl-dev \
         perl-module-anydbm-file \
         perl-module-app-cpan \
         perl-module-app-prove \
         perl-module-app-prove-state \
         perl-module-app-prove-state-result \
         perl-module-app-prove-state-result-test \
         perl-module-archive-tar \
         perl-module-archive-tar-constant \
         perl-module-archive-tar-file \
         perl-module-arybase \
         perl-module-attribute-handlers \
         perl-module-attributes \
         perl-module-autodie \
         perl-module-autodie-exception \
         perl-module-autodie-exception-system \
         perl-module-autodie-hints \
         perl-module-autodie-scope-guard \
         perl-module-autodie-scope-guardstack \
         perl-module-autodie-scopeutil \
         perl-module-autodie-skip \
         perl-module-autoloader \
         perl-module-autosplit \
         perl-module-autouse \
         perl-module-b \
         perl-module-base \
         perl-module-b-concise \
         perl-module-b-debug \
         perl-module-b-deparse \
         perl-module-benchmark \
         perl-module-bigint \
         perl-module-bignum \
         perl-module-bigrat \
         perl-module-blib \
         perl-module-b-op-private \
         perl-module-b-showlex \
         perl-module-b-terse \
         perl-module-b-xref \
         perl-module-bytes \
         perl-module-bytes-heavy \
         perl-module-carp \
         perl-module-carp-heavy \
         perl-module--charnames \
         perl-module-charnames \
         perl-module-class-struct \
         perl-module-compress-raw-bzip2 \
         perl-module-compress-raw-zlib \
         perl-module-compress-zlib \
         perl-module-config-extensions \
         perl-module-config-git \
         perl-module-config-perl-v \
         perl-module-constant \
         perl-module-corelist \
         perl-module-cpan \
         perl-module-cwd \
         perl-module-data-dumper \
         perl-module-db \
         perl-module-dbm-filter \
         perl-module-dbm-filter-compress \
         perl-module-dbm-filter-encode \
         perl-module-dbm-filter-int32 \
         perl-module-dbm-filter-null \
         perl-module-dbm-filter-utf8 \
         perl-module-deprecate \
         perl-module-devel-peek \
         perl-module-devel-ppport \
         perl-module-devel-selfstubber \
         perl-module-diagnostics \
         perl-module-digest \
         perl-module-digest-base \
         perl-module-digest-file \
         perl-module-digest-md5 \
         perl-module-digest-sha \
         perl-module-dirhandle \
         perl-module-dumpvalue \
         perl-module-dumpvar \
         perl-module-dynaloader \
         perl-module-encode \
         perl-module-encode-alias \
         perl-module-encode-byte \
         perl-module-encode-changes \
         perl-module-encode-cjkconstants \
         perl-module-encode-cn \
         perl-module-encode-cn-hz \
         perl-module-encode-config \
         perl-module-encode-configlocal-pm \
         perl-module-encode-ebcdic \
         perl-module-encode-encoder \
         perl-module-encode-encoding \
         perl-module-encode-gsm0338 \
         perl-module-encode-guess \
         perl-module-encode-jp \
         perl-module-encode-jp-h2z \
         perl-module-encode-jp-jis7 \
         perl-module-encode-kr \
         perl-module-encode-kr-2022-kr \
         perl-module-encode-makefile-pl \
         perl-module-encode-mime-header \
         perl-module-encode-mime-header-iso-2022-jp \
         perl-module-encode-mime-name \
         perl-module-encode--pm \
         perl-module-encode-readme \
         perl-module-encode-symbol \
         perl-module-encode--t \
         perl-module-encode-tw \
         perl-module-encode-unicode \
         perl-module-encode-unicode-utf7 \
         perl-module-encoding \
         perl-module-encoding-warnings \
         perl-module-english \
         perl-module-env \
         perl-module-errno \
         perl-module-experimental \
         perl-module-exporter \
         perl-module-exporter-heavy \
         perl-module-extutils-cbuilder \
         perl-module-extutils-cbuilder-base \
         perl-module-extutils-cbuilder-platform-aix \
         perl-module-extutils-cbuilder-platform-android \
         perl-module-extutils-cbuilder-platform-cygwin \
         perl-module-extutils-cbuilder-platform-darwin \
         perl-module-extutils-cbuilder-platform-dec-osf \
         perl-module-extutils-cbuilder-platform-os2 \
         perl-module-extutils-cbuilder-platform-unix \
         perl-module-extutils-cbuilder-platform-vms \
         perl-module-extutils-cbuilder-platform-windows \
         perl-module-extutils-cbuilder-platform-windows-bcc \
         perl-module-extutils-cbuilder-platform-windows-gcc \
         perl-module-extutils-cbuilder-platform-windows-msvc \
         perl-module-extutils-command \
         perl-module-extutils-command-mm \
         perl-module-extutils-constant \
         perl-module-extutils-constant-base \
         perl-module-extutils-constant-proxysubs \
         perl-module-extutils-constant-utils \
         perl-module-extutils-constant-xs \
         perl-module-extutils-embed \
         perl-module-extutils-install \
         perl-module-extutils-installed \
         perl-module-extutils-liblist \
         perl-module-extutils-liblist-kid \
         perl-module-extutils-makemaker \
         perl-module-extutils-makemaker-config \
         perl-module-extutils-makemaker-locale \
         perl-module-extutils-makemaker-version \
         perl-module-extutils-makemaker-version-regex \
         perl-module-extutils-makemaker-version-vpp \
         perl-module-extutils-manifest \
         perl-module-extutils-miniperl \
         perl-module-extutils-mkbootstrap \
         perl-module-extutils-mksymlists \
         perl-module-extutils-mm \
         perl-module-extutils-mm-aix \
         perl-module-extutils-mm-any \
         perl-module-extutils-mm-beos \
         perl-module-extutils-mm-cygwin \
         perl-module-extutils-mm-darwin \
         perl-module-extutils-mm-dos \
         perl-module-extutils-mm-macos \
         perl-module-extutils-mm-nw5 \
         perl-module-extutils-mm-os2 \
         perl-module-extutils-mm-qnx \
         perl-module-extutils-mm-unix \
         perl-module-extutils-mm-uwin \
         perl-module-extutils-mm-vms \
         perl-module-extutils-mm-vos \
         perl-module-extutils-mm-win32 \
         perl-module-extutils-mm-win95 \
         perl-module-extutils-my \
         perl-module-extutils-packlist \
         perl-module-extutils-parsexs \
         perl-module-extutils-parsexs-constants \
         perl-module-extutils-parsexs-countlines \
         perl-module-extutils-parsexs-eval \
         perl-module-extutils-parsexs-utilities \
         perl-module-extutils-testlib \
         perl-module-extutils-typemaps \
         perl-module-extutils-typemaps-cmd \
         perl-module-extutils-typemaps-inputmap \
         perl-module-extutils-typemaps-outputmap \
         perl-module-extutils-typemaps-type \
         perl-module-fatal \
         perl-module-fcntl \
         perl-module-feature \
         perl-module-fields \
         perl-module-file-basename \
         perl-module-filecache \
         perl-module-file-compare \
         perl-module-file-copy \
         perl-module-file-dosglob \
         perl-module-file-fetch \
         perl-module-file-find \
         perl-module-file-glob \
         perl-module-file-globmapper \
         perl-module-filehandle \
         perl-module-file-path \
         perl-module-file-spec \
         perl-module-file-spec-cygwin \
         perl-module-file-spec-epoc \
         perl-module-file-spec-functions \
         perl-module-file-spec-mac \
         perl-module-file-spec-os2 \
         perl-module-file-spec-unix \
         perl-module-file-spec-vms \
         perl-module-file-spec-win32 \
         perl-module-file-stat \
         perl-module-file-temp \
         perl-module-filetest \
         perl-module-filter-simple \
         perl-module-filter-util-call \
         perl-module-findbin \
         perl-module-getopt-long \
         perl-module-getopt-std \
         perl-module-hash-util \
         perl-module-hash-util-fieldhash \
         perl-module-http-tiny \
         perl-module-i18n-collate \
         perl-module-i18n-langinfo \
         perl-module-i18n-langtags \
         perl-module-i18n-langtags-detect \
         perl-module-i18n-langtags-list \
         perl-module-if \
         perl-module-integer \
         perl-module-io \
         perl-module-io-compress-adapter-bzip2 \
         perl-module-io-compress-adapter-deflate \
         perl-module-io-compress-adapter-identity \
         perl-module-io-compress-base \
         perl-module-io-compress-base-common \
         perl-module-io-compress-bzip2 \
         perl-module-io-compress-deflate \
         perl-module-io-compress-gzip \
         perl-module-io-compress-gzip-constants \
         perl-module-io-compress-rawdeflate \
         perl-module-io-compress-zip \
         perl-module-io-compress-zip-constants \
         perl-module-io-compress-zlib-constants \
         perl-module-io-compress-zlib-extra \
         perl-module-io-dir \
         perl-module-io-file \
         perl-module-io-handle \
         perl-module-io-pipe \
         perl-module-io-poll \
         perl-module-io-seekable \
         perl-module-io-select \
         perl-module-io-socket \
         perl-module-io-socket-inet \
         perl-module-io-socket-ip \
         perl-module-io-socket-unix \
         perl-module-io-uncompress-adapter-bunzip2 \
         perl-module-io-uncompress-adapter-identity \
         perl-module-io-uncompress-adapter-inflate \
         perl-module-io-uncompress-anyinflate \
         perl-module-io-uncompress-anyuncompress \
         perl-module-io-uncompress-base \
         perl-module-io-uncompress-bunzip2 \
         perl-module-io-uncompress-gunzip \
         perl-module-io-uncompress-inflate \
         perl-module-io-uncompress-rawinflate \
         perl-module-io-uncompress-unzip \
         perl-module-io-zlib \
         perl-module-ipc-cmd \
         perl-module-ipc-msg \
         perl-module-ipc-open2 \
         perl-module-ipc-open3 \
         perl-module-ipc-semaphore \
         perl-module-ipc-sharedmem \
         perl-module-ipc-sysv \
         perl-module-json-pp \
         perl-module-json-pp-boolean \
         perl-module-less \
         perl-module-lib \
         perl-module-list-util \
         perl-module-list-util-xs \
         perl-module-load \
         perl-module-loaded \
         perl-module-locale \
         perl-module-locale-codes \
         perl-module-locale-codes-constants \
         perl-module-locale-codes-country \
         perl-module-locale-codes-country-codes \
         perl-module-locale-codes-country-retired \
         perl-module-locale-codes-currency \
         perl-module-locale-codes-currency-codes \
         perl-module-locale-codes-currency-retired \
         perl-module-locale-codes-langext \
         perl-module-locale-codes-langext-codes \
         perl-module-locale-codes-langext-retired \
         perl-module-locale-codes-langfam \
         perl-module-locale-codes-langfam-codes \
         perl-module-locale-codes-langfam-retired \
         perl-module-locale-codes-language \
         perl-module-locale-codes-language-codes \
         perl-module-locale-codes-language-retired \
         perl-module-locale-codes-langvar \
         perl-module-locale-codes-langvar-codes \
         perl-module-locale-codes-langvar-retired \
         perl-module-locale-codes-script \
         perl-module-locale-codes-script-codes \
         perl-module-locale-codes-script-retired \
         perl-module-locale-country \
         perl-module-locale-currency \
         perl-module-locale-language \
         perl-module-locale-maketext \
         perl-module-locale-maketext-guts \
         perl-module-locale-maketext-gutsloader \
         perl-module-locale-maketext-simple \
         perl-module-locale-script \
         perl-module-math-bigfloat \
         perl-module-math-bigfloat-trace \
         perl-module-math-bigint \
         perl-module-math-bigint-calc \
         perl-module-math-bigint-calcemu \
         perl-module-math-bigint-fastcalc \
         perl-module-math-bigint-trace \
         perl-module-math-bigrat \
         perl-module-math-complex \
         perl-module-math-trig \
         perl-module-memoize \
         perl-module-memoize-anydbm-file \
         perl-module-memoize-expire \
         perl-module-memoize-expirefile \
         perl-module-memoize-expiretest \
         perl-module-memoize-ndbm-file \
         perl-module-memoize-sdbm-file \
         perl-module-memoize-storable \
         perl-module-metadata \
         perl-module-meta-notation \
         perl-module-mime-base64 \
         perl-module-mime-quotedprint \
         perl-module-mro \
         perl-module-ndbm-file \
         perl-module-net-cmd \
         perl-module-net-config \
         perl-module-net-domain \
         perl-module-net-ftp \
         perl-module-net-ftp-a \
         perl-module-net-ftp-dataconn \
         perl-module-net-ftp-e \
         perl-module-net-ftp-i \
         perl-module-net-ftp-l \
         perl-module-net-hostent \
         perl-module-net-netent \
         perl-module-net-netrc \
         perl-module-net-nntp \
         perl-module-net-ping \
         perl-module-net-pop3 \
         perl-module-net-protoent \
         perl-module-net-servent \
         perl-module-net-smtp \
         perl-module-net-time \
         perl-module-next \
         perl-module-o \
         perl-module-odbm-file \
         perl-module-ok \
         perl-module-opcode \
         perl-module-open \
         perl-module-ops \
         perl-module-overload \
         perl-module-overloading \
         perl-module-overload-numbers \
         perl-module-params-check \
         perl-module-parent \
         perl-module-parse-cpan-meta \
         perl-module-perl5db \
         perl-module-perlfaq \
         perl-module-perlio \
         perl-module-perlio-encoding \
         perl-module-perlio-mmap \
         perl-module-perlio-scalar \
         perl-module-perlio-via \
         perl-module-perlio-via-quotedprint \
         perl-module-perl-ostype \
         perl-module-pod-checker \
         perl-module-pod-escapes \
         perl-module-pod-find \
         perl-module-pod-functions \
         perl-module-pod-html \
         perl-module-pod-inputobjects \
         perl-module-pod-man \
         perl-module-pod-parselink \
         perl-module-pod-parser \
         perl-module-pod-parseutils \
         perl-module-pod-perldoc \
         perl-module-pod-perldoc-baseto \
         perl-module-pod-perldoc-getoptsoo \
         perl-module-pod-perldoc-toansi \
         perl-module-pod-perldoc-tochecker \
         perl-module-pod-perldoc-toman \
         perl-module-pod-perldoc-tonroff \
         perl-module-pod-perldoc-topod \
         perl-module-pod-perldoc-tortf \
         perl-module-pod-perldoc-toterm \
         perl-module-pod-perldoc-totext \
         perl-module-pod-perldoc-totk \
         perl-module-pod-perldoc-toxml \
         perl-module-pod-plaintext \
         perl-module-pod-select \
         perl-module-pod-simple \
         perl-module-pod-simple-blackbox \
         perl-module-pod-simple-checker \
         perl-module-pod-simple-debug \
         perl-module-pod-simple-dumpastext \
         perl-module-pod-simple-dumpasxml \
         perl-module-pod-simple-html \
         perl-module-pod-simple-htmlbatch \
         perl-module-pod-simple-htmllegacy \
         perl-module-pod-simple-linksection \
         perl-module-pod-simple-methody \
         perl-module-pod-simple-progress \
         perl-module-pod-simple-pullparser \
         perl-module-pod-simple-pullparserendtoken \
         perl-module-pod-simple-pullparserstarttoken \
         perl-module-pod-simple-pullparsertexttoken \
         perl-module-pod-simple-pullparsertoken \
         perl-module-pod-simple-rtf \
         perl-module-pod-simple-search \
         perl-module-pod-simple-simpletree \
         perl-module-pod-simple-text \
         perl-module-pod-simple-textcontent \
         perl-module-pod-simple-tiedoutfh \
         perl-module-pod-simple-transcode \
         perl-module-pod-simple-transcodedumb \
         perl-module-pod-simple-transcodesmart \
         perl-module-pod-simple-xhtml \
         perl-module-pod-simple-xmloutstream \
         perl-module-pod-text \
         perl-module-pod-text-color \
         perl-module-pod-text-overstrike \
         perl-module-pod-text-termcap \
         perl-module-pod-usage \
         perl-module-posix \
         perl-module-re \
         perl-module-safe \
         perl-module-scalar-util \
         perl-module-sdbm-file \
         perl-module-search-dict \
         perl-module-selectsaver \
         perl-module-selfloader \
         perl-module-sigtrap \
         perl-module-socket \
         perl-module-sort \
         perl-module-storable \
         perl-module-subs \
         perl-module-sub-util \
         perl-module-symbol \
         perl-module-sys-hostname \
         perl-module-sys-syslog \
         perl-module-tap-base \
         perl-module-tap-formatter-base \
         perl-module-tap-formatter-color \
         perl-module-tap-formatter-console \
         perl-module-tap-formatter-console-parallelsession \
         perl-module-tap-formatter-console-session \
         perl-module-tap-formatter-file \
         perl-module-tap-formatter-file-session \
         perl-module-tap-formatter-session \
         perl-module-tap-harness \
         perl-module-tap-harness-env \
         perl-module-tap-object \
         perl-module-tap-parser \
         perl-module-tap-parser-aggregator \
         perl-module-tap-parser-grammar \
         perl-module-tap-parser-iterator \
         perl-module-tap-parser-iterator-array \
         perl-module-tap-parser-iteratorfactory \
         perl-module-tap-parser-iterator-process \
         perl-module-tap-parser-iterator-stream \
         perl-module-tap-parser-multiplexer \
         perl-module-tap-parser-result \
         perl-module-tap-parser-result-bailout \
         perl-module-tap-parser-result-comment \
         perl-module-tap-parser-resultfactory \
         perl-module-tap-parser-result-plan \
         perl-module-tap-parser-result-pragma \
         perl-module-tap-parser-result-test \
         perl-module-tap-parser-result-unknown \
         perl-module-tap-parser-result-version \
         perl-module-tap-parser-result-yaml \
         perl-module-tap-parser-scheduler \
         perl-module-tap-parser-scheduler-job \
         perl-module-tap-parser-scheduler-spinner \
         perl-module-tap-parser-source \
         perl-module-tap-parser-sourcehandler \
         perl-module-tap-parser-sourcehandler-executable \
         perl-module-tap-parser-sourcehandler-file \
         perl-module-tap-parser-sourcehandler-handle \
         perl-module-tap-parser-sourcehandler-perl \
         perl-module-tap-parser-sourcehandler-rawtap \
         perl-module-tap-parser-yamlish-reader \
         perl-module-tap-parser-yamlish-writer \
         perl-module-term-ansicolor \
         perl-module-term-cap \
         perl-module-term-complete \
         perl-module-term-readline \
         perl-module-test \
         perl-module-test-builder \
         perl-module-test-builder-io-scalar \
         perl-module-test-builder-module \
         perl-module-test-builder-tester \
         perl-module-test-builder-tester-color \
         perl-module-test-harness \
         perl-module-test-more \
         perl-module-test-simple \
         perl-module-test-tester \
         perl-module-test-tester-capture \
         perl-module-test-tester-capturerunner \
         perl-module-test-tester-delegate \
         perl-module-test-use-ok \
         perl-module-text-abbrev \
         perl-module-text-balanced \
         perl-module-text-parsewords \
         perl-module-text-tabs \
         perl-module-text-wrap \
         perl-module-thread \
         perl-module-thread-queue \
         perl-module-threads \
         perl-module-thread-semaphore \
         perl-module-threads-shared \
         perl-module-tie-array \
         perl-module-tie-file \
         perl-module-tie-handle \
         perl-module-tie-hash \
         perl-module-tie-hash-namedcapture \
         perl-module-tie-memoize \
         perl-module-tie-refhash \
         perl-module-tie-scalar \
         perl-module-tie-stdhandle \
         perl-module-tie-substrhash \
         perl-module-time-gmtime \
         perl-module-time-hires \
         perl-module-time-local \
         perl-module-time-localtime \
         perl-module-time-piece \
         perl-module-time-seconds \
         perl-module-time-tm \
         perl-module-unicode-collate \
         perl-module-unicode-collate-cjk-big5 \
         perl-module-unicode-collate-cjk-gb2312 \
         perl-module-unicode-collate-cjk-jisx0208 \
         perl-module-unicode-collate-cjk-korean \
         perl-module-unicode-collate-cjk-pinyin \
         perl-module-unicode-collate-cjk-stroke \
         perl-module-unicode-collate-cjk-zhuyin \
         perl-module-unicode-collate-locale \
         perl-module-unicode-collate-locale-af \
         perl-module-unicode-collate-locale-ar \
         perl-module-unicode-collate-locale-as \
         perl-module-unicode-collate-locale-az \
         perl-module-unicode-collate-locale-be \
         perl-module-unicode-collate-locale-bg \
         perl-module-unicode-collate-locale-bn \
         perl-module-unicode-collate-locale-ca \
         perl-module-unicode-collate-locale-cs \
         perl-module-unicode-collate-locale-cy \
         perl-module-unicode-collate-locale-da \
         perl-module-unicode-collate-locale-de-phone \
         perl-module-unicode-collate-locale-ee \
         perl-module-unicode-collate-locale-eo \
         perl-module-unicode-collate-locale-es \
         perl-module-unicode-collate-locale-es-trad \
         perl-module-unicode-collate-locale-et \
         perl-module-unicode-collate-locale-fa \
         perl-module-unicode-collate-locale-fi \
         perl-module-unicode-collate-locale-fil \
         perl-module-unicode-collate-locale-fi-phone \
         perl-module-unicode-collate-locale-fo \
         perl-module-unicode-collate-locale-fr \
         perl-module-unicode-collate-locale-gu \
         perl-module-unicode-collate-locale-ha \
         perl-module-unicode-collate-locale-haw \
         perl-module-unicode-collate-locale-hi \
         perl-module-unicode-collate-locale-hr \
         perl-module-unicode-collate-locale-hu \
         perl-module-unicode-collate-locale-hy \
         perl-module-unicode-collate-locale-ig \
         perl-module-unicode-collate-locale-is \
         perl-module-unicode-collate-locale-ja \
         perl-module-unicode-collate-locale-kk \
         perl-module-unicode-collate-locale-kl \
         perl-module-unicode-collate-locale-kn \
         perl-module-unicode-collate-locale-ko \
         perl-module-unicode-collate-locale-kok \
         perl-module-unicode-collate-locale-ln \
         perl-module-unicode-collate-locale-lt \
         perl-module-unicode-collate-locale-lv \
         perl-module-unicode-collate-locale-mk \
         perl-module-unicode-collate-locale-ml \
         perl-module-unicode-collate-locale-mr \
         perl-module-unicode-collate-locale-mt \
         perl-module-unicode-collate-locale-nb \
         perl-module-unicode-collate-locale-nn \
         perl-module-unicode-collate-locale-nso \
         perl-module-unicode-collate-locale-om \
         perl-module-unicode-collate-locale-or \
         perl-module-unicode-collate-locale-pa \
         perl-module-unicode-collate-locale-pl \
         perl-module-unicode-collate-locale-ro \
         perl-module-unicode-collate-locale-ru \
         perl-module-unicode-collate-locale-sa \
         perl-module-unicode-collate-locale-se \
         perl-module-unicode-collate-locale-si \
         perl-module-unicode-collate-locale-si-dict \
         perl-module-unicode-collate-locale-sk \
         perl-module-unicode-collate-locale-sl \
         perl-module-unicode-collate-locale-sq \
         perl-module-unicode-collate-locale-sr \
         perl-module-unicode-collate-locale-sv \
         perl-module-unicode-collate-locale-sv-refo \
         perl-module-unicode-collate-locale-ta \
         perl-module-unicode-collate-locale-te \
         perl-module-unicode-collate-locale-th \
         perl-module-unicode-collate-locale-tn \
         perl-module-unicode-collate-locale-to \
         perl-module-unicode-collate-locale-tr \
         perl-module-unicode-collate-locale-uk \
         perl-module-unicode-collate-locale-ur \
         perl-module-unicode-collate-locale-vi \
         perl-module-unicode-collate-locale-wae \
         perl-module-unicode-collate-locale-wo \
         perl-module-unicode-collate-locale-yo \
         perl-module-unicode-collate-locale-zh \
         perl-module-unicode-collate-locale-zh-big5 \
         perl-module-unicode-collate-locale-zh-gb \
         perl-module-unicode-collate-locale-zh-pin \
         perl-module-unicode-collate-locale-zh-strk \
         perl-module-unicode-collate-locale-zh-zhu \
         perl-module-unicode-normalize \
         perl-module-unicode-ucd \
         perl-module-unicore \
         perl-module-universal \
         perl-module-user-grent \
         perl-module-user-pwent \
         perl-module-utf8 \
         perl-module-utf8-heavy \
         perl-module-version \
         perl-module-version-regex \
         perl-module-version-vpp \
         perl-module-vmsish \
         perl-module-xsloader \
	 "
