//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Composition_RelatesTo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableComposition_RelatesTo.builder()}.
 */
@org.immutables.value.Generated(from = "Composition_RelatesTo", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableComposition_RelatesTo implements com.fhir.Composition_RelatesTo {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Identifier targetIdentifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable com.fhir.Reference targetReference;

  private ImmutableComposition_RelatesTo(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Identifier targetIdentifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable com.fhir.Reference targetReference) {
    this.modifierExtension = modifierExtension;
    this.targetIdentifier = targetIdentifier;
    this.extension = extension;
    this.id = id;
    this.code = code;
    this.targetReference = targetReference;
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
   * @return The value of the {@code targetIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("targetIdentifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> targetIdentifier() {
    return java.util.Optional.ofNullable(targetIdentifier);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.code> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code targetReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("targetReference")
  @Override
  public java.util.Optional<com.fhir.Reference> targetReference() {
    return java.util.Optional.ofNullable(targetReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_RelatesTo#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableComposition_RelatesTo(newValue, this.targetIdentifier, this.extension, this.id, this.code, this.targetReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_RelatesTo#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_RelatesTo withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableComposition_RelatesTo(value, this.targetIdentifier, this.extension, this.id, this.code, this.targetReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_RelatesTo#targetIdentifier() targetIdentifier} attribute.
   * @param value The value for targetIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withTargetIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "targetIdentifier");
    if (this.targetIdentifier == newValue) return this;
    return new ImmutableComposition_RelatesTo(this.modifierExtension, newValue, this.extension, this.id, this.code, this.targetReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_RelatesTo#targetIdentifier() targetIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_RelatesTo withTargetIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.targetIdentifier == value) return this;
    return new ImmutableComposition_RelatesTo(this.modifierExtension, value, this.extension, this.id, this.code, this.targetReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_RelatesTo#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableComposition_RelatesTo(
        this.modifierExtension,
        this.targetIdentifier,
        newValue,
        this.id,
        this.code,
        this.targetReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_RelatesTo#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_RelatesTo withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableComposition_RelatesTo(this.modifierExtension, this.targetIdentifier, value, this.id, this.code, this.targetReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_RelatesTo#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableComposition_RelatesTo(
        this.modifierExtension,
        this.targetIdentifier,
        this.extension,
        newValue,
        this.code,
        this.targetReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_RelatesTo#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableComposition_RelatesTo(
        this.modifierExtension,
        this.targetIdentifier,
        this.extension,
        value,
        this.code,
        this.targetReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_RelatesTo#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableComposition_RelatesTo(
        this.modifierExtension,
        this.targetIdentifier,
        this.extension,
        this.id,
        newValue,
        this.targetReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_RelatesTo#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_RelatesTo withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableComposition_RelatesTo(
        this.modifierExtension,
        this.targetIdentifier,
        this.extension,
        this.id,
        value,
        this.targetReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_RelatesTo#targetReference() targetReference} attribute.
   * @param value The value for targetReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withTargetReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "targetReference");
    if (this.targetReference == newValue) return this;
    return new ImmutableComposition_RelatesTo(this.modifierExtension, this.targetIdentifier, this.extension, this.id, this.code, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_RelatesTo#targetReference() targetReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_RelatesTo withTargetReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.targetReference == value) return this;
    return new ImmutableComposition_RelatesTo(this.modifierExtension, this.targetIdentifier, this.extension, this.id, this.code, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableComposition_RelatesTo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableComposition_RelatesTo
        && equalTo((ImmutableComposition_RelatesTo) another);
  }

  private boolean equalTo(ImmutableComposition_RelatesTo another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(targetIdentifier, another.targetIdentifier)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(targetReference, another.targetReference);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code targetIdentifier}, {@code extension}, {@code id}, {@code code}, {@code targetReference}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(targetIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(targetReference);
    return h;
  }

  /**
   * Prints the immutable value {@code Composition_RelatesTo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Composition_RelatesTo{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (targetIdentifier != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("targetIdentifier=").append(targetIdentifier);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (code != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (targetReference != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("targetReference=").append(targetReference);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Composition_RelatesTo", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Composition_RelatesTo {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> targetIdentifier = java.util.Optional.empty();
    boolean targetIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> targetReference = java.util.Optional.empty();
    boolean targetReferenceIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("targetIdentifier")
    public void setTargetIdentifier(java.util.Optional<com.fhir.Identifier> targetIdentifier) {
      this.targetIdentifier = targetIdentifier;
      this.targetIdentifierIsSet = true;
    }
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
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("targetReference")
    public void setTargetReference(java.util.Optional<com.fhir.Reference> targetReference) {
      this.targetReference = targetReference;
      this.targetReferenceIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> targetIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> targetReference() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableComposition_RelatesTo fromJson(Json json) {
    ImmutableComposition_RelatesTo.Builder builder = ImmutableComposition_RelatesTo.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.targetIdentifierIsSet) {
      builder.targetIdentifier(json.targetIdentifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.targetReferenceIsSet) {
      builder.targetReference(json.targetReference);
    }
    return (ImmutableComposition_RelatesTo) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Composition_RelatesTo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Composition_RelatesTo instance
   */
  public static Composition_RelatesTo copyOf(Composition_RelatesTo instance) {
    if (instance instanceof ImmutableComposition_RelatesTo) {
      return (ImmutableComposition_RelatesTo) instance;
    }
    return ImmutableComposition_RelatesTo.builder()
        .modifierExtension(instance.modifierExtension())
        .targetIdentifier(instance.targetIdentifier())
        .extension(instance.extension())
        .id(instance.id())
        .code(instance.code())
        .targetReference(instance.targetReference())
        .build();
  }

  /**
   * Creates a builder for {@link Composition_RelatesTo Composition_RelatesTo}.
   * <pre>
   * ImmutableComposition_RelatesTo.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Composition_RelatesTo#modifierExtension() modifierExtension}
   *    .targetIdentifier(com.fhir.Identifier) // optional {@link Composition_RelatesTo#targetIdentifier() targetIdentifier}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Composition_RelatesTo#extension() extension}
   *    .id(String) // optional {@link Composition_RelatesTo#id() id}
   *    .code(com.fhir.code) // optional {@link Composition_RelatesTo#code() code}
   *    .targetReference(com.fhir.Reference) // optional {@link Composition_RelatesTo#targetReference() targetReference}
   *    .build();
   * </pre>
   * @return A new Composition_RelatesTo builder
   */
  public static ImmutableComposition_RelatesTo.Builder builder() {
    return new ImmutableComposition_RelatesTo.Builder();
  }

  /**
   * Builds instances of type {@link Composition_RelatesTo Composition_RelatesTo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Composition_RelatesTo", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_TARGET_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_CODE = 0x10L;
    private static final long OPT_BIT_TARGET_REFERENCE = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Identifier targetIdentifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable com.fhir.Reference targetReference;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Composition_RelatesTo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition_RelatesTo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition_RelatesTo#targetIdentifier() targetIdentifier} to targetIdentifier.
     * @param targetIdentifier The value for targetIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetIdentifier(com.fhir.Identifier targetIdentifier) {
      checkNotIsSet(targetIdentifierIsSet(), "targetIdentifier");
      this.targetIdentifier = java.util.Objects.requireNonNull(targetIdentifier, "targetIdentifier");
      optBits |= OPT_BIT_TARGET_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_RelatesTo#targetIdentifier() targetIdentifier} to targetIdentifier.
     * @param targetIdentifier The value for targetIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetIdentifier")
    public final Builder targetIdentifier(java.util.Optional<? extends com.fhir.Identifier> targetIdentifier) {
      checkNotIsSet(targetIdentifierIsSet(), "targetIdentifier");
      this.targetIdentifier = targetIdentifier.orElse(null);
      optBits |= OPT_BIT_TARGET_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_RelatesTo#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition_RelatesTo#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition_RelatesTo#id() id} to id.
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
     * Initializes the optional value {@link Composition_RelatesTo#id() id} to id.
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
     * Initializes the optional value {@link Composition_RelatesTo#code() code} to code.
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
     * Initializes the optional value {@link Composition_RelatesTo#code() code} to code.
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
     * Initializes the optional value {@link Composition_RelatesTo#targetReference() targetReference} to targetReference.
     * @param targetReference The value for targetReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetReference(com.fhir.Reference targetReference) {
      checkNotIsSet(targetReferenceIsSet(), "targetReference");
      this.targetReference = java.util.Objects.requireNonNull(targetReference, "targetReference");
      optBits |= OPT_BIT_TARGET_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_RelatesTo#targetReference() targetReference} to targetReference.
     * @param targetReference The value for targetReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetReference")
    public final Builder targetReference(java.util.Optional<? extends com.fhir.Reference> targetReference) {
      checkNotIsSet(targetReferenceIsSet(), "targetReference");
      this.targetReference = targetReference.orElse(null);
      optBits |= OPT_BIT_TARGET_REFERENCE;
      return this;
    }

    /**
     * Builds a new {@link Composition_RelatesTo Composition_RelatesTo}.
     * @return An immutable instance of Composition_RelatesTo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Composition_RelatesTo build() {
      return new ImmutableComposition_RelatesTo(modifierExtension, targetIdentifier, extension, id, code, targetReference);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean targetIdentifierIsSet() {
      return (optBits & OPT_BIT_TARGET_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean targetReferenceIsSet() {
      return (optBits & OPT_BIT_TARGET_REFERENCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Composition_RelatesTo is strict, attribute is already set: ".concat(name));
    }
  }
}
