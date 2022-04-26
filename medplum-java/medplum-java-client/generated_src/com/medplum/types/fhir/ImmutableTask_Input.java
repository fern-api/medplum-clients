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
 * Immutable implementation of {@link Task_Input}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTask_Input.builder()}.
 */
@Generated(from = "Task_Input", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTask_Input implements Task_Input {
  private final @Nullable Boolean valueBoolean;
  private final @Nullable String valueUuid;
  private final @Nullable HumanName valueHumanName;
  private final @Nullable Duration valueDuration;
  private final CodeableConcept type;
  private final @Nullable Signature valueSignature;
  private final @Nullable Distance valueDistance;
  private final @Nullable String id;
  private final @Nullable CodeableConcept valueCodeableConcept;
  private final @Nullable SampledData valueSampledData;
  private final @Nullable Expression valueExpression;
  private final @Nullable String valueBase64Binary;
  private final @Nullable UsageContext valueUsageContext;
  private final @Nullable Double valueUnsignedInt;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable ParameterDefinition valueParameterDefinition;
  private final @Nullable Period valuePeriod;
  private final @Nullable Double valueDecimal;
  private final @Nullable String valueDateTime;
  private final @Nullable Address valueAddress;
  private final @Nullable Money valueMoney;
  private final @Nullable Double valuePositiveInt;
  private final @Nullable String valueString;
  private final @Nullable Identifier valueIdentifier;
  private final @Nullable Timing valueTiming;
  private final @Nullable String valueCode;
  private final @Nullable DataRequirement valueDataRequirement;
  private final @Nullable Meta valueMeta;
  private final @Nullable String valueOid;
  private final @Nullable Dosage valueDosage;
  private final @Nullable Ratio valueRatio;
  private final @Nullable ContactPoint valueContactPoint;
  private final @Nullable Attachment valueAttachment;
  private final @Nullable Reference valueReference;
  private final @Nullable String valueCanonical;
  private final @Nullable Coding valueCoding;
  private final @Nullable List<Extension> extension;
  private final @Nullable Double valueInteger;
  private final @Nullable Age valueAge;
  private final @Nullable String valueTime;
  private final @Nullable ContactDetail valueContactDetail;
  private final @Nullable TriggerDefinition valueTriggerDefinition;
  private final @Nullable Annotation valueAnnotation;
  private final @Nullable Contributor valueContributor;
  private final @Nullable String valueDate;
  private final @Nullable Count valueCount;
  private final @Nullable String valueInstant;
  private final @Nullable Range valueRange;
  private final @Nullable String valueUri;
  private final @Nullable Quantity valueQuantity;
  private final @Nullable String valueMarkdown;
  private final @Nullable String valueUrl;
  private final @Nullable RelatedArtifact valueRelatedArtifact;
  private final @Nullable String valueId;

  private ImmutableTask_Input(
      @Nullable Boolean valueBoolean,
      @Nullable String valueUuid,
      @Nullable HumanName valueHumanName,
      @Nullable Duration valueDuration,
      CodeableConcept type,
      @Nullable Signature valueSignature,
      @Nullable Distance valueDistance,
      @Nullable String id,
      @Nullable CodeableConcept valueCodeableConcept,
      @Nullable SampledData valueSampledData,
      @Nullable Expression valueExpression,
      @Nullable String valueBase64Binary,
      @Nullable UsageContext valueUsageContext,
      @Nullable Double valueUnsignedInt,
      @Nullable List<Extension> modifierExtension,
      @Nullable ParameterDefinition valueParameterDefinition,
      @Nullable Period valuePeriod,
      @Nullable Double valueDecimal,
      @Nullable String valueDateTime,
      @Nullable Address valueAddress,
      @Nullable Money valueMoney,
      @Nullable Double valuePositiveInt,
      @Nullable String valueString,
      @Nullable Identifier valueIdentifier,
      @Nullable Timing valueTiming,
      @Nullable String valueCode,
      @Nullable DataRequirement valueDataRequirement,
      @Nullable Meta valueMeta,
      @Nullable String valueOid,
      @Nullable Dosage valueDosage,
      @Nullable Ratio valueRatio,
      @Nullable ContactPoint valueContactPoint,
      @Nullable Attachment valueAttachment,
      @Nullable Reference valueReference,
      @Nullable String valueCanonical,
      @Nullable Coding valueCoding,
      @Nullable List<Extension> extension,
      @Nullable Double valueInteger,
      @Nullable Age valueAge,
      @Nullable String valueTime,
      @Nullable ContactDetail valueContactDetail,
      @Nullable TriggerDefinition valueTriggerDefinition,
      @Nullable Annotation valueAnnotation,
      @Nullable Contributor valueContributor,
      @Nullable String valueDate,
      @Nullable Count valueCount,
      @Nullable String valueInstant,
      @Nullable Range valueRange,
      @Nullable String valueUri,
      @Nullable Quantity valueQuantity,
      @Nullable String valueMarkdown,
      @Nullable String valueUrl,
      @Nullable RelatedArtifact valueRelatedArtifact,
      @Nullable String valueId) {
    this.valueBoolean = valueBoolean;
    this.valueUuid = valueUuid;
    this.valueHumanName = valueHumanName;
    this.valueDuration = valueDuration;
    this.type = type;
    this.valueSignature = valueSignature;
    this.valueDistance = valueDistance;
    this.id = id;
    this.valueCodeableConcept = valueCodeableConcept;
    this.valueSampledData = valueSampledData;
    this.valueExpression = valueExpression;
    this.valueBase64Binary = valueBase64Binary;
    this.valueUsageContext = valueUsageContext;
    this.valueUnsignedInt = valueUnsignedInt;
    this.modifierExtension = modifierExtension;
    this.valueParameterDefinition = valueParameterDefinition;
    this.valuePeriod = valuePeriod;
    this.valueDecimal = valueDecimal;
    this.valueDateTime = valueDateTime;
    this.valueAddress = valueAddress;
    this.valueMoney = valueMoney;
    this.valuePositiveInt = valuePositiveInt;
    this.valueString = valueString;
    this.valueIdentifier = valueIdentifier;
    this.valueTiming = valueTiming;
    this.valueCode = valueCode;
    this.valueDataRequirement = valueDataRequirement;
    this.valueMeta = valueMeta;
    this.valueOid = valueOid;
    this.valueDosage = valueDosage;
    this.valueRatio = valueRatio;
    this.valueContactPoint = valueContactPoint;
    this.valueAttachment = valueAttachment;
    this.valueReference = valueReference;
    this.valueCanonical = valueCanonical;
    this.valueCoding = valueCoding;
    this.extension = extension;
    this.valueInteger = valueInteger;
    this.valueAge = valueAge;
    this.valueTime = valueTime;
    this.valueContactDetail = valueContactDetail;
    this.valueTriggerDefinition = valueTriggerDefinition;
    this.valueAnnotation = valueAnnotation;
    this.valueContributor = valueContributor;
    this.valueDate = valueDate;
    this.valueCount = valueCount;
    this.valueInstant = valueInstant;
    this.valueRange = valueRange;
    this.valueUri = valueUri;
    this.valueQuantity = valueQuantity;
    this.valueMarkdown = valueMarkdown;
    this.valueUrl = valueUrl;
    this.valueRelatedArtifact = valueRelatedArtifact;
    this.valueId = valueId;
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
   * @return The value of the {@code valueUuid} attribute
   */
  @JsonProperty("valueUuid")
  @Override
  public Optional<String> valueUuid() {
    return Optional.ofNullable(valueUuid);
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
   * @return The value of the {@code valueDuration} attribute
   */
  @JsonProperty("valueDuration")
  @Override
  public Optional<Duration> valueDuration() {
    return Optional.ofNullable(valueDuration);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
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
   * @return The value of the {@code valueDistance} attribute
   */
  @JsonProperty("valueDistance")
  @Override
  public Optional<Distance> valueDistance() {
    return Optional.ofNullable(valueDistance);
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
   * @return The value of the {@code valueCodeableConcept} attribute
   */
  @JsonProperty("valueCodeableConcept")
  @Override
  public Optional<CodeableConcept> valueCodeableConcept() {
    return Optional.ofNullable(valueCodeableConcept);
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
   * @return The value of the {@code valueExpression} attribute
   */
  @JsonProperty("valueExpression")
  @Override
  public Optional<Expression> valueExpression() {
    return Optional.ofNullable(valueExpression);
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
   * @return The value of the {@code valueUsageContext} attribute
   */
  @JsonProperty("valueUsageContext")
  @Override
  public Optional<UsageContext> valueUsageContext() {
    return Optional.ofNullable(valueUsageContext);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code valuePeriod} attribute
   */
  @JsonProperty("valuePeriod")
  @Override
  public Optional<Period> valuePeriod() {
    return Optional.ofNullable(valuePeriod);
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
   * @return The value of the {@code valueDateTime} attribute
   */
  @JsonProperty("valueDateTime")
  @Override
  public Optional<String> valueDateTime() {
    return Optional.ofNullable(valueDateTime);
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
   * @return The value of the {@code valueMoney} attribute
   */
  @JsonProperty("valueMoney")
  @Override
  public Optional<Money> valueMoney() {
    return Optional.ofNullable(valueMoney);
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
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
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
   * @return The value of the {@code valueTiming} attribute
   */
  @JsonProperty("valueTiming")
  @Override
  public Optional<Timing> valueTiming() {
    return Optional.ofNullable(valueTiming);
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
   * @return The value of the {@code valueDataRequirement} attribute
   */
  @JsonProperty("valueDataRequirement")
  @Override
  public Optional<DataRequirement> valueDataRequirement() {
    return Optional.ofNullable(valueDataRequirement);
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
   * @return The value of the {@code valueOid} attribute
   */
  @JsonProperty("valueOid")
  @Override
  public Optional<String> valueOid() {
    return Optional.ofNullable(valueOid);
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
   * @return The value of the {@code valueRatio} attribute
   */
  @JsonProperty("valueRatio")
  @Override
  public Optional<Ratio> valueRatio() {
    return Optional.ofNullable(valueRatio);
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
   * @return The value of the {@code valueAttachment} attribute
   */
  @JsonProperty("valueAttachment")
  @Override
  public Optional<Attachment> valueAttachment() {
    return Optional.ofNullable(valueAttachment);
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
   * @return The value of the {@code valueCanonical} attribute
   */
  @JsonProperty("valueCanonical")
  @Override
  public Optional<String> valueCanonical() {
    return Optional.ofNullable(valueCanonical);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code valueAge} attribute
   */
  @JsonProperty("valueAge")
  @Override
  public Optional<Age> valueAge() {
    return Optional.ofNullable(valueAge);
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
   * @return The value of the {@code valueContactDetail} attribute
   */
  @JsonProperty("valueContactDetail")
  @Override
  public Optional<ContactDetail> valueContactDetail() {
    return Optional.ofNullable(valueContactDetail);
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
   * @return The value of the {@code valueAnnotation} attribute
   */
  @JsonProperty("valueAnnotation")
  @Override
  public Optional<Annotation> valueAnnotation() {
    return Optional.ofNullable(valueAnnotation);
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
   * @return The value of the {@code valueDate} attribute
   */
  @JsonProperty("valueDate")
  @Override
  public Optional<String> valueDate() {
    return Optional.ofNullable(valueDate);
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
   * @return The value of the {@code valueInstant} attribute
   */
  @JsonProperty("valueInstant")
  @Override
  public Optional<String> valueInstant() {
    return Optional.ofNullable(valueInstant);
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
   * @return The value of the {@code valueUri} attribute
   */
  @JsonProperty("valueUri")
  @Override
  public Optional<String> valueUri() {
    return Optional.ofNullable(valueUri);
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
   * @return The value of the {@code valueMarkdown} attribute
   */
  @JsonProperty("valueMarkdown")
  @Override
  public Optional<String> valueMarkdown() {
    return Optional.ofNullable(valueMarkdown);
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
   * @return The value of the {@code valueRelatedArtifact} attribute
   */
  @JsonProperty("valueRelatedArtifact")
  @Override
  public Optional<RelatedArtifact> valueRelatedArtifact() {
    return Optional.ofNullable(valueRelatedArtifact);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableTask_Input(
        newValue,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableTask_Input(
        value,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueUuid() valueUuid} attribute.
   * @param value The value for valueUuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueUuid(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueUuid");
    if (Objects.equals(this.valueUuid, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        newValue,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueUuid() valueUuid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueUuid(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueUuid, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        value,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueHumanName() valueHumanName} attribute.
   * @param value The value for valueHumanName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueHumanName(HumanName value) {
    @Nullable HumanName newValue = Objects.requireNonNull(value, "valueHumanName");
    if (this.valueHumanName == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        newValue,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueHumanName() valueHumanName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueHumanName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueHumanName(Optional<? extends HumanName> optional) {
    @Nullable HumanName value = optional.orElse(null);
    if (this.valueHumanName == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        value,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueDuration() valueDuration} attribute.
   * @param value The value for valueDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "valueDuration");
    if (this.valueDuration == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        newValue,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueDuration() valueDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.valueDuration == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        value,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Task_Input#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTask_Input withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        newValue,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueSignature() valueSignature} attribute.
   * @param value The value for valueSignature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueSignature(Signature value) {
    @Nullable Signature newValue = Objects.requireNonNull(value, "valueSignature");
    if (this.valueSignature == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        newValue,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueSignature() valueSignature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSignature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueSignature(Optional<? extends Signature> optional) {
    @Nullable Signature value = optional.orElse(null);
    if (this.valueSignature == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        value,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueDistance() valueDistance} attribute.
   * @param value The value for valueDistance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueDistance(Distance value) {
    @Nullable Distance newValue = Objects.requireNonNull(value, "valueDistance");
    if (this.valueDistance == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        newValue,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueDistance() valueDistance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDistance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueDistance(Optional<? extends Distance> optional) {
    @Nullable Distance value = optional.orElse(null);
    if (this.valueDistance == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        value,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        newValue,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        value,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueCodeableConcept() valueCodeableConcept} attribute.
   * @param value The value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "valueCodeableConcept");
    if (this.valueCodeableConcept == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        newValue,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueCodeableConcept() valueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.valueCodeableConcept == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        value,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueSampledData() valueSampledData} attribute.
   * @param value The value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueSampledData(SampledData value) {
    @Nullable SampledData newValue = Objects.requireNonNull(value, "valueSampledData");
    if (this.valueSampledData == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        newValue,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueSampledData() valueSampledData} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueSampledData(Optional<? extends SampledData> optional) {
    @Nullable SampledData value = optional.orElse(null);
    if (this.valueSampledData == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        value,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueExpression() valueExpression} attribute.
   * @param value The value for valueExpression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueExpression(Expression value) {
    @Nullable Expression newValue = Objects.requireNonNull(value, "valueExpression");
    if (this.valueExpression == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        newValue,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueExpression() valueExpression} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueExpression
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueExpression(Optional<? extends Expression> optional) {
    @Nullable Expression value = optional.orElse(null);
    if (this.valueExpression == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        value,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueBase64Binary() valueBase64Binary} attribute.
   * @param value The value for valueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueBase64Binary(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueBase64Binary");
    if (Objects.equals(this.valueBase64Binary, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        newValue,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueBase64Binary() valueBase64Binary} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueBase64Binary(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueBase64Binary, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        value,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueUsageContext() valueUsageContext} attribute.
   * @param value The value for valueUsageContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueUsageContext(UsageContext value) {
    @Nullable UsageContext newValue = Objects.requireNonNull(value, "valueUsageContext");
    if (this.valueUsageContext == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        newValue,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueUsageContext() valueUsageContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUsageContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueUsageContext(Optional<? extends UsageContext> optional) {
    @Nullable UsageContext value = optional.orElse(null);
    if (this.valueUsageContext == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        value,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueUnsignedInt() valueUnsignedInt} attribute.
   * @param value The value for valueUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueUnsignedInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueUnsignedInt, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        newValue,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueUnsignedInt() valueUnsignedInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueUnsignedInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueUnsignedInt, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        value,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        newValue,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        value,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueParameterDefinition() valueParameterDefinition} attribute.
   * @param value The value for valueParameterDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueParameterDefinition(ParameterDefinition value) {
    @Nullable ParameterDefinition newValue = Objects.requireNonNull(value, "valueParameterDefinition");
    if (this.valueParameterDefinition == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        newValue,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueParameterDefinition() valueParameterDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueParameterDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueParameterDefinition(Optional<? extends ParameterDefinition> optional) {
    @Nullable ParameterDefinition value = optional.orElse(null);
    if (this.valueParameterDefinition == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        value,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valuePeriod() valuePeriod} attribute.
   * @param value The value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValuePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "valuePeriod");
    if (this.valuePeriod == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        newValue,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valuePeriod() valuePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValuePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.valuePeriod == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        value,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueDecimal() valueDecimal} attribute.
   * @param value The value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueDecimal(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueDecimal, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        newValue,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueDecimal() valueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueDecimal(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueDecimal, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        value,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueDateTime() valueDateTime} attribute.
   * @param value The value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDateTime");
    if (Objects.equals(this.valueDateTime, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        newValue,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueDateTime() valueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDateTime, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        value,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueAddress() valueAddress} attribute.
   * @param value The value for valueAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueAddress(Address value) {
    @Nullable Address newValue = Objects.requireNonNull(value, "valueAddress");
    if (this.valueAddress == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        newValue,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueAddress() valueAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueAddress(Optional<? extends Address> optional) {
    @Nullable Address value = optional.orElse(null);
    if (this.valueAddress == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        value,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueMoney() valueMoney} attribute.
   * @param value The value for valueMoney
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueMoney(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "valueMoney");
    if (this.valueMoney == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        newValue,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueMoney() valueMoney} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMoney
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueMoney(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.valueMoney == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        value,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valuePositiveInt() valuePositiveInt} attribute.
   * @param value The value for valuePositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValuePositiveInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valuePositiveInt, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        newValue,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valuePositiveInt() valuePositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuePositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValuePositiveInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valuePositiveInt, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        value,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        newValue,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        value,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueIdentifier() valueIdentifier} attribute.
   * @param value The value for valueIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "valueIdentifier");
    if (this.valueIdentifier == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        newValue,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueIdentifier() valueIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.valueIdentifier == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        value,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueTiming() valueTiming} attribute.
   * @param value The value for valueTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "valueTiming");
    if (this.valueTiming == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        newValue,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueTiming() valueTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.valueTiming == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        value,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueCode() valueCode} attribute.
   * @param value The value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueCode(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueCode");
    if (Objects.equals(this.valueCode, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        newValue,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueCode() valueCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueCode(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueCode, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        value,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueDataRequirement() valueDataRequirement} attribute.
   * @param value The value for valueDataRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueDataRequirement(DataRequirement value) {
    @Nullable DataRequirement newValue = Objects.requireNonNull(value, "valueDataRequirement");
    if (this.valueDataRequirement == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        newValue,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueDataRequirement() valueDataRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDataRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueDataRequirement(Optional<? extends DataRequirement> optional) {
    @Nullable DataRequirement value = optional.orElse(null);
    if (this.valueDataRequirement == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        value,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueMeta() valueMeta} attribute.
   * @param value The value for valueMeta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "valueMeta");
    if (this.valueMeta == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        newValue,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueMeta() valueMeta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMeta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.valueMeta == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        value,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueOid() valueOid} attribute.
   * @param value The value for valueOid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueOid(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueOid");
    if (Objects.equals(this.valueOid, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        newValue,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueOid() valueOid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueOid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueOid(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueOid, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        value,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueDosage() valueDosage} attribute.
   * @param value The value for valueDosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueDosage(Dosage value) {
    @Nullable Dosage newValue = Objects.requireNonNull(value, "valueDosage");
    if (this.valueDosage == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        newValue,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueDosage() valueDosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueDosage(Optional<? extends Dosage> optional) {
    @Nullable Dosage value = optional.orElse(null);
    if (this.valueDosage == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        value,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueRatio() valueRatio} attribute.
   * @param value The value for valueRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueRatio(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "valueRatio");
    if (this.valueRatio == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        newValue,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueRatio() valueRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueRatio(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.valueRatio == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        value,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueContactPoint() valueContactPoint} attribute.
   * @param value The value for valueContactPoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueContactPoint(ContactPoint value) {
    @Nullable ContactPoint newValue = Objects.requireNonNull(value, "valueContactPoint");
    if (this.valueContactPoint == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        newValue,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueContactPoint() valueContactPoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueContactPoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueContactPoint(Optional<? extends ContactPoint> optional) {
    @Nullable ContactPoint value = optional.orElse(null);
    if (this.valueContactPoint == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        value,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueAttachment() valueAttachment} attribute.
   * @param value The value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "valueAttachment");
    if (this.valueAttachment == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        newValue,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueAttachment() valueAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.valueAttachment == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        value,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueReference() valueReference} attribute.
   * @param value The value for valueReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "valueReference");
    if (this.valueReference == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        newValue,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueReference() valueReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.valueReference == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        value,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueCanonical() valueCanonical} attribute.
   * @param value The value for valueCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueCanonical(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueCanonical");
    if (Objects.equals(this.valueCanonical, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        newValue,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueCanonical() valueCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueCanonical(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueCanonical, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        value,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueCoding() valueCoding} attribute.
   * @param value The value for valueCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueCoding(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "valueCoding");
    if (this.valueCoding == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        newValue,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueCoding() valueCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueCoding(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.valueCoding == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        value,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        newValue,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        value,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        newValue,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        value,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueAge() valueAge} attribute.
   * @param value The value for valueAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "valueAge");
    if (this.valueAge == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        newValue,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueAge() valueAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.valueAge == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        value,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueTime() valueTime} attribute.
   * @param value The value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueTime");
    if (Objects.equals(this.valueTime, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        newValue,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueTime() valueTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueTime, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        value,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueContactDetail() valueContactDetail} attribute.
   * @param value The value for valueContactDetail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueContactDetail(ContactDetail value) {
    @Nullable ContactDetail newValue = Objects.requireNonNull(value, "valueContactDetail");
    if (this.valueContactDetail == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        newValue,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueContactDetail() valueContactDetail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueContactDetail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueContactDetail(Optional<? extends ContactDetail> optional) {
    @Nullable ContactDetail value = optional.orElse(null);
    if (this.valueContactDetail == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        value,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueTriggerDefinition() valueTriggerDefinition} attribute.
   * @param value The value for valueTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueTriggerDefinition(TriggerDefinition value) {
    @Nullable TriggerDefinition newValue = Objects.requireNonNull(value, "valueTriggerDefinition");
    if (this.valueTriggerDefinition == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        newValue,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueTriggerDefinition() valueTriggerDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueTriggerDefinition(Optional<? extends TriggerDefinition> optional) {
    @Nullable TriggerDefinition value = optional.orElse(null);
    if (this.valueTriggerDefinition == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        value,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueAnnotation() valueAnnotation} attribute.
   * @param value The value for valueAnnotation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueAnnotation(Annotation value) {
    @Nullable Annotation newValue = Objects.requireNonNull(value, "valueAnnotation");
    if (this.valueAnnotation == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        newValue,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueAnnotation() valueAnnotation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAnnotation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueAnnotation(Optional<? extends Annotation> optional) {
    @Nullable Annotation value = optional.orElse(null);
    if (this.valueAnnotation == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        value,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueContributor() valueContributor} attribute.
   * @param value The value for valueContributor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueContributor(Contributor value) {
    @Nullable Contributor newValue = Objects.requireNonNull(value, "valueContributor");
    if (this.valueContributor == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        newValue,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueContributor() valueContributor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueContributor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueContributor(Optional<? extends Contributor> optional) {
    @Nullable Contributor value = optional.orElse(null);
    if (this.valueContributor == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        value,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueDate() valueDate} attribute.
   * @param value The value for valueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDate");
    if (Objects.equals(this.valueDate, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        newValue,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueDate() valueDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDate, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        value,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueCount() valueCount} attribute.
   * @param value The value for valueCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueCount(Count value) {
    @Nullable Count newValue = Objects.requireNonNull(value, "valueCount");
    if (this.valueCount == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        newValue,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueCount() valueCount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueCount(Optional<? extends Count> optional) {
    @Nullable Count value = optional.orElse(null);
    if (this.valueCount == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        value,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueInstant() valueInstant} attribute.
   * @param value The value for valueInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueInstant(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueInstant");
    if (Objects.equals(this.valueInstant, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        newValue,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueInstant() valueInstant} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueInstant(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueInstant, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        value,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueRange() valueRange} attribute.
   * @param value The value for valueRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "valueRange");
    if (this.valueRange == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        newValue,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueRange() valueRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.valueRange == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        value,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueUri() valueUri} attribute.
   * @param value The value for valueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueUri");
    if (Objects.equals(this.valueUri, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        newValue,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueUri() valueUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueUri, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        value,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        newValue,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        value,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueMarkdown() valueMarkdown} attribute.
   * @param value The value for valueMarkdown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueMarkdown(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueMarkdown");
    if (Objects.equals(this.valueMarkdown, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        newValue,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueMarkdown() valueMarkdown} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMarkdown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueMarkdown(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueMarkdown, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        value,
        this.valueUrl,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueUrl() valueUrl} attribute.
   * @param value The value for valueUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueUrl(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueUrl");
    if (Objects.equals(this.valueUrl, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        newValue,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueUrl() valueUrl} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueUrl(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueUrl, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        value,
        this.valueRelatedArtifact,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueRelatedArtifact() valueRelatedArtifact} attribute.
   * @param value The value for valueRelatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueRelatedArtifact(RelatedArtifact value) {
    @Nullable RelatedArtifact newValue = Objects.requireNonNull(value, "valueRelatedArtifact");
    if (this.valueRelatedArtifact == newValue) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        newValue,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueRelatedArtifact() valueRelatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRelatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Input withValueRelatedArtifact(Optional<? extends RelatedArtifact> optional) {
    @Nullable RelatedArtifact value = optional.orElse(null);
    if (this.valueRelatedArtifact == value) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        value,
        this.valueId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Input#valueId() valueId} attribute.
   * @param value The value for valueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueId");
    if (Objects.equals(this.valueId, newValue)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Input#valueId() valueId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Input withValueId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueId, value)) return this;
    return new ImmutableTask_Input(
        this.valueBoolean,
        this.valueUuid,
        this.valueHumanName,
        this.valueDuration,
        this.type,
        this.valueSignature,
        this.valueDistance,
        this.id,
        this.valueCodeableConcept,
        this.valueSampledData,
        this.valueExpression,
        this.valueBase64Binary,
        this.valueUsageContext,
        this.valueUnsignedInt,
        this.modifierExtension,
        this.valueParameterDefinition,
        this.valuePeriod,
        this.valueDecimal,
        this.valueDateTime,
        this.valueAddress,
        this.valueMoney,
        this.valuePositiveInt,
        this.valueString,
        this.valueIdentifier,
        this.valueTiming,
        this.valueCode,
        this.valueDataRequirement,
        this.valueMeta,
        this.valueOid,
        this.valueDosage,
        this.valueRatio,
        this.valueContactPoint,
        this.valueAttachment,
        this.valueReference,
        this.valueCanonical,
        this.valueCoding,
        this.extension,
        this.valueInteger,
        this.valueAge,
        this.valueTime,
        this.valueContactDetail,
        this.valueTriggerDefinition,
        this.valueAnnotation,
        this.valueContributor,
        this.valueDate,
        this.valueCount,
        this.valueInstant,
        this.valueRange,
        this.valueUri,
        this.valueQuantity,
        this.valueMarkdown,
        this.valueUrl,
        this.valueRelatedArtifact,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTask_Input} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTask_Input
        && equalTo((ImmutableTask_Input) another);
  }

  private boolean equalTo(ImmutableTask_Input another) {
    return Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(valueUuid, another.valueUuid)
        && Objects.equals(valueHumanName, another.valueHumanName)
        && Objects.equals(valueDuration, another.valueDuration)
        && type.equals(another.type)
        && Objects.equals(valueSignature, another.valueSignature)
        && Objects.equals(valueDistance, another.valueDistance)
        && Objects.equals(id, another.id)
        && Objects.equals(valueCodeableConcept, another.valueCodeableConcept)
        && Objects.equals(valueSampledData, another.valueSampledData)
        && Objects.equals(valueExpression, another.valueExpression)
        && Objects.equals(valueBase64Binary, another.valueBase64Binary)
        && Objects.equals(valueUsageContext, another.valueUsageContext)
        && Objects.equals(valueUnsignedInt, another.valueUnsignedInt)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(valueParameterDefinition, another.valueParameterDefinition)
        && Objects.equals(valuePeriod, another.valuePeriod)
        && Objects.equals(valueDecimal, another.valueDecimal)
        && Objects.equals(valueDateTime, another.valueDateTime)
        && Objects.equals(valueAddress, another.valueAddress)
        && Objects.equals(valueMoney, another.valueMoney)
        && Objects.equals(valuePositiveInt, another.valuePositiveInt)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(valueIdentifier, another.valueIdentifier)
        && Objects.equals(valueTiming, another.valueTiming)
        && Objects.equals(valueCode, another.valueCode)
        && Objects.equals(valueDataRequirement, another.valueDataRequirement)
        && Objects.equals(valueMeta, another.valueMeta)
        && Objects.equals(valueOid, another.valueOid)
        && Objects.equals(valueDosage, another.valueDosage)
        && Objects.equals(valueRatio, another.valueRatio)
        && Objects.equals(valueContactPoint, another.valueContactPoint)
        && Objects.equals(valueAttachment, another.valueAttachment)
        && Objects.equals(valueReference, another.valueReference)
        && Objects.equals(valueCanonical, another.valueCanonical)
        && Objects.equals(valueCoding, another.valueCoding)
        && Objects.equals(extension, another.extension)
        && Objects.equals(valueInteger, another.valueInteger)
        && Objects.equals(valueAge, another.valueAge)
        && Objects.equals(valueTime, another.valueTime)
        && Objects.equals(valueContactDetail, another.valueContactDetail)
        && Objects.equals(valueTriggerDefinition, another.valueTriggerDefinition)
        && Objects.equals(valueAnnotation, another.valueAnnotation)
        && Objects.equals(valueContributor, another.valueContributor)
        && Objects.equals(valueDate, another.valueDate)
        && Objects.equals(valueCount, another.valueCount)
        && Objects.equals(valueInstant, another.valueInstant)
        && Objects.equals(valueRange, another.valueRange)
        && Objects.equals(valueUri, another.valueUri)
        && Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(valueMarkdown, another.valueMarkdown)
        && Objects.equals(valueUrl, another.valueUrl)
        && Objects.equals(valueRelatedArtifact, another.valueRelatedArtifact)
        && Objects.equals(valueId, another.valueId);
  }

  /**
   * Computes a hash code from attributes: {@code valueBoolean}, {@code valueUuid}, {@code valueHumanName}, {@code valueDuration}, {@code type}, {@code valueSignature}, {@code valueDistance}, {@code id}, {@code valueCodeableConcept}, {@code valueSampledData}, {@code valueExpression}, {@code valueBase64Binary}, {@code valueUsageContext}, {@code valueUnsignedInt}, {@code modifierExtension}, {@code valueParameterDefinition}, {@code valuePeriod}, {@code valueDecimal}, {@code valueDateTime}, {@code valueAddress}, {@code valueMoney}, {@code valuePositiveInt}, {@code valueString}, {@code valueIdentifier}, {@code valueTiming}, {@code valueCode}, {@code valueDataRequirement}, {@code valueMeta}, {@code valueOid}, {@code valueDosage}, {@code valueRatio}, {@code valueContactPoint}, {@code valueAttachment}, {@code valueReference}, {@code valueCanonical}, {@code valueCoding}, {@code extension}, {@code valueInteger}, {@code valueAge}, {@code valueTime}, {@code valueContactDetail}, {@code valueTriggerDefinition}, {@code valueAnnotation}, {@code valueContributor}, {@code valueDate}, {@code valueCount}, {@code valueInstant}, {@code valueRange}, {@code valueUri}, {@code valueQuantity}, {@code valueMarkdown}, {@code valueUrl}, {@code valueRelatedArtifact}, {@code valueId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(valueUuid);
    h += (h << 5) + Objects.hashCode(valueHumanName);
    h += (h << 5) + Objects.hashCode(valueDuration);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(valueSignature);
    h += (h << 5) + Objects.hashCode(valueDistance);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(valueCodeableConcept);
    h += (h << 5) + Objects.hashCode(valueSampledData);
    h += (h << 5) + Objects.hashCode(valueExpression);
    h += (h << 5) + Objects.hashCode(valueBase64Binary);
    h += (h << 5) + Objects.hashCode(valueUsageContext);
    h += (h << 5) + Objects.hashCode(valueUnsignedInt);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(valueParameterDefinition);
    h += (h << 5) + Objects.hashCode(valuePeriod);
    h += (h << 5) + Objects.hashCode(valueDecimal);
    h += (h << 5) + Objects.hashCode(valueDateTime);
    h += (h << 5) + Objects.hashCode(valueAddress);
    h += (h << 5) + Objects.hashCode(valueMoney);
    h += (h << 5) + Objects.hashCode(valuePositiveInt);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(valueIdentifier);
    h += (h << 5) + Objects.hashCode(valueTiming);
    h += (h << 5) + Objects.hashCode(valueCode);
    h += (h << 5) + Objects.hashCode(valueDataRequirement);
    h += (h << 5) + Objects.hashCode(valueMeta);
    h += (h << 5) + Objects.hashCode(valueOid);
    h += (h << 5) + Objects.hashCode(valueDosage);
    h += (h << 5) + Objects.hashCode(valueRatio);
    h += (h << 5) + Objects.hashCode(valueContactPoint);
    h += (h << 5) + Objects.hashCode(valueAttachment);
    h += (h << 5) + Objects.hashCode(valueReference);
    h += (h << 5) + Objects.hashCode(valueCanonical);
    h += (h << 5) + Objects.hashCode(valueCoding);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(valueInteger);
    h += (h << 5) + Objects.hashCode(valueAge);
    h += (h << 5) + Objects.hashCode(valueTime);
    h += (h << 5) + Objects.hashCode(valueContactDetail);
    h += (h << 5) + Objects.hashCode(valueTriggerDefinition);
    h += (h << 5) + Objects.hashCode(valueAnnotation);
    h += (h << 5) + Objects.hashCode(valueContributor);
    h += (h << 5) + Objects.hashCode(valueDate);
    h += (h << 5) + Objects.hashCode(valueCount);
    h += (h << 5) + Objects.hashCode(valueInstant);
    h += (h << 5) + Objects.hashCode(valueRange);
    h += (h << 5) + Objects.hashCode(valueUri);
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(valueMarkdown);
    h += (h << 5) + Objects.hashCode(valueUrl);
    h += (h << 5) + Objects.hashCode(valueRelatedArtifact);
    h += (h << 5) + Objects.hashCode(valueId);
    return h;
  }

  /**
   * Prints the immutable value {@code Task_Input} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Task_Input{");
    if (valueBoolean != null) {
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valueUuid != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("valueUuid=").append(valueUuid);
    }
    if (valueHumanName != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("valueHumanName=").append(valueHumanName);
    }
    if (valueDuration != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("valueDuration=").append(valueDuration);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("type=").append(type);
    if (valueSignature != null) {
      builder.append(", ");
      builder.append("valueSignature=").append(valueSignature);
    }
    if (valueDistance != null) {
      builder.append(", ");
      builder.append("valueDistance=").append(valueDistance);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (valueCodeableConcept != null) {
      builder.append(", ");
      builder.append("valueCodeableConcept=").append(valueCodeableConcept);
    }
    if (valueSampledData != null) {
      builder.append(", ");
      builder.append("valueSampledData=").append(valueSampledData);
    }
    if (valueExpression != null) {
      builder.append(", ");
      builder.append("valueExpression=").append(valueExpression);
    }
    if (valueBase64Binary != null) {
      builder.append(", ");
      builder.append("valueBase64Binary=").append(valueBase64Binary);
    }
    if (valueUsageContext != null) {
      builder.append(", ");
      builder.append("valueUsageContext=").append(valueUsageContext);
    }
    if (valueUnsignedInt != null) {
      builder.append(", ");
      builder.append("valueUnsignedInt=").append(valueUnsignedInt);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueParameterDefinition != null) {
      builder.append(", ");
      builder.append("valueParameterDefinition=").append(valueParameterDefinition);
    }
    if (valuePeriod != null) {
      builder.append(", ");
      builder.append("valuePeriod=").append(valuePeriod);
    }
    if (valueDecimal != null) {
      builder.append(", ");
      builder.append("valueDecimal=").append(valueDecimal);
    }
    if (valueDateTime != null) {
      builder.append(", ");
      builder.append("valueDateTime=").append(valueDateTime);
    }
    if (valueAddress != null) {
      builder.append(", ");
      builder.append("valueAddress=").append(valueAddress);
    }
    if (valueMoney != null) {
      builder.append(", ");
      builder.append("valueMoney=").append(valueMoney);
    }
    if (valuePositiveInt != null) {
      builder.append(", ");
      builder.append("valuePositiveInt=").append(valuePositiveInt);
    }
    if (valueString != null) {
      builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueIdentifier != null) {
      builder.append(", ");
      builder.append("valueIdentifier=").append(valueIdentifier);
    }
    if (valueTiming != null) {
      builder.append(", ");
      builder.append("valueTiming=").append(valueTiming);
    }
    if (valueCode != null) {
      builder.append(", ");
      builder.append("valueCode=").append(valueCode);
    }
    if (valueDataRequirement != null) {
      builder.append(", ");
      builder.append("valueDataRequirement=").append(valueDataRequirement);
    }
    if (valueMeta != null) {
      builder.append(", ");
      builder.append("valueMeta=").append(valueMeta);
    }
    if (valueOid != null) {
      builder.append(", ");
      builder.append("valueOid=").append(valueOid);
    }
    if (valueDosage != null) {
      builder.append(", ");
      builder.append("valueDosage=").append(valueDosage);
    }
    if (valueRatio != null) {
      builder.append(", ");
      builder.append("valueRatio=").append(valueRatio);
    }
    if (valueContactPoint != null) {
      builder.append(", ");
      builder.append("valueContactPoint=").append(valueContactPoint);
    }
    if (valueAttachment != null) {
      builder.append(", ");
      builder.append("valueAttachment=").append(valueAttachment);
    }
    if (valueReference != null) {
      builder.append(", ");
      builder.append("valueReference=").append(valueReference);
    }
    if (valueCanonical != null) {
      builder.append(", ");
      builder.append("valueCanonical=").append(valueCanonical);
    }
    if (valueCoding != null) {
      builder.append(", ");
      builder.append("valueCoding=").append(valueCoding);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (valueInteger != null) {
      builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (valueAge != null) {
      builder.append(", ");
      builder.append("valueAge=").append(valueAge);
    }
    if (valueTime != null) {
      builder.append(", ");
      builder.append("valueTime=").append(valueTime);
    }
    if (valueContactDetail != null) {
      builder.append(", ");
      builder.append("valueContactDetail=").append(valueContactDetail);
    }
    if (valueTriggerDefinition != null) {
      builder.append(", ");
      builder.append("valueTriggerDefinition=").append(valueTriggerDefinition);
    }
    if (valueAnnotation != null) {
      builder.append(", ");
      builder.append("valueAnnotation=").append(valueAnnotation);
    }
    if (valueContributor != null) {
      builder.append(", ");
      builder.append("valueContributor=").append(valueContributor);
    }
    if (valueDate != null) {
      builder.append(", ");
      builder.append("valueDate=").append(valueDate);
    }
    if (valueCount != null) {
      builder.append(", ");
      builder.append("valueCount=").append(valueCount);
    }
    if (valueInstant != null) {
      builder.append(", ");
      builder.append("valueInstant=").append(valueInstant);
    }
    if (valueRange != null) {
      builder.append(", ");
      builder.append("valueRange=").append(valueRange);
    }
    if (valueUri != null) {
      builder.append(", ");
      builder.append("valueUri=").append(valueUri);
    }
    if (valueQuantity != null) {
      builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (valueMarkdown != null) {
      builder.append(", ");
      builder.append("valueMarkdown=").append(valueMarkdown);
    }
    if (valueUrl != null) {
      builder.append(", ");
      builder.append("valueUrl=").append(valueUrl);
    }
    if (valueRelatedArtifact != null) {
      builder.append(", ");
      builder.append("valueRelatedArtifact=").append(valueRelatedArtifact);
    }
    if (valueId != null) {
      builder.append(", ");
      builder.append("valueId=").append(valueId);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Task_Input", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Task_Input {
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<String> valueUuid = Optional.empty();
    boolean valueUuidIsSet;
    @Nullable Optional<HumanName> valueHumanName = Optional.empty();
    boolean valueHumanNameIsSet;
    @Nullable Optional<Duration> valueDuration = Optional.empty();
    boolean valueDurationIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<Signature> valueSignature = Optional.empty();
    boolean valueSignatureIsSet;
    @Nullable Optional<Distance> valueDistance = Optional.empty();
    boolean valueDistanceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> valueCodeableConcept = Optional.empty();
    boolean valueCodeableConceptIsSet;
    @Nullable Optional<SampledData> valueSampledData = Optional.empty();
    boolean valueSampledDataIsSet;
    @Nullable Optional<Expression> valueExpression = Optional.empty();
    boolean valueExpressionIsSet;
    @Nullable Optional<String> valueBase64Binary = Optional.empty();
    boolean valueBase64BinaryIsSet;
    @Nullable Optional<UsageContext> valueUsageContext = Optional.empty();
    boolean valueUsageContextIsSet;
    @Nullable Optional<Double> valueUnsignedInt = Optional.empty();
    boolean valueUnsignedIntIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<ParameterDefinition> valueParameterDefinition = Optional.empty();
    boolean valueParameterDefinitionIsSet;
    @Nullable Optional<Period> valuePeriod = Optional.empty();
    boolean valuePeriodIsSet;
    @Nullable Optional<Double> valueDecimal = Optional.empty();
    boolean valueDecimalIsSet;
    @Nullable Optional<String> valueDateTime = Optional.empty();
    boolean valueDateTimeIsSet;
    @Nullable Optional<Address> valueAddress = Optional.empty();
    boolean valueAddressIsSet;
    @Nullable Optional<Money> valueMoney = Optional.empty();
    boolean valueMoneyIsSet;
    @Nullable Optional<Double> valuePositiveInt = Optional.empty();
    boolean valuePositiveIntIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<Identifier> valueIdentifier = Optional.empty();
    boolean valueIdentifierIsSet;
    @Nullable Optional<Timing> valueTiming = Optional.empty();
    boolean valueTimingIsSet;
    @Nullable Optional<String> valueCode = Optional.empty();
    boolean valueCodeIsSet;
    @Nullable Optional<DataRequirement> valueDataRequirement = Optional.empty();
    boolean valueDataRequirementIsSet;
    @Nullable Optional<Meta> valueMeta = Optional.empty();
    boolean valueMetaIsSet;
    @Nullable Optional<String> valueOid = Optional.empty();
    boolean valueOidIsSet;
    @Nullable Optional<Dosage> valueDosage = Optional.empty();
    boolean valueDosageIsSet;
    @Nullable Optional<Ratio> valueRatio = Optional.empty();
    boolean valueRatioIsSet;
    @Nullable Optional<ContactPoint> valueContactPoint = Optional.empty();
    boolean valueContactPointIsSet;
    @Nullable Optional<Attachment> valueAttachment = Optional.empty();
    boolean valueAttachmentIsSet;
    @Nullable Optional<Reference> valueReference = Optional.empty();
    boolean valueReferenceIsSet;
    @Nullable Optional<String> valueCanonical = Optional.empty();
    boolean valueCanonicalIsSet;
    @Nullable Optional<Coding> valueCoding = Optional.empty();
    boolean valueCodingIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Double> valueInteger = Optional.empty();
    boolean valueIntegerIsSet;
    @Nullable Optional<Age> valueAge = Optional.empty();
    boolean valueAgeIsSet;
    @Nullable Optional<String> valueTime = Optional.empty();
    boolean valueTimeIsSet;
    @Nullable Optional<ContactDetail> valueContactDetail = Optional.empty();
    boolean valueContactDetailIsSet;
    @Nullable Optional<TriggerDefinition> valueTriggerDefinition = Optional.empty();
    boolean valueTriggerDefinitionIsSet;
    @Nullable Optional<Annotation> valueAnnotation = Optional.empty();
    boolean valueAnnotationIsSet;
    @Nullable Optional<Contributor> valueContributor = Optional.empty();
    boolean valueContributorIsSet;
    @Nullable Optional<String> valueDate = Optional.empty();
    boolean valueDateIsSet;
    @Nullable Optional<Count> valueCount = Optional.empty();
    boolean valueCountIsSet;
    @Nullable Optional<String> valueInstant = Optional.empty();
    boolean valueInstantIsSet;
    @Nullable Optional<Range> valueRange = Optional.empty();
    boolean valueRangeIsSet;
    @Nullable Optional<String> valueUri = Optional.empty();
    boolean valueUriIsSet;
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<String> valueMarkdown = Optional.empty();
    boolean valueMarkdownIsSet;
    @Nullable Optional<String> valueUrl = Optional.empty();
    boolean valueUrlIsSet;
    @Nullable Optional<RelatedArtifact> valueRelatedArtifact = Optional.empty();
    boolean valueRelatedArtifactIsSet;
    @Nullable Optional<String> valueId = Optional.empty();
    boolean valueIdIsSet;
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Optional<Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @JsonProperty("valueUuid")
    public void setValueUuid(Optional<String> valueUuid) {
      this.valueUuid = valueUuid;
      this.valueUuidIsSet = true;
    }
    @JsonProperty("valueHumanName")
    public void setValueHumanName(Optional<HumanName> valueHumanName) {
      this.valueHumanName = valueHumanName;
      this.valueHumanNameIsSet = true;
    }
    @JsonProperty("valueDuration")
    public void setValueDuration(Optional<Duration> valueDuration) {
      this.valueDuration = valueDuration;
      this.valueDurationIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("valueSignature")
    public void setValueSignature(Optional<Signature> valueSignature) {
      this.valueSignature = valueSignature;
      this.valueSignatureIsSet = true;
    }
    @JsonProperty("valueDistance")
    public void setValueDistance(Optional<Distance> valueDistance) {
      this.valueDistance = valueDistance;
      this.valueDistanceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(Optional<CodeableConcept> valueCodeableConcept) {
      this.valueCodeableConcept = valueCodeableConcept;
      this.valueCodeableConceptIsSet = true;
    }
    @JsonProperty("valueSampledData")
    public void setValueSampledData(Optional<SampledData> valueSampledData) {
      this.valueSampledData = valueSampledData;
      this.valueSampledDataIsSet = true;
    }
    @JsonProperty("valueExpression")
    public void setValueExpression(Optional<Expression> valueExpression) {
      this.valueExpression = valueExpression;
      this.valueExpressionIsSet = true;
    }
    @JsonProperty("valueBase64Binary")
    public void setValueBase64Binary(Optional<String> valueBase64Binary) {
      this.valueBase64Binary = valueBase64Binary;
      this.valueBase64BinaryIsSet = true;
    }
    @JsonProperty("valueUsageContext")
    public void setValueUsageContext(Optional<UsageContext> valueUsageContext) {
      this.valueUsageContext = valueUsageContext;
      this.valueUsageContextIsSet = true;
    }
    @JsonProperty("valueUnsignedInt")
    public void setValueUnsignedInt(Optional<Double> valueUnsignedInt) {
      this.valueUnsignedInt = valueUnsignedInt;
      this.valueUnsignedIntIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("valueParameterDefinition")
    public void setValueParameterDefinition(Optional<ParameterDefinition> valueParameterDefinition) {
      this.valueParameterDefinition = valueParameterDefinition;
      this.valueParameterDefinitionIsSet = true;
    }
    @JsonProperty("valuePeriod")
    public void setValuePeriod(Optional<Period> valuePeriod) {
      this.valuePeriod = valuePeriod;
      this.valuePeriodIsSet = true;
    }
    @JsonProperty("valueDecimal")
    public void setValueDecimal(Optional<Double> valueDecimal) {
      this.valueDecimal = valueDecimal;
      this.valueDecimalIsSet = true;
    }
    @JsonProperty("valueDateTime")
    public void setValueDateTime(Optional<String> valueDateTime) {
      this.valueDateTime = valueDateTime;
      this.valueDateTimeIsSet = true;
    }
    @JsonProperty("valueAddress")
    public void setValueAddress(Optional<Address> valueAddress) {
      this.valueAddress = valueAddress;
      this.valueAddressIsSet = true;
    }
    @JsonProperty("valueMoney")
    public void setValueMoney(Optional<Money> valueMoney) {
      this.valueMoney = valueMoney;
      this.valueMoneyIsSet = true;
    }
    @JsonProperty("valuePositiveInt")
    public void setValuePositiveInt(Optional<Double> valuePositiveInt) {
      this.valuePositiveInt = valuePositiveInt;
      this.valuePositiveIntIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("valueIdentifier")
    public void setValueIdentifier(Optional<Identifier> valueIdentifier) {
      this.valueIdentifier = valueIdentifier;
      this.valueIdentifierIsSet = true;
    }
    @JsonProperty("valueTiming")
    public void setValueTiming(Optional<Timing> valueTiming) {
      this.valueTiming = valueTiming;
      this.valueTimingIsSet = true;
    }
    @JsonProperty("valueCode")
    public void setValueCode(Optional<String> valueCode) {
      this.valueCode = valueCode;
      this.valueCodeIsSet = true;
    }
    @JsonProperty("valueDataRequirement")
    public void setValueDataRequirement(Optional<DataRequirement> valueDataRequirement) {
      this.valueDataRequirement = valueDataRequirement;
      this.valueDataRequirementIsSet = true;
    }
    @JsonProperty("valueMeta")
    public void setValueMeta(Optional<Meta> valueMeta) {
      this.valueMeta = valueMeta;
      this.valueMetaIsSet = true;
    }
    @JsonProperty("valueOid")
    public void setValueOid(Optional<String> valueOid) {
      this.valueOid = valueOid;
      this.valueOidIsSet = true;
    }
    @JsonProperty("valueDosage")
    public void setValueDosage(Optional<Dosage> valueDosage) {
      this.valueDosage = valueDosage;
      this.valueDosageIsSet = true;
    }
    @JsonProperty("valueRatio")
    public void setValueRatio(Optional<Ratio> valueRatio) {
      this.valueRatio = valueRatio;
      this.valueRatioIsSet = true;
    }
    @JsonProperty("valueContactPoint")
    public void setValueContactPoint(Optional<ContactPoint> valueContactPoint) {
      this.valueContactPoint = valueContactPoint;
      this.valueContactPointIsSet = true;
    }
    @JsonProperty("valueAttachment")
    public void setValueAttachment(Optional<Attachment> valueAttachment) {
      this.valueAttachment = valueAttachment;
      this.valueAttachmentIsSet = true;
    }
    @JsonProperty("valueReference")
    public void setValueReference(Optional<Reference> valueReference) {
      this.valueReference = valueReference;
      this.valueReferenceIsSet = true;
    }
    @JsonProperty("valueCanonical")
    public void setValueCanonical(Optional<String> valueCanonical) {
      this.valueCanonical = valueCanonical;
      this.valueCanonicalIsSet = true;
    }
    @JsonProperty("valueCoding")
    public void setValueCoding(Optional<Coding> valueCoding) {
      this.valueCoding = valueCoding;
      this.valueCodingIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("valueInteger")
    public void setValueInteger(Optional<Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @JsonProperty("valueAge")
    public void setValueAge(Optional<Age> valueAge) {
      this.valueAge = valueAge;
      this.valueAgeIsSet = true;
    }
    @JsonProperty("valueTime")
    public void setValueTime(Optional<String> valueTime) {
      this.valueTime = valueTime;
      this.valueTimeIsSet = true;
    }
    @JsonProperty("valueContactDetail")
    public void setValueContactDetail(Optional<ContactDetail> valueContactDetail) {
      this.valueContactDetail = valueContactDetail;
      this.valueContactDetailIsSet = true;
    }
    @JsonProperty("valueTriggerDefinition")
    public void setValueTriggerDefinition(Optional<TriggerDefinition> valueTriggerDefinition) {
      this.valueTriggerDefinition = valueTriggerDefinition;
      this.valueTriggerDefinitionIsSet = true;
    }
    @JsonProperty("valueAnnotation")
    public void setValueAnnotation(Optional<Annotation> valueAnnotation) {
      this.valueAnnotation = valueAnnotation;
      this.valueAnnotationIsSet = true;
    }
    @JsonProperty("valueContributor")
    public void setValueContributor(Optional<Contributor> valueContributor) {
      this.valueContributor = valueContributor;
      this.valueContributorIsSet = true;
    }
    @JsonProperty("valueDate")
    public void setValueDate(Optional<String> valueDate) {
      this.valueDate = valueDate;
      this.valueDateIsSet = true;
    }
    @JsonProperty("valueCount")
    public void setValueCount(Optional<Count> valueCount) {
      this.valueCount = valueCount;
      this.valueCountIsSet = true;
    }
    @JsonProperty("valueInstant")
    public void setValueInstant(Optional<String> valueInstant) {
      this.valueInstant = valueInstant;
      this.valueInstantIsSet = true;
    }
    @JsonProperty("valueRange")
    public void setValueRange(Optional<Range> valueRange) {
      this.valueRange = valueRange;
      this.valueRangeIsSet = true;
    }
    @JsonProperty("valueUri")
    public void setValueUri(Optional<String> valueUri) {
      this.valueUri = valueUri;
      this.valueUriIsSet = true;
    }
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @JsonProperty("valueMarkdown")
    public void setValueMarkdown(Optional<String> valueMarkdown) {
      this.valueMarkdown = valueMarkdown;
      this.valueMarkdownIsSet = true;
    }
    @JsonProperty("valueUrl")
    public void setValueUrl(Optional<String> valueUrl) {
      this.valueUrl = valueUrl;
      this.valueUrlIsSet = true;
    }
    @JsonProperty("valueRelatedArtifact")
    public void setValueRelatedArtifact(Optional<RelatedArtifact> valueRelatedArtifact) {
      this.valueRelatedArtifact = valueRelatedArtifact;
      this.valueRelatedArtifactIsSet = true;
    }
    @JsonProperty("valueId")
    public void setValueId(Optional<String> valueId) {
      this.valueId = valueId;
      this.valueIdIsSet = true;
    }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueUuid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<HumanName> valueHumanName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> valueDuration() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Signature> valueSignature() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Distance> valueDistance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> valueCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SampledData> valueSampledData() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Expression> valueExpression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueBase64Binary() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UsageContext> valueUsageContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueUnsignedInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ParameterDefinition> valueParameterDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> valuePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Address> valueAddress() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> valueMoney() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valuePositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> valueIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> valueTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DataRequirement> valueDataRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> valueMeta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueOid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Dosage> valueDosage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> valueRatio() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ContactPoint> valueContactPoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> valueAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> valueReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> valueCoding() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> valueAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ContactDetail> valueContactDetail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TriggerDefinition> valueTriggerDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Annotation> valueAnnotation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Contributor> valueContributor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Count> valueCount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueInstant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> valueRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueMarkdown() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueUrl() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<RelatedArtifact> valueRelatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTask_Input fromJson(Json json) {
    ImmutableTask_Input.Builder builder = ((ImmutableTask_Input.Builder) ImmutableTask_Input.builder());
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valueUuidIsSet) {
      builder.valueUuid(json.valueUuid);
    }
    if (json.valueHumanNameIsSet) {
      builder.valueHumanName(json.valueHumanName);
    }
    if (json.valueDurationIsSet) {
      builder.valueDuration(json.valueDuration);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.valueSignatureIsSet) {
      builder.valueSignature(json.valueSignature);
    }
    if (json.valueDistanceIsSet) {
      builder.valueDistance(json.valueDistance);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueCodeableConceptIsSet) {
      builder.valueCodeableConcept(json.valueCodeableConcept);
    }
    if (json.valueSampledDataIsSet) {
      builder.valueSampledData(json.valueSampledData);
    }
    if (json.valueExpressionIsSet) {
      builder.valueExpression(json.valueExpression);
    }
    if (json.valueBase64BinaryIsSet) {
      builder.valueBase64Binary(json.valueBase64Binary);
    }
    if (json.valueUsageContextIsSet) {
      builder.valueUsageContext(json.valueUsageContext);
    }
    if (json.valueUnsignedIntIsSet) {
      builder.valueUnsignedInt(json.valueUnsignedInt);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueParameterDefinitionIsSet) {
      builder.valueParameterDefinition(json.valueParameterDefinition);
    }
    if (json.valuePeriodIsSet) {
      builder.valuePeriod(json.valuePeriod);
    }
    if (json.valueDecimalIsSet) {
      builder.valueDecimal(json.valueDecimal);
    }
    if (json.valueDateTimeIsSet) {
      builder.valueDateTime(json.valueDateTime);
    }
    if (json.valueAddressIsSet) {
      builder.valueAddress(json.valueAddress);
    }
    if (json.valueMoneyIsSet) {
      builder.valueMoney(json.valueMoney);
    }
    if (json.valuePositiveIntIsSet) {
      builder.valuePositiveInt(json.valuePositiveInt);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueIdentifierIsSet) {
      builder.valueIdentifier(json.valueIdentifier);
    }
    if (json.valueTimingIsSet) {
      builder.valueTiming(json.valueTiming);
    }
    if (json.valueCodeIsSet) {
      builder.valueCode(json.valueCode);
    }
    if (json.valueDataRequirementIsSet) {
      builder.valueDataRequirement(json.valueDataRequirement);
    }
    if (json.valueMetaIsSet) {
      builder.valueMeta(json.valueMeta);
    }
    if (json.valueOidIsSet) {
      builder.valueOid(json.valueOid);
    }
    if (json.valueDosageIsSet) {
      builder.valueDosage(json.valueDosage);
    }
    if (json.valueRatioIsSet) {
      builder.valueRatio(json.valueRatio);
    }
    if (json.valueContactPointIsSet) {
      builder.valueContactPoint(json.valueContactPoint);
    }
    if (json.valueAttachmentIsSet) {
      builder.valueAttachment(json.valueAttachment);
    }
    if (json.valueReferenceIsSet) {
      builder.valueReference(json.valueReference);
    }
    if (json.valueCanonicalIsSet) {
      builder.valueCanonical(json.valueCanonical);
    }
    if (json.valueCodingIsSet) {
      builder.valueCoding(json.valueCoding);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.valueAgeIsSet) {
      builder.valueAge(json.valueAge);
    }
    if (json.valueTimeIsSet) {
      builder.valueTime(json.valueTime);
    }
    if (json.valueContactDetailIsSet) {
      builder.valueContactDetail(json.valueContactDetail);
    }
    if (json.valueTriggerDefinitionIsSet) {
      builder.valueTriggerDefinition(json.valueTriggerDefinition);
    }
    if (json.valueAnnotationIsSet) {
      builder.valueAnnotation(json.valueAnnotation);
    }
    if (json.valueContributorIsSet) {
      builder.valueContributor(json.valueContributor);
    }
    if (json.valueDateIsSet) {
      builder.valueDate(json.valueDate);
    }
    if (json.valueCountIsSet) {
      builder.valueCount(json.valueCount);
    }
    if (json.valueInstantIsSet) {
      builder.valueInstant(json.valueInstant);
    }
    if (json.valueRangeIsSet) {
      builder.valueRange(json.valueRange);
    }
    if (json.valueUriIsSet) {
      builder.valueUri(json.valueUri);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.valueMarkdownIsSet) {
      builder.valueMarkdown(json.valueMarkdown);
    }
    if (json.valueUrlIsSet) {
      builder.valueUrl(json.valueUrl);
    }
    if (json.valueRelatedArtifactIsSet) {
      builder.valueRelatedArtifact(json.valueRelatedArtifact);
    }
    if (json.valueIdIsSet) {
      builder.valueId(json.valueId);
    }
    return (ImmutableTask_Input) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Task_Input} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Task_Input instance
   */
  public static Task_Input copyOf(Task_Input instance) {
    if (instance instanceof ImmutableTask_Input) {
      return (ImmutableTask_Input) instance;
    }
    return ((ImmutableTask_Input.Builder) ImmutableTask_Input.builder())
        .valueBoolean(instance.valueBoolean())
        .valueUuid(instance.valueUuid())
        .valueHumanName(instance.valueHumanName())
        .valueDuration(instance.valueDuration())
        .type(instance.type())
        .valueSignature(instance.valueSignature())
        .valueDistance(instance.valueDistance())
        .id(instance.id())
        .valueCodeableConcept(instance.valueCodeableConcept())
        .valueSampledData(instance.valueSampledData())
        .valueExpression(instance.valueExpression())
        .valueBase64Binary(instance.valueBase64Binary())
        .valueUsageContext(instance.valueUsageContext())
        .valueUnsignedInt(instance.valueUnsignedInt())
        .modifierExtension(instance.modifierExtension())
        .valueParameterDefinition(instance.valueParameterDefinition())
        .valuePeriod(instance.valuePeriod())
        .valueDecimal(instance.valueDecimal())
        .valueDateTime(instance.valueDateTime())
        .valueAddress(instance.valueAddress())
        .valueMoney(instance.valueMoney())
        .valuePositiveInt(instance.valuePositiveInt())
        .valueString(instance.valueString())
        .valueIdentifier(instance.valueIdentifier())
        .valueTiming(instance.valueTiming())
        .valueCode(instance.valueCode())
        .valueDataRequirement(instance.valueDataRequirement())
        .valueMeta(instance.valueMeta())
        .valueOid(instance.valueOid())
        .valueDosage(instance.valueDosage())
        .valueRatio(instance.valueRatio())
        .valueContactPoint(instance.valueContactPoint())
        .valueAttachment(instance.valueAttachment())
        .valueReference(instance.valueReference())
        .valueCanonical(instance.valueCanonical())
        .valueCoding(instance.valueCoding())
        .extension(instance.extension())
        .valueInteger(instance.valueInteger())
        .valueAge(instance.valueAge())
        .valueTime(instance.valueTime())
        .valueContactDetail(instance.valueContactDetail())
        .valueTriggerDefinition(instance.valueTriggerDefinition())
        .valueAnnotation(instance.valueAnnotation())
        .valueContributor(instance.valueContributor())
        .valueDate(instance.valueDate())
        .valueCount(instance.valueCount())
        .valueInstant(instance.valueInstant())
        .valueRange(instance.valueRange())
        .valueUri(instance.valueUri())
        .valueQuantity(instance.valueQuantity())
        .valueMarkdown(instance.valueMarkdown())
        .valueUrl(instance.valueUrl())
        .valueRelatedArtifact(instance.valueRelatedArtifact())
        .valueId(instance.valueId())
        .build();
  }

  /**
   * Creates a builder for {@link Task_Input Task_Input}.
   * <pre>
   * ImmutableTask_Input.builder()
   *    .valueBoolean(Boolean) // optional {@link Task_Input#valueBoolean() valueBoolean}
   *    .valueUuid(String) // optional {@link Task_Input#valueUuid() valueUuid}
   *    .valueHumanName(com.medplum.types.fhir.HumanName) // optional {@link Task_Input#valueHumanName() valueHumanName}
   *    .valueDuration(com.medplum.types.fhir.Duration) // optional {@link Task_Input#valueDuration() valueDuration}
   *    .type(com.medplum.types.fhir.CodeableConcept) // required {@link Task_Input#type() type}
   *    .valueSignature(com.medplum.types.fhir.Signature) // optional {@link Task_Input#valueSignature() valueSignature}
   *    .valueDistance(com.medplum.types.fhir.Distance) // optional {@link Task_Input#valueDistance() valueDistance}
   *    .id(String) // optional {@link Task_Input#id() id}
   *    .valueCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link Task_Input#valueCodeableConcept() valueCodeableConcept}
   *    .valueSampledData(com.medplum.types.fhir.SampledData) // optional {@link Task_Input#valueSampledData() valueSampledData}
   *    .valueExpression(com.medplum.types.fhir.Expression) // optional {@link Task_Input#valueExpression() valueExpression}
   *    .valueBase64Binary(String) // optional {@link Task_Input#valueBase64Binary() valueBase64Binary}
   *    .valueUsageContext(com.medplum.types.fhir.UsageContext) // optional {@link Task_Input#valueUsageContext() valueUsageContext}
   *    .valueUnsignedInt(Double) // optional {@link Task_Input#valueUnsignedInt() valueUnsignedInt}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Task_Input#modifierExtension() modifierExtension}
   *    .valueParameterDefinition(com.medplum.types.fhir.ParameterDefinition) // optional {@link Task_Input#valueParameterDefinition() valueParameterDefinition}
   *    .valuePeriod(com.medplum.types.fhir.Period) // optional {@link Task_Input#valuePeriod() valuePeriod}
   *    .valueDecimal(Double) // optional {@link Task_Input#valueDecimal() valueDecimal}
   *    .valueDateTime(String) // optional {@link Task_Input#valueDateTime() valueDateTime}
   *    .valueAddress(com.medplum.types.fhir.Address) // optional {@link Task_Input#valueAddress() valueAddress}
   *    .valueMoney(com.medplum.types.fhir.Money) // optional {@link Task_Input#valueMoney() valueMoney}
   *    .valuePositiveInt(Double) // optional {@link Task_Input#valuePositiveInt() valuePositiveInt}
   *    .valueString(String) // optional {@link Task_Input#valueString() valueString}
   *    .valueIdentifier(com.medplum.types.fhir.Identifier) // optional {@link Task_Input#valueIdentifier() valueIdentifier}
   *    .valueTiming(com.medplum.types.fhir.Timing) // optional {@link Task_Input#valueTiming() valueTiming}
   *    .valueCode(String) // optional {@link Task_Input#valueCode() valueCode}
   *    .valueDataRequirement(com.medplum.types.fhir.DataRequirement) // optional {@link Task_Input#valueDataRequirement() valueDataRequirement}
   *    .valueMeta(com.medplum.types.fhir.Meta) // optional {@link Task_Input#valueMeta() valueMeta}
   *    .valueOid(String) // optional {@link Task_Input#valueOid() valueOid}
   *    .valueDosage(com.medplum.types.fhir.Dosage) // optional {@link Task_Input#valueDosage() valueDosage}
   *    .valueRatio(com.medplum.types.fhir.Ratio) // optional {@link Task_Input#valueRatio() valueRatio}
   *    .valueContactPoint(com.medplum.types.fhir.ContactPoint) // optional {@link Task_Input#valueContactPoint() valueContactPoint}
   *    .valueAttachment(com.medplum.types.fhir.Attachment) // optional {@link Task_Input#valueAttachment() valueAttachment}
   *    .valueReference(com.medplum.types.fhir.Reference) // optional {@link Task_Input#valueReference() valueReference}
   *    .valueCanonical(String) // optional {@link Task_Input#valueCanonical() valueCanonical}
   *    .valueCoding(com.medplum.types.fhir.Coding) // optional {@link Task_Input#valueCoding() valueCoding}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Task_Input#extension() extension}
   *    .valueInteger(Double) // optional {@link Task_Input#valueInteger() valueInteger}
   *    .valueAge(com.medplum.types.fhir.Age) // optional {@link Task_Input#valueAge() valueAge}
   *    .valueTime(String) // optional {@link Task_Input#valueTime() valueTime}
   *    .valueContactDetail(com.medplum.types.fhir.ContactDetail) // optional {@link Task_Input#valueContactDetail() valueContactDetail}
   *    .valueTriggerDefinition(com.medplum.types.fhir.TriggerDefinition) // optional {@link Task_Input#valueTriggerDefinition() valueTriggerDefinition}
   *    .valueAnnotation(com.medplum.types.fhir.Annotation) // optional {@link Task_Input#valueAnnotation() valueAnnotation}
   *    .valueContributor(com.medplum.types.fhir.Contributor) // optional {@link Task_Input#valueContributor() valueContributor}
   *    .valueDate(String) // optional {@link Task_Input#valueDate() valueDate}
   *    .valueCount(com.medplum.types.fhir.Count) // optional {@link Task_Input#valueCount() valueCount}
   *    .valueInstant(String) // optional {@link Task_Input#valueInstant() valueInstant}
   *    .valueRange(com.medplum.types.fhir.Range) // optional {@link Task_Input#valueRange() valueRange}
   *    .valueUri(String) // optional {@link Task_Input#valueUri() valueUri}
   *    .valueQuantity(com.medplum.types.fhir.Quantity) // optional {@link Task_Input#valueQuantity() valueQuantity}
   *    .valueMarkdown(String) // optional {@link Task_Input#valueMarkdown() valueMarkdown}
   *    .valueUrl(String) // optional {@link Task_Input#valueUrl() valueUrl}
   *    .valueRelatedArtifact(com.medplum.types.fhir.RelatedArtifact) // optional {@link Task_Input#valueRelatedArtifact() valueRelatedArtifact}
   *    .valueId(String) // optional {@link Task_Input#valueId() valueId}
   *    .build();
   * </pre>
   * @return A new Task_Input builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableTask_Input.Builder();
  }

  /**
   * Builds instances of type {@link Task_Input Task_Input}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Task_Input", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x1L;
    private static final long OPT_BIT_VALUE_UUID = 0x2L;
    private static final long OPT_BIT_VALUE_HUMAN_NAME = 0x4L;
    private static final long OPT_BIT_VALUE_DURATION = 0x8L;
    private static final long OPT_BIT_VALUE_SIGNATURE = 0x10L;
    private static final long OPT_BIT_VALUE_DISTANCE = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_VALUE_CODEABLE_CONCEPT = 0x80L;
    private static final long OPT_BIT_VALUE_SAMPLED_DATA = 0x100L;
    private static final long OPT_BIT_VALUE_EXPRESSION = 0x200L;
    private static final long OPT_BIT_VALUE_BASE64_BINARY = 0x400L;
    private static final long OPT_BIT_VALUE_USAGE_CONTEXT = 0x800L;
    private static final long OPT_BIT_VALUE_UNSIGNED_INT = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_VALUE_PARAMETER_DEFINITION = 0x4000L;
    private static final long OPT_BIT_VALUE_PERIOD = 0x8000L;
    private static final long OPT_BIT_VALUE_DECIMAL = 0x10000L;
    private static final long OPT_BIT_VALUE_DATE_TIME = 0x20000L;
    private static final long OPT_BIT_VALUE_ADDRESS = 0x40000L;
    private static final long OPT_BIT_VALUE_MONEY = 0x80000L;
    private static final long OPT_BIT_VALUE_POSITIVE_INT = 0x100000L;
    private static final long OPT_BIT_VALUE_STRING = 0x200000L;
    private static final long OPT_BIT_VALUE_IDENTIFIER = 0x400000L;
    private static final long OPT_BIT_VALUE_TIMING = 0x800000L;
    private static final long OPT_BIT_VALUE_CODE = 0x1000000L;
    private static final long OPT_BIT_VALUE_DATA_REQUIREMENT = 0x2000000L;
    private static final long OPT_BIT_VALUE_META = 0x4000000L;
    private static final long OPT_BIT_VALUE_OID = 0x8000000L;
    private static final long OPT_BIT_VALUE_DOSAGE = 0x10000000L;
    private static final long OPT_BIT_VALUE_RATIO = 0x20000000L;
    private static final long OPT_BIT_VALUE_CONTACT_POINT = 0x40000000L;
    private static final long OPT_BIT_VALUE_ATTACHMENT = 0x80000000L;
    private static final long OPT_BIT_VALUE_REFERENCE = 0x100000000L;
    private static final long OPT_BIT_VALUE_CANONICAL = 0x200000000L;
    private static final long OPT_BIT_VALUE_CODING = 0x400000000L;
    private static final long OPT_BIT_EXTENSION = 0x800000000L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x1000000000L;
    private static final long OPT_BIT_VALUE_AGE = 0x2000000000L;
    private static final long OPT_BIT_VALUE_TIME = 0x4000000000L;
    private static final long OPT_BIT_VALUE_CONTACT_DETAIL = 0x8000000000L;
    private static final long OPT_BIT_VALUE_TRIGGER_DEFINITION = 0x10000000000L;
    private static final long OPT_BIT_VALUE_ANNOTATION = 0x20000000000L;
    private static final long OPT_BIT_VALUE_CONTRIBUTOR = 0x40000000000L;
    private static final long OPT_BIT_VALUE_DATE = 0x80000000000L;
    private static final long OPT_BIT_VALUE_COUNT = 0x100000000000L;
    private static final long OPT_BIT_VALUE_INSTANT = 0x200000000000L;
    private static final long OPT_BIT_VALUE_RANGE = 0x400000000000L;
    private static final long OPT_BIT_VALUE_URI = 0x800000000000L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x1000000000000L;
    private static final long OPT_BIT_VALUE_MARKDOWN = 0x2000000000000L;
    private static final long OPT_BIT_VALUE_URL = 0x4000000000000L;
    private static final long OPT_BIT_VALUE_RELATED_ARTIFACT = 0x8000000000000L;
    private static final long OPT_BIT_VALUE_ID = 0x10000000000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Boolean valueBoolean;
    private @Nullable String valueUuid;
    private @Nullable HumanName valueHumanName;
    private @Nullable Duration valueDuration;
    private @Nullable CodeableConcept type;
    private @Nullable Signature valueSignature;
    private @Nullable Distance valueDistance;
    private @Nullable String id;
    private @Nullable CodeableConcept valueCodeableConcept;
    private @Nullable SampledData valueSampledData;
    private @Nullable Expression valueExpression;
    private @Nullable String valueBase64Binary;
    private @Nullable UsageContext valueUsageContext;
    private @Nullable Double valueUnsignedInt;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable ParameterDefinition valueParameterDefinition;
    private @Nullable Period valuePeriod;
    private @Nullable Double valueDecimal;
    private @Nullable String valueDateTime;
    private @Nullable Address valueAddress;
    private @Nullable Money valueMoney;
    private @Nullable Double valuePositiveInt;
    private @Nullable String valueString;
    private @Nullable Identifier valueIdentifier;
    private @Nullable Timing valueTiming;
    private @Nullable String valueCode;
    private @Nullable DataRequirement valueDataRequirement;
    private @Nullable Meta valueMeta;
    private @Nullable String valueOid;
    private @Nullable Dosage valueDosage;
    private @Nullable Ratio valueRatio;
    private @Nullable ContactPoint valueContactPoint;
    private @Nullable Attachment valueAttachment;
    private @Nullable Reference valueReference;
    private @Nullable String valueCanonical;
    private @Nullable Coding valueCoding;
    private @Nullable List<Extension> extension;
    private @Nullable Double valueInteger;
    private @Nullable Age valueAge;
    private @Nullable String valueTime;
    private @Nullable ContactDetail valueContactDetail;
    private @Nullable TriggerDefinition valueTriggerDefinition;
    private @Nullable Annotation valueAnnotation;
    private @Nullable Contributor valueContributor;
    private @Nullable String valueDate;
    private @Nullable Count valueCount;
    private @Nullable String valueInstant;
    private @Nullable Range valueRange;
    private @Nullable String valueUri;
    private @Nullable Quantity valueQuantity;
    private @Nullable String valueMarkdown;
    private @Nullable String valueUrl;
    private @Nullable RelatedArtifact valueRelatedArtifact;
    private @Nullable String valueId;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Task_Input#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link Task_Input#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link Task_Input#valueUuid() valueUuid} to valueUuid.
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
     * Initializes the optional value {@link Task_Input#valueUuid() valueUuid} to valueUuid.
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
     * Initializes the optional value {@link Task_Input#valueHumanName() valueHumanName} to valueHumanName.
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
     * Initializes the optional value {@link Task_Input#valueHumanName() valueHumanName} to valueHumanName.
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
     * Initializes the optional value {@link Task_Input#valueDuration() valueDuration} to valueDuration.
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
     * Initializes the optional value {@link Task_Input#valueDuration() valueDuration} to valueDuration.
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
     * Initializes the value for the {@link Task_Input#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task_Input#valueSignature() valueSignature} to valueSignature.
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
     * Initializes the optional value {@link Task_Input#valueSignature() valueSignature} to valueSignature.
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
     * Initializes the optional value {@link Task_Input#valueDistance() valueDistance} to valueDistance.
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
     * Initializes the optional value {@link Task_Input#valueDistance() valueDistance} to valueDistance.
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
     * Initializes the optional value {@link Task_Input#id() id} to id.
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
     * Initializes the optional value {@link Task_Input#id() id} to id.
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
     * Initializes the optional value {@link Task_Input#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
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
     * Initializes the optional value {@link Task_Input#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
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
     * Initializes the optional value {@link Task_Input#valueSampledData() valueSampledData} to valueSampledData.
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
     * Initializes the optional value {@link Task_Input#valueSampledData() valueSampledData} to valueSampledData.
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
     * Initializes the optional value {@link Task_Input#valueExpression() valueExpression} to valueExpression.
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
     * Initializes the optional value {@link Task_Input#valueExpression() valueExpression} to valueExpression.
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
     * Initializes the optional value {@link Task_Input#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
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
     * Initializes the optional value {@link Task_Input#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
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
     * Initializes the optional value {@link Task_Input#valueUsageContext() valueUsageContext} to valueUsageContext.
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
     * Initializes the optional value {@link Task_Input#valueUsageContext() valueUsageContext} to valueUsageContext.
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
     * Initializes the optional value {@link Task_Input#valueUnsignedInt() valueUnsignedInt} to valueUnsignedInt.
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
     * Initializes the optional value {@link Task_Input#valueUnsignedInt() valueUnsignedInt} to valueUnsignedInt.
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
     * Initializes the optional value {@link Task_Input#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Task_Input#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Task_Input#valueParameterDefinition() valueParameterDefinition} to valueParameterDefinition.
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
     * Initializes the optional value {@link Task_Input#valueParameterDefinition() valueParameterDefinition} to valueParameterDefinition.
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
     * Initializes the optional value {@link Task_Input#valuePeriod() valuePeriod} to valuePeriod.
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
     * Initializes the optional value {@link Task_Input#valuePeriod() valuePeriod} to valuePeriod.
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
     * Initializes the optional value {@link Task_Input#valueDecimal() valueDecimal} to valueDecimal.
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
     * Initializes the optional value {@link Task_Input#valueDecimal() valueDecimal} to valueDecimal.
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
     * Initializes the optional value {@link Task_Input#valueDateTime() valueDateTime} to valueDateTime.
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
     * Initializes the optional value {@link Task_Input#valueDateTime() valueDateTime} to valueDateTime.
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
     * Initializes the optional value {@link Task_Input#valueAddress() valueAddress} to valueAddress.
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
     * Initializes the optional value {@link Task_Input#valueAddress() valueAddress} to valueAddress.
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
     * Initializes the optional value {@link Task_Input#valueMoney() valueMoney} to valueMoney.
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
     * Initializes the optional value {@link Task_Input#valueMoney() valueMoney} to valueMoney.
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
     * Initializes the optional value {@link Task_Input#valuePositiveInt() valuePositiveInt} to valuePositiveInt.
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
     * Initializes the optional value {@link Task_Input#valuePositiveInt() valuePositiveInt} to valuePositiveInt.
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
     * Initializes the optional value {@link Task_Input#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link Task_Input#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link Task_Input#valueIdentifier() valueIdentifier} to valueIdentifier.
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
     * Initializes the optional value {@link Task_Input#valueIdentifier() valueIdentifier} to valueIdentifier.
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
     * Initializes the optional value {@link Task_Input#valueTiming() valueTiming} to valueTiming.
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
     * Initializes the optional value {@link Task_Input#valueTiming() valueTiming} to valueTiming.
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
     * Initializes the optional value {@link Task_Input#valueCode() valueCode} to valueCode.
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
     * Initializes the optional value {@link Task_Input#valueCode() valueCode} to valueCode.
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
     * Initializes the optional value {@link Task_Input#valueDataRequirement() valueDataRequirement} to valueDataRequirement.
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
     * Initializes the optional value {@link Task_Input#valueDataRequirement() valueDataRequirement} to valueDataRequirement.
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
     * Initializes the optional value {@link Task_Input#valueMeta() valueMeta} to valueMeta.
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
     * Initializes the optional value {@link Task_Input#valueMeta() valueMeta} to valueMeta.
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
     * Initializes the optional value {@link Task_Input#valueOid() valueOid} to valueOid.
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
     * Initializes the optional value {@link Task_Input#valueOid() valueOid} to valueOid.
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
     * Initializes the optional value {@link Task_Input#valueDosage() valueDosage} to valueDosage.
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
     * Initializes the optional value {@link Task_Input#valueDosage() valueDosage} to valueDosage.
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
     * Initializes the optional value {@link Task_Input#valueRatio() valueRatio} to valueRatio.
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
     * Initializes the optional value {@link Task_Input#valueRatio() valueRatio} to valueRatio.
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
     * Initializes the optional value {@link Task_Input#valueContactPoint() valueContactPoint} to valueContactPoint.
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
     * Initializes the optional value {@link Task_Input#valueContactPoint() valueContactPoint} to valueContactPoint.
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
     * Initializes the optional value {@link Task_Input#valueAttachment() valueAttachment} to valueAttachment.
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
     * Initializes the optional value {@link Task_Input#valueAttachment() valueAttachment} to valueAttachment.
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
     * Initializes the optional value {@link Task_Input#valueReference() valueReference} to valueReference.
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
     * Initializes the optional value {@link Task_Input#valueReference() valueReference} to valueReference.
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
     * Initializes the optional value {@link Task_Input#valueCanonical() valueCanonical} to valueCanonical.
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
     * Initializes the optional value {@link Task_Input#valueCanonical() valueCanonical} to valueCanonical.
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
     * Initializes the optional value {@link Task_Input#valueCoding() valueCoding} to valueCoding.
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
     * Initializes the optional value {@link Task_Input#valueCoding() valueCoding} to valueCoding.
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
     * Initializes the optional value {@link Task_Input#extension() extension} to extension.
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
     * Initializes the optional value {@link Task_Input#extension() extension} to extension.
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
     * Initializes the optional value {@link Task_Input#valueInteger() valueInteger} to valueInteger.
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
     * Initializes the optional value {@link Task_Input#valueInteger() valueInteger} to valueInteger.
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
     * Initializes the optional value {@link Task_Input#valueAge() valueAge} to valueAge.
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
     * Initializes the optional value {@link Task_Input#valueAge() valueAge} to valueAge.
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
     * Initializes the optional value {@link Task_Input#valueTime() valueTime} to valueTime.
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
     * Initializes the optional value {@link Task_Input#valueTime() valueTime} to valueTime.
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
     * Initializes the optional value {@link Task_Input#valueContactDetail() valueContactDetail} to valueContactDetail.
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
     * Initializes the optional value {@link Task_Input#valueContactDetail() valueContactDetail} to valueContactDetail.
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
     * Initializes the optional value {@link Task_Input#valueTriggerDefinition() valueTriggerDefinition} to valueTriggerDefinition.
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
     * Initializes the optional value {@link Task_Input#valueTriggerDefinition() valueTriggerDefinition} to valueTriggerDefinition.
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
     * Initializes the optional value {@link Task_Input#valueAnnotation() valueAnnotation} to valueAnnotation.
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
     * Initializes the optional value {@link Task_Input#valueAnnotation() valueAnnotation} to valueAnnotation.
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
     * Initializes the optional value {@link Task_Input#valueContributor() valueContributor} to valueContributor.
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
     * Initializes the optional value {@link Task_Input#valueContributor() valueContributor} to valueContributor.
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
     * Initializes the optional value {@link Task_Input#valueDate() valueDate} to valueDate.
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
     * Initializes the optional value {@link Task_Input#valueDate() valueDate} to valueDate.
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
     * Initializes the optional value {@link Task_Input#valueCount() valueCount} to valueCount.
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
     * Initializes the optional value {@link Task_Input#valueCount() valueCount} to valueCount.
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
     * Initializes the optional value {@link Task_Input#valueInstant() valueInstant} to valueInstant.
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
     * Initializes the optional value {@link Task_Input#valueInstant() valueInstant} to valueInstant.
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
     * Initializes the optional value {@link Task_Input#valueRange() valueRange} to valueRange.
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
     * Initializes the optional value {@link Task_Input#valueRange() valueRange} to valueRange.
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
     * Initializes the optional value {@link Task_Input#valueUri() valueUri} to valueUri.
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
     * Initializes the optional value {@link Task_Input#valueUri() valueUri} to valueUri.
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
     * Initializes the optional value {@link Task_Input#valueQuantity() valueQuantity} to valueQuantity.
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
     * Initializes the optional value {@link Task_Input#valueQuantity() valueQuantity} to valueQuantity.
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
     * Initializes the optional value {@link Task_Input#valueMarkdown() valueMarkdown} to valueMarkdown.
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
     * Initializes the optional value {@link Task_Input#valueMarkdown() valueMarkdown} to valueMarkdown.
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
     * Initializes the optional value {@link Task_Input#valueUrl() valueUrl} to valueUrl.
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
     * Initializes the optional value {@link Task_Input#valueUrl() valueUrl} to valueUrl.
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
     * Initializes the optional value {@link Task_Input#valueRelatedArtifact() valueRelatedArtifact} to valueRelatedArtifact.
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
     * Initializes the optional value {@link Task_Input#valueRelatedArtifact() valueRelatedArtifact} to valueRelatedArtifact.
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
     * Initializes the optional value {@link Task_Input#valueId() valueId} to valueId.
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
     * Initializes the optional value {@link Task_Input#valueId() valueId} to valueId.
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
     * Builds a new {@link Task_Input Task_Input}.
     * @return An immutable instance of Task_Input
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Task_Input build() {
      checkRequiredAttributes();
      return new ImmutableTask_Input(
          valueBoolean,
          valueUuid,
          valueHumanName,
          valueDuration,
          type,
          valueSignature,
          valueDistance,
          id,
          valueCodeableConcept,
          valueSampledData,
          valueExpression,
          valueBase64Binary,
          valueUsageContext,
          valueUnsignedInt,
          modifierExtension,
          valueParameterDefinition,
          valuePeriod,
          valueDecimal,
          valueDateTime,
          valueAddress,
          valueMoney,
          valuePositiveInt,
          valueString,
          valueIdentifier,
          valueTiming,
          valueCode,
          valueDataRequirement,
          valueMeta,
          valueOid,
          valueDosage,
          valueRatio,
          valueContactPoint,
          valueAttachment,
          valueReference,
          valueCanonical,
          valueCoding,
          extension,
          valueInteger,
          valueAge,
          valueTime,
          valueContactDetail,
          valueTriggerDefinition,
          valueAnnotation,
          valueContributor,
          valueDate,
          valueCount,
          valueInstant,
          valueRange,
          valueUri,
          valueQuantity,
          valueMarkdown,
          valueUrl,
          valueRelatedArtifact,
          valueId);
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valueUuidIsSet() {
      return (optBits & OPT_BIT_VALUE_UUID) != 0;
    }

    private boolean valueHumanNameIsSet() {
      return (optBits & OPT_BIT_VALUE_HUMAN_NAME) != 0;
    }

    private boolean valueDurationIsSet() {
      return (optBits & OPT_BIT_VALUE_DURATION) != 0;
    }

    private boolean valueSignatureIsSet() {
      return (optBits & OPT_BIT_VALUE_SIGNATURE) != 0;
    }

    private boolean valueDistanceIsSet() {
      return (optBits & OPT_BIT_VALUE_DISTANCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private boolean valueSampledDataIsSet() {
      return (optBits & OPT_BIT_VALUE_SAMPLED_DATA) != 0;
    }

    private boolean valueExpressionIsSet() {
      return (optBits & OPT_BIT_VALUE_EXPRESSION) != 0;
    }

    private boolean valueBase64BinaryIsSet() {
      return (optBits & OPT_BIT_VALUE_BASE64_BINARY) != 0;
    }

    private boolean valueUsageContextIsSet() {
      return (optBits & OPT_BIT_VALUE_USAGE_CONTEXT) != 0;
    }

    private boolean valueUnsignedIntIsSet() {
      return (optBits & OPT_BIT_VALUE_UNSIGNED_INT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueParameterDefinitionIsSet() {
      return (optBits & OPT_BIT_VALUE_PARAMETER_DEFINITION) != 0;
    }

    private boolean valuePeriodIsSet() {
      return (optBits & OPT_BIT_VALUE_PERIOD) != 0;
    }

    private boolean valueDecimalIsSet() {
      return (optBits & OPT_BIT_VALUE_DECIMAL) != 0;
    }

    private boolean valueDateTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE_TIME) != 0;
    }

    private boolean valueAddressIsSet() {
      return (optBits & OPT_BIT_VALUE_ADDRESS) != 0;
    }

    private boolean valueMoneyIsSet() {
      return (optBits & OPT_BIT_VALUE_MONEY) != 0;
    }

    private boolean valuePositiveIntIsSet() {
      return (optBits & OPT_BIT_VALUE_POSITIVE_INT) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueIdentifierIsSet() {
      return (optBits & OPT_BIT_VALUE_IDENTIFIER) != 0;
    }

    private boolean valueTimingIsSet() {
      return (optBits & OPT_BIT_VALUE_TIMING) != 0;
    }

    private boolean valueCodeIsSet() {
      return (optBits & OPT_BIT_VALUE_CODE) != 0;
    }

    private boolean valueDataRequirementIsSet() {
      return (optBits & OPT_BIT_VALUE_DATA_REQUIREMENT) != 0;
    }

    private boolean valueMetaIsSet() {
      return (optBits & OPT_BIT_VALUE_META) != 0;
    }

    private boolean valueOidIsSet() {
      return (optBits & OPT_BIT_VALUE_OID) != 0;
    }

    private boolean valueDosageIsSet() {
      return (optBits & OPT_BIT_VALUE_DOSAGE) != 0;
    }

    private boolean valueRatioIsSet() {
      return (optBits & OPT_BIT_VALUE_RATIO) != 0;
    }

    private boolean valueContactPointIsSet() {
      return (optBits & OPT_BIT_VALUE_CONTACT_POINT) != 0;
    }

    private boolean valueAttachmentIsSet() {
      return (optBits & OPT_BIT_VALUE_ATTACHMENT) != 0;
    }

    private boolean valueReferenceIsSet() {
      return (optBits & OPT_BIT_VALUE_REFERENCE) != 0;
    }

    private boolean valueCanonicalIsSet() {
      return (optBits & OPT_BIT_VALUE_CANONICAL) != 0;
    }

    private boolean valueCodingIsSet() {
      return (optBits & OPT_BIT_VALUE_CODING) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean valueAgeIsSet() {
      return (optBits & OPT_BIT_VALUE_AGE) != 0;
    }

    private boolean valueTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_TIME) != 0;
    }

    private boolean valueContactDetailIsSet() {
      return (optBits & OPT_BIT_VALUE_CONTACT_DETAIL) != 0;
    }

    private boolean valueTriggerDefinitionIsSet() {
      return (optBits & OPT_BIT_VALUE_TRIGGER_DEFINITION) != 0;
    }

    private boolean valueAnnotationIsSet() {
      return (optBits & OPT_BIT_VALUE_ANNOTATION) != 0;
    }

    private boolean valueContributorIsSet() {
      return (optBits & OPT_BIT_VALUE_CONTRIBUTOR) != 0;
    }

    private boolean valueDateIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE) != 0;
    }

    private boolean valueCountIsSet() {
      return (optBits & OPT_BIT_VALUE_COUNT) != 0;
    }

    private boolean valueInstantIsSet() {
      return (optBits & OPT_BIT_VALUE_INSTANT) != 0;
    }

    private boolean valueRangeIsSet() {
      return (optBits & OPT_BIT_VALUE_RANGE) != 0;
    }

    private boolean valueUriIsSet() {
      return (optBits & OPT_BIT_VALUE_URI) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean valueMarkdownIsSet() {
      return (optBits & OPT_BIT_VALUE_MARKDOWN) != 0;
    }

    private boolean valueUrlIsSet() {
      return (optBits & OPT_BIT_VALUE_URL) != 0;
    }

    private boolean valueRelatedArtifactIsSet() {
      return (optBits & OPT_BIT_VALUE_RELATED_ARTIFACT) != 0;
    }

    private boolean valueIdIsSet() {
      return (optBits & OPT_BIT_VALUE_ID) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Task_Input is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build Task_Input, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Task_Input", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link Task_Input#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "Task_Input", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Task_Input#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueBoolean(boolean valueBoolean);

    /**
     * Initializes the optional value {@link Task_Input#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueBoolean(Optional<Boolean> valueBoolean);

    /**
     * Initializes the optional value {@link Task_Input#valueUuid() valueUuid} to valueUuid.
     * @param valueUuid The value for valueUuid
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueUuid(String valueUuid);

    /**
     * Initializes the optional value {@link Task_Input#valueUuid() valueUuid} to valueUuid.
     * @param valueUuid The value for valueUuid
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueUuid(Optional<String> valueUuid);

    /**
     * Initializes the optional value {@link Task_Input#valueHumanName() valueHumanName} to valueHumanName.
     * @param valueHumanName The value for valueHumanName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueHumanName(HumanName valueHumanName);

    /**
     * Initializes the optional value {@link Task_Input#valueHumanName() valueHumanName} to valueHumanName.
     * @param valueHumanName The value for valueHumanName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueHumanName(Optional<? extends HumanName> valueHumanName);

    /**
     * Initializes the optional value {@link Task_Input#valueDuration() valueDuration} to valueDuration.
     * @param valueDuration The value for valueDuration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueDuration(Duration valueDuration);

    /**
     * Initializes the optional value {@link Task_Input#valueDuration() valueDuration} to valueDuration.
     * @param valueDuration The value for valueDuration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueDuration(Optional<? extends Duration> valueDuration);

    /**
     * Initializes the optional value {@link Task_Input#valueSignature() valueSignature} to valueSignature.
     * @param valueSignature The value for valueSignature
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueSignature(Signature valueSignature);

    /**
     * Initializes the optional value {@link Task_Input#valueSignature() valueSignature} to valueSignature.
     * @param valueSignature The value for valueSignature
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueSignature(Optional<? extends Signature> valueSignature);

    /**
     * Initializes the optional value {@link Task_Input#valueDistance() valueDistance} to valueDistance.
     * @param valueDistance The value for valueDistance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueDistance(Distance valueDistance);

    /**
     * Initializes the optional value {@link Task_Input#valueDistance() valueDistance} to valueDistance.
     * @param valueDistance The value for valueDistance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueDistance(Optional<? extends Distance> valueDistance);

    /**
     * Initializes the optional value {@link Task_Input#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Task_Input#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Task_Input#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueCodeableConcept(CodeableConcept valueCodeableConcept);

    /**
     * Initializes the optional value {@link Task_Input#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueCodeableConcept(Optional<? extends CodeableConcept> valueCodeableConcept);

    /**
     * Initializes the optional value {@link Task_Input#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueSampledData(SampledData valueSampledData);

    /**
     * Initializes the optional value {@link Task_Input#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueSampledData(Optional<? extends SampledData> valueSampledData);

    /**
     * Initializes the optional value {@link Task_Input#valueExpression() valueExpression} to valueExpression.
     * @param valueExpression The value for valueExpression
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueExpression(Expression valueExpression);

    /**
     * Initializes the optional value {@link Task_Input#valueExpression() valueExpression} to valueExpression.
     * @param valueExpression The value for valueExpression
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueExpression(Optional<? extends Expression> valueExpression);

    /**
     * Initializes the optional value {@link Task_Input#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
     * @param valueBase64Binary The value for valueBase64Binary
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueBase64Binary(String valueBase64Binary);

    /**
     * Initializes the optional value {@link Task_Input#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
     * @param valueBase64Binary The value for valueBase64Binary
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueBase64Binary(Optional<String> valueBase64Binary);

    /**
     * Initializes the optional value {@link Task_Input#valueUsageContext() valueUsageContext} to valueUsageContext.
     * @param valueUsageContext The value for valueUsageContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueUsageContext(UsageContext valueUsageContext);

    /**
     * Initializes the optional value {@link Task_Input#valueUsageContext() valueUsageContext} to valueUsageContext.
     * @param valueUsageContext The value for valueUsageContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueUsageContext(Optional<? extends UsageContext> valueUsageContext);

    /**
     * Initializes the optional value {@link Task_Input#valueUnsignedInt() valueUnsignedInt} to valueUnsignedInt.
     * @param valueUnsignedInt The value for valueUnsignedInt
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueUnsignedInt(double valueUnsignedInt);

    /**
     * Initializes the optional value {@link Task_Input#valueUnsignedInt() valueUnsignedInt} to valueUnsignedInt.
     * @param valueUnsignedInt The value for valueUnsignedInt
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueUnsignedInt(Optional<Double> valueUnsignedInt);

    /**
     * Initializes the optional value {@link Task_Input#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Task_Input#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Task_Input#valueParameterDefinition() valueParameterDefinition} to valueParameterDefinition.
     * @param valueParameterDefinition The value for valueParameterDefinition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueParameterDefinition(ParameterDefinition valueParameterDefinition);

    /**
     * Initializes the optional value {@link Task_Input#valueParameterDefinition() valueParameterDefinition} to valueParameterDefinition.
     * @param valueParameterDefinition The value for valueParameterDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueParameterDefinition(Optional<? extends ParameterDefinition> valueParameterDefinition);

    /**
     * Initializes the optional value {@link Task_Input#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valuePeriod(Period valuePeriod);

    /**
     * Initializes the optional value {@link Task_Input#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valuePeriod(Optional<? extends Period> valuePeriod);

    /**
     * Initializes the optional value {@link Task_Input#valueDecimal() valueDecimal} to valueDecimal.
     * @param valueDecimal The value for valueDecimal
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueDecimal(double valueDecimal);

    /**
     * Initializes the optional value {@link Task_Input#valueDecimal() valueDecimal} to valueDecimal.
     * @param valueDecimal The value for valueDecimal
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueDecimal(Optional<Double> valueDecimal);

    /**
     * Initializes the optional value {@link Task_Input#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueDateTime(String valueDateTime);

    /**
     * Initializes the optional value {@link Task_Input#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueDateTime(Optional<String> valueDateTime);

    /**
     * Initializes the optional value {@link Task_Input#valueAddress() valueAddress} to valueAddress.
     * @param valueAddress The value for valueAddress
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueAddress(Address valueAddress);

    /**
     * Initializes the optional value {@link Task_Input#valueAddress() valueAddress} to valueAddress.
     * @param valueAddress The value for valueAddress
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueAddress(Optional<? extends Address> valueAddress);

    /**
     * Initializes the optional value {@link Task_Input#valueMoney() valueMoney} to valueMoney.
     * @param valueMoney The value for valueMoney
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueMoney(Money valueMoney);

    /**
     * Initializes the optional value {@link Task_Input#valueMoney() valueMoney} to valueMoney.
     * @param valueMoney The value for valueMoney
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueMoney(Optional<? extends Money> valueMoney);

    /**
     * Initializes the optional value {@link Task_Input#valuePositiveInt() valuePositiveInt} to valuePositiveInt.
     * @param valuePositiveInt The value for valuePositiveInt
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valuePositiveInt(double valuePositiveInt);

    /**
     * Initializes the optional value {@link Task_Input#valuePositiveInt() valuePositiveInt} to valuePositiveInt.
     * @param valuePositiveInt The value for valuePositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valuePositiveInt(Optional<Double> valuePositiveInt);

    /**
     * Initializes the optional value {@link Task_Input#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueString(String valueString);

    /**
     * Initializes the optional value {@link Task_Input#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueString(Optional<String> valueString);

    /**
     * Initializes the optional value {@link Task_Input#valueIdentifier() valueIdentifier} to valueIdentifier.
     * @param valueIdentifier The value for valueIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueIdentifier(Identifier valueIdentifier);

    /**
     * Initializes the optional value {@link Task_Input#valueIdentifier() valueIdentifier} to valueIdentifier.
     * @param valueIdentifier The value for valueIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueIdentifier(Optional<? extends Identifier> valueIdentifier);

    /**
     * Initializes the optional value {@link Task_Input#valueTiming() valueTiming} to valueTiming.
     * @param valueTiming The value for valueTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueTiming(Timing valueTiming);

    /**
     * Initializes the optional value {@link Task_Input#valueTiming() valueTiming} to valueTiming.
     * @param valueTiming The value for valueTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueTiming(Optional<? extends Timing> valueTiming);

    /**
     * Initializes the optional value {@link Task_Input#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueCode(String valueCode);

    /**
     * Initializes the optional value {@link Task_Input#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueCode(Optional<String> valueCode);

    /**
     * Initializes the optional value {@link Task_Input#valueDataRequirement() valueDataRequirement} to valueDataRequirement.
     * @param valueDataRequirement The value for valueDataRequirement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueDataRequirement(DataRequirement valueDataRequirement);

    /**
     * Initializes the optional value {@link Task_Input#valueDataRequirement() valueDataRequirement} to valueDataRequirement.
     * @param valueDataRequirement The value for valueDataRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueDataRequirement(Optional<? extends DataRequirement> valueDataRequirement);

    /**
     * Initializes the optional value {@link Task_Input#valueMeta() valueMeta} to valueMeta.
     * @param valueMeta The value for valueMeta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueMeta(Meta valueMeta);

    /**
     * Initializes the optional value {@link Task_Input#valueMeta() valueMeta} to valueMeta.
     * @param valueMeta The value for valueMeta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueMeta(Optional<? extends Meta> valueMeta);

    /**
     * Initializes the optional value {@link Task_Input#valueOid() valueOid} to valueOid.
     * @param valueOid The value for valueOid
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueOid(String valueOid);

    /**
     * Initializes the optional value {@link Task_Input#valueOid() valueOid} to valueOid.
     * @param valueOid The value for valueOid
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueOid(Optional<String> valueOid);

    /**
     * Initializes the optional value {@link Task_Input#valueDosage() valueDosage} to valueDosage.
     * @param valueDosage The value for valueDosage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueDosage(Dosage valueDosage);

    /**
     * Initializes the optional value {@link Task_Input#valueDosage() valueDosage} to valueDosage.
     * @param valueDosage The value for valueDosage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueDosage(Optional<? extends Dosage> valueDosage);

    /**
     * Initializes the optional value {@link Task_Input#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueRatio(Ratio valueRatio);

    /**
     * Initializes the optional value {@link Task_Input#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueRatio(Optional<? extends Ratio> valueRatio);

    /**
     * Initializes the optional value {@link Task_Input#valueContactPoint() valueContactPoint} to valueContactPoint.
     * @param valueContactPoint The value for valueContactPoint
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueContactPoint(ContactPoint valueContactPoint);

    /**
     * Initializes the optional value {@link Task_Input#valueContactPoint() valueContactPoint} to valueContactPoint.
     * @param valueContactPoint The value for valueContactPoint
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueContactPoint(Optional<? extends ContactPoint> valueContactPoint);

    /**
     * Initializes the optional value {@link Task_Input#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueAttachment(Attachment valueAttachment);

    /**
     * Initializes the optional value {@link Task_Input#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueAttachment(Optional<? extends Attachment> valueAttachment);

    /**
     * Initializes the optional value {@link Task_Input#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueReference(Reference valueReference);

    /**
     * Initializes the optional value {@link Task_Input#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueReference(Optional<? extends Reference> valueReference);

    /**
     * Initializes the optional value {@link Task_Input#valueCanonical() valueCanonical} to valueCanonical.
     * @param valueCanonical The value for valueCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueCanonical(String valueCanonical);

    /**
     * Initializes the optional value {@link Task_Input#valueCanonical() valueCanonical} to valueCanonical.
     * @param valueCanonical The value for valueCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueCanonical(Optional<String> valueCanonical);

    /**
     * Initializes the optional value {@link Task_Input#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueCoding(Coding valueCoding);

    /**
     * Initializes the optional value {@link Task_Input#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueCoding(Optional<? extends Coding> valueCoding);

    /**
     * Initializes the optional value {@link Task_Input#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Task_Input#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Task_Input#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueInteger(double valueInteger);

    /**
     * Initializes the optional value {@link Task_Input#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueInteger(Optional<Double> valueInteger);

    /**
     * Initializes the optional value {@link Task_Input#valueAge() valueAge} to valueAge.
     * @param valueAge The value for valueAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueAge(Age valueAge);

    /**
     * Initializes the optional value {@link Task_Input#valueAge() valueAge} to valueAge.
     * @param valueAge The value for valueAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueAge(Optional<? extends Age> valueAge);

    /**
     * Initializes the optional value {@link Task_Input#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueTime(String valueTime);

    /**
     * Initializes the optional value {@link Task_Input#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueTime(Optional<String> valueTime);

    /**
     * Initializes the optional value {@link Task_Input#valueContactDetail() valueContactDetail} to valueContactDetail.
     * @param valueContactDetail The value for valueContactDetail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueContactDetail(ContactDetail valueContactDetail);

    /**
     * Initializes the optional value {@link Task_Input#valueContactDetail() valueContactDetail} to valueContactDetail.
     * @param valueContactDetail The value for valueContactDetail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueContactDetail(Optional<? extends ContactDetail> valueContactDetail);

    /**
     * Initializes the optional value {@link Task_Input#valueTriggerDefinition() valueTriggerDefinition} to valueTriggerDefinition.
     * @param valueTriggerDefinition The value for valueTriggerDefinition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueTriggerDefinition(TriggerDefinition valueTriggerDefinition);

    /**
     * Initializes the optional value {@link Task_Input#valueTriggerDefinition() valueTriggerDefinition} to valueTriggerDefinition.
     * @param valueTriggerDefinition The value for valueTriggerDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueTriggerDefinition(Optional<? extends TriggerDefinition> valueTriggerDefinition);

    /**
     * Initializes the optional value {@link Task_Input#valueAnnotation() valueAnnotation} to valueAnnotation.
     * @param valueAnnotation The value for valueAnnotation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueAnnotation(Annotation valueAnnotation);

    /**
     * Initializes the optional value {@link Task_Input#valueAnnotation() valueAnnotation} to valueAnnotation.
     * @param valueAnnotation The value for valueAnnotation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueAnnotation(Optional<? extends Annotation> valueAnnotation);

    /**
     * Initializes the optional value {@link Task_Input#valueContributor() valueContributor} to valueContributor.
     * @param valueContributor The value for valueContributor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueContributor(Contributor valueContributor);

    /**
     * Initializes the optional value {@link Task_Input#valueContributor() valueContributor} to valueContributor.
     * @param valueContributor The value for valueContributor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueContributor(Optional<? extends Contributor> valueContributor);

    /**
     * Initializes the optional value {@link Task_Input#valueDate() valueDate} to valueDate.
     * @param valueDate The value for valueDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueDate(String valueDate);

    /**
     * Initializes the optional value {@link Task_Input#valueDate() valueDate} to valueDate.
     * @param valueDate The value for valueDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueDate(Optional<String> valueDate);

    /**
     * Initializes the optional value {@link Task_Input#valueCount() valueCount} to valueCount.
     * @param valueCount The value for valueCount
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueCount(Count valueCount);

    /**
     * Initializes the optional value {@link Task_Input#valueCount() valueCount} to valueCount.
     * @param valueCount The value for valueCount
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueCount(Optional<? extends Count> valueCount);

    /**
     * Initializes the optional value {@link Task_Input#valueInstant() valueInstant} to valueInstant.
     * @param valueInstant The value for valueInstant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueInstant(String valueInstant);

    /**
     * Initializes the optional value {@link Task_Input#valueInstant() valueInstant} to valueInstant.
     * @param valueInstant The value for valueInstant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueInstant(Optional<String> valueInstant);

    /**
     * Initializes the optional value {@link Task_Input#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueRange(Range valueRange);

    /**
     * Initializes the optional value {@link Task_Input#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueRange(Optional<? extends Range> valueRange);

    /**
     * Initializes the optional value {@link Task_Input#valueUri() valueUri} to valueUri.
     * @param valueUri The value for valueUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueUri(String valueUri);

    /**
     * Initializes the optional value {@link Task_Input#valueUri() valueUri} to valueUri.
     * @param valueUri The value for valueUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueUri(Optional<String> valueUri);

    /**
     * Initializes the optional value {@link Task_Input#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueQuantity(Quantity valueQuantity);

    /**
     * Initializes the optional value {@link Task_Input#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueQuantity(Optional<? extends Quantity> valueQuantity);

    /**
     * Initializes the optional value {@link Task_Input#valueMarkdown() valueMarkdown} to valueMarkdown.
     * @param valueMarkdown The value for valueMarkdown
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueMarkdown(String valueMarkdown);

    /**
     * Initializes the optional value {@link Task_Input#valueMarkdown() valueMarkdown} to valueMarkdown.
     * @param valueMarkdown The value for valueMarkdown
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueMarkdown(Optional<String> valueMarkdown);

    /**
     * Initializes the optional value {@link Task_Input#valueUrl() valueUrl} to valueUrl.
     * @param valueUrl The value for valueUrl
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueUrl(String valueUrl);

    /**
     * Initializes the optional value {@link Task_Input#valueUrl() valueUrl} to valueUrl.
     * @param valueUrl The value for valueUrl
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueUrl(Optional<String> valueUrl);

    /**
     * Initializes the optional value {@link Task_Input#valueRelatedArtifact() valueRelatedArtifact} to valueRelatedArtifact.
     * @param valueRelatedArtifact The value for valueRelatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueRelatedArtifact(RelatedArtifact valueRelatedArtifact);

    /**
     * Initializes the optional value {@link Task_Input#valueRelatedArtifact() valueRelatedArtifact} to valueRelatedArtifact.
     * @param valueRelatedArtifact The value for valueRelatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueRelatedArtifact(Optional<? extends RelatedArtifact> valueRelatedArtifact);

    /**
     * Initializes the optional value {@link Task_Input#valueId() valueId} to valueId.
     * @param valueId The value for valueId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueId(String valueId);

    /**
     * Initializes the optional value {@link Task_Input#valueId() valueId} to valueId.
     * @param valueId The value for valueId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueId(Optional<String> valueId);

    /**
     * Builds a new {@link Task_Input Task_Input}.
     * @return An immutable instance of Task_Input
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Task_Input build();
  }
}