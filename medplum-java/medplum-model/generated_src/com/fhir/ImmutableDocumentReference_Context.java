package com.fhir;

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
 * Immutable implementation of {@link DocumentReference_Context}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDocumentReference_Context.builder()}.
 */
@Generated(from = "DocumentReference_Context", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDocumentReference_Context implements DocumentReference_Context {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept facilityType;
  private final @Nullable String id;
  private final @Nullable CodeableConcept practiceSetting;
  private final @Nullable List<Reference> related;
  private final @Nullable List<Reference> encounter;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeableConcept> event;
  private final @Nullable Period period;
  private final @Nullable Reference sourcePatientInfo;

  private ImmutableDocumentReference_Context(
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept facilityType,
      @Nullable String id,
      @Nullable CodeableConcept practiceSetting,
      @Nullable List<Reference> related,
      @Nullable List<Reference> encounter,
      @Nullable List<Extension> extension,
      @Nullable List<CodeableConcept> event,
      @Nullable Period period,
      @Nullable Reference sourcePatientInfo) {
    this.modifierExtension = modifierExtension;
    this.facilityType = facilityType;
    this.id = id;
    this.practiceSetting = practiceSetting;
    this.related = related;
    this.encounter = encounter;
    this.extension = extension;
    this.event = event;
    this.period = period;
    this.sourcePatientInfo = sourcePatientInfo;
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
   * @return The value of the {@code facilityType} attribute
   */
  @JsonProperty("facilityType")
  @Override
  public Optional<CodeableConcept> facilityType() {
    return Optional.ofNullable(facilityType);
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
   * @return The value of the {@code practiceSetting} attribute
   */
  @JsonProperty("practiceSetting")
  @Override
  public Optional<CodeableConcept> practiceSetting() {
    return Optional.ofNullable(practiceSetting);
  }

  /**
   * @return The value of the {@code related} attribute
   */
  @JsonProperty("related")
  @Override
  public Optional<List<Reference>> related() {
    return Optional.ofNullable(related);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<List<Reference>> encounter() {
    return Optional.ofNullable(encounter);
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
   * @return The value of the {@code event} attribute
   */
  @JsonProperty("event")
  @Override
  public Optional<List<CodeableConcept>> event() {
    return Optional.ofNullable(event);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code sourcePatientInfo} attribute
   */
  @JsonProperty("sourcePatientInfo")
  @Override
  public Optional<Reference> sourcePatientInfo() {
    return Optional.ofNullable(sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Context#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Context withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDocumentReference_Context(
        newValue,
        this.facilityType,
        this.id,
        this.practiceSetting,
        this.related,
        this.encounter,
        this.extension,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Context#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_Context withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDocumentReference_Context(
        value,
        this.facilityType,
        this.id,
        this.practiceSetting,
        this.related,
        this.encounter,
        this.extension,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Context#facilityType() facilityType} attribute.
   * @param value The value for facilityType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Context withFacilityType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "facilityType");
    if (this.facilityType == newValue) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        newValue,
        this.id,
        this.practiceSetting,
        this.related,
        this.encounter,
        this.extension,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Context#facilityType() facilityType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for facilityType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_Context withFacilityType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.facilityType == value) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        value,
        this.id,
        this.practiceSetting,
        this.related,
        this.encounter,
        this.extension,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Context#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Context withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        newValue,
        this.practiceSetting,
        this.related,
        this.encounter,
        this.extension,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Context#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Context withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        value,
        this.practiceSetting,
        this.related,
        this.encounter,
        this.extension,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Context#practiceSetting() practiceSetting} attribute.
   * @param value The value for practiceSetting
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Context withPracticeSetting(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "practiceSetting");
    if (this.practiceSetting == newValue) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        newValue,
        this.related,
        this.encounter,
        this.extension,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Context#practiceSetting() practiceSetting} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for practiceSetting
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_Context withPracticeSetting(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.practiceSetting == value) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        value,
        this.related,
        this.encounter,
        this.extension,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Context#related() related} attribute.
   * @param value The value for related
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Context withRelated(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "related");
    if (this.related == newValue) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        this.practiceSetting,
        newValue,
        this.encounter,
        this.extension,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Context#related() related} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for related
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_Context withRelated(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.related == value) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        this.practiceSetting,
        value,
        this.encounter,
        this.extension,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Context#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Context withEncounter(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        this.practiceSetting,
        this.related,
        newValue,
        this.extension,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Context#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_Context withEncounter(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        this.practiceSetting,
        this.related,
        value,
        this.extension,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Context#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Context withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        this.practiceSetting,
        this.related,
        this.encounter,
        newValue,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Context#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_Context withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        this.practiceSetting,
        this.related,
        this.encounter,
        value,
        this.event,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Context#event() event} attribute.
   * @param value The value for event
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Context withEvent(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "event");
    if (this.event == newValue) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        this.practiceSetting,
        this.related,
        this.encounter,
        this.extension,
        newValue,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Context#event() event} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for event
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_Context withEvent(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.event == value) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        this.practiceSetting,
        this.related,
        this.encounter,
        this.extension,
        value,
        this.period,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Context#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Context withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        this.practiceSetting,
        this.related,
        this.encounter,
        this.extension,
        this.event,
        newValue,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Context#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_Context withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        this.practiceSetting,
        this.related,
        this.encounter,
        this.extension,
        this.event,
        value,
        this.sourcePatientInfo);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Context#sourcePatientInfo() sourcePatientInfo} attribute.
   * @param value The value for sourcePatientInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Context withSourcePatientInfo(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "sourcePatientInfo");
    if (this.sourcePatientInfo == newValue) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        this.practiceSetting,
        this.related,
        this.encounter,
        this.extension,
        this.event,
        this.period,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Context#sourcePatientInfo() sourcePatientInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourcePatientInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_Context withSourcePatientInfo(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.sourcePatientInfo == value) return this;
    return new ImmutableDocumentReference_Context(
        this.modifierExtension,
        this.facilityType,
        this.id,
        this.practiceSetting,
        this.related,
        this.encounter,
        this.extension,
        this.event,
        this.period,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDocumentReference_Context} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDocumentReference_Context
        && equalTo((ImmutableDocumentReference_Context) another);
  }

  private boolean equalTo(ImmutableDocumentReference_Context another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(facilityType, another.facilityType)
        && Objects.equals(id, another.id)
        && Objects.equals(practiceSetting, another.practiceSetting)
        && Objects.equals(related, another.related)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(extension, another.extension)
        && Objects.equals(event, another.event)
        && Objects.equals(period, another.period)
        && Objects.equals(sourcePatientInfo, another.sourcePatientInfo);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code facilityType}, {@code id}, {@code practiceSetting}, {@code related}, {@code encounter}, {@code extension}, {@code event}, {@code period}, {@code sourcePatientInfo}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(facilityType);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(practiceSetting);
    h += (h << 5) + Objects.hashCode(related);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(event);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(sourcePatientInfo);
    return h;
  }

  /**
   * Prints the immutable value {@code DocumentReference_Context} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DocumentReference_Context{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (facilityType != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("facilityType=").append(facilityType);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (practiceSetting != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("practiceSetting=").append(practiceSetting);
    }
    if (related != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("related=").append(related);
    }
    if (encounter != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (event != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("event=").append(event);
    }
    if (period != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (sourcePatientInfo != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("sourcePatientInfo=").append(sourcePatientInfo);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DocumentReference_Context", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DocumentReference_Context {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> facilityType = Optional.empty();
    boolean facilityTypeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> practiceSetting = Optional.empty();
    boolean practiceSettingIsSet;
    @Nullable Optional<List<Reference>> related = Optional.empty();
    boolean relatedIsSet;
    @Nullable Optional<List<Reference>> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeableConcept>> event = Optional.empty();
    boolean eventIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<Reference> sourcePatientInfo = Optional.empty();
    boolean sourcePatientInfoIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("facilityType")
    public void setFacilityType(Optional<CodeableConcept> facilityType) {
      this.facilityType = facilityType;
      this.facilityTypeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("practiceSetting")
    public void setPracticeSetting(Optional<CodeableConcept> practiceSetting) {
      this.practiceSetting = practiceSetting;
      this.practiceSettingIsSet = true;
    }
    @JsonProperty("related")
    public void setRelated(Optional<List<Reference>> related) {
      this.related = related;
      this.relatedIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<List<Reference>> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("event")
    public void setEvent(Optional<List<CodeableConcept>> event) {
      this.event = event;
      this.eventIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("sourcePatientInfo")
    public void setSourcePatientInfo(Optional<Reference> sourcePatientInfo) {
      this.sourcePatientInfo = sourcePatientInfo;
      this.sourcePatientInfoIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> facilityType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> practiceSetting() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> related() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> event() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> sourcePatientInfo() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDocumentReference_Context fromJson(Json json) {
    ImmutableDocumentReference_Context.Builder builder = ImmutableDocumentReference_Context.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.facilityTypeIsSet) {
      builder.facilityType(json.facilityType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.practiceSettingIsSet) {
      builder.practiceSetting(json.practiceSetting);
    }
    if (json.relatedIsSet) {
      builder.related(json.related);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.eventIsSet) {
      builder.event(json.event);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.sourcePatientInfoIsSet) {
      builder.sourcePatientInfo(json.sourcePatientInfo);
    }
    return (ImmutableDocumentReference_Context) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DocumentReference_Context} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DocumentReference_Context instance
   */
  public static DocumentReference_Context copyOf(DocumentReference_Context instance) {
    if (instance instanceof ImmutableDocumentReference_Context) {
      return (ImmutableDocumentReference_Context) instance;
    }
    return ImmutableDocumentReference_Context.builder()
        .modifierExtension(instance.modifierExtension())
        .facilityType(instance.facilityType())
        .id(instance.id())
        .practiceSetting(instance.practiceSetting())
        .related(instance.related())
        .encounter(instance.encounter())
        .extension(instance.extension())
        .event(instance.event())
        .period(instance.period())
        .sourcePatientInfo(instance.sourcePatientInfo())
        .build();
  }

  /**
   * Creates a builder for {@link DocumentReference_Context DocumentReference_Context}.
   * <pre>
   * ImmutableDocumentReference_Context.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DocumentReference_Context#modifierExtension() modifierExtension}
   *    .facilityType(com.fhir.CodeableConcept) // optional {@link DocumentReference_Context#facilityType() facilityType}
   *    .id(String) // optional {@link DocumentReference_Context#id() id}
   *    .practiceSetting(com.fhir.CodeableConcept) // optional {@link DocumentReference_Context#practiceSetting() practiceSetting}
   *    .related(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DocumentReference_Context#related() related}
   *    .encounter(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DocumentReference_Context#encounter() encounter}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DocumentReference_Context#extension() extension}
   *    .event(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link DocumentReference_Context#event() event}
   *    .period(com.fhir.Period) // optional {@link DocumentReference_Context#period() period}
   *    .sourcePatientInfo(com.fhir.Reference) // optional {@link DocumentReference_Context#sourcePatientInfo() sourcePatientInfo}
   *    .build();
   * </pre>
   * @return A new DocumentReference_Context builder
   */
  public static ImmutableDocumentReference_Context.Builder builder() {
    return new ImmutableDocumentReference_Context.Builder();
  }

  /**
   * Builds instances of type {@link DocumentReference_Context DocumentReference_Context}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DocumentReference_Context", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_FACILITY_TYPE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_PRACTICE_SETTING = 0x8L;
    private static final long OPT_BIT_RELATED = 0x10L;
    private static final long OPT_BIT_ENCOUNTER = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_EVENT = 0x80L;
    private static final long OPT_BIT_PERIOD = 0x100L;
    private static final long OPT_BIT_SOURCE_PATIENT_INFO = 0x200L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept facilityType;
    private @Nullable String id;
    private @Nullable CodeableConcept practiceSetting;
    private @Nullable List<Reference> related;
    private @Nullable List<Reference> encounter;
    private @Nullable List<Extension> extension;
    private @Nullable List<CodeableConcept> event;
    private @Nullable Period period;
    private @Nullable Reference sourcePatientInfo;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DocumentReference_Context#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DocumentReference_Context#facilityType() facilityType} to facilityType.
     * @param facilityType The value for facilityType
     * @return {@code this} builder for chained invocation
     */
    public final Builder facilityType(CodeableConcept facilityType) {
      checkNotIsSet(facilityTypeIsSet(), "facilityType");
      this.facilityType = Objects.requireNonNull(facilityType, "facilityType");
      optBits |= OPT_BIT_FACILITY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#facilityType() facilityType} to facilityType.
     * @param facilityType The value for facilityType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("facilityType")
    public final Builder facilityType(Optional<? extends CodeableConcept> facilityType) {
      checkNotIsSet(facilityTypeIsSet(), "facilityType");
      this.facilityType = facilityType.orElse(null);
      optBits |= OPT_BIT_FACILITY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#id() id} to id.
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
     * Initializes the optional value {@link DocumentReference_Context#id() id} to id.
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
     * Initializes the optional value {@link DocumentReference_Context#practiceSetting() practiceSetting} to practiceSetting.
     * @param practiceSetting The value for practiceSetting
     * @return {@code this} builder for chained invocation
     */
    public final Builder practiceSetting(CodeableConcept practiceSetting) {
      checkNotIsSet(practiceSettingIsSet(), "practiceSetting");
      this.practiceSetting = Objects.requireNonNull(practiceSetting, "practiceSetting");
      optBits |= OPT_BIT_PRACTICE_SETTING;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#practiceSetting() practiceSetting} to practiceSetting.
     * @param practiceSetting The value for practiceSetting
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("practiceSetting")
    public final Builder practiceSetting(Optional<? extends CodeableConcept> practiceSetting) {
      checkNotIsSet(practiceSettingIsSet(), "practiceSetting");
      this.practiceSetting = practiceSetting.orElse(null);
      optBits |= OPT_BIT_PRACTICE_SETTING;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for chained invocation
     */
    public final Builder related(List<Reference> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = Objects.requireNonNull(related, "related");
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#related() related} to related.
     * @param related The value for related
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("related")
    public final Builder related(Optional<? extends List<Reference>> related) {
      checkNotIsSet(relatedIsSet(), "related");
      this.related = related.orElse(null);
      optBits |= OPT_BIT_RELATED;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(List<Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encounter")
    public final Builder encounter(Optional<? extends List<Reference>> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentReference_Context#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentReference_Context#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for chained invocation
     */
    public final Builder event(List<CodeableConcept> event) {
      checkNotIsSet(eventIsSet(), "event");
      this.event = Objects.requireNonNull(event, "event");
      optBits |= OPT_BIT_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("event")
    public final Builder event(Optional<? extends List<CodeableConcept>> event) {
      checkNotIsSet(eventIsSet(), "event");
      this.event = event.orElse(null);
      optBits |= OPT_BIT_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#sourcePatientInfo() sourcePatientInfo} to sourcePatientInfo.
     * @param sourcePatientInfo The value for sourcePatientInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourcePatientInfo(Reference sourcePatientInfo) {
      checkNotIsSet(sourcePatientInfoIsSet(), "sourcePatientInfo");
      this.sourcePatientInfo = Objects.requireNonNull(sourcePatientInfo, "sourcePatientInfo");
      optBits |= OPT_BIT_SOURCE_PATIENT_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Context#sourcePatientInfo() sourcePatientInfo} to sourcePatientInfo.
     * @param sourcePatientInfo The value for sourcePatientInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourcePatientInfo")
    public final Builder sourcePatientInfo(Optional<? extends Reference> sourcePatientInfo) {
      checkNotIsSet(sourcePatientInfoIsSet(), "sourcePatientInfo");
      this.sourcePatientInfo = sourcePatientInfo.orElse(null);
      optBits |= OPT_BIT_SOURCE_PATIENT_INFO;
      return this;
    }

    /**
     * Builds a new {@link DocumentReference_Context DocumentReference_Context}.
     * @return An immutable instance of DocumentReference_Context
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DocumentReference_Context build() {
      return new ImmutableDocumentReference_Context(
          modifierExtension,
          facilityType,
          id,
          practiceSetting,
          related,
          encounter,
          extension,
          event,
          period,
          sourcePatientInfo);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean facilityTypeIsSet() {
      return (optBits & OPT_BIT_FACILITY_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean practiceSettingIsSet() {
      return (optBits & OPT_BIT_PRACTICE_SETTING) != 0;
    }

    private boolean relatedIsSet() {
      return (optBits & OPT_BIT_RELATED) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean eventIsSet() {
      return (optBits & OPT_BIT_EVENT) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean sourcePatientInfoIsSet() {
      return (optBits & OPT_BIT_SOURCE_PATIENT_INFO) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DocumentReference_Context is strict, attribute is already set: ".concat(name));
    }
  }
}
