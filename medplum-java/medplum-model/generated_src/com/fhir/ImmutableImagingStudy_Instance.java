//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ImagingStudy_Instance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImagingStudy_Instance.builder()}.
 */
@org.immutables.value.Generated(from = "ImagingStudy_Instance", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImagingStudy_Instance implements com.fhir.ImagingStudy_Instance {
  private final @javax.annotation.Nullable com.fhir.unsignedInt number;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.id uid;
  private final @javax.annotation.Nullable java.lang.String title;
  private final com.fhir.Coding sopClass;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutableImagingStudy_Instance(
      @javax.annotation.Nullable com.fhir.unsignedInt number,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.id uid,
      @javax.annotation.Nullable java.lang.String title,
      com.fhir.Coding sopClass,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.number = number;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.uid = uid;
    this.title = title;
    this.sopClass = sopClass;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code number} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("number")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> number() {
    return java.util.Optional.ofNullable(number);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code uid} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("uid")
  @Override
  public java.util.Optional<com.fhir.id> uid() {
    return java.util.Optional.ofNullable(uid);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code sopClass} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sopClass")
  @Override
  public com.fhir.Coding sopClass() {
    return sopClass;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Instance#number() number} attribute.
   * @param value The value for number
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withNumber(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "number");
    if (this.number == newValue) return this;
    return new ImmutableImagingStudy_Instance(newValue, this.modifierExtension, this.id, this.uid, this.title, this.sopClass, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Instance#number() number} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for number
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Instance withNumber(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.number == value) return this;
    return new ImmutableImagingStudy_Instance(value, this.modifierExtension, this.id, this.uid, this.title, this.sopClass, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Instance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImagingStudy_Instance(this.number, newValue, this.id, this.uid, this.title, this.sopClass, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Instance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Instance withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImagingStudy_Instance(this.number, value, this.id, this.uid, this.title, this.sopClass, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Instance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableImagingStudy_Instance(
        this.number,
        this.modifierExtension,
        newValue,
        this.uid,
        this.title,
        this.sopClass,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Instance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableImagingStudy_Instance(this.number, this.modifierExtension, value, this.uid, this.title, this.sopClass, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Instance#uid() uid} attribute.
   * @param value The value for uid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withUid(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "uid");
    if (this.uid == newValue) return this;
    return new ImmutableImagingStudy_Instance(
        this.number,
        this.modifierExtension,
        this.id,
        newValue,
        this.title,
        this.sopClass,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Instance#uid() uid} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for uid
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Instance withUid(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.uid == value) return this;
    return new ImmutableImagingStudy_Instance(this.number, this.modifierExtension, this.id, value, this.title, this.sopClass, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Instance#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableImagingStudy_Instance(this.number, this.modifierExtension, this.id, this.uid, newValue, this.sopClass, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Instance#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableImagingStudy_Instance(this.number, this.modifierExtension, this.id, this.uid, value, this.sopClass, this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImagingStudy_Instance#sopClass() sopClass} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sopClass
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImagingStudy_Instance withSopClass(com.fhir.Coding value) {
    if (this.sopClass == value) return this;
    com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "sopClass");
    return new ImmutableImagingStudy_Instance(this.number, this.modifierExtension, this.id, this.uid, this.title, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Instance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Instance withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImagingStudy_Instance(this.number, this.modifierExtension, this.id, this.uid, this.title, this.sopClass, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Instance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Instance withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImagingStudy_Instance(this.number, this.modifierExtension, this.id, this.uid, this.title, this.sopClass, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImagingStudy_Instance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImagingStudy_Instance
        && equalTo((ImmutableImagingStudy_Instance) another);
  }

  private boolean equalTo(ImmutableImagingStudy_Instance another) {
    return java.util.Objects.equals(number, another.number)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(uid, another.uid)
        && java.util.Objects.equals(title, another.title)
        && sopClass.equals(another.sopClass)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code number}, {@code modifierExtension}, {@code id}, {@code uid}, {@code title}, {@code sopClass}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(number);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(uid);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + sopClass.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ImagingStudy_Instance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ImagingStudy_Instance{");
    if (number != null) {
      builder.append("number=").append(number);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (uid != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("uid=").append(uid);
    }
    if (title != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("sopClass=").append(sopClass);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ImagingStudy_Instance", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ImagingStudy_Instance {
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> number = java.util.Optional.empty();
    boolean numberIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> uid = java.util.Optional.empty();
    boolean uidIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable com.fhir.Coding sopClass;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    public void setNumber(java.util.Optional<com.fhir.unsignedInt> number) {
      this.number = number;
      this.numberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("uid")
    public void setUid(java.util.Optional<com.fhir.id> uid) {
      this.uid = uid;
      this.uidIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sopClass")
    public void setSopClass(com.fhir.Coding sopClass) {
      this.sopClass = sopClass;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> number() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> uid() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Coding sopClass() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableImagingStudy_Instance fromJson(Json json) {
    ImmutableImagingStudy_Instance.Builder builder = ((ImmutableImagingStudy_Instance.Builder) ImmutableImagingStudy_Instance.builder());
    if (json.numberIsSet) {
      builder.number(json.number);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.uidIsSet) {
      builder.uid(json.uid);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.sopClass != null) {
      builder.sopClass(json.sopClass);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableImagingStudy_Instance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImagingStudy_Instance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImagingStudy_Instance instance
   */
  public static ImagingStudy_Instance copyOf(ImagingStudy_Instance instance) {
    if (instance instanceof ImmutableImagingStudy_Instance) {
      return (ImmutableImagingStudy_Instance) instance;
    }
    return ((ImmutableImagingStudy_Instance.Builder) ImmutableImagingStudy_Instance.builder())
        .number(instance.number())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .uid(instance.uid())
        .title(instance.title())
        .sopClass(instance.sopClass())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ImagingStudy_Instance ImagingStudy_Instance}.
   * <pre>
   * ImmutableImagingStudy_Instance.builder()
   *    .number(com.fhir.unsignedInt) // optional {@link ImagingStudy_Instance#number() number}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImagingStudy_Instance#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link ImagingStudy_Instance#id() id}
   *    .uid(com.fhir.id) // optional {@link ImagingStudy_Instance#uid() uid}
   *    .title(String) // optional {@link ImagingStudy_Instance#title() title}
   *    .sopClass(com.fhir.Coding) // required {@link ImagingStudy_Instance#sopClass() sopClass}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImagingStudy_Instance#extension() extension}
   *    .build();
   * </pre>
   * @return A new ImagingStudy_Instance builder
   */
  public static SopClassBuildStage builder() {
    return new ImmutableImagingStudy_Instance.Builder();
  }

  /**
   * Builds instances of type {@link ImagingStudy_Instance ImagingStudy_Instance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ImagingStudy_Instance", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements SopClassBuildStage, BuildFinal {
    private static final long INIT_BIT_SOP_CLASS = 0x1L;
    private static final long OPT_BIT_NUMBER = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_UID = 0x8L;
    private static final long OPT_BIT_TITLE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.unsignedInt number;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.id uid;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable com.fhir.Coding sopClass;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    public final Builder number(com.fhir.unsignedInt number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = java.util.Objects.requireNonNull(number, "number");
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    public final Builder number(java.util.Optional<? extends com.fhir.unsignedInt> number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = number.orElse(null);
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy_Instance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy_Instance#id() id} to id.
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
     * Initializes the optional value {@link ImagingStudy_Instance#id() id} to id.
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
     * Initializes the optional value {@link ImagingStudy_Instance#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for chained invocation
     */
    public final Builder uid(com.fhir.id uid) {
      checkNotIsSet(uidIsSet(), "uid");
      this.uid = java.util.Objects.requireNonNull(uid, "uid");
      optBits |= OPT_BIT_UID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uid")
    public final Builder uid(java.util.Optional<? extends com.fhir.id> uid) {
      checkNotIsSet(uidIsSet(), "uid");
      this.uid = uid.orElse(null);
      optBits |= OPT_BIT_UID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(java.lang.String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = java.util.Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public final Builder title(java.util.Optional<java.lang.String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the value for the {@link ImagingStudy_Instance#sopClass() sopClass} attribute.
     * @param sopClass The value for sopClass 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sopClass")
    public final Builder sopClass(com.fhir.Coding sopClass) {
      checkNotIsSet(sopClassIsSet(), "sopClass");
      this.sopClass = java.util.Objects.requireNonNull(sopClass, "sopClass");
      initBits &= ~INIT_BIT_SOP_CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#extension() extension} to extension.
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
     * Initializes the optional value {@link ImagingStudy_Instance#extension() extension} to extension.
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
     * Builds a new {@link ImagingStudy_Instance ImagingStudy_Instance}.
     * @return An immutable instance of ImagingStudy_Instance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ImagingStudy_Instance build() {
      checkRequiredAttributes();
      return new ImmutableImagingStudy_Instance(number, modifierExtension, id, uid, title, sopClass, extension);
    }

    private boolean numberIsSet() {
      return (optBits & OPT_BIT_NUMBER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean uidIsSet() {
      return (optBits & OPT_BIT_UID) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean sopClassIsSet() {
      return (initBits & INIT_BIT_SOP_CLASS) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ImagingStudy_Instance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!sopClassIsSet()) attributes.add("sopClass");
      return "Cannot build ImagingStudy_Instance, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ImagingStudy_Instance", generator = "Immutables")
  public interface SopClassBuildStage {
    /**
     * Initializes the value for the {@link ImagingStudy_Instance#sopClass() sopClass} attribute.
     * @param sopClass The value for sopClass 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sopClass(com.fhir.Coding sopClass);
  }

  @org.immutables.value.Generated(from = "ImagingStudy_Instance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    BuildFinal number(com.fhir.unsignedInt number);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal number(java.util.Optional<? extends com.fhir.unsignedInt> number);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for chained invocation
     */
    BuildFinal uid(com.fhir.id uid);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#uid() uid} to uid.
     * @param uid The value for uid
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal uid(java.util.Optional<? extends com.fhir.id> uid);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ImagingStudy_Instance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Builds a new {@link ImagingStudy_Instance ImagingStudy_Instance}.
     * @return An immutable instance of ImagingStudy_Instance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImagingStudy_Instance build();
  }
}
