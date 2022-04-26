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
 * Immutable implementation of {@link PlanDefinition_Target}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePlanDefinition_Target.builder()}.
 */
@Generated(from = "PlanDefinition_Target", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePlanDefinition_Target implements PlanDefinition_Target {
  private final @Nullable Quantity detailQuantity;
  private final @Nullable String id;
  private final @Nullable CodeableConcept measure;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Duration due;
  private final @Nullable CodeableConcept detailCodeableConcept;
  private final @Nullable Range detailRange;
  private final @Nullable List<Extension> extension;

  private ImmutablePlanDefinition_Target(
      @Nullable Quantity detailQuantity,
      @Nullable String id,
      @Nullable CodeableConcept measure,
      @Nullable List<Extension> modifierExtension,
      @Nullable Duration due,
      @Nullable CodeableConcept detailCodeableConcept,
      @Nullable Range detailRange,
      @Nullable List<Extension> extension) {
    this.detailQuantity = detailQuantity;
    this.id = id;
    this.measure = measure;
    this.modifierExtension = modifierExtension;
    this.due = due;
    this.detailCodeableConcept = detailCodeableConcept;
    this.detailRange = detailRange;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code detailQuantity} attribute
   */
  @JsonProperty("detailQuantity")
  @Override
  public Optional<Quantity> detailQuantity() {
    return Optional.ofNullable(detailQuantity);
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
   * @return The value of the {@code measure} attribute
   */
  @JsonProperty("measure")
  @Override
  public Optional<CodeableConcept> measure() {
    return Optional.ofNullable(measure);
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
   * @return The value of the {@code due} attribute
   */
  @JsonProperty("due")
  @Override
  public Optional<Duration> due() {
    return Optional.ofNullable(due);
  }

  /**
   * @return The value of the {@code detailCodeableConcept} attribute
   */
  @JsonProperty("detailCodeableConcept")
  @Override
  public Optional<CodeableConcept> detailCodeableConcept() {
    return Optional.ofNullable(detailCodeableConcept);
  }

  /**
   * @return The value of the {@code detailRange} attribute
   */
  @JsonProperty("detailRange")
  @Override
  public Optional<Range> detailRange() {
    return Optional.ofNullable(detailRange);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Target#detailQuantity() detailQuantity} attribute.
   * @param value The value for detailQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Target withDetailQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "detailQuantity");
    if (this.detailQuantity == newValue) return this;
    return new ImmutablePlanDefinition_Target(
        newValue,
        this.id,
        this.measure,
        this.modifierExtension,
        this.due,
        this.detailCodeableConcept,
        this.detailRange,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Target#detailQuantity() detailQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Target withDetailQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.detailQuantity == value) return this;
    return new ImmutablePlanDefinition_Target(
        value,
        this.id,
        this.measure,
        this.modifierExtension,
        this.due,
        this.detailCodeableConcept,
        this.detailRange,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Target#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Target withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        newValue,
        this.measure,
        this.modifierExtension,
        this.due,
        this.detailCodeableConcept,
        this.detailRange,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Target#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Target withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        value,
        this.measure,
        this.modifierExtension,
        this.due,
        this.detailCodeableConcept,
        this.detailRange,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Target#measure() measure} attribute.
   * @param value The value for measure
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Target withMeasure(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "measure");
    if (this.measure == newValue) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        this.id,
        newValue,
        this.modifierExtension,
        this.due,
        this.detailCodeableConcept,
        this.detailRange,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Target#measure() measure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for measure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Target withMeasure(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.measure == value) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        this.id,
        value,
        this.modifierExtension,
        this.due,
        this.detailCodeableConcept,
        this.detailRange,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Target#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Target withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        this.id,
        this.measure,
        newValue,
        this.due,
        this.detailCodeableConcept,
        this.detailRange,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Target#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Target withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        this.id,
        this.measure,
        value,
        this.due,
        this.detailCodeableConcept,
        this.detailRange,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Target#due() due} attribute.
   * @param value The value for due
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Target withDue(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "due");
    if (this.due == newValue) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        this.id,
        this.measure,
        this.modifierExtension,
        newValue,
        this.detailCodeableConcept,
        this.detailRange,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Target#due() due} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for due
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Target withDue(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.due == value) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        this.id,
        this.measure,
        this.modifierExtension,
        value,
        this.detailCodeableConcept,
        this.detailRange,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Target#detailCodeableConcept() detailCodeableConcept} attribute.
   * @param value The value for detailCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Target withDetailCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "detailCodeableConcept");
    if (this.detailCodeableConcept == newValue) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        this.id,
        this.measure,
        this.modifierExtension,
        this.due,
        newValue,
        this.detailRange,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Target#detailCodeableConcept() detailCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Target withDetailCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.detailCodeableConcept == value) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        this.id,
        this.measure,
        this.modifierExtension,
        this.due,
        value,
        this.detailRange,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Target#detailRange() detailRange} attribute.
   * @param value The value for detailRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Target withDetailRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "detailRange");
    if (this.detailRange == newValue) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        this.id,
        this.measure,
        this.modifierExtension,
        this.due,
        this.detailCodeableConcept,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Target#detailRange() detailRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Target withDetailRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.detailRange == value) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        this.id,
        this.measure,
        this.modifierExtension,
        this.due,
        this.detailCodeableConcept,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Target#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Target withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        this.id,
        this.measure,
        this.modifierExtension,
        this.due,
        this.detailCodeableConcept,
        this.detailRange,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Target#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Target withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePlanDefinition_Target(
        this.detailQuantity,
        this.id,
        this.measure,
        this.modifierExtension,
        this.due,
        this.detailCodeableConcept,
        this.detailRange,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePlanDefinition_Target} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePlanDefinition_Target
        && equalTo((ImmutablePlanDefinition_Target) another);
  }

  private boolean equalTo(ImmutablePlanDefinition_Target another) {
    return Objects.equals(detailQuantity, another.detailQuantity)
        && Objects.equals(id, another.id)
        && Objects.equals(measure, another.measure)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(due, another.due)
        && Objects.equals(detailCodeableConcept, another.detailCodeableConcept)
        && Objects.equals(detailRange, another.detailRange)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code detailQuantity}, {@code id}, {@code measure}, {@code modifierExtension}, {@code due}, {@code detailCodeableConcept}, {@code detailRange}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(detailQuantity);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(measure);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(due);
    h += (h << 5) + Objects.hashCode(detailCodeableConcept);
    h += (h << 5) + Objects.hashCode(detailRange);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code PlanDefinition_Target} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PlanDefinition_Target{");
    if (detailQuantity != null) {
      builder.append("detailQuantity=").append(detailQuantity);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (measure != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("measure=").append(measure);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (due != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("due=").append(due);
    }
    if (detailCodeableConcept != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("detailCodeableConcept=").append(detailCodeableConcept);
    }
    if (detailRange != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("detailRange=").append(detailRange);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PlanDefinition_Target", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PlanDefinition_Target {
    @Nullable Optional<Quantity> detailQuantity = Optional.empty();
    boolean detailQuantityIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> measure = Optional.empty();
    boolean measureIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Duration> due = Optional.empty();
    boolean dueIsSet;
    @Nullable Optional<CodeableConcept> detailCodeableConcept = Optional.empty();
    boolean detailCodeableConceptIsSet;
    @Nullable Optional<Range> detailRange = Optional.empty();
    boolean detailRangeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("detailQuantity")
    public void setDetailQuantity(Optional<Quantity> detailQuantity) {
      this.detailQuantity = detailQuantity;
      this.detailQuantityIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("measure")
    public void setMeasure(Optional<CodeableConcept> measure) {
      this.measure = measure;
      this.measureIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("due")
    public void setDue(Optional<Duration> due) {
      this.due = due;
      this.dueIsSet = true;
    }
    @JsonProperty("detailCodeableConcept")
    public void setDetailCodeableConcept(Optional<CodeableConcept> detailCodeableConcept) {
      this.detailCodeableConcept = detailCodeableConcept;
      this.detailCodeableConceptIsSet = true;
    }
    @JsonProperty("detailRange")
    public void setDetailRange(Optional<Range> detailRange) {
      this.detailRange = detailRange;
      this.detailRangeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<Quantity> detailQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> measure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> due() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> detailCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> detailRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePlanDefinition_Target fromJson(Json json) {
    ImmutablePlanDefinition_Target.Builder builder = ImmutablePlanDefinition_Target.builder();
    if (json.detailQuantityIsSet) {
      builder.detailQuantity(json.detailQuantity);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.measureIsSet) {
      builder.measure(json.measure);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.dueIsSet) {
      builder.due(json.due);
    }
    if (json.detailCodeableConceptIsSet) {
      builder.detailCodeableConcept(json.detailCodeableConcept);
    }
    if (json.detailRangeIsSet) {
      builder.detailRange(json.detailRange);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutablePlanDefinition_Target) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PlanDefinition_Target} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PlanDefinition_Target instance
   */
  public static PlanDefinition_Target copyOf(PlanDefinition_Target instance) {
    if (instance instanceof ImmutablePlanDefinition_Target) {
      return (ImmutablePlanDefinition_Target) instance;
    }
    return ImmutablePlanDefinition_Target.builder()
        .detailQuantity(instance.detailQuantity())
        .id(instance.id())
        .measure(instance.measure())
        .modifierExtension(instance.modifierExtension())
        .due(instance.due())
        .detailCodeableConcept(instance.detailCodeableConcept())
        .detailRange(instance.detailRange())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link PlanDefinition_Target PlanDefinition_Target}.
   * <pre>
   * ImmutablePlanDefinition_Target.builder()
   *    .detailQuantity(com.medplum.types.fhir.Quantity) // optional {@link PlanDefinition_Target#detailQuantity() detailQuantity}
   *    .id(String) // optional {@link PlanDefinition_Target#id() id}
   *    .measure(com.medplum.types.fhir.CodeableConcept) // optional {@link PlanDefinition_Target#measure() measure}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_Target#modifierExtension() modifierExtension}
   *    .due(com.medplum.types.fhir.Duration) // optional {@link PlanDefinition_Target#due() due}
   *    .detailCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link PlanDefinition_Target#detailCodeableConcept() detailCodeableConcept}
   *    .detailRange(com.medplum.types.fhir.Range) // optional {@link PlanDefinition_Target#detailRange() detailRange}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_Target#extension() extension}
   *    .build();
   * </pre>
   * @return A new PlanDefinition_Target builder
   */
  public static ImmutablePlanDefinition_Target.Builder builder() {
    return new ImmutablePlanDefinition_Target.Builder();
  }

  /**
   * Builds instances of type {@link PlanDefinition_Target PlanDefinition_Target}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PlanDefinition_Target", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DETAIL_QUANTITY = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MEASURE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_DUE = 0x10L;
    private static final long OPT_BIT_DETAIL_CODEABLE_CONCEPT = 0x20L;
    private static final long OPT_BIT_DETAIL_RANGE = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private long optBits;

    private @Nullable Quantity detailQuantity;
    private @Nullable String id;
    private @Nullable CodeableConcept measure;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Duration due;
    private @Nullable CodeableConcept detailCodeableConcept;
    private @Nullable Range detailRange;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Target#detailQuantity() detailQuantity} to detailQuantity.
     * @param detailQuantity The value for detailQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailQuantity(Quantity detailQuantity) {
      checkNotIsSet(detailQuantityIsSet(), "detailQuantity");
      this.detailQuantity = Objects.requireNonNull(detailQuantity, "detailQuantity");
      optBits |= OPT_BIT_DETAIL_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Target#detailQuantity() detailQuantity} to detailQuantity.
     * @param detailQuantity The value for detailQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detailQuantity")
    public final Builder detailQuantity(Optional<? extends Quantity> detailQuantity) {
      checkNotIsSet(detailQuantityIsSet(), "detailQuantity");
      this.detailQuantity = detailQuantity.orElse(null);
      optBits |= OPT_BIT_DETAIL_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Target#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition_Target#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition_Target#measure() measure} to measure.
     * @param measure The value for measure
     * @return {@code this} builder for chained invocation
     */
    public final Builder measure(CodeableConcept measure) {
      checkNotIsSet(measureIsSet(), "measure");
      this.measure = Objects.requireNonNull(measure, "measure");
      optBits |= OPT_BIT_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Target#measure() measure} to measure.
     * @param measure The value for measure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("measure")
    public final Builder measure(Optional<? extends CodeableConcept> measure) {
      checkNotIsSet(measureIsSet(), "measure");
      this.measure = measure.orElse(null);
      optBits |= OPT_BIT_MEASURE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_Target#due() due} to due.
     * @param due The value for due
     * @return {@code this} builder for chained invocation
     */
    public final Builder due(Duration due) {
      checkNotIsSet(dueIsSet(), "due");
      this.due = Objects.requireNonNull(due, "due");
      optBits |= OPT_BIT_DUE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Target#due() due} to due.
     * @param due The value for due
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("due")
    public final Builder due(Optional<? extends Duration> due) {
      checkNotIsSet(dueIsSet(), "due");
      this.due = due.orElse(null);
      optBits |= OPT_BIT_DUE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Target#detailCodeableConcept() detailCodeableConcept} to detailCodeableConcept.
     * @param detailCodeableConcept The value for detailCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailCodeableConcept(CodeableConcept detailCodeableConcept) {
      checkNotIsSet(detailCodeableConceptIsSet(), "detailCodeableConcept");
      this.detailCodeableConcept = Objects.requireNonNull(detailCodeableConcept, "detailCodeableConcept");
      optBits |= OPT_BIT_DETAIL_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Target#detailCodeableConcept() detailCodeableConcept} to detailCodeableConcept.
     * @param detailCodeableConcept The value for detailCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detailCodeableConcept")
    public final Builder detailCodeableConcept(Optional<? extends CodeableConcept> detailCodeableConcept) {
      checkNotIsSet(detailCodeableConceptIsSet(), "detailCodeableConcept");
      this.detailCodeableConcept = detailCodeableConcept.orElse(null);
      optBits |= OPT_BIT_DETAIL_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Target#detailRange() detailRange} to detailRange.
     * @param detailRange The value for detailRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailRange(Range detailRange) {
      checkNotIsSet(detailRangeIsSet(), "detailRange");
      this.detailRange = Objects.requireNonNull(detailRange, "detailRange");
      optBits |= OPT_BIT_DETAIL_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Target#detailRange() detailRange} to detailRange.
     * @param detailRange The value for detailRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detailRange")
    public final Builder detailRange(Optional<? extends Range> detailRange) {
      checkNotIsSet(detailRangeIsSet(), "detailRange");
      this.detailRange = detailRange.orElse(null);
      optBits |= OPT_BIT_DETAIL_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition_Target#extension() extension} to extension.
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
     * Builds a new {@link PlanDefinition_Target PlanDefinition_Target}.
     * @return An immutable instance of PlanDefinition_Target
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PlanDefinition_Target build() {
      return new ImmutablePlanDefinition_Target(
          detailQuantity,
          id,
          measure,
          modifierExtension,
          due,
          detailCodeableConcept,
          detailRange,
          extension);
    }

    private boolean detailQuantityIsSet() {
      return (optBits & OPT_BIT_DETAIL_QUANTITY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean measureIsSet() {
      return (optBits & OPT_BIT_MEASURE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean dueIsSet() {
      return (optBits & OPT_BIT_DUE) != 0;
    }

    private boolean detailCodeableConceptIsSet() {
      return (optBits & OPT_BIT_DETAIL_CODEABLE_CONCEPT) != 0;
    }

    private boolean detailRangeIsSet() {
      return (optBits & OPT_BIT_DETAIL_RANGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PlanDefinition_Target is strict, attribute is already set: ".concat(name));
    }
  }
}
