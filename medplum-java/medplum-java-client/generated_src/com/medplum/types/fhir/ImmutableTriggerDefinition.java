package com.medplum.types.fhir;

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
 * Immutable implementation of {@link TriggerDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTriggerDefinition.builder()}.
 */
@Generated(from = "TriggerDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTriggerDefinition implements TriggerDefinition {
  private final @Nullable TriggerdefinitionType type;
  private final @Nullable List<Extension> extension;
  private final @Nullable String name;
  private final @Nullable String timingDate;
  private final @Nullable Reference timingReference;
  private final @Nullable Timing timingTiming;
  private final @Nullable String id;
  private final @Nullable String timingDateTime;
  private final @Nullable List<DataRequirement> data;
  private final @Nullable Expression condition;

  private ImmutableTriggerDefinition(
      @Nullable TriggerdefinitionType type,
      @Nullable List<Extension> extension,
      @Nullable String name,
      @Nullable String timingDate,
      @Nullable Reference timingReference,
      @Nullable Timing timingTiming,
      @Nullable String id,
      @Nullable String timingDateTime,
      @Nullable List<DataRequirement> data,
      @Nullable Expression condition) {
    this.type = type;
    this.extension = extension;
    this.name = name;
    this.timingDate = timingDate;
    this.timingReference = timingReference;
    this.timingTiming = timingTiming;
    this.id = id;
    this.timingDateTime = timingDateTime;
    this.data = data;
    this.condition = condition;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<TriggerdefinitionType> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code timingDate} attribute
   */
  @JsonProperty("timingDate")
  @Override
  public Optional<String> timingDate() {
    return Optional.ofNullable(timingDate);
  }

  /**
   * @return The value of the {@code timingReference} attribute
   */
  @JsonProperty("timingReference")
  @Override
  public Optional<Reference> timingReference() {
    return Optional.ofNullable(timingReference);
  }

  /**
   * @return The value of the {@code timingTiming} attribute
   */
  @JsonProperty("timingTiming")
  @Override
  public Optional<Timing> timingTiming() {
    return Optional.ofNullable(timingTiming);
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
   * @return The value of the {@code timingDateTime} attribute
   */
  @JsonProperty("timingDateTime")
  @Override
  public Optional<String> timingDateTime() {
    return Optional.ofNullable(timingDateTime);
  }

  /**
   * @return The value of the {@code data} attribute
   */
  @JsonProperty("data")
  @Override
  public Optional<List<DataRequirement>> data() {
    return Optional.ofNullable(data);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public Optional<Expression> condition() {
    return Optional.ofNullable(condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TriggerDefinition#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withType(TriggerdefinitionType value) {
    @Nullable TriggerdefinitionType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableTriggerDefinition(
        newValue,
        this.extension,
        this.name,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TriggerDefinition#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTriggerDefinition withType(Optional<? extends TriggerdefinitionType> optional) {
    @Nullable TriggerdefinitionType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableTriggerDefinition(
        value,
        this.extension,
        this.name,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TriggerDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        newValue,
        this.name,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TriggerDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTriggerDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        value,
        this.name,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TriggerDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        newValue,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TriggerDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        value,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TriggerDefinition#timingDate() timingDate} attribute.
   * @param value The value for timingDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withTimingDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "timingDate");
    if (Objects.equals(this.timingDate, newValue)) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        newValue,
        this.timingReference,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TriggerDefinition#timingDate() timingDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withTimingDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.timingDate, value)) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        value,
        this.timingReference,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TriggerDefinition#timingReference() timingReference} attribute.
   * @param value The value for timingReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withTimingReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "timingReference");
    if (this.timingReference == newValue) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        this.timingDate,
        newValue,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TriggerDefinition#timingReference() timingReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTriggerDefinition withTimingReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.timingReference == value) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        this.timingDate,
        value,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TriggerDefinition#timingTiming() timingTiming} attribute.
   * @param value The value for timingTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withTimingTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "timingTiming");
    if (this.timingTiming == newValue) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        this.timingDate,
        this.timingReference,
        newValue,
        this.id,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TriggerDefinition#timingTiming() timingTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTriggerDefinition withTimingTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.timingTiming == value) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        this.timingDate,
        this.timingReference,
        value,
        this.id,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TriggerDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        newValue,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TriggerDefinition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        value,
        this.timingDateTime,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TriggerDefinition#timingDateTime() timingDateTime} attribute.
   * @param value The value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withTimingDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "timingDateTime");
    if (Objects.equals(this.timingDateTime, newValue)) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        this.id,
        newValue,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TriggerDefinition#timingDateTime() timingDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withTimingDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.timingDateTime, value)) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        this.id,
        value,
        this.data,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TriggerDefinition#data() data} attribute.
   * @param value The value for data
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withData(List<DataRequirement> value) {
    @Nullable List<DataRequirement> newValue = Objects.requireNonNull(value, "data");
    if (this.data == newValue) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        newValue,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TriggerDefinition#data() data} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for data
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTriggerDefinition withData(Optional<? extends List<DataRequirement>> optional) {
    @Nullable List<DataRequirement> value = optional.orElse(null);
    if (this.data == value) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        value,
        this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TriggerDefinition#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTriggerDefinition withCondition(Expression value) {
    @Nullable Expression newValue = Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        this.data,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TriggerDefinition#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTriggerDefinition withCondition(Optional<? extends Expression> optional) {
    @Nullable Expression value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutableTriggerDefinition(
        this.type,
        this.extension,
        this.name,
        this.timingDate,
        this.timingReference,
        this.timingTiming,
        this.id,
        this.timingDateTime,
        this.data,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTriggerDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTriggerDefinition
        && equalTo((ImmutableTriggerDefinition) another);
  }

  private boolean equalTo(ImmutableTriggerDefinition another) {
    return Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(name, another.name)
        && Objects.equals(timingDate, another.timingDate)
        && Objects.equals(timingReference, another.timingReference)
        && Objects.equals(timingTiming, another.timingTiming)
        && Objects.equals(id, another.id)
        && Objects.equals(timingDateTime, another.timingDateTime)
        && Objects.equals(data, another.data)
        && Objects.equals(condition, another.condition);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code extension}, {@code name}, {@code timingDate}, {@code timingReference}, {@code timingTiming}, {@code id}, {@code timingDateTime}, {@code data}, {@code condition}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(timingDate);
    h += (h << 5) + Objects.hashCode(timingReference);
    h += (h << 5) + Objects.hashCode(timingTiming);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(timingDateTime);
    h += (h << 5) + Objects.hashCode(data);
    h += (h << 5) + Objects.hashCode(condition);
    return h;
  }

  /**
   * Prints the immutable value {@code TriggerDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TriggerDefinition{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (name != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (timingDate != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("timingDate=").append(timingDate);
    }
    if (timingReference != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("timingReference=").append(timingReference);
    }
    if (timingTiming != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("timingTiming=").append(timingTiming);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (timingDateTime != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("timingDateTime=").append(timingDateTime);
    }
    if (data != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("data=").append(data);
    }
    if (condition != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("condition=").append(condition);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TriggerDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TriggerDefinition {
    @Nullable Optional<TriggerdefinitionType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> timingDate = Optional.empty();
    boolean timingDateIsSet;
    @Nullable Optional<Reference> timingReference = Optional.empty();
    boolean timingReferenceIsSet;
    @Nullable Optional<Timing> timingTiming = Optional.empty();
    boolean timingTimingIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> timingDateTime = Optional.empty();
    boolean timingDateTimeIsSet;
    @Nullable Optional<List<DataRequirement>> data = Optional.empty();
    boolean dataIsSet;
    @Nullable Optional<Expression> condition = Optional.empty();
    boolean conditionIsSet;
    @JsonProperty("type")
    public void setType(Optional<TriggerdefinitionType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("timingDate")
    public void setTimingDate(Optional<String> timingDate) {
      this.timingDate = timingDate;
      this.timingDateIsSet = true;
    }
    @JsonProperty("timingReference")
    public void setTimingReference(Optional<Reference> timingReference) {
      this.timingReference = timingReference;
      this.timingReferenceIsSet = true;
    }
    @JsonProperty("timingTiming")
    public void setTimingTiming(Optional<Timing> timingTiming) {
      this.timingTiming = timingTiming;
      this.timingTimingIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("timingDateTime")
    public void setTimingDateTime(Optional<String> timingDateTime) {
      this.timingDateTime = timingDateTime;
      this.timingDateTimeIsSet = true;
    }
    @JsonProperty("data")
    public void setData(Optional<List<DataRequirement>> data) {
      this.data = data;
      this.dataIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Optional<Expression> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @Override
    public Optional<TriggerdefinitionType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> timingDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> timingReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> timingTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> timingDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DataRequirement>> data() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Expression> condition() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTriggerDefinition fromJson(Json json) {
    ImmutableTriggerDefinition.Builder builder = ImmutableTriggerDefinition.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.timingDateIsSet) {
      builder.timingDate(json.timingDate);
    }
    if (json.timingReferenceIsSet) {
      builder.timingReference(json.timingReference);
    }
    if (json.timingTimingIsSet) {
      builder.timingTiming(json.timingTiming);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.timingDateTimeIsSet) {
      builder.timingDateTime(json.timingDateTime);
    }
    if (json.dataIsSet) {
      builder.data(json.data);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    return (ImmutableTriggerDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TriggerDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TriggerDefinition instance
   */
  public static TriggerDefinition copyOf(TriggerDefinition instance) {
    if (instance instanceof ImmutableTriggerDefinition) {
      return (ImmutableTriggerDefinition) instance;
    }
    return ImmutableTriggerDefinition.builder()
        .type(instance.type())
        .extension(instance.extension())
        .name(instance.name())
        .timingDate(instance.timingDate())
        .timingReference(instance.timingReference())
        .timingTiming(instance.timingTiming())
        .id(instance.id())
        .timingDateTime(instance.timingDateTime())
        .data(instance.data())
        .condition(instance.condition())
        .build();
  }

  /**
   * Creates a builder for {@link TriggerDefinition TriggerDefinition}.
   * <pre>
   * ImmutableTriggerDefinition.builder()
   *    .type(com.medplum.types.fhir.TriggerdefinitionType) // optional {@link TriggerDefinition#type() type}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TriggerDefinition#extension() extension}
   *    .name(String) // optional {@link TriggerDefinition#name() name}
   *    .timingDate(String) // optional {@link TriggerDefinition#timingDate() timingDate}
   *    .timingReference(com.medplum.types.fhir.Reference) // optional {@link TriggerDefinition#timingReference() timingReference}
   *    .timingTiming(com.medplum.types.fhir.Timing) // optional {@link TriggerDefinition#timingTiming() timingTiming}
   *    .id(String) // optional {@link TriggerDefinition#id() id}
   *    .timingDateTime(String) // optional {@link TriggerDefinition#timingDateTime() timingDateTime}
   *    .data(List&amp;lt;com.medplum.types.fhir.DataRequirement&amp;gt;) // optional {@link TriggerDefinition#data() data}
   *    .condition(com.medplum.types.fhir.Expression) // optional {@link TriggerDefinition#condition() condition}
   *    .build();
   * </pre>
   * @return A new TriggerDefinition builder
   */
  public static ImmutableTriggerDefinition.Builder builder() {
    return new ImmutableTriggerDefinition.Builder();
  }

  /**
   * Builds instances of type {@link TriggerDefinition TriggerDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TriggerDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_NAME = 0x4L;
    private static final long OPT_BIT_TIMING_DATE = 0x8L;
    private static final long OPT_BIT_TIMING_REFERENCE = 0x10L;
    private static final long OPT_BIT_TIMING_TIMING = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_TIMING_DATE_TIME = 0x80L;
    private static final long OPT_BIT_DATA = 0x100L;
    private static final long OPT_BIT_CONDITION = 0x200L;
    private long optBits;

    private @Nullable TriggerdefinitionType type;
    private @Nullable List<Extension> extension;
    private @Nullable String name;
    private @Nullable String timingDate;
    private @Nullable Reference timingReference;
    private @Nullable Timing timingTiming;
    private @Nullable String id;
    private @Nullable String timingDateTime;
    private @Nullable List<DataRequirement> data;
    private @Nullable Expression condition;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(TriggerdefinitionType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends TriggerdefinitionType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link TriggerDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link TriggerDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#timingDate() timingDate} to timingDate.
     * @param timingDate The value for timingDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDate(String timingDate) {
      checkNotIsSet(timingDateIsSet(), "timingDate");
      this.timingDate = Objects.requireNonNull(timingDate, "timingDate");
      optBits |= OPT_BIT_TIMING_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#timingDate() timingDate} to timingDate.
     * @param timingDate The value for timingDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingDate")
    public final Builder timingDate(Optional<String> timingDate) {
      checkNotIsSet(timingDateIsSet(), "timingDate");
      this.timingDate = timingDate.orElse(null);
      optBits |= OPT_BIT_TIMING_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#timingReference() timingReference} to timingReference.
     * @param timingReference The value for timingReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingReference(Reference timingReference) {
      checkNotIsSet(timingReferenceIsSet(), "timingReference");
      this.timingReference = Objects.requireNonNull(timingReference, "timingReference");
      optBits |= OPT_BIT_TIMING_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#timingReference() timingReference} to timingReference.
     * @param timingReference The value for timingReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingReference")
    public final Builder timingReference(Optional<? extends Reference> timingReference) {
      checkNotIsSet(timingReferenceIsSet(), "timingReference");
      this.timingReference = timingReference.orElse(null);
      optBits |= OPT_BIT_TIMING_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingTiming(Timing timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = Objects.requireNonNull(timingTiming, "timingTiming");
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingTiming")
    public final Builder timingTiming(Optional<? extends Timing> timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = timingTiming.orElse(null);
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#id() id} to id.
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
     * Initializes the optional value {@link TriggerDefinition#id() id} to id.
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
     * Initializes the optional value {@link TriggerDefinition#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDateTime(String timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = Objects.requireNonNull(timingDateTime, "timingDateTime");
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingDateTime")
    public final Builder timingDateTime(Optional<String> timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = timingDateTime.orElse(null);
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    public final Builder data(List<DataRequirement> data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = Objects.requireNonNull(data, "data");
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("data")
    public final Builder data(Optional<? extends List<DataRequirement>> data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = data.orElse(null);
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(Expression condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link TriggerDefinition#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("condition")
    public final Builder condition(Optional<? extends Expression> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Builds a new {@link TriggerDefinition TriggerDefinition}.
     * @return An immutable instance of TriggerDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TriggerDefinition build() {
      return new ImmutableTriggerDefinition(
          type,
          extension,
          name,
          timingDate,
          timingReference,
          timingTiming,
          id,
          timingDateTime,
          data,
          condition);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean timingDateIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE) != 0;
    }

    private boolean timingReferenceIsSet() {
      return (optBits & OPT_BIT_TIMING_REFERENCE) != 0;
    }

    private boolean timingTimingIsSet() {
      return (optBits & OPT_BIT_TIMING_TIMING) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean timingDateTimeIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE_TIME) != 0;
    }

    private boolean dataIsSet() {
      return (optBits & OPT_BIT_DATA) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TriggerDefinition is strict, attribute is already set: ".concat(name));
    }
  }
}
