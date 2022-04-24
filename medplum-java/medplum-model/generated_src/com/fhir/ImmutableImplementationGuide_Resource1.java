//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ImplementationGuide_Resource1}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide_Resource1.builder()}.
 */
@org.immutables.value.Generated(from = "ImplementationGuide_Resource1", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide_Resource1 implements com.fhir.ImplementationGuide_Resource1 {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final com.fhir.Reference reference;
  private final @javax.annotation.Nullable java.lang.Boolean exampleBoolean;
  private final @javax.annotation.Nullable com.fhir.url relativePath;
  private final @javax.annotation.Nullable java.lang.String exampleCanonical;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableImplementationGuide_Resource1(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      com.fhir.Reference reference,
      @javax.annotation.Nullable java.lang.Boolean exampleBoolean,
      @javax.annotation.Nullable com.fhir.url relativePath,
      @javax.annotation.Nullable java.lang.String exampleCanonical,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.id = id;
    this.extension = extension;
    this.reference = reference;
    this.exampleBoolean = exampleBoolean;
    this.relativePath = relativePath;
    this.exampleCanonical = exampleCanonical;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reference")
  @Override
  public com.fhir.Reference reference() {
    return reference;
  }

  /**
   * @return The value of the {@code exampleBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("exampleBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> exampleBoolean() {
    return java.util.Optional.ofNullable(exampleBoolean);
  }

  /**
   * @return The value of the {@code relativePath} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relativePath")
  @Override
  public java.util.Optional<com.fhir.url> relativePath() {
    return java.util.Optional.ofNullable(relativePath);
  }

  /**
   * @return The value of the {@code exampleCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("exampleCanonical")
  @Override
  public java.util.Optional<java.lang.String> exampleCanonical() {
    return java.util.Optional.ofNullable(exampleCanonical);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource1#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableImplementationGuide_Resource1(
        newValue,
        this.extension,
        this.reference,
        this.exampleBoolean,
        this.relativePath,
        this.exampleCanonical,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource1#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableImplementationGuide_Resource1(
        value,
        this.extension,
        this.reference,
        this.exampleBoolean,
        this.relativePath,
        this.exampleCanonical,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource1#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        newValue,
        this.reference,
        this.exampleBoolean,
        this.relativePath,
        this.exampleCanonical,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource1#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource1 withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        value,
        this.reference,
        this.exampleBoolean,
        this.relativePath,
        this.exampleCanonical,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImplementationGuide_Resource1#reference() reference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for reference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withReference(com.fhir.Reference value) {
    if (this.reference == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "reference");
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        newValue,
        this.exampleBoolean,
        this.relativePath,
        this.exampleCanonical,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean} attribute.
   * @param value The value for exampleBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withExampleBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.exampleBoolean, newValue)) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        newValue,
        this.relativePath,
        this.exampleCanonical,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exampleBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withExampleBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.exampleBoolean, value)) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        value,
        this.relativePath,
        this.exampleCanonical,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource1#relativePath() relativePath} attribute.
   * @param value The value for relativePath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withRelativePath(com.fhir.url value) {
    @javax.annotation.Nullable com.fhir.url newValue = java.util.Objects.requireNonNull(value, "relativePath");
    if (this.relativePath == newValue) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        this.exampleBoolean,
        newValue,
        this.exampleCanonical,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource1#relativePath() relativePath} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relativePath
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource1 withRelativePath(java.util.Optional<? extends com.fhir.url> optional) {
    @javax.annotation.Nullable com.fhir.url value = optional.orElse(null);
    if (this.relativePath == value) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        this.exampleBoolean,
        value,
        this.exampleCanonical,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical} attribute.
   * @param value The value for exampleCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withExampleCanonical(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "exampleCanonical");
    if (java.util.Objects.equals(this.exampleCanonical, newValue)) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        this.exampleBoolean,
        this.relativePath,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exampleCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withExampleCanonical(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.exampleCanonical, value)) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        this.exampleBoolean,
        this.relativePath,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource1 withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        this.exampleBoolean,
        this.relativePath,
        this.exampleCanonical,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource1 withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide_Resource1(
        this.id,
        this.extension,
        this.reference,
        this.exampleBoolean,
        this.relativePath,
        this.exampleCanonical,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide_Resource1} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide_Resource1
        && equalTo((ImmutableImplementationGuide_Resource1) another);
  }

  private boolean equalTo(ImmutableImplementationGuide_Resource1 another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && reference.equals(another.reference)
        && java.util.Objects.equals(exampleBoolean, another.exampleBoolean)
        && java.util.Objects.equals(relativePath, another.relativePath)
        && java.util.Objects.equals(exampleCanonical, another.exampleCanonical)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code reference}, {@code exampleBoolean}, {@code relativePath}, {@code exampleCanonical}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + reference.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(exampleBoolean);
    h += (h << 5) + java.util.Objects.hashCode(relativePath);
    h += (h << 5) + java.util.Objects.hashCode(exampleCanonical);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide_Resource1} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ImplementationGuide_Resource1{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 30) builder.append(", ");
    builder.append("reference=").append(reference);
    if (exampleBoolean != null) {
      builder.append(", ");
      builder.append("exampleBoolean=").append(exampleBoolean);
    }
    if (relativePath != null) {
      builder.append(", ");
      builder.append("relativePath=").append(relativePath);
    }
    if (exampleCanonical != null) {
      builder.append(", ");
      builder.append("exampleCanonical=").append(exampleCanonical);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ImplementationGuide_Resource1", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ImplementationGuide_Resource1 {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable com.fhir.Reference reference;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> exampleBoolean = java.util.Optional.empty();
    boolean exampleBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.url> relativePath = java.util.Optional.empty();
    boolean relativePathIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> exampleCanonical = java.util.Optional.empty();
    boolean exampleCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    public void setReference(com.fhir.Reference reference) {
      this.reference = reference;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("exampleBoolean")
    public void setExampleBoolean(java.util.Optional<java.lang.Boolean> exampleBoolean) {
      this.exampleBoolean = exampleBoolean;
      this.exampleBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relativePath")
    public void setRelativePath(java.util.Optional<com.fhir.url> relativePath) {
      this.relativePath = relativePath;
      this.relativePathIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("exampleCanonical")
    public void setExampleCanonical(java.util.Optional<java.lang.String> exampleCanonical) {
      this.exampleCanonical = exampleCanonical;
      this.exampleCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference reference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> exampleBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.url> relativePath() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> exampleCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableImplementationGuide_Resource1 fromJson(Json json) {
    ImmutableImplementationGuide_Resource1.Builder builder = ((ImmutableImplementationGuide_Resource1.Builder) ImmutableImplementationGuide_Resource1.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.reference != null) {
      builder.reference(json.reference);
    }
    if (json.exampleBooleanIsSet) {
      builder.exampleBoolean(json.exampleBoolean);
    }
    if (json.relativePathIsSet) {
      builder.relativePath(json.relativePath);
    }
    if (json.exampleCanonicalIsSet) {
      builder.exampleCanonical(json.exampleCanonical);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableImplementationGuide_Resource1) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide_Resource1} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide_Resource1 instance
   */
  public static ImplementationGuide_Resource1 copyOf(ImplementationGuide_Resource1 instance) {
    if (instance instanceof ImmutableImplementationGuide_Resource1) {
      return (ImmutableImplementationGuide_Resource1) instance;
    }
    return ((ImmutableImplementationGuide_Resource1.Builder) ImmutableImplementationGuide_Resource1.builder())
        .id(instance.id())
        .extension(instance.extension())
        .reference(instance.reference())
        .exampleBoolean(instance.exampleBoolean())
        .relativePath(instance.relativePath())
        .exampleCanonical(instance.exampleCanonical())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide_Resource1 ImplementationGuide_Resource1}.
   * <pre>
   * ImmutableImplementationGuide_Resource1.builder()
   *    .id(String) // optional {@link ImplementationGuide_Resource1#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Resource1#extension() extension}
   *    .reference(com.fhir.Reference) // required {@link ImplementationGuide_Resource1#reference() reference}
   *    .exampleBoolean(Boolean) // optional {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean}
   *    .relativePath(com.fhir.url) // optional {@link ImplementationGuide_Resource1#relativePath() relativePath}
   *    .exampleCanonical(String) // optional {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide_Resource1 builder
   */
  public static ReferenceBuildStage builder() {
    return new ImmutableImplementationGuide_Resource1.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide_Resource1 ImplementationGuide_Resource1}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ImplementationGuide_Resource1", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ReferenceBuildStage, BuildFinal {
    private static final long INIT_BIT_REFERENCE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXAMPLE_BOOLEAN = 0x4L;
    private static final long OPT_BIT_RELATIVE_PATH = 0x8L;
    private static final long OPT_BIT_EXAMPLE_CANONICAL = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference reference;
    private @javax.annotation.Nullable java.lang.Boolean exampleBoolean;
    private @javax.annotation.Nullable com.fhir.url relativePath;
    private @javax.annotation.Nullable java.lang.String exampleCanonical;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Resource1#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Resource1#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Resource1#extension() extension} to extension.
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
     * Initializes the value for the {@link ImplementationGuide_Resource1#reference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    public final Builder reference(com.fhir.Reference reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = java.util.Objects.requireNonNull(reference, "reference");
      initBits &= ~INIT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder exampleBoolean(boolean exampleBoolean) {
      checkNotIsSet(exampleBooleanIsSet(), "exampleBoolean");
      this.exampleBoolean = exampleBoolean;
      optBits |= OPT_BIT_EXAMPLE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exampleBoolean")
    public final Builder exampleBoolean(java.util.Optional<java.lang.Boolean> exampleBoolean) {
      checkNotIsSet(exampleBooleanIsSet(), "exampleBoolean");
      this.exampleBoolean = exampleBoolean.orElse(null);
      optBits |= OPT_BIT_EXAMPLE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#relativePath() relativePath} to relativePath.
     * @param relativePath The value for relativePath
     * @return {@code this} builder for chained invocation
     */
    public final Builder relativePath(com.fhir.url relativePath) {
      checkNotIsSet(relativePathIsSet(), "relativePath");
      this.relativePath = java.util.Objects.requireNonNull(relativePath, "relativePath");
      optBits |= OPT_BIT_RELATIVE_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#relativePath() relativePath} to relativePath.
     * @param relativePath The value for relativePath
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relativePath")
    public final Builder relativePath(java.util.Optional<? extends com.fhir.url> relativePath) {
      checkNotIsSet(relativePathIsSet(), "relativePath");
      this.relativePath = relativePath.orElse(null);
      optBits |= OPT_BIT_RELATIVE_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder exampleCanonical(java.lang.String exampleCanonical) {
      checkNotIsSet(exampleCanonicalIsSet(), "exampleCanonical");
      this.exampleCanonical = java.util.Objects.requireNonNull(exampleCanonical, "exampleCanonical");
      optBits |= OPT_BIT_EXAMPLE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exampleCanonical")
    public final Builder exampleCanonical(java.util.Optional<java.lang.String> exampleCanonical) {
      checkNotIsSet(exampleCanonicalIsSet(), "exampleCanonical");
      this.exampleCanonical = exampleCanonical.orElse(null);
      optBits |= OPT_BIT_EXAMPLE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ImplementationGuide_Resource1 ImplementationGuide_Resource1}.
     * @return An immutable instance of ImplementationGuide_Resource1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ImplementationGuide_Resource1 build() {
      checkRequiredAttributes();
      return new ImmutableImplementationGuide_Resource1(id, extension, reference, exampleBoolean, relativePath, exampleCanonical, modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean exampleBooleanIsSet() {
      return (optBits & OPT_BIT_EXAMPLE_BOOLEAN) != 0;
    }

    private boolean relativePathIsSet() {
      return (optBits & OPT_BIT_RELATIVE_PATH) != 0;
    }

    private boolean exampleCanonicalIsSet() {
      return (optBits & OPT_BIT_EXAMPLE_CANONICAL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean referenceIsSet() {
      return (initBits & INIT_BIT_REFERENCE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ImplementationGuide_Resource1 is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!referenceIsSet()) attributes.add("reference");
      return "Cannot build ImplementationGuide_Resource1, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ImplementationGuide_Resource1", generator = "Immutables")
  public interface ReferenceBuildStage {
    /**
     * Initializes the value for the {@link ImplementationGuide_Resource1#reference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reference(com.fhir.Reference reference);
  }

  @org.immutables.value.Generated(from = "ImplementationGuide_Resource1", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exampleBoolean(boolean exampleBoolean);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exampleBoolean(java.util.Optional<java.lang.Boolean> exampleBoolean);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#relativePath() relativePath} to relativePath.
     * @param relativePath The value for relativePath
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relativePath(com.fhir.url relativePath);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#relativePath() relativePath} to relativePath.
     * @param relativePath The value for relativePath
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relativePath(java.util.Optional<? extends com.fhir.url> relativePath);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exampleCanonical(java.lang.String exampleCanonical);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exampleCanonical(java.util.Optional<java.lang.String> exampleCanonical);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource1#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link ImplementationGuide_Resource1 ImplementationGuide_Resource1}.
     * @return An immutable instance of ImplementationGuide_Resource1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImplementationGuide_Resource1 build();
  }
}
