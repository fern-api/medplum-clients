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
 * Immutable implementation of {@link Parameters_Parameter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableParameters_Parameter.builder()}.
 */
@Generated(from = "Parameters_Parameter", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableParameters_Parameter implements Parameters_Parameter {
  private final @Nullable Attachment valueAttachment;
  private final @Nullable Ratio valueRatio;
  private final @Nullable Timing valueTiming;
  private final @Nullable String valueTime;
  private final @Nullable UsageContext valueUsageContext;
  private final @Nullable Boolean valueBoolean;
  private final @Nullable Period valuePeriod;
  private final @Nullable Expression valueExpression;
  private final @Nullable Coding valueCoding;
  private final @Nullable String valueId;
  private final @Nullable ContactPoint valueContactPoint;
  private final @Nullable String valueUri;
  private final @Nullable Range valueRange;
  private final @Nullable CodeableConcept valueCodeableConcept;
  private final @Nullable Duration valueDuration;
  private final @Nullable String valueDate;
  private final @Nullable Quantity valueQuantity;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Identifier valueIdentifier;
  private final @Nullable Distance valueDistance;
  private final @Nullable String valueInstant;
  private final @Nullable Count valueCount;
  private final @Nullable Annotation valueAnnotation;
  private final @Nullable Meta valueMeta;
  private final @Nullable String valueDateTime;
  private final @Nullable String valueUuid;
  private final @Nullable String valueCanonical;
  private final @Nullable Double valueInteger;
  private final @Nullable String valueUrl;
  private final @Nullable String valueCode;
  private final @Nullable SampledData valueSampledData;
  private final @Nullable Dosage valueDosage;
  private final @Nullable Signature valueSignature;
  private final @Nullable ParameterDefinition valueParameterDefinition;
  private final @Nullable DataRequirement valueDataRequirement;
  private final @Nullable TriggerDefinition valueTriggerDefinition;
  private final @Nullable Double valueUnsignedInt;
  private final @Nullable Double valueDecimal;
  private final @Nullable RelatedArtifact valueRelatedArtifact;
  private final @Nullable String name;
  private final @Nullable HumanName valueHumanName;
  private final @Nullable ResourceList resource;
  private final @Nullable Age valueAge;
  private final @Nullable Money valueMoney;
  private final @Nullable List<Parameters_Parameter> part;
  private final @Nullable String valueBase64Binary;
  private final @Nullable String valueOid;
  private final @Nullable String valueMarkdown;
  private final @Nullable Address valueAddress;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Contributor valueContributor;
  private final @Nullable String valueString;
  private final @Nullable Reference valueReference;
  private final @Nullable ContactDetail valueContactDetail;
  private final @Nullable Double valuePositiveInt;

  private ImmutableParameters_Parameter(
      @Nullable Attachment valueAttachment,
      @Nullable Ratio valueRatio,
      @Nullable Timing valueTiming,
      @Nullable String valueTime,
      @Nullable UsageContext valueUsageContext,
      @Nullable Boolean valueBoolean,
      @Nullable Period valuePeriod,
      @Nullable Expression valueExpression,
      @Nullable Coding valueCoding,
      @Nullable String valueId,
      @Nullable ContactPoint valueContactPoint,
      @Nullable String valueUri,
      @Nullable Range valueRange,
      @Nullable CodeableConcept valueCodeableConcept,
      @Nullable Duration valueDuration,
      @Nullable String valueDate,
      @Nullable Quantity valueQuantity,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Identifier valueIdentifier,
      @Nullable Distance valueDistance,
      @Nullable String valueInstant,
      @Nullable Count valueCount,
      @Nullable Annotation valueAnnotation,
      @Nullable Meta valueMeta,
      @Nullable String valueDateTime,
      @Nullable String valueUuid,
      @Nullable String valueCanonical,
      @Nullable Double valueInteger,
      @Nullable String valueUrl,
      @Nullable String valueCode,
      @Nullable SampledData valueSampledData,
      @Nullable Dosage valueDosage,
      @Nullable Signature valueSignature,
      @Nullable ParameterDefinition valueParameterDefinition,
      @Nullable DataRequirement valueDataRequirement,
      @Nullable TriggerDefinition valueTriggerDefinition,
      @Nullable Double valueUnsignedInt,
      @Nullable Double valueDecimal,
      @Nullable RelatedArtifact valueRelatedArtifact,
      @Nullable String name,
      @Nullable HumanName valueHumanName,
      @Nullable ResourceList resource,
      @Nullable Age valueAge,
      @Nullable Money valueMoney,
      @Nullable List<Parameters_Parameter> part,
      @Nullable String valueBase64Binary,
      @Nullable String valueOid,
      @Nullable String valueMarkdown,
      @Nullable Address valueAddress,
      @Nullable List<Extension> modifierExtension,
      @Nullable Contributor valueContributor,
      @Nullable String valueString,
      @Nullable Reference valueReference,
      @Nullable ContactDetail valueContactDetail,
      @Nullable Double valuePositiveInt) {
    this.valueAttachment = valueAttachment;
    this.valueRatio = valueRatio;
    this.valueTiming = valueTiming;
    this.valueTime = valueTime;
    this.valueUsageContext = valueUsageContext;
    this.valueBoolean = valueBoolean;
    this.valuePeriod = valuePeriod;
    this.valueExpression = valueExpression;
    this.valueCoding = valueCoding;
    this.valueId = valueId;
    this.valueContactPoint = valueContactPoint;
    this.valueUri = valueUri;
    this.valueRange = valueRange;
    this.valueCodeableConcept = valueCodeableConcept;
    this.valueDuration = valueDuration;
    this.valueDate = valueDate;
    this.valueQuantity = valueQuantity;
    this.id = id;
    this.extension = extension;
    this.valueIdentifier = valueIdentifier;
    this.valueDistance = valueDistance;
    this.valueInstant = valueInstant;
    this.valueCount = valueCount;
    this.valueAnnotation = valueAnnotation;
    this.valueMeta = valueMeta;
    this.valueDateTime = valueDateTime;
    this.valueUuid = valueUuid;
    this.valueCanonical = valueCanonical;
    this.valueInteger = valueInteger;
    this.valueUrl = valueUrl;
    this.valueCode = valueCode;
    this.valueSampledData = valueSampledData;
    this.valueDosage = valueDosage;
    this.valueSignature = valueSignature;
    this.valueParameterDefinition = valueParameterDefinition;
    this.valueDataRequirement = valueDataRequirement;
    this.valueTriggerDefinition = valueTriggerDefinition;
    this.valueUnsignedInt = valueUnsignedInt;
    this.valueDecimal = valueDecimal;
    this.valueRelatedArtifact = valueRelatedArtifact;
    this.name = name;
    this.valueHumanName = valueHumanName;
    this.resource = resource;
    this.valueAge = valueAge;
    this.valueMoney = valueMoney;
    this.part = part;
    this.valueBase64Binary = valueBase64Binary;
    this.valueOid = valueOid;
    this.valueMarkdown = valueMarkdown;
    this.valueAddress = valueAddress;
    this.modifierExtension = modifierExtension;
    this.valueContributor = valueContributor;
    this.valueString = valueString;
    this.valueReference = valueReference;
    this.valueContactDetail = valueContactDetail;
    this.valuePositiveInt = valuePositiveInt;
  }

  /**
   * @return The value of the {@code valueAttachment} attribute
   */
  @JsonProperty("valueAttachment")
  @Override
  public Optional<Attachment> valueAttachment() {
    return Optional.ofNullable(valueAttachment);
  }

  /**
   * @return The value of the {@code valueRatio} attribute
   */
  @JsonProperty("valueRatio")
  @Override
  public Optional<Ratio> valueRatio() {
    return Optional.ofNullable(valueRatio);
  }

  /**
   * @return The value of the {@code valueTiming} attribute
   */
  @JsonProperty("valueTiming")
  @Override
  public Optional<Timing> valueTiming() {
    return Optional.ofNullable(valueTiming);
  }

  /**
   * @return The value of the {@code valueTime} attribute
   */
  @JsonProperty("valueTime")
  @Override
  public Optional<String> valueTime() {
    return Optional.ofNullable(valueTime);
  }

  /**
   * @return The value of the {@code valueUsageContext} attribute
   */
  @JsonProperty("valueUsageContext")
  @Override
  public Optional<UsageContext> valueUsageContext() {
    return Optional.ofNullable(valueUsageContext);
  }

  /**
   * @return The value of the {@code valueBoolean} attribute
   */
  @JsonProperty("valueBoolean")
  @Override
  public Optional<Boolean> valueBoolean() {
    return Optional.ofNullable(valueBoolean);
  }

  /**
   * @return The value of the {@code valuePeriod} attribute
   */
  @JsonProperty("valuePeriod")
  @Override
  public Optional<Period> valuePeriod() {
    return Optional.ofNullable(valuePeriod);
  }

  /**
   * @return The value of the {@code valueExpression} attribute
   */
  @JsonProperty("valueExpression")
  @Override
  public Optional<Expression> valueExpression() {
    return Optional.ofNullable(valueExpression);
  }

  /**
   * @return The value of the {@code valueCoding} attribute
   */
  @JsonProperty("valueCoding")
  @Override
  public Optional<Coding> valueCoding() {
    return Optional.ofNullable(valueCoding);
  }

  /**
   * @return The value of the {@code valueId} attribute
   */
  @JsonProperty("valueId")
  @Override
  public Optional<String> valueId() {
    return Optional.ofNullable(valueId);
  }

  /**
   * @return The value of the {@code valueContactPoint} attribute
   */
  @JsonProperty("valueContactPoint")
  @Override
  public Optional<ContactPoint> valueContactPoint() {
    return Optional.ofNullable(valueContactPoint);
  }

  /**
   * @return The value of the {@code valueUri} attribute
   */
  @JsonProperty("valueUri")
  @Override
  public Optional<String> valueUri() {
    return Optional.ofNullable(valueUri);
  }

  /**
   * @return The value of the {@code valueRange} attribute
   */
  @JsonProperty("valueRange")
  @Override
  public Optional<Range> valueRange() {
    return Optional.ofNullable(valueRange);
  }

  /**
   * @return The value of the {@code valueCodeableConcept} attribute
   */
  @JsonProperty("valueCodeableConcept")
  @Override
  public Optional<CodeableConcept> valueCodeableConcept() {
    return Optional.ofNullable(valueCodeableConcept);
  }

  /**
   * @return The value of the {@code valueDuration} attribute
   */
  @JsonProperty("valueDuration")
  @Override
  public Optional<Duration> valueDuration() {
    return Optional.ofNullable(valueDuration);
  }

  /**
   * @return The value of the {@code valueDate} attribute
   */
  @JsonProperty("valueDate")
  @Override
  public Optional<String> valueDate() {
    return Optional.ofNullable(valueDate);
  }

  /**
   * @return The value of the {@code valueQuantity} attribute
   */
  @JsonProperty("valueQuantity")
  @Override
  public Optional<Quantity> valueQuantity() {
    return Optional.ofNullable(valueQuantity);
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
   * @return The value of the {@code valueIdentifier} attribute
   */
  @JsonProperty("valueIdentifier")
  @Override
  public Optional<Identifier> valueIdentifier() {
    return Optional.ofNullable(valueIdentifier);
  }

  /**
   * @return The value of the {@code valueDistance} attribute
   */
  @JsonProperty("valueDistance")
  @Override
  public Optional<Distance> valueDistance() {
    return Optional.ofNullable(valueDistance);
  }

  /**
   * @return The value of the {@code valueInstant} attribute
   */
  @JsonProperty("valueInstant")
  @Override
  public Optional<String> valueInstant() {
    return Optional.ofNullable(valueInstant);
  }

  /**
   * @return The value of the {@code valueCount} attribute
   */
  @JsonProperty("valueCount")
  @Override
  public Optional<Count> valueCount() {
    return Optional.ofNullable(valueCount);
  }

  /**
   * @return The value of the {@code valueAnnotation} attribute
   */
  @JsonProperty("valueAnnotation")
  @Override
  public Optional<Annotation> valueAnnotation() {
    return Optional.ofNullable(valueAnnotation);
  }

  /**
   * @return The value of the {@code valueMeta} attribute
   */
  @JsonProperty("valueMeta")
  @Override
  public Optional<Meta> valueMeta() {
    return Optional.ofNullable(valueMeta);
  }

  /**
   * @return The value of the {@code valueDateTime} attribute
   */
  @JsonProperty("valueDateTime")
  @Override
  public Optional<String> valueDateTime() {
    return Optional.ofNullable(valueDateTime);
  }

  /**
   * @return The value of the {@code valueUuid} attribute
   */
  @JsonProperty("valueUuid")
  @Override
  public Optional<String> valueUuid() {
    return Optional.ofNullable(valueUuid);
  }

  /**
   * @return The value of the {@code valueCanonical} attribute
   */
  @JsonProperty("valueCanonical")
  @Override
  public Optional<String> valueCanonical() {
    return Optional.ofNullable(valueCanonical);
  }

  /**
   * @return The value of the {@code valueInteger} attribute
   */
  @JsonProperty("valueInteger")
  @Override
  public Optional<Double> valueInteger() {
    return Optional.ofNullable(valueInteger);
  }

  /**
   * @return The value of the {@code valueUrl} attribute
   */
  @JsonProperty("valueUrl")
  @Override
  public Optional<String> valueUrl() {
    return Optional.ofNullable(valueUrl);
  }

  /**
   * @return The value of the {@code valueCode} attribute
   */
  @JsonProperty("valueCode")
  @Override
  public Optional<String> valueCode() {
    return Optional.ofNullable(valueCode);
  }

  /**
   * @return The value of the {@code valueSampledData} attribute
   */
  @JsonProperty("valueSampledData")
  @Override
  public Optional<SampledData> valueSampledData() {
    return Optional.ofNullable(valueSampledData);
  }

  /**
   * @return The value of the {@code valueDosage} attribute
   */
  @JsonProperty("valueDosage")
  @Override
  public Optional<Dosage> valueDosage() {
    return Optional.ofNullable(valueDosage);
  }

  /**
   * @return The value of the {@code valueSignature} attribute
   */
  @JsonProperty("valueSignature")
  @Override
  public Optional<Signature> valueSignature() {
    return Optional.ofNullable(valueSignature);
  }

  /**
   * @return The value of the {@code valueParameterDefinition} attribute
   */
  @JsonProperty("valueParameterDefinition")
  @Override
  public Optional<ParameterDefinition> valueParameterDefinition() {
    return Optional.ofNullable(valueParameterDefinition);
  }

  /**
   * @return The value of the {@code valueDataRequirement} attribute
   */
  @JsonProperty("valueDataRequirement")
  @Override
  public Optional<DataRequirement> valueDataRequirement() {
    return Optional.ofNullable(valueDataRequirement);
  }

  /**
   * @return The value of the {@code valueTriggerDefinition} attribute
   */
  @JsonProperty("valueTriggerDefinition")
  @Override
  public Optional<TriggerDefinition> valueTriggerDefinition() {
    return Optional.ofNullable(valueTriggerDefinition);
  }

  /**
   * @return The value of the {@code valueUnsignedInt} attribute
   */
  @JsonProperty("valueUnsignedInt")
  @Override
  public Optional<Double> valueUnsignedInt() {
    return Optional.ofNullable(valueUnsignedInt);
  }

  /**
   * @return The value of the {@code valueDecimal} attribute
   */
  @JsonProperty("valueDecimal")
  @Override
  public Optional<Double> valueDecimal() {
    return Optional.ofNullable(valueDecimal);
  }

  /**
   * @return The value of the {@code valueRelatedArtifact} attribute
   */
  @JsonProperty("valueRelatedArtifact")
  @Override
  public Optional<RelatedArtifact> valueRelatedArtifact() {
    return Optional.ofNullable(valueRelatedArtifact);
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
   * @return The value of the {@code valueHumanName} attribute
   */
  @JsonProperty("valueHumanName")
  @Override
  public Optional<HumanName> valueHumanName() {
    return Optional.ofNullable(valueHumanName);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<ResourceList> resource() {
    return Optional.ofNullable(resource);
  }

  /**
   * @return The value of the {@code valueAge} attribute
   */
  @JsonProperty("valueAge")
  @Override
  public Optional<Age> valueAge() {
    return Optional.ofNullable(valueAge);
  }

  /**
   * @return The value of the {@code valueMoney} attribute
   */
  @JsonProperty("valueMoney")
  @Override
  public Optional<Money> valueMoney() {
    return Optional.ofNullable(valueMoney);
  }

  /**
   * @return The value of the {@code part} attribute
   */
  @JsonProperty("part")
  @Override
  public Optional<List<Parameters_Parameter>> part() {
    return Optional.ofNullable(part);
  }

  /**
   * @return The value of the {@code valueBase64Binary} attribute
   */
  @JsonProperty("valueBase64Binary")
  @Override
  public Optional<String> valueBase64Binary() {
    return Optional.ofNullable(valueBase64Binary);
  }

  /**
   * @return The value of the {@code valueOid} attribute
   */
  @JsonProperty("valueOid")
  @Override
  public Optional<String> valueOid() {
    return Optional.ofNullable(valueOid);
  }

  /**
   * @return The value of the {@code valueMarkdown} attribute
   */
  @JsonProperty("valueMarkdown")
  @Override
  public Optional<String> valueMarkdown() {
    return Optional.ofNullable(valueMarkdown);
  }

  /**
   * @return The value of the {@code valueAddress} attribute
   */
  @JsonProperty("valueAddress")
  @Override
  public Optional<Address> valueAddress() {
    return Optional.ofNullable(valueAddress);
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
   * @return The value of the {@code valueContributor} attribute
   */
  @JsonProperty("valueContributor")
  @Override
  public Optional<Contributor> valueContributor() {
    return Optional.ofNullable(valueContributor);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
  }

  /**
   * @return The value of the {@code valueReference} attribute
   */
  @JsonProperty("valueReference")
  @Override
  public Optional<Reference> valueReference() {
    return Optional.ofNullable(valueReference);
  }

  /**
   * @return The value of the {@code valueContactDetail} attribute
   */
  @JsonProperty("valueContactDetail")
  @Override
  public Optional<ContactDetail> valueContactDetail() {
    return Optional.ofNullable(valueContactDetail);
  }

  /**
   * @return The value of the {@code valuePositiveInt} attribute
   */
  @JsonProperty("valuePositiveInt")
  @Override
  public Optional<Double> valuePositiveInt() {
    return Optional.ofNullable(valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueAttachment() valueAttachment} attribute.
   * @param value The value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "valueAttachment");
    if (this.valueAttachment == newValue) return this;
    return new ImmutableParameters_Parameter(
        newValue,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueAttachment() valueAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.valueAttachment == value) return this;
    return new ImmutableParameters_Parameter(
        value,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueRatio() valueRatio} attribute.
   * @param value The value for valueRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueRatio(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "valueRatio");
    if (this.valueRatio == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        newValue,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueRatio() valueRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueRatio(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.valueRatio == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        value,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueTiming() valueTiming} attribute.
   * @param value The value for valueTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "valueTiming");
    if (this.valueTiming == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        newValue,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueTiming() valueTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.valueTiming == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        value,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueTime() valueTime} attribute.
   * @param value The value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueTime");
    if (Objects.equals(this.valueTime, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        newValue,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueTime() valueTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueTime, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        value,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueUsageContext() valueUsageContext} attribute.
   * @param value The value for valueUsageContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueUsageContext(UsageContext value) {
    @Nullable UsageContext newValue = Objects.requireNonNull(value, "valueUsageContext");
    if (this.valueUsageContext == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        newValue,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueUsageContext() valueUsageContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUsageContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueUsageContext(Optional<? extends UsageContext> optional) {
    @Nullable UsageContext value = optional.orElse(null);
    if (this.valueUsageContext == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        value,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        newValue,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        value,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valuePeriod() valuePeriod} attribute.
   * @param value The value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValuePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "valuePeriod");
    if (this.valuePeriod == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        newValue,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valuePeriod() valuePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValuePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.valuePeriod == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        value,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueExpression() valueExpression} attribute.
   * @param value The value for valueExpression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueExpression(Expression value) {
    @Nullable Expression newValue = Objects.requireNonNull(value, "valueExpression");
    if (this.valueExpression == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        newValue,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueExpression() valueExpression} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueExpression
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueExpression(Optional<? extends Expression> optional) {
    @Nullable Expression value = optional.orElse(null);
    if (this.valueExpression == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        value,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueCoding() valueCoding} attribute.
   * @param value The value for valueCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueCoding(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "valueCoding");
    if (this.valueCoding == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        newValue,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueCoding() valueCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueCoding(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.valueCoding == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        value,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueId() valueId} attribute.
   * @param value The value for valueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueId");
    if (Objects.equals(this.valueId, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        newValue,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueId() valueId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueId, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        value,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueContactPoint() valueContactPoint} attribute.
   * @param value The value for valueContactPoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueContactPoint(ContactPoint value) {
    @Nullable ContactPoint newValue = Objects.requireNonNull(value, "valueContactPoint");
    if (this.valueContactPoint == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        newValue,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueContactPoint() valueContactPoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueContactPoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueContactPoint(Optional<? extends ContactPoint> optional) {
    @Nullable ContactPoint value = optional.orElse(null);
    if (this.valueContactPoint == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        value,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueUri() valueUri} attribute.
   * @param value The value for valueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueUri");
    if (Objects.equals(this.valueUri, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        newValue,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueUri() valueUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueUri, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        value,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueRange() valueRange} attribute.
   * @param value The value for valueRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "valueRange");
    if (this.valueRange == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        newValue,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueRange() valueRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.valueRange == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        value,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueCodeableConcept() valueCodeableConcept} attribute.
   * @param value The value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "valueCodeableConcept");
    if (this.valueCodeableConcept == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        newValue,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueCodeableConcept() valueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.valueCodeableConcept == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        value,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueDuration() valueDuration} attribute.
   * @param value The value for valueDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "valueDuration");
    if (this.valueDuration == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        newValue,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueDuration() valueDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.valueDuration == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        value,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueDate() valueDate} attribute.
   * @param value The value for valueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDate");
    if (Objects.equals(this.valueDate, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        newValue,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueDate() valueDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDate, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        value,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        newValue,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        value,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        newValue,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        value,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        newValue,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        value,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueIdentifier() valueIdentifier} attribute.
   * @param value The value for valueIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "valueIdentifier");
    if (this.valueIdentifier == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        newValue,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueIdentifier() valueIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.valueIdentifier == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        value,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueDistance() valueDistance} attribute.
   * @param value The value for valueDistance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueDistance(Distance value) {
    @Nullable Distance newValue = Objects.requireNonNull(value, "valueDistance");
    if (this.valueDistance == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        newValue,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueDistance() valueDistance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDistance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueDistance(Optional<? extends Distance> optional) {
    @Nullable Distance value = optional.orElse(null);
    if (this.valueDistance == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        value,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueInstant() valueInstant} attribute.
   * @param value The value for valueInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueInstant(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueInstant");
    if (Objects.equals(this.valueInstant, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        newValue,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueInstant() valueInstant} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueInstant(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueInstant, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        value,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueCount() valueCount} attribute.
   * @param value The value for valueCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueCount(Count value) {
    @Nullable Count newValue = Objects.requireNonNull(value, "valueCount");
    if (this.valueCount == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        newValue,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueCount() valueCount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueCount(Optional<? extends Count> optional) {
    @Nullable Count value = optional.orElse(null);
    if (this.valueCount == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        value,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueAnnotation() valueAnnotation} attribute.
   * @param value The value for valueAnnotation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueAnnotation(Annotation value) {
    @Nullable Annotation newValue = Objects.requireNonNull(value, "valueAnnotation");
    if (this.valueAnnotation == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        newValue,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueAnnotation() valueAnnotation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAnnotation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueAnnotation(Optional<? extends Annotation> optional) {
    @Nullable Annotation value = optional.orElse(null);
    if (this.valueAnnotation == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        value,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueMeta() valueMeta} attribute.
   * @param value The value for valueMeta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "valueMeta");
    if (this.valueMeta == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        newValue,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueMeta() valueMeta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMeta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.valueMeta == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        value,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueDateTime() valueDateTime} attribute.
   * @param value The value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDateTime");
    if (Objects.equals(this.valueDateTime, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        newValue,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueDateTime() valueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDateTime, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        value,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueUuid() valueUuid} attribute.
   * @param value The value for valueUuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueUuid(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueUuid");
    if (Objects.equals(this.valueUuid, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        newValue,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueUuid() valueUuid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueUuid(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueUuid, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        value,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueCanonical() valueCanonical} attribute.
   * @param value The value for valueCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueCanonical(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueCanonical");
    if (Objects.equals(this.valueCanonical, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        newValue,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueCanonical() valueCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueCanonical(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueCanonical, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        value,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        newValue,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        value,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueUrl() valueUrl} attribute.
   * @param value The value for valueUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueUrl(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueUrl");
    if (Objects.equals(this.valueUrl, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        newValue,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueUrl() valueUrl} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueUrl(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueUrl, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        value,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueCode() valueCode} attribute.
   * @param value The value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueCode(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueCode");
    if (Objects.equals(this.valueCode, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        newValue,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueCode() valueCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueCode(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueCode, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        value,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueSampledData() valueSampledData} attribute.
   * @param value The value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueSampledData(SampledData value) {
    @Nullable SampledData newValue = Objects.requireNonNull(value, "valueSampledData");
    if (this.valueSampledData == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        newValue,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueSampledData() valueSampledData} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueSampledData(Optional<? extends SampledData> optional) {
    @Nullable SampledData value = optional.orElse(null);
    if (this.valueSampledData == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        value,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueDosage() valueDosage} attribute.
   * @param value The value for valueDosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueDosage(Dosage value) {
    @Nullable Dosage newValue = Objects.requireNonNull(value, "valueDosage");
    if (this.valueDosage == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        newValue,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueDosage() valueDosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueDosage(Optional<? extends Dosage> optional) {
    @Nullable Dosage value = optional.orElse(null);
    if (this.valueDosage == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        value,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueSignature() valueSignature} attribute.
   * @param value The value for valueSignature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueSignature(Signature value) {
    @Nullable Signature newValue = Objects.requireNonNull(value, "valueSignature");
    if (this.valueSignature == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        newValue,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueSignature() valueSignature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSignature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueSignature(Optional<? extends Signature> optional) {
    @Nullable Signature value = optional.orElse(null);
    if (this.valueSignature == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        value,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueParameterDefinition() valueParameterDefinition} attribute.
   * @param value The value for valueParameterDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueParameterDefinition(ParameterDefinition value) {
    @Nullable ParameterDefinition newValue = Objects.requireNonNull(value, "valueParameterDefinition");
    if (this.valueParameterDefinition == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        newValue,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueParameterDefinition() valueParameterDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueParameterDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueParameterDefinition(Optional<? extends ParameterDefinition> optional) {
    @Nullable ParameterDefinition value = optional.orElse(null);
    if (this.valueParameterDefinition == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        value,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueDataRequirement() valueDataRequirement} attribute.
   * @param value The value for valueDataRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueDataRequirement(DataRequirement value) {
    @Nullable DataRequirement newValue = Objects.requireNonNull(value, "valueDataRequirement");
    if (this.valueDataRequirement == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        newValue,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueDataRequirement() valueDataRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDataRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueDataRequirement(Optional<? extends DataRequirement> optional) {
    @Nullable DataRequirement value = optional.orElse(null);
    if (this.valueDataRequirement == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        value,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueTriggerDefinition() valueTriggerDefinition} attribute.
   * @param value The value for valueTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueTriggerDefinition(TriggerDefinition value) {
    @Nullable TriggerDefinition newValue = Objects.requireNonNull(value, "valueTriggerDefinition");
    if (this.valueTriggerDefinition == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        newValue,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueTriggerDefinition() valueTriggerDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueTriggerDefinition(Optional<? extends TriggerDefinition> optional) {
    @Nullable TriggerDefinition value = optional.orElse(null);
    if (this.valueTriggerDefinition == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        value,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueUnsignedInt() valueUnsignedInt} attribute.
   * @param value The value for valueUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueUnsignedInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueUnsignedInt, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        newValue,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueUnsignedInt() valueUnsignedInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueUnsignedInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueUnsignedInt, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        value,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueDecimal() valueDecimal} attribute.
   * @param value The value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueDecimal(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueDecimal, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        newValue,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueDecimal() valueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueDecimal(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueDecimal, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        value,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueRelatedArtifact() valueRelatedArtifact} attribute.
   * @param value The value for valueRelatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueRelatedArtifact(RelatedArtifact value) {
    @Nullable RelatedArtifact newValue = Objects.requireNonNull(value, "valueRelatedArtifact");
    if (this.valueRelatedArtifact == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        newValue,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueRelatedArtifact() valueRelatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRelatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueRelatedArtifact(Optional<? extends RelatedArtifact> optional) {
    @Nullable RelatedArtifact value = optional.orElse(null);
    if (this.valueRelatedArtifact == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        value,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        newValue,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        value,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueHumanName() valueHumanName} attribute.
   * @param value The value for valueHumanName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueHumanName(HumanName value) {
    @Nullable HumanName newValue = Objects.requireNonNull(value, "valueHumanName");
    if (this.valueHumanName == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        newValue,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueHumanName() valueHumanName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueHumanName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueHumanName(Optional<? extends HumanName> optional) {
    @Nullable HumanName value = optional.orElse(null);
    if (this.valueHumanName == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        value,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withResource(ResourceList value) {
    @Nullable ResourceList newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        newValue,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withResource(Optional<? extends ResourceList> optional) {
    @Nullable ResourceList value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        value,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueAge() valueAge} attribute.
   * @param value The value for valueAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "valueAge");
    if (this.valueAge == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        newValue,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueAge() valueAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.valueAge == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        value,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueMoney() valueMoney} attribute.
   * @param value The value for valueMoney
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueMoney(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "valueMoney");
    if (this.valueMoney == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        newValue,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueMoney() valueMoney} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMoney
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueMoney(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.valueMoney == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        value,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#part() part} attribute.
   * @param value The value for part
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withPart(List<Parameters_Parameter> value) {
    @Nullable List<Parameters_Parameter> newValue = Objects.requireNonNull(value, "part");
    if (this.part == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        newValue,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#part() part} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for part
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withPart(Optional<? extends List<Parameters_Parameter>> optional) {
    @Nullable List<Parameters_Parameter> value = optional.orElse(null);
    if (this.part == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        value,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueBase64Binary() valueBase64Binary} attribute.
   * @param value The value for valueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueBase64Binary(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueBase64Binary");
    if (Objects.equals(this.valueBase64Binary, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        newValue,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueBase64Binary() valueBase64Binary} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueBase64Binary(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueBase64Binary, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        value,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueOid() valueOid} attribute.
   * @param value The value for valueOid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueOid(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueOid");
    if (Objects.equals(this.valueOid, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        newValue,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueOid() valueOid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueOid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueOid(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueOid, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        value,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueMarkdown() valueMarkdown} attribute.
   * @param value The value for valueMarkdown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueMarkdown(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueMarkdown");
    if (Objects.equals(this.valueMarkdown, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        newValue,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueMarkdown() valueMarkdown} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMarkdown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueMarkdown(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueMarkdown, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        value,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueAddress() valueAddress} attribute.
   * @param value The value for valueAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueAddress(Address value) {
    @Nullable Address newValue = Objects.requireNonNull(value, "valueAddress");
    if (this.valueAddress == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        newValue,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueAddress() valueAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueAddress(Optional<? extends Address> optional) {
    @Nullable Address value = optional.orElse(null);
    if (this.valueAddress == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        value,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        newValue,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        value,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueContributor() valueContributor} attribute.
   * @param value The value for valueContributor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueContributor(Contributor value) {
    @Nullable Contributor newValue = Objects.requireNonNull(value, "valueContributor");
    if (this.valueContributor == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        newValue,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueContributor() valueContributor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueContributor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueContributor(Optional<? extends Contributor> optional) {
    @Nullable Contributor value = optional.orElse(null);
    if (this.valueContributor == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        value,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        newValue,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        value,
        this.valueReference,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueReference() valueReference} attribute.
   * @param value The value for valueReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "valueReference");
    if (this.valueReference == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        newValue,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueReference() valueReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.valueReference == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        value,
        this.valueContactDetail,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valueContactDetail() valueContactDetail} attribute.
   * @param value The value for valueContactDetail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValueContactDetail(ContactDetail value) {
    @Nullable ContactDetail newValue = Objects.requireNonNull(value, "valueContactDetail");
    if (this.valueContactDetail == newValue) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        newValue,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valueContactDetail() valueContactDetail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueContactDetail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableParameters_Parameter withValueContactDetail(Optional<? extends ContactDetail> optional) {
    @Nullable ContactDetail value = optional.orElse(null);
    if (this.valueContactDetail == value) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        value,
        this.valuePositiveInt);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Parameters_Parameter#valuePositiveInt() valuePositiveInt} attribute.
   * @param value The value for valuePositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValuePositiveInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valuePositiveInt, newValue)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Parameters_Parameter#valuePositiveInt() valuePositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuePositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableParameters_Parameter withValuePositiveInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valuePositiveInt, value)) return this;
    return new ImmutableParameters_Parameter(
        this.valueAttachment,
        this.valueRatio,
        this.valueTiming,
        this.valueTime,
        this.valueUsageContext,
        this.valueBoolean,
        this.valuePeriod,
        this.valueExpression,
        this.valueCoding,
        this.valueId,
        this.valueContactPoint,
        this.valueUri,
        this.valueRange,
        this.valueCodeableConcept,
        this.valueDuration,
        this.valueDate,
        this.valueQuantity,
        this.id,
        this.extension,
        this.valueIdentifier,
        this.valueDistance,
        this.valueInstant,
        this.valueCount,
        this.valueAnnotation,
        this.valueMeta,
        this.valueDateTime,
        this.valueUuid,
        this.valueCanonical,
        this.valueInteger,
        this.valueUrl,
        this.valueCode,
        this.valueSampledData,
        this.valueDosage,
        this.valueSignature,
        this.valueParameterDefinition,
        this.valueDataRequirement,
        this.valueTriggerDefinition,
        this.valueUnsignedInt,
        this.valueDecimal,
        this.valueRelatedArtifact,
        this.name,
        this.valueHumanName,
        this.resource,
        this.valueAge,
        this.valueMoney,
        this.part,
        this.valueBase64Binary,
        this.valueOid,
        this.valueMarkdown,
        this.valueAddress,
        this.modifierExtension,
        this.valueContributor,
        this.valueString,
        this.valueReference,
        this.valueContactDetail,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableParameters_Parameter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableParameters_Parameter
        && equalTo((ImmutableParameters_Parameter) another);
  }

  private boolean equalTo(ImmutableParameters_Parameter another) {
    return Objects.equals(valueAttachment, another.valueAttachment)
        && Objects.equals(valueRatio, another.valueRatio)
        && Objects.equals(valueTiming, another.valueTiming)
        && Objects.equals(valueTime, another.valueTime)
        && Objects.equals(valueUsageContext, another.valueUsageContext)
        && Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(valuePeriod, another.valuePeriod)
        && Objects.equals(valueExpression, another.valueExpression)
        && Objects.equals(valueCoding, another.valueCoding)
        && Objects.equals(valueId, another.valueId)
        && Objects.equals(valueContactPoint, another.valueContactPoint)
        && Objects.equals(valueUri, another.valueUri)
        && Objects.equals(valueRange, another.valueRange)
        && Objects.equals(valueCodeableConcept, another.valueCodeableConcept)
        && Objects.equals(valueDuration, another.valueDuration)
        && Objects.equals(valueDate, another.valueDate)
        && Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(valueIdentifier, another.valueIdentifier)
        && Objects.equals(valueDistance, another.valueDistance)
        && Objects.equals(valueInstant, another.valueInstant)
        && Objects.equals(valueCount, another.valueCount)
        && Objects.equals(valueAnnotation, another.valueAnnotation)
        && Objects.equals(valueMeta, another.valueMeta)
        && Objects.equals(valueDateTime, another.valueDateTime)
        && Objects.equals(valueUuid, another.valueUuid)
        && Objects.equals(valueCanonical, another.valueCanonical)
        && Objects.equals(valueInteger, another.valueInteger)
        && Objects.equals(valueUrl, another.valueUrl)
        && Objects.equals(valueCode, another.valueCode)
        && Objects.equals(valueSampledData, another.valueSampledData)
        && Objects.equals(valueDosage, another.valueDosage)
        && Objects.equals(valueSignature, another.valueSignature)
        && Objects.equals(valueParameterDefinition, another.valueParameterDefinition)
        && Objects.equals(valueDataRequirement, another.valueDataRequirement)
        && Objects.equals(valueTriggerDefinition, another.valueTriggerDefinition)
        && Objects.equals(valueUnsignedInt, another.valueUnsignedInt)
        && Objects.equals(valueDecimal, another.valueDecimal)
        && Objects.equals(valueRelatedArtifact, another.valueRelatedArtifact)
        && Objects.equals(name, another.name)
        && Objects.equals(valueHumanName, another.valueHumanName)
        && Objects.equals(resource, another.resource)
        && Objects.equals(valueAge, another.valueAge)
        && Objects.equals(valueMoney, another.valueMoney)
        && Objects.equals(part, another.part)
        && Objects.equals(valueBase64Binary, another.valueBase64Binary)
        && Objects.equals(valueOid, another.valueOid)
        && Objects.equals(valueMarkdown, another.valueMarkdown)
        && Objects.equals(valueAddress, another.valueAddress)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(valueContributor, another.valueContributor)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(valueReference, another.valueReference)
        && Objects.equals(valueContactDetail, another.valueContactDetail)
        && Objects.equals(valuePositiveInt, another.valuePositiveInt);
  }

  /**
   * Computes a hash code from attributes: {@code valueAttachment}, {@code valueRatio}, {@code valueTiming}, {@code valueTime}, {@code valueUsageContext}, {@code valueBoolean}, {@code valuePeriod}, {@code valueExpression}, {@code valueCoding}, {@code valueId}, {@code valueContactPoint}, {@code valueUri}, {@code valueRange}, {@code valueCodeableConcept}, {@code valueDuration}, {@code valueDate}, {@code valueQuantity}, {@code id}, {@code extension}, {@code valueIdentifier}, {@code valueDistance}, {@code valueInstant}, {@code valueCount}, {@code valueAnnotation}, {@code valueMeta}, {@code valueDateTime}, {@code valueUuid}, {@code valueCanonical}, {@code valueInteger}, {@code valueUrl}, {@code valueCode}, {@code valueSampledData}, {@code valueDosage}, {@code valueSignature}, {@code valueParameterDefinition}, {@code valueDataRequirement}, {@code valueTriggerDefinition}, {@code valueUnsignedInt}, {@code valueDecimal}, {@code valueRelatedArtifact}, {@code name}, {@code valueHumanName}, {@code resource}, {@code valueAge}, {@code valueMoney}, {@code part}, {@code valueBase64Binary}, {@code valueOid}, {@code valueMarkdown}, {@code valueAddress}, {@code modifierExtension}, {@code valueContributor}, {@code valueString}, {@code valueReference}, {@code valueContactDetail}, {@code valuePositiveInt}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(valueAttachment);
    h += (h << 5) + Objects.hashCode(valueRatio);
    h += (h << 5) + Objects.hashCode(valueTiming);
    h += (h << 5) + Objects.hashCode(valueTime);
    h += (h << 5) + Objects.hashCode(valueUsageContext);
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(valuePeriod);
    h += (h << 5) + Objects.hashCode(valueExpression);
    h += (h << 5) + Objects.hashCode(valueCoding);
    h += (h << 5) + Objects.hashCode(valueId);
    h += (h << 5) + Objects.hashCode(valueContactPoint);
    h += (h << 5) + Objects.hashCode(valueUri);
    h += (h << 5) + Objects.hashCode(valueRange);
    h += (h << 5) + Objects.hashCode(valueCodeableConcept);
    h += (h << 5) + Objects.hashCode(valueDuration);
    h += (h << 5) + Objects.hashCode(valueDate);
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(valueIdentifier);
    h += (h << 5) + Objects.hashCode(valueDistance);
    h += (h << 5) + Objects.hashCode(valueInstant);
    h += (h << 5) + Objects.hashCode(valueCount);
    h += (h << 5) + Objects.hashCode(valueAnnotation);
    h += (h << 5) + Objects.hashCode(valueMeta);
    h += (h << 5) + Objects.hashCode(valueDateTime);
    h += (h << 5) + Objects.hashCode(valueUuid);
    h += (h << 5) + Objects.hashCode(valueCanonical);
    h += (h << 5) + Objects.hashCode(valueInteger);
    h += (h << 5) + Objects.hashCode(valueUrl);
    h += (h << 5) + Objects.hashCode(valueCode);
    h += (h << 5) + Objects.hashCode(valueSampledData);
    h += (h << 5) + Objects.hashCode(valueDosage);
    h += (h << 5) + Objects.hashCode(valueSignature);
    h += (h << 5) + Objects.hashCode(valueParameterDefinition);
    h += (h << 5) + Objects.hashCode(valueDataRequirement);
    h += (h << 5) + Objects.hashCode(valueTriggerDefinition);
    h += (h << 5) + Objects.hashCode(valueUnsignedInt);
    h += (h << 5) + Objects.hashCode(valueDecimal);
    h += (h << 5) + Objects.hashCode(valueRelatedArtifact);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(valueHumanName);
    h += (h << 5) + Objects.hashCode(resource);
    h += (h << 5) + Objects.hashCode(valueAge);
    h += (h << 5) + Objects.hashCode(valueMoney);
    h += (h << 5) + Objects.hashCode(part);
    h += (h << 5) + Objects.hashCode(valueBase64Binary);
    h += (h << 5) + Objects.hashCode(valueOid);
    h += (h << 5) + Objects.hashCode(valueMarkdown);
    h += (h << 5) + Objects.hashCode(valueAddress);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(valueContributor);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(valueReference);
    h += (h << 5) + Objects.hashCode(valueContactDetail);
    h += (h << 5) + Objects.hashCode(valuePositiveInt);
    return h;
  }

  /**
   * Prints the immutable value {@code Parameters_Parameter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Parameters_Parameter{");
    if (valueAttachment != null) {
      builder.append("valueAttachment=").append(valueAttachment);
    }
    if (valueRatio != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueRatio=").append(valueRatio);
    }
    if (valueTiming != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueTiming=").append(valueTiming);
    }
    if (valueTime != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueTime=").append(valueTime);
    }
    if (valueUsageContext != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueUsageContext=").append(valueUsageContext);
    }
    if (valueBoolean != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valuePeriod != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valuePeriod=").append(valuePeriod);
    }
    if (valueExpression != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueExpression=").append(valueExpression);
    }
    if (valueCoding != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueCoding=").append(valueCoding);
    }
    if (valueId != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueId=").append(valueId);
    }
    if (valueContactPoint != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueContactPoint=").append(valueContactPoint);
    }
    if (valueUri != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueUri=").append(valueUri);
    }
    if (valueRange != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueRange=").append(valueRange);
    }
    if (valueCodeableConcept != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueCodeableConcept=").append(valueCodeableConcept);
    }
    if (valueDuration != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueDuration=").append(valueDuration);
    }
    if (valueDate != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueDate=").append(valueDate);
    }
    if (valueQuantity != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (valueIdentifier != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueIdentifier=").append(valueIdentifier);
    }
    if (valueDistance != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueDistance=").append(valueDistance);
    }
    if (valueInstant != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueInstant=").append(valueInstant);
    }
    if (valueCount != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueCount=").append(valueCount);
    }
    if (valueAnnotation != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueAnnotation=").append(valueAnnotation);
    }
    if (valueMeta != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueMeta=").append(valueMeta);
    }
    if (valueDateTime != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueDateTime=").append(valueDateTime);
    }
    if (valueUuid != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueUuid=").append(valueUuid);
    }
    if (valueCanonical != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueCanonical=").append(valueCanonical);
    }
    if (valueInteger != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (valueUrl != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueUrl=").append(valueUrl);
    }
    if (valueCode != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueCode=").append(valueCode);
    }
    if (valueSampledData != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueSampledData=").append(valueSampledData);
    }
    if (valueDosage != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueDosage=").append(valueDosage);
    }
    if (valueSignature != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueSignature=").append(valueSignature);
    }
    if (valueParameterDefinition != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueParameterDefinition=").append(valueParameterDefinition);
    }
    if (valueDataRequirement != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueDataRequirement=").append(valueDataRequirement);
    }
    if (valueTriggerDefinition != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueTriggerDefinition=").append(valueTriggerDefinition);
    }
    if (valueUnsignedInt != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueUnsignedInt=").append(valueUnsignedInt);
    }
    if (valueDecimal != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueDecimal=").append(valueDecimal);
    }
    if (valueRelatedArtifact != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueRelatedArtifact=").append(valueRelatedArtifact);
    }
    if (name != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (valueHumanName != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueHumanName=").append(valueHumanName);
    }
    if (resource != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (valueAge != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueAge=").append(valueAge);
    }
    if (valueMoney != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueMoney=").append(valueMoney);
    }
    if (part != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("part=").append(part);
    }
    if (valueBase64Binary != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueBase64Binary=").append(valueBase64Binary);
    }
    if (valueOid != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueOid=").append(valueOid);
    }
    if (valueMarkdown != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueMarkdown=").append(valueMarkdown);
    }
    if (valueAddress != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueAddress=").append(valueAddress);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueContributor != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueContributor=").append(valueContributor);
    }
    if (valueString != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueReference != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueReference=").append(valueReference);
    }
    if (valueContactDetail != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valueContactDetail=").append(valueContactDetail);
    }
    if (valuePositiveInt != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("valuePositiveInt=").append(valuePositiveInt);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Parameters_Parameter", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Parameters_Parameter {
    @Nullable Optional<Attachment> valueAttachment = Optional.empty();
    boolean valueAttachmentIsSet;
    @Nullable Optional<Ratio> valueRatio = Optional.empty();
    boolean valueRatioIsSet;
    @Nullable Optional<Timing> valueTiming = Optional.empty();
    boolean valueTimingIsSet;
    @Nullable Optional<String> valueTime = Optional.empty();
    boolean valueTimeIsSet;
    @Nullable Optional<UsageContext> valueUsageContext = Optional.empty();
    boolean valueUsageContextIsSet;
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<Period> valuePeriod = Optional.empty();
    boolean valuePeriodIsSet;
    @Nullable Optional<Expression> valueExpression = Optional.empty();
    boolean valueExpressionIsSet;
    @Nullable Optional<Coding> valueCoding = Optional.empty();
    boolean valueCodingIsSet;
    @Nullable Optional<String> valueId = Optional.empty();
    boolean valueIdIsSet;
    @Nullable Optional<ContactPoint> valueContactPoint = Optional.empty();
    boolean valueContactPointIsSet;
    @Nullable Optional<String> valueUri = Optional.empty();
    boolean valueUriIsSet;
    @Nullable Optional<Range> valueRange = Optional.empty();
    boolean valueRangeIsSet;
    @Nullable Optional<CodeableConcept> valueCodeableConcept = Optional.empty();
    boolean valueCodeableConceptIsSet;
    @Nullable Optional<Duration> valueDuration = Optional.empty();
    boolean valueDurationIsSet;
    @Nullable Optional<String> valueDate = Optional.empty();
    boolean valueDateIsSet;
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Identifier> valueIdentifier = Optional.empty();
    boolean valueIdentifierIsSet;
    @Nullable Optional<Distance> valueDistance = Optional.empty();
    boolean valueDistanceIsSet;
    @Nullable Optional<String> valueInstant = Optional.empty();
    boolean valueInstantIsSet;
    @Nullable Optional<Count> valueCount = Optional.empty();
    boolean valueCountIsSet;
    @Nullable Optional<Annotation> valueAnnotation = Optional.empty();
    boolean valueAnnotationIsSet;
    @Nullable Optional<Meta> valueMeta = Optional.empty();
    boolean valueMetaIsSet;
    @Nullable Optional<String> valueDateTime = Optional.empty();
    boolean valueDateTimeIsSet;
    @Nullable Optional<String> valueUuid = Optional.empty();
    boolean valueUuidIsSet;
    @Nullable Optional<String> valueCanonical = Optional.empty();
    boolean valueCanonicalIsSet;
    @Nullable Optional<Double> valueInteger = Optional.empty();
    boolean valueIntegerIsSet;
    @Nullable Optional<String> valueUrl = Optional.empty();
    boolean valueUrlIsSet;
    @Nullable Optional<String> valueCode = Optional.empty();
    boolean valueCodeIsSet;
    @Nullable Optional<SampledData> valueSampledData = Optional.empty();
    boolean valueSampledDataIsSet;
    @Nullable Optional<Dosage> valueDosage = Optional.empty();
    boolean valueDosageIsSet;
    @Nullable Optional<Signature> valueSignature = Optional.empty();
    boolean valueSignatureIsSet;
    @Nullable Optional<ParameterDefinition> valueParameterDefinition = Optional.empty();
    boolean valueParameterDefinitionIsSet;
    @Nullable Optional<DataRequirement> valueDataRequirement = Optional.empty();
    boolean valueDataRequirementIsSet;
    @Nullable Optional<TriggerDefinition> valueTriggerDefinition = Optional.empty();
    boolean valueTriggerDefinitionIsSet;
    @Nullable Optional<Double> valueUnsignedInt = Optional.empty();
    boolean valueUnsignedIntIsSet;
    @Nullable Optional<Double> valueDecimal = Optional.empty();
    boolean valueDecimalIsSet;
    @Nullable Optional<RelatedArtifact> valueRelatedArtifact = Optional.empty();
    boolean valueRelatedArtifactIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<HumanName> valueHumanName = Optional.empty();
    boolean valueHumanNameIsSet;
    @Nullable Optional<ResourceList> resource = Optional.empty();
    boolean resourceIsSet;
    @Nullable Optional<Age> valueAge = Optional.empty();
    boolean valueAgeIsSet;
    @Nullable Optional<Money> valueMoney = Optional.empty();
    boolean valueMoneyIsSet;
    @Nullable Optional<List<Parameters_Parameter>> part = Optional.empty();
    boolean partIsSet;
    @Nullable Optional<String> valueBase64Binary = Optional.empty();
    boolean valueBase64BinaryIsSet;
    @Nullable Optional<String> valueOid = Optional.empty();
    boolean valueOidIsSet;
    @Nullable Optional<String> valueMarkdown = Optional.empty();
    boolean valueMarkdownIsSet;
    @Nullable Optional<Address> valueAddress = Optional.empty();
    boolean valueAddressIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Contributor> valueContributor = Optional.empty();
    boolean valueContributorIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<Reference> valueReference = Optional.empty();
    boolean valueReferenceIsSet;
    @Nullable Optional<ContactDetail> valueContactDetail = Optional.empty();
    boolean valueContactDetailIsSet;
    @Nullable Optional<Double> valuePositiveInt = Optional.empty();
    boolean valuePositiveIntIsSet;
    @JsonProperty("valueAttachment")
    public void setValueAttachment(Optional<Attachment> valueAttachment) {
      this.valueAttachment = valueAttachment;
      this.valueAttachmentIsSet = true;
    }
    @JsonProperty("valueRatio")
    public void setValueRatio(Optional<Ratio> valueRatio) {
      this.valueRatio = valueRatio;
      this.valueRatioIsSet = true;
    }
    @JsonProperty("valueTiming")
    public void setValueTiming(Optional<Timing> valueTiming) {
      this.valueTiming = valueTiming;
      this.valueTimingIsSet = true;
    }
    @JsonProperty("valueTime")
    public void setValueTime(Optional<String> valueTime) {
      this.valueTime = valueTime;
      this.valueTimeIsSet = true;
    }
    @JsonProperty("valueUsageContext")
    public void setValueUsageContext(Optional<UsageContext> valueUsageContext) {
      this.valueUsageContext = valueUsageContext;
      this.valueUsageContextIsSet = true;
    }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Optional<Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @JsonProperty("valuePeriod")
    public void setValuePeriod(Optional<Period> valuePeriod) {
      this.valuePeriod = valuePeriod;
      this.valuePeriodIsSet = true;
    }
    @JsonProperty("valueExpression")
    public void setValueExpression(Optional<Expression> valueExpression) {
      this.valueExpression = valueExpression;
      this.valueExpressionIsSet = true;
    }
    @JsonProperty("valueCoding")
    public void setValueCoding(Optional<Coding> valueCoding) {
      this.valueCoding = valueCoding;
      this.valueCodingIsSet = true;
    }
    @JsonProperty("valueId")
    public void setValueId(Optional<String> valueId) {
      this.valueId = valueId;
      this.valueIdIsSet = true;
    }
    @JsonProperty("valueContactPoint")
    public void setValueContactPoint(Optional<ContactPoint> valueContactPoint) {
      this.valueContactPoint = valueContactPoint;
      this.valueContactPointIsSet = true;
    }
    @JsonProperty("valueUri")
    public void setValueUri(Optional<String> valueUri) {
      this.valueUri = valueUri;
      this.valueUriIsSet = true;
    }
    @JsonProperty("valueRange")
    public void setValueRange(Optional<Range> valueRange) {
      this.valueRange = valueRange;
      this.valueRangeIsSet = true;
    }
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(Optional<CodeableConcept> valueCodeableConcept) {
      this.valueCodeableConcept = valueCodeableConcept;
      this.valueCodeableConceptIsSet = true;
    }
    @JsonProperty("valueDuration")
    public void setValueDuration(Optional<Duration> valueDuration) {
      this.valueDuration = valueDuration;
      this.valueDurationIsSet = true;
    }
    @JsonProperty("valueDate")
    public void setValueDate(Optional<String> valueDate) {
      this.valueDate = valueDate;
      this.valueDateIsSet = true;
    }
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
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
    @JsonProperty("valueIdentifier")
    public void setValueIdentifier(Optional<Identifier> valueIdentifier) {
      this.valueIdentifier = valueIdentifier;
      this.valueIdentifierIsSet = true;
    }
    @JsonProperty("valueDistance")
    public void setValueDistance(Optional<Distance> valueDistance) {
      this.valueDistance = valueDistance;
      this.valueDistanceIsSet = true;
    }
    @JsonProperty("valueInstant")
    public void setValueInstant(Optional<String> valueInstant) {
      this.valueInstant = valueInstant;
      this.valueInstantIsSet = true;
    }
    @JsonProperty("valueCount")
    public void setValueCount(Optional<Count> valueCount) {
      this.valueCount = valueCount;
      this.valueCountIsSet = true;
    }
    @JsonProperty("valueAnnotation")
    public void setValueAnnotation(Optional<Annotation> valueAnnotation) {
      this.valueAnnotation = valueAnnotation;
      this.valueAnnotationIsSet = true;
    }
    @JsonProperty("valueMeta")
    public void setValueMeta(Optional<Meta> valueMeta) {
      this.valueMeta = valueMeta;
      this.valueMetaIsSet = true;
    }
    @JsonProperty("valueDateTime")
    public void setValueDateTime(Optional<String> valueDateTime) {
      this.valueDateTime = valueDateTime;
      this.valueDateTimeIsSet = true;
    }
    @JsonProperty("valueUuid")
    public void setValueUuid(Optional<String> valueUuid) {
      this.valueUuid = valueUuid;
      this.valueUuidIsSet = true;
    }
    @JsonProperty("valueCanonical")
    public void setValueCanonical(Optional<String> valueCanonical) {
      this.valueCanonical = valueCanonical;
      this.valueCanonicalIsSet = true;
    }
    @JsonProperty("valueInteger")
    public void setValueInteger(Optional<Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @JsonProperty("valueUrl")
    public void setValueUrl(Optional<String> valueUrl) {
      this.valueUrl = valueUrl;
      this.valueUrlIsSet = true;
    }
    @JsonProperty("valueCode")
    public void setValueCode(Optional<String> valueCode) {
      this.valueCode = valueCode;
      this.valueCodeIsSet = true;
    }
    @JsonProperty("valueSampledData")
    public void setValueSampledData(Optional<SampledData> valueSampledData) {
      this.valueSampledData = valueSampledData;
      this.valueSampledDataIsSet = true;
    }
    @JsonProperty("valueDosage")
    public void setValueDosage(Optional<Dosage> valueDosage) {
      this.valueDosage = valueDosage;
      this.valueDosageIsSet = true;
    }
    @JsonProperty("valueSignature")
    public void setValueSignature(Optional<Signature> valueSignature) {
      this.valueSignature = valueSignature;
      this.valueSignatureIsSet = true;
    }
    @JsonProperty("valueParameterDefinition")
    public void setValueParameterDefinition(Optional<ParameterDefinition> valueParameterDefinition) {
      this.valueParameterDefinition = valueParameterDefinition;
      this.valueParameterDefinitionIsSet = true;
    }
    @JsonProperty("valueDataRequirement")
    public void setValueDataRequirement(Optional<DataRequirement> valueDataRequirement) {
      this.valueDataRequirement = valueDataRequirement;
      this.valueDataRequirementIsSet = true;
    }
    @JsonProperty("valueTriggerDefinition")
    public void setValueTriggerDefinition(Optional<TriggerDefinition> valueTriggerDefinition) {
      this.valueTriggerDefinition = valueTriggerDefinition;
      this.valueTriggerDefinitionIsSet = true;
    }
    @JsonProperty("valueUnsignedInt")
    public void setValueUnsignedInt(Optional<Double> valueUnsignedInt) {
      this.valueUnsignedInt = valueUnsignedInt;
      this.valueUnsignedIntIsSet = true;
    }
    @JsonProperty("valueDecimal")
    public void setValueDecimal(Optional<Double> valueDecimal) {
      this.valueDecimal = valueDecimal;
      this.valueDecimalIsSet = true;
    }
    @JsonProperty("valueRelatedArtifact")
    public void setValueRelatedArtifact(Optional<RelatedArtifact> valueRelatedArtifact) {
      this.valueRelatedArtifact = valueRelatedArtifact;
      this.valueRelatedArtifactIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("valueHumanName")
    public void setValueHumanName(Optional<HumanName> valueHumanName) {
      this.valueHumanName = valueHumanName;
      this.valueHumanNameIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<ResourceList> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @JsonProperty("valueAge")
    public void setValueAge(Optional<Age> valueAge) {
      this.valueAge = valueAge;
      this.valueAgeIsSet = true;
    }
    @JsonProperty("valueMoney")
    public void setValueMoney(Optional<Money> valueMoney) {
      this.valueMoney = valueMoney;
      this.valueMoneyIsSet = true;
    }
    @JsonProperty("part")
    public void setPart(Optional<List<Parameters_Parameter>> part) {
      this.part = part;
      this.partIsSet = true;
    }
    @JsonProperty("valueBase64Binary")
    public void setValueBase64Binary(Optional<String> valueBase64Binary) {
      this.valueBase64Binary = valueBase64Binary;
      this.valueBase64BinaryIsSet = true;
    }
    @JsonProperty("valueOid")
    public void setValueOid(Optional<String> valueOid) {
      this.valueOid = valueOid;
      this.valueOidIsSet = true;
    }
    @JsonProperty("valueMarkdown")
    public void setValueMarkdown(Optional<String> valueMarkdown) {
      this.valueMarkdown = valueMarkdown;
      this.valueMarkdownIsSet = true;
    }
    @JsonProperty("valueAddress")
    public void setValueAddress(Optional<Address> valueAddress) {
      this.valueAddress = valueAddress;
      this.valueAddressIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("valueContributor")
    public void setValueContributor(Optional<Contributor> valueContributor) {
      this.valueContributor = valueContributor;
      this.valueContributorIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("valueReference")
    public void setValueReference(Optional<Reference> valueReference) {
      this.valueReference = valueReference;
      this.valueReferenceIsSet = true;
    }
    @JsonProperty("valueContactDetail")
    public void setValueContactDetail(Optional<ContactDetail> valueContactDetail) {
      this.valueContactDetail = valueContactDetail;
      this.valueContactDetailIsSet = true;
    }
    @JsonProperty("valuePositiveInt")
    public void setValuePositiveInt(Optional<Double> valuePositiveInt) {
      this.valuePositiveInt = valuePositiveInt;
      this.valuePositiveIntIsSet = true;
    }
    @Override
    public Optional<Attachment> valueAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> valueRatio() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> valueTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UsageContext> valueUsageContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> valuePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Expression> valueExpression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> valueCoding() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ContactPoint> valueContactPoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> valueRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> valueCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> valueDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> valueIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Distance> valueDistance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueInstant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Count> valueCount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Annotation> valueAnnotation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> valueMeta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueUuid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueUrl() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SampledData> valueSampledData() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Dosage> valueDosage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Signature> valueSignature() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ParameterDefinition> valueParameterDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DataRequirement> valueDataRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TriggerDefinition> valueTriggerDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueUnsignedInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<RelatedArtifact> valueRelatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<HumanName> valueHumanName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ResourceList> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> valueAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> valueMoney() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Parameters_Parameter>> part() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueBase64Binary() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueOid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueMarkdown() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Address> valueAddress() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Contributor> valueContributor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> valueReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ContactDetail> valueContactDetail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valuePositiveInt() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableParameters_Parameter fromJson(Json json) {
    ImmutableParameters_Parameter.Builder builder = ImmutableParameters_Parameter.builder();
    if (json.valueAttachmentIsSet) {
      builder.valueAttachment(json.valueAttachment);
    }
    if (json.valueRatioIsSet) {
      builder.valueRatio(json.valueRatio);
    }
    if (json.valueTimingIsSet) {
      builder.valueTiming(json.valueTiming);
    }
    if (json.valueTimeIsSet) {
      builder.valueTime(json.valueTime);
    }
    if (json.valueUsageContextIsSet) {
      builder.valueUsageContext(json.valueUsageContext);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valuePeriodIsSet) {
      builder.valuePeriod(json.valuePeriod);
    }
    if (json.valueExpressionIsSet) {
      builder.valueExpression(json.valueExpression);
    }
    if (json.valueCodingIsSet) {
      builder.valueCoding(json.valueCoding);
    }
    if (json.valueIdIsSet) {
      builder.valueId(json.valueId);
    }
    if (json.valueContactPointIsSet) {
      builder.valueContactPoint(json.valueContactPoint);
    }
    if (json.valueUriIsSet) {
      builder.valueUri(json.valueUri);
    }
    if (json.valueRangeIsSet) {
      builder.valueRange(json.valueRange);
    }
    if (json.valueCodeableConceptIsSet) {
      builder.valueCodeableConcept(json.valueCodeableConcept);
    }
    if (json.valueDurationIsSet) {
      builder.valueDuration(json.valueDuration);
    }
    if (json.valueDateIsSet) {
      builder.valueDate(json.valueDate);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueIdentifierIsSet) {
      builder.valueIdentifier(json.valueIdentifier);
    }
    if (json.valueDistanceIsSet) {
      builder.valueDistance(json.valueDistance);
    }
    if (json.valueInstantIsSet) {
      builder.valueInstant(json.valueInstant);
    }
    if (json.valueCountIsSet) {
      builder.valueCount(json.valueCount);
    }
    if (json.valueAnnotationIsSet) {
      builder.valueAnnotation(json.valueAnnotation);
    }
    if (json.valueMetaIsSet) {
      builder.valueMeta(json.valueMeta);
    }
    if (json.valueDateTimeIsSet) {
      builder.valueDateTime(json.valueDateTime);
    }
    if (json.valueUuidIsSet) {
      builder.valueUuid(json.valueUuid);
    }
    if (json.valueCanonicalIsSet) {
      builder.valueCanonical(json.valueCanonical);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.valueUrlIsSet) {
      builder.valueUrl(json.valueUrl);
    }
    if (json.valueCodeIsSet) {
      builder.valueCode(json.valueCode);
    }
    if (json.valueSampledDataIsSet) {
      builder.valueSampledData(json.valueSampledData);
    }
    if (json.valueDosageIsSet) {
      builder.valueDosage(json.valueDosage);
    }
    if (json.valueSignatureIsSet) {
      builder.valueSignature(json.valueSignature);
    }
    if (json.valueParameterDefinitionIsSet) {
      builder.valueParameterDefinition(json.valueParameterDefinition);
    }
    if (json.valueDataRequirementIsSet) {
      builder.valueDataRequirement(json.valueDataRequirement);
    }
    if (json.valueTriggerDefinitionIsSet) {
      builder.valueTriggerDefinition(json.valueTriggerDefinition);
    }
    if (json.valueUnsignedIntIsSet) {
      builder.valueUnsignedInt(json.valueUnsignedInt);
    }
    if (json.valueDecimalIsSet) {
      builder.valueDecimal(json.valueDecimal);
    }
    if (json.valueRelatedArtifactIsSet) {
      builder.valueRelatedArtifact(json.valueRelatedArtifact);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.valueHumanNameIsSet) {
      builder.valueHumanName(json.valueHumanName);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.valueAgeIsSet) {
      builder.valueAge(json.valueAge);
    }
    if (json.valueMoneyIsSet) {
      builder.valueMoney(json.valueMoney);
    }
    if (json.partIsSet) {
      builder.part(json.part);
    }
    if (json.valueBase64BinaryIsSet) {
      builder.valueBase64Binary(json.valueBase64Binary);
    }
    if (json.valueOidIsSet) {
      builder.valueOid(json.valueOid);
    }
    if (json.valueMarkdownIsSet) {
      builder.valueMarkdown(json.valueMarkdown);
    }
    if (json.valueAddressIsSet) {
      builder.valueAddress(json.valueAddress);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueContributorIsSet) {
      builder.valueContributor(json.valueContributor);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueReferenceIsSet) {
      builder.valueReference(json.valueReference);
    }
    if (json.valueContactDetailIsSet) {
      builder.valueContactDetail(json.valueContactDetail);
    }
    if (json.valuePositiveIntIsSet) {
      builder.valuePositiveInt(json.valuePositiveInt);
    }
    return (ImmutableParameters_Parameter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Parameters_Parameter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Parameters_Parameter instance
   */
  public static Parameters_Parameter copyOf(Parameters_Parameter instance) {
    if (instance instanceof ImmutableParameters_Parameter) {
      return (ImmutableParameters_Parameter) instance;
    }
    return ImmutableParameters_Parameter.builder()
        .valueAttachment(instance.valueAttachment())
        .valueRatio(instance.valueRatio())
        .valueTiming(instance.valueTiming())
        .valueTime(instance.valueTime())
        .valueUsageContext(instance.valueUsageContext())
        .valueBoolean(instance.valueBoolean())
        .valuePeriod(instance.valuePeriod())
        .valueExpression(instance.valueExpression())
        .valueCoding(instance.valueCoding())
        .valueId(instance.valueId())
        .valueContactPoint(instance.valueContactPoint())
        .valueUri(instance.valueUri())
        .valueRange(instance.valueRange())
        .valueCodeableConcept(instance.valueCodeableConcept())
        .valueDuration(instance.valueDuration())
        .valueDate(instance.valueDate())
        .valueQuantity(instance.valueQuantity())
        .id(instance.id())
        .extension(instance.extension())
        .valueIdentifier(instance.valueIdentifier())
        .valueDistance(instance.valueDistance())
        .valueInstant(instance.valueInstant())
        .valueCount(instance.valueCount())
        .valueAnnotation(instance.valueAnnotation())
        .valueMeta(instance.valueMeta())
        .valueDateTime(instance.valueDateTime())
        .valueUuid(instance.valueUuid())
        .valueCanonical(instance.valueCanonical())
        .valueInteger(instance.valueInteger())
        .valueUrl(instance.valueUrl())
        .valueCode(instance.valueCode())
        .valueSampledData(instance.valueSampledData())
        .valueDosage(instance.valueDosage())
        .valueSignature(instance.valueSignature())
        .valueParameterDefinition(instance.valueParameterDefinition())
        .valueDataRequirement(instance.valueDataRequirement())
        .valueTriggerDefinition(instance.valueTriggerDefinition())
        .valueUnsignedInt(instance.valueUnsignedInt())
        .valueDecimal(instance.valueDecimal())
        .valueRelatedArtifact(instance.valueRelatedArtifact())
        .name(instance.name())
        .valueHumanName(instance.valueHumanName())
        .resource(instance.resource())
        .valueAge(instance.valueAge())
        .valueMoney(instance.valueMoney())
        .part(instance.part())
        .valueBase64Binary(instance.valueBase64Binary())
        .valueOid(instance.valueOid())
        .valueMarkdown(instance.valueMarkdown())
        .valueAddress(instance.valueAddress())
        .modifierExtension(instance.modifierExtension())
        .valueContributor(instance.valueContributor())
        .valueString(instance.valueString())
        .valueReference(instance.valueReference())
        .valueContactDetail(instance.valueContactDetail())
        .valuePositiveInt(instance.valuePositiveInt())
        .build();
  }

  /**
   * Creates a builder for {@link Parameters_Parameter Parameters_Parameter}.
   * <pre>
   * ImmutableParameters_Parameter.builder()
   *    .valueAttachment(com.medplum.types.fhir.Attachment) // optional {@link Parameters_Parameter#valueAttachment() valueAttachment}
   *    .valueRatio(com.medplum.types.fhir.Ratio) // optional {@link Parameters_Parameter#valueRatio() valueRatio}
   *    .valueTiming(com.medplum.types.fhir.Timing) // optional {@link Parameters_Parameter#valueTiming() valueTiming}
   *    .valueTime(String) // optional {@link Parameters_Parameter#valueTime() valueTime}
   *    .valueUsageContext(com.medplum.types.fhir.UsageContext) // optional {@link Parameters_Parameter#valueUsageContext() valueUsageContext}
   *    .valueBoolean(Boolean) // optional {@link Parameters_Parameter#valueBoolean() valueBoolean}
   *    .valuePeriod(com.medplum.types.fhir.Period) // optional {@link Parameters_Parameter#valuePeriod() valuePeriod}
   *    .valueExpression(com.medplum.types.fhir.Expression) // optional {@link Parameters_Parameter#valueExpression() valueExpression}
   *    .valueCoding(com.medplum.types.fhir.Coding) // optional {@link Parameters_Parameter#valueCoding() valueCoding}
   *    .valueId(String) // optional {@link Parameters_Parameter#valueId() valueId}
   *    .valueContactPoint(com.medplum.types.fhir.ContactPoint) // optional {@link Parameters_Parameter#valueContactPoint() valueContactPoint}
   *    .valueUri(String) // optional {@link Parameters_Parameter#valueUri() valueUri}
   *    .valueRange(com.medplum.types.fhir.Range) // optional {@link Parameters_Parameter#valueRange() valueRange}
   *    .valueCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link Parameters_Parameter#valueCodeableConcept() valueCodeableConcept}
   *    .valueDuration(com.medplum.types.fhir.Duration) // optional {@link Parameters_Parameter#valueDuration() valueDuration}
   *    .valueDate(String) // optional {@link Parameters_Parameter#valueDate() valueDate}
   *    .valueQuantity(com.medplum.types.fhir.Quantity) // optional {@link Parameters_Parameter#valueQuantity() valueQuantity}
   *    .id(String) // optional {@link Parameters_Parameter#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Parameters_Parameter#extension() extension}
   *    .valueIdentifier(com.medplum.types.fhir.Identifier) // optional {@link Parameters_Parameter#valueIdentifier() valueIdentifier}
   *    .valueDistance(com.medplum.types.fhir.Distance) // optional {@link Parameters_Parameter#valueDistance() valueDistance}
   *    .valueInstant(String) // optional {@link Parameters_Parameter#valueInstant() valueInstant}
   *    .valueCount(com.medplum.types.fhir.Count) // optional {@link Parameters_Parameter#valueCount() valueCount}
   *    .valueAnnotation(com.medplum.types.fhir.Annotation) // optional {@link Parameters_Parameter#valueAnnotation() valueAnnotation}
   *    .valueMeta(com.medplum.types.fhir.Meta) // optional {@link Parameters_Parameter#valueMeta() valueMeta}
   *    .valueDateTime(String) // optional {@link Parameters_Parameter#valueDateTime() valueDateTime}
   *    .valueUuid(String) // optional {@link Parameters_Parameter#valueUuid() valueUuid}
   *    .valueCanonical(String) // optional {@link Parameters_Parameter#valueCanonical() valueCanonical}
   *    .valueInteger(Double) // optional {@link Parameters_Parameter#valueInteger() valueInteger}
   *    .valueUrl(String) // optional {@link Parameters_Parameter#valueUrl() valueUrl}
   *    .valueCode(String) // optional {@link Parameters_Parameter#valueCode() valueCode}
   *    .valueSampledData(com.medplum.types.fhir.SampledData) // optional {@link Parameters_Parameter#valueSampledData() valueSampledData}
   *    .valueDosage(com.medplum.types.fhir.Dosage) // optional {@link Parameters_Parameter#valueDosage() valueDosage}
   *    .valueSignature(com.medplum.types.fhir.Signature) // optional {@link Parameters_Parameter#valueSignature() valueSignature}
   *    .valueParameterDefinition(com.medplum.types.fhir.ParameterDefinition) // optional {@link Parameters_Parameter#valueParameterDefinition() valueParameterDefinition}
   *    .valueDataRequirement(com.medplum.types.fhir.DataRequirement) // optional {@link Parameters_Parameter#valueDataRequirement() valueDataRequirement}
   *    .valueTriggerDefinition(com.medplum.types.fhir.TriggerDefinition) // optional {@link Parameters_Parameter#valueTriggerDefinition() valueTriggerDefinition}
   *    .valueUnsignedInt(Double) // optional {@link Parameters_Parameter#valueUnsignedInt() valueUnsignedInt}
   *    .valueDecimal(Double) // optional {@link Parameters_Parameter#valueDecimal() valueDecimal}
   *    .valueRelatedArtifact(com.medplum.types.fhir.RelatedArtifact) // optional {@link Parameters_Parameter#valueRelatedArtifact() valueRelatedArtifact}
   *    .name(String) // optional {@link Parameters_Parameter#name() name}
   *    .valueHumanName(com.medplum.types.fhir.HumanName) // optional {@link Parameters_Parameter#valueHumanName() valueHumanName}
   *    .resource(com.medplum.types.fhir.ResourceList) // optional {@link Parameters_Parameter#resource() resource}
   *    .valueAge(com.medplum.types.fhir.Age) // optional {@link Parameters_Parameter#valueAge() valueAge}
   *    .valueMoney(com.medplum.types.fhir.Money) // optional {@link Parameters_Parameter#valueMoney() valueMoney}
   *    .part(List&amp;lt;com.medplum.types.fhir.Parameters_Parameter&amp;gt;) // optional {@link Parameters_Parameter#part() part}
   *    .valueBase64Binary(String) // optional {@link Parameters_Parameter#valueBase64Binary() valueBase64Binary}
   *    .valueOid(String) // optional {@link Parameters_Parameter#valueOid() valueOid}
   *    .valueMarkdown(String) // optional {@link Parameters_Parameter#valueMarkdown() valueMarkdown}
   *    .valueAddress(com.medplum.types.fhir.Address) // optional {@link Parameters_Parameter#valueAddress() valueAddress}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Parameters_Parameter#modifierExtension() modifierExtension}
   *    .valueContributor(com.medplum.types.fhir.Contributor) // optional {@link Parameters_Parameter#valueContributor() valueContributor}
   *    .valueString(String) // optional {@link Parameters_Parameter#valueString() valueString}
   *    .valueReference(com.medplum.types.fhir.Reference) // optional {@link Parameters_Parameter#valueReference() valueReference}
   *    .valueContactDetail(com.medplum.types.fhir.ContactDetail) // optional {@link Parameters_Parameter#valueContactDetail() valueContactDetail}
   *    .valuePositiveInt(Double) // optional {@link Parameters_Parameter#valuePositiveInt() valuePositiveInt}
   *    .build();
   * </pre>
   * @return A new Parameters_Parameter builder
   */
  public static ImmutableParameters_Parameter.Builder builder() {
    return new ImmutableParameters_Parameter.Builder();
  }

  /**
   * Builds instances of type {@link Parameters_Parameter Parameters_Parameter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Parameters_Parameter", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VALUE_ATTACHMENT = 0x1L;
    private static final long OPT_BIT_VALUE_RATIO = 0x2L;
    private static final long OPT_BIT_VALUE_TIMING = 0x4L;
    private static final long OPT_BIT_VALUE_TIME = 0x8L;
    private static final long OPT_BIT_VALUE_USAGE_CONTEXT = 0x10L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x20L;
    private static final long OPT_BIT_VALUE_PERIOD = 0x40L;
    private static final long OPT_BIT_VALUE_EXPRESSION = 0x80L;
    private static final long OPT_BIT_VALUE_CODING = 0x100L;
    private static final long OPT_BIT_VALUE_ID = 0x200L;
    private static final long OPT_BIT_VALUE_CONTACT_POINT = 0x400L;
    private static final long OPT_BIT_VALUE_URI = 0x800L;
    private static final long OPT_BIT_VALUE_RANGE = 0x1000L;
    private static final long OPT_BIT_VALUE_CODEABLE_CONCEPT = 0x2000L;
    private static final long OPT_BIT_VALUE_DURATION = 0x4000L;
    private static final long OPT_BIT_VALUE_DATE = 0x8000L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_EXTENSION = 0x40000L;
    private static final long OPT_BIT_VALUE_IDENTIFIER = 0x80000L;
    private static final long OPT_BIT_VALUE_DISTANCE = 0x100000L;
    private static final long OPT_BIT_VALUE_INSTANT = 0x200000L;
    private static final long OPT_BIT_VALUE_COUNT = 0x400000L;
    private static final long OPT_BIT_VALUE_ANNOTATION = 0x800000L;
    private static final long OPT_BIT_VALUE_META = 0x1000000L;
    private static final long OPT_BIT_VALUE_DATE_TIME = 0x2000000L;
    private static final long OPT_BIT_VALUE_UUID = 0x4000000L;
    private static final long OPT_BIT_VALUE_CANONICAL = 0x8000000L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x10000000L;
    private static final long OPT_BIT_VALUE_URL = 0x20000000L;
    private static final long OPT_BIT_VALUE_CODE = 0x40000000L;
    private static final long OPT_BIT_VALUE_SAMPLED_DATA = 0x80000000L;
    private static final long OPT_BIT_VALUE_DOSAGE = 0x100000000L;
    private static final long OPT_BIT_VALUE_SIGNATURE = 0x200000000L;
    private static final long OPT_BIT_VALUE_PARAMETER_DEFINITION = 0x400000000L;
    private static final long OPT_BIT_VALUE_DATA_REQUIREMENT = 0x800000000L;
    private static final long OPT_BIT_VALUE_TRIGGER_DEFINITION = 0x1000000000L;
    private static final long OPT_BIT_VALUE_UNSIGNED_INT = 0x2000000000L;
    private static final long OPT_BIT_VALUE_DECIMAL = 0x4000000000L;
    private static final long OPT_BIT_VALUE_RELATED_ARTIFACT = 0x8000000000L;
    private static final long OPT_BIT_NAME = 0x10000000000L;
    private static final long OPT_BIT_VALUE_HUMAN_NAME = 0x20000000000L;
    private static final long OPT_BIT_RESOURCE = 0x40000000000L;
    private static final long OPT_BIT_VALUE_AGE = 0x80000000000L;
    private static final long OPT_BIT_VALUE_MONEY = 0x100000000000L;
    private static final long OPT_BIT_PART = 0x200000000000L;
    private static final long OPT_BIT_VALUE_BASE64_BINARY = 0x400000000000L;
    private static final long OPT_BIT_VALUE_OID = 0x800000000000L;
    private static final long OPT_BIT_VALUE_MARKDOWN = 0x1000000000000L;
    private static final long OPT_BIT_VALUE_ADDRESS = 0x2000000000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000000000000L;
    private static final long OPT_BIT_VALUE_CONTRIBUTOR = 0x8000000000000L;
    private static final long OPT_BIT_VALUE_STRING = 0x10000000000000L;
    private static final long OPT_BIT_VALUE_REFERENCE = 0x20000000000000L;
    private static final long OPT_BIT_VALUE_CONTACT_DETAIL = 0x40000000000000L;
    private static final long OPT_BIT_VALUE_POSITIVE_INT = 0x80000000000000L;
    private long optBits;

    private @Nullable Attachment valueAttachment;
    private @Nullable Ratio valueRatio;
    private @Nullable Timing valueTiming;
    private @Nullable String valueTime;
    private @Nullable UsageContext valueUsageContext;
    private @Nullable Boolean valueBoolean;
    private @Nullable Period valuePeriod;
    private @Nullable Expression valueExpression;
    private @Nullable Coding valueCoding;
    private @Nullable String valueId;
    private @Nullable ContactPoint valueContactPoint;
    private @Nullable String valueUri;
    private @Nullable Range valueRange;
    private @Nullable CodeableConcept valueCodeableConcept;
    private @Nullable Duration valueDuration;
    private @Nullable String valueDate;
    private @Nullable Quantity valueQuantity;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Identifier valueIdentifier;
    private @Nullable Distance valueDistance;
    private @Nullable String valueInstant;
    private @Nullable Count valueCount;
    private @Nullable Annotation valueAnnotation;
    private @Nullable Meta valueMeta;
    private @Nullable String valueDateTime;
    private @Nullable String valueUuid;
    private @Nullable String valueCanonical;
    private @Nullable Double valueInteger;
    private @Nullable String valueUrl;
    private @Nullable String valueCode;
    private @Nullable SampledData valueSampledData;
    private @Nullable Dosage valueDosage;
    private @Nullable Signature valueSignature;
    private @Nullable ParameterDefinition valueParameterDefinition;
    private @Nullable DataRequirement valueDataRequirement;
    private @Nullable TriggerDefinition valueTriggerDefinition;
    private @Nullable Double valueUnsignedInt;
    private @Nullable Double valueDecimal;
    private @Nullable RelatedArtifact valueRelatedArtifact;
    private @Nullable String name;
    private @Nullable HumanName valueHumanName;
    private @Nullable ResourceList resource;
    private @Nullable Age valueAge;
    private @Nullable Money valueMoney;
    private @Nullable List<Parameters_Parameter> part;
    private @Nullable String valueBase64Binary;
    private @Nullable String valueOid;
    private @Nullable String valueMarkdown;
    private @Nullable Address valueAddress;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Contributor valueContributor;
    private @Nullable String valueString;
    private @Nullable Reference valueReference;
    private @Nullable ContactDetail valueContactDetail;
    private @Nullable Double valuePositiveInt;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueAttachment(Attachment valueAttachment) {
      checkNotIsSet(valueAttachmentIsSet(), "valueAttachment");
      this.valueAttachment = Objects.requireNonNull(valueAttachment, "valueAttachment");
      optBits |= OPT_BIT_VALUE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueAttachment")
    public final Builder valueAttachment(Optional<? extends Attachment> valueAttachment) {
      checkNotIsSet(valueAttachmentIsSet(), "valueAttachment");
      this.valueAttachment = valueAttachment.orElse(null);
      optBits |= OPT_BIT_VALUE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRatio(Ratio valueRatio) {
      checkNotIsSet(valueRatioIsSet(), "valueRatio");
      this.valueRatio = Objects.requireNonNull(valueRatio, "valueRatio");
      optBits |= OPT_BIT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueRatio")
    public final Builder valueRatio(Optional<? extends Ratio> valueRatio) {
      checkNotIsSet(valueRatioIsSet(), "valueRatio");
      this.valueRatio = valueRatio.orElse(null);
      optBits |= OPT_BIT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueTiming() valueTiming} to valueTiming.
     * @param valueTiming The value for valueTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueTiming(Timing valueTiming) {
      checkNotIsSet(valueTimingIsSet(), "valueTiming");
      this.valueTiming = Objects.requireNonNull(valueTiming, "valueTiming");
      optBits |= OPT_BIT_VALUE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueTiming() valueTiming} to valueTiming.
     * @param valueTiming The value for valueTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueTiming")
    public final Builder valueTiming(Optional<? extends Timing> valueTiming) {
      checkNotIsSet(valueTimingIsSet(), "valueTiming");
      this.valueTiming = valueTiming.orElse(null);
      optBits |= OPT_BIT_VALUE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueTime(String valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = Objects.requireNonNull(valueTime, "valueTime");
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueTime")
    public final Builder valueTime(Optional<String> valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = valueTime.orElse(null);
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueUsageContext() valueUsageContext} to valueUsageContext.
     * @param valueUsageContext The value for valueUsageContext
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueUsageContext(UsageContext valueUsageContext) {
      checkNotIsSet(valueUsageContextIsSet(), "valueUsageContext");
      this.valueUsageContext = Objects.requireNonNull(valueUsageContext, "valueUsageContext");
      optBits |= OPT_BIT_VALUE_USAGE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueUsageContext() valueUsageContext} to valueUsageContext.
     * @param valueUsageContext The value for valueUsageContext
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueUsageContext")
    public final Builder valueUsageContext(Optional<? extends UsageContext> valueUsageContext) {
      checkNotIsSet(valueUsageContextIsSet(), "valueUsageContext");
      this.valueUsageContext = valueUsageContext.orElse(null);
      optBits |= OPT_BIT_VALUE_USAGE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueBoolean(boolean valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean;
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueBoolean")
    public final Builder valueBoolean(Optional<Boolean> valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean.orElse(null);
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder valuePeriod(Period valuePeriod) {
      checkNotIsSet(valuePeriodIsSet(), "valuePeriod");
      this.valuePeriod = Objects.requireNonNull(valuePeriod, "valuePeriod");
      optBits |= OPT_BIT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valuePeriod")
    public final Builder valuePeriod(Optional<? extends Period> valuePeriod) {
      checkNotIsSet(valuePeriodIsSet(), "valuePeriod");
      this.valuePeriod = valuePeriod.orElse(null);
      optBits |= OPT_BIT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueExpression() valueExpression} to valueExpression.
     * @param valueExpression The value for valueExpression
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueExpression(Expression valueExpression) {
      checkNotIsSet(valueExpressionIsSet(), "valueExpression");
      this.valueExpression = Objects.requireNonNull(valueExpression, "valueExpression");
      optBits |= OPT_BIT_VALUE_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueExpression() valueExpression} to valueExpression.
     * @param valueExpression The value for valueExpression
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueExpression")
    public final Builder valueExpression(Optional<? extends Expression> valueExpression) {
      checkNotIsSet(valueExpressionIsSet(), "valueExpression");
      this.valueExpression = valueExpression.orElse(null);
      optBits |= OPT_BIT_VALUE_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCoding(Coding valueCoding) {
      checkNotIsSet(valueCodingIsSet(), "valueCoding");
      this.valueCoding = Objects.requireNonNull(valueCoding, "valueCoding");
      optBits |= OPT_BIT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCoding")
    public final Builder valueCoding(Optional<? extends Coding> valueCoding) {
      checkNotIsSet(valueCodingIsSet(), "valueCoding");
      this.valueCoding = valueCoding.orElse(null);
      optBits |= OPT_BIT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueId() valueId} to valueId.
     * @param valueId The value for valueId
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueId(String valueId) {
      checkNotIsSet(valueIdIsSet(), "valueId");
      this.valueId = Objects.requireNonNull(valueId, "valueId");
      optBits |= OPT_BIT_VALUE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueId() valueId} to valueId.
     * @param valueId The value for valueId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueId")
    public final Builder valueId(Optional<String> valueId) {
      checkNotIsSet(valueIdIsSet(), "valueId");
      this.valueId = valueId.orElse(null);
      optBits |= OPT_BIT_VALUE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueContactPoint() valueContactPoint} to valueContactPoint.
     * @param valueContactPoint The value for valueContactPoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueContactPoint(ContactPoint valueContactPoint) {
      checkNotIsSet(valueContactPointIsSet(), "valueContactPoint");
      this.valueContactPoint = Objects.requireNonNull(valueContactPoint, "valueContactPoint");
      optBits |= OPT_BIT_VALUE_CONTACT_POINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueContactPoint() valueContactPoint} to valueContactPoint.
     * @param valueContactPoint The value for valueContactPoint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueContactPoint")
    public final Builder valueContactPoint(Optional<? extends ContactPoint> valueContactPoint) {
      checkNotIsSet(valueContactPointIsSet(), "valueContactPoint");
      this.valueContactPoint = valueContactPoint.orElse(null);
      optBits |= OPT_BIT_VALUE_CONTACT_POINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueUri() valueUri} to valueUri.
     * @param valueUri The value for valueUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueUri(String valueUri) {
      checkNotIsSet(valueUriIsSet(), "valueUri");
      this.valueUri = Objects.requireNonNull(valueUri, "valueUri");
      optBits |= OPT_BIT_VALUE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueUri() valueUri} to valueUri.
     * @param valueUri The value for valueUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueUri")
    public final Builder valueUri(Optional<String> valueUri) {
      checkNotIsSet(valueUriIsSet(), "valueUri");
      this.valueUri = valueUri.orElse(null);
      optBits |= OPT_BIT_VALUE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRange(Range valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = Objects.requireNonNull(valueRange, "valueRange");
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueRange")
    public final Builder valueRange(Optional<? extends Range> valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = valueRange.orElse(null);
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCodeableConcept(CodeableConcept valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = Objects.requireNonNull(valueCodeableConcept, "valueCodeableConcept");
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCodeableConcept")
    public final Builder valueCodeableConcept(Optional<? extends CodeableConcept> valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = valueCodeableConcept.orElse(null);
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDuration() valueDuration} to valueDuration.
     * @param valueDuration The value for valueDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDuration(Duration valueDuration) {
      checkNotIsSet(valueDurationIsSet(), "valueDuration");
      this.valueDuration = Objects.requireNonNull(valueDuration, "valueDuration");
      optBits |= OPT_BIT_VALUE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDuration() valueDuration} to valueDuration.
     * @param valueDuration The value for valueDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDuration")
    public final Builder valueDuration(Optional<? extends Duration> valueDuration) {
      checkNotIsSet(valueDurationIsSet(), "valueDuration");
      this.valueDuration = valueDuration.orElse(null);
      optBits |= OPT_BIT_VALUE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDate() valueDate} to valueDate.
     * @param valueDate The value for valueDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDate(String valueDate) {
      checkNotIsSet(valueDateIsSet(), "valueDate");
      this.valueDate = Objects.requireNonNull(valueDate, "valueDate");
      optBits |= OPT_BIT_VALUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDate() valueDate} to valueDate.
     * @param valueDate The value for valueDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDate")
    public final Builder valueDate(Optional<String> valueDate) {
      checkNotIsSet(valueDateIsSet(), "valueDate");
      this.valueDate = valueDate.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueQuantity(Quantity valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = Objects.requireNonNull(valueQuantity, "valueQuantity");
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueQuantity")
    public final Builder valueQuantity(Optional<? extends Quantity> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = valueQuantity.orElse(null);
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#id() id} to id.
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
     * Initializes the optional value {@link Parameters_Parameter#id() id} to id.
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
     * Initializes the optional value {@link Parameters_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link Parameters_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link Parameters_Parameter#valueIdentifier() valueIdentifier} to valueIdentifier.
     * @param valueIdentifier The value for valueIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueIdentifier(Identifier valueIdentifier) {
      checkNotIsSet(valueIdentifierIsSet(), "valueIdentifier");
      this.valueIdentifier = Objects.requireNonNull(valueIdentifier, "valueIdentifier");
      optBits |= OPT_BIT_VALUE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueIdentifier() valueIdentifier} to valueIdentifier.
     * @param valueIdentifier The value for valueIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueIdentifier")
    public final Builder valueIdentifier(Optional<? extends Identifier> valueIdentifier) {
      checkNotIsSet(valueIdentifierIsSet(), "valueIdentifier");
      this.valueIdentifier = valueIdentifier.orElse(null);
      optBits |= OPT_BIT_VALUE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDistance() valueDistance} to valueDistance.
     * @param valueDistance The value for valueDistance
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDistance(Distance valueDistance) {
      checkNotIsSet(valueDistanceIsSet(), "valueDistance");
      this.valueDistance = Objects.requireNonNull(valueDistance, "valueDistance");
      optBits |= OPT_BIT_VALUE_DISTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDistance() valueDistance} to valueDistance.
     * @param valueDistance The value for valueDistance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDistance")
    public final Builder valueDistance(Optional<? extends Distance> valueDistance) {
      checkNotIsSet(valueDistanceIsSet(), "valueDistance");
      this.valueDistance = valueDistance.orElse(null);
      optBits |= OPT_BIT_VALUE_DISTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueInstant() valueInstant} to valueInstant.
     * @param valueInstant The value for valueInstant
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueInstant(String valueInstant) {
      checkNotIsSet(valueInstantIsSet(), "valueInstant");
      this.valueInstant = Objects.requireNonNull(valueInstant, "valueInstant");
      optBits |= OPT_BIT_VALUE_INSTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueInstant() valueInstant} to valueInstant.
     * @param valueInstant The value for valueInstant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueInstant")
    public final Builder valueInstant(Optional<String> valueInstant) {
      checkNotIsSet(valueInstantIsSet(), "valueInstant");
      this.valueInstant = valueInstant.orElse(null);
      optBits |= OPT_BIT_VALUE_INSTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueCount() valueCount} to valueCount.
     * @param valueCount The value for valueCount
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCount(Count valueCount) {
      checkNotIsSet(valueCountIsSet(), "valueCount");
      this.valueCount = Objects.requireNonNull(valueCount, "valueCount");
      optBits |= OPT_BIT_VALUE_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueCount() valueCount} to valueCount.
     * @param valueCount The value for valueCount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCount")
    public final Builder valueCount(Optional<? extends Count> valueCount) {
      checkNotIsSet(valueCountIsSet(), "valueCount");
      this.valueCount = valueCount.orElse(null);
      optBits |= OPT_BIT_VALUE_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueAnnotation() valueAnnotation} to valueAnnotation.
     * @param valueAnnotation The value for valueAnnotation
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueAnnotation(Annotation valueAnnotation) {
      checkNotIsSet(valueAnnotationIsSet(), "valueAnnotation");
      this.valueAnnotation = Objects.requireNonNull(valueAnnotation, "valueAnnotation");
      optBits |= OPT_BIT_VALUE_ANNOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueAnnotation() valueAnnotation} to valueAnnotation.
     * @param valueAnnotation The value for valueAnnotation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueAnnotation")
    public final Builder valueAnnotation(Optional<? extends Annotation> valueAnnotation) {
      checkNotIsSet(valueAnnotationIsSet(), "valueAnnotation");
      this.valueAnnotation = valueAnnotation.orElse(null);
      optBits |= OPT_BIT_VALUE_ANNOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueMeta() valueMeta} to valueMeta.
     * @param valueMeta The value for valueMeta
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueMeta(Meta valueMeta) {
      checkNotIsSet(valueMetaIsSet(), "valueMeta");
      this.valueMeta = Objects.requireNonNull(valueMeta, "valueMeta");
      optBits |= OPT_BIT_VALUE_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueMeta() valueMeta} to valueMeta.
     * @param valueMeta The value for valueMeta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueMeta")
    public final Builder valueMeta(Optional<? extends Meta> valueMeta) {
      checkNotIsSet(valueMetaIsSet(), "valueMeta");
      this.valueMeta = valueMeta.orElse(null);
      optBits |= OPT_BIT_VALUE_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDateTime(String valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = Objects.requireNonNull(valueDateTime, "valueDateTime");
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDateTime")
    public final Builder valueDateTime(Optional<String> valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = valueDateTime.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueUuid() valueUuid} to valueUuid.
     * @param valueUuid The value for valueUuid
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueUuid(String valueUuid) {
      checkNotIsSet(valueUuidIsSet(), "valueUuid");
      this.valueUuid = Objects.requireNonNull(valueUuid, "valueUuid");
      optBits |= OPT_BIT_VALUE_UUID;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueUuid() valueUuid} to valueUuid.
     * @param valueUuid The value for valueUuid
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueUuid")
    public final Builder valueUuid(Optional<String> valueUuid) {
      checkNotIsSet(valueUuidIsSet(), "valueUuid");
      this.valueUuid = valueUuid.orElse(null);
      optBits |= OPT_BIT_VALUE_UUID;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueCanonical() valueCanonical} to valueCanonical.
     * @param valueCanonical The value for valueCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCanonical(String valueCanonical) {
      checkNotIsSet(valueCanonicalIsSet(), "valueCanonical");
      this.valueCanonical = Objects.requireNonNull(valueCanonical, "valueCanonical");
      optBits |= OPT_BIT_VALUE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueCanonical() valueCanonical} to valueCanonical.
     * @param valueCanonical The value for valueCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCanonical")
    public final Builder valueCanonical(Optional<String> valueCanonical) {
      checkNotIsSet(valueCanonicalIsSet(), "valueCanonical");
      this.valueCanonical = valueCanonical.orElse(null);
      optBits |= OPT_BIT_VALUE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueInteger(double valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger;
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueInteger")
    public final Builder valueInteger(Optional<Double> valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger.orElse(null);
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueUrl() valueUrl} to valueUrl.
     * @param valueUrl The value for valueUrl
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueUrl(String valueUrl) {
      checkNotIsSet(valueUrlIsSet(), "valueUrl");
      this.valueUrl = Objects.requireNonNull(valueUrl, "valueUrl");
      optBits |= OPT_BIT_VALUE_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueUrl() valueUrl} to valueUrl.
     * @param valueUrl The value for valueUrl
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueUrl")
    public final Builder valueUrl(Optional<String> valueUrl) {
      checkNotIsSet(valueUrlIsSet(), "valueUrl");
      this.valueUrl = valueUrl.orElse(null);
      optBits |= OPT_BIT_VALUE_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCode(String valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = Objects.requireNonNull(valueCode, "valueCode");
      optBits |= OPT_BIT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCode")
    public final Builder valueCode(Optional<String> valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = valueCode.orElse(null);
      optBits |= OPT_BIT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSampledData(SampledData valueSampledData) {
      checkNotIsSet(valueSampledDataIsSet(), "valueSampledData");
      this.valueSampledData = Objects.requireNonNull(valueSampledData, "valueSampledData");
      optBits |= OPT_BIT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueSampledData")
    public final Builder valueSampledData(Optional<? extends SampledData> valueSampledData) {
      checkNotIsSet(valueSampledDataIsSet(), "valueSampledData");
      this.valueSampledData = valueSampledData.orElse(null);
      optBits |= OPT_BIT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDosage() valueDosage} to valueDosage.
     * @param valueDosage The value for valueDosage
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDosage(Dosage valueDosage) {
      checkNotIsSet(valueDosageIsSet(), "valueDosage");
      this.valueDosage = Objects.requireNonNull(valueDosage, "valueDosage");
      optBits |= OPT_BIT_VALUE_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDosage() valueDosage} to valueDosage.
     * @param valueDosage The value for valueDosage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDosage")
    public final Builder valueDosage(Optional<? extends Dosage> valueDosage) {
      checkNotIsSet(valueDosageIsSet(), "valueDosage");
      this.valueDosage = valueDosage.orElse(null);
      optBits |= OPT_BIT_VALUE_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueSignature() valueSignature} to valueSignature.
     * @param valueSignature The value for valueSignature
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSignature(Signature valueSignature) {
      checkNotIsSet(valueSignatureIsSet(), "valueSignature");
      this.valueSignature = Objects.requireNonNull(valueSignature, "valueSignature");
      optBits |= OPT_BIT_VALUE_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueSignature() valueSignature} to valueSignature.
     * @param valueSignature The value for valueSignature
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueSignature")
    public final Builder valueSignature(Optional<? extends Signature> valueSignature) {
      checkNotIsSet(valueSignatureIsSet(), "valueSignature");
      this.valueSignature = valueSignature.orElse(null);
      optBits |= OPT_BIT_VALUE_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueParameterDefinition() valueParameterDefinition} to valueParameterDefinition.
     * @param valueParameterDefinition The value for valueParameterDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueParameterDefinition(ParameterDefinition valueParameterDefinition) {
      checkNotIsSet(valueParameterDefinitionIsSet(), "valueParameterDefinition");
      this.valueParameterDefinition = Objects.requireNonNull(valueParameterDefinition, "valueParameterDefinition");
      optBits |= OPT_BIT_VALUE_PARAMETER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueParameterDefinition() valueParameterDefinition} to valueParameterDefinition.
     * @param valueParameterDefinition The value for valueParameterDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueParameterDefinition")
    public final Builder valueParameterDefinition(Optional<? extends ParameterDefinition> valueParameterDefinition) {
      checkNotIsSet(valueParameterDefinitionIsSet(), "valueParameterDefinition");
      this.valueParameterDefinition = valueParameterDefinition.orElse(null);
      optBits |= OPT_BIT_VALUE_PARAMETER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDataRequirement() valueDataRequirement} to valueDataRequirement.
     * @param valueDataRequirement The value for valueDataRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDataRequirement(DataRequirement valueDataRequirement) {
      checkNotIsSet(valueDataRequirementIsSet(), "valueDataRequirement");
      this.valueDataRequirement = Objects.requireNonNull(valueDataRequirement, "valueDataRequirement");
      optBits |= OPT_BIT_VALUE_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDataRequirement() valueDataRequirement} to valueDataRequirement.
     * @param valueDataRequirement The value for valueDataRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDataRequirement")
    public final Builder valueDataRequirement(Optional<? extends DataRequirement> valueDataRequirement) {
      checkNotIsSet(valueDataRequirementIsSet(), "valueDataRequirement");
      this.valueDataRequirement = valueDataRequirement.orElse(null);
      optBits |= OPT_BIT_VALUE_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueTriggerDefinition() valueTriggerDefinition} to valueTriggerDefinition.
     * @param valueTriggerDefinition The value for valueTriggerDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueTriggerDefinition(TriggerDefinition valueTriggerDefinition) {
      checkNotIsSet(valueTriggerDefinitionIsSet(), "valueTriggerDefinition");
      this.valueTriggerDefinition = Objects.requireNonNull(valueTriggerDefinition, "valueTriggerDefinition");
      optBits |= OPT_BIT_VALUE_TRIGGER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueTriggerDefinition() valueTriggerDefinition} to valueTriggerDefinition.
     * @param valueTriggerDefinition The value for valueTriggerDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueTriggerDefinition")
    public final Builder valueTriggerDefinition(Optional<? extends TriggerDefinition> valueTriggerDefinition) {
      checkNotIsSet(valueTriggerDefinitionIsSet(), "valueTriggerDefinition");
      this.valueTriggerDefinition = valueTriggerDefinition.orElse(null);
      optBits |= OPT_BIT_VALUE_TRIGGER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueUnsignedInt() valueUnsignedInt} to valueUnsignedInt.
     * @param valueUnsignedInt The value for valueUnsignedInt
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueUnsignedInt(double valueUnsignedInt) {
      checkNotIsSet(valueUnsignedIntIsSet(), "valueUnsignedInt");
      this.valueUnsignedInt = valueUnsignedInt;
      optBits |= OPT_BIT_VALUE_UNSIGNED_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueUnsignedInt() valueUnsignedInt} to valueUnsignedInt.
     * @param valueUnsignedInt The value for valueUnsignedInt
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueUnsignedInt")
    public final Builder valueUnsignedInt(Optional<Double> valueUnsignedInt) {
      checkNotIsSet(valueUnsignedIntIsSet(), "valueUnsignedInt");
      this.valueUnsignedInt = valueUnsignedInt.orElse(null);
      optBits |= OPT_BIT_VALUE_UNSIGNED_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDecimal() valueDecimal} to valueDecimal.
     * @param valueDecimal The value for valueDecimal
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDecimal(double valueDecimal) {
      checkNotIsSet(valueDecimalIsSet(), "valueDecimal");
      this.valueDecimal = valueDecimal;
      optBits |= OPT_BIT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueDecimal() valueDecimal} to valueDecimal.
     * @param valueDecimal The value for valueDecimal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDecimal")
    public final Builder valueDecimal(Optional<Double> valueDecimal) {
      checkNotIsSet(valueDecimalIsSet(), "valueDecimal");
      this.valueDecimal = valueDecimal.orElse(null);
      optBits |= OPT_BIT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueRelatedArtifact() valueRelatedArtifact} to valueRelatedArtifact.
     * @param valueRelatedArtifact The value for valueRelatedArtifact
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRelatedArtifact(RelatedArtifact valueRelatedArtifact) {
      checkNotIsSet(valueRelatedArtifactIsSet(), "valueRelatedArtifact");
      this.valueRelatedArtifact = Objects.requireNonNull(valueRelatedArtifact, "valueRelatedArtifact");
      optBits |= OPT_BIT_VALUE_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueRelatedArtifact() valueRelatedArtifact} to valueRelatedArtifact.
     * @param valueRelatedArtifact The value for valueRelatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueRelatedArtifact")
    public final Builder valueRelatedArtifact(Optional<? extends RelatedArtifact> valueRelatedArtifact) {
      checkNotIsSet(valueRelatedArtifactIsSet(), "valueRelatedArtifact");
      this.valueRelatedArtifact = valueRelatedArtifact.orElse(null);
      optBits |= OPT_BIT_VALUE_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#name() name} to name.
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
     * Initializes the optional value {@link Parameters_Parameter#name() name} to name.
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
     * Initializes the optional value {@link Parameters_Parameter#valueHumanName() valueHumanName} to valueHumanName.
     * @param valueHumanName The value for valueHumanName
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueHumanName(HumanName valueHumanName) {
      checkNotIsSet(valueHumanNameIsSet(), "valueHumanName");
      this.valueHumanName = Objects.requireNonNull(valueHumanName, "valueHumanName");
      optBits |= OPT_BIT_VALUE_HUMAN_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueHumanName() valueHumanName} to valueHumanName.
     * @param valueHumanName The value for valueHumanName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueHumanName")
    public final Builder valueHumanName(Optional<? extends HumanName> valueHumanName) {
      checkNotIsSet(valueHumanNameIsSet(), "valueHumanName");
      this.valueHumanName = valueHumanName.orElse(null);
      optBits |= OPT_BIT_VALUE_HUMAN_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(ResourceList resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends ResourceList> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueAge() valueAge} to valueAge.
     * @param valueAge The value for valueAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueAge(Age valueAge) {
      checkNotIsSet(valueAgeIsSet(), "valueAge");
      this.valueAge = Objects.requireNonNull(valueAge, "valueAge");
      optBits |= OPT_BIT_VALUE_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueAge() valueAge} to valueAge.
     * @param valueAge The value for valueAge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueAge")
    public final Builder valueAge(Optional<? extends Age> valueAge) {
      checkNotIsSet(valueAgeIsSet(), "valueAge");
      this.valueAge = valueAge.orElse(null);
      optBits |= OPT_BIT_VALUE_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueMoney() valueMoney} to valueMoney.
     * @param valueMoney The value for valueMoney
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueMoney(Money valueMoney) {
      checkNotIsSet(valueMoneyIsSet(), "valueMoney");
      this.valueMoney = Objects.requireNonNull(valueMoney, "valueMoney");
      optBits |= OPT_BIT_VALUE_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueMoney() valueMoney} to valueMoney.
     * @param valueMoney The value for valueMoney
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueMoney")
    public final Builder valueMoney(Optional<? extends Money> valueMoney) {
      checkNotIsSet(valueMoneyIsSet(), "valueMoney");
      this.valueMoney = valueMoney.orElse(null);
      optBits |= OPT_BIT_VALUE_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#part() part} to part.
     * @param part The value for part
     * @return {@code this} builder for chained invocation
     */
    public final Builder part(List<Parameters_Parameter> part) {
      checkNotIsSet(partIsSet(), "part");
      this.part = Objects.requireNonNull(part, "part");
      optBits |= OPT_BIT_PART;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#part() part} to part.
     * @param part The value for part
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("part")
    public final Builder part(Optional<? extends List<Parameters_Parameter>> part) {
      checkNotIsSet(partIsSet(), "part");
      this.part = part.orElse(null);
      optBits |= OPT_BIT_PART;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
     * @param valueBase64Binary The value for valueBase64Binary
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueBase64Binary(String valueBase64Binary) {
      checkNotIsSet(valueBase64BinaryIsSet(), "valueBase64Binary");
      this.valueBase64Binary = Objects.requireNonNull(valueBase64Binary, "valueBase64Binary");
      optBits |= OPT_BIT_VALUE_BASE64_BINARY;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
     * @param valueBase64Binary The value for valueBase64Binary
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueBase64Binary")
    public final Builder valueBase64Binary(Optional<String> valueBase64Binary) {
      checkNotIsSet(valueBase64BinaryIsSet(), "valueBase64Binary");
      this.valueBase64Binary = valueBase64Binary.orElse(null);
      optBits |= OPT_BIT_VALUE_BASE64_BINARY;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueOid() valueOid} to valueOid.
     * @param valueOid The value for valueOid
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueOid(String valueOid) {
      checkNotIsSet(valueOidIsSet(), "valueOid");
      this.valueOid = Objects.requireNonNull(valueOid, "valueOid");
      optBits |= OPT_BIT_VALUE_OID;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueOid() valueOid} to valueOid.
     * @param valueOid The value for valueOid
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueOid")
    public final Builder valueOid(Optional<String> valueOid) {
      checkNotIsSet(valueOidIsSet(), "valueOid");
      this.valueOid = valueOid.orElse(null);
      optBits |= OPT_BIT_VALUE_OID;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueMarkdown() valueMarkdown} to valueMarkdown.
     * @param valueMarkdown The value for valueMarkdown
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueMarkdown(String valueMarkdown) {
      checkNotIsSet(valueMarkdownIsSet(), "valueMarkdown");
      this.valueMarkdown = Objects.requireNonNull(valueMarkdown, "valueMarkdown");
      optBits |= OPT_BIT_VALUE_MARKDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueMarkdown() valueMarkdown} to valueMarkdown.
     * @param valueMarkdown The value for valueMarkdown
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueMarkdown")
    public final Builder valueMarkdown(Optional<String> valueMarkdown) {
      checkNotIsSet(valueMarkdownIsSet(), "valueMarkdown");
      this.valueMarkdown = valueMarkdown.orElse(null);
      optBits |= OPT_BIT_VALUE_MARKDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueAddress() valueAddress} to valueAddress.
     * @param valueAddress The value for valueAddress
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueAddress(Address valueAddress) {
      checkNotIsSet(valueAddressIsSet(), "valueAddress");
      this.valueAddress = Objects.requireNonNull(valueAddress, "valueAddress");
      optBits |= OPT_BIT_VALUE_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueAddress() valueAddress} to valueAddress.
     * @param valueAddress The value for valueAddress
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueAddress")
    public final Builder valueAddress(Optional<? extends Address> valueAddress) {
      checkNotIsSet(valueAddressIsSet(), "valueAddress");
      this.valueAddress = valueAddress.orElse(null);
      optBits |= OPT_BIT_VALUE_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Parameters_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Parameters_Parameter#valueContributor() valueContributor} to valueContributor.
     * @param valueContributor The value for valueContributor
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueContributor(Contributor valueContributor) {
      checkNotIsSet(valueContributorIsSet(), "valueContributor");
      this.valueContributor = Objects.requireNonNull(valueContributor, "valueContributor");
      optBits |= OPT_BIT_VALUE_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueContributor() valueContributor} to valueContributor.
     * @param valueContributor The value for valueContributor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueContributor")
    public final Builder valueContributor(Optional<? extends Contributor> valueContributor) {
      checkNotIsSet(valueContributorIsSet(), "valueContributor");
      this.valueContributor = valueContributor.orElse(null);
      optBits |= OPT_BIT_VALUE_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueString")
    public final Builder valueString(Optional<String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueReference(Reference valueReference) {
      checkNotIsSet(valueReferenceIsSet(), "valueReference");
      this.valueReference = Objects.requireNonNull(valueReference, "valueReference");
      optBits |= OPT_BIT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueReference")
    public final Builder valueReference(Optional<? extends Reference> valueReference) {
      checkNotIsSet(valueReferenceIsSet(), "valueReference");
      this.valueReference = valueReference.orElse(null);
      optBits |= OPT_BIT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueContactDetail() valueContactDetail} to valueContactDetail.
     * @param valueContactDetail The value for valueContactDetail
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueContactDetail(ContactDetail valueContactDetail) {
      checkNotIsSet(valueContactDetailIsSet(), "valueContactDetail");
      this.valueContactDetail = Objects.requireNonNull(valueContactDetail, "valueContactDetail");
      optBits |= OPT_BIT_VALUE_CONTACT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valueContactDetail() valueContactDetail} to valueContactDetail.
     * @param valueContactDetail The value for valueContactDetail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueContactDetail")
    public final Builder valueContactDetail(Optional<? extends ContactDetail> valueContactDetail) {
      checkNotIsSet(valueContactDetailIsSet(), "valueContactDetail");
      this.valueContactDetail = valueContactDetail.orElse(null);
      optBits |= OPT_BIT_VALUE_CONTACT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valuePositiveInt() valuePositiveInt} to valuePositiveInt.
     * @param valuePositiveInt The value for valuePositiveInt
     * @return {@code this} builder for chained invocation
     */
    public final Builder valuePositiveInt(double valuePositiveInt) {
      checkNotIsSet(valuePositiveIntIsSet(), "valuePositiveInt");
      this.valuePositiveInt = valuePositiveInt;
      optBits |= OPT_BIT_VALUE_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link Parameters_Parameter#valuePositiveInt() valuePositiveInt} to valuePositiveInt.
     * @param valuePositiveInt The value for valuePositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valuePositiveInt")
    public final Builder valuePositiveInt(Optional<Double> valuePositiveInt) {
      checkNotIsSet(valuePositiveIntIsSet(), "valuePositiveInt");
      this.valuePositiveInt = valuePositiveInt.orElse(null);
      optBits |= OPT_BIT_VALUE_POSITIVE_INT;
      return this;
    }

    /**
     * Builds a new {@link Parameters_Parameter Parameters_Parameter}.
     * @return An immutable instance of Parameters_Parameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Parameters_Parameter build() {
      return new ImmutableParameters_Parameter(
          valueAttachment,
          valueRatio,
          valueTiming,
          valueTime,
          valueUsageContext,
          valueBoolean,
          valuePeriod,
          valueExpression,
          valueCoding,
          valueId,
          valueContactPoint,
          valueUri,
          valueRange,
          valueCodeableConcept,
          valueDuration,
          valueDate,
          valueQuantity,
          id,
          extension,
          valueIdentifier,
          valueDistance,
          valueInstant,
          valueCount,
          valueAnnotation,
          valueMeta,
          valueDateTime,
          valueUuid,
          valueCanonical,
          valueInteger,
          valueUrl,
          valueCode,
          valueSampledData,
          valueDosage,
          valueSignature,
          valueParameterDefinition,
          valueDataRequirement,
          valueTriggerDefinition,
          valueUnsignedInt,
          valueDecimal,
          valueRelatedArtifact,
          name,
          valueHumanName,
          resource,
          valueAge,
          valueMoney,
          part,
          valueBase64Binary,
          valueOid,
          valueMarkdown,
          valueAddress,
          modifierExtension,
          valueContributor,
          valueString,
          valueReference,
          valueContactDetail,
          valuePositiveInt);
    }

    private boolean valueAttachmentIsSet() {
      return (optBits & OPT_BIT_VALUE_ATTACHMENT) != 0;
    }

    private boolean valueRatioIsSet() {
      return (optBits & OPT_BIT_VALUE_RATIO) != 0;
    }

    private boolean valueTimingIsSet() {
      return (optBits & OPT_BIT_VALUE_TIMING) != 0;
    }

    private boolean valueTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_TIME) != 0;
    }

    private boolean valueUsageContextIsSet() {
      return (optBits & OPT_BIT_VALUE_USAGE_CONTEXT) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valuePeriodIsSet() {
      return (optBits & OPT_BIT_VALUE_PERIOD) != 0;
    }

    private boolean valueExpressionIsSet() {
      return (optBits & OPT_BIT_VALUE_EXPRESSION) != 0;
    }

    private boolean valueCodingIsSet() {
      return (optBits & OPT_BIT_VALUE_CODING) != 0;
    }

    private boolean valueIdIsSet() {
      return (optBits & OPT_BIT_VALUE_ID) != 0;
    }

    private boolean valueContactPointIsSet() {
      return (optBits & OPT_BIT_VALUE_CONTACT_POINT) != 0;
    }

    private boolean valueUriIsSet() {
      return (optBits & OPT_BIT_VALUE_URI) != 0;
    }

    private boolean valueRangeIsSet() {
      return (optBits & OPT_BIT_VALUE_RANGE) != 0;
    }

    private boolean valueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private boolean valueDurationIsSet() {
      return (optBits & OPT_BIT_VALUE_DURATION) != 0;
    }

    private boolean valueDateIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueIdentifierIsSet() {
      return (optBits & OPT_BIT_VALUE_IDENTIFIER) != 0;
    }

    private boolean valueDistanceIsSet() {
      return (optBits & OPT_BIT_VALUE_DISTANCE) != 0;
    }

    private boolean valueInstantIsSet() {
      return (optBits & OPT_BIT_VALUE_INSTANT) != 0;
    }

    private boolean valueCountIsSet() {
      return (optBits & OPT_BIT_VALUE_COUNT) != 0;
    }

    private boolean valueAnnotationIsSet() {
      return (optBits & OPT_BIT_VALUE_ANNOTATION) != 0;
    }

    private boolean valueMetaIsSet() {
      return (optBits & OPT_BIT_VALUE_META) != 0;
    }

    private boolean valueDateTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE_TIME) != 0;
    }

    private boolean valueUuidIsSet() {
      return (optBits & OPT_BIT_VALUE_UUID) != 0;
    }

    private boolean valueCanonicalIsSet() {
      return (optBits & OPT_BIT_VALUE_CANONICAL) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean valueUrlIsSet() {
      return (optBits & OPT_BIT_VALUE_URL) != 0;
    }

    private boolean valueCodeIsSet() {
      return (optBits & OPT_BIT_VALUE_CODE) != 0;
    }

    private boolean valueSampledDataIsSet() {
      return (optBits & OPT_BIT_VALUE_SAMPLED_DATA) != 0;
    }

    private boolean valueDosageIsSet() {
      return (optBits & OPT_BIT_VALUE_DOSAGE) != 0;
    }

    private boolean valueSignatureIsSet() {
      return (optBits & OPT_BIT_VALUE_SIGNATURE) != 0;
    }

    private boolean valueParameterDefinitionIsSet() {
      return (optBits & OPT_BIT_VALUE_PARAMETER_DEFINITION) != 0;
    }

    private boolean valueDataRequirementIsSet() {
      return (optBits & OPT_BIT_VALUE_DATA_REQUIREMENT) != 0;
    }

    private boolean valueTriggerDefinitionIsSet() {
      return (optBits & OPT_BIT_VALUE_TRIGGER_DEFINITION) != 0;
    }

    private boolean valueUnsignedIntIsSet() {
      return (optBits & OPT_BIT_VALUE_UNSIGNED_INT) != 0;
    }

    private boolean valueDecimalIsSet() {
      return (optBits & OPT_BIT_VALUE_DECIMAL) != 0;
    }

    private boolean valueRelatedArtifactIsSet() {
      return (optBits & OPT_BIT_VALUE_RELATED_ARTIFACT) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean valueHumanNameIsSet() {
      return (optBits & OPT_BIT_VALUE_HUMAN_NAME) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean valueAgeIsSet() {
      return (optBits & OPT_BIT_VALUE_AGE) != 0;
    }

    private boolean valueMoneyIsSet() {
      return (optBits & OPT_BIT_VALUE_MONEY) != 0;
    }

    private boolean partIsSet() {
      return (optBits & OPT_BIT_PART) != 0;
    }

    private boolean valueBase64BinaryIsSet() {
      return (optBits & OPT_BIT_VALUE_BASE64_BINARY) != 0;
    }

    private boolean valueOidIsSet() {
      return (optBits & OPT_BIT_VALUE_OID) != 0;
    }

    private boolean valueMarkdownIsSet() {
      return (optBits & OPT_BIT_VALUE_MARKDOWN) != 0;
    }

    private boolean valueAddressIsSet() {
      return (optBits & OPT_BIT_VALUE_ADDRESS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueContributorIsSet() {
      return (optBits & OPT_BIT_VALUE_CONTRIBUTOR) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueReferenceIsSet() {
      return (optBits & OPT_BIT_VALUE_REFERENCE) != 0;
    }

    private boolean valueContactDetailIsSet() {
      return (optBits & OPT_BIT_VALUE_CONTACT_DETAIL) != 0;
    }

    private boolean valuePositiveIntIsSet() {
      return (optBits & OPT_BIT_VALUE_POSITIVE_INT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Parameters_Parameter is strict, attribute is already set: ".concat(name));
    }
  }
}
