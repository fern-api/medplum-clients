//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Signature}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSignature.builder()}.
 */
@org.immutables.value.Generated(from = "Signature", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSignature implements com.fhir.Signature {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final java.util.List<com.fhir.Coding> type;
  private final @javax.annotation.Nullable com.fhir.instant when;
  private final @javax.annotation.Nullable java.lang.String id;
  private final com.fhir.Reference who;
  private final @javax.annotation.Nullable com.fhir.code sigFormat;
  private final @javax.annotation.Nullable com.fhir.Reference onBehalfOf;
  private final @javax.annotation.Nullable com.fhir.code targetFormat;
  private final @javax.annotation.Nullable com.fhir.base64Binary data;

  private ImmutableSignature(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      java.util.List<com.fhir.Coding> type,
      @javax.annotation.Nullable com.fhir.instant when,
      @javax.annotation.Nullable java.lang.String id,
      com.fhir.Reference who,
      @javax.annotation.Nullable com.fhir.code sigFormat,
      @javax.annotation.Nullable com.fhir.Reference onBehalfOf,
      @javax.annotation.Nullable com.fhir.code targetFormat,
      @javax.annotation.Nullable com.fhir.base64Binary data) {
    this.extension = extension;
    this.type = type;
    this.when = when;
    this.id = id;
    this.who = who;
    this.sigFormat = sigFormat;
    this.onBehalfOf = onBehalfOf;
    this.targetFormat = targetFormat;
    this.data = data;
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.List<com.fhir.Coding> type() {
    return type;
  }

  /**
   * @return The value of the {@code when} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("when")
  @Override
  public java.util.Optional<com.fhir.instant> when() {
    return java.util.Optional.ofNullable(when);
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
   * @return The value of the {@code who} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("who")
  @Override
  public com.fhir.Reference who() {
    return who;
  }

  /**
   * @return The value of the {@code sigFormat} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sigFormat")
  @Override
  public java.util.Optional<com.fhir.code> sigFormat() {
    return java.util.Optional.ofNullable(sigFormat);
  }

  /**
   * @return The value of the {@code onBehalfOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("onBehalfOf")
  @Override
  public java.util.Optional<com.fhir.Reference> onBehalfOf() {
    return java.util.Optional.ofNullable(onBehalfOf);
  }

  /**
   * @return The value of the {@code targetFormat} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("targetFormat")
  @Override
  public java.util.Optional<com.fhir.code> targetFormat() {
    return java.util.Optional.ofNullable(targetFormat);
  }

  /**
   * @return The value of the {@code data} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("data")
  @Override
  public java.util.Optional<com.fhir.base64Binary> data() {
    return java.util.Optional.ofNullable(data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSignature(
        newValue,
        this.type,
        this.when,
        this.id,
        this.who,
        this.sigFormat,
        this.onBehalfOf,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSignature withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSignature(
        value,
        this.type,
        this.when,
        this.id,
        this.who,
        this.sigFormat,
        this.onBehalfOf,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Signature#type() type}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withType(com.fhir.Coding... elements) {
    java.util.List<com.fhir.Coding> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableSignature(
        this.extension,
        newValue,
        this.when,
        this.id,
        this.who,
        this.sigFormat,
        this.onBehalfOf,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Signature#type() type}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of type elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withType(Iterable<? extends com.fhir.Coding> elements) {
    if (this.type == elements) return this;
    java.util.List<com.fhir.Coding> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSignature(
        this.extension,
        newValue,
        this.when,
        this.id,
        this.who,
        this.sigFormat,
        this.onBehalfOf,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#when() when} attribute.
   * @param value The value for when
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withWhen(com.fhir.instant value) {
    @javax.annotation.Nullable com.fhir.instant newValue = java.util.Objects.requireNonNull(value, "when");
    if (this.when == newValue) return this;
    return new ImmutableSignature(
        this.extension,
        this.type,
        newValue,
        this.id,
        this.who,
        this.sigFormat,
        this.onBehalfOf,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#when() when} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for when
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSignature withWhen(java.util.Optional<? extends com.fhir.instant> optional) {
    @javax.annotation.Nullable com.fhir.instant value = optional.orElse(null);
    if (this.when == value) return this;
    return new ImmutableSignature(
        this.extension,
        this.type,
        value,
        this.id,
        this.who,
        this.sigFormat,
        this.onBehalfOf,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableSignature(
        this.extension,
        this.type,
        this.when,
        newValue,
        this.who,
        this.sigFormat,
        this.onBehalfOf,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableSignature(
        this.extension,
        this.type,
        this.when,
        value,
        this.who,
        this.sigFormat,
        this.onBehalfOf,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Signature#who() who} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for who
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSignature withWho(com.fhir.Reference value) {
    if (this.who == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "who");
    return new ImmutableSignature(
        this.extension,
        this.type,
        this.when,
        this.id,
        newValue,
        this.sigFormat,
        this.onBehalfOf,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#sigFormat() sigFormat} attribute.
   * @param value The value for sigFormat
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withSigFormat(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "sigFormat");
    if (this.sigFormat == newValue) return this;
    return new ImmutableSignature(
        this.extension,
        this.type,
        this.when,
        this.id,
        this.who,
        newValue,
        this.onBehalfOf,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#sigFormat() sigFormat} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sigFormat
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSignature withSigFormat(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.sigFormat == value) return this;
    return new ImmutableSignature(
        this.extension,
        this.type,
        this.when,
        this.id,
        this.who,
        value,
        this.onBehalfOf,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#onBehalfOf() onBehalfOf} attribute.
   * @param value The value for onBehalfOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withOnBehalfOf(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "onBehalfOf");
    if (this.onBehalfOf == newValue) return this;
    return new ImmutableSignature(
        this.extension,
        this.type,
        this.when,
        this.id,
        this.who,
        this.sigFormat,
        newValue,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#onBehalfOf() onBehalfOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onBehalfOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSignature withOnBehalfOf(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.onBehalfOf == value) return this;
    return new ImmutableSignature(
        this.extension,
        this.type,
        this.when,
        this.id,
        this.who,
        this.sigFormat,
        value,
        this.targetFormat,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#targetFormat() targetFormat} attribute.
   * @param value The value for targetFormat
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withTargetFormat(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "targetFormat");
    if (this.targetFormat == newValue) return this;
    return new ImmutableSignature(
        this.extension,
        this.type,
        this.when,
        this.id,
        this.who,
        this.sigFormat,
        this.onBehalfOf,
        newValue,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#targetFormat() targetFormat} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetFormat
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSignature withTargetFormat(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.targetFormat == value) return this;
    return new ImmutableSignature(
        this.extension,
        this.type,
        this.when,
        this.id,
        this.who,
        this.sigFormat,
        this.onBehalfOf,
        value,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#data() data} attribute.
   * @param value The value for data
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withData(com.fhir.base64Binary value) {
    @javax.annotation.Nullable com.fhir.base64Binary newValue = java.util.Objects.requireNonNull(value, "data");
    if (this.data == newValue) return this;
    return new ImmutableSignature(
        this.extension,
        this.type,
        this.when,
        this.id,
        this.who,
        this.sigFormat,
        this.onBehalfOf,
        this.targetFormat,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#data() data} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for data
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSignature withData(java.util.Optional<? extends com.fhir.base64Binary> optional) {
    @javax.annotation.Nullable com.fhir.base64Binary value = optional.orElse(null);
    if (this.data == value) return this;
    return new ImmutableSignature(
        this.extension,
        this.type,
        this.when,
        this.id,
        this.who,
        this.sigFormat,
        this.onBehalfOf,
        this.targetFormat,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSignature} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSignature
        && equalTo((ImmutableSignature) another);
  }

  private boolean equalTo(ImmutableSignature another) {
    return java.util.Objects.equals(extension, another.extension)
        && type.equals(another.type)
        && java.util.Objects.equals(when, another.when)
        && java.util.Objects.equals(id, another.id)
        && who.equals(another.who)
        && java.util.Objects.equals(sigFormat, another.sigFormat)
        && java.util.Objects.equals(onBehalfOf, another.onBehalfOf)
        && java.util.Objects.equals(targetFormat, another.targetFormat)
        && java.util.Objects.equals(data, another.data);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code type}, {@code when}, {@code id}, {@code who}, {@code sigFormat}, {@code onBehalfOf}, {@code targetFormat}, {@code data}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(when);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + who.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(sigFormat);
    h += (h << 5) + java.util.Objects.hashCode(onBehalfOf);
    h += (h << 5) + java.util.Objects.hashCode(targetFormat);
    h += (h << 5) + java.util.Objects.hashCode(data);
    return h;
  }

  /**
   * Prints the immutable value {@code Signature} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Signature{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 10) builder.append(", ");
    builder.append("type=").append(type);
    if (when != null) {
      builder.append(", ");
      builder.append("when=").append(when);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("who=").append(who);
    if (sigFormat != null) {
      builder.append(", ");
      builder.append("sigFormat=").append(sigFormat);
    }
    if (onBehalfOf != null) {
      builder.append(", ");
      builder.append("onBehalfOf=").append(onBehalfOf);
    }
    if (targetFormat != null) {
      builder.append(", ");
      builder.append("targetFormat=").append(targetFormat);
    }
    if (data != null) {
      builder.append(", ");
      builder.append("data=").append(data);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Signature", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Signature {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> type = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.instant> when = java.util.Optional.empty();
    boolean whenIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable com.fhir.Reference who;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> sigFormat = java.util.Optional.empty();
    boolean sigFormatIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> onBehalfOf = java.util.Optional.empty();
    boolean onBehalfOfIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> targetFormat = java.util.Optional.empty();
    boolean targetFormatIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.base64Binary> data = java.util.Optional.empty();
    boolean dataIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.List<com.fhir.Coding> type) {
      this.type = type;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("when")
    public void setWhen(java.util.Optional<com.fhir.instant> when) {
      this.when = when;
      this.whenIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("who")
    public void setWho(com.fhir.Reference who) {
      this.who = who;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sigFormat")
    public void setSigFormat(java.util.Optional<com.fhir.code> sigFormat) {
      this.sigFormat = sigFormat;
      this.sigFormatIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onBehalfOf")
    public void setOnBehalfOf(java.util.Optional<com.fhir.Reference> onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      this.onBehalfOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("targetFormat")
    public void setTargetFormat(java.util.Optional<com.fhir.code> targetFormat) {
      this.targetFormat = targetFormat;
      this.targetFormatIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    public void setData(java.util.Optional<com.fhir.base64Binary> data) {
      this.data = data;
      this.dataIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.Coding> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.instant> when() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference who() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> sigFormat() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> onBehalfOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> targetFormat() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.base64Binary> data() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSignature fromJson(Json json) {
    ImmutableSignature.Builder builder = ((ImmutableSignature.Builder) ImmutableSignature.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.type != null) {
      builder.addAllType(json.type);
    }
    if (json.whenIsSet) {
      builder.when(json.when);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.who != null) {
      builder.who(json.who);
    }
    if (json.sigFormatIsSet) {
      builder.sigFormat(json.sigFormat);
    }
    if (json.onBehalfOfIsSet) {
      builder.onBehalfOf(json.onBehalfOf);
    }
    if (json.targetFormatIsSet) {
      builder.targetFormat(json.targetFormat);
    }
    if (json.dataIsSet) {
      builder.data(json.data);
    }
    return (ImmutableSignature) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Signature} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Signature instance
   */
  public static Signature copyOf(Signature instance) {
    if (instance instanceof ImmutableSignature) {
      return (ImmutableSignature) instance;
    }
    return ((ImmutableSignature.Builder) ImmutableSignature.builder())
        .extension(instance.extension())
        .addAllType(instance.type())
        .when(instance.when())
        .id(instance.id())
        .who(instance.who())
        .sigFormat(instance.sigFormat())
        .onBehalfOf(instance.onBehalfOf())
        .targetFormat(instance.targetFormat())
        .data(instance.data())
        .build();
  }

  /**
   * Creates a builder for {@link Signature Signature}.
   * <pre>
   * ImmutableSignature.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Signature#extension() extension}
   *    .addType|addAllType(com.fhir.Coding) // {@link Signature#type() type} elements
   *    .when(com.fhir.instant) // optional {@link Signature#when() when}
   *    .id(String) // optional {@link Signature#id() id}
   *    .who(com.fhir.Reference) // required {@link Signature#who() who}
   *    .sigFormat(com.fhir.code) // optional {@link Signature#sigFormat() sigFormat}
   *    .onBehalfOf(com.fhir.Reference) // optional {@link Signature#onBehalfOf() onBehalfOf}
   *    .targetFormat(com.fhir.code) // optional {@link Signature#targetFormat() targetFormat}
   *    .data(com.fhir.base64Binary) // optional {@link Signature#data() data}
   *    .build();
   * </pre>
   * @return A new Signature builder
   */
  public static WhoBuildStage builder() {
    return new ImmutableSignature.Builder();
  }

  /**
   * Builds instances of type {@link Signature Signature}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Signature", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements WhoBuildStage, BuildFinal {
    private static final long INIT_BIT_WHO = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_WHEN = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_SIG_FORMAT = 0x8L;
    private static final long OPT_BIT_ON_BEHALF_OF = 0x10L;
    private static final long OPT_BIT_TARGET_FORMAT = 0x20L;
    private static final long OPT_BIT_DATA = 0x40L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private final java.util.List<com.fhir.Coding> type = new java.util.ArrayList<com.fhir.Coding>();
    private @javax.annotation.Nullable com.fhir.instant when;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Reference who;
    private @javax.annotation.Nullable com.fhir.code sigFormat;
    private @javax.annotation.Nullable com.fhir.Reference onBehalfOf;
    private @javax.annotation.Nullable com.fhir.code targetFormat;
    private @javax.annotation.Nullable com.fhir.base64Binary data;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Signature#extension() extension} to extension.
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
     * Initializes the optional value {@link Signature#extension() extension} to extension.
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
     * Adds one element to {@link Signature#type() type} list.
     * @param element A type element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addType(com.fhir.Coding element) {
      this.type.add(java.util.Objects.requireNonNull(element, "type element"));
      return this;
    }

    /**
     * Adds elements to {@link Signature#type() type} list.
     * @param elements An array of type elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addType(com.fhir.Coding... elements) {
      for (com.fhir.Coding element : elements) {
        this.type.add(java.util.Objects.requireNonNull(element, "type element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Signature#type() type} list.
     * @param elements An iterable of type elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllType(Iterable<? extends com.fhir.Coding> elements) {
      for (com.fhir.Coding element : elements) {
        this.type.add(java.util.Objects.requireNonNull(element, "type element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#when() when} to when.
     * @param when The value for when
     * @return {@code this} builder for chained invocation
     */
    public final Builder when(com.fhir.instant when) {
      checkNotIsSet(whenIsSet(), "when");
      this.when = java.util.Objects.requireNonNull(when, "when");
      optBits |= OPT_BIT_WHEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#when() when} to when.
     * @param when The value for when
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("when")
    public final Builder when(java.util.Optional<? extends com.fhir.instant> when) {
      checkNotIsSet(whenIsSet(), "when");
      this.when = when.orElse(null);
      optBits |= OPT_BIT_WHEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#id() id} to id.
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
     * Initializes the optional value {@link Signature#id() id} to id.
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
     * Initializes the value for the {@link Signature#who() who} attribute.
     * @param who The value for who 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("who")
    public final Builder who(com.fhir.Reference who) {
      checkNotIsSet(whoIsSet(), "who");
      this.who = java.util.Objects.requireNonNull(who, "who");
      initBits &= ~INIT_BIT_WHO;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#sigFormat() sigFormat} to sigFormat.
     * @param sigFormat The value for sigFormat
     * @return {@code this} builder for chained invocation
     */
    public final Builder sigFormat(com.fhir.code sigFormat) {
      checkNotIsSet(sigFormatIsSet(), "sigFormat");
      this.sigFormat = java.util.Objects.requireNonNull(sigFormat, "sigFormat");
      optBits |= OPT_BIT_SIG_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#sigFormat() sigFormat} to sigFormat.
     * @param sigFormat The value for sigFormat
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sigFormat")
    public final Builder sigFormat(java.util.Optional<? extends com.fhir.code> sigFormat) {
      checkNotIsSet(sigFormatIsSet(), "sigFormat");
      this.sigFormat = sigFormat.orElse(null);
      optBits |= OPT_BIT_SIG_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder onBehalfOf(com.fhir.Reference onBehalfOf) {
      checkNotIsSet(onBehalfOfIsSet(), "onBehalfOf");
      this.onBehalfOf = java.util.Objects.requireNonNull(onBehalfOf, "onBehalfOf");
      optBits |= OPT_BIT_ON_BEHALF_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onBehalfOf")
    public final Builder onBehalfOf(java.util.Optional<? extends com.fhir.Reference> onBehalfOf) {
      checkNotIsSet(onBehalfOfIsSet(), "onBehalfOf");
      this.onBehalfOf = onBehalfOf.orElse(null);
      optBits |= OPT_BIT_ON_BEHALF_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#targetFormat() targetFormat} to targetFormat.
     * @param targetFormat The value for targetFormat
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetFormat(com.fhir.code targetFormat) {
      checkNotIsSet(targetFormatIsSet(), "targetFormat");
      this.targetFormat = java.util.Objects.requireNonNull(targetFormat, "targetFormat");
      optBits |= OPT_BIT_TARGET_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#targetFormat() targetFormat} to targetFormat.
     * @param targetFormat The value for targetFormat
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetFormat")
    public final Builder targetFormat(java.util.Optional<? extends com.fhir.code> targetFormat) {
      checkNotIsSet(targetFormatIsSet(), "targetFormat");
      this.targetFormat = targetFormat.orElse(null);
      optBits |= OPT_BIT_TARGET_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    public final Builder data(com.fhir.base64Binary data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = java.util.Objects.requireNonNull(data, "data");
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    public final Builder data(java.util.Optional<? extends com.fhir.base64Binary> data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = data.orElse(null);
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Builds a new {@link Signature Signature}.
     * @return An immutable instance of Signature
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Signature build() {
      checkRequiredAttributes();
      return new ImmutableSignature(
          extension,
          createUnmodifiableList(true, type),
          when,
          id,
          who,
          sigFormat,
          onBehalfOf,
          targetFormat,
          data);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean whenIsSet() {
      return (optBits & OPT_BIT_WHEN) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean sigFormatIsSet() {
      return (optBits & OPT_BIT_SIG_FORMAT) != 0;
    }

    private boolean onBehalfOfIsSet() {
      return (optBits & OPT_BIT_ON_BEHALF_OF) != 0;
    }

    private boolean targetFormatIsSet() {
      return (optBits & OPT_BIT_TARGET_FORMAT) != 0;
    }

    private boolean dataIsSet() {
      return (optBits & OPT_BIT_DATA) != 0;
    }

    private boolean whoIsSet() {
      return (initBits & INIT_BIT_WHO) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Signature is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!whoIsSet()) attributes.add("who");
      return "Cannot build Signature, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Signature", generator = "Immutables")
  public interface WhoBuildStage {
    /**
     * Initializes the value for the {@link Signature#who() who} attribute.
     * @param who The value for who 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal who(com.fhir.Reference who);
  }

  @org.immutables.value.Generated(from = "Signature", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Signature#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Signature#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Adds one element to {@link Signature#type() type} list.
     * @param element A type element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addType(com.fhir.Coding element);

    /**
     * Adds elements to {@link Signature#type() type} list.
     * @param elements An array of type elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addType(com.fhir.Coding... elements);

    /**
     * Adds elements to {@link Signature#type() type} list.
     * @param elements An iterable of type elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllType(Iterable<? extends com.fhir.Coding> elements);

    /**
     * Initializes the optional value {@link Signature#when() when} to when.
     * @param when The value for when
     * @return {@code this} builder for chained invocation
     */
    BuildFinal when(com.fhir.instant when);

    /**
     * Initializes the optional value {@link Signature#when() when} to when.
     * @param when The value for when
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal when(java.util.Optional<? extends com.fhir.instant> when);

    /**
     * Initializes the optional value {@link Signature#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link Signature#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link Signature#sigFormat() sigFormat} to sigFormat.
     * @param sigFormat The value for sigFormat
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sigFormat(com.fhir.code sigFormat);

    /**
     * Initializes the optional value {@link Signature#sigFormat() sigFormat} to sigFormat.
     * @param sigFormat The value for sigFormat
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sigFormat(java.util.Optional<? extends com.fhir.code> sigFormat);

    /**
     * Initializes the optional value {@link Signature#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onBehalfOf(com.fhir.Reference onBehalfOf);

    /**
     * Initializes the optional value {@link Signature#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onBehalfOf(java.util.Optional<? extends com.fhir.Reference> onBehalfOf);

    /**
     * Initializes the optional value {@link Signature#targetFormat() targetFormat} to targetFormat.
     * @param targetFormat The value for targetFormat
     * @return {@code this} builder for chained invocation
     */
    BuildFinal targetFormat(com.fhir.code targetFormat);

    /**
     * Initializes the optional value {@link Signature#targetFormat() targetFormat} to targetFormat.
     * @param targetFormat The value for targetFormat
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal targetFormat(java.util.Optional<? extends com.fhir.code> targetFormat);

    /**
     * Initializes the optional value {@link Signature#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    BuildFinal data(com.fhir.base64Binary data);

    /**
     * Initializes the optional value {@link Signature#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal data(java.util.Optional<? extends com.fhir.base64Binary> data);

    /**
     * Builds a new {@link Signature Signature}.
     * @return An immutable instance of Signature
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Signature build();
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
