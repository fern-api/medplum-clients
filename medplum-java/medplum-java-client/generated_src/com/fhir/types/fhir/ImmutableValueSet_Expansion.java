package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ValueSet_Expansion}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueSet_Expansion.builder()}.
 */
@Generated(from = "ValueSet_Expansion", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableValueSet_Expansion implements ValueSet_Expansion {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ValueSet_Contains> contains;
  private final @Nullable String id;
  private final @Nullable List<ValueSet_Parameter> parameter;
  private final @Nullable Uri identifier;
  private final @Nullable DateTime timestamp;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Integer total;
  private final @Nullable Integer offset;

  private ImmutableValueSet_Expansion(
      @Nullable List<Extension> extension,
      @Nullable List<ValueSet_Contains> contains,
      @Nullable String id,
      @Nullable List<ValueSet_Parameter> parameter,
      @Nullable Uri identifier,
      @Nullable DateTime timestamp,
      @Nullable List<Extension> modifierExtension,
      @Nullable Integer total,
      @Nullable Integer offset) {
    this.extension = extension;
    this.contains = contains;
    this.id = id;
    this.parameter = parameter;
    this.identifier = identifier;
    this.timestamp = timestamp;
    this.modifierExtension = modifierExtension;
    this.total = total;
    this.offset = offset;
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code contains} attribute
   */
  @JsonProperty("contains")
  @Override
  public Optional<List<ValueSet_Contains>> contains() {
    return Optional.ofNullable(contains);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code parameter} attribute
   */
  @JsonProperty("parameter")
  @Override
  public Optional<List<ValueSet_Parameter>> parameter() {
    return Optional.ofNullable(parameter);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Uri> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code timestamp} attribute
   */
  @JsonProperty("timestamp")
  @Override
  public Optional<DateTime> timestamp() {
    return Optional.ofNullable(timestamp);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code total} attribute
   */
  @JsonProperty("total")
  @Override
  public Optional<Integer> total() {
    return Optional.ofNullable(total);
  }

  /**
   * @return The value of the {@code offset} attribute
   */
  @JsonProperty("offset")
  @Override
  public Optional<Integer> offset() {
    return Optional.ofNullable(offset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableValueSet_Expansion(
        newValue,
        this.contains,
        this.id,
        this.parameter,
        this.identifier,
        this.timestamp,
        this.modifierExtension,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Expansion withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableValueSet_Expansion(
        value,
        this.contains,
        this.id,
        this.parameter,
        this.identifier,
        this.timestamp,
        this.modifierExtension,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#contains() contains} attribute.
   * @param value The value for contains
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withContains(List<ValueSet_Contains> value) {
    @Nullable List<ValueSet_Contains> newValue = Objects.requireNonNull(value, "contains");
    if (this.contains == newValue) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        newValue,
        this.id,
        this.parameter,
        this.identifier,
        this.timestamp,
        this.modifierExtension,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#contains() contains} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contains
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Expansion withContains(Optional<? extends List<ValueSet_Contains>> optional) {
    @Nullable List<ValueSet_Contains> value = optional.orElse(null);
    if (this.contains == value) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        value,
        this.id,
        this.parameter,
        this.identifier,
        this.timestamp,
        this.modifierExtension,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        newValue,
        this.parameter,
        this.identifier,
        this.timestamp,
        this.modifierExtension,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        value,
        this.parameter,
        this.identifier,
        this.timestamp,
        this.modifierExtension,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withParameter(List<ValueSet_Parameter> value) {
    @Nullable List<ValueSet_Parameter> newValue = Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        this.id,
        newValue,
        this.identifier,
        this.timestamp,
        this.modifierExtension,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Expansion withParameter(Optional<? extends List<ValueSet_Parameter>> optional) {
    @Nullable List<ValueSet_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        this.id,
        value,
        this.identifier,
        this.timestamp,
        this.modifierExtension,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withIdentifier(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        this.id,
        this.parameter,
        newValue,
        this.timestamp,
        this.modifierExtension,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Expansion withIdentifier(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        this.id,
        this.parameter,
        value,
        this.timestamp,
        this.modifierExtension,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#timestamp() timestamp} attribute.
   * @param value The value for timestamp
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withTimestamp(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "timestamp");
    if (this.timestamp == newValue) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        this.id,
        this.parameter,
        this.identifier,
        newValue,
        this.modifierExtension,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#timestamp() timestamp} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timestamp
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Expansion withTimestamp(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.timestamp == value) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        this.id,
        this.parameter,
        this.identifier,
        value,
        this.modifierExtension,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        this.id,
        this.parameter,
        this.identifier,
        this.timestamp,
        newValue,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Expansion withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        this.id,
        this.parameter,
        this.identifier,
        this.timestamp,
        value,
        this.total,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#total() total} attribute.
   * @param value The value for total
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withTotal(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.total, newValue)) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        this.id,
        this.parameter,
        this.identifier,
        this.timestamp,
        this.modifierExtension,
        newValue,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#total() total} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for total
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withTotal(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.total, value)) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        this.id,
        this.parameter,
        this.identifier,
        this.timestamp,
        this.modifierExtension,
        value,
        this.offset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Expansion#offset() offset} attribute.
   * @param value The value for offset
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withOffset(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.offset, newValue)) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        this.id,
        this.parameter,
        this.identifier,
        this.timestamp,
        this.modifierExtension,
        this.total,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Expansion#offset() offset} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for offset
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Expansion withOffset(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.offset, value)) return this;
    return new ImmutableValueSet_Expansion(
        this.extension,
        this.contains,
        this.id,
        this.parameter,
        this.identifier,
        this.timestamp,
        this.modifierExtension,
        this.total,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueSet_Expansion} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueSet_Expansion
        && equalTo((ImmutableValueSet_Expansion) another);
  }

  private boolean equalTo(ImmutableValueSet_Expansion another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(contains, another.contains)
        && Objects.equals(id, another.id)
        && Objects.equals(parameter, another.parameter)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(timestamp, another.timestamp)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(total, another.total)
        && Objects.equals(offset, another.offset);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code contains}, {@code id}, {@code parameter}, {@code identifier}, {@code timestamp}, {@code modifierExtension}, {@code total}, {@code offset}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(contains);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(parameter);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(timestamp);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(total);
    h += (h << 5) + Objects.hashCode(offset);
    return h;
  }

  /**
   * Prints the immutable value {@code ValueSet_Expansion} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ValueSet_Expansion{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (contains != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contains=").append(contains);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (parameter != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    if (identifier != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (timestamp != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("timestamp=").append(timestamp);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (total != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("total=").append(total);
    }
    if (offset != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("offset=").append(offset);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ValueSet_Expansion", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ValueSet_Expansion {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ValueSet_Contains>> contains = Optional.empty();
    boolean containsIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ValueSet_Parameter>> parameter = Optional.empty();
    boolean parameterIsSet;
    @Nullable Optional<Uri> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<DateTime> timestamp = Optional.empty();
    boolean timestampIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Integer> total = Optional.empty();
    boolean totalIsSet;
    @Nullable Optional<Integer> offset = Optional.empty();
    boolean offsetIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("contains")
    public void setContains(Optional<List<ValueSet_Contains>> contains) {
      this.contains = contains;
      this.containsIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("parameter")
    public void setParameter(Optional<List<ValueSet_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Uri> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("timestamp")
    public void setTimestamp(Optional<DateTime> timestamp) {
      this.timestamp = timestamp;
      this.timestampIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("total")
    public void setTotal(Optional<Integer> total) {
      this.total = total;
      this.totalIsSet = true;
    }
    @JsonProperty("offset")
    public void setOffset(Optional<Integer> offset) {
      this.offset = offset;
      this.offsetIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ValueSet_Contains>> contains() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ValueSet_Parameter>> parameter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> timestamp() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> total() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> offset() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableValueSet_Expansion fromJson(Json json) {
    ImmutableValueSet_Expansion.Builder builder = ImmutableValueSet_Expansion.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.containsIsSet) {
      builder.contains(json.contains);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.timestampIsSet) {
      builder.timestamp(json.timestamp);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.totalIsSet) {
      builder.total(json.total);
    }
    if (json.offsetIsSet) {
      builder.offset(json.offset);
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
        .extension(instance.extension())
        .contains(instance.contains())
        .id(instance.id())
        .parameter(instance.parameter())
        .identifier(instance.identifier())
        .timestamp(instance.timestamp())
        .modifierExtension(instance.modifierExtension())
        .total(instance.total())
        .offset(instance.offset())
        .build();
  }

  /**
   * Creates a builder for {@link ValueSet_Expansion ValueSet_Expansion}.
   * <pre>
   * ImmutableValueSet_Expansion.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ValueSet_Expansion#extension() extension}
   *    .contains(List&amp;lt;com.fhir.types.fhir.ValueSet_Contains&amp;gt;) // optional {@link ValueSet_Expansion#contains() contains}
   *    .id(String) // optional {@link ValueSet_Expansion#id() id}
   *    .parameter(List&amp;lt;com.fhir.types.fhir.ValueSet_Parameter&amp;gt;) // optional {@link ValueSet_Expansion#parameter() parameter}
   *    .identifier(com.fhir.types.fhir.Uri) // optional {@link ValueSet_Expansion#identifier() identifier}
   *    .timestamp(com.fhir.types.fhir.DateTime) // optional {@link ValueSet_Expansion#timestamp() timestamp}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ValueSet_Expansion#modifierExtension() modifierExtension}
   *    .total(Integer) // optional {@link ValueSet_Expansion#total() total}
   *    .offset(Integer) // optional {@link ValueSet_Expansion#offset() offset}
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
  @Generated(from = "ValueSet_Expansion", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_CONTAINS = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_PARAMETER = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_TIMESTAMP = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_TOTAL = 0x80L;
    private static final long OPT_BIT_OFFSET = 0x100L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<ValueSet_Contains> contains;
    private @Nullable String id;
    private @Nullable List<ValueSet_Parameter> parameter;
    private @Nullable Uri identifier;
    private @Nullable DateTime timestamp;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Integer total;
    private @Nullable Integer offset;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#contains() contains} to contains.
     * @param contains The value for contains
     * @return {@code this} builder for chained invocation
     */
    public final Builder contains(List<ValueSet_Contains> contains) {
      checkNotIsSet(containsIsSet(), "contains");
      this.contains = Objects.requireNonNull(contains, "contains");
      optBits |= OPT_BIT_CONTAINS;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#contains() contains} to contains.
     * @param contains The value for contains
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contains")
    public final Builder contains(Optional<? extends List<ValueSet_Contains>> contains) {
      checkNotIsSet(containsIsSet(), "contains");
      this.contains = contains.orElse(null);
      optBits |= OPT_BIT_CONTAINS;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(List<ValueSet_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parameter")
    public final Builder parameter(Optional<? extends List<ValueSet_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Uri identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Uri> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#timestamp() timestamp} to timestamp.
     * @param timestamp The value for timestamp
     * @return {@code this} builder for chained invocation
     */
    public final Builder timestamp(DateTime timestamp) {
      checkNotIsSet(timestampIsSet(), "timestamp");
      this.timestamp = Objects.requireNonNull(timestamp, "timestamp");
      optBits |= OPT_BIT_TIMESTAMP;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#timestamp() timestamp} to timestamp.
     * @param timestamp The value for timestamp
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timestamp")
    public final Builder timestamp(Optional<? extends DateTime> timestamp) {
      checkNotIsSet(timestampIsSet(), "timestamp");
      this.timestamp = timestamp.orElse(null);
      optBits |= OPT_BIT_TIMESTAMP;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Expansion#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
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
    @JsonProperty("total")
    public final Builder total(Optional<Integer> total) {
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
    @JsonProperty("offset")
    public final Builder offset(Optional<Integer> offset) {
      checkNotIsSet(offsetIsSet(), "offset");
      this.offset = offset.orElse(null);
      optBits |= OPT_BIT_OFFSET;
      return this;
    }

    /**
     * Builds a new {@link ValueSet_Expansion ValueSet_Expansion}.
     * @return An immutable instance of ValueSet_Expansion
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ValueSet_Expansion build() {
      return new ImmutableValueSet_Expansion(extension, contains, id, parameter, identifier, timestamp, modifierExtension, total, offset);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean containsIsSet() {
      return (optBits & OPT_BIT_CONTAINS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean timestampIsSet() {
      return (optBits & OPT_BIT_TIMESTAMP) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean totalIsSet() {
      return (optBits & OPT_BIT_TOTAL) != 0;
    }

    private boolean offsetIsSet() {
      return (optBits & OPT_BIT_OFFSET) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ValueSet_Expansion is strict, attribute is already set: ".concat(name));
    }
  }
}
