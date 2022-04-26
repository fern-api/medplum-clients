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
 * Immutable implementation of {@link Extension}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExtension.builder()}.
 */
@Generated(from = "Extension", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExtension implements Extension {
  private final @Nullable Ratio valueRatio;
  private final @Nullable SampledData valueSampledData;
  private final @Nullable Double valueUnsignedInt;
  private final @Nullable Annotation valueAnnotation;
  private final @Nullable Reference valueReference;
  private final @Nullable String valueCanonical;
  private final @Nullable String valueString;
  private final @Nullable Expression valueExpression;
  private final @Nullable String valueMarkdown;
  private final @Nullable Age valueAge;
  private final @Nullable String valueBase64Binary;
  private final @Nullable Attachment valueAttachment;
  private final @Nullable String valueTime;
  private final @Nullable String valueUri;
  private final @Nullable String valueDateTime;
  private final @Nullable String valueDate;
  private final @Nullable ContactDetail valueContactDetail;
  private final @Nullable RelatedArtifact valueRelatedArtifact;
  private final @Nullable Dosage valueDosage;
  private final @Nullable HumanName valueHumanName;
  private final @Nullable Double valueInteger;
  private final @Nullable Double valueDecimal;
  private final @Nullable ContactPoint valueContactPoint;
  private final @Nullable TriggerDefinition valueTriggerDefinition;
  private final @Nullable ParameterDefinition valueParameterDefinition;
  private final @Nullable Duration valueDuration;
  private final @Nullable Uri url;
  private final @Nullable Double valuePositiveInt;
  private final @Nullable Distance valueDistance;
  private final @Nullable Meta valueMeta;
  private final @Nullable Timing valueTiming;
  private final @Nullable Identifier valueIdentifier;
  private final @Nullable UsageContext valueUsageContext;
  private final @Nullable String valueCode;
  private final @Nullable Range valueRange;
  private final @Nullable Quantity valueQuantity;
  private final @Nullable String valueInstant;
  private final @Nullable Money valueMoney;
  private final @Nullable Contributor valueContributor;
  private final @Nullable Address valueAddress;
  private final @Nullable Boolean valueBoolean;
  private final @Nullable String valueId;
  private final @Nullable String valueUuid;
  private final @Nullable String id;
  private final @Nullable Count valueCount;
  private final @Nullable DataRequirement valueDataRequirement;
  private final @Nullable String valueUrl;
  private final @Nullable Signature valueSignature;
  private final @Nullable Period valuePeriod;
  private final @Nullable String valueOid;
  private final @Nullable CodeableConcept valueCodeableConcept;
  private final @Nullable List<Extension> extension;
  private final @Nullable Coding valueCoding;

  private ImmutableExtension(
      @Nullable Ratio valueRatio,
      @Nullable SampledData valueSampledData,
      @Nullable Double valueUnsignedInt,
      @Nullable Annotation valueAnnotation,
      @Nullable Reference valueReference,
      @Nullable String valueCanonical,
      @Nullable String valueString,
      @Nullable Expression valueExpression,
      @Nullable String valueMarkdown,
      @Nullable Age valueAge,
      @Nullable String valueBase64Binary,
      @Nullable Attachment valueAttachment,
      @Nullable String valueTime,
      @Nullable String valueUri,
      @Nullable String valueDateTime,
      @Nullable String valueDate,
      @Nullable ContactDetail valueContactDetail,
      @Nullable RelatedArtifact valueRelatedArtifact,
      @Nullable Dosage valueDosage,
      @Nullable HumanName valueHumanName,
      @Nullable Double valueInteger,
      @Nullable Double valueDecimal,
      @Nullable ContactPoint valueContactPoint,
      @Nullable TriggerDefinition valueTriggerDefinition,
      @Nullable ParameterDefinition valueParameterDefinition,
      @Nullable Duration valueDuration,
      @Nullable Uri url,
      @Nullable Double valuePositiveInt,
      @Nullable Distance valueDistance,
      @Nullable Meta valueMeta,
      @Nullable Timing valueTiming,
      @Nullable Identifier valueIdentifier,
      @Nullable UsageContext valueUsageContext,
      @Nullable String valueCode,
      @Nullable Range valueRange,
      @Nullable Quantity valueQuantity,
      @Nullable String valueInstant,
      @Nullable Money valueMoney,
      @Nullable Contributor valueContributor,
      @Nullable Address valueAddress,
      @Nullable Boolean valueBoolean,
      @Nullable String valueId,
      @Nullable String valueUuid,
      @Nullable String id,
      @Nullable Count valueCount,
      @Nullable DataRequirement valueDataRequirement,
      @Nullable String valueUrl,
      @Nullable Signature valueSignature,
      @Nullable Period valuePeriod,
      @Nullable String valueOid,
      @Nullable CodeableConcept valueCodeableConcept,
      @Nullable List<Extension> extension,
      @Nullable Coding valueCoding) {
    this.valueRatio = valueRatio;
    this.valueSampledData = valueSampledData;
    this.valueUnsignedInt = valueUnsignedInt;
    this.valueAnnotation = valueAnnotation;
    this.valueReference = valueReference;
    this.valueCanonical = valueCanonical;
    this.valueString = valueString;
    this.valueExpression = valueExpression;
    this.valueMarkdown = valueMarkdown;
    this.valueAge = valueAge;
    this.valueBase64Binary = valueBase64Binary;
    this.valueAttachment = valueAttachment;
    this.valueTime = valueTime;
    this.valueUri = valueUri;
    this.valueDateTime = valueDateTime;
    this.valueDate = valueDate;
    this.valueContactDetail = valueContactDetail;
    this.valueRelatedArtifact = valueRelatedArtifact;
    this.valueDosage = valueDosage;
    this.valueHumanName = valueHumanName;
    this.valueInteger = valueInteger;
    this.valueDecimal = valueDecimal;
    this.valueContactPoint = valueContactPoint;
    this.valueTriggerDefinition = valueTriggerDefinition;
    this.valueParameterDefinition = valueParameterDefinition;
    this.valueDuration = valueDuration;
    this.url = url;
    this.valuePositiveInt = valuePositiveInt;
    this.valueDistance = valueDistance;
    this.valueMeta = valueMeta;
    this.valueTiming = valueTiming;
    this.valueIdentifier = valueIdentifier;
    this.valueUsageContext = valueUsageContext;
    this.valueCode = valueCode;
    this.valueRange = valueRange;
    this.valueQuantity = valueQuantity;
    this.valueInstant = valueInstant;
    this.valueMoney = valueMoney;
    this.valueContributor = valueContributor;
    this.valueAddress = valueAddress;
    this.valueBoolean = valueBoolean;
    this.valueId = valueId;
    this.valueUuid = valueUuid;
    this.id = id;
    this.valueCount = valueCount;
    this.valueDataRequirement = valueDataRequirement;
    this.valueUrl = valueUrl;
    this.valueSignature = valueSignature;
    this.valuePeriod = valuePeriod;
    this.valueOid = valueOid;
    this.valueCodeableConcept = valueCodeableConcept;
    this.extension = extension;
    this.valueCoding = valueCoding;
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
   * @return The value of the {@code valueSampledData} attribute
   */
  @JsonProperty("valueSampledData")
  @Override
  public Optional<SampledData> valueSampledData() {
    return Optional.ofNullable(valueSampledData);
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
   * @return The value of the {@code valueAnnotation} attribute
   */
  @JsonProperty("valueAnnotation")
  @Override
  public Optional<Annotation> valueAnnotation() {
    return Optional.ofNullable(valueAnnotation);
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
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
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
   * @return The value of the {@code valueMarkdown} attribute
   */
  @JsonProperty("valueMarkdown")
  @Override
  public Optional<String> valueMarkdown() {
    return Optional.ofNullable(valueMarkdown);
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
   * @return The value of the {@code valueBase64Binary} attribute
   */
  @JsonProperty("valueBase64Binary")
  @Override
  public Optional<String> valueBase64Binary() {
    return Optional.ofNullable(valueBase64Binary);
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
   * @return The value of the {@code valueTime} attribute
   */
  @JsonProperty("valueTime")
  @Override
  public Optional<String> valueTime() {
    return Optional.ofNullable(valueTime);
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
   * @return The value of the {@code valueDateTime} attribute
   */
  @JsonProperty("valueDateTime")
  @Override
  public Optional<String> valueDateTime() {
    return Optional.ofNullable(valueDateTime);
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
   * @return The value of the {@code valueContactDetail} attribute
   */
  @JsonProperty("valueContactDetail")
  @Override
  public Optional<ContactDetail> valueContactDetail() {
    return Optional.ofNullable(valueContactDetail);
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
   * @return The value of the {@code valueDosage} attribute
   */
  @JsonProperty("valueDosage")
  @Override
  public Optional<Dosage> valueDosage() {
    return Optional.ofNullable(valueDosage);
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
   * @return The value of the {@code valueInteger} attribute
   */
  @JsonProperty("valueInteger")
  @Override
  public Optional<Double> valueInteger() {
    return Optional.ofNullable(valueInteger);
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
   * @return The value of the {@code valueContactPoint} attribute
   */
  @JsonProperty("valueContactPoint")
  @Override
  public Optional<ContactPoint> valueContactPoint() {
    return Optional.ofNullable(valueContactPoint);
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
   * @return The value of the {@code valueParameterDefinition} attribute
   */
  @JsonProperty("valueParameterDefinition")
  @Override
  public Optional<ParameterDefinition> valueParameterDefinition() {
    return Optional.ofNullable(valueParameterDefinition);
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
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
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
   * @return The value of the {@code valueDistance} attribute
   */
  @JsonProperty("valueDistance")
  @Override
  public Optional<Distance> valueDistance() {
    return Optional.ofNullable(valueDistance);
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
   * @return The value of the {@code valueTiming} attribute
   */
  @JsonProperty("valueTiming")
  @Override
  public Optional<Timing> valueTiming() {
    return Optional.ofNullable(valueTiming);
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
   * @return The value of the {@code valueUsageContext} attribute
   */
  @JsonProperty("valueUsageContext")
  @Override
  public Optional<UsageContext> valueUsageContext() {
    return Optional.ofNullable(valueUsageContext);
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
   * @return The value of the {@code valueRange} attribute
   */
  @JsonProperty("valueRange")
  @Override
  public Optional<Range> valueRange() {
    return Optional.ofNullable(valueRange);
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
   * @return The value of the {@code valueInstant} attribute
   */
  @JsonProperty("valueInstant")
  @Override
  public Optional<String> valueInstant() {
    return Optional.ofNullable(valueInstant);
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
   * @return The value of the {@code valueContributor} attribute
   */
  @JsonProperty("valueContributor")
  @Override
  public Optional<Contributor> valueContributor() {
    return Optional.ofNullable(valueContributor);
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
   * @return The value of the {@code valueBoolean} attribute
   */
  @JsonProperty("valueBoolean")
  @Override
  public Optional<Boolean> valueBoolean() {
    return Optional.ofNullable(valueBoolean);
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
   * @return The value of the {@code valueUuid} attribute
   */
  @JsonProperty("valueUuid")
  @Override
  public Optional<String> valueUuid() {
    return Optional.ofNullable(valueUuid);
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
   * @return The value of the {@code valueCount} attribute
   */
  @JsonProperty("valueCount")
  @Override
  public Optional<Count> valueCount() {
    return Optional.ofNullable(valueCount);
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
   * @return The value of the {@code valueUrl} attribute
   */
  @JsonProperty("valueUrl")
  @Override
  public Optional<String> valueUrl() {
    return Optional.ofNullable(valueUrl);
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
   * @return The value of the {@code valuePeriod} attribute
   */
  @JsonProperty("valuePeriod")
  @Override
  public Optional<Period> valuePeriod() {
    return Optional.ofNullable(valuePeriod);
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
   * @return The value of the {@code valueCodeableConcept} attribute
   */
  @JsonProperty("valueCodeableConcept")
  @Override
  public Optional<CodeableConcept> valueCodeableConcept() {
    return Optional.ofNullable(valueCodeableConcept);
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
   * @return The value of the {@code valueCoding} attribute
   */
  @JsonProperty("valueCoding")
  @Override
  public Optional<Coding> valueCoding() {
    return Optional.ofNullable(valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueRatio() valueRatio} attribute.
   * @param value The value for valueRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueRatio(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "valueRatio");
    if (this.valueRatio == newValue) return this;
    return new ImmutableExtension(
        newValue,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueRatio() valueRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueRatio(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.valueRatio == value) return this;
    return new ImmutableExtension(
        value,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueSampledData() valueSampledData} attribute.
   * @param value The value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueSampledData(SampledData value) {
    @Nullable SampledData newValue = Objects.requireNonNull(value, "valueSampledData");
    if (this.valueSampledData == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        newValue,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueSampledData() valueSampledData} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueSampledData(Optional<? extends SampledData> optional) {
    @Nullable SampledData value = optional.orElse(null);
    if (this.valueSampledData == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        value,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueUnsignedInt() valueUnsignedInt} attribute.
   * @param value The value for valueUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUnsignedInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueUnsignedInt, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        newValue,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueUnsignedInt() valueUnsignedInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUnsignedInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueUnsignedInt, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        value,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueAnnotation() valueAnnotation} attribute.
   * @param value The value for valueAnnotation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueAnnotation(Annotation value) {
    @Nullable Annotation newValue = Objects.requireNonNull(value, "valueAnnotation");
    if (this.valueAnnotation == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        newValue,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueAnnotation() valueAnnotation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAnnotation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueAnnotation(Optional<? extends Annotation> optional) {
    @Nullable Annotation value = optional.orElse(null);
    if (this.valueAnnotation == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        value,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueReference() valueReference} attribute.
   * @param value The value for valueReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "valueReference");
    if (this.valueReference == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        newValue,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueReference() valueReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.valueReference == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        value,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueCanonical() valueCanonical} attribute.
   * @param value The value for valueCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCanonical(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueCanonical");
    if (Objects.equals(this.valueCanonical, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        newValue,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueCanonical() valueCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCanonical(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueCanonical, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        value,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        newValue,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        value,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueExpression() valueExpression} attribute.
   * @param value The value for valueExpression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueExpression(Expression value) {
    @Nullable Expression newValue = Objects.requireNonNull(value, "valueExpression");
    if (this.valueExpression == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        newValue,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueExpression() valueExpression} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueExpression
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueExpression(Optional<? extends Expression> optional) {
    @Nullable Expression value = optional.orElse(null);
    if (this.valueExpression == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        value,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueMarkdown() valueMarkdown} attribute.
   * @param value The value for valueMarkdown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueMarkdown(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueMarkdown");
    if (Objects.equals(this.valueMarkdown, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        newValue,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueMarkdown() valueMarkdown} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMarkdown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueMarkdown(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueMarkdown, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        value,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueAge() valueAge} attribute.
   * @param value The value for valueAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "valueAge");
    if (this.valueAge == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        newValue,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueAge() valueAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.valueAge == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        value,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueBase64Binary() valueBase64Binary} attribute.
   * @param value The value for valueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueBase64Binary(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueBase64Binary");
    if (Objects.equals(this.valueBase64Binary, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        newValue,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueBase64Binary() valueBase64Binary} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueBase64Binary(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueBase64Binary, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        value,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueAttachment() valueAttachment} attribute.
   * @param value The value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "valueAttachment");
    if (this.valueAttachment == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        newValue,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueAttachment() valueAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.valueAttachment == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        value,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueTime() valueTime} attribute.
   * @param value The value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueTime");
    if (Objects.equals(this.valueTime, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        newValue,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueTime() valueTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueTime, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        value,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueUri() valueUri} attribute.
   * @param value The value for valueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueUri");
    if (Objects.equals(this.valueUri, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        newValue,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueUri() valueUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueUri, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        value,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDateTime() valueDateTime} attribute.
   * @param value The value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDateTime");
    if (Objects.equals(this.valueDateTime, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        newValue,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDateTime() valueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDateTime, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        value,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDate() valueDate} attribute.
   * @param value The value for valueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueDate");
    if (Objects.equals(this.valueDate, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        newValue,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDate() valueDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueDate, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        value,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueContactDetail() valueContactDetail} attribute.
   * @param value The value for valueContactDetail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueContactDetail(ContactDetail value) {
    @Nullable ContactDetail newValue = Objects.requireNonNull(value, "valueContactDetail");
    if (this.valueContactDetail == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        newValue,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueContactDetail() valueContactDetail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueContactDetail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueContactDetail(Optional<? extends ContactDetail> optional) {
    @Nullable ContactDetail value = optional.orElse(null);
    if (this.valueContactDetail == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        value,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueRelatedArtifact() valueRelatedArtifact} attribute.
   * @param value The value for valueRelatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueRelatedArtifact(RelatedArtifact value) {
    @Nullable RelatedArtifact newValue = Objects.requireNonNull(value, "valueRelatedArtifact");
    if (this.valueRelatedArtifact == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        newValue,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueRelatedArtifact() valueRelatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRelatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueRelatedArtifact(Optional<? extends RelatedArtifact> optional) {
    @Nullable RelatedArtifact value = optional.orElse(null);
    if (this.valueRelatedArtifact == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        value,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDosage() valueDosage} attribute.
   * @param value The value for valueDosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDosage(Dosage value) {
    @Nullable Dosage newValue = Objects.requireNonNull(value, "valueDosage");
    if (this.valueDosage == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        newValue,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDosage() valueDosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueDosage(Optional<? extends Dosage> optional) {
    @Nullable Dosage value = optional.orElse(null);
    if (this.valueDosage == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        value,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueHumanName() valueHumanName} attribute.
   * @param value The value for valueHumanName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueHumanName(HumanName value) {
    @Nullable HumanName newValue = Objects.requireNonNull(value, "valueHumanName");
    if (this.valueHumanName == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        newValue,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueHumanName() valueHumanName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueHumanName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueHumanName(Optional<? extends HumanName> optional) {
    @Nullable HumanName value = optional.orElse(null);
    if (this.valueHumanName == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        value,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        newValue,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        value,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDecimal() valueDecimal} attribute.
   * @param value The value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDecimal(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueDecimal, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        newValue,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDecimal() valueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDecimal(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueDecimal, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        value,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueContactPoint() valueContactPoint} attribute.
   * @param value The value for valueContactPoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueContactPoint(ContactPoint value) {
    @Nullable ContactPoint newValue = Objects.requireNonNull(value, "valueContactPoint");
    if (this.valueContactPoint == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        newValue,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueContactPoint() valueContactPoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueContactPoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueContactPoint(Optional<? extends ContactPoint> optional) {
    @Nullable ContactPoint value = optional.orElse(null);
    if (this.valueContactPoint == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        value,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueTriggerDefinition() valueTriggerDefinition} attribute.
   * @param value The value for valueTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueTriggerDefinition(TriggerDefinition value) {
    @Nullable TriggerDefinition newValue = Objects.requireNonNull(value, "valueTriggerDefinition");
    if (this.valueTriggerDefinition == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        newValue,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueTriggerDefinition() valueTriggerDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueTriggerDefinition(Optional<? extends TriggerDefinition> optional) {
    @Nullable TriggerDefinition value = optional.orElse(null);
    if (this.valueTriggerDefinition == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        value,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueParameterDefinition() valueParameterDefinition} attribute.
   * @param value The value for valueParameterDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueParameterDefinition(ParameterDefinition value) {
    @Nullable ParameterDefinition newValue = Objects.requireNonNull(value, "valueParameterDefinition");
    if (this.valueParameterDefinition == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        newValue,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueParameterDefinition() valueParameterDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueParameterDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueParameterDefinition(Optional<? extends ParameterDefinition> optional) {
    @Nullable ParameterDefinition value = optional.orElse(null);
    if (this.valueParameterDefinition == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        value,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDuration() valueDuration} attribute.
   * @param value The value for valueDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "valueDuration");
    if (this.valueDuration == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        newValue,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDuration() valueDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.valueDuration == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        value,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        newValue,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        value,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valuePositiveInt() valuePositiveInt} attribute.
   * @param value The value for valuePositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValuePositiveInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valuePositiveInt, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        newValue,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valuePositiveInt() valuePositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuePositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValuePositiveInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valuePositiveInt, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        value,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDistance() valueDistance} attribute.
   * @param value The value for valueDistance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDistance(Distance value) {
    @Nullable Distance newValue = Objects.requireNonNull(value, "valueDistance");
    if (this.valueDistance == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        newValue,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDistance() valueDistance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDistance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueDistance(Optional<? extends Distance> optional) {
    @Nullable Distance value = optional.orElse(null);
    if (this.valueDistance == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        value,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueMeta() valueMeta} attribute.
   * @param value The value for valueMeta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "valueMeta");
    if (this.valueMeta == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        newValue,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueMeta() valueMeta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMeta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.valueMeta == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        value,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueTiming() valueTiming} attribute.
   * @param value The value for valueTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "valueTiming");
    if (this.valueTiming == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        newValue,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueTiming() valueTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.valueTiming == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        value,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueIdentifier() valueIdentifier} attribute.
   * @param value The value for valueIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "valueIdentifier");
    if (this.valueIdentifier == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        newValue,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueIdentifier() valueIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.valueIdentifier == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        value,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueUsageContext() valueUsageContext} attribute.
   * @param value The value for valueUsageContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUsageContext(UsageContext value) {
    @Nullable UsageContext newValue = Objects.requireNonNull(value, "valueUsageContext");
    if (this.valueUsageContext == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        newValue,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueUsageContext() valueUsageContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUsageContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueUsageContext(Optional<? extends UsageContext> optional) {
    @Nullable UsageContext value = optional.orElse(null);
    if (this.valueUsageContext == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        value,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueCode() valueCode} attribute.
   * @param value The value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCode(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueCode");
    if (Objects.equals(this.valueCode, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        newValue,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueCode() valueCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCode(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueCode, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        value,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueRange() valueRange} attribute.
   * @param value The value for valueRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "valueRange");
    if (this.valueRange == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        newValue,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueRange() valueRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.valueRange == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        value,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        newValue,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        value,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueInstant() valueInstant} attribute.
   * @param value The value for valueInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueInstant(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueInstant");
    if (Objects.equals(this.valueInstant, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        newValue,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueInstant() valueInstant} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueInstant(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueInstant, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        value,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueMoney() valueMoney} attribute.
   * @param value The value for valueMoney
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueMoney(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "valueMoney");
    if (this.valueMoney == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        newValue,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueMoney() valueMoney} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMoney
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueMoney(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.valueMoney == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        value,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueContributor() valueContributor} attribute.
   * @param value The value for valueContributor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueContributor(Contributor value) {
    @Nullable Contributor newValue = Objects.requireNonNull(value, "valueContributor");
    if (this.valueContributor == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        newValue,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueContributor() valueContributor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueContributor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueContributor(Optional<? extends Contributor> optional) {
    @Nullable Contributor value = optional.orElse(null);
    if (this.valueContributor == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        value,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueAddress() valueAddress} attribute.
   * @param value The value for valueAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueAddress(Address value) {
    @Nullable Address newValue = Objects.requireNonNull(value, "valueAddress");
    if (this.valueAddress == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        newValue,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueAddress() valueAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueAddress(Optional<? extends Address> optional) {
    @Nullable Address value = optional.orElse(null);
    if (this.valueAddress == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        value,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        newValue,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        value,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueId() valueId} attribute.
   * @param value The value for valueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueId");
    if (Objects.equals(this.valueId, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        newValue,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueId() valueId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueId, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        value,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueUuid() valueUuid} attribute.
   * @param value The value for valueUuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUuid(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueUuid");
    if (Objects.equals(this.valueUuid, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        newValue,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueUuid() valueUuid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUuid(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueUuid, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        value,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        newValue,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        value,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueCount() valueCount} attribute.
   * @param value The value for valueCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCount(Count value) {
    @Nullable Count newValue = Objects.requireNonNull(value, "valueCount");
    if (this.valueCount == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        newValue,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueCount() valueCount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueCount(Optional<? extends Count> optional) {
    @Nullable Count value = optional.orElse(null);
    if (this.valueCount == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        value,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDataRequirement() valueDataRequirement} attribute.
   * @param value The value for valueDataRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDataRequirement(DataRequirement value) {
    @Nullable DataRequirement newValue = Objects.requireNonNull(value, "valueDataRequirement");
    if (this.valueDataRequirement == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        newValue,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDataRequirement() valueDataRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDataRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueDataRequirement(Optional<? extends DataRequirement> optional) {
    @Nullable DataRequirement value = optional.orElse(null);
    if (this.valueDataRequirement == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        value,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueUrl() valueUrl} attribute.
   * @param value The value for valueUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUrl(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueUrl");
    if (Objects.equals(this.valueUrl, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        newValue,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueUrl() valueUrl} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUrl(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueUrl, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        value,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueSignature() valueSignature} attribute.
   * @param value The value for valueSignature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueSignature(Signature value) {
    @Nullable Signature newValue = Objects.requireNonNull(value, "valueSignature");
    if (this.valueSignature == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        newValue,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueSignature() valueSignature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSignature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueSignature(Optional<? extends Signature> optional) {
    @Nullable Signature value = optional.orElse(null);
    if (this.valueSignature == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        value,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valuePeriod() valuePeriod} attribute.
   * @param value The value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValuePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "valuePeriod");
    if (this.valuePeriod == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        newValue,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valuePeriod() valuePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValuePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.valuePeriod == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        value,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueOid() valueOid} attribute.
   * @param value The value for valueOid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueOid(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueOid");
    if (Objects.equals(this.valueOid, newValue)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        newValue,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueOid() valueOid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueOid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueOid(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueOid, value)) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        value,
        this.valueCodeableConcept,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueCodeableConcept() valueCodeableConcept} attribute.
   * @param value The value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "valueCodeableConcept");
    if (this.valueCodeableConcept == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        newValue,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueCodeableConcept() valueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.valueCodeableConcept == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        value,
        this.extension,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        newValue,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        value,
        this.valueCoding);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueCoding() valueCoding} attribute.
   * @param value The value for valueCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCoding(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "valueCoding");
    if (this.valueCoding == newValue) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueCoding() valueCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueCoding(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.valueCoding == value) return this;
    return new ImmutableExtension(
        this.valueRatio,
        this.valueSampledData,
        this.valueUnsignedInt,
        this.valueAnnotation,
        this.valueReference,
        this.valueCanonical,
        this.valueString,
        this.valueExpression,
        this.valueMarkdown,
        this.valueAge,
        this.valueBase64Binary,
        this.valueAttachment,
        this.valueTime,
        this.valueUri,
        this.valueDateTime,
        this.valueDate,
        this.valueContactDetail,
        this.valueRelatedArtifact,
        this.valueDosage,
        this.valueHumanName,
        this.valueInteger,
        this.valueDecimal,
        this.valueContactPoint,
        this.valueTriggerDefinition,
        this.valueParameterDefinition,
        this.valueDuration,
        this.url,
        this.valuePositiveInt,
        this.valueDistance,
        this.valueMeta,
        this.valueTiming,
        this.valueIdentifier,
        this.valueUsageContext,
        this.valueCode,
        this.valueRange,
        this.valueQuantity,
        this.valueInstant,
        this.valueMoney,
        this.valueContributor,
        this.valueAddress,
        this.valueBoolean,
        this.valueId,
        this.valueUuid,
        this.id,
        this.valueCount,
        this.valueDataRequirement,
        this.valueUrl,
        this.valueSignature,
        this.valuePeriod,
        this.valueOid,
        this.valueCodeableConcept,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExtension} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExtension
        && equalTo((ImmutableExtension) another);
  }

  private boolean equalTo(ImmutableExtension another) {
    return Objects.equals(valueRatio, another.valueRatio)
        && Objects.equals(valueSampledData, another.valueSampledData)
        && Objects.equals(valueUnsignedInt, another.valueUnsignedInt)
        && Objects.equals(valueAnnotation, another.valueAnnotation)
        && Objects.equals(valueReference, another.valueReference)
        && Objects.equals(valueCanonical, another.valueCanonical)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(valueExpression, another.valueExpression)
        && Objects.equals(valueMarkdown, another.valueMarkdown)
        && Objects.equals(valueAge, another.valueAge)
        && Objects.equals(valueBase64Binary, another.valueBase64Binary)
        && Objects.equals(valueAttachment, another.valueAttachment)
        && Objects.equals(valueTime, another.valueTime)
        && Objects.equals(valueUri, another.valueUri)
        && Objects.equals(valueDateTime, another.valueDateTime)
        && Objects.equals(valueDate, another.valueDate)
        && Objects.equals(valueContactDetail, another.valueContactDetail)
        && Objects.equals(valueRelatedArtifact, another.valueRelatedArtifact)
        && Objects.equals(valueDosage, another.valueDosage)
        && Objects.equals(valueHumanName, another.valueHumanName)
        && Objects.equals(valueInteger, another.valueInteger)
        && Objects.equals(valueDecimal, another.valueDecimal)
        && Objects.equals(valueContactPoint, another.valueContactPoint)
        && Objects.equals(valueTriggerDefinition, another.valueTriggerDefinition)
        && Objects.equals(valueParameterDefinition, another.valueParameterDefinition)
        && Objects.equals(valueDuration, another.valueDuration)
        && Objects.equals(url, another.url)
        && Objects.equals(valuePositiveInt, another.valuePositiveInt)
        && Objects.equals(valueDistance, another.valueDistance)
        && Objects.equals(valueMeta, another.valueMeta)
        && Objects.equals(valueTiming, another.valueTiming)
        && Objects.equals(valueIdentifier, another.valueIdentifier)
        && Objects.equals(valueUsageContext, another.valueUsageContext)
        && Objects.equals(valueCode, another.valueCode)
        && Objects.equals(valueRange, another.valueRange)
        && Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(valueInstant, another.valueInstant)
        && Objects.equals(valueMoney, another.valueMoney)
        && Objects.equals(valueContributor, another.valueContributor)
        && Objects.equals(valueAddress, another.valueAddress)
        && Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(valueId, another.valueId)
        && Objects.equals(valueUuid, another.valueUuid)
        && Objects.equals(id, another.id)
        && Objects.equals(valueCount, another.valueCount)
        && Objects.equals(valueDataRequirement, another.valueDataRequirement)
        && Objects.equals(valueUrl, another.valueUrl)
        && Objects.equals(valueSignature, another.valueSignature)
        && Objects.equals(valuePeriod, another.valuePeriod)
        && Objects.equals(valueOid, another.valueOid)
        && Objects.equals(valueCodeableConcept, another.valueCodeableConcept)
        && Objects.equals(extension, another.extension)
        && Objects.equals(valueCoding, another.valueCoding);
  }

  /**
   * Computes a hash code from attributes: {@code valueRatio}, {@code valueSampledData}, {@code valueUnsignedInt}, {@code valueAnnotation}, {@code valueReference}, {@code valueCanonical}, {@code valueString}, {@code valueExpression}, {@code valueMarkdown}, {@code valueAge}, {@code valueBase64Binary}, {@code valueAttachment}, {@code valueTime}, {@code valueUri}, {@code valueDateTime}, {@code valueDate}, {@code valueContactDetail}, {@code valueRelatedArtifact}, {@code valueDosage}, {@code valueHumanName}, {@code valueInteger}, {@code valueDecimal}, {@code valueContactPoint}, {@code valueTriggerDefinition}, {@code valueParameterDefinition}, {@code valueDuration}, {@code url}, {@code valuePositiveInt}, {@code valueDistance}, {@code valueMeta}, {@code valueTiming}, {@code valueIdentifier}, {@code valueUsageContext}, {@code valueCode}, {@code valueRange}, {@code valueQuantity}, {@code valueInstant}, {@code valueMoney}, {@code valueContributor}, {@code valueAddress}, {@code valueBoolean}, {@code valueId}, {@code valueUuid}, {@code id}, {@code valueCount}, {@code valueDataRequirement}, {@code valueUrl}, {@code valueSignature}, {@code valuePeriod}, {@code valueOid}, {@code valueCodeableConcept}, {@code extension}, {@code valueCoding}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(valueRatio);
    h += (h << 5) + Objects.hashCode(valueSampledData);
    h += (h << 5) + Objects.hashCode(valueUnsignedInt);
    h += (h << 5) + Objects.hashCode(valueAnnotation);
    h += (h << 5) + Objects.hashCode(valueReference);
    h += (h << 5) + Objects.hashCode(valueCanonical);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(valueExpression);
    h += (h << 5) + Objects.hashCode(valueMarkdown);
    h += (h << 5) + Objects.hashCode(valueAge);
    h += (h << 5) + Objects.hashCode(valueBase64Binary);
    h += (h << 5) + Objects.hashCode(valueAttachment);
    h += (h << 5) + Objects.hashCode(valueTime);
    h += (h << 5) + Objects.hashCode(valueUri);
    h += (h << 5) + Objects.hashCode(valueDateTime);
    h += (h << 5) + Objects.hashCode(valueDate);
    h += (h << 5) + Objects.hashCode(valueContactDetail);
    h += (h << 5) + Objects.hashCode(valueRelatedArtifact);
    h += (h << 5) + Objects.hashCode(valueDosage);
    h += (h << 5) + Objects.hashCode(valueHumanName);
    h += (h << 5) + Objects.hashCode(valueInteger);
    h += (h << 5) + Objects.hashCode(valueDecimal);
    h += (h << 5) + Objects.hashCode(valueContactPoint);
    h += (h << 5) + Objects.hashCode(valueTriggerDefinition);
    h += (h << 5) + Objects.hashCode(valueParameterDefinition);
    h += (h << 5) + Objects.hashCode(valueDuration);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(valuePositiveInt);
    h += (h << 5) + Objects.hashCode(valueDistance);
    h += (h << 5) + Objects.hashCode(valueMeta);
    h += (h << 5) + Objects.hashCode(valueTiming);
    h += (h << 5) + Objects.hashCode(valueIdentifier);
    h += (h << 5) + Objects.hashCode(valueUsageContext);
    h += (h << 5) + Objects.hashCode(valueCode);
    h += (h << 5) + Objects.hashCode(valueRange);
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(valueInstant);
    h += (h << 5) + Objects.hashCode(valueMoney);
    h += (h << 5) + Objects.hashCode(valueContributor);
    h += (h << 5) + Objects.hashCode(valueAddress);
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(valueId);
    h += (h << 5) + Objects.hashCode(valueUuid);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(valueCount);
    h += (h << 5) + Objects.hashCode(valueDataRequirement);
    h += (h << 5) + Objects.hashCode(valueUrl);
    h += (h << 5) + Objects.hashCode(valueSignature);
    h += (h << 5) + Objects.hashCode(valuePeriod);
    h += (h << 5) + Objects.hashCode(valueOid);
    h += (h << 5) + Objects.hashCode(valueCodeableConcept);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(valueCoding);
    return h;
  }

  /**
   * Prints the immutable value {@code Extension} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Extension{");
    if (valueRatio != null) {
      builder.append("valueRatio=").append(valueRatio);
    }
    if (valueSampledData != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueSampledData=").append(valueSampledData);
    }
    if (valueUnsignedInt != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueUnsignedInt=").append(valueUnsignedInt);
    }
    if (valueAnnotation != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueAnnotation=").append(valueAnnotation);
    }
    if (valueReference != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueReference=").append(valueReference);
    }
    if (valueCanonical != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueCanonical=").append(valueCanonical);
    }
    if (valueString != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueExpression != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueExpression=").append(valueExpression);
    }
    if (valueMarkdown != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueMarkdown=").append(valueMarkdown);
    }
    if (valueAge != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueAge=").append(valueAge);
    }
    if (valueBase64Binary != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueBase64Binary=").append(valueBase64Binary);
    }
    if (valueAttachment != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueAttachment=").append(valueAttachment);
    }
    if (valueTime != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueTime=").append(valueTime);
    }
    if (valueUri != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueUri=").append(valueUri);
    }
    if (valueDateTime != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDateTime=").append(valueDateTime);
    }
    if (valueDate != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDate=").append(valueDate);
    }
    if (valueContactDetail != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueContactDetail=").append(valueContactDetail);
    }
    if (valueRelatedArtifact != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueRelatedArtifact=").append(valueRelatedArtifact);
    }
    if (valueDosage != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDosage=").append(valueDosage);
    }
    if (valueHumanName != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueHumanName=").append(valueHumanName);
    }
    if (valueInteger != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (valueDecimal != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDecimal=").append(valueDecimal);
    }
    if (valueContactPoint != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueContactPoint=").append(valueContactPoint);
    }
    if (valueTriggerDefinition != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueTriggerDefinition=").append(valueTriggerDefinition);
    }
    if (valueParameterDefinition != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueParameterDefinition=").append(valueParameterDefinition);
    }
    if (valueDuration != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDuration=").append(valueDuration);
    }
    if (url != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (valuePositiveInt != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valuePositiveInt=").append(valuePositiveInt);
    }
    if (valueDistance != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDistance=").append(valueDistance);
    }
    if (valueMeta != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueMeta=").append(valueMeta);
    }
    if (valueTiming != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueTiming=").append(valueTiming);
    }
    if (valueIdentifier != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueIdentifier=").append(valueIdentifier);
    }
    if (valueUsageContext != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueUsageContext=").append(valueUsageContext);
    }
    if (valueCode != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueCode=").append(valueCode);
    }
    if (valueRange != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueRange=").append(valueRange);
    }
    if (valueQuantity != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (valueInstant != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueInstant=").append(valueInstant);
    }
    if (valueMoney != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueMoney=").append(valueMoney);
    }
    if (valueContributor != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueContributor=").append(valueContributor);
    }
    if (valueAddress != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueAddress=").append(valueAddress);
    }
    if (valueBoolean != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valueId != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueId=").append(valueId);
    }
    if (valueUuid != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueUuid=").append(valueUuid);
    }
    if (id != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (valueCount != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueCount=").append(valueCount);
    }
    if (valueDataRequirement != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDataRequirement=").append(valueDataRequirement);
    }
    if (valueUrl != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueUrl=").append(valueUrl);
    }
    if (valueSignature != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueSignature=").append(valueSignature);
    }
    if (valuePeriod != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valuePeriod=").append(valuePeriod);
    }
    if (valueOid != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueOid=").append(valueOid);
    }
    if (valueCodeableConcept != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueCodeableConcept=").append(valueCodeableConcept);
    }
    if (extension != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (valueCoding != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueCoding=").append(valueCoding);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Extension", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Extension {
    @Nullable Optional<Ratio> valueRatio = Optional.empty();
    boolean valueRatioIsSet;
    @Nullable Optional<SampledData> valueSampledData = Optional.empty();
    boolean valueSampledDataIsSet;
    @Nullable Optional<Double> valueUnsignedInt = Optional.empty();
    boolean valueUnsignedIntIsSet;
    @Nullable Optional<Annotation> valueAnnotation = Optional.empty();
    boolean valueAnnotationIsSet;
    @Nullable Optional<Reference> valueReference = Optional.empty();
    boolean valueReferenceIsSet;
    @Nullable Optional<String> valueCanonical = Optional.empty();
    boolean valueCanonicalIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<Expression> valueExpression = Optional.empty();
    boolean valueExpressionIsSet;
    @Nullable Optional<String> valueMarkdown = Optional.empty();
    boolean valueMarkdownIsSet;
    @Nullable Optional<Age> valueAge = Optional.empty();
    boolean valueAgeIsSet;
    @Nullable Optional<String> valueBase64Binary = Optional.empty();
    boolean valueBase64BinaryIsSet;
    @Nullable Optional<Attachment> valueAttachment = Optional.empty();
    boolean valueAttachmentIsSet;
    @Nullable Optional<String> valueTime = Optional.empty();
    boolean valueTimeIsSet;
    @Nullable Optional<String> valueUri = Optional.empty();
    boolean valueUriIsSet;
    @Nullable Optional<String> valueDateTime = Optional.empty();
    boolean valueDateTimeIsSet;
    @Nullable Optional<String> valueDate = Optional.empty();
    boolean valueDateIsSet;
    @Nullable Optional<ContactDetail> valueContactDetail = Optional.empty();
    boolean valueContactDetailIsSet;
    @Nullable Optional<RelatedArtifact> valueRelatedArtifact = Optional.empty();
    boolean valueRelatedArtifactIsSet;
    @Nullable Optional<Dosage> valueDosage = Optional.empty();
    boolean valueDosageIsSet;
    @Nullable Optional<HumanName> valueHumanName = Optional.empty();
    boolean valueHumanNameIsSet;
    @Nullable Optional<Double> valueInteger = Optional.empty();
    boolean valueIntegerIsSet;
    @Nullable Optional<Double> valueDecimal = Optional.empty();
    boolean valueDecimalIsSet;
    @Nullable Optional<ContactPoint> valueContactPoint = Optional.empty();
    boolean valueContactPointIsSet;
    @Nullable Optional<TriggerDefinition> valueTriggerDefinition = Optional.empty();
    boolean valueTriggerDefinitionIsSet;
    @Nullable Optional<ParameterDefinition> valueParameterDefinition = Optional.empty();
    boolean valueParameterDefinitionIsSet;
    @Nullable Optional<Duration> valueDuration = Optional.empty();
    boolean valueDurationIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Double> valuePositiveInt = Optional.empty();
    boolean valuePositiveIntIsSet;
    @Nullable Optional<Distance> valueDistance = Optional.empty();
    boolean valueDistanceIsSet;
    @Nullable Optional<Meta> valueMeta = Optional.empty();
    boolean valueMetaIsSet;
    @Nullable Optional<Timing> valueTiming = Optional.empty();
    boolean valueTimingIsSet;
    @Nullable Optional<Identifier> valueIdentifier = Optional.empty();
    boolean valueIdentifierIsSet;
    @Nullable Optional<UsageContext> valueUsageContext = Optional.empty();
    boolean valueUsageContextIsSet;
    @Nullable Optional<String> valueCode = Optional.empty();
    boolean valueCodeIsSet;
    @Nullable Optional<Range> valueRange = Optional.empty();
    boolean valueRangeIsSet;
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<String> valueInstant = Optional.empty();
    boolean valueInstantIsSet;
    @Nullable Optional<Money> valueMoney = Optional.empty();
    boolean valueMoneyIsSet;
    @Nullable Optional<Contributor> valueContributor = Optional.empty();
    boolean valueContributorIsSet;
    @Nullable Optional<Address> valueAddress = Optional.empty();
    boolean valueAddressIsSet;
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<String> valueId = Optional.empty();
    boolean valueIdIsSet;
    @Nullable Optional<String> valueUuid = Optional.empty();
    boolean valueUuidIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Count> valueCount = Optional.empty();
    boolean valueCountIsSet;
    @Nullable Optional<DataRequirement> valueDataRequirement = Optional.empty();
    boolean valueDataRequirementIsSet;
    @Nullable Optional<String> valueUrl = Optional.empty();
    boolean valueUrlIsSet;
    @Nullable Optional<Signature> valueSignature = Optional.empty();
    boolean valueSignatureIsSet;
    @Nullable Optional<Period> valuePeriod = Optional.empty();
    boolean valuePeriodIsSet;
    @Nullable Optional<String> valueOid = Optional.empty();
    boolean valueOidIsSet;
    @Nullable Optional<CodeableConcept> valueCodeableConcept = Optional.empty();
    boolean valueCodeableConceptIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Coding> valueCoding = Optional.empty();
    boolean valueCodingIsSet;
    @JsonProperty("valueRatio")
    public void setValueRatio(Optional<Ratio> valueRatio) {
      this.valueRatio = valueRatio;
      this.valueRatioIsSet = true;
    }
    @JsonProperty("valueSampledData")
    public void setValueSampledData(Optional<SampledData> valueSampledData) {
      this.valueSampledData = valueSampledData;
      this.valueSampledDataIsSet = true;
    }
    @JsonProperty("valueUnsignedInt")
    public void setValueUnsignedInt(Optional<Double> valueUnsignedInt) {
      this.valueUnsignedInt = valueUnsignedInt;
      this.valueUnsignedIntIsSet = true;
    }
    @JsonProperty("valueAnnotation")
    public void setValueAnnotation(Optional<Annotation> valueAnnotation) {
      this.valueAnnotation = valueAnnotation;
      this.valueAnnotationIsSet = true;
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
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("valueExpression")
    public void setValueExpression(Optional<Expression> valueExpression) {
      this.valueExpression = valueExpression;
      this.valueExpressionIsSet = true;
    }
    @JsonProperty("valueMarkdown")
    public void setValueMarkdown(Optional<String> valueMarkdown) {
      this.valueMarkdown = valueMarkdown;
      this.valueMarkdownIsSet = true;
    }
    @JsonProperty("valueAge")
    public void setValueAge(Optional<Age> valueAge) {
      this.valueAge = valueAge;
      this.valueAgeIsSet = true;
    }
    @JsonProperty("valueBase64Binary")
    public void setValueBase64Binary(Optional<String> valueBase64Binary) {
      this.valueBase64Binary = valueBase64Binary;
      this.valueBase64BinaryIsSet = true;
    }
    @JsonProperty("valueAttachment")
    public void setValueAttachment(Optional<Attachment> valueAttachment) {
      this.valueAttachment = valueAttachment;
      this.valueAttachmentIsSet = true;
    }
    @JsonProperty("valueTime")
    public void setValueTime(Optional<String> valueTime) {
      this.valueTime = valueTime;
      this.valueTimeIsSet = true;
    }
    @JsonProperty("valueUri")
    public void setValueUri(Optional<String> valueUri) {
      this.valueUri = valueUri;
      this.valueUriIsSet = true;
    }
    @JsonProperty("valueDateTime")
    public void setValueDateTime(Optional<String> valueDateTime) {
      this.valueDateTime = valueDateTime;
      this.valueDateTimeIsSet = true;
    }
    @JsonProperty("valueDate")
    public void setValueDate(Optional<String> valueDate) {
      this.valueDate = valueDate;
      this.valueDateIsSet = true;
    }
    @JsonProperty("valueContactDetail")
    public void setValueContactDetail(Optional<ContactDetail> valueContactDetail) {
      this.valueContactDetail = valueContactDetail;
      this.valueContactDetailIsSet = true;
    }
    @JsonProperty("valueRelatedArtifact")
    public void setValueRelatedArtifact(Optional<RelatedArtifact> valueRelatedArtifact) {
      this.valueRelatedArtifact = valueRelatedArtifact;
      this.valueRelatedArtifactIsSet = true;
    }
    @JsonProperty("valueDosage")
    public void setValueDosage(Optional<Dosage> valueDosage) {
      this.valueDosage = valueDosage;
      this.valueDosageIsSet = true;
    }
    @JsonProperty("valueHumanName")
    public void setValueHumanName(Optional<HumanName> valueHumanName) {
      this.valueHumanName = valueHumanName;
      this.valueHumanNameIsSet = true;
    }
    @JsonProperty("valueInteger")
    public void setValueInteger(Optional<Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @JsonProperty("valueDecimal")
    public void setValueDecimal(Optional<Double> valueDecimal) {
      this.valueDecimal = valueDecimal;
      this.valueDecimalIsSet = true;
    }
    @JsonProperty("valueContactPoint")
    public void setValueContactPoint(Optional<ContactPoint> valueContactPoint) {
      this.valueContactPoint = valueContactPoint;
      this.valueContactPointIsSet = true;
    }
    @JsonProperty("valueTriggerDefinition")
    public void setValueTriggerDefinition(Optional<TriggerDefinition> valueTriggerDefinition) {
      this.valueTriggerDefinition = valueTriggerDefinition;
      this.valueTriggerDefinitionIsSet = true;
    }
    @JsonProperty("valueParameterDefinition")
    public void setValueParameterDefinition(Optional<ParameterDefinition> valueParameterDefinition) {
      this.valueParameterDefinition = valueParameterDefinition;
      this.valueParameterDefinitionIsSet = true;
    }
    @JsonProperty("valueDuration")
    public void setValueDuration(Optional<Duration> valueDuration) {
      this.valueDuration = valueDuration;
      this.valueDurationIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("valuePositiveInt")
    public void setValuePositiveInt(Optional<Double> valuePositiveInt) {
      this.valuePositiveInt = valuePositiveInt;
      this.valuePositiveIntIsSet = true;
    }
    @JsonProperty("valueDistance")
    public void setValueDistance(Optional<Distance> valueDistance) {
      this.valueDistance = valueDistance;
      this.valueDistanceIsSet = true;
    }
    @JsonProperty("valueMeta")
    public void setValueMeta(Optional<Meta> valueMeta) {
      this.valueMeta = valueMeta;
      this.valueMetaIsSet = true;
    }
    @JsonProperty("valueTiming")
    public void setValueTiming(Optional<Timing> valueTiming) {
      this.valueTiming = valueTiming;
      this.valueTimingIsSet = true;
    }
    @JsonProperty("valueIdentifier")
    public void setValueIdentifier(Optional<Identifier> valueIdentifier) {
      this.valueIdentifier = valueIdentifier;
      this.valueIdentifierIsSet = true;
    }
    @JsonProperty("valueUsageContext")
    public void setValueUsageContext(Optional<UsageContext> valueUsageContext) {
      this.valueUsageContext = valueUsageContext;
      this.valueUsageContextIsSet = true;
    }
    @JsonProperty("valueCode")
    public void setValueCode(Optional<String> valueCode) {
      this.valueCode = valueCode;
      this.valueCodeIsSet = true;
    }
    @JsonProperty("valueRange")
    public void setValueRange(Optional<Range> valueRange) {
      this.valueRange = valueRange;
      this.valueRangeIsSet = true;
    }
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @JsonProperty("valueInstant")
    public void setValueInstant(Optional<String> valueInstant) {
      this.valueInstant = valueInstant;
      this.valueInstantIsSet = true;
    }
    @JsonProperty("valueMoney")
    public void setValueMoney(Optional<Money> valueMoney) {
      this.valueMoney = valueMoney;
      this.valueMoneyIsSet = true;
    }
    @JsonProperty("valueContributor")
    public void setValueContributor(Optional<Contributor> valueContributor) {
      this.valueContributor = valueContributor;
      this.valueContributorIsSet = true;
    }
    @JsonProperty("valueAddress")
    public void setValueAddress(Optional<Address> valueAddress) {
      this.valueAddress = valueAddress;
      this.valueAddressIsSet = true;
    }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Optional<Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @JsonProperty("valueId")
    public void setValueId(Optional<String> valueId) {
      this.valueId = valueId;
      this.valueIdIsSet = true;
    }
    @JsonProperty("valueUuid")
    public void setValueUuid(Optional<String> valueUuid) {
      this.valueUuid = valueUuid;
      this.valueUuidIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("valueCount")
    public void setValueCount(Optional<Count> valueCount) {
      this.valueCount = valueCount;
      this.valueCountIsSet = true;
    }
    @JsonProperty("valueDataRequirement")
    public void setValueDataRequirement(Optional<DataRequirement> valueDataRequirement) {
      this.valueDataRequirement = valueDataRequirement;
      this.valueDataRequirementIsSet = true;
    }
    @JsonProperty("valueUrl")
    public void setValueUrl(Optional<String> valueUrl) {
      this.valueUrl = valueUrl;
      this.valueUrlIsSet = true;
    }
    @JsonProperty("valueSignature")
    public void setValueSignature(Optional<Signature> valueSignature) {
      this.valueSignature = valueSignature;
      this.valueSignatureIsSet = true;
    }
    @JsonProperty("valuePeriod")
    public void setValuePeriod(Optional<Period> valuePeriod) {
      this.valuePeriod = valuePeriod;
      this.valuePeriodIsSet = true;
    }
    @JsonProperty("valueOid")
    public void setValueOid(Optional<String> valueOid) {
      this.valueOid = valueOid;
      this.valueOidIsSet = true;
    }
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(Optional<CodeableConcept> valueCodeableConcept) {
      this.valueCodeableConcept = valueCodeableConcept;
      this.valueCodeableConceptIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("valueCoding")
    public void setValueCoding(Optional<Coding> valueCoding) {
      this.valueCoding = valueCoding;
      this.valueCodingIsSet = true;
    }
    @Override
    public Optional<Ratio> valueRatio() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SampledData> valueSampledData() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueUnsignedInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Annotation> valueAnnotation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> valueReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Expression> valueExpression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueMarkdown() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> valueAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueBase64Binary() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> valueAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ContactDetail> valueContactDetail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<RelatedArtifact> valueRelatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Dosage> valueDosage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<HumanName> valueHumanName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ContactPoint> valueContactPoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TriggerDefinition> valueTriggerDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ParameterDefinition> valueParameterDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> valueDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valuePositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Distance> valueDistance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> valueMeta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> valueTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> valueIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UsageContext> valueUsageContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> valueRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueInstant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> valueMoney() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Contributor> valueContributor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Address> valueAddress() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueUuid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Count> valueCount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DataRequirement> valueDataRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueUrl() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Signature> valueSignature() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> valuePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueOid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> valueCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> valueCoding() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExtension fromJson(Json json) {
    ImmutableExtension.Builder builder = ImmutableExtension.builder();
    if (json.valueRatioIsSet) {
      builder.valueRatio(json.valueRatio);
    }
    if (json.valueSampledDataIsSet) {
      builder.valueSampledData(json.valueSampledData);
    }
    if (json.valueUnsignedIntIsSet) {
      builder.valueUnsignedInt(json.valueUnsignedInt);
    }
    if (json.valueAnnotationIsSet) {
      builder.valueAnnotation(json.valueAnnotation);
    }
    if (json.valueReferenceIsSet) {
      builder.valueReference(json.valueReference);
    }
    if (json.valueCanonicalIsSet) {
      builder.valueCanonical(json.valueCanonical);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueExpressionIsSet) {
      builder.valueExpression(json.valueExpression);
    }
    if (json.valueMarkdownIsSet) {
      builder.valueMarkdown(json.valueMarkdown);
    }
    if (json.valueAgeIsSet) {
      builder.valueAge(json.valueAge);
    }
    if (json.valueBase64BinaryIsSet) {
      builder.valueBase64Binary(json.valueBase64Binary);
    }
    if (json.valueAttachmentIsSet) {
      builder.valueAttachment(json.valueAttachment);
    }
    if (json.valueTimeIsSet) {
      builder.valueTime(json.valueTime);
    }
    if (json.valueUriIsSet) {
      builder.valueUri(json.valueUri);
    }
    if (json.valueDateTimeIsSet) {
      builder.valueDateTime(json.valueDateTime);
    }
    if (json.valueDateIsSet) {
      builder.valueDate(json.valueDate);
    }
    if (json.valueContactDetailIsSet) {
      builder.valueContactDetail(json.valueContactDetail);
    }
    if (json.valueRelatedArtifactIsSet) {
      builder.valueRelatedArtifact(json.valueRelatedArtifact);
    }
    if (json.valueDosageIsSet) {
      builder.valueDosage(json.valueDosage);
    }
    if (json.valueHumanNameIsSet) {
      builder.valueHumanName(json.valueHumanName);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.valueDecimalIsSet) {
      builder.valueDecimal(json.valueDecimal);
    }
    if (json.valueContactPointIsSet) {
      builder.valueContactPoint(json.valueContactPoint);
    }
    if (json.valueTriggerDefinitionIsSet) {
      builder.valueTriggerDefinition(json.valueTriggerDefinition);
    }
    if (json.valueParameterDefinitionIsSet) {
      builder.valueParameterDefinition(json.valueParameterDefinition);
    }
    if (json.valueDurationIsSet) {
      builder.valueDuration(json.valueDuration);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.valuePositiveIntIsSet) {
      builder.valuePositiveInt(json.valuePositiveInt);
    }
    if (json.valueDistanceIsSet) {
      builder.valueDistance(json.valueDistance);
    }
    if (json.valueMetaIsSet) {
      builder.valueMeta(json.valueMeta);
    }
    if (json.valueTimingIsSet) {
      builder.valueTiming(json.valueTiming);
    }
    if (json.valueIdentifierIsSet) {
      builder.valueIdentifier(json.valueIdentifier);
    }
    if (json.valueUsageContextIsSet) {
      builder.valueUsageContext(json.valueUsageContext);
    }
    if (json.valueCodeIsSet) {
      builder.valueCode(json.valueCode);
    }
    if (json.valueRangeIsSet) {
      builder.valueRange(json.valueRange);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.valueInstantIsSet) {
      builder.valueInstant(json.valueInstant);
    }
    if (json.valueMoneyIsSet) {
      builder.valueMoney(json.valueMoney);
    }
    if (json.valueContributorIsSet) {
      builder.valueContributor(json.valueContributor);
    }
    if (json.valueAddressIsSet) {
      builder.valueAddress(json.valueAddress);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valueIdIsSet) {
      builder.valueId(json.valueId);
    }
    if (json.valueUuidIsSet) {
      builder.valueUuid(json.valueUuid);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueCountIsSet) {
      builder.valueCount(json.valueCount);
    }
    if (json.valueDataRequirementIsSet) {
      builder.valueDataRequirement(json.valueDataRequirement);
    }
    if (json.valueUrlIsSet) {
      builder.valueUrl(json.valueUrl);
    }
    if (json.valueSignatureIsSet) {
      builder.valueSignature(json.valueSignature);
    }
    if (json.valuePeriodIsSet) {
      builder.valuePeriod(json.valuePeriod);
    }
    if (json.valueOidIsSet) {
      builder.valueOid(json.valueOid);
    }
    if (json.valueCodeableConceptIsSet) {
      builder.valueCodeableConcept(json.valueCodeableConcept);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueCodingIsSet) {
      builder.valueCoding(json.valueCoding);
    }
    return (ImmutableExtension) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Extension} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Extension instance
   */
  public static Extension copyOf(Extension instance) {
    if (instance instanceof ImmutableExtension) {
      return (ImmutableExtension) instance;
    }
    return ImmutableExtension.builder()
        .valueRatio(instance.valueRatio())
        .valueSampledData(instance.valueSampledData())
        .valueUnsignedInt(instance.valueUnsignedInt())
        .valueAnnotation(instance.valueAnnotation())
        .valueReference(instance.valueReference())
        .valueCanonical(instance.valueCanonical())
        .valueString(instance.valueString())
        .valueExpression(instance.valueExpression())
        .valueMarkdown(instance.valueMarkdown())
        .valueAge(instance.valueAge())
        .valueBase64Binary(instance.valueBase64Binary())
        .valueAttachment(instance.valueAttachment())
        .valueTime(instance.valueTime())
        .valueUri(instance.valueUri())
        .valueDateTime(instance.valueDateTime())
        .valueDate(instance.valueDate())
        .valueContactDetail(instance.valueContactDetail())
        .valueRelatedArtifact(instance.valueRelatedArtifact())
        .valueDosage(instance.valueDosage())
        .valueHumanName(instance.valueHumanName())
        .valueInteger(instance.valueInteger())
        .valueDecimal(instance.valueDecimal())
        .valueContactPoint(instance.valueContactPoint())
        .valueTriggerDefinition(instance.valueTriggerDefinition())
        .valueParameterDefinition(instance.valueParameterDefinition())
        .valueDuration(instance.valueDuration())
        .url(instance.url())
        .valuePositiveInt(instance.valuePositiveInt())
        .valueDistance(instance.valueDistance())
        .valueMeta(instance.valueMeta())
        .valueTiming(instance.valueTiming())
        .valueIdentifier(instance.valueIdentifier())
        .valueUsageContext(instance.valueUsageContext())
        .valueCode(instance.valueCode())
        .valueRange(instance.valueRange())
        .valueQuantity(instance.valueQuantity())
        .valueInstant(instance.valueInstant())
        .valueMoney(instance.valueMoney())
        .valueContributor(instance.valueContributor())
        .valueAddress(instance.valueAddress())
        .valueBoolean(instance.valueBoolean())
        .valueId(instance.valueId())
        .valueUuid(instance.valueUuid())
        .id(instance.id())
        .valueCount(instance.valueCount())
        .valueDataRequirement(instance.valueDataRequirement())
        .valueUrl(instance.valueUrl())
        .valueSignature(instance.valueSignature())
        .valuePeriod(instance.valuePeriod())
        .valueOid(instance.valueOid())
        .valueCodeableConcept(instance.valueCodeableConcept())
        .extension(instance.extension())
        .valueCoding(instance.valueCoding())
        .build();
  }

  /**
   * Creates a builder for {@link Extension Extension}.
   * <pre>
   * ImmutableExtension.builder()
   *    .valueRatio(com.fhir.types.fhir.Ratio) // optional {@link Extension#valueRatio() valueRatio}
   *    .valueSampledData(com.fhir.types.fhir.SampledData) // optional {@link Extension#valueSampledData() valueSampledData}
   *    .valueUnsignedInt(Double) // optional {@link Extension#valueUnsignedInt() valueUnsignedInt}
   *    .valueAnnotation(com.fhir.types.fhir.Annotation) // optional {@link Extension#valueAnnotation() valueAnnotation}
   *    .valueReference(com.fhir.types.fhir.Reference) // optional {@link Extension#valueReference() valueReference}
   *    .valueCanonical(String) // optional {@link Extension#valueCanonical() valueCanonical}
   *    .valueString(String) // optional {@link Extension#valueString() valueString}
   *    .valueExpression(com.fhir.types.fhir.Expression) // optional {@link Extension#valueExpression() valueExpression}
   *    .valueMarkdown(String) // optional {@link Extension#valueMarkdown() valueMarkdown}
   *    .valueAge(com.fhir.types.fhir.Age) // optional {@link Extension#valueAge() valueAge}
   *    .valueBase64Binary(String) // optional {@link Extension#valueBase64Binary() valueBase64Binary}
   *    .valueAttachment(com.fhir.types.fhir.Attachment) // optional {@link Extension#valueAttachment() valueAttachment}
   *    .valueTime(String) // optional {@link Extension#valueTime() valueTime}
   *    .valueUri(String) // optional {@link Extension#valueUri() valueUri}
   *    .valueDateTime(String) // optional {@link Extension#valueDateTime() valueDateTime}
   *    .valueDate(String) // optional {@link Extension#valueDate() valueDate}
   *    .valueContactDetail(com.fhir.types.fhir.ContactDetail) // optional {@link Extension#valueContactDetail() valueContactDetail}
   *    .valueRelatedArtifact(com.fhir.types.fhir.RelatedArtifact) // optional {@link Extension#valueRelatedArtifact() valueRelatedArtifact}
   *    .valueDosage(com.fhir.types.fhir.Dosage) // optional {@link Extension#valueDosage() valueDosage}
   *    .valueHumanName(com.fhir.types.fhir.HumanName) // optional {@link Extension#valueHumanName() valueHumanName}
   *    .valueInteger(Double) // optional {@link Extension#valueInteger() valueInteger}
   *    .valueDecimal(Double) // optional {@link Extension#valueDecimal() valueDecimal}
   *    .valueContactPoint(com.fhir.types.fhir.ContactPoint) // optional {@link Extension#valueContactPoint() valueContactPoint}
   *    .valueTriggerDefinition(com.fhir.types.fhir.TriggerDefinition) // optional {@link Extension#valueTriggerDefinition() valueTriggerDefinition}
   *    .valueParameterDefinition(com.fhir.types.fhir.ParameterDefinition) // optional {@link Extension#valueParameterDefinition() valueParameterDefinition}
   *    .valueDuration(com.fhir.types.fhir.Duration) // optional {@link Extension#valueDuration() valueDuration}
   *    .url(com.fhir.types.fhir.Uri) // optional {@link Extension#url() url}
   *    .valuePositiveInt(Double) // optional {@link Extension#valuePositiveInt() valuePositiveInt}
   *    .valueDistance(com.fhir.types.fhir.Distance) // optional {@link Extension#valueDistance() valueDistance}
   *    .valueMeta(com.fhir.types.fhir.Meta) // optional {@link Extension#valueMeta() valueMeta}
   *    .valueTiming(com.fhir.types.fhir.Timing) // optional {@link Extension#valueTiming() valueTiming}
   *    .valueIdentifier(com.fhir.types.fhir.Identifier) // optional {@link Extension#valueIdentifier() valueIdentifier}
   *    .valueUsageContext(com.fhir.types.fhir.UsageContext) // optional {@link Extension#valueUsageContext() valueUsageContext}
   *    .valueCode(String) // optional {@link Extension#valueCode() valueCode}
   *    .valueRange(com.fhir.types.fhir.Range) // optional {@link Extension#valueRange() valueRange}
   *    .valueQuantity(com.fhir.types.fhir.Quantity) // optional {@link Extension#valueQuantity() valueQuantity}
   *    .valueInstant(String) // optional {@link Extension#valueInstant() valueInstant}
   *    .valueMoney(com.fhir.types.fhir.Money) // optional {@link Extension#valueMoney() valueMoney}
   *    .valueContributor(com.fhir.types.fhir.Contributor) // optional {@link Extension#valueContributor() valueContributor}
   *    .valueAddress(com.fhir.types.fhir.Address) // optional {@link Extension#valueAddress() valueAddress}
   *    .valueBoolean(Boolean) // optional {@link Extension#valueBoolean() valueBoolean}
   *    .valueId(String) // optional {@link Extension#valueId() valueId}
   *    .valueUuid(String) // optional {@link Extension#valueUuid() valueUuid}
   *    .id(String) // optional {@link Extension#id() id}
   *    .valueCount(com.fhir.types.fhir.Count) // optional {@link Extension#valueCount() valueCount}
   *    .valueDataRequirement(com.fhir.types.fhir.DataRequirement) // optional {@link Extension#valueDataRequirement() valueDataRequirement}
   *    .valueUrl(String) // optional {@link Extension#valueUrl() valueUrl}
   *    .valueSignature(com.fhir.types.fhir.Signature) // optional {@link Extension#valueSignature() valueSignature}
   *    .valuePeriod(com.fhir.types.fhir.Period) // optional {@link Extension#valuePeriod() valuePeriod}
   *    .valueOid(String) // optional {@link Extension#valueOid() valueOid}
   *    .valueCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link Extension#valueCodeableConcept() valueCodeableConcept}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Extension#extension() extension}
   *    .valueCoding(com.fhir.types.fhir.Coding) // optional {@link Extension#valueCoding() valueCoding}
   *    .build();
   * </pre>
   * @return A new Extension builder
   */
  public static ImmutableExtension.Builder builder() {
    return new ImmutableExtension.Builder();
  }

  /**
   * Builds instances of type {@link Extension Extension}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Extension", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VALUE_RATIO = 0x1L;
    private static final long OPT_BIT_VALUE_SAMPLED_DATA = 0x2L;
    private static final long OPT_BIT_VALUE_UNSIGNED_INT = 0x4L;
    private static final long OPT_BIT_VALUE_ANNOTATION = 0x8L;
    private static final long OPT_BIT_VALUE_REFERENCE = 0x10L;
    private static final long OPT_BIT_VALUE_CANONICAL = 0x20L;
    private static final long OPT_BIT_VALUE_STRING = 0x40L;
    private static final long OPT_BIT_VALUE_EXPRESSION = 0x80L;
    private static final long OPT_BIT_VALUE_MARKDOWN = 0x100L;
    private static final long OPT_BIT_VALUE_AGE = 0x200L;
    private static final long OPT_BIT_VALUE_BASE64_BINARY = 0x400L;
    private static final long OPT_BIT_VALUE_ATTACHMENT = 0x800L;
    private static final long OPT_BIT_VALUE_TIME = 0x1000L;
    private static final long OPT_BIT_VALUE_URI = 0x2000L;
    private static final long OPT_BIT_VALUE_DATE_TIME = 0x4000L;
    private static final long OPT_BIT_VALUE_DATE = 0x8000L;
    private static final long OPT_BIT_VALUE_CONTACT_DETAIL = 0x10000L;
    private static final long OPT_BIT_VALUE_RELATED_ARTIFACT = 0x20000L;
    private static final long OPT_BIT_VALUE_DOSAGE = 0x40000L;
    private static final long OPT_BIT_VALUE_HUMAN_NAME = 0x80000L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x100000L;
    private static final long OPT_BIT_VALUE_DECIMAL = 0x200000L;
    private static final long OPT_BIT_VALUE_CONTACT_POINT = 0x400000L;
    private static final long OPT_BIT_VALUE_TRIGGER_DEFINITION = 0x800000L;
    private static final long OPT_BIT_VALUE_PARAMETER_DEFINITION = 0x1000000L;
    private static final long OPT_BIT_VALUE_DURATION = 0x2000000L;
    private static final long OPT_BIT_URL = 0x4000000L;
    private static final long OPT_BIT_VALUE_POSITIVE_INT = 0x8000000L;
    private static final long OPT_BIT_VALUE_DISTANCE = 0x10000000L;
    private static final long OPT_BIT_VALUE_META = 0x20000000L;
    private static final long OPT_BIT_VALUE_TIMING = 0x40000000L;
    private static final long OPT_BIT_VALUE_IDENTIFIER = 0x80000000L;
    private static final long OPT_BIT_VALUE_USAGE_CONTEXT = 0x100000000L;
    private static final long OPT_BIT_VALUE_CODE = 0x200000000L;
    private static final long OPT_BIT_VALUE_RANGE = 0x400000000L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x800000000L;
    private static final long OPT_BIT_VALUE_INSTANT = 0x1000000000L;
    private static final long OPT_BIT_VALUE_MONEY = 0x2000000000L;
    private static final long OPT_BIT_VALUE_CONTRIBUTOR = 0x4000000000L;
    private static final long OPT_BIT_VALUE_ADDRESS = 0x8000000000L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x10000000000L;
    private static final long OPT_BIT_VALUE_ID = 0x20000000000L;
    private static final long OPT_BIT_VALUE_UUID = 0x40000000000L;
    private static final long OPT_BIT_ID = 0x80000000000L;
    private static final long OPT_BIT_VALUE_COUNT = 0x100000000000L;
    private static final long OPT_BIT_VALUE_DATA_REQUIREMENT = 0x200000000000L;
    private static final long OPT_BIT_VALUE_URL = 0x400000000000L;
    private static final long OPT_BIT_VALUE_SIGNATURE = 0x800000000000L;
    private static final long OPT_BIT_VALUE_PERIOD = 0x1000000000000L;
    private static final long OPT_BIT_VALUE_OID = 0x2000000000000L;
    private static final long OPT_BIT_VALUE_CODEABLE_CONCEPT = 0x4000000000000L;
    private static final long OPT_BIT_EXTENSION = 0x8000000000000L;
    private static final long OPT_BIT_VALUE_CODING = 0x10000000000000L;
    private long optBits;

    private @Nullable Ratio valueRatio;
    private @Nullable SampledData valueSampledData;
    private @Nullable Double valueUnsignedInt;
    private @Nullable Annotation valueAnnotation;
    private @Nullable Reference valueReference;
    private @Nullable String valueCanonical;
    private @Nullable String valueString;
    private @Nullable Expression valueExpression;
    private @Nullable String valueMarkdown;
    private @Nullable Age valueAge;
    private @Nullable String valueBase64Binary;
    private @Nullable Attachment valueAttachment;
    private @Nullable String valueTime;
    private @Nullable String valueUri;
    private @Nullable String valueDateTime;
    private @Nullable String valueDate;
    private @Nullable ContactDetail valueContactDetail;
    private @Nullable RelatedArtifact valueRelatedArtifact;
    private @Nullable Dosage valueDosage;
    private @Nullable HumanName valueHumanName;
    private @Nullable Double valueInteger;
    private @Nullable Double valueDecimal;
    private @Nullable ContactPoint valueContactPoint;
    private @Nullable TriggerDefinition valueTriggerDefinition;
    private @Nullable ParameterDefinition valueParameterDefinition;
    private @Nullable Duration valueDuration;
    private @Nullable Uri url;
    private @Nullable Double valuePositiveInt;
    private @Nullable Distance valueDistance;
    private @Nullable Meta valueMeta;
    private @Nullable Timing valueTiming;
    private @Nullable Identifier valueIdentifier;
    private @Nullable UsageContext valueUsageContext;
    private @Nullable String valueCode;
    private @Nullable Range valueRange;
    private @Nullable Quantity valueQuantity;
    private @Nullable String valueInstant;
    private @Nullable Money valueMoney;
    private @Nullable Contributor valueContributor;
    private @Nullable Address valueAddress;
    private @Nullable Boolean valueBoolean;
    private @Nullable String valueId;
    private @Nullable String valueUuid;
    private @Nullable String id;
    private @Nullable Count valueCount;
    private @Nullable DataRequirement valueDataRequirement;
    private @Nullable String valueUrl;
    private @Nullable Signature valueSignature;
    private @Nullable Period valuePeriod;
    private @Nullable String valueOid;
    private @Nullable CodeableConcept valueCodeableConcept;
    private @Nullable List<Extension> extension;
    private @Nullable Coding valueCoding;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Extension#valueRatio() valueRatio} to valueRatio.
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
     * Initializes the optional value {@link Extension#valueRatio() valueRatio} to valueRatio.
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
     * Initializes the optional value {@link Extension#valueSampledData() valueSampledData} to valueSampledData.
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
     * Initializes the optional value {@link Extension#valueSampledData() valueSampledData} to valueSampledData.
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
     * Initializes the optional value {@link Extension#valueUnsignedInt() valueUnsignedInt} to valueUnsignedInt.
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
     * Initializes the optional value {@link Extension#valueUnsignedInt() valueUnsignedInt} to valueUnsignedInt.
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
     * Initializes the optional value {@link Extension#valueAnnotation() valueAnnotation} to valueAnnotation.
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
     * Initializes the optional value {@link Extension#valueAnnotation() valueAnnotation} to valueAnnotation.
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
     * Initializes the optional value {@link Extension#valueReference() valueReference} to valueReference.
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
     * Initializes the optional value {@link Extension#valueReference() valueReference} to valueReference.
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
     * Initializes the optional value {@link Extension#valueCanonical() valueCanonical} to valueCanonical.
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
     * Initializes the optional value {@link Extension#valueCanonical() valueCanonical} to valueCanonical.
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
     * Initializes the optional value {@link Extension#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link Extension#valueString() valueString} to valueString.
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
     * Initializes the optional value {@link Extension#valueExpression() valueExpression} to valueExpression.
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
     * Initializes the optional value {@link Extension#valueExpression() valueExpression} to valueExpression.
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
     * Initializes the optional value {@link Extension#valueMarkdown() valueMarkdown} to valueMarkdown.
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
     * Initializes the optional value {@link Extension#valueMarkdown() valueMarkdown} to valueMarkdown.
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
     * Initializes the optional value {@link Extension#valueAge() valueAge} to valueAge.
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
     * Initializes the optional value {@link Extension#valueAge() valueAge} to valueAge.
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
     * Initializes the optional value {@link Extension#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
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
     * Initializes the optional value {@link Extension#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
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
     * Initializes the optional value {@link Extension#valueAttachment() valueAttachment} to valueAttachment.
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
     * Initializes the optional value {@link Extension#valueAttachment() valueAttachment} to valueAttachment.
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
     * Initializes the optional value {@link Extension#valueTime() valueTime} to valueTime.
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
     * Initializes the optional value {@link Extension#valueTime() valueTime} to valueTime.
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
     * Initializes the optional value {@link Extension#valueUri() valueUri} to valueUri.
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
     * Initializes the optional value {@link Extension#valueUri() valueUri} to valueUri.
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
     * Initializes the optional value {@link Extension#valueDateTime() valueDateTime} to valueDateTime.
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
     * Initializes the optional value {@link Extension#valueDateTime() valueDateTime} to valueDateTime.
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
     * Initializes the optional value {@link Extension#valueDate() valueDate} to valueDate.
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
     * Initializes the optional value {@link Extension#valueDate() valueDate} to valueDate.
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
     * Initializes the optional value {@link Extension#valueContactDetail() valueContactDetail} to valueContactDetail.
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
     * Initializes the optional value {@link Extension#valueContactDetail() valueContactDetail} to valueContactDetail.
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
     * Initializes the optional value {@link Extension#valueRelatedArtifact() valueRelatedArtifact} to valueRelatedArtifact.
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
     * Initializes the optional value {@link Extension#valueRelatedArtifact() valueRelatedArtifact} to valueRelatedArtifact.
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
     * Initializes the optional value {@link Extension#valueDosage() valueDosage} to valueDosage.
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
     * Initializes the optional value {@link Extension#valueDosage() valueDosage} to valueDosage.
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
     * Initializes the optional value {@link Extension#valueHumanName() valueHumanName} to valueHumanName.
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
     * Initializes the optional value {@link Extension#valueHumanName() valueHumanName} to valueHumanName.
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
     * Initializes the optional value {@link Extension#valueInteger() valueInteger} to valueInteger.
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
     * Initializes the optional value {@link Extension#valueInteger() valueInteger} to valueInteger.
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
     * Initializes the optional value {@link Extension#valueDecimal() valueDecimal} to valueDecimal.
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
     * Initializes the optional value {@link Extension#valueDecimal() valueDecimal} to valueDecimal.
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
     * Initializes the optional value {@link Extension#valueContactPoint() valueContactPoint} to valueContactPoint.
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
     * Initializes the optional value {@link Extension#valueContactPoint() valueContactPoint} to valueContactPoint.
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
     * Initializes the optional value {@link Extension#valueTriggerDefinition() valueTriggerDefinition} to valueTriggerDefinition.
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
     * Initializes the optional value {@link Extension#valueTriggerDefinition() valueTriggerDefinition} to valueTriggerDefinition.
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
     * Initializes the optional value {@link Extension#valueParameterDefinition() valueParameterDefinition} to valueParameterDefinition.
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
     * Initializes the optional value {@link Extension#valueParameterDefinition() valueParameterDefinition} to valueParameterDefinition.
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
     * Initializes the optional value {@link Extension#valueDuration() valueDuration} to valueDuration.
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
     * Initializes the optional value {@link Extension#valueDuration() valueDuration} to valueDuration.
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
     * Initializes the optional value {@link Extension#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(Uri url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Optional<? extends Uri> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valuePositiveInt() valuePositiveInt} to valuePositiveInt.
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
     * Initializes the optional value {@link Extension#valuePositiveInt() valuePositiveInt} to valuePositiveInt.
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
     * Initializes the optional value {@link Extension#valueDistance() valueDistance} to valueDistance.
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
     * Initializes the optional value {@link Extension#valueDistance() valueDistance} to valueDistance.
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
     * Initializes the optional value {@link Extension#valueMeta() valueMeta} to valueMeta.
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
     * Initializes the optional value {@link Extension#valueMeta() valueMeta} to valueMeta.
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
     * Initializes the optional value {@link Extension#valueTiming() valueTiming} to valueTiming.
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
     * Initializes the optional value {@link Extension#valueTiming() valueTiming} to valueTiming.
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
     * Initializes the optional value {@link Extension#valueIdentifier() valueIdentifier} to valueIdentifier.
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
     * Initializes the optional value {@link Extension#valueIdentifier() valueIdentifier} to valueIdentifier.
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
     * Initializes the optional value {@link Extension#valueUsageContext() valueUsageContext} to valueUsageContext.
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
     * Initializes the optional value {@link Extension#valueUsageContext() valueUsageContext} to valueUsageContext.
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
     * Initializes the optional value {@link Extension#valueCode() valueCode} to valueCode.
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
     * Initializes the optional value {@link Extension#valueCode() valueCode} to valueCode.
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
     * Initializes the optional value {@link Extension#valueRange() valueRange} to valueRange.
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
     * Initializes the optional value {@link Extension#valueRange() valueRange} to valueRange.
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
     * Initializes the optional value {@link Extension#valueQuantity() valueQuantity} to valueQuantity.
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
     * Initializes the optional value {@link Extension#valueQuantity() valueQuantity} to valueQuantity.
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
     * Initializes the optional value {@link Extension#valueInstant() valueInstant} to valueInstant.
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
     * Initializes the optional value {@link Extension#valueInstant() valueInstant} to valueInstant.
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
     * Initializes the optional value {@link Extension#valueMoney() valueMoney} to valueMoney.
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
     * Initializes the optional value {@link Extension#valueMoney() valueMoney} to valueMoney.
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
     * Initializes the optional value {@link Extension#valueContributor() valueContributor} to valueContributor.
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
     * Initializes the optional value {@link Extension#valueContributor() valueContributor} to valueContributor.
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
     * Initializes the optional value {@link Extension#valueAddress() valueAddress} to valueAddress.
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
     * Initializes the optional value {@link Extension#valueAddress() valueAddress} to valueAddress.
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
     * Initializes the optional value {@link Extension#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link Extension#valueBoolean() valueBoolean} to valueBoolean.
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
     * Initializes the optional value {@link Extension#valueId() valueId} to valueId.
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
     * Initializes the optional value {@link Extension#valueId() valueId} to valueId.
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
     * Initializes the optional value {@link Extension#valueUuid() valueUuid} to valueUuid.
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
     * Initializes the optional value {@link Extension#valueUuid() valueUuid} to valueUuid.
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
     * Initializes the optional value {@link Extension#id() id} to id.
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
     * Initializes the optional value {@link Extension#id() id} to id.
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
     * Initializes the optional value {@link Extension#valueCount() valueCount} to valueCount.
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
     * Initializes the optional value {@link Extension#valueCount() valueCount} to valueCount.
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
     * Initializes the optional value {@link Extension#valueDataRequirement() valueDataRequirement} to valueDataRequirement.
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
     * Initializes the optional value {@link Extension#valueDataRequirement() valueDataRequirement} to valueDataRequirement.
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
     * Initializes the optional value {@link Extension#valueUrl() valueUrl} to valueUrl.
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
     * Initializes the optional value {@link Extension#valueUrl() valueUrl} to valueUrl.
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
     * Initializes the optional value {@link Extension#valueSignature() valueSignature} to valueSignature.
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
     * Initializes the optional value {@link Extension#valueSignature() valueSignature} to valueSignature.
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
     * Initializes the optional value {@link Extension#valuePeriod() valuePeriod} to valuePeriod.
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
     * Initializes the optional value {@link Extension#valuePeriod() valuePeriod} to valuePeriod.
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
     * Initializes the optional value {@link Extension#valueOid() valueOid} to valueOid.
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
     * Initializes the optional value {@link Extension#valueOid() valueOid} to valueOid.
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
     * Initializes the optional value {@link Extension#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
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
     * Initializes the optional value {@link Extension#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
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
     * Initializes the optional value {@link Extension#extension() extension} to extension.
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
     * Initializes the optional value {@link Extension#extension() extension} to extension.
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
     * Initializes the optional value {@link Extension#valueCoding() valueCoding} to valueCoding.
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
     * Initializes the optional value {@link Extension#valueCoding() valueCoding} to valueCoding.
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
     * Builds a new {@link Extension Extension}.
     * @return An immutable instance of Extension
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Extension build() {
      return new ImmutableExtension(
          valueRatio,
          valueSampledData,
          valueUnsignedInt,
          valueAnnotation,
          valueReference,
          valueCanonical,
          valueString,
          valueExpression,
          valueMarkdown,
          valueAge,
          valueBase64Binary,
          valueAttachment,
          valueTime,
          valueUri,
          valueDateTime,
          valueDate,
          valueContactDetail,
          valueRelatedArtifact,
          valueDosage,
          valueHumanName,
          valueInteger,
          valueDecimal,
          valueContactPoint,
          valueTriggerDefinition,
          valueParameterDefinition,
          valueDuration,
          url,
          valuePositiveInt,
          valueDistance,
          valueMeta,
          valueTiming,
          valueIdentifier,
          valueUsageContext,
          valueCode,
          valueRange,
          valueQuantity,
          valueInstant,
          valueMoney,
          valueContributor,
          valueAddress,
          valueBoolean,
          valueId,
          valueUuid,
          id,
          valueCount,
          valueDataRequirement,
          valueUrl,
          valueSignature,
          valuePeriod,
          valueOid,
          valueCodeableConcept,
          extension,
          valueCoding);
    }

    private boolean valueRatioIsSet() {
      return (optBits & OPT_BIT_VALUE_RATIO) != 0;
    }

    private boolean valueSampledDataIsSet() {
      return (optBits & OPT_BIT_VALUE_SAMPLED_DATA) != 0;
    }

    private boolean valueUnsignedIntIsSet() {
      return (optBits & OPT_BIT_VALUE_UNSIGNED_INT) != 0;
    }

    private boolean valueAnnotationIsSet() {
      return (optBits & OPT_BIT_VALUE_ANNOTATION) != 0;
    }

    private boolean valueReferenceIsSet() {
      return (optBits & OPT_BIT_VALUE_REFERENCE) != 0;
    }

    private boolean valueCanonicalIsSet() {
      return (optBits & OPT_BIT_VALUE_CANONICAL) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueExpressionIsSet() {
      return (optBits & OPT_BIT_VALUE_EXPRESSION) != 0;
    }

    private boolean valueMarkdownIsSet() {
      return (optBits & OPT_BIT_VALUE_MARKDOWN) != 0;
    }

    private boolean valueAgeIsSet() {
      return (optBits & OPT_BIT_VALUE_AGE) != 0;
    }

    private boolean valueBase64BinaryIsSet() {
      return (optBits & OPT_BIT_VALUE_BASE64_BINARY) != 0;
    }

    private boolean valueAttachmentIsSet() {
      return (optBits & OPT_BIT_VALUE_ATTACHMENT) != 0;
    }

    private boolean valueTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_TIME) != 0;
    }

    private boolean valueUriIsSet() {
      return (optBits & OPT_BIT_VALUE_URI) != 0;
    }

    private boolean valueDateTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE_TIME) != 0;
    }

    private boolean valueDateIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE) != 0;
    }

    private boolean valueContactDetailIsSet() {
      return (optBits & OPT_BIT_VALUE_CONTACT_DETAIL) != 0;
    }

    private boolean valueRelatedArtifactIsSet() {
      return (optBits & OPT_BIT_VALUE_RELATED_ARTIFACT) != 0;
    }

    private boolean valueDosageIsSet() {
      return (optBits & OPT_BIT_VALUE_DOSAGE) != 0;
    }

    private boolean valueHumanNameIsSet() {
      return (optBits & OPT_BIT_VALUE_HUMAN_NAME) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean valueDecimalIsSet() {
      return (optBits & OPT_BIT_VALUE_DECIMAL) != 0;
    }

    private boolean valueContactPointIsSet() {
      return (optBits & OPT_BIT_VALUE_CONTACT_POINT) != 0;
    }

    private boolean valueTriggerDefinitionIsSet() {
      return (optBits & OPT_BIT_VALUE_TRIGGER_DEFINITION) != 0;
    }

    private boolean valueParameterDefinitionIsSet() {
      return (optBits & OPT_BIT_VALUE_PARAMETER_DEFINITION) != 0;
    }

    private boolean valueDurationIsSet() {
      return (optBits & OPT_BIT_VALUE_DURATION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean valuePositiveIntIsSet() {
      return (optBits & OPT_BIT_VALUE_POSITIVE_INT) != 0;
    }

    private boolean valueDistanceIsSet() {
      return (optBits & OPT_BIT_VALUE_DISTANCE) != 0;
    }

    private boolean valueMetaIsSet() {
      return (optBits & OPT_BIT_VALUE_META) != 0;
    }

    private boolean valueTimingIsSet() {
      return (optBits & OPT_BIT_VALUE_TIMING) != 0;
    }

    private boolean valueIdentifierIsSet() {
      return (optBits & OPT_BIT_VALUE_IDENTIFIER) != 0;
    }

    private boolean valueUsageContextIsSet() {
      return (optBits & OPT_BIT_VALUE_USAGE_CONTEXT) != 0;
    }

    private boolean valueCodeIsSet() {
      return (optBits & OPT_BIT_VALUE_CODE) != 0;
    }

    private boolean valueRangeIsSet() {
      return (optBits & OPT_BIT_VALUE_RANGE) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean valueInstantIsSet() {
      return (optBits & OPT_BIT_VALUE_INSTANT) != 0;
    }

    private boolean valueMoneyIsSet() {
      return (optBits & OPT_BIT_VALUE_MONEY) != 0;
    }

    private boolean valueContributorIsSet() {
      return (optBits & OPT_BIT_VALUE_CONTRIBUTOR) != 0;
    }

    private boolean valueAddressIsSet() {
      return (optBits & OPT_BIT_VALUE_ADDRESS) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valueIdIsSet() {
      return (optBits & OPT_BIT_VALUE_ID) != 0;
    }

    private boolean valueUuidIsSet() {
      return (optBits & OPT_BIT_VALUE_UUID) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueCountIsSet() {
      return (optBits & OPT_BIT_VALUE_COUNT) != 0;
    }

    private boolean valueDataRequirementIsSet() {
      return (optBits & OPT_BIT_VALUE_DATA_REQUIREMENT) != 0;
    }

    private boolean valueUrlIsSet() {
      return (optBits & OPT_BIT_VALUE_URL) != 0;
    }

    private boolean valueSignatureIsSet() {
      return (optBits & OPT_BIT_VALUE_SIGNATURE) != 0;
    }

    private boolean valuePeriodIsSet() {
      return (optBits & OPT_BIT_VALUE_PERIOD) != 0;
    }

    private boolean valueOidIsSet() {
      return (optBits & OPT_BIT_VALUE_OID) != 0;
    }

    private boolean valueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueCodingIsSet() {
      return (optBits & OPT_BIT_VALUE_CODING) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Extension is strict, attribute is already set: ".concat(name));
    }
  }
}
