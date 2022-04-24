//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CodeSystem_Designation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodeSystem_Designation.builder()}.
 */
@org.immutables.value.Generated(from = "CodeSystem_Designation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCodeSystem_Designation implements com.fhir.CodeSystem_Designation {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.Coding use;
  private final @javax.annotation.Nullable java.lang.String value;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.code language;

  private ImmutableCodeSystem_Designation(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.Coding use,
      @javax.annotation.Nullable java.lang.String value,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.code language) {
    this.extension = extension;
    this.id = id;
    this.use = use;
    this.value = value;
    this.modifierExtension = modifierExtension;
    this.language = language;
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("use")
  @Override
  public java.util.Optional<com.fhir.Coding> use() {
    return java.util.Optional.ofNullable(use);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  @Override
  public java.util.Optional<java.lang.String> value() {
    return java.util.Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Designation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCodeSystem_Designation(newValue, this.id, this.use, this.value, this.modifierExtension, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Designation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Designation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCodeSystem_Designation(value, this.id, this.use, this.value, this.modifierExtension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Designation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCodeSystem_Designation(this.extension, newValue, this.use, this.value, this.modifierExtension, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Designation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCodeSystem_Designation(this.extension, value, this.use, this.value, this.modifierExtension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Designation#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withUse(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableCodeSystem_Designation(this.extension, this.id, newValue, this.value, this.modifierExtension, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Designation#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Designation withUse(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableCodeSystem_Designation(this.extension, this.id, value, this.value, this.modifierExtension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Designation#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withValue(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "value");
    if (java.util.Objects.equals(this.value, newValue)) return this;
    return new ImmutableCodeSystem_Designation(this.extension, this.id, this.use, newValue, this.modifierExtension, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Designation#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withValue(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.value, value)) return this;
    return new ImmutableCodeSystem_Designation(this.extension, this.id, this.use, value, this.modifierExtension, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Designation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCodeSystem_Designation(this.extension, this.id, this.use, this.value, newValue, this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Designation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Designation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCodeSystem_Designation(this.extension, this.id, this.use, this.value, value, this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Designation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCodeSystem_Designation(this.extension, this.id, this.use, this.value, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Designation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Designation withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCodeSystem_Designation(this.extension, this.id, this.use, this.value, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodeSystem_Designation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodeSystem_Designation
        && equalTo((ImmutableCodeSystem_Designation) another);
  }

  private boolean equalTo(ImmutableCodeSystem_Designation another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(use, another.use)
        && java.util.Objects.equals(value, another.value)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code id}, {@code use}, {@code value}, {@code modifierExtension}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(use);
    h += (h << 5) + java.util.Objects.hashCode(value);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code CodeSystem_Designation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CodeSystem_Designation{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (use != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (value != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (language != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("language=").append(language);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CodeSystem_Designation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CodeSystem_Designation {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> use = java.util.Optional.empty();
    boolean useIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> value = java.util.Optional.empty();
    boolean valueIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public void setUse(java.util.Optional<com.fhir.Coding> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public void setValue(java.util.Optional<java.lang.String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> use() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> value() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCodeSystem_Designation fromJson(Json json) {
    ImmutableCodeSystem_Designation.Builder builder = ImmutableCodeSystem_Designation.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    return (ImmutableCodeSystem_Designation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CodeSystem_Designation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CodeSystem_Designation instance
   */
  public static CodeSystem_Designation copyOf(CodeSystem_Designation instance) {
    if (instance instanceof ImmutableCodeSystem_Designation) {
      return (ImmutableCodeSystem_Designation) instance;
    }
    return ImmutableCodeSystem_Designation.builder()
        .extension(instance.extension())
        .id(instance.id())
        .use(instance.use())
        .value(instance.value())
        .modifierExtension(instance.modifierExtension())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link CodeSystem_Designation CodeSystem_Designation}.
   * <pre>
   * ImmutableCodeSystem_Designation.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Designation#extension() extension}
   *    .id(String) // optional {@link CodeSystem_Designation#id() id}
   *    .use(com.fhir.Coding) // optional {@link CodeSystem_Designation#use() use}
   *    .value(String) // optional {@link CodeSystem_Designation#value() value}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Designation#modifierExtension() modifierExtension}
   *    .language(com.fhir.code) // optional {@link CodeSystem_Designation#language() language}
   *    .build();
   * </pre>
   * @return A new CodeSystem_Designation builder
   */
  public static ImmutableCodeSystem_Designation.Builder builder() {
    return new ImmutableCodeSystem_Designation.Builder();
  }

  /**
   * Builds instances of type {@link CodeSystem_Designation CodeSystem_Designation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CodeSystem_Designation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_USE = 0x4L;
    private static final long OPT_BIT_VALUE = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Coding use;
    private @javax.annotation.Nullable java.lang.String value;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.code language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CodeSystem_Designation#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Designation#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Designation#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Designation#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Designation#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(com.fhir.Coding use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = java.util.Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Designation#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public final Builder use(java.util.Optional<? extends com.fhir.Coding> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Designation#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(java.lang.String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = java.util.Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Designation#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public final Builder value(java.util.Optional<java.lang.String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Designation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Designation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Designation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Designation#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Builds a new {@link CodeSystem_Designation CodeSystem_Designation}.
     * @return An immutable instance of CodeSystem_Designation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CodeSystem_Designation build() {
      return new ImmutableCodeSystem_Designation(extension, id, use, value, modifierExtension, language);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CodeSystem_Designation is strict, attribute is already set: ".concat(name));
    }
  }
}
