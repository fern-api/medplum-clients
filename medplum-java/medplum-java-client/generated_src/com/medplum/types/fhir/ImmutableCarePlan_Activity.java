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
 * Immutable implementation of {@link CarePlan_Activity}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCarePlan_Activity.builder()}.
 */
@Generated(from = "CarePlan_Activity", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCarePlan_Activity implements CarePlan_Activity {
  private final @Nullable List<CodeableConcept> outcomeCodeableConcept;
  private final @Nullable CarePlan_Detail detail;
  private final @Nullable List<Annotation> progress;
  private final @Nullable List<Reference> outcomeReference;
  private final @Nullable Reference reference;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableCarePlan_Activity(
      @Nullable List<CodeableConcept> outcomeCodeableConcept,
      @Nullable CarePlan_Detail detail,
      @Nullable List<Annotation> progress,
      @Nullable List<Reference> outcomeReference,
      @Nullable Reference reference,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension) {
    this.outcomeCodeableConcept = outcomeCodeableConcept;
    this.detail = detail;
    this.progress = progress;
    this.outcomeReference = outcomeReference;
    this.reference = reference;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code outcomeCodeableConcept} attribute
   */
  @JsonProperty("outcomeCodeableConcept")
  @Override
  public Optional<List<CodeableConcept>> outcomeCodeableConcept() {
    return Optional.ofNullable(outcomeCodeableConcept);
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @JsonProperty("detail")
  @Override
  public Optional<CarePlan_Detail> detail() {
    return Optional.ofNullable(detail);
  }

  /**
   * @return The value of the {@code progress} attribute
   */
  @JsonProperty("progress")
  @Override
  public Optional<List<Annotation>> progress() {
    return Optional.ofNullable(progress);
  }

  /**
   * @return The value of the {@code outcomeReference} attribute
   */
  @JsonProperty("outcomeReference")
  @Override
  public Optional<List<Reference>> outcomeReference() {
    return Optional.ofNullable(outcomeReference);
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @JsonProperty("reference")
  @Override
  public Optional<Reference> reference() {
    return Optional.ofNullable(reference);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Activity#outcomeCodeableConcept() outcomeCodeableConcept} attribute.
   * @param value The value for outcomeCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Activity withOutcomeCodeableConcept(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "outcomeCodeableConcept");
    if (this.outcomeCodeableConcept == newValue) return this;
    return new ImmutableCarePlan_Activity(
        newValue,
        this.detail,
        this.progress,
        this.outcomeReference,
        this.reference,
        this.id,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Activity#outcomeCodeableConcept() outcomeCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcomeCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Activity withOutcomeCodeableConcept(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.outcomeCodeableConcept == value) return this;
    return new ImmutableCarePlan_Activity(
        value,
        this.detail,
        this.progress,
        this.outcomeReference,
        this.reference,
        this.id,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Activity#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Activity withDetail(CarePlan_Detail value) {
    @Nullable CarePlan_Detail newValue = Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        newValue,
        this.progress,
        this.outcomeReference,
        this.reference,
        this.id,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Activity#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Activity withDetail(Optional<? extends CarePlan_Detail> optional) {
    @Nullable CarePlan_Detail value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        value,
        this.progress,
        this.outcomeReference,
        this.reference,
        this.id,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Activity#progress() progress} attribute.
   * @param value The value for progress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Activity withProgress(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "progress");
    if (this.progress == newValue) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        this.detail,
        newValue,
        this.outcomeReference,
        this.reference,
        this.id,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Activity#progress() progress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for progress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Activity withProgress(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.progress == value) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        this.detail,
        value,
        this.outcomeReference,
        this.reference,
        this.id,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Activity#outcomeReference() outcomeReference} attribute.
   * @param value The value for outcomeReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Activity withOutcomeReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "outcomeReference");
    if (this.outcomeReference == newValue) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        this.detail,
        this.progress,
        newValue,
        this.reference,
        this.id,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Activity#outcomeReference() outcomeReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcomeReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Activity withOutcomeReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.outcomeReference == value) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        this.detail,
        this.progress,
        value,
        this.reference,
        this.id,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Activity#reference() reference} attribute.
   * @param value The value for reference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Activity withReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "reference");
    if (this.reference == newValue) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        this.detail,
        this.progress,
        this.outcomeReference,
        newValue,
        this.id,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Activity#reference() reference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Activity withReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.reference == value) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        this.detail,
        this.progress,
        this.outcomeReference,
        value,
        this.id,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Activity#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Activity withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        this.detail,
        this.progress,
        this.outcomeReference,
        this.reference,
        newValue,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Activity#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Activity withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        this.detail,
        this.progress,
        this.outcomeReference,
        this.reference,
        value,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Activity#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Activity withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        this.detail,
        this.progress,
        this.outcomeReference,
        this.reference,
        this.id,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Activity#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Activity withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        this.detail,
        this.progress,
        this.outcomeReference,
        this.reference,
        this.id,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan_Activity#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan_Activity withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        this.detail,
        this.progress,
        this.outcomeReference,
        this.reference,
        this.id,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan_Activity#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan_Activity withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCarePlan_Activity(
        this.outcomeCodeableConcept,
        this.detail,
        this.progress,
        this.outcomeReference,
        this.reference,
        this.id,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCarePlan_Activity} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCarePlan_Activity
        && equalTo((ImmutableCarePlan_Activity) another);
  }

  private boolean equalTo(ImmutableCarePlan_Activity another) {
    return Objects.equals(outcomeCodeableConcept, another.outcomeCodeableConcept)
        && Objects.equals(detail, another.detail)
        && Objects.equals(progress, another.progress)
        && Objects.equals(outcomeReference, another.outcomeReference)
        && Objects.equals(reference, another.reference)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code outcomeCodeableConcept}, {@code detail}, {@code progress}, {@code outcomeReference}, {@code reference}, {@code id}, {@code extension}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(outcomeCodeableConcept);
    h += (h << 5) + Objects.hashCode(detail);
    h += (h << 5) + Objects.hashCode(progress);
    h += (h << 5) + Objects.hashCode(outcomeReference);
    h += (h << 5) + Objects.hashCode(reference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code CarePlan_Activity} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CarePlan_Activity{");
    if (outcomeCodeableConcept != null) {
      builder.append("outcomeCodeableConcept=").append(outcomeCodeableConcept);
    }
    if (detail != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("detail=").append(detail);
    }
    if (progress != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("progress=").append(progress);
    }
    if (outcomeReference != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("outcomeReference=").append(outcomeReference);
    }
    if (reference != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("reference=").append(reference);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CarePlan_Activity", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CarePlan_Activity {
    @Nullable Optional<List<CodeableConcept>> outcomeCodeableConcept = Optional.empty();
    boolean outcomeCodeableConceptIsSet;
    @Nullable Optional<CarePlan_Detail> detail = Optional.empty();
    boolean detailIsSet;
    @Nullable Optional<List<Annotation>> progress = Optional.empty();
    boolean progressIsSet;
    @Nullable Optional<List<Reference>> outcomeReference = Optional.empty();
    boolean outcomeReferenceIsSet;
    @Nullable Optional<Reference> reference = Optional.empty();
    boolean referenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("outcomeCodeableConcept")
    public void setOutcomeCodeableConcept(Optional<List<CodeableConcept>> outcomeCodeableConcept) {
      this.outcomeCodeableConcept = outcomeCodeableConcept;
      this.outcomeCodeableConceptIsSet = true;
    }
    @JsonProperty("detail")
    public void setDetail(Optional<CarePlan_Detail> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @JsonProperty("progress")
    public void setProgress(Optional<List<Annotation>> progress) {
      this.progress = progress;
      this.progressIsSet = true;
    }
    @JsonProperty("outcomeReference")
    public void setOutcomeReference(Optional<List<Reference>> outcomeReference) {
      this.outcomeReference = outcomeReference;
      this.outcomeReferenceIsSet = true;
    }
    @JsonProperty("reference")
    public void setReference(Optional<Reference> reference) {
      this.reference = reference;
      this.referenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> outcomeCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CarePlan_Detail> detail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> progress() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> outcomeReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> reference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCarePlan_Activity fromJson(Json json) {
    ImmutableCarePlan_Activity.Builder builder = ImmutableCarePlan_Activity.builder();
    if (json.outcomeCodeableConceptIsSet) {
      builder.outcomeCodeableConcept(json.outcomeCodeableConcept);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.progressIsSet) {
      builder.progress(json.progress);
    }
    if (json.outcomeReferenceIsSet) {
      builder.outcomeReference(json.outcomeReference);
    }
    if (json.referenceIsSet) {
      builder.reference(json.reference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableCarePlan_Activity) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CarePlan_Activity} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CarePlan_Activity instance
   */
  public static CarePlan_Activity copyOf(CarePlan_Activity instance) {
    if (instance instanceof ImmutableCarePlan_Activity) {
      return (ImmutableCarePlan_Activity) instance;
    }
    return ImmutableCarePlan_Activity.builder()
        .outcomeCodeableConcept(instance.outcomeCodeableConcept())
        .detail(instance.detail())
        .progress(instance.progress())
        .outcomeReference(instance.outcomeReference())
        .reference(instance.reference())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link CarePlan_Activity CarePlan_Activity}.
   * <pre>
   * ImmutableCarePlan_Activity.builder()
   *    .outcomeCodeableConcept(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link CarePlan_Activity#outcomeCodeableConcept() outcomeCodeableConcept}
   *    .detail(com.medplum.types.fhir.CarePlan_Detail) // optional {@link CarePlan_Activity#detail() detail}
   *    .progress(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link CarePlan_Activity#progress() progress}
   *    .outcomeReference(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link CarePlan_Activity#outcomeReference() outcomeReference}
   *    .reference(com.medplum.types.fhir.Reference) // optional {@link CarePlan_Activity#reference() reference}
   *    .id(String) // optional {@link CarePlan_Activity#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CarePlan_Activity#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CarePlan_Activity#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new CarePlan_Activity builder
   */
  public static ImmutableCarePlan_Activity.Builder builder() {
    return new ImmutableCarePlan_Activity.Builder();
  }

  /**
   * Builds instances of type {@link CarePlan_Activity CarePlan_Activity}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CarePlan_Activity", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_OUTCOME_CODEABLE_CONCEPT = 0x1L;
    private static final long OPT_BIT_DETAIL = 0x2L;
    private static final long OPT_BIT_PROGRESS = 0x4L;
    private static final long OPT_BIT_OUTCOME_REFERENCE = 0x8L;
    private static final long OPT_BIT_REFERENCE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private long optBits;

    private @Nullable List<CodeableConcept> outcomeCodeableConcept;
    private @Nullable CarePlan_Detail detail;
    private @Nullable List<Annotation> progress;
    private @Nullable List<Reference> outcomeReference;
    private @Nullable Reference reference;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CarePlan_Activity#outcomeCodeableConcept() outcomeCodeableConcept} to outcomeCodeableConcept.
     * @param outcomeCodeableConcept The value for outcomeCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcomeCodeableConcept(List<CodeableConcept> outcomeCodeableConcept) {
      checkNotIsSet(outcomeCodeableConceptIsSet(), "outcomeCodeableConcept");
      this.outcomeCodeableConcept = Objects.requireNonNull(outcomeCodeableConcept, "outcomeCodeableConcept");
      optBits |= OPT_BIT_OUTCOME_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Activity#outcomeCodeableConcept() outcomeCodeableConcept} to outcomeCodeableConcept.
     * @param outcomeCodeableConcept The value for outcomeCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcomeCodeableConcept")
    public final Builder outcomeCodeableConcept(Optional<? extends List<CodeableConcept>> outcomeCodeableConcept) {
      checkNotIsSet(outcomeCodeableConceptIsSet(), "outcomeCodeableConcept");
      this.outcomeCodeableConcept = outcomeCodeableConcept.orElse(null);
      optBits |= OPT_BIT_OUTCOME_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Activity#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(CarePlan_Detail detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Activity#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detail")
    public final Builder detail(Optional<? extends CarePlan_Detail> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Activity#progress() progress} to progress.
     * @param progress The value for progress
     * @return {@code this} builder for chained invocation
     */
    public final Builder progress(List<Annotation> progress) {
      checkNotIsSet(progressIsSet(), "progress");
      this.progress = Objects.requireNonNull(progress, "progress");
      optBits |= OPT_BIT_PROGRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Activity#progress() progress} to progress.
     * @param progress The value for progress
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("progress")
    public final Builder progress(Optional<? extends List<Annotation>> progress) {
      checkNotIsSet(progressIsSet(), "progress");
      this.progress = progress.orElse(null);
      optBits |= OPT_BIT_PROGRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Activity#outcomeReference() outcomeReference} to outcomeReference.
     * @param outcomeReference The value for outcomeReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcomeReference(List<Reference> outcomeReference) {
      checkNotIsSet(outcomeReferenceIsSet(), "outcomeReference");
      this.outcomeReference = Objects.requireNonNull(outcomeReference, "outcomeReference");
      optBits |= OPT_BIT_OUTCOME_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Activity#outcomeReference() outcomeReference} to outcomeReference.
     * @param outcomeReference The value for outcomeReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcomeReference")
    public final Builder outcomeReference(Optional<? extends List<Reference>> outcomeReference) {
      checkNotIsSet(outcomeReferenceIsSet(), "outcomeReference");
      this.outcomeReference = outcomeReference.orElse(null);
      optBits |= OPT_BIT_OUTCOME_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Activity#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reference(Reference reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = Objects.requireNonNull(reference, "reference");
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Activity#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reference")
    public final Builder reference(Optional<? extends Reference> reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = reference.orElse(null);
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan_Activity#id() id} to id.
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
     * Initializes the optional value {@link CarePlan_Activity#id() id} to id.
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
     * Initializes the optional value {@link CarePlan_Activity#extension() extension} to extension.
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
     * Initializes the optional value {@link CarePlan_Activity#extension() extension} to extension.
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
     * Initializes the optional value {@link CarePlan_Activity#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CarePlan_Activity#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link CarePlan_Activity CarePlan_Activity}.
     * @return An immutable instance of CarePlan_Activity
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CarePlan_Activity build() {
      return new ImmutableCarePlan_Activity(
          outcomeCodeableConcept,
          detail,
          progress,
          outcomeReference,
          reference,
          id,
          extension,
          modifierExtension);
    }

    private boolean outcomeCodeableConceptIsSet() {
      return (optBits & OPT_BIT_OUTCOME_CODEABLE_CONCEPT) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean progressIsSet() {
      return (optBits & OPT_BIT_PROGRESS) != 0;
    }

    private boolean outcomeReferenceIsSet() {
      return (optBits & OPT_BIT_OUTCOME_REFERENCE) != 0;
    }

    private boolean referenceIsSet() {
      return (optBits & OPT_BIT_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CarePlan_Activity is strict, attribute is already set: ".concat(name));
    }
  }
}
