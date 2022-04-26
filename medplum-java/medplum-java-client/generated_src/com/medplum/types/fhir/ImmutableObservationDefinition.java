package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ObservationDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableObservationDefinition.builder()}.
 */
@Generated(from = "ObservationDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableObservationDefinition implements ObservationDefinition {
  private final @Nullable String preferredReportName;
  private final @Nullable Reference normalCodedValueSet;
  private final @Nullable Narrative text;
  private final @Nullable Reference criticalCodedValueSet;
  private final @Nullable Boolean multipleResultsAllowed;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final String resourceType;
  private final @Nullable Reference abnormalCodedValueSet;
  private final @Nullable Id id;
  private final @Nullable Meta meta;
  private final @Nullable Reference validCodedValueSet;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept method;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ObservationDefinition_QualifiedInterval> qualifiedInterval;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<CodeableConcept> category;
  private final CodeableConcept code;
  private final @Nullable List<ObservationdefinitionPermitteddatatypeItem> permittedDataType;
  private final @Nullable ObservationDefinition_QuantitativeDetails quantitativeDetails;

  private ImmutableObservationDefinition(
      @Nullable String preferredReportName,
      @Nullable Reference normalCodedValueSet,
      @Nullable Narrative text,
      @Nullable Reference criticalCodedValueSet,
      @Nullable Boolean multipleResultsAllowed,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      String resourceType,
      @Nullable Reference abnormalCodedValueSet,
      @Nullable Id id,
      @Nullable Meta meta,
      @Nullable Reference validCodedValueSet,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept method,
      @Nullable List<Identifier> identifier,
      @Nullable List<Extension> extension,
      @Nullable List<ObservationDefinition_QualifiedInterval> qualifiedInterval,
      @Nullable List<ResourceList> contained,
      @Nullable List<CodeableConcept> category,
      CodeableConcept code,
      @Nullable List<ObservationdefinitionPermitteddatatypeItem> permittedDataType,
      @Nullable ObservationDefinition_QuantitativeDetails quantitativeDetails) {
    this.preferredReportName = preferredReportName;
    this.normalCodedValueSet = normalCodedValueSet;
    this.text = text;
    this.criticalCodedValueSet = criticalCodedValueSet;
    this.multipleResultsAllowed = multipleResultsAllowed;
    this.implicitRules = implicitRules;
    this.language = language;
    this.resourceType = resourceType;
    this.abnormalCodedValueSet = abnormalCodedValueSet;
    this.id = id;
    this.meta = meta;
    this.validCodedValueSet = validCodedValueSet;
    this.modifierExtension = modifierExtension;
    this.method = method;
    this.identifier = identifier;
    this.extension = extension;
    this.qualifiedInterval = qualifiedInterval;
    this.contained = contained;
    this.category = category;
    this.code = code;
    this.permittedDataType = permittedDataType;
    this.quantitativeDetails = quantitativeDetails;
  }

  /**
   * @return The value of the {@code preferredReportName} attribute
   */
  @JsonProperty("preferredReportName")
  @Override
  public Optional<String> preferredReportName() {
    return Optional.ofNullable(preferredReportName);
  }

  /**
   * @return The value of the {@code normalCodedValueSet} attribute
   */
  @JsonProperty("normalCodedValueSet")
  @Override
  public Optional<Reference> normalCodedValueSet() {
    return Optional.ofNullable(normalCodedValueSet);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code criticalCodedValueSet} attribute
   */
  @JsonProperty("criticalCodedValueSet")
  @Override
  public Optional<Reference> criticalCodedValueSet() {
    return Optional.ofNullable(criticalCodedValueSet);
  }

  /**
   * @return The value of the {@code multipleResultsAllowed} attribute
   */
  @JsonProperty("multipleResultsAllowed")
  @Override
  public Optional<Boolean> multipleResultsAllowed() {
    return Optional.ofNullable(multipleResultsAllowed);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code abnormalCodedValueSet} attribute
   */
  @JsonProperty("abnormalCodedValueSet")
  @Override
  public Optional<Reference> abnormalCodedValueSet() {
    return Optional.ofNullable(abnormalCodedValueSet);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code validCodedValueSet} attribute
   */
  @JsonProperty("validCodedValueSet")
  @Override
  public Optional<Reference> validCodedValueSet() {
    return Optional.ofNullable(validCodedValueSet);
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
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public Optional<CodeableConcept> method() {
    return Optional.ofNullable(method);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code qualifiedInterval} attribute
   */
  @JsonProperty("qualifiedInterval")
  @Override
  public Optional<List<ObservationDefinition_QualifiedInterval>> qualifiedInterval() {
    return Optional.ofNullable(qualifiedInterval);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public CodeableConcept code() {
    return code;
  }

  /**
   * @return The value of the {@code permittedDataType} attribute
   */
  @JsonProperty("permittedDataType")
  @Override
  public Optional<List<ObservationdefinitionPermitteddatatypeItem>> permittedDataType() {
    return Optional.ofNullable(permittedDataType);
  }

  /**
   * @return The value of the {@code quantitativeDetails} attribute
   */
  @JsonProperty("quantitativeDetails")
  @Override
  public Optional<ObservationDefinition_QuantitativeDetails> quantitativeDetails() {
    return Optional.ofNullable(quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#preferredReportName() preferredReportName} attribute.
   * @param value The value for preferredReportName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withPreferredReportName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "preferredReportName");
    if (Objects.equals(this.preferredReportName, newValue)) return this;
    return new ImmutableObservationDefinition(
        newValue,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#preferredReportName() preferredReportName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preferredReportName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withPreferredReportName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.preferredReportName, value)) return this;
    return new ImmutableObservationDefinition(
        value,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet} attribute.
   * @param value The value for normalCodedValueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withNormalCodedValueSet(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "normalCodedValueSet");
    if (this.normalCodedValueSet == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        newValue,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for normalCodedValueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withNormalCodedValueSet(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.normalCodedValueSet == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        value,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        newValue,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        value,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet} attribute.
   * @param value The value for criticalCodedValueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withCriticalCodedValueSet(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "criticalCodedValueSet");
    if (this.criticalCodedValueSet == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        newValue,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for criticalCodedValueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withCriticalCodedValueSet(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.criticalCodedValueSet == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        value,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed} attribute.
   * @param value The value for multipleResultsAllowed
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withMultipleResultsAllowed(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.multipleResultsAllowed, newValue)) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        newValue,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for multipleResultsAllowed
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withMultipleResultsAllowed(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.multipleResultsAllowed, value)) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        value,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        newValue,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        value,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        value,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ObservationDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableObservationDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        newValue,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet} attribute.
   * @param value The value for abnormalCodedValueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withAbnormalCodedValueSet(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "abnormalCodedValueSet");
    if (this.abnormalCodedValueSet == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        newValue,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for abnormalCodedValueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withAbnormalCodedValueSet(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.abnormalCodedValueSet == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        value,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        newValue,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        value,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        newValue,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        value,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#validCodedValueSet() validCodedValueSet} attribute.
   * @param value The value for validCodedValueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withValidCodedValueSet(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "validCodedValueSet");
    if (this.validCodedValueSet == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        newValue,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#validCodedValueSet() validCodedValueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validCodedValueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withValidCodedValueSet(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.validCodedValueSet == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        value,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        newValue,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        value,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withMethod(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        newValue,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withMethod(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        value,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        newValue,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        value,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        newValue,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        value,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#qualifiedInterval() qualifiedInterval} attribute.
   * @param value The value for qualifiedInterval
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withQualifiedInterval(List<ObservationDefinition_QualifiedInterval> value) {
    @Nullable List<ObservationDefinition_QualifiedInterval> newValue = Objects.requireNonNull(value, "qualifiedInterval");
    if (this.qualifiedInterval == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        newValue,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#qualifiedInterval() qualifiedInterval} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for qualifiedInterval
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withQualifiedInterval(Optional<? extends List<ObservationDefinition_QualifiedInterval>> optional) {
    @Nullable List<ObservationDefinition_QualifiedInterval> value = optional.orElse(null);
    if (this.qualifiedInterval == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        value,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        newValue,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        value,
        this.category,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        newValue,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        value,
        this.code,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ObservationDefinition#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableObservationDefinition withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        newValue,
        this.permittedDataType,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#permittedDataType() permittedDataType} attribute.
   * @param value The value for permittedDataType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withPermittedDataType(List<ObservationdefinitionPermitteddatatypeItem> value) {
    @Nullable List<ObservationdefinitionPermitteddatatypeItem> newValue = Objects.requireNonNull(value, "permittedDataType");
    if (this.permittedDataType == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        newValue,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#permittedDataType() permittedDataType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for permittedDataType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withPermittedDataType(Optional<? extends List<ObservationdefinitionPermitteddatatypeItem>> optional) {
    @Nullable List<ObservationdefinitionPermitteddatatypeItem> value = optional.orElse(null);
    if (this.permittedDataType == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        value,
        this.quantitativeDetails);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ObservationDefinition#quantitativeDetails() quantitativeDetails} attribute.
   * @param value The value for quantitativeDetails
   * @return A modified copy of {@code this} object
   */
  public final ImmutableObservationDefinition withQuantitativeDetails(ObservationDefinition_QuantitativeDetails value) {
    @Nullable ObservationDefinition_QuantitativeDetails newValue = Objects.requireNonNull(value, "quantitativeDetails");
    if (this.quantitativeDetails == newValue) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ObservationDefinition#quantitativeDetails() quantitativeDetails} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantitativeDetails
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableObservationDefinition withQuantitativeDetails(Optional<? extends ObservationDefinition_QuantitativeDetails> optional) {
    @Nullable ObservationDefinition_QuantitativeDetails value = optional.orElse(null);
    if (this.quantitativeDetails == value) return this;
    return new ImmutableObservationDefinition(
        this.preferredReportName,
        this.normalCodedValueSet,
        this.text,
        this.criticalCodedValueSet,
        this.multipleResultsAllowed,
        this.implicitRules,
        this.language,
        this.resourceType,
        this.abnormalCodedValueSet,
        this.id,
        this.meta,
        this.validCodedValueSet,
        this.modifierExtension,
        this.method,
        this.identifier,
        this.extension,
        this.qualifiedInterval,
        this.contained,
        this.category,
        this.code,
        this.permittedDataType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableObservationDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableObservationDefinition
        && equalTo((ImmutableObservationDefinition) another);
  }

  private boolean equalTo(ImmutableObservationDefinition another) {
    return Objects.equals(preferredReportName, another.preferredReportName)
        && Objects.equals(normalCodedValueSet, another.normalCodedValueSet)
        && Objects.equals(text, another.text)
        && Objects.equals(criticalCodedValueSet, another.criticalCodedValueSet)
        && Objects.equals(multipleResultsAllowed, another.multipleResultsAllowed)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && resourceType.equals(another.resourceType)
        && Objects.equals(abnormalCodedValueSet, another.abnormalCodedValueSet)
        && Objects.equals(id, another.id)
        && Objects.equals(meta, another.meta)
        && Objects.equals(validCodedValueSet, another.validCodedValueSet)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(method, another.method)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(extension, another.extension)
        && Objects.equals(qualifiedInterval, another.qualifiedInterval)
        && Objects.equals(contained, another.contained)
        && Objects.equals(category, another.category)
        && code.equals(another.code)
        && Objects.equals(permittedDataType, another.permittedDataType)
        && Objects.equals(quantitativeDetails, another.quantitativeDetails);
  }

  /**
   * Computes a hash code from attributes: {@code preferredReportName}, {@code normalCodedValueSet}, {@code text}, {@code criticalCodedValueSet}, {@code multipleResultsAllowed}, {@code implicitRules}, {@code language}, {@code resourceType}, {@code abnormalCodedValueSet}, {@code id}, {@code meta}, {@code validCodedValueSet}, {@code modifierExtension}, {@code method}, {@code identifier}, {@code extension}, {@code qualifiedInterval}, {@code contained}, {@code category}, {@code code}, {@code permittedDataType}, {@code quantitativeDetails}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(preferredReportName);
    h += (h << 5) + Objects.hashCode(normalCodedValueSet);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(criticalCodedValueSet);
    h += (h << 5) + Objects.hashCode(multipleResultsAllowed);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(abnormalCodedValueSet);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(validCodedValueSet);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(method);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(qualifiedInterval);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(permittedDataType);
    h += (h << 5) + Objects.hashCode(quantitativeDetails);
    return h;
  }

  /**
   * Prints the immutable value {@code ObservationDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ObservationDefinition{");
    if (preferredReportName != null) {
      builder.append("preferredReportName=").append(preferredReportName);
    }
    if (normalCodedValueSet != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("normalCodedValueSet=").append(normalCodedValueSet);
    }
    if (text != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (criticalCodedValueSet != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("criticalCodedValueSet=").append(criticalCodedValueSet);
    }
    if (multipleResultsAllowed != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("multipleResultsAllowed=").append(multipleResultsAllowed);
    }
    if (implicitRules != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (abnormalCodedValueSet != null) {
      builder.append(", ");
      builder.append("abnormalCodedValueSet=").append(abnormalCodedValueSet);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (validCodedValueSet != null) {
      builder.append(", ");
      builder.append("validCodedValueSet=").append(validCodedValueSet);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (method != null) {
      builder.append(", ");
      builder.append("method=").append(method);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (qualifiedInterval != null) {
      builder.append(", ");
      builder.append("qualifiedInterval=").append(qualifiedInterval);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    builder.append(", ");
    builder.append("code=").append(code);
    if (permittedDataType != null) {
      builder.append(", ");
      builder.append("permittedDataType=").append(permittedDataType);
    }
    if (quantitativeDetails != null) {
      builder.append(", ");
      builder.append("quantitativeDetails=").append(quantitativeDetails);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ObservationDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ObservationDefinition {
    @Nullable Optional<String> preferredReportName = Optional.empty();
    boolean preferredReportNameIsSet;
    @Nullable Optional<Reference> normalCodedValueSet = Optional.empty();
    boolean normalCodedValueSetIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Reference> criticalCodedValueSet = Optional.empty();
    boolean criticalCodedValueSetIsSet;
    @Nullable Optional<Boolean> multipleResultsAllowed = Optional.empty();
    boolean multipleResultsAllowedIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Reference> abnormalCodedValueSet = Optional.empty();
    boolean abnormalCodedValueSetIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Reference> validCodedValueSet = Optional.empty();
    boolean validCodedValueSetIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> method = Optional.empty();
    boolean methodIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ObservationDefinition_QualifiedInterval>> qualifiedInterval = Optional.empty();
    boolean qualifiedIntervalIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable CodeableConcept code;
    @Nullable Optional<List<ObservationdefinitionPermitteddatatypeItem>> permittedDataType = Optional.empty();
    boolean permittedDataTypeIsSet;
    @Nullable Optional<ObservationDefinition_QuantitativeDetails> quantitativeDetails = Optional.empty();
    boolean quantitativeDetailsIsSet;
    @JsonProperty("preferredReportName")
    public void setPreferredReportName(Optional<String> preferredReportName) {
      this.preferredReportName = preferredReportName;
      this.preferredReportNameIsSet = true;
    }
    @JsonProperty("normalCodedValueSet")
    public void setNormalCodedValueSet(Optional<Reference> normalCodedValueSet) {
      this.normalCodedValueSet = normalCodedValueSet;
      this.normalCodedValueSetIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("criticalCodedValueSet")
    public void setCriticalCodedValueSet(Optional<Reference> criticalCodedValueSet) {
      this.criticalCodedValueSet = criticalCodedValueSet;
      this.criticalCodedValueSetIsSet = true;
    }
    @JsonProperty("multipleResultsAllowed")
    public void setMultipleResultsAllowed(Optional<Boolean> multipleResultsAllowed) {
      this.multipleResultsAllowed = multipleResultsAllowed;
      this.multipleResultsAllowedIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("abnormalCodedValueSet")
    public void setAbnormalCodedValueSet(Optional<Reference> abnormalCodedValueSet) {
      this.abnormalCodedValueSet = abnormalCodedValueSet;
      this.abnormalCodedValueSetIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("validCodedValueSet")
    public void setValidCodedValueSet(Optional<Reference> validCodedValueSet) {
      this.validCodedValueSet = validCodedValueSet;
      this.validCodedValueSetIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("method")
    public void setMethod(Optional<CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("qualifiedInterval")
    public void setQualifiedInterval(Optional<List<ObservationDefinition_QualifiedInterval>> qualifiedInterval) {
      this.qualifiedInterval = qualifiedInterval;
      this.qualifiedIntervalIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
    }
    @JsonProperty("permittedDataType")
    public void setPermittedDataType(Optional<List<ObservationdefinitionPermitteddatatypeItem>> permittedDataType) {
      this.permittedDataType = permittedDataType;
      this.permittedDataTypeIsSet = true;
    }
    @JsonProperty("quantitativeDetails")
    public void setQuantitativeDetails(Optional<ObservationDefinition_QuantitativeDetails> quantitativeDetails) {
      this.quantitativeDetails = quantitativeDetails;
      this.quantitativeDetailsIsSet = true;
    }
    @Override
    public Optional<String> preferredReportName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> normalCodedValueSet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> criticalCodedValueSet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> multipleResultsAllowed() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> abnormalCodedValueSet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> validCodedValueSet() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> method() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ObservationDefinition_QualifiedInterval>> qualifiedInterval() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ObservationdefinitionPermitteddatatypeItem>> permittedDataType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ObservationDefinition_QuantitativeDetails> quantitativeDetails() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableObservationDefinition fromJson(Json json) {
    ImmutableObservationDefinition.Builder builder = ((ImmutableObservationDefinition.Builder) ImmutableObservationDefinition.builder());
    if (json.preferredReportNameIsSet) {
      builder.preferredReportName(json.preferredReportName);
    }
    if (json.normalCodedValueSetIsSet) {
      builder.normalCodedValueSet(json.normalCodedValueSet);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.criticalCodedValueSetIsSet) {
      builder.criticalCodedValueSet(json.criticalCodedValueSet);
    }
    if (json.multipleResultsAllowedIsSet) {
      builder.multipleResultsAllowed(json.multipleResultsAllowed);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.abnormalCodedValueSetIsSet) {
      builder.abnormalCodedValueSet(json.abnormalCodedValueSet);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.validCodedValueSetIsSet) {
      builder.validCodedValueSet(json.validCodedValueSet);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.qualifiedIntervalIsSet) {
      builder.qualifiedInterval(json.qualifiedInterval);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.permittedDataTypeIsSet) {
      builder.permittedDataType(json.permittedDataType);
    }
    if (json.quantitativeDetailsIsSet) {
      builder.quantitativeDetails(json.quantitativeDetails);
    }
    return (ImmutableObservationDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ObservationDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ObservationDefinition instance
   */
  public static ObservationDefinition copyOf(ObservationDefinition instance) {
    if (instance instanceof ImmutableObservationDefinition) {
      return (ImmutableObservationDefinition) instance;
    }
    return ((ImmutableObservationDefinition.Builder) ImmutableObservationDefinition.builder())
        .preferredReportName(instance.preferredReportName())
        .normalCodedValueSet(instance.normalCodedValueSet())
        .text(instance.text())
        .criticalCodedValueSet(instance.criticalCodedValueSet())
        .multipleResultsAllowed(instance.multipleResultsAllowed())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .resourceType(instance.resourceType())
        .abnormalCodedValueSet(instance.abnormalCodedValueSet())
        .id(instance.id())
        .meta(instance.meta())
        .validCodedValueSet(instance.validCodedValueSet())
        .modifierExtension(instance.modifierExtension())
        .method(instance.method())
        .identifier(instance.identifier())
        .extension(instance.extension())
        .qualifiedInterval(instance.qualifiedInterval())
        .contained(instance.contained())
        .category(instance.category())
        .code(instance.code())
        .permittedDataType(instance.permittedDataType())
        .quantitativeDetails(instance.quantitativeDetails())
        .build();
  }

  /**
   * Creates a builder for {@link ObservationDefinition ObservationDefinition}.
   * <pre>
   * ImmutableObservationDefinition.builder()
   *    .preferredReportName(String) // optional {@link ObservationDefinition#preferredReportName() preferredReportName}
   *    .normalCodedValueSet(com.medplum.types.fhir.Reference) // optional {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ObservationDefinition#text() text}
   *    .criticalCodedValueSet(com.medplum.types.fhir.Reference) // optional {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet}
   *    .multipleResultsAllowed(Boolean) // optional {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ObservationDefinition#implicitRules() implicitRules}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ObservationDefinition#language() language}
   *    .resourceType(String) // required {@link ObservationDefinition#resourceType() resourceType}
   *    .abnormalCodedValueSet(com.medplum.types.fhir.Reference) // optional {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ObservationDefinition#id() id}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ObservationDefinition#meta() meta}
   *    .validCodedValueSet(com.medplum.types.fhir.Reference) // optional {@link ObservationDefinition#validCodedValueSet() validCodedValueSet}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ObservationDefinition#modifierExtension() modifierExtension}
   *    .method(com.medplum.types.fhir.CodeableConcept) // optional {@link ObservationDefinition#method() method}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ObservationDefinition#identifier() identifier}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ObservationDefinition#extension() extension}
   *    .qualifiedInterval(List&amp;lt;com.medplum.types.fhir.ObservationDefinition_QualifiedInterval&amp;gt;) // optional {@link ObservationDefinition#qualifiedInterval() qualifiedInterval}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ObservationDefinition#contained() contained}
   *    .category(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ObservationDefinition#category() category}
   *    .code(com.medplum.types.fhir.CodeableConcept) // required {@link ObservationDefinition#code() code}
   *    .permittedDataType(List&amp;lt;com.medplum.types.fhir.ObservationdefinitionPermitteddatatypeItem&amp;gt;) // optional {@link ObservationDefinition#permittedDataType() permittedDataType}
   *    .quantitativeDetails(com.medplum.types.fhir.ObservationDefinition_QuantitativeDetails) // optional {@link ObservationDefinition#quantitativeDetails() quantitativeDetails}
   *    .build();
   * </pre>
   * @return A new ObservationDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableObservationDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ObservationDefinition ObservationDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ObservationDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, CodeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_PREFERRED_REPORT_NAME = 0x1L;
    private static final long OPT_BIT_NORMAL_CODED_VALUE_SET = 0x2L;
    private static final long OPT_BIT_TEXT = 0x4L;
    private static final long OPT_BIT_CRITICAL_CODED_VALUE_SET = 0x8L;
    private static final long OPT_BIT_MULTIPLE_RESULTS_ALLOWED = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_LANGUAGE = 0x40L;
    private static final long OPT_BIT_ABNORMAL_CODED_VALUE_SET = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_META = 0x200L;
    private static final long OPT_BIT_VALID_CODED_VALUE_SET = 0x400L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800L;
    private static final long OPT_BIT_METHOD = 0x1000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private static final long OPT_BIT_QUALIFIED_INTERVAL = 0x8000L;
    private static final long OPT_BIT_CONTAINED = 0x10000L;
    private static final long OPT_BIT_CATEGORY = 0x20000L;
    private static final long OPT_BIT_PERMITTED_DATA_TYPE = 0x40000L;
    private static final long OPT_BIT_QUANTITATIVE_DETAILS = 0x80000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable String preferredReportName;
    private @Nullable Reference normalCodedValueSet;
    private @Nullable Narrative text;
    private @Nullable Reference criticalCodedValueSet;
    private @Nullable Boolean multipleResultsAllowed;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable String resourceType;
    private @Nullable Reference abnormalCodedValueSet;
    private @Nullable Id id;
    private @Nullable Meta meta;
    private @Nullable Reference validCodedValueSet;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept method;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Extension> extension;
    private @Nullable List<ObservationDefinition_QualifiedInterval> qualifiedInterval;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<CodeableConcept> category;
    private @Nullable CodeableConcept code;
    private @Nullable List<ObservationdefinitionPermitteddatatypeItem> permittedDataType;
    private @Nullable ObservationDefinition_QuantitativeDetails quantitativeDetails;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#preferredReportName() preferredReportName} to preferredReportName.
     * @param preferredReportName The value for preferredReportName
     * @return {@code this} builder for chained invocation
     */
    public final Builder preferredReportName(String preferredReportName) {
      checkNotIsSet(preferredReportNameIsSet(), "preferredReportName");
      this.preferredReportName = Objects.requireNonNull(preferredReportName, "preferredReportName");
      optBits |= OPT_BIT_PREFERRED_REPORT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#preferredReportName() preferredReportName} to preferredReportName.
     * @param preferredReportName The value for preferredReportName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preferredReportName")
    public final Builder preferredReportName(Optional<String> preferredReportName) {
      checkNotIsSet(preferredReportNameIsSet(), "preferredReportName");
      this.preferredReportName = preferredReportName.orElse(null);
      optBits |= OPT_BIT_PREFERRED_REPORT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet} to normalCodedValueSet.
     * @param normalCodedValueSet The value for normalCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder normalCodedValueSet(Reference normalCodedValueSet) {
      checkNotIsSet(normalCodedValueSetIsSet(), "normalCodedValueSet");
      this.normalCodedValueSet = Objects.requireNonNull(normalCodedValueSet, "normalCodedValueSet");
      optBits |= OPT_BIT_NORMAL_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet} to normalCodedValueSet.
     * @param normalCodedValueSet The value for normalCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("normalCodedValueSet")
    public final Builder normalCodedValueSet(Optional<? extends Reference> normalCodedValueSet) {
      checkNotIsSet(normalCodedValueSetIsSet(), "normalCodedValueSet");
      this.normalCodedValueSet = normalCodedValueSet.orElse(null);
      optBits |= OPT_BIT_NORMAL_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet} to criticalCodedValueSet.
     * @param criticalCodedValueSet The value for criticalCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder criticalCodedValueSet(Reference criticalCodedValueSet) {
      checkNotIsSet(criticalCodedValueSetIsSet(), "criticalCodedValueSet");
      this.criticalCodedValueSet = Objects.requireNonNull(criticalCodedValueSet, "criticalCodedValueSet");
      optBits |= OPT_BIT_CRITICAL_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet} to criticalCodedValueSet.
     * @param criticalCodedValueSet The value for criticalCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("criticalCodedValueSet")
    public final Builder criticalCodedValueSet(Optional<? extends Reference> criticalCodedValueSet) {
      checkNotIsSet(criticalCodedValueSetIsSet(), "criticalCodedValueSet");
      this.criticalCodedValueSet = criticalCodedValueSet.orElse(null);
      optBits |= OPT_BIT_CRITICAL_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed} to multipleResultsAllowed.
     * @param multipleResultsAllowed The value for multipleResultsAllowed
     * @return {@code this} builder for chained invocation
     */
    public final Builder multipleResultsAllowed(boolean multipleResultsAllowed) {
      checkNotIsSet(multipleResultsAllowedIsSet(), "multipleResultsAllowed");
      this.multipleResultsAllowed = multipleResultsAllowed;
      optBits |= OPT_BIT_MULTIPLE_RESULTS_ALLOWED;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed} to multipleResultsAllowed.
     * @param multipleResultsAllowed The value for multipleResultsAllowed
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("multipleResultsAllowed")
    public final Builder multipleResultsAllowed(Optional<Boolean> multipleResultsAllowed) {
      checkNotIsSet(multipleResultsAllowedIsSet(), "multipleResultsAllowed");
      this.multipleResultsAllowed = multipleResultsAllowed.orElse(null);
      optBits |= OPT_BIT_MULTIPLE_RESULTS_ALLOWED;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link ObservationDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet} to abnormalCodedValueSet.
     * @param abnormalCodedValueSet The value for abnormalCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder abnormalCodedValueSet(Reference abnormalCodedValueSet) {
      checkNotIsSet(abnormalCodedValueSetIsSet(), "abnormalCodedValueSet");
      this.abnormalCodedValueSet = Objects.requireNonNull(abnormalCodedValueSet, "abnormalCodedValueSet");
      optBits |= OPT_BIT_ABNORMAL_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet} to abnormalCodedValueSet.
     * @param abnormalCodedValueSet The value for abnormalCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("abnormalCodedValueSet")
    public final Builder abnormalCodedValueSet(Optional<? extends Reference> abnormalCodedValueSet) {
      checkNotIsSet(abnormalCodedValueSetIsSet(), "abnormalCodedValueSet");
      this.abnormalCodedValueSet = abnormalCodedValueSet.orElse(null);
      optBits |= OPT_BIT_ABNORMAL_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#validCodedValueSet() validCodedValueSet} to validCodedValueSet.
     * @param validCodedValueSet The value for validCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder validCodedValueSet(Reference validCodedValueSet) {
      checkNotIsSet(validCodedValueSetIsSet(), "validCodedValueSet");
      this.validCodedValueSet = Objects.requireNonNull(validCodedValueSet, "validCodedValueSet");
      optBits |= OPT_BIT_VALID_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#validCodedValueSet() validCodedValueSet} to validCodedValueSet.
     * @param validCodedValueSet The value for validCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validCodedValueSet")
    public final Builder validCodedValueSet(Optional<? extends Reference> validCodedValueSet) {
      checkNotIsSet(validCodedValueSetIsSet(), "validCodedValueSet");
      this.validCodedValueSet = validCodedValueSet.orElse(null);
      optBits |= OPT_BIT_VALID_CODED_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ObservationDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ObservationDefinition#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("method")
    public final Builder method(Optional<? extends CodeableConcept> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ObservationDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ObservationDefinition#qualifiedInterval() qualifiedInterval} to qualifiedInterval.
     * @param qualifiedInterval The value for qualifiedInterval
     * @return {@code this} builder for chained invocation
     */
    public final Builder qualifiedInterval(List<ObservationDefinition_QualifiedInterval> qualifiedInterval) {
      checkNotIsSet(qualifiedIntervalIsSet(), "qualifiedInterval");
      this.qualifiedInterval = Objects.requireNonNull(qualifiedInterval, "qualifiedInterval");
      optBits |= OPT_BIT_QUALIFIED_INTERVAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#qualifiedInterval() qualifiedInterval} to qualifiedInterval.
     * @param qualifiedInterval The value for qualifiedInterval
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("qualifiedInterval")
    public final Builder qualifiedInterval(Optional<? extends List<ObservationDefinition_QualifiedInterval>> qualifiedInterval) {
      checkNotIsSet(qualifiedIntervalIsSet(), "qualifiedInterval");
      this.qualifiedInterval = qualifiedInterval.orElse(null);
      optBits |= OPT_BIT_QUALIFIED_INTERVAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the value for the {@link ObservationDefinition#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#permittedDataType() permittedDataType} to permittedDataType.
     * @param permittedDataType The value for permittedDataType
     * @return {@code this} builder for chained invocation
     */
    public final Builder permittedDataType(List<ObservationdefinitionPermitteddatatypeItem> permittedDataType) {
      checkNotIsSet(permittedDataTypeIsSet(), "permittedDataType");
      this.permittedDataType = Objects.requireNonNull(permittedDataType, "permittedDataType");
      optBits |= OPT_BIT_PERMITTED_DATA_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#permittedDataType() permittedDataType} to permittedDataType.
     * @param permittedDataType The value for permittedDataType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("permittedDataType")
    public final Builder permittedDataType(Optional<? extends List<ObservationdefinitionPermitteddatatypeItem>> permittedDataType) {
      checkNotIsSet(permittedDataTypeIsSet(), "permittedDataType");
      this.permittedDataType = permittedDataType.orElse(null);
      optBits |= OPT_BIT_PERMITTED_DATA_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#quantitativeDetails() quantitativeDetails} to quantitativeDetails.
     * @param quantitativeDetails The value for quantitativeDetails
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantitativeDetails(ObservationDefinition_QuantitativeDetails quantitativeDetails) {
      checkNotIsSet(quantitativeDetailsIsSet(), "quantitativeDetails");
      this.quantitativeDetails = Objects.requireNonNull(quantitativeDetails, "quantitativeDetails");
      optBits |= OPT_BIT_QUANTITATIVE_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link ObservationDefinition#quantitativeDetails() quantitativeDetails} to quantitativeDetails.
     * @param quantitativeDetails The value for quantitativeDetails
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantitativeDetails")
    public final Builder quantitativeDetails(Optional<? extends ObservationDefinition_QuantitativeDetails> quantitativeDetails) {
      checkNotIsSet(quantitativeDetailsIsSet(), "quantitativeDetails");
      this.quantitativeDetails = quantitativeDetails.orElse(null);
      optBits |= OPT_BIT_QUANTITATIVE_DETAILS;
      return this;
    }

    /**
     * Builds a new {@link ObservationDefinition ObservationDefinition}.
     * @return An immutable instance of ObservationDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ObservationDefinition build() {
      checkRequiredAttributes();
      return new ImmutableObservationDefinition(
          preferredReportName,
          normalCodedValueSet,
          text,
          criticalCodedValueSet,
          multipleResultsAllowed,
          implicitRules,
          language,
          resourceType,
          abnormalCodedValueSet,
          id,
          meta,
          validCodedValueSet,
          modifierExtension,
          method,
          identifier,
          extension,
          qualifiedInterval,
          contained,
          category,
          code,
          permittedDataType,
          quantitativeDetails);
    }

    private boolean preferredReportNameIsSet() {
      return (optBits & OPT_BIT_PREFERRED_REPORT_NAME) != 0;
    }

    private boolean normalCodedValueSetIsSet() {
      return (optBits & OPT_BIT_NORMAL_CODED_VALUE_SET) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean criticalCodedValueSetIsSet() {
      return (optBits & OPT_BIT_CRITICAL_CODED_VALUE_SET) != 0;
    }

    private boolean multipleResultsAllowedIsSet() {
      return (optBits & OPT_BIT_MULTIPLE_RESULTS_ALLOWED) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean abnormalCodedValueSetIsSet() {
      return (optBits & OPT_BIT_ABNORMAL_CODED_VALUE_SET) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean validCodedValueSetIsSet() {
      return (optBits & OPT_BIT_VALID_CODED_VALUE_SET) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean qualifiedIntervalIsSet() {
      return (optBits & OPT_BIT_QUALIFIED_INTERVAL) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean permittedDataTypeIsSet() {
      return (optBits & OPT_BIT_PERMITTED_DATA_TYPE) != 0;
    }

    private boolean quantitativeDetailsIsSet() {
      return (optBits & OPT_BIT_QUANTITATIVE_DETAILS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ObservationDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!codeIsSet()) attributes.add("code");
      return "Cannot build ObservationDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ObservationDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ObservationDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    CodeBuildStage resourceType(String resourceType);
  }

  @Generated(from = "ObservationDefinition", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link ObservationDefinition#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(CodeableConcept code);
  }

  @Generated(from = "ObservationDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ObservationDefinition#preferredReportName() preferredReportName} to preferredReportName.
     * @param preferredReportName The value for preferredReportName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preferredReportName(String preferredReportName);

    /**
     * Initializes the optional value {@link ObservationDefinition#preferredReportName() preferredReportName} to preferredReportName.
     * @param preferredReportName The value for preferredReportName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preferredReportName(Optional<String> preferredReportName);

    /**
     * Initializes the optional value {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet} to normalCodedValueSet.
     * @param normalCodedValueSet The value for normalCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal normalCodedValueSet(Reference normalCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#normalCodedValueSet() normalCodedValueSet} to normalCodedValueSet.
     * @param normalCodedValueSet The value for normalCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal normalCodedValueSet(Optional<? extends Reference> normalCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ObservationDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet} to criticalCodedValueSet.
     * @param criticalCodedValueSet The value for criticalCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal criticalCodedValueSet(Reference criticalCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#criticalCodedValueSet() criticalCodedValueSet} to criticalCodedValueSet.
     * @param criticalCodedValueSet The value for criticalCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal criticalCodedValueSet(Optional<? extends Reference> criticalCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed} to multipleResultsAllowed.
     * @param multipleResultsAllowed The value for multipleResultsAllowed
     * @return {@code this} builder for chained invocation
     */
    BuildFinal multipleResultsAllowed(boolean multipleResultsAllowed);

    /**
     * Initializes the optional value {@link ObservationDefinition#multipleResultsAllowed() multipleResultsAllowed} to multipleResultsAllowed.
     * @param multipleResultsAllowed The value for multipleResultsAllowed
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal multipleResultsAllowed(Optional<Boolean> multipleResultsAllowed);

    /**
     * Initializes the optional value {@link ObservationDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ObservationDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ObservationDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ObservationDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet} to abnormalCodedValueSet.
     * @param abnormalCodedValueSet The value for abnormalCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal abnormalCodedValueSet(Reference abnormalCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#abnormalCodedValueSet() abnormalCodedValueSet} to abnormalCodedValueSet.
     * @param abnormalCodedValueSet The value for abnormalCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal abnormalCodedValueSet(Optional<? extends Reference> abnormalCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ObservationDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ObservationDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ObservationDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ObservationDefinition#validCodedValueSet() validCodedValueSet} to validCodedValueSet.
     * @param validCodedValueSet The value for validCodedValueSet
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validCodedValueSet(Reference validCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#validCodedValueSet() validCodedValueSet} to validCodedValueSet.
     * @param validCodedValueSet The value for validCodedValueSet
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validCodedValueSet(Optional<? extends Reference> validCodedValueSet);

    /**
     * Initializes the optional value {@link ObservationDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ObservationDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ObservationDefinition#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    BuildFinal method(CodeableConcept method);

    /**
     * Initializes the optional value {@link ObservationDefinition#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal method(Optional<? extends CodeableConcept> method);

    /**
     * Initializes the optional value {@link ObservationDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ObservationDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ObservationDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ObservationDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ObservationDefinition#qualifiedInterval() qualifiedInterval} to qualifiedInterval.
     * @param qualifiedInterval The value for qualifiedInterval
     * @return {@code this} builder for chained invocation
     */
    BuildFinal qualifiedInterval(List<ObservationDefinition_QualifiedInterval> qualifiedInterval);

    /**
     * Initializes the optional value {@link ObservationDefinition#qualifiedInterval() qualifiedInterval} to qualifiedInterval.
     * @param qualifiedInterval The value for qualifiedInterval
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal qualifiedInterval(Optional<? extends List<ObservationDefinition_QualifiedInterval>> qualifiedInterval);

    /**
     * Initializes the optional value {@link ObservationDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ObservationDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ObservationDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link ObservationDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link ObservationDefinition#permittedDataType() permittedDataType} to permittedDataType.
     * @param permittedDataType The value for permittedDataType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal permittedDataType(List<ObservationdefinitionPermitteddatatypeItem> permittedDataType);

    /**
     * Initializes the optional value {@link ObservationDefinition#permittedDataType() permittedDataType} to permittedDataType.
     * @param permittedDataType The value for permittedDataType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal permittedDataType(Optional<? extends List<ObservationdefinitionPermitteddatatypeItem>> permittedDataType);

    /**
     * Initializes the optional value {@link ObservationDefinition#quantitativeDetails() quantitativeDetails} to quantitativeDetails.
     * @param quantitativeDetails The value for quantitativeDetails
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantitativeDetails(ObservationDefinition_QuantitativeDetails quantitativeDetails);

    /**
     * Initializes the optional value {@link ObservationDefinition#quantitativeDetails() quantitativeDetails} to quantitativeDetails.
     * @param quantitativeDetails The value for quantitativeDetails
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantitativeDetails(Optional<? extends ObservationDefinition_QuantitativeDetails> quantitativeDetails);

    /**
     * Builds a new {@link ObservationDefinition ObservationDefinition}.
     * @return An immutable instance of ObservationDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ObservationDefinition build();
  }
}
