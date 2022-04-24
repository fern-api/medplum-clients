//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ValueSet_Expansion}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueSet_Expansion.builder()}.
 */
@org.immutables.value.Generated(from = "ValueSet_Expansion", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableValueSet_Expansion implements com.fhir.ValueSet_Expansion {
  private final @javax.annotation.Nullable com.fhir.dateTime timestamp;
  private final @javax.annotation.Nullable java.lang.Integer total;
  private final @javax.annotation.Nullable java.lang.Integer offset;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Parameter> parameter;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Contains> contains;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.uri identifier;

  private ImmutableValueSet_Expansion(
      @javax.annotation.Nullable com.fhir.dateTime timestamp,
      @javax.annotation.Nullable java.lang.Integer total,
      @javax.annotation.Nullable java.lang.Integer offset,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Parameter> parameter,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Contains> contains,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.uri identifier) {
    this.timestamp = timestamp;
    this.total = total;
    this.offset = offset;
    this.extension = extension;
    this.parameter = parameter;
    this.id = id;
    this.contains = contains;
    this.modifierExtension = modifierExtension;
    this.identifier = identifier;
  }

  /**
   * @return The value of the {@code timestamp} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
  @Override
  public java.util.Optional<com.fhir.dateTime> timestamp() {
    return java.util.Optional.ofNullable(timestamp);
  }

  /**
   * @return The value of the {@code total} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("total")
  @Override
  public java.util.Optional<java.lang.Integer> total() {
    return java.util.Optional.ofNullable(total);
  }

  /**
   * @return The value of the {@code offset} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("offset")
  @Override
  public java.util.Optional<java.lang.Integer> offset() {
    return java.util.Optional.ofNullable(offset);
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
   * @return The value of the {@code parameter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parameter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ValueSet_Parameter>> parameter() {
    return java.util.Optional.ofNullable(parameter);
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
   * @return The value of the {@code contains} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contains")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ValueSet_Contains>> contains() {
    return java.util.Optional.ofNullable(contains);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.uri> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#timestamp() timestamp} attribute.
   * @param value The value for timestamp
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withTimestamp(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "timestamp");
    if (this.timestamp == newValue) return this;
    return new ImmutableValueSet_Expansion(
        newValue,
        this.total,
        this.offset,
        this.extension,
        this.parameter,
        this.id,
        this.contains,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#timestamp() timestamp} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timestamp
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Expansion withTimestamp(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.timestamp == value) return this;
    return new ImmutableValueSet_Expansion(
        value,
        this.total,
        this.offset,
        this.extension,
        this.parameter,
        this.id,
        this.contains,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#total() total} attribute.
   * @param value The value for total
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withTotal(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.total, newValue)) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        newValue,
        this.offset,
        this.extension,
        this.parameter,
        this.id,
        this.contains,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#total() total} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for total
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withTotal(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.total, value)) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        value,
        this.offset,
        this.extension,
        this.parameter,
        this.id,
        this.contains,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#offset() offset} attribute.
   * @param value The value for offset
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withOffset(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.offset, newValue)) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        newValue,
        this.extension,
        this.parameter,
        this.id,
        this.contains,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#offset() offset} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for offset
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withOffset(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.offset, value)) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        value,
        this.extension,
        this.parameter,
        this.id,
        this.contains,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        this.offset,
        newValue,
        this.parameter,
        this.id,
        this.contains,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Expansion withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        this.offset,
        value,
        this.parameter,
        this.id,
        this.contains,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withParameter(java.util.List<com.fhir.ValueSet_Parameter> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Parameter> newValue = java.util.Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        this.offset,
        this.extension,
        newValue,
        this.id,
        this.contains,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Expansion withParameter(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Parameter>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        this.offset,
        this.extension,
        value,
        this.id,
        this.contains,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        this.offset,
        this.extension,
        this.parameter,
        newValue,
        this.contains,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        this.offset,
        this.extension,
        this.parameter,
        value,
        this.contains,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#contains() contains} attribute.
   * @param value The value for contains
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withContains(java.util.List<com.fhir.ValueSet_Contains> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Contains> newValue = java.util.Objects.requireNonNull(value, "contains");
    if (this.contains == newValue) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        this.offset,
        this.extension,
        this.parameter,
        this.id,
        newValue,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#contains() contains} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contains
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Expansion withContains(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Contains>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Contains> value = optional.orElse(null);
    if (this.contains == value) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        this.offset,
        this.extension,
        this.parameter,
        this.id,
        value,
        this.modifierExtension,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        this.offset,
        this.extension,
        this.parameter,
        this.id,
        this.contains,
        newValue,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Expansion withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        this.offset,
        this.extension,
        this.parameter,
        this.id,
        this.contains,
        value,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withIdentifier(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        this.offset,
        this.extension,
        this.parameter,
        this.id,
        this.contains,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Expansion withIdentifier(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableValueSet_Expansion(
        this.timestamp,
        this.total,
        this.offset,
        this.extension,
        this.parameter,
        this.id,
        this.contains,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueSet_Expansion} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueSet_Expansion
        && equalTo((ImmutableValueSet_Expansion) another);
  }

  private boolean equalTo(ImmutableValueSet_Expansion another) {
    return java.util.Objects.equals(timestamp, another.timestamp)
        && java.util.Objects.equals(total, another.total)
        && java.util.Objects.equals(offset, another.offset)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(parameter, another.parameter)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(contains, another.contains)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code timestamp}, {@code total}, {@code offset}, {@code extension}, {@code parameter}, {@code id}, {@code contains}, {@code modifierExtension}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(timestamp);
    h += (h << 5) + java.util.Objects.hashCode(total);
    h += (h << 5) + java.util.Objects.hashCode(offset);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(parameter);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(contains);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code ValueSet_Expansion} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ValueSet_Expansion{");
    if (timestamp != null) {
      builder.append("timestamp=").append(timestamp);
    }
    if (total != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("total=").append(total);
    }
    if (offset != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("offset=").append(offset);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (parameter != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contains != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contains=").append(contains);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (identifier != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ValueSet_Expansion", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ValueSet_Expansion {
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> timestamp = java.util.Optional.empty();
    boolean timestampIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> total = java.util.Optional.empty();
    boolean totalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> offset = java.util.Optional.empty();
    boolean offsetIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ValueSet_Parameter>> parameter = java.util.Optional.empty();
    boolean parameterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ValueSet_Contains>> contains = java.util.Optional.empty();
    boolean containsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    public void setTimestamp(java.util.Optional<com.fhir.dateTime> timestamp) {
      this.timestamp = timestamp;
      this.timestampIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    public void setTotal(java.util.Optional<java.lang.Integer> total) {
      this.total = total;
      this.totalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    public void setOffset(java.util.Optional<java.lang.Integer> offset) {
      this.offset = offset;
      this.offsetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public void setParameter(java.util.Optional<java.util.List<com.fhir.ValueSet_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contains")
    public void setContains(java.util.Optional<java.util.List<com.fhir.ValueSet_Contains>> contains) {
      this.contains = contains;
      this.containsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.uri> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.dateTime> timestamp() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> total() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> offset() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ValueSet_Parameter>> parameter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ValueSet_Contains>> contains() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableValueSet_Expansion fromJson(Json json) {
    ImmutableValueSet_Expansion.Builder builder = ImmutableValueSet_Expansion.builder();
    if (json.timestampIsSet) {
      builder.timestamp(json.timestamp);
    }
    if (json.totalIsSet) {
      builder.total(json.total);
    }
    if (json.offsetIsSet) {
      builder.offset(json.offset);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.containsIsSet) {
      builder.contains(json.contains);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutableValueSet_Expansion) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ValueSet_Expansion} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValueSet_Expansion instance
   */
  public static ValueSet_Expansion copyOf(ValueSet_Expansion instance) {
    if (instance instanceof ImmutableValueSet_Expansion) {
      return (ImmutableValueSet_Expansion) instance;
    }
    return ImmutableValueSet_Expansion.builder()
        .timestamp(instance.timestamp())
        .total(instance.total())
        .offset(instance.offset())
        .extension(instance.extension())
        .parameter(instance.parameter())
        .id(instance.id())
        .contains(instance.contains())
        .modifierExtension(instance.modifierExtension())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link ValueSet_Expansion ValueSet_Expansion}.
   * <pre>
   * ImmutableValueSet_Expansion.builder()
   *    .timestamp(com.fhir.dateTime) // optional {@link ValueSet_Expansion#timestamp() timestamp}
   *    .total(Integer) // optional {@link ValueSet_Expansion#total() total}
   *    .offset(Integer) // optional {@link ValueSet_Expansion#offset() offset}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ValueSet_Expansion#extension() extension}
   *    .parameter(List&amp;lt;com.fhir.ValueSet_Parameter&amp;gt;) // optional {@link ValueSet_Expansion#parameter() parameter}
   *    .id(String) // optional {@link ValueSet_Expansion#id() id}
   *    .contains(List&amp;lt;com.fhir.ValueSet_Contains&amp;gt;) // optional {@link ValueSet_Expansion#contains() contains}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ValueSet_Expansion#modifierExtension() modifierExtension}
   *    .identifier(com.fhir.uri) // optional {@link ValueSet_Expansion#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new ValueSet_Expansion builder
   */
  public static ImmutableValueSet_Expansion.Builder builder() {
    return new ImmutableValueSet_Expansion.Builder();
  }

  /**
   * Builds instances of type {@link ValueSet_Expansion ValueSet_Expansion}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ValueSet_Expansion", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TIMESTAMP = 0x1L;
    private static final long OPT_BIT_TOTAL = 0x2L;
    private static final long OPT_BIT_OFFSET = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_PARAMETER = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_CONTAINS = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_IDENTIFIER = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.dateTime timestamp;
    private @javax.annotation.Nullable java.lang.Integer total;
    private @javax.annotation.Nullable java.lang.Integer offset;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Parameter> parameter;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Contains> contains;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.uri identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#timestamp() timestamp} to timestamp.
     * @param timestamp The value for timestamp
     * @return {@code this} builder for chained invocation
     */
    public final Builder timestamp(com.fhir.dateTime timestamp) {
      checkNotIsSet(timestampIsSet(), "timestamp");
      this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp");
      optBits |= OPT_BIT_TIMESTAMP;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#timestamp() timestamp} to timestamp.
     * @param timestamp The value for timestamp
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    public final Builder timestamp(java.util.Optional<? extends com.fhir.dateTime> timestamp) {
      checkNotIsSet(timestampIsSet(), "timestamp");
      this.timestamp = timestamp.orElse(null);
      optBits |= OPT_BIT_TIMESTAMP;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for chained invocation
     */
    public final Builder total(int total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = total;
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#total() total} to total.
     * @param total The value for total
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    public final Builder total(java.util.Optional<java.lang.Integer> total) {
      checkNotIsSet(totalIsSet(), "total");
      this.total = total.orElse(null);
      optBits |= OPT_BIT_TOTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#offset() offset} to offset.
     * @param offset The value for offset
     * @return {@code this} builder for chained invocation
     */
    public final Builder offset(int offset) {
      checkNotIsSet(offsetIsSet(), "offset");
      this.offset = offset;
      optBits |= OPT_BIT_OFFSET;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#offset() offset} to offset.
     * @param offset The value for offset
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    public final Builder offset(java.util.Optional<java.lang.Integer> offset) {
      checkNotIsSet(offsetIsSet(), "offset");
      this.offset = offset.orElse(null);
      optBits |= OPT_BIT_OFFSET;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Expansion#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Expansion#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(java.util.List<com.fhir.ValueSet_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = java.util.Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public final Builder parameter(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Expansion#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Expansion#contains() contains} to contains.
     * @param contains The value for contains
     * @return {@code this} builder for chained invocation
     */
    public final Builder contains(java.util.List<com.fhir.ValueSet_Contains> contains) {
      checkNotIsSet(containsIsSet(), "contains");
      this.contains = java.util.Objects.requireNonNull(contains, "contains");
      optBits |= OPT_BIT_CONTAINS;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#contains() contains} to contains.
     * @param contains The value for contains
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contains")
    public final Builder contains(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Contains>> contains) {
      checkNotIsSet(containsIsSet(), "contains");
      this.contains = contains.orElse(null);
      optBits |= OPT_BIT_CONTAINS;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Expansion#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Expansion#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.uri identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.uri> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Builds a new {@link ValueSet_Expansion ValueSet_Expansion}.
     * @return An immutable instance of ValueSet_Expansion
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ValueSet_Expansion build() {
      return new ImmutableValueSet_Expansion(timestamp, total, offset, extension, parameter, id, contains, modifierExtension, identifier);
    }

    private boolean timestampIsSet() {
      return (optBits & OPT_BIT_TIMESTAMP) != 0;
    }

    private boolean totalIsSet() {
      return (optBits & OPT_BIT_TOTAL) != 0;
    }

    private boolean offsetIsSet() {
      return (optBits & OPT_BIT_OFFSET) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean containsIsSet() {
      return (optBits & OPT_BIT_CONTAINS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ValueSet_Expansion is strict, attribute is already set: ".concat(name));
    }
  }
}
