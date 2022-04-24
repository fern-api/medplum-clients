//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Coding}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoding.builder()}.
 */
@org.immutables.value.Generated(from = "Coding", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoding implements com.fhir.Coding {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable com.fhir.uri system;
  private final @javax.annotation.Nullable java.lang.String display;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.lang.Boolean userSelected;

  private ImmutableCoding(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable com.fhir.uri system,
      @javax.annotation.Nullable java.lang.String display,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.lang.Boolean userSelected) {
    this.extension = extension;
    this.code = code;
    this.system = system;
    this.display = display;
    this.id = id;
    this.version = version;
    this.userSelected = userSelected;
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.code> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("system")
  @Override
  public java.util.Optional<com.fhir.uri> system() {
    return java.util.Optional.ofNullable(system);
  }

  /**
   * @return The value of the {@code display} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("display")
  @Override
  public java.util.Optional<java.lang.String> display() {
    return java.util.Optional.ofNullable(display);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code userSelected} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("userSelected")
  @Override
  public java.util.Optional<java.lang.Boolean> userSelected() {
    return java.util.Optional.ofNullable(userSelected);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoding(newValue, this.code, this.system, this.display, this.id, this.version, this.userSelected);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoding withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoding(value, this.code, this.system, this.display, this.id, this.version, this.userSelected);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCoding(this.extension, newValue, this.system, this.display, this.id, this.version, this.userSelected);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoding withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCoding(this.extension, value, this.system, this.display, this.id, this.version, this.userSelected);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withSystem(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableCoding(this.extension, this.code, newValue, this.display, this.id, this.version, this.userSelected);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoding withSystem(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableCoding(this.extension, this.code, value, this.display, this.id, this.version, this.userSelected);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withDisplay(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "display");
    if (java.util.Objects.equals(this.display, newValue)) return this;
    return new ImmutableCoding(this.extension, this.code, this.system, newValue, this.id, this.version, this.userSelected);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withDisplay(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.display, value)) return this;
    return new ImmutableCoding(this.extension, this.code, this.system, value, this.id, this.version, this.userSelected);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCoding(this.extension, this.code, this.system, this.display, newValue, this.version, this.userSelected);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCoding(this.extension, this.code, this.system, this.display, value, this.version, this.userSelected);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableCoding(this.extension, this.code, this.system, this.display, this.id, newValue, this.userSelected);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableCoding(this.extension, this.code, this.system, this.display, this.id, value, this.userSelected);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coding#userSelected() userSelected} attribute.
   * @param value The value for userSelected
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withUserSelected(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.userSelected, newValue)) return this;
    return new ImmutableCoding(this.extension, this.code, this.system, this.display, this.id, this.version, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coding#userSelected() userSelected} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for userSelected
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoding withUserSelected(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.userSelected, value)) return this;
    return new ImmutableCoding(this.extension, this.code, this.system, this.display, this.id, this.version, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoding} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoding
        && equalTo((ImmutableCoding) another);
  }

  private boolean equalTo(ImmutableCoding another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(system, another.system)
        && java.util.Objects.equals(display, another.display)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(userSelected, another.userSelected);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code code}, {@code system}, {@code display}, {@code id}, {@code version}, {@code userSelected}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(system);
    h += (h << 5) + java.util.Objects.hashCode(display);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(userSelected);
    return h;
  }

  /**
   * Prints the immutable value {@code Coding} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Coding{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (system != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("system=").append(system);
    }
    if (display != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (id != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (version != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (userSelected != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("userSelected=").append(userSelected);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Coding", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Coding {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> system = java.util.Optional.empty();
    boolean systemIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> display = java.util.Optional.empty();
    boolean displayIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> userSelected = java.util.Optional.empty();
    boolean userSelectedIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public void setSystem(java.util.Optional<com.fhir.uri> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    public void setDisplay(java.util.Optional<java.lang.String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("userSelected")
    public void setUserSelected(java.util.Optional<java.lang.Boolean> userSelected) {
      this.userSelected = userSelected;
      this.userSelectedIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> system() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> display() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> userSelected() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCoding fromJson(Json json) {
    ImmutableCoding.Builder builder = ImmutableCoding.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.userSelectedIsSet) {
      builder.userSelected(json.userSelected);
    }
    return (ImmutableCoding) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Coding} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Coding instance
   */
  public static Coding copyOf(Coding instance) {
    if (instance instanceof ImmutableCoding) {
      return (ImmutableCoding) instance;
    }
    return ImmutableCoding.builder()
        .extension(instance.extension())
        .code(instance.code())
        .system(instance.system())
        .display(instance.display())
        .id(instance.id())
        .version(instance.version())
        .userSelected(instance.userSelected())
        .build();
  }

  /**
   * Creates a builder for {@link Coding Coding}.
   * <pre>
   * ImmutableCoding.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Coding#extension() extension}
   *    .code(com.fhir.code) // optional {@link Coding#code() code}
   *    .system(com.fhir.uri) // optional {@link Coding#system() system}
   *    .display(String) // optional {@link Coding#display() display}
   *    .id(String) // optional {@link Coding#id() id}
   *    .version(String) // optional {@link Coding#version() version}
   *    .userSelected(Boolean) // optional {@link Coding#userSelected() userSelected}
   *    .build();
   * </pre>
   * @return A new Coding builder
   */
  public static ImmutableCoding.Builder builder() {
    return new ImmutableCoding.Builder();
  }

  /**
   * Builds instances of type {@link Coding Coding}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Coding", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_SYSTEM = 0x4L;
    private static final long OPT_BIT_DISPLAY = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_VERSION = 0x20L;
    private static final long OPT_BIT_USER_SELECTED = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable com.fhir.uri system;
    private @javax.annotation.Nullable java.lang.String display;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.lang.Boolean userSelected;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Coding#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(com.fhir.uri system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = java.util.Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public final Builder system(java.util.Optional<? extends com.fhir.uri> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for chained invocation
     */
    public final Builder display(java.lang.String display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = java.util.Objects.requireNonNull(display, "display");
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    public final Builder display(java.util.Optional<java.lang.String> display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = display.orElse(null);
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(java.lang.String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = java.util.Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public final Builder version(java.util.Optional<java.lang.String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#userSelected() userSelected} to userSelected.
     * @param userSelected The value for userSelected
     * @return {@code this} builder for chained invocation
     */
    public final Builder userSelected(boolean userSelected) {
      checkNotIsSet(userSelectedIsSet(), "userSelected");
      this.userSelected = userSelected;
      optBits |= OPT_BIT_USER_SELECTED;
      return this;
    }

    /**
     * Initializes the optional value {@link Coding#userSelected() userSelected} to userSelected.
     * @param userSelected The value for userSelected
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userSelected")
    public final Builder userSelected(java.util.Optional<java.lang.Boolean> userSelected) {
      checkNotIsSet(userSelectedIsSet(), "userSelected");
      this.userSelected = userSelected.orElse(null);
      optBits |= OPT_BIT_USER_SELECTED;
      return this;
    }

    /**
     * Builds a new {@link Coding Coding}.
     * @return An immutable instance of Coding
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Coding build() {
      return new ImmutableCoding(extension, code, system, display, id, version, userSelected);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean userSelectedIsSet() {
      return (optBits & OPT_BIT_USER_SELECTED) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Coding is strict, attribute is already set: ".concat(name));
    }
  }
}
