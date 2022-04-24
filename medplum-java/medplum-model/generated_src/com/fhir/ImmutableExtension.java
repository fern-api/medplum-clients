//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Extension}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExtension.builder()}.
 */
@org.immutables.value.Generated(from = "Extension", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExtension implements com.fhir.Extension {
  private final @javax.annotation.Nullable com.fhir.Annotation valueAnnotation;
  private final @javax.annotation.Nullable com.fhir.Count valueCount;
  private final @javax.annotation.Nullable com.fhir.TriggerDefinition valueTriggerDefinition;
  private final @javax.annotation.Nullable com.fhir.Signature valueSignature;
  private final @javax.annotation.Nullable java.lang.String valueDate;
  private final @javax.annotation.Nullable com.fhir.Attachment valueAttachment;
  private final @javax.annotation.Nullable java.lang.String valueUri;
  private final @javax.annotation.Nullable com.fhir.Identifier valueIdentifier;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.lang.String valueOid;
  private final @javax.annotation.Nullable com.fhir.Timing valueTiming;
  private final @javax.annotation.Nullable com.fhir.UsageContext valueUsageContext;
  private final @javax.annotation.Nullable java.lang.String valueTime;
  private final @javax.annotation.Nullable com.fhir.RelatedArtifact valueRelatedArtifact;
  private final @javax.annotation.Nullable java.lang.Double valueDecimal;
  private final @javax.annotation.Nullable com.fhir.ContactDetail valueContactDetail;
  private final @javax.annotation.Nullable com.fhir.Reference valueReference;
  private final @javax.annotation.Nullable com.fhir.Quantity valueQuantity;
  private final @javax.annotation.Nullable com.fhir.Dosage valueDosage;
  private final @javax.annotation.Nullable com.fhir.Coding valueCoding;
  private final @javax.annotation.Nullable java.lang.String valueId;
  private final @javax.annotation.Nullable java.lang.Double valueUnsignedInt;
  private final @javax.annotation.Nullable java.lang.Double valuePositiveInt;
  private final @javax.annotation.Nullable com.fhir.ContactPoint valueContactPoint;
  private final @javax.annotation.Nullable com.fhir.Ratio valueRatio;
  private final @javax.annotation.Nullable java.lang.String valueDateTime;
  private final @javax.annotation.Nullable java.lang.String valueCode;
  private final @javax.annotation.Nullable com.fhir.Range valueRange;
  private final @javax.annotation.Nullable com.fhir.Contributor valueContributor;
  private final @javax.annotation.Nullable java.lang.Boolean valueBoolean;
  private final @javax.annotation.Nullable java.lang.String valueMarkdown;
  private final @javax.annotation.Nullable com.fhir.Period valuePeriod;
  private final @javax.annotation.Nullable java.lang.String valueCanonical;
  private final @javax.annotation.Nullable java.lang.String valueBase64Binary;
  private final @javax.annotation.Nullable com.fhir.Age valueAge;
  private final @javax.annotation.Nullable com.fhir.Address valueAddress;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept valueCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.Money valueMoney;
  private final @javax.annotation.Nullable com.fhir.SampledData valueSampledData;
  private final @javax.annotation.Nullable java.lang.String valueInstant;
  private final @javax.annotation.Nullable com.fhir.ParameterDefinition valueParameterDefinition;
  private final @javax.annotation.Nullable java.lang.String valueString;
  private final @javax.annotation.Nullable com.fhir.Duration valueDuration;
  private final @javax.annotation.Nullable com.fhir.Distance valueDistance;
  private final @javax.annotation.Nullable com.fhir.HumanName valueHumanName;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String valueUuid;
  private final @javax.annotation.Nullable com.fhir.Meta valueMeta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String valueUrl;
  private final @javax.annotation.Nullable java.lang.Double valueInteger;
  private final @javax.annotation.Nullable com.fhir.DataRequirement valueDataRequirement;
  private final @javax.annotation.Nullable com.fhir.Expression valueExpression;

  private ImmutableExtension(
      @javax.annotation.Nullable com.fhir.Annotation valueAnnotation,
      @javax.annotation.Nullable com.fhir.Count valueCount,
      @javax.annotation.Nullable com.fhir.TriggerDefinition valueTriggerDefinition,
      @javax.annotation.Nullable com.fhir.Signature valueSignature,
      @javax.annotation.Nullable java.lang.String valueDate,
      @javax.annotation.Nullable com.fhir.Attachment valueAttachment,
      @javax.annotation.Nullable java.lang.String valueUri,
      @javax.annotation.Nullable com.fhir.Identifier valueIdentifier,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.lang.String valueOid,
      @javax.annotation.Nullable com.fhir.Timing valueTiming,
      @javax.annotation.Nullable com.fhir.UsageContext valueUsageContext,
      @javax.annotation.Nullable java.lang.String valueTime,
      @javax.annotation.Nullable com.fhir.RelatedArtifact valueRelatedArtifact,
      @javax.annotation.Nullable java.lang.Double valueDecimal,
      @javax.annotation.Nullable com.fhir.ContactDetail valueContactDetail,
      @javax.annotation.Nullable com.fhir.Reference valueReference,
      @javax.annotation.Nullable com.fhir.Quantity valueQuantity,
      @javax.annotation.Nullable com.fhir.Dosage valueDosage,
      @javax.annotation.Nullable com.fhir.Coding valueCoding,
      @javax.annotation.Nullable java.lang.String valueId,
      @javax.annotation.Nullable java.lang.Double valueUnsignedInt,
      @javax.annotation.Nullable java.lang.Double valuePositiveInt,
      @javax.annotation.Nullable com.fhir.ContactPoint valueContactPoint,
      @javax.annotation.Nullable com.fhir.Ratio valueRatio,
      @javax.annotation.Nullable java.lang.String valueDateTime,
      @javax.annotation.Nullable java.lang.String valueCode,
      @javax.annotation.Nullable com.fhir.Range valueRange,
      @javax.annotation.Nullable com.fhir.Contributor valueContributor,
      @javax.annotation.Nullable java.lang.Boolean valueBoolean,
      @javax.annotation.Nullable java.lang.String valueMarkdown,
      @javax.annotation.Nullable com.fhir.Period valuePeriod,
      @javax.annotation.Nullable java.lang.String valueCanonical,
      @javax.annotation.Nullable java.lang.String valueBase64Binary,
      @javax.annotation.Nullable com.fhir.Age valueAge,
      @javax.annotation.Nullable com.fhir.Address valueAddress,
      @javax.annotation.Nullable com.fhir.CodeableConcept valueCodeableConcept,
      @javax.annotation.Nullable com.fhir.Money valueMoney,
      @javax.annotation.Nullable com.fhir.SampledData valueSampledData,
      @javax.annotation.Nullable java.lang.String valueInstant,
      @javax.annotation.Nullable com.fhir.ParameterDefinition valueParameterDefinition,
      @javax.annotation.Nullable java.lang.String valueString,
      @javax.annotation.Nullable com.fhir.Duration valueDuration,
      @javax.annotation.Nullable com.fhir.Distance valueDistance,
      @javax.annotation.Nullable com.fhir.HumanName valueHumanName,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String valueUuid,
      @javax.annotation.Nullable com.fhir.Meta valueMeta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String valueUrl,
      @javax.annotation.Nullable java.lang.Double valueInteger,
      @javax.annotation.Nullable com.fhir.DataRequirement valueDataRequirement,
      @javax.annotation.Nullable com.fhir.Expression valueExpression) {
    this.valueAnnotation = valueAnnotation;
    this.valueCount = valueCount;
    this.valueTriggerDefinition = valueTriggerDefinition;
    this.valueSignature = valueSignature;
    this.valueDate = valueDate;
    this.valueAttachment = valueAttachment;
    this.valueUri = valueUri;
    this.valueIdentifier = valueIdentifier;
    this.url = url;
    this.valueOid = valueOid;
    this.valueTiming = valueTiming;
    this.valueUsageContext = valueUsageContext;
    this.valueTime = valueTime;
    this.valueRelatedArtifact = valueRelatedArtifact;
    this.valueDecimal = valueDecimal;
    this.valueContactDetail = valueContactDetail;
    this.valueReference = valueReference;
    this.valueQuantity = valueQuantity;
    this.valueDosage = valueDosage;
    this.valueCoding = valueCoding;
    this.valueId = valueId;
    this.valueUnsignedInt = valueUnsignedInt;
    this.valuePositiveInt = valuePositiveInt;
    this.valueContactPoint = valueContactPoint;
    this.valueRatio = valueRatio;
    this.valueDateTime = valueDateTime;
    this.valueCode = valueCode;
    this.valueRange = valueRange;
    this.valueContributor = valueContributor;
    this.valueBoolean = valueBoolean;
    this.valueMarkdown = valueMarkdown;
    this.valuePeriod = valuePeriod;
    this.valueCanonical = valueCanonical;
    this.valueBase64Binary = valueBase64Binary;
    this.valueAge = valueAge;
    this.valueAddress = valueAddress;
    this.valueCodeableConcept = valueCodeableConcept;
    this.valueMoney = valueMoney;
    this.valueSampledData = valueSampledData;
    this.valueInstant = valueInstant;
    this.valueParameterDefinition = valueParameterDefinition;
    this.valueString = valueString;
    this.valueDuration = valueDuration;
    this.valueDistance = valueDistance;
    this.valueHumanName = valueHumanName;
    this.id = id;
    this.valueUuid = valueUuid;
    this.valueMeta = valueMeta;
    this.extension = extension;
    this.valueUrl = valueUrl;
    this.valueInteger = valueInteger;
    this.valueDataRequirement = valueDataRequirement;
    this.valueExpression = valueExpression;
  }

  /**
   * @return The value of the {@code valueAnnotation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueAnnotation")
  @Override
  public java.util.Optional<com.fhir.Annotation> valueAnnotation() {
    return java.util.Optional.ofNullable(valueAnnotation);
  }

  /**
   * @return The value of the {@code valueCount} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueCount")
  @Override
  public java.util.Optional<com.fhir.Count> valueCount() {
    return java.util.Optional.ofNullable(valueCount);
  }

  /**
   * @return The value of the {@code valueTriggerDefinition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueTriggerDefinition")
  @Override
  public java.util.Optional<com.fhir.TriggerDefinition> valueTriggerDefinition() {
    return java.util.Optional.ofNullable(valueTriggerDefinition);
  }

  /**
   * @return The value of the {@code valueSignature} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueSignature")
  @Override
  public java.util.Optional<com.fhir.Signature> valueSignature() {
    return java.util.Optional.ofNullable(valueSignature);
  }

  /**
   * @return The value of the {@code valueDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueDate")
  @Override
  public java.util.Optional<java.lang.String> valueDate() {
    return java.util.Optional.ofNullable(valueDate);
  }

  /**
   * @return The value of the {@code valueAttachment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueAttachment")
  @Override
  public java.util.Optional<com.fhir.Attachment> valueAttachment() {
    return java.util.Optional.ofNullable(valueAttachment);
  }

  /**
   * @return The value of the {@code valueUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueUri")
  @Override
  public java.util.Optional<java.lang.String> valueUri() {
    return java.util.Optional.ofNullable(valueUri);
  }

  /**
   * @return The value of the {@code valueIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueIdentifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> valueIdentifier() {
    return java.util.Optional.ofNullable(valueIdentifier);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code valueOid} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueOid")
  @Override
  public java.util.Optional<java.lang.String> valueOid() {
    return java.util.Optional.ofNullable(valueOid);
  }

  /**
   * @return The value of the {@code valueTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> valueTiming() {
    return java.util.Optional.ofNullable(valueTiming);
  }

  /**
   * @return The value of the {@code valueUsageContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueUsageContext")
  @Override
  public java.util.Optional<com.fhir.UsageContext> valueUsageContext() {
    return java.util.Optional.ofNullable(valueUsageContext);
  }

  /**
   * @return The value of the {@code valueTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueTime")
  @Override
  public java.util.Optional<java.lang.String> valueTime() {
    return java.util.Optional.ofNullable(valueTime);
  }

  /**
   * @return The value of the {@code valueRelatedArtifact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueRelatedArtifact")
  @Override
  public java.util.Optional<com.fhir.RelatedArtifact> valueRelatedArtifact() {
    return java.util.Optional.ofNullable(valueRelatedArtifact);
  }

  /**
   * @return The value of the {@code valueDecimal} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueDecimal")
  @Override
  public java.util.Optional<java.lang.Double> valueDecimal() {
    return java.util.Optional.ofNullable(valueDecimal);
  }

  /**
   * @return The value of the {@code valueContactDetail} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueContactDetail")
  @Override
  public java.util.Optional<com.fhir.ContactDetail> valueContactDetail() {
    return java.util.Optional.ofNullable(valueContactDetail);
  }

  /**
   * @return The value of the {@code valueReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueReference")
  @Override
  public java.util.Optional<com.fhir.Reference> valueReference() {
    return java.util.Optional.ofNullable(valueReference);
  }

  /**
   * @return The value of the {@code valueQuantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueQuantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> valueQuantity() {
    return java.util.Optional.ofNullable(valueQuantity);
  }

  /**
   * @return The value of the {@code valueDosage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueDosage")
  @Override
  public java.util.Optional<com.fhir.Dosage> valueDosage() {
    return java.util.Optional.ofNullable(valueDosage);
  }

  /**
   * @return The value of the {@code valueCoding} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueCoding")
  @Override
  public java.util.Optional<com.fhir.Coding> valueCoding() {
    return java.util.Optional.ofNullable(valueCoding);
  }

  /**
   * @return The value of the {@code valueId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueId")
  @Override
  public java.util.Optional<java.lang.String> valueId() {
    return java.util.Optional.ofNullable(valueId);
  }

  /**
   * @return The value of the {@code valueUnsignedInt} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueUnsignedInt")
  @Override
  public java.util.Optional<java.lang.Double> valueUnsignedInt() {
    return java.util.Optional.ofNullable(valueUnsignedInt);
  }

  /**
   * @return The value of the {@code valuePositiveInt} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valuePositiveInt")
  @Override
  public java.util.Optional<java.lang.Double> valuePositiveInt() {
    return java.util.Optional.ofNullable(valuePositiveInt);
  }

  /**
   * @return The value of the {@code valueContactPoint} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueContactPoint")
  @Override
  public java.util.Optional<com.fhir.ContactPoint> valueContactPoint() {
    return java.util.Optional.ofNullable(valueContactPoint);
  }

  /**
   * @return The value of the {@code valueRatio} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueRatio")
  @Override
  public java.util.Optional<com.fhir.Ratio> valueRatio() {
    return java.util.Optional.ofNullable(valueRatio);
  }

  /**
   * @return The value of the {@code valueDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueDateTime")
  @Override
  public java.util.Optional<java.lang.String> valueDateTime() {
    return java.util.Optional.ofNullable(valueDateTime);
  }

  /**
   * @return The value of the {@code valueCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueCode")
  @Override
  public java.util.Optional<java.lang.String> valueCode() {
    return java.util.Optional.ofNullable(valueCode);
  }

  /**
   * @return The value of the {@code valueRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueRange")
  @Override
  public java.util.Optional<com.fhir.Range> valueRange() {
    return java.util.Optional.ofNullable(valueRange);
  }

  /**
   * @return The value of the {@code valueContributor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueContributor")
  @Override
  public java.util.Optional<com.fhir.Contributor> valueContributor() {
    return java.util.Optional.ofNullable(valueContributor);
  }

  /**
   * @return The value of the {@code valueBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> valueBoolean() {
    return java.util.Optional.ofNullable(valueBoolean);
  }

  /**
   * @return The value of the {@code valueMarkdown} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueMarkdown")
  @Override
  public java.util.Optional<java.lang.String> valueMarkdown() {
    return java.util.Optional.ofNullable(valueMarkdown);
  }

  /**
   * @return The value of the {@code valuePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valuePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> valuePeriod() {
    return java.util.Optional.ofNullable(valuePeriod);
  }

  /**
   * @return The value of the {@code valueCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueCanonical")
  @Override
  public java.util.Optional<java.lang.String> valueCanonical() {
    return java.util.Optional.ofNullable(valueCanonical);
  }

  /**
   * @return The value of the {@code valueBase64Binary} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueBase64Binary")
  @Override
  public java.util.Optional<java.lang.String> valueBase64Binary() {
    return java.util.Optional.ofNullable(valueBase64Binary);
  }

  /**
   * @return The value of the {@code valueAge} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueAge")
  @Override
  public java.util.Optional<com.fhir.Age> valueAge() {
    return java.util.Optional.ofNullable(valueAge);
  }

  /**
   * @return The value of the {@code valueAddress} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueAddress")
  @Override
  public java.util.Optional<com.fhir.Address> valueAddress() {
    return java.util.Optional.ofNullable(valueAddress);
  }

  /**
   * @return The value of the {@code valueCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> valueCodeableConcept() {
    return java.util.Optional.ofNullable(valueCodeableConcept);
  }

  /**
   * @return The value of the {@code valueMoney} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueMoney")
  @Override
  public java.util.Optional<com.fhir.Money> valueMoney() {
    return java.util.Optional.ofNullable(valueMoney);
  }

  /**
   * @return The value of the {@code valueSampledData} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueSampledData")
  @Override
  public java.util.Optional<com.fhir.SampledData> valueSampledData() {
    return java.util.Optional.ofNullable(valueSampledData);
  }

  /**
   * @return The value of the {@code valueInstant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueInstant")
  @Override
  public java.util.Optional<java.lang.String> valueInstant() {
    return java.util.Optional.ofNullable(valueInstant);
  }

  /**
   * @return The value of the {@code valueParameterDefinition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueParameterDefinition")
  @Override
  public java.util.Optional<com.fhir.ParameterDefinition> valueParameterDefinition() {
    return java.util.Optional.ofNullable(valueParameterDefinition);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueString")
  @Override
  public java.util.Optional<java.lang.String> valueString() {
    return java.util.Optional.ofNullable(valueString);
  }

  /**
   * @return The value of the {@code valueDuration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueDuration")
  @Override
  public java.util.Optional<com.fhir.Duration> valueDuration() {
    return java.util.Optional.ofNullable(valueDuration);
  }

  /**
   * @return The value of the {@code valueDistance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueDistance")
  @Override
  public java.util.Optional<com.fhir.Distance> valueDistance() {
    return java.util.Optional.ofNullable(valueDistance);
  }

  /**
   * @return The value of the {@code valueHumanName} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueHumanName")
  @Override
  public java.util.Optional<com.fhir.HumanName> valueHumanName() {
    return java.util.Optional.ofNullable(valueHumanName);
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
   * @return The value of the {@code valueUuid} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueUuid")
  @Override
  public java.util.Optional<java.lang.String> valueUuid() {
    return java.util.Optional.ofNullable(valueUuid);
  }

  /**
   * @return The value of the {@code valueMeta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueMeta")
  @Override
  public java.util.Optional<com.fhir.Meta> valueMeta() {
    return java.util.Optional.ofNullable(valueMeta);
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
   * @return The value of the {@code valueUrl} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueUrl")
  @Override
  public java.util.Optional<java.lang.String> valueUrl() {
    return java.util.Optional.ofNullable(valueUrl);
  }

  /**
   * @return The value of the {@code valueInteger} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueInteger")
  @Override
  public java.util.Optional<java.lang.Double> valueInteger() {
    return java.util.Optional.ofNullable(valueInteger);
  }

  /**
   * @return The value of the {@code valueDataRequirement} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueDataRequirement")
  @Override
  public java.util.Optional<com.fhir.DataRequirement> valueDataRequirement() {
    return java.util.Optional.ofNullable(valueDataRequirement);
  }

  /**
   * @return The value of the {@code valueExpression} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueExpression")
  @Override
  public java.util.Optional<com.fhir.Expression> valueExpression() {
    return java.util.Optional.ofNullable(valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueAnnotation() valueAnnotation} attribute.
   * @param value The value for valueAnnotation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueAnnotation(com.fhir.Annotation value) {
    @javax.annotation.Nullable com.fhir.Annotation newValue = java.util.Objects.requireNonNull(value, "valueAnnotation");
    if (this.valueAnnotation == newValue) return this;
    return new ImmutableExtension(
        newValue,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueAnnotation() valueAnnotation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAnnotation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueAnnotation(java.util.Optional<? extends com.fhir.Annotation> optional) {
    @javax.annotation.Nullable com.fhir.Annotation value = optional.orElse(null);
    if (this.valueAnnotation == value) return this;
    return new ImmutableExtension(
        value,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueCount() valueCount} attribute.
   * @param value The value for valueCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCount(com.fhir.Count value) {
    @javax.annotation.Nullable com.fhir.Count newValue = java.util.Objects.requireNonNull(value, "valueCount");
    if (this.valueCount == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        newValue,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueCount() valueCount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueCount(java.util.Optional<? extends com.fhir.Count> optional) {
    @javax.annotation.Nullable com.fhir.Count value = optional.orElse(null);
    if (this.valueCount == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        value,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueTriggerDefinition() valueTriggerDefinition} attribute.
   * @param value The value for valueTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueTriggerDefinition(com.fhir.TriggerDefinition value) {
    @javax.annotation.Nullable com.fhir.TriggerDefinition newValue = java.util.Objects.requireNonNull(value, "valueTriggerDefinition");
    if (this.valueTriggerDefinition == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        newValue,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueTriggerDefinition() valueTriggerDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueTriggerDefinition(java.util.Optional<? extends com.fhir.TriggerDefinition> optional) {
    @javax.annotation.Nullable com.fhir.TriggerDefinition value = optional.orElse(null);
    if (this.valueTriggerDefinition == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        value,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueSignature() valueSignature} attribute.
   * @param value The value for valueSignature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueSignature(com.fhir.Signature value) {
    @javax.annotation.Nullable com.fhir.Signature newValue = java.util.Objects.requireNonNull(value, "valueSignature");
    if (this.valueSignature == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        newValue,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueSignature() valueSignature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSignature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueSignature(java.util.Optional<? extends com.fhir.Signature> optional) {
    @javax.annotation.Nullable com.fhir.Signature value = optional.orElse(null);
    if (this.valueSignature == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        value,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDate() valueDate} attribute.
   * @param value The value for valueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDate(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueDate");
    if (java.util.Objects.equals(this.valueDate, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        newValue,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDate() valueDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDate(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueDate, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        value,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueAttachment() valueAttachment} attribute.
   * @param value The value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueAttachment(com.fhir.Attachment value) {
    @javax.annotation.Nullable com.fhir.Attachment newValue = java.util.Objects.requireNonNull(value, "valueAttachment");
    if (this.valueAttachment == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        newValue,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueAttachment() valueAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueAttachment(java.util.Optional<? extends com.fhir.Attachment> optional) {
    @javax.annotation.Nullable com.fhir.Attachment value = optional.orElse(null);
    if (this.valueAttachment == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        value,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueUri() valueUri} attribute.
   * @param value The value for valueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUri(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueUri");
    if (java.util.Objects.equals(this.valueUri, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        newValue,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueUri() valueUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUri(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueUri, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        value,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueIdentifier() valueIdentifier} attribute.
   * @param value The value for valueIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "valueIdentifier");
    if (this.valueIdentifier == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        newValue,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueIdentifier() valueIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.valueIdentifier == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        value,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        newValue,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        value,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueOid() valueOid} attribute.
   * @param value The value for valueOid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueOid(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueOid");
    if (java.util.Objects.equals(this.valueOid, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        newValue,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueOid() valueOid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueOid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueOid(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueOid, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        value,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueTiming() valueTiming} attribute.
   * @param value The value for valueTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "valueTiming");
    if (this.valueTiming == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        newValue,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueTiming() valueTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.valueTiming == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        value,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueUsageContext() valueUsageContext} attribute.
   * @param value The value for valueUsageContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUsageContext(com.fhir.UsageContext value) {
    @javax.annotation.Nullable com.fhir.UsageContext newValue = java.util.Objects.requireNonNull(value, "valueUsageContext");
    if (this.valueUsageContext == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        newValue,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueUsageContext() valueUsageContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUsageContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueUsageContext(java.util.Optional<? extends com.fhir.UsageContext> optional) {
    @javax.annotation.Nullable com.fhir.UsageContext value = optional.orElse(null);
    if (this.valueUsageContext == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        value,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueTime() valueTime} attribute.
   * @param value The value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueTime");
    if (java.util.Objects.equals(this.valueTime, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        newValue,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueTime() valueTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueTime, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        value,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueRelatedArtifact() valueRelatedArtifact} attribute.
   * @param value The value for valueRelatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueRelatedArtifact(com.fhir.RelatedArtifact value) {
    @javax.annotation.Nullable com.fhir.RelatedArtifact newValue = java.util.Objects.requireNonNull(value, "valueRelatedArtifact");
    if (this.valueRelatedArtifact == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        newValue,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueRelatedArtifact() valueRelatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRelatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueRelatedArtifact(java.util.Optional<? extends com.fhir.RelatedArtifact> optional) {
    @javax.annotation.Nullable com.fhir.RelatedArtifact value = optional.orElse(null);
    if (this.valueRelatedArtifact == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        value,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDecimal() valueDecimal} attribute.
   * @param value The value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDecimal(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.valueDecimal, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        newValue,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDecimal() valueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDecimal(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueDecimal, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        value,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueContactDetail() valueContactDetail} attribute.
   * @param value The value for valueContactDetail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueContactDetail(com.fhir.ContactDetail value) {
    @javax.annotation.Nullable com.fhir.ContactDetail newValue = java.util.Objects.requireNonNull(value, "valueContactDetail");
    if (this.valueContactDetail == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        newValue,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueContactDetail() valueContactDetail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueContactDetail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueContactDetail(java.util.Optional<? extends com.fhir.ContactDetail> optional) {
    @javax.annotation.Nullable com.fhir.ContactDetail value = optional.orElse(null);
    if (this.valueContactDetail == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        value,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueReference() valueReference} attribute.
   * @param value The value for valueReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "valueReference");
    if (this.valueReference == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        newValue,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueReference() valueReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.valueReference == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        value,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        newValue,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        value,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDosage() valueDosage} attribute.
   * @param value The value for valueDosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDosage(com.fhir.Dosage value) {
    @javax.annotation.Nullable com.fhir.Dosage newValue = java.util.Objects.requireNonNull(value, "valueDosage");
    if (this.valueDosage == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        newValue,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDosage() valueDosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueDosage(java.util.Optional<? extends com.fhir.Dosage> optional) {
    @javax.annotation.Nullable com.fhir.Dosage value = optional.orElse(null);
    if (this.valueDosage == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        value,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueCoding() valueCoding} attribute.
   * @param value The value for valueCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCoding(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "valueCoding");
    if (this.valueCoding == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        newValue,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueCoding() valueCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueCoding(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.valueCoding == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        value,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueId() valueId} attribute.
   * @param value The value for valueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueId");
    if (java.util.Objects.equals(this.valueId, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        newValue,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueId() valueId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueId, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        value,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueUnsignedInt() valueUnsignedInt} attribute.
   * @param value The value for valueUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUnsignedInt(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.valueUnsignedInt, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        newValue,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueUnsignedInt() valueUnsignedInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUnsignedInt(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueUnsignedInt, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        value,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valuePositiveInt() valuePositiveInt} attribute.
   * @param value The value for valuePositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValuePositiveInt(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.valuePositiveInt, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        newValue,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valuePositiveInt() valuePositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuePositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValuePositiveInt(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.valuePositiveInt, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        value,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueContactPoint() valueContactPoint} attribute.
   * @param value The value for valueContactPoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueContactPoint(com.fhir.ContactPoint value) {
    @javax.annotation.Nullable com.fhir.ContactPoint newValue = java.util.Objects.requireNonNull(value, "valueContactPoint");
    if (this.valueContactPoint == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        newValue,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueContactPoint() valueContactPoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueContactPoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueContactPoint(java.util.Optional<? extends com.fhir.ContactPoint> optional) {
    @javax.annotation.Nullable com.fhir.ContactPoint value = optional.orElse(null);
    if (this.valueContactPoint == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        value,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueRatio() valueRatio} attribute.
   * @param value The value for valueRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueRatio(com.fhir.Ratio value) {
    @javax.annotation.Nullable com.fhir.Ratio newValue = java.util.Objects.requireNonNull(value, "valueRatio");
    if (this.valueRatio == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        newValue,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueRatio() valueRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueRatio(java.util.Optional<? extends com.fhir.Ratio> optional) {
    @javax.annotation.Nullable com.fhir.Ratio value = optional.orElse(null);
    if (this.valueRatio == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        value,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDateTime() valueDateTime} attribute.
   * @param value The value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueDateTime");
    if (java.util.Objects.equals(this.valueDateTime, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        newValue,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDateTime() valueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueDateTime, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        value,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueCode() valueCode} attribute.
   * @param value The value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCode(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueCode");
    if (java.util.Objects.equals(this.valueCode, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        newValue,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueCode() valueCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCode(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueCode, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        value,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueRange() valueRange} attribute.
   * @param value The value for valueRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "valueRange");
    if (this.valueRange == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        newValue,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueRange() valueRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.valueRange == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        value,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueContributor() valueContributor} attribute.
   * @param value The value for valueContributor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueContributor(com.fhir.Contributor value) {
    @javax.annotation.Nullable com.fhir.Contributor newValue = java.util.Objects.requireNonNull(value, "valueContributor");
    if (this.valueContributor == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        newValue,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueContributor() valueContributor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueContributor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueContributor(java.util.Optional<? extends com.fhir.Contributor> optional) {
    @javax.annotation.Nullable com.fhir.Contributor value = optional.orElse(null);
    if (this.valueContributor == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        value,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        newValue,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        value,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueMarkdown() valueMarkdown} attribute.
   * @param value The value for valueMarkdown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueMarkdown(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueMarkdown");
    if (java.util.Objects.equals(this.valueMarkdown, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        newValue,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueMarkdown() valueMarkdown} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMarkdown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueMarkdown(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueMarkdown, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        value,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valuePeriod() valuePeriod} attribute.
   * @param value The value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValuePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "valuePeriod");
    if (this.valuePeriod == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        newValue,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valuePeriod() valuePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValuePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.valuePeriod == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        value,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueCanonical() valueCanonical} attribute.
   * @param value The value for valueCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCanonical(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueCanonical");
    if (java.util.Objects.equals(this.valueCanonical, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        newValue,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueCanonical() valueCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCanonical(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueCanonical, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        value,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueBase64Binary() valueBase64Binary} attribute.
   * @param value The value for valueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueBase64Binary(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueBase64Binary");
    if (java.util.Objects.equals(this.valueBase64Binary, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        newValue,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueBase64Binary() valueBase64Binary} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueBase64Binary(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueBase64Binary, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        value,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueAge() valueAge} attribute.
   * @param value The value for valueAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueAge(com.fhir.Age value) {
    @javax.annotation.Nullable com.fhir.Age newValue = java.util.Objects.requireNonNull(value, "valueAge");
    if (this.valueAge == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        newValue,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueAge() valueAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueAge(java.util.Optional<? extends com.fhir.Age> optional) {
    @javax.annotation.Nullable com.fhir.Age value = optional.orElse(null);
    if (this.valueAge == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        value,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueAddress() valueAddress} attribute.
   * @param value The value for valueAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueAddress(com.fhir.Address value) {
    @javax.annotation.Nullable com.fhir.Address newValue = java.util.Objects.requireNonNull(value, "valueAddress");
    if (this.valueAddress == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        newValue,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueAddress() valueAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueAddress(java.util.Optional<? extends com.fhir.Address> optional) {
    @javax.annotation.Nullable com.fhir.Address value = optional.orElse(null);
    if (this.valueAddress == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        value,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueCodeableConcept() valueCodeableConcept} attribute.
   * @param value The value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "valueCodeableConcept");
    if (this.valueCodeableConcept == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        newValue,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueCodeableConcept() valueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.valueCodeableConcept == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        value,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueMoney() valueMoney} attribute.
   * @param value The value for valueMoney
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueMoney(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "valueMoney");
    if (this.valueMoney == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        newValue,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueMoney() valueMoney} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMoney
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueMoney(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.valueMoney == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        value,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueSampledData() valueSampledData} attribute.
   * @param value The value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueSampledData(com.fhir.SampledData value) {
    @javax.annotation.Nullable com.fhir.SampledData newValue = java.util.Objects.requireNonNull(value, "valueSampledData");
    if (this.valueSampledData == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        newValue,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueSampledData() valueSampledData} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSampledData
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueSampledData(java.util.Optional<? extends com.fhir.SampledData> optional) {
    @javax.annotation.Nullable com.fhir.SampledData value = optional.orElse(null);
    if (this.valueSampledData == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        value,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueInstant() valueInstant} attribute.
   * @param value The value for valueInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueInstant(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueInstant");
    if (java.util.Objects.equals(this.valueInstant, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        newValue,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueInstant() valueInstant} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueInstant(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueInstant, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        value,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueParameterDefinition() valueParameterDefinition} attribute.
   * @param value The value for valueParameterDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueParameterDefinition(com.fhir.ParameterDefinition value) {
    @javax.annotation.Nullable com.fhir.ParameterDefinition newValue = java.util.Objects.requireNonNull(value, "valueParameterDefinition");
    if (this.valueParameterDefinition == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        newValue,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueParameterDefinition() valueParameterDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueParameterDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueParameterDefinition(java.util.Optional<? extends com.fhir.ParameterDefinition> optional) {
    @javax.annotation.Nullable com.fhir.ParameterDefinition value = optional.orElse(null);
    if (this.valueParameterDefinition == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        value,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueString");
    if (java.util.Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        newValue,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueString, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        value,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDuration() valueDuration} attribute.
   * @param value The value for valueDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDuration(com.fhir.Duration value) {
    @javax.annotation.Nullable com.fhir.Duration newValue = java.util.Objects.requireNonNull(value, "valueDuration");
    if (this.valueDuration == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        newValue,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDuration() valueDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueDuration(java.util.Optional<? extends com.fhir.Duration> optional) {
    @javax.annotation.Nullable com.fhir.Duration value = optional.orElse(null);
    if (this.valueDuration == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        value,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDistance() valueDistance} attribute.
   * @param value The value for valueDistance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDistance(com.fhir.Distance value) {
    @javax.annotation.Nullable com.fhir.Distance newValue = java.util.Objects.requireNonNull(value, "valueDistance");
    if (this.valueDistance == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        newValue,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDistance() valueDistance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDistance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueDistance(java.util.Optional<? extends com.fhir.Distance> optional) {
    @javax.annotation.Nullable com.fhir.Distance value = optional.orElse(null);
    if (this.valueDistance == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        value,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueHumanName() valueHumanName} attribute.
   * @param value The value for valueHumanName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueHumanName(com.fhir.HumanName value) {
    @javax.annotation.Nullable com.fhir.HumanName newValue = java.util.Objects.requireNonNull(value, "valueHumanName");
    if (this.valueHumanName == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        newValue,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueHumanName() valueHumanName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueHumanName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueHumanName(java.util.Optional<? extends com.fhir.HumanName> optional) {
    @javax.annotation.Nullable com.fhir.HumanName value = optional.orElse(null);
    if (this.valueHumanName == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        value,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        newValue,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        value,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueUuid() valueUuid} attribute.
   * @param value The value for valueUuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUuid(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueUuid");
    if (java.util.Objects.equals(this.valueUuid, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        newValue,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueUuid() valueUuid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUuid(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueUuid, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        value,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueMeta() valueMeta} attribute.
   * @param value The value for valueMeta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "valueMeta");
    if (this.valueMeta == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        newValue,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueMeta() valueMeta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMeta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.valueMeta == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        value,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        newValue,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        value,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueUrl() valueUrl} attribute.
   * @param value The value for valueUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUrl(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueUrl");
    if (java.util.Objects.equals(this.valueUrl, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        newValue,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueUrl() valueUrl} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueUrl(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueUrl, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        value,
        this.valueInteger,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueInteger(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        newValue,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueInteger(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        value,
        this.valueDataRequirement,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueDataRequirement() valueDataRequirement} attribute.
   * @param value The value for valueDataRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueDataRequirement(com.fhir.DataRequirement value) {
    @javax.annotation.Nullable com.fhir.DataRequirement newValue = java.util.Objects.requireNonNull(value, "valueDataRequirement");
    if (this.valueDataRequirement == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        newValue,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueDataRequirement() valueDataRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDataRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueDataRequirement(java.util.Optional<? extends com.fhir.DataRequirement> optional) {
    @javax.annotation.Nullable com.fhir.DataRequirement value = optional.orElse(null);
    if (this.valueDataRequirement == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        value,
        this.valueExpression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Extension#valueExpression() valueExpression} attribute.
   * @param value The value for valueExpression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExtension withValueExpression(com.fhir.Expression value) {
    @javax.annotation.Nullable com.fhir.Expression newValue = java.util.Objects.requireNonNull(value, "valueExpression");
    if (this.valueExpression == newValue) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Extension#valueExpression() valueExpression} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueExpression
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExtension withValueExpression(java.util.Optional<? extends com.fhir.Expression> optional) {
    @javax.annotation.Nullable com.fhir.Expression value = optional.orElse(null);
    if (this.valueExpression == value) return this;
    return new ImmutableExtension(
        this.valueAnnotation,
        this.valueCount,
        this.valueTriggerDefinition,
        this.valueSignature,
        this.valueDate,
        this.valueAttachment,
        this.valueUri,
        this.valueIdentifier,
        this.url,
        this.valueOid,
        this.valueTiming,
        this.valueUsageContext,
        this.valueTime,
        this.valueRelatedArtifact,
        this.valueDecimal,
        this.valueContactDetail,
        this.valueReference,
        this.valueQuantity,
        this.valueDosage,
        this.valueCoding,
        this.valueId,
        this.valueUnsignedInt,
        this.valuePositiveInt,
        this.valueContactPoint,
        this.valueRatio,
        this.valueDateTime,
        this.valueCode,
        this.valueRange,
        this.valueContributor,
        this.valueBoolean,
        this.valueMarkdown,
        this.valuePeriod,
        this.valueCanonical,
        this.valueBase64Binary,
        this.valueAge,
        this.valueAddress,
        this.valueCodeableConcept,
        this.valueMoney,
        this.valueSampledData,
        this.valueInstant,
        this.valueParameterDefinition,
        this.valueString,
        this.valueDuration,
        this.valueDistance,
        this.valueHumanName,
        this.id,
        this.valueUuid,
        this.valueMeta,
        this.extension,
        this.valueUrl,
        this.valueInteger,
        this.valueDataRequirement,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExtension} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExtension
        && equalTo((ImmutableExtension) another);
  }

  private boolean equalTo(ImmutableExtension another) {
    return java.util.Objects.equals(valueAnnotation, another.valueAnnotation)
        && java.util.Objects.equals(valueCount, another.valueCount)
        && java.util.Objects.equals(valueTriggerDefinition, another.valueTriggerDefinition)
        && java.util.Objects.equals(valueSignature, another.valueSignature)
        && java.util.Objects.equals(valueDate, another.valueDate)
        && java.util.Objects.equals(valueAttachment, another.valueAttachment)
        && java.util.Objects.equals(valueUri, another.valueUri)
        && java.util.Objects.equals(valueIdentifier, another.valueIdentifier)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(valueOid, another.valueOid)
        && java.util.Objects.equals(valueTiming, another.valueTiming)
        && java.util.Objects.equals(valueUsageContext, another.valueUsageContext)
        && java.util.Objects.equals(valueTime, another.valueTime)
        && java.util.Objects.equals(valueRelatedArtifact, another.valueRelatedArtifact)
        && java.util.Objects.equals(valueDecimal, another.valueDecimal)
        && java.util.Objects.equals(valueContactDetail, another.valueContactDetail)
        && java.util.Objects.equals(valueReference, another.valueReference)
        && java.util.Objects.equals(valueQuantity, another.valueQuantity)
        && java.util.Objects.equals(valueDosage, another.valueDosage)
        && java.util.Objects.equals(valueCoding, another.valueCoding)
        && java.util.Objects.equals(valueId, another.valueId)
        && java.util.Objects.equals(valueUnsignedInt, another.valueUnsignedInt)
        && java.util.Objects.equals(valuePositiveInt, another.valuePositiveInt)
        && java.util.Objects.equals(valueContactPoint, another.valueContactPoint)
        && java.util.Objects.equals(valueRatio, another.valueRatio)
        && java.util.Objects.equals(valueDateTime, another.valueDateTime)
        && java.util.Objects.equals(valueCode, another.valueCode)
        && java.util.Objects.equals(valueRange, another.valueRange)
        && java.util.Objects.equals(valueContributor, another.valueContributor)
        && java.util.Objects.equals(valueBoolean, another.valueBoolean)
        && java.util.Objects.equals(valueMarkdown, another.valueMarkdown)
        && java.util.Objects.equals(valuePeriod, another.valuePeriod)
        && java.util.Objects.equals(valueCanonical, another.valueCanonical)
        && java.util.Objects.equals(valueBase64Binary, another.valueBase64Binary)
        && java.util.Objects.equals(valueAge, another.valueAge)
        && java.util.Objects.equals(valueAddress, another.valueAddress)
        && java.util.Objects.equals(valueCodeableConcept, another.valueCodeableConcept)
        && java.util.Objects.equals(valueMoney, another.valueMoney)
        && java.util.Objects.equals(valueSampledData, another.valueSampledData)
        && java.util.Objects.equals(valueInstant, another.valueInstant)
        && java.util.Objects.equals(valueParameterDefinition, another.valueParameterDefinition)
        && java.util.Objects.equals(valueString, another.valueString)
        && java.util.Objects.equals(valueDuration, another.valueDuration)
        && java.util.Objects.equals(valueDistance, another.valueDistance)
        && java.util.Objects.equals(valueHumanName, another.valueHumanName)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(valueUuid, another.valueUuid)
        && java.util.Objects.equals(valueMeta, another.valueMeta)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(valueUrl, another.valueUrl)
        && java.util.Objects.equals(valueInteger, another.valueInteger)
        && java.util.Objects.equals(valueDataRequirement, another.valueDataRequirement)
        && java.util.Objects.equals(valueExpression, another.valueExpression);
  }

  /**
   * Computes a hash code from attributes: {@code valueAnnotation}, {@code valueCount}, {@code valueTriggerDefinition}, {@code valueSignature}, {@code valueDate}, {@code valueAttachment}, {@code valueUri}, {@code valueIdentifier}, {@code url}, {@code valueOid}, {@code valueTiming}, {@code valueUsageContext}, {@code valueTime}, {@code valueRelatedArtifact}, {@code valueDecimal}, {@code valueContactDetail}, {@code valueReference}, {@code valueQuantity}, {@code valueDosage}, {@code valueCoding}, {@code valueId}, {@code valueUnsignedInt}, {@code valuePositiveInt}, {@code valueContactPoint}, {@code valueRatio}, {@code valueDateTime}, {@code valueCode}, {@code valueRange}, {@code valueContributor}, {@code valueBoolean}, {@code valueMarkdown}, {@code valuePeriod}, {@code valueCanonical}, {@code valueBase64Binary}, {@code valueAge}, {@code valueAddress}, {@code valueCodeableConcept}, {@code valueMoney}, {@code valueSampledData}, {@code valueInstant}, {@code valueParameterDefinition}, {@code valueString}, {@code valueDuration}, {@code valueDistance}, {@code valueHumanName}, {@code id}, {@code valueUuid}, {@code valueMeta}, {@code extension}, {@code valueUrl}, {@code valueInteger}, {@code valueDataRequirement}, {@code valueExpression}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(valueAnnotation);
    h += (h << 5) + java.util.Objects.hashCode(valueCount);
    h += (h << 5) + java.util.Objects.hashCode(valueTriggerDefinition);
    h += (h << 5) + java.util.Objects.hashCode(valueSignature);
    h += (h << 5) + java.util.Objects.hashCode(valueDate);
    h += (h << 5) + java.util.Objects.hashCode(valueAttachment);
    h += (h << 5) + java.util.Objects.hashCode(valueUri);
    h += (h << 5) + java.util.Objects.hashCode(valueIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(valueOid);
    h += (h << 5) + java.util.Objects.hashCode(valueTiming);
    h += (h << 5) + java.util.Objects.hashCode(valueUsageContext);
    h += (h << 5) + java.util.Objects.hashCode(valueTime);
    h += (h << 5) + java.util.Objects.hashCode(valueRelatedArtifact);
    h += (h << 5) + java.util.Objects.hashCode(valueDecimal);
    h += (h << 5) + java.util.Objects.hashCode(valueContactDetail);
    h += (h << 5) + java.util.Objects.hashCode(valueReference);
    h += (h << 5) + java.util.Objects.hashCode(valueQuantity);
    h += (h << 5) + java.util.Objects.hashCode(valueDosage);
    h += (h << 5) + java.util.Objects.hashCode(valueCoding);
    h += (h << 5) + java.util.Objects.hashCode(valueId);
    h += (h << 5) + java.util.Objects.hashCode(valueUnsignedInt);
    h += (h << 5) + java.util.Objects.hashCode(valuePositiveInt);
    h += (h << 5) + java.util.Objects.hashCode(valueContactPoint);
    h += (h << 5) + java.util.Objects.hashCode(valueRatio);
    h += (h << 5) + java.util.Objects.hashCode(valueDateTime);
    h += (h << 5) + java.util.Objects.hashCode(valueCode);
    h += (h << 5) + java.util.Objects.hashCode(valueRange);
    h += (h << 5) + java.util.Objects.hashCode(valueContributor);
    h += (h << 5) + java.util.Objects.hashCode(valueBoolean);
    h += (h << 5) + java.util.Objects.hashCode(valueMarkdown);
    h += (h << 5) + java.util.Objects.hashCode(valuePeriod);
    h += (h << 5) + java.util.Objects.hashCode(valueCanonical);
    h += (h << 5) + java.util.Objects.hashCode(valueBase64Binary);
    h += (h << 5) + java.util.Objects.hashCode(valueAge);
    h += (h << 5) + java.util.Objects.hashCode(valueAddress);
    h += (h << 5) + java.util.Objects.hashCode(valueCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(valueMoney);
    h += (h << 5) + java.util.Objects.hashCode(valueSampledData);
    h += (h << 5) + java.util.Objects.hashCode(valueInstant);
    h += (h << 5) + java.util.Objects.hashCode(valueParameterDefinition);
    h += (h << 5) + java.util.Objects.hashCode(valueString);
    h += (h << 5) + java.util.Objects.hashCode(valueDuration);
    h += (h << 5) + java.util.Objects.hashCode(valueDistance);
    h += (h << 5) + java.util.Objects.hashCode(valueHumanName);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(valueUuid);
    h += (h << 5) + java.util.Objects.hashCode(valueMeta);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(valueUrl);
    h += (h << 5) + java.util.Objects.hashCode(valueInteger);
    h += (h << 5) + java.util.Objects.hashCode(valueDataRequirement);
    h += (h << 5) + java.util.Objects.hashCode(valueExpression);
    return h;
  }

  /**
   * Prints the immutable value {@code Extension} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Extension{");
    if (valueAnnotation != null) {
      builder.append("valueAnnotation=").append(valueAnnotation);
    }
    if (valueCount != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueCount=").append(valueCount);
    }
    if (valueTriggerDefinition != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueTriggerDefinition=").append(valueTriggerDefinition);
    }
    if (valueSignature != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueSignature=").append(valueSignature);
    }
    if (valueDate != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDate=").append(valueDate);
    }
    if (valueAttachment != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueAttachment=").append(valueAttachment);
    }
    if (valueUri != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueUri=").append(valueUri);
    }
    if (valueIdentifier != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueIdentifier=").append(valueIdentifier);
    }
    if (url != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (valueOid != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueOid=").append(valueOid);
    }
    if (valueTiming != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueTiming=").append(valueTiming);
    }
    if (valueUsageContext != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueUsageContext=").append(valueUsageContext);
    }
    if (valueTime != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueTime=").append(valueTime);
    }
    if (valueRelatedArtifact != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueRelatedArtifact=").append(valueRelatedArtifact);
    }
    if (valueDecimal != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDecimal=").append(valueDecimal);
    }
    if (valueContactDetail != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueContactDetail=").append(valueContactDetail);
    }
    if (valueReference != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueReference=").append(valueReference);
    }
    if (valueQuantity != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (valueDosage != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDosage=").append(valueDosage);
    }
    if (valueCoding != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueCoding=").append(valueCoding);
    }
    if (valueId != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueId=").append(valueId);
    }
    if (valueUnsignedInt != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueUnsignedInt=").append(valueUnsignedInt);
    }
    if (valuePositiveInt != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valuePositiveInt=").append(valuePositiveInt);
    }
    if (valueContactPoint != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueContactPoint=").append(valueContactPoint);
    }
    if (valueRatio != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueRatio=").append(valueRatio);
    }
    if (valueDateTime != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDateTime=").append(valueDateTime);
    }
    if (valueCode != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueCode=").append(valueCode);
    }
    if (valueRange != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueRange=").append(valueRange);
    }
    if (valueContributor != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueContributor=").append(valueContributor);
    }
    if (valueBoolean != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valueMarkdown != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueMarkdown=").append(valueMarkdown);
    }
    if (valuePeriod != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valuePeriod=").append(valuePeriod);
    }
    if (valueCanonical != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueCanonical=").append(valueCanonical);
    }
    if (valueBase64Binary != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueBase64Binary=").append(valueBase64Binary);
    }
    if (valueAge != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueAge=").append(valueAge);
    }
    if (valueAddress != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueAddress=").append(valueAddress);
    }
    if (valueCodeableConcept != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueCodeableConcept=").append(valueCodeableConcept);
    }
    if (valueMoney != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueMoney=").append(valueMoney);
    }
    if (valueSampledData != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueSampledData=").append(valueSampledData);
    }
    if (valueInstant != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueInstant=").append(valueInstant);
    }
    if (valueParameterDefinition != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueParameterDefinition=").append(valueParameterDefinition);
    }
    if (valueString != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueDuration != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDuration=").append(valueDuration);
    }
    if (valueDistance != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDistance=").append(valueDistance);
    }
    if (valueHumanName != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueHumanName=").append(valueHumanName);
    }
    if (id != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (valueUuid != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueUuid=").append(valueUuid);
    }
    if (valueMeta != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueMeta=").append(valueMeta);
    }
    if (extension != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (valueUrl != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueUrl=").append(valueUrl);
    }
    if (valueInteger != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (valueDataRequirement != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueDataRequirement=").append(valueDataRequirement);
    }
    if (valueExpression != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("valueExpression=").append(valueExpression);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Extension", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Extension {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Annotation> valueAnnotation = java.util.Optional.empty();
    boolean valueAnnotationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Count> valueCount = java.util.Optional.empty();
    boolean valueCountIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TriggerDefinition> valueTriggerDefinition = java.util.Optional.empty();
    boolean valueTriggerDefinitionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Signature> valueSignature = java.util.Optional.empty();
    boolean valueSignatureIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueDate = java.util.Optional.empty();
    boolean valueDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Attachment> valueAttachment = java.util.Optional.empty();
    boolean valueAttachmentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueUri = java.util.Optional.empty();
    boolean valueUriIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> valueIdentifier = java.util.Optional.empty();
    boolean valueIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueOid = java.util.Optional.empty();
    boolean valueOidIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> valueTiming = java.util.Optional.empty();
    boolean valueTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.UsageContext> valueUsageContext = java.util.Optional.empty();
    boolean valueUsageContextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueTime = java.util.Optional.empty();
    boolean valueTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.RelatedArtifact> valueRelatedArtifact = java.util.Optional.empty();
    boolean valueRelatedArtifactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> valueDecimal = java.util.Optional.empty();
    boolean valueDecimalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ContactDetail> valueContactDetail = java.util.Optional.empty();
    boolean valueContactDetailIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> valueReference = java.util.Optional.empty();
    boolean valueReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> valueQuantity = java.util.Optional.empty();
    boolean valueQuantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Dosage> valueDosage = java.util.Optional.empty();
    boolean valueDosageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> valueCoding = java.util.Optional.empty();
    boolean valueCodingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueId = java.util.Optional.empty();
    boolean valueIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> valueUnsignedInt = java.util.Optional.empty();
    boolean valueUnsignedIntIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> valuePositiveInt = java.util.Optional.empty();
    boolean valuePositiveIntIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ContactPoint> valueContactPoint = java.util.Optional.empty();
    boolean valueContactPointIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Ratio> valueRatio = java.util.Optional.empty();
    boolean valueRatioIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueDateTime = java.util.Optional.empty();
    boolean valueDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueCode = java.util.Optional.empty();
    boolean valueCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> valueRange = java.util.Optional.empty();
    boolean valueRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Contributor> valueContributor = java.util.Optional.empty();
    boolean valueContributorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> valueBoolean = java.util.Optional.empty();
    boolean valueBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueMarkdown = java.util.Optional.empty();
    boolean valueMarkdownIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> valuePeriod = java.util.Optional.empty();
    boolean valuePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueCanonical = java.util.Optional.empty();
    boolean valueCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueBase64Binary = java.util.Optional.empty();
    boolean valueBase64BinaryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Age> valueAge = java.util.Optional.empty();
    boolean valueAgeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Address> valueAddress = java.util.Optional.empty();
    boolean valueAddressIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> valueCodeableConcept = java.util.Optional.empty();
    boolean valueCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> valueMoney = java.util.Optional.empty();
    boolean valueMoneyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SampledData> valueSampledData = java.util.Optional.empty();
    boolean valueSampledDataIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueInstant = java.util.Optional.empty();
    boolean valueInstantIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ParameterDefinition> valueParameterDefinition = java.util.Optional.empty();
    boolean valueParameterDefinitionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueString = java.util.Optional.empty();
    boolean valueStringIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Duration> valueDuration = java.util.Optional.empty();
    boolean valueDurationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Distance> valueDistance = java.util.Optional.empty();
    boolean valueDistanceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.HumanName> valueHumanName = java.util.Optional.empty();
    boolean valueHumanNameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueUuid = java.util.Optional.empty();
    boolean valueUuidIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> valueMeta = java.util.Optional.empty();
    boolean valueMetaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueUrl = java.util.Optional.empty();
    boolean valueUrlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> valueInteger = java.util.Optional.empty();
    boolean valueIntegerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DataRequirement> valueDataRequirement = java.util.Optional.empty();
    boolean valueDataRequirementIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Expression> valueExpression = java.util.Optional.empty();
    boolean valueExpressionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("valueAnnotation")
    public void setValueAnnotation(java.util.Optional<com.fhir.Annotation> valueAnnotation) {
      this.valueAnnotation = valueAnnotation;
      this.valueAnnotationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueCount")
    public void setValueCount(java.util.Optional<com.fhir.Count> valueCount) {
      this.valueCount = valueCount;
      this.valueCountIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueTriggerDefinition")
    public void setValueTriggerDefinition(java.util.Optional<com.fhir.TriggerDefinition> valueTriggerDefinition) {
      this.valueTriggerDefinition = valueTriggerDefinition;
      this.valueTriggerDefinitionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueSignature")
    public void setValueSignature(java.util.Optional<com.fhir.Signature> valueSignature) {
      this.valueSignature = valueSignature;
      this.valueSignatureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueDate")
    public void setValueDate(java.util.Optional<java.lang.String> valueDate) {
      this.valueDate = valueDate;
      this.valueDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueAttachment")
    public void setValueAttachment(java.util.Optional<com.fhir.Attachment> valueAttachment) {
      this.valueAttachment = valueAttachment;
      this.valueAttachmentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueUri")
    public void setValueUri(java.util.Optional<java.lang.String> valueUri) {
      this.valueUri = valueUri;
      this.valueUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueIdentifier")
    public void setValueIdentifier(java.util.Optional<com.fhir.Identifier> valueIdentifier) {
      this.valueIdentifier = valueIdentifier;
      this.valueIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueOid")
    public void setValueOid(java.util.Optional<java.lang.String> valueOid) {
      this.valueOid = valueOid;
      this.valueOidIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueTiming")
    public void setValueTiming(java.util.Optional<com.fhir.Timing> valueTiming) {
      this.valueTiming = valueTiming;
      this.valueTimingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueUsageContext")
    public void setValueUsageContext(java.util.Optional<com.fhir.UsageContext> valueUsageContext) {
      this.valueUsageContext = valueUsageContext;
      this.valueUsageContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueTime")
    public void setValueTime(java.util.Optional<java.lang.String> valueTime) {
      this.valueTime = valueTime;
      this.valueTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueRelatedArtifact")
    public void setValueRelatedArtifact(java.util.Optional<com.fhir.RelatedArtifact> valueRelatedArtifact) {
      this.valueRelatedArtifact = valueRelatedArtifact;
      this.valueRelatedArtifactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueDecimal")
    public void setValueDecimal(java.util.Optional<java.lang.Double> valueDecimal) {
      this.valueDecimal = valueDecimal;
      this.valueDecimalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueContactDetail")
    public void setValueContactDetail(java.util.Optional<com.fhir.ContactDetail> valueContactDetail) {
      this.valueContactDetail = valueContactDetail;
      this.valueContactDetailIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueReference")
    public void setValueReference(java.util.Optional<com.fhir.Reference> valueReference) {
      this.valueReference = valueReference;
      this.valueReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueQuantity")
    public void setValueQuantity(java.util.Optional<com.fhir.Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueDosage")
    public void setValueDosage(java.util.Optional<com.fhir.Dosage> valueDosage) {
      this.valueDosage = valueDosage;
      this.valueDosageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueCoding")
    public void setValueCoding(java.util.Optional<com.fhir.Coding> valueCoding) {
      this.valueCoding = valueCoding;
      this.valueCodingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueId")
    public void setValueId(java.util.Optional<java.lang.String> valueId) {
      this.valueId = valueId;
      this.valueIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueUnsignedInt")
    public void setValueUnsignedInt(java.util.Optional<java.lang.Double> valueUnsignedInt) {
      this.valueUnsignedInt = valueUnsignedInt;
      this.valueUnsignedIntIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valuePositiveInt")
    public void setValuePositiveInt(java.util.Optional<java.lang.Double> valuePositiveInt) {
      this.valuePositiveInt = valuePositiveInt;
      this.valuePositiveIntIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueContactPoint")
    public void setValueContactPoint(java.util.Optional<com.fhir.ContactPoint> valueContactPoint) {
      this.valueContactPoint = valueContactPoint;
      this.valueContactPointIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueRatio")
    public void setValueRatio(java.util.Optional<com.fhir.Ratio> valueRatio) {
      this.valueRatio = valueRatio;
      this.valueRatioIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueDateTime")
    public void setValueDateTime(java.util.Optional<java.lang.String> valueDateTime) {
      this.valueDateTime = valueDateTime;
      this.valueDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueCode")
    public void setValueCode(java.util.Optional<java.lang.String> valueCode) {
      this.valueCode = valueCode;
      this.valueCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueRange")
    public void setValueRange(java.util.Optional<com.fhir.Range> valueRange) {
      this.valueRange = valueRange;
      this.valueRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueContributor")
    public void setValueContributor(java.util.Optional<com.fhir.Contributor> valueContributor) {
      this.valueContributor = valueContributor;
      this.valueContributorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
    public void setValueBoolean(java.util.Optional<java.lang.Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueMarkdown")
    public void setValueMarkdown(java.util.Optional<java.lang.String> valueMarkdown) {
      this.valueMarkdown = valueMarkdown;
      this.valueMarkdownIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valuePeriod")
    public void setValuePeriod(java.util.Optional<com.fhir.Period> valuePeriod) {
      this.valuePeriod = valuePeriod;
      this.valuePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueCanonical")
    public void setValueCanonical(java.util.Optional<java.lang.String> valueCanonical) {
      this.valueCanonical = valueCanonical;
      this.valueCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueBase64Binary")
    public void setValueBase64Binary(java.util.Optional<java.lang.String> valueBase64Binary) {
      this.valueBase64Binary = valueBase64Binary;
      this.valueBase64BinaryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueAge")
    public void setValueAge(java.util.Optional<com.fhir.Age> valueAge) {
      this.valueAge = valueAge;
      this.valueAgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueAddress")
    public void setValueAddress(java.util.Optional<com.fhir.Address> valueAddress) {
      this.valueAddress = valueAddress;
      this.valueAddressIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> valueCodeableConcept) {
      this.valueCodeableConcept = valueCodeableConcept;
      this.valueCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueMoney")
    public void setValueMoney(java.util.Optional<com.fhir.Money> valueMoney) {
      this.valueMoney = valueMoney;
      this.valueMoneyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueSampledData")
    public void setValueSampledData(java.util.Optional<com.fhir.SampledData> valueSampledData) {
      this.valueSampledData = valueSampledData;
      this.valueSampledDataIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueInstant")
    public void setValueInstant(java.util.Optional<java.lang.String> valueInstant) {
      this.valueInstant = valueInstant;
      this.valueInstantIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueParameterDefinition")
    public void setValueParameterDefinition(java.util.Optional<com.fhir.ParameterDefinition> valueParameterDefinition) {
      this.valueParameterDefinition = valueParameterDefinition;
      this.valueParameterDefinitionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueString")
    public void setValueString(java.util.Optional<java.lang.String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueDuration")
    public void setValueDuration(java.util.Optional<com.fhir.Duration> valueDuration) {
      this.valueDuration = valueDuration;
      this.valueDurationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueDistance")
    public void setValueDistance(java.util.Optional<com.fhir.Distance> valueDistance) {
      this.valueDistance = valueDistance;
      this.valueDistanceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueHumanName")
    public void setValueHumanName(java.util.Optional<com.fhir.HumanName> valueHumanName) {
      this.valueHumanName = valueHumanName;
      this.valueHumanNameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueUuid")
    public void setValueUuid(java.util.Optional<java.lang.String> valueUuid) {
      this.valueUuid = valueUuid;
      this.valueUuidIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueMeta")
    public void setValueMeta(java.util.Optional<com.fhir.Meta> valueMeta) {
      this.valueMeta = valueMeta;
      this.valueMetaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueUrl")
    public void setValueUrl(java.util.Optional<java.lang.String> valueUrl) {
      this.valueUrl = valueUrl;
      this.valueUrlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueInteger")
    public void setValueInteger(java.util.Optional<java.lang.Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueDataRequirement")
    public void setValueDataRequirement(java.util.Optional<com.fhir.DataRequirement> valueDataRequirement) {
      this.valueDataRequirement = valueDataRequirement;
      this.valueDataRequirementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueExpression")
    public void setValueExpression(java.util.Optional<com.fhir.Expression> valueExpression) {
      this.valueExpression = valueExpression;
      this.valueExpressionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Annotation> valueAnnotation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Count> valueCount() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TriggerDefinition> valueTriggerDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Signature> valueSignature() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Attachment> valueAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> valueIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueOid() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> valueTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.UsageContext> valueUsageContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.RelatedArtifact> valueRelatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> valueDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ContactDetail> valueContactDetail() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> valueReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Dosage> valueDosage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> valueCoding() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> valueUnsignedInt() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> valuePositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ContactPoint> valueContactPoint() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Ratio> valueRatio() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> valueRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Contributor> valueContributor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueMarkdown() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> valuePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueBase64Binary() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Age> valueAge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Address> valueAddress() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> valueCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> valueMoney() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SampledData> valueSampledData() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueInstant() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ParameterDefinition> valueParameterDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Duration> valueDuration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Distance> valueDistance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.HumanName> valueHumanName() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueUuid() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> valueMeta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueUrl() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DataRequirement> valueDataRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Expression> valueExpression() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExtension fromJson(Json json) {
    ImmutableExtension.Builder builder = ImmutableExtension.builder();
    if (json.valueAnnotationIsSet) {
      builder.valueAnnotation(json.valueAnnotation);
    }
    if (json.valueCountIsSet) {
      builder.valueCount(json.valueCount);
    }
    if (json.valueTriggerDefinitionIsSet) {
      builder.valueTriggerDefinition(json.valueTriggerDefinition);
    }
    if (json.valueSignatureIsSet) {
      builder.valueSignature(json.valueSignature);
    }
    if (json.valueDateIsSet) {
      builder.valueDate(json.valueDate);
    }
    if (json.valueAttachmentIsSet) {
      builder.valueAttachment(json.valueAttachment);
    }
    if (json.valueUriIsSet) {
      builder.valueUri(json.valueUri);
    }
    if (json.valueIdentifierIsSet) {
      builder.valueIdentifier(json.valueIdentifier);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.valueOidIsSet) {
      builder.valueOid(json.valueOid);
    }
    if (json.valueTimingIsSet) {
      builder.valueTiming(json.valueTiming);
    }
    if (json.valueUsageContextIsSet) {
      builder.valueUsageContext(json.valueUsageContext);
    }
    if (json.valueTimeIsSet) {
      builder.valueTime(json.valueTime);
    }
    if (json.valueRelatedArtifactIsSet) {
      builder.valueRelatedArtifact(json.valueRelatedArtifact);
    }
    if (json.valueDecimalIsSet) {
      builder.valueDecimal(json.valueDecimal);
    }
    if (json.valueContactDetailIsSet) {
      builder.valueContactDetail(json.valueContactDetail);
    }
    if (json.valueReferenceIsSet) {
      builder.valueReference(json.valueReference);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.valueDosageIsSet) {
      builder.valueDosage(json.valueDosage);
    }
    if (json.valueCodingIsSet) {
      builder.valueCoding(json.valueCoding);
    }
    if (json.valueIdIsSet) {
      builder.valueId(json.valueId);
    }
    if (json.valueUnsignedIntIsSet) {
      builder.valueUnsignedInt(json.valueUnsignedInt);
    }
    if (json.valuePositiveIntIsSet) {
      builder.valuePositiveInt(json.valuePositiveInt);
    }
    if (json.valueContactPointIsSet) {
      builder.valueContactPoint(json.valueContactPoint);
    }
    if (json.valueRatioIsSet) {
      builder.valueRatio(json.valueRatio);
    }
    if (json.valueDateTimeIsSet) {
      builder.valueDateTime(json.valueDateTime);
    }
    if (json.valueCodeIsSet) {
      builder.valueCode(json.valueCode);
    }
    if (json.valueRangeIsSet) {
      builder.valueRange(json.valueRange);
    }
    if (json.valueContributorIsSet) {
      builder.valueContributor(json.valueContributor);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valueMarkdownIsSet) {
      builder.valueMarkdown(json.valueMarkdown);
    }
    if (json.valuePeriodIsSet) {
      builder.valuePeriod(json.valuePeriod);
    }
    if (json.valueCanonicalIsSet) {
      builder.valueCanonical(json.valueCanonical);
    }
    if (json.valueBase64BinaryIsSet) {
      builder.valueBase64Binary(json.valueBase64Binary);
    }
    if (json.valueAgeIsSet) {
      builder.valueAge(json.valueAge);
    }
    if (json.valueAddressIsSet) {
      builder.valueAddress(json.valueAddress);
    }
    if (json.valueCodeableConceptIsSet) {
      builder.valueCodeableConcept(json.valueCodeableConcept);
    }
    if (json.valueMoneyIsSet) {
      builder.valueMoney(json.valueMoney);
    }
    if (json.valueSampledDataIsSet) {
      builder.valueSampledData(json.valueSampledData);
    }
    if (json.valueInstantIsSet) {
      builder.valueInstant(json.valueInstant);
    }
    if (json.valueParameterDefinitionIsSet) {
      builder.valueParameterDefinition(json.valueParameterDefinition);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueDurationIsSet) {
      builder.valueDuration(json.valueDuration);
    }
    if (json.valueDistanceIsSet) {
      builder.valueDistance(json.valueDistance);
    }
    if (json.valueHumanNameIsSet) {
      builder.valueHumanName(json.valueHumanName);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueUuidIsSet) {
      builder.valueUuid(json.valueUuid);
    }
    if (json.valueMetaIsSet) {
      builder.valueMeta(json.valueMeta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueUrlIsSet) {
      builder.valueUrl(json.valueUrl);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.valueDataRequirementIsSet) {
      builder.valueDataRequirement(json.valueDataRequirement);
    }
    if (json.valueExpressionIsSet) {
      builder.valueExpression(json.valueExpression);
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
        .valueAnnotation(instance.valueAnnotation())
        .valueCount(instance.valueCount())
        .valueTriggerDefinition(instance.valueTriggerDefinition())
        .valueSignature(instance.valueSignature())
        .valueDate(instance.valueDate())
        .valueAttachment(instance.valueAttachment())
        .valueUri(instance.valueUri())
        .valueIdentifier(instance.valueIdentifier())
        .url(instance.url())
        .valueOid(instance.valueOid())
        .valueTiming(instance.valueTiming())
        .valueUsageContext(instance.valueUsageContext())
        .valueTime(instance.valueTime())
        .valueRelatedArtifact(instance.valueRelatedArtifact())
        .valueDecimal(instance.valueDecimal())
        .valueContactDetail(instance.valueContactDetail())
        .valueReference(instance.valueReference())
        .valueQuantity(instance.valueQuantity())
        .valueDosage(instance.valueDosage())
        .valueCoding(instance.valueCoding())
        .valueId(instance.valueId())
        .valueUnsignedInt(instance.valueUnsignedInt())
        .valuePositiveInt(instance.valuePositiveInt())
        .valueContactPoint(instance.valueContactPoint())
        .valueRatio(instance.valueRatio())
        .valueDateTime(instance.valueDateTime())
        .valueCode(instance.valueCode())
        .valueRange(instance.valueRange())
        .valueContributor(instance.valueContributor())
        .valueBoolean(instance.valueBoolean())
        .valueMarkdown(instance.valueMarkdown())
        .valuePeriod(instance.valuePeriod())
        .valueCanonical(instance.valueCanonical())
        .valueBase64Binary(instance.valueBase64Binary())
        .valueAge(instance.valueAge())
        .valueAddress(instance.valueAddress())
        .valueCodeableConcept(instance.valueCodeableConcept())
        .valueMoney(instance.valueMoney())
        .valueSampledData(instance.valueSampledData())
        .valueInstant(instance.valueInstant())
        .valueParameterDefinition(instance.valueParameterDefinition())
        .valueString(instance.valueString())
        .valueDuration(instance.valueDuration())
        .valueDistance(instance.valueDistance())
        .valueHumanName(instance.valueHumanName())
        .id(instance.id())
        .valueUuid(instance.valueUuid())
        .valueMeta(instance.valueMeta())
        .extension(instance.extension())
        .valueUrl(instance.valueUrl())
        .valueInteger(instance.valueInteger())
        .valueDataRequirement(instance.valueDataRequirement())
        .valueExpression(instance.valueExpression())
        .build();
  }

  /**
   * Creates a builder for {@link Extension Extension}.
   * <pre>
   * ImmutableExtension.builder()
   *    .valueAnnotation(com.fhir.Annotation) // optional {@link Extension#valueAnnotation() valueAnnotation}
   *    .valueCount(com.fhir.Count) // optional {@link Extension#valueCount() valueCount}
   *    .valueTriggerDefinition(com.fhir.TriggerDefinition) // optional {@link Extension#valueTriggerDefinition() valueTriggerDefinition}
   *    .valueSignature(com.fhir.Signature) // optional {@link Extension#valueSignature() valueSignature}
   *    .valueDate(String) // optional {@link Extension#valueDate() valueDate}
   *    .valueAttachment(com.fhir.Attachment) // optional {@link Extension#valueAttachment() valueAttachment}
   *    .valueUri(String) // optional {@link Extension#valueUri() valueUri}
   *    .valueIdentifier(com.fhir.Identifier) // optional {@link Extension#valueIdentifier() valueIdentifier}
   *    .url(com.fhir.uri) // optional {@link Extension#url() url}
   *    .valueOid(String) // optional {@link Extension#valueOid() valueOid}
   *    .valueTiming(com.fhir.Timing) // optional {@link Extension#valueTiming() valueTiming}
   *    .valueUsageContext(com.fhir.UsageContext) // optional {@link Extension#valueUsageContext() valueUsageContext}
   *    .valueTime(String) // optional {@link Extension#valueTime() valueTime}
   *    .valueRelatedArtifact(com.fhir.RelatedArtifact) // optional {@link Extension#valueRelatedArtifact() valueRelatedArtifact}
   *    .valueDecimal(Double) // optional {@link Extension#valueDecimal() valueDecimal}
   *    .valueContactDetail(com.fhir.ContactDetail) // optional {@link Extension#valueContactDetail() valueContactDetail}
   *    .valueReference(com.fhir.Reference) // optional {@link Extension#valueReference() valueReference}
   *    .valueQuantity(com.fhir.Quantity) // optional {@link Extension#valueQuantity() valueQuantity}
   *    .valueDosage(com.fhir.Dosage) // optional {@link Extension#valueDosage() valueDosage}
   *    .valueCoding(com.fhir.Coding) // optional {@link Extension#valueCoding() valueCoding}
   *    .valueId(String) // optional {@link Extension#valueId() valueId}
   *    .valueUnsignedInt(Double) // optional {@link Extension#valueUnsignedInt() valueUnsignedInt}
   *    .valuePositiveInt(Double) // optional {@link Extension#valuePositiveInt() valuePositiveInt}
   *    .valueContactPoint(com.fhir.ContactPoint) // optional {@link Extension#valueContactPoint() valueContactPoint}
   *    .valueRatio(com.fhir.Ratio) // optional {@link Extension#valueRatio() valueRatio}
   *    .valueDateTime(String) // optional {@link Extension#valueDateTime() valueDateTime}
   *    .valueCode(String) // optional {@link Extension#valueCode() valueCode}
   *    .valueRange(com.fhir.Range) // optional {@link Extension#valueRange() valueRange}
   *    .valueContributor(com.fhir.Contributor) // optional {@link Extension#valueContributor() valueContributor}
   *    .valueBoolean(Boolean) // optional {@link Extension#valueBoolean() valueBoolean}
   *    .valueMarkdown(String) // optional {@link Extension#valueMarkdown() valueMarkdown}
   *    .valuePeriod(com.fhir.Period) // optional {@link Extension#valuePeriod() valuePeriod}
   *    .valueCanonical(String) // optional {@link Extension#valueCanonical() valueCanonical}
   *    .valueBase64Binary(String) // optional {@link Extension#valueBase64Binary() valueBase64Binary}
   *    .valueAge(com.fhir.Age) // optional {@link Extension#valueAge() valueAge}
   *    .valueAddress(com.fhir.Address) // optional {@link Extension#valueAddress() valueAddress}
   *    .valueCodeableConcept(com.fhir.CodeableConcept) // optional {@link Extension#valueCodeableConcept() valueCodeableConcept}
   *    .valueMoney(com.fhir.Money) // optional {@link Extension#valueMoney() valueMoney}
   *    .valueSampledData(com.fhir.SampledData) // optional {@link Extension#valueSampledData() valueSampledData}
   *    .valueInstant(String) // optional {@link Extension#valueInstant() valueInstant}
   *    .valueParameterDefinition(com.fhir.ParameterDefinition) // optional {@link Extension#valueParameterDefinition() valueParameterDefinition}
   *    .valueString(String) // optional {@link Extension#valueString() valueString}
   *    .valueDuration(com.fhir.Duration) // optional {@link Extension#valueDuration() valueDuration}
   *    .valueDistance(com.fhir.Distance) // optional {@link Extension#valueDistance() valueDistance}
   *    .valueHumanName(com.fhir.HumanName) // optional {@link Extension#valueHumanName() valueHumanName}
   *    .id(String) // optional {@link Extension#id() id}
   *    .valueUuid(String) // optional {@link Extension#valueUuid() valueUuid}
   *    .valueMeta(com.fhir.Meta) // optional {@link Extension#valueMeta() valueMeta}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Extension#extension() extension}
   *    .valueUrl(String) // optional {@link Extension#valueUrl() valueUrl}
   *    .valueInteger(Double) // optional {@link Extension#valueInteger() valueInteger}
   *    .valueDataRequirement(com.fhir.DataRequirement) // optional {@link Extension#valueDataRequirement() valueDataRequirement}
   *    .valueExpression(com.fhir.Expression) // optional {@link Extension#valueExpression() valueExpression}
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
  @org.immutables.value.Generated(from = "Extension", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VALUE_ANNOTATION = 0x1L;
    private static final long OPT_BIT_VALUE_COUNT = 0x2L;
    private static final long OPT_BIT_VALUE_TRIGGER_DEFINITION = 0x4L;
    private static final long OPT_BIT_VALUE_SIGNATURE = 0x8L;
    private static final long OPT_BIT_VALUE_DATE = 0x10L;
    private static final long OPT_BIT_VALUE_ATTACHMENT = 0x20L;
    private static final long OPT_BIT_VALUE_URI = 0x40L;
    private static final long OPT_BIT_VALUE_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_URL = 0x100L;
    private static final long OPT_BIT_VALUE_OID = 0x200L;
    private static final long OPT_BIT_VALUE_TIMING = 0x400L;
    private static final long OPT_BIT_VALUE_USAGE_CONTEXT = 0x800L;
    private static final long OPT_BIT_VALUE_TIME = 0x1000L;
    private static final long OPT_BIT_VALUE_RELATED_ARTIFACT = 0x2000L;
    private static final long OPT_BIT_VALUE_DECIMAL = 0x4000L;
    private static final long OPT_BIT_VALUE_CONTACT_DETAIL = 0x8000L;
    private static final long OPT_BIT_VALUE_REFERENCE = 0x10000L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x20000L;
    private static final long OPT_BIT_VALUE_DOSAGE = 0x40000L;
    private static final long OPT_BIT_VALUE_CODING = 0x80000L;
    private static final long OPT_BIT_VALUE_ID = 0x100000L;
    private static final long OPT_BIT_VALUE_UNSIGNED_INT = 0x200000L;
    private static final long OPT_BIT_VALUE_POSITIVE_INT = 0x400000L;
    private static final long OPT_BIT_VALUE_CONTACT_POINT = 0x800000L;
    private static final long OPT_BIT_VALUE_RATIO = 0x1000000L;
    private static final long OPT_BIT_VALUE_DATE_TIME = 0x2000000L;
    private static final long OPT_BIT_VALUE_CODE = 0x4000000L;
    private static final long OPT_BIT_VALUE_RANGE = 0x8000000L;
    private static final long OPT_BIT_VALUE_CONTRIBUTOR = 0x10000000L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x20000000L;
    private static final long OPT_BIT_VALUE_MARKDOWN = 0x40000000L;
    private static final long OPT_BIT_VALUE_PERIOD = 0x80000000L;
    private static final long OPT_BIT_VALUE_CANONICAL = 0x100000000L;
    private static final long OPT_BIT_VALUE_BASE64_BINARY = 0x200000000L;
    private static final long OPT_BIT_VALUE_AGE = 0x400000000L;
    private static final long OPT_BIT_VALUE_ADDRESS = 0x800000000L;
    private static final long OPT_BIT_VALUE_CODEABLE_CONCEPT = 0x1000000000L;
    private static final long OPT_BIT_VALUE_MONEY = 0x2000000000L;
    private static final long OPT_BIT_VALUE_SAMPLED_DATA = 0x4000000000L;
    private static final long OPT_BIT_VALUE_INSTANT = 0x8000000000L;
    private static final long OPT_BIT_VALUE_PARAMETER_DEFINITION = 0x10000000000L;
    private static final long OPT_BIT_VALUE_STRING = 0x20000000000L;
    private static final long OPT_BIT_VALUE_DURATION = 0x40000000000L;
    private static final long OPT_BIT_VALUE_DISTANCE = 0x80000000000L;
    private static final long OPT_BIT_VALUE_HUMAN_NAME = 0x100000000000L;
    private static final long OPT_BIT_ID = 0x200000000000L;
    private static final long OPT_BIT_VALUE_UUID = 0x400000000000L;
    private static final long OPT_BIT_VALUE_META = 0x800000000000L;
    private static final long OPT_BIT_EXTENSION = 0x1000000000000L;
    private static final long OPT_BIT_VALUE_URL = 0x2000000000000L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x4000000000000L;
    private static final long OPT_BIT_VALUE_DATA_REQUIREMENT = 0x8000000000000L;
    private static final long OPT_BIT_VALUE_EXPRESSION = 0x10000000000000L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Annotation valueAnnotation;
    private @javax.annotation.Nullable com.fhir.Count valueCount;
    private @javax.annotation.Nullable com.fhir.TriggerDefinition valueTriggerDefinition;
    private @javax.annotation.Nullable com.fhir.Signature valueSignature;
    private @javax.annotation.Nullable java.lang.String valueDate;
    private @javax.annotation.Nullable com.fhir.Attachment valueAttachment;
    private @javax.annotation.Nullable java.lang.String valueUri;
    private @javax.annotation.Nullable com.fhir.Identifier valueIdentifier;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.lang.String valueOid;
    private @javax.annotation.Nullable com.fhir.Timing valueTiming;
    private @javax.annotation.Nullable com.fhir.UsageContext valueUsageContext;
    private @javax.annotation.Nullable java.lang.String valueTime;
    private @javax.annotation.Nullable com.fhir.RelatedArtifact valueRelatedArtifact;
    private @javax.annotation.Nullable java.lang.Double valueDecimal;
    private @javax.annotation.Nullable com.fhir.ContactDetail valueContactDetail;
    private @javax.annotation.Nullable com.fhir.Reference valueReference;
    private @javax.annotation.Nullable com.fhir.Quantity valueQuantity;
    private @javax.annotation.Nullable com.fhir.Dosage valueDosage;
    private @javax.annotation.Nullable com.fhir.Coding valueCoding;
    private @javax.annotation.Nullable java.lang.String valueId;
    private @javax.annotation.Nullable java.lang.Double valueUnsignedInt;
    private @javax.annotation.Nullable java.lang.Double valuePositiveInt;
    private @javax.annotation.Nullable com.fhir.ContactPoint valueContactPoint;
    private @javax.annotation.Nullable com.fhir.Ratio valueRatio;
    private @javax.annotation.Nullable java.lang.String valueDateTime;
    private @javax.annotation.Nullable java.lang.String valueCode;
    private @javax.annotation.Nullable com.fhir.Range valueRange;
    private @javax.annotation.Nullable com.fhir.Contributor valueContributor;
    private @javax.annotation.Nullable java.lang.Boolean valueBoolean;
    private @javax.annotation.Nullable java.lang.String valueMarkdown;
    private @javax.annotation.Nullable com.fhir.Period valuePeriod;
    private @javax.annotation.Nullable java.lang.String valueCanonical;
    private @javax.annotation.Nullable java.lang.String valueBase64Binary;
    private @javax.annotation.Nullable com.fhir.Age valueAge;
    private @javax.annotation.Nullable com.fhir.Address valueAddress;
    private @javax.annotation.Nullable com.fhir.CodeableConcept valueCodeableConcept;
    private @javax.annotation.Nullable com.fhir.Money valueMoney;
    private @javax.annotation.Nullable com.fhir.SampledData valueSampledData;
    private @javax.annotation.Nullable java.lang.String valueInstant;
    private @javax.annotation.Nullable com.fhir.ParameterDefinition valueParameterDefinition;
    private @javax.annotation.Nullable java.lang.String valueString;
    private @javax.annotation.Nullable com.fhir.Duration valueDuration;
    private @javax.annotation.Nullable com.fhir.Distance valueDistance;
    private @javax.annotation.Nullable com.fhir.HumanName valueHumanName;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String valueUuid;
    private @javax.annotation.Nullable com.fhir.Meta valueMeta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String valueUrl;
    private @javax.annotation.Nullable java.lang.Double valueInteger;
    private @javax.annotation.Nullable com.fhir.DataRequirement valueDataRequirement;
    private @javax.annotation.Nullable com.fhir.Expression valueExpression;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Extension#valueAnnotation() valueAnnotation} to valueAnnotation.
     * @param valueAnnotation The value for valueAnnotation
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueAnnotation(com.fhir.Annotation valueAnnotation) {
      checkNotIsSet(valueAnnotationIsSet(), "valueAnnotation");
      this.valueAnnotation = java.util.Objects.requireNonNull(valueAnnotation, "valueAnnotation");
      optBits |= OPT_BIT_VALUE_ANNOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueAnnotation() valueAnnotation} to valueAnnotation.
     * @param valueAnnotation The value for valueAnnotation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueAnnotation")
    public final Builder valueAnnotation(java.util.Optional<? extends com.fhir.Annotation> valueAnnotation) {
      checkNotIsSet(valueAnnotationIsSet(), "valueAnnotation");
      this.valueAnnotation = valueAnnotation.orElse(null);
      optBits |= OPT_BIT_VALUE_ANNOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueCount() valueCount} to valueCount.
     * @param valueCount The value for valueCount
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCount(com.fhir.Count valueCount) {
      checkNotIsSet(valueCountIsSet(), "valueCount");
      this.valueCount = java.util.Objects.requireNonNull(valueCount, "valueCount");
      optBits |= OPT_BIT_VALUE_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueCount() valueCount} to valueCount.
     * @param valueCount The value for valueCount
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueCount")
    public final Builder valueCount(java.util.Optional<? extends com.fhir.Count> valueCount) {
      checkNotIsSet(valueCountIsSet(), "valueCount");
      this.valueCount = valueCount.orElse(null);
      optBits |= OPT_BIT_VALUE_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueTriggerDefinition() valueTriggerDefinition} to valueTriggerDefinition.
     * @param valueTriggerDefinition The value for valueTriggerDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueTriggerDefinition(com.fhir.TriggerDefinition valueTriggerDefinition) {
      checkNotIsSet(valueTriggerDefinitionIsSet(), "valueTriggerDefinition");
      this.valueTriggerDefinition = java.util.Objects.requireNonNull(valueTriggerDefinition, "valueTriggerDefinition");
      optBits |= OPT_BIT_VALUE_TRIGGER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueTriggerDefinition() valueTriggerDefinition} to valueTriggerDefinition.
     * @param valueTriggerDefinition The value for valueTriggerDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueTriggerDefinition")
    public final Builder valueTriggerDefinition(java.util.Optional<? extends com.fhir.TriggerDefinition> valueTriggerDefinition) {
      checkNotIsSet(valueTriggerDefinitionIsSet(), "valueTriggerDefinition");
      this.valueTriggerDefinition = valueTriggerDefinition.orElse(null);
      optBits |= OPT_BIT_VALUE_TRIGGER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueSignature() valueSignature} to valueSignature.
     * @param valueSignature The value for valueSignature
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSignature(com.fhir.Signature valueSignature) {
      checkNotIsSet(valueSignatureIsSet(), "valueSignature");
      this.valueSignature = java.util.Objects.requireNonNull(valueSignature, "valueSignature");
      optBits |= OPT_BIT_VALUE_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueSignature() valueSignature} to valueSignature.
     * @param valueSignature The value for valueSignature
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueSignature")
    public final Builder valueSignature(java.util.Optional<? extends com.fhir.Signature> valueSignature) {
      checkNotIsSet(valueSignatureIsSet(), "valueSignature");
      this.valueSignature = valueSignature.orElse(null);
      optBits |= OPT_BIT_VALUE_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueDate() valueDate} to valueDate.
     * @param valueDate The value for valueDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDate(java.lang.String valueDate) {
      checkNotIsSet(valueDateIsSet(), "valueDate");
      this.valueDate = java.util.Objects.requireNonNull(valueDate, "valueDate");
      optBits |= OPT_BIT_VALUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueDate() valueDate} to valueDate.
     * @param valueDate The value for valueDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueDate")
    public final Builder valueDate(java.util.Optional<java.lang.String> valueDate) {
      checkNotIsSet(valueDateIsSet(), "valueDate");
      this.valueDate = valueDate.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueAttachment(com.fhir.Attachment valueAttachment) {
      checkNotIsSet(valueAttachmentIsSet(), "valueAttachment");
      this.valueAttachment = java.util.Objects.requireNonNull(valueAttachment, "valueAttachment");
      optBits |= OPT_BIT_VALUE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueAttachment() valueAttachment} to valueAttachment.
     * @param valueAttachment The value for valueAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueAttachment")
    public final Builder valueAttachment(java.util.Optional<? extends com.fhir.Attachment> valueAttachment) {
      checkNotIsSet(valueAttachmentIsSet(), "valueAttachment");
      this.valueAttachment = valueAttachment.orElse(null);
      optBits |= OPT_BIT_VALUE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueUri() valueUri} to valueUri.
     * @param valueUri The value for valueUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueUri(java.lang.String valueUri) {
      checkNotIsSet(valueUriIsSet(), "valueUri");
      this.valueUri = java.util.Objects.requireNonNull(valueUri, "valueUri");
      optBits |= OPT_BIT_VALUE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueUri() valueUri} to valueUri.
     * @param valueUri The value for valueUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueUri")
    public final Builder valueUri(java.util.Optional<java.lang.String> valueUri) {
      checkNotIsSet(valueUriIsSet(), "valueUri");
      this.valueUri = valueUri.orElse(null);
      optBits |= OPT_BIT_VALUE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueIdentifier() valueIdentifier} to valueIdentifier.
     * @param valueIdentifier The value for valueIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueIdentifier(com.fhir.Identifier valueIdentifier) {
      checkNotIsSet(valueIdentifierIsSet(), "valueIdentifier");
      this.valueIdentifier = java.util.Objects.requireNonNull(valueIdentifier, "valueIdentifier");
      optBits |= OPT_BIT_VALUE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueIdentifier() valueIdentifier} to valueIdentifier.
     * @param valueIdentifier The value for valueIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueIdentifier")
    public final Builder valueIdentifier(java.util.Optional<? extends com.fhir.Identifier> valueIdentifier) {
      checkNotIsSet(valueIdentifierIsSet(), "valueIdentifier");
      this.valueIdentifier = valueIdentifier.orElse(null);
      optBits |= OPT_BIT_VALUE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(com.fhir.uri url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = java.util.Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public final Builder url(java.util.Optional<? extends com.fhir.uri> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueOid() valueOid} to valueOid.
     * @param valueOid The value for valueOid
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueOid(java.lang.String valueOid) {
      checkNotIsSet(valueOidIsSet(), "valueOid");
      this.valueOid = java.util.Objects.requireNonNull(valueOid, "valueOid");
      optBits |= OPT_BIT_VALUE_OID;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueOid() valueOid} to valueOid.
     * @param valueOid The value for valueOid
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueOid")
    public final Builder valueOid(java.util.Optional<java.lang.String> valueOid) {
      checkNotIsSet(valueOidIsSet(), "valueOid");
      this.valueOid = valueOid.orElse(null);
      optBits |= OPT_BIT_VALUE_OID;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueTiming() valueTiming} to valueTiming.
     * @param valueTiming The value for valueTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueTiming(com.fhir.Timing valueTiming) {
      checkNotIsSet(valueTimingIsSet(), "valueTiming");
      this.valueTiming = java.util.Objects.requireNonNull(valueTiming, "valueTiming");
      optBits |= OPT_BIT_VALUE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueTiming() valueTiming} to valueTiming.
     * @param valueTiming The value for valueTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueTiming")
    public final Builder valueTiming(java.util.Optional<? extends com.fhir.Timing> valueTiming) {
      checkNotIsSet(valueTimingIsSet(), "valueTiming");
      this.valueTiming = valueTiming.orElse(null);
      optBits |= OPT_BIT_VALUE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueUsageContext() valueUsageContext} to valueUsageContext.
     * @param valueUsageContext The value for valueUsageContext
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueUsageContext(com.fhir.UsageContext valueUsageContext) {
      checkNotIsSet(valueUsageContextIsSet(), "valueUsageContext");
      this.valueUsageContext = java.util.Objects.requireNonNull(valueUsageContext, "valueUsageContext");
      optBits |= OPT_BIT_VALUE_USAGE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueUsageContext() valueUsageContext} to valueUsageContext.
     * @param valueUsageContext The value for valueUsageContext
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueUsageContext")
    public final Builder valueUsageContext(java.util.Optional<? extends com.fhir.UsageContext> valueUsageContext) {
      checkNotIsSet(valueUsageContextIsSet(), "valueUsageContext");
      this.valueUsageContext = valueUsageContext.orElse(null);
      optBits |= OPT_BIT_VALUE_USAGE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueTime(java.lang.String valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = java.util.Objects.requireNonNull(valueTime, "valueTime");
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueTime() valueTime} to valueTime.
     * @param valueTime The value for valueTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueTime")
    public final Builder valueTime(java.util.Optional<java.lang.String> valueTime) {
      checkNotIsSet(valueTimeIsSet(), "valueTime");
      this.valueTime = valueTime.orElse(null);
      optBits |= OPT_BIT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueRelatedArtifact() valueRelatedArtifact} to valueRelatedArtifact.
     * @param valueRelatedArtifact The value for valueRelatedArtifact
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRelatedArtifact(com.fhir.RelatedArtifact valueRelatedArtifact) {
      checkNotIsSet(valueRelatedArtifactIsSet(), "valueRelatedArtifact");
      this.valueRelatedArtifact = java.util.Objects.requireNonNull(valueRelatedArtifact, "valueRelatedArtifact");
      optBits |= OPT_BIT_VALUE_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueRelatedArtifact() valueRelatedArtifact} to valueRelatedArtifact.
     * @param valueRelatedArtifact The value for valueRelatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueRelatedArtifact")
    public final Builder valueRelatedArtifact(java.util.Optional<? extends com.fhir.RelatedArtifact> valueRelatedArtifact) {
      checkNotIsSet(valueRelatedArtifactIsSet(), "valueRelatedArtifact");
      this.valueRelatedArtifact = valueRelatedArtifact.orElse(null);
      optBits |= OPT_BIT_VALUE_RELATED_ARTIFACT;
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
    @com.fasterxml.jackson.annotation.JsonProperty("valueDecimal")
    public final Builder valueDecimal(java.util.Optional<java.lang.Double> valueDecimal) {
      checkNotIsSet(valueDecimalIsSet(), "valueDecimal");
      this.valueDecimal = valueDecimal.orElse(null);
      optBits |= OPT_BIT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueContactDetail() valueContactDetail} to valueContactDetail.
     * @param valueContactDetail The value for valueContactDetail
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueContactDetail(com.fhir.ContactDetail valueContactDetail) {
      checkNotIsSet(valueContactDetailIsSet(), "valueContactDetail");
      this.valueContactDetail = java.util.Objects.requireNonNull(valueContactDetail, "valueContactDetail");
      optBits |= OPT_BIT_VALUE_CONTACT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueContactDetail() valueContactDetail} to valueContactDetail.
     * @param valueContactDetail The value for valueContactDetail
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueContactDetail")
    public final Builder valueContactDetail(java.util.Optional<? extends com.fhir.ContactDetail> valueContactDetail) {
      checkNotIsSet(valueContactDetailIsSet(), "valueContactDetail");
      this.valueContactDetail = valueContactDetail.orElse(null);
      optBits |= OPT_BIT_VALUE_CONTACT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueReference(com.fhir.Reference valueReference) {
      checkNotIsSet(valueReferenceIsSet(), "valueReference");
      this.valueReference = java.util.Objects.requireNonNull(valueReference, "valueReference");
      optBits |= OPT_BIT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueReference() valueReference} to valueReference.
     * @param valueReference The value for valueReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueReference")
    public final Builder valueReference(java.util.Optional<? extends com.fhir.Reference> valueReference) {
      checkNotIsSet(valueReferenceIsSet(), "valueReference");
      this.valueReference = valueReference.orElse(null);
      optBits |= OPT_BIT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueQuantity(com.fhir.Quantity valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = java.util.Objects.requireNonNull(valueQuantity, "valueQuantity");
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueQuantity")
    public final Builder valueQuantity(java.util.Optional<? extends com.fhir.Quantity> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = valueQuantity.orElse(null);
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueDosage() valueDosage} to valueDosage.
     * @param valueDosage The value for valueDosage
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDosage(com.fhir.Dosage valueDosage) {
      checkNotIsSet(valueDosageIsSet(), "valueDosage");
      this.valueDosage = java.util.Objects.requireNonNull(valueDosage, "valueDosage");
      optBits |= OPT_BIT_VALUE_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueDosage() valueDosage} to valueDosage.
     * @param valueDosage The value for valueDosage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueDosage")
    public final Builder valueDosage(java.util.Optional<? extends com.fhir.Dosage> valueDosage) {
      checkNotIsSet(valueDosageIsSet(), "valueDosage");
      this.valueDosage = valueDosage.orElse(null);
      optBits |= OPT_BIT_VALUE_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCoding(com.fhir.Coding valueCoding) {
      checkNotIsSet(valueCodingIsSet(), "valueCoding");
      this.valueCoding = java.util.Objects.requireNonNull(valueCoding, "valueCoding");
      optBits |= OPT_BIT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueCoding() valueCoding} to valueCoding.
     * @param valueCoding The value for valueCoding
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueCoding")
    public final Builder valueCoding(java.util.Optional<? extends com.fhir.Coding> valueCoding) {
      checkNotIsSet(valueCodingIsSet(), "valueCoding");
      this.valueCoding = valueCoding.orElse(null);
      optBits |= OPT_BIT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueId() valueId} to valueId.
     * @param valueId The value for valueId
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueId(java.lang.String valueId) {
      checkNotIsSet(valueIdIsSet(), "valueId");
      this.valueId = java.util.Objects.requireNonNull(valueId, "valueId");
      optBits |= OPT_BIT_VALUE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueId() valueId} to valueId.
     * @param valueId The value for valueId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueId")
    public final Builder valueId(java.util.Optional<java.lang.String> valueId) {
      checkNotIsSet(valueIdIsSet(), "valueId");
      this.valueId = valueId.orElse(null);
      optBits |= OPT_BIT_VALUE_ID;
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
    @com.fasterxml.jackson.annotation.JsonProperty("valueUnsignedInt")
    public final Builder valueUnsignedInt(java.util.Optional<java.lang.Double> valueUnsignedInt) {
      checkNotIsSet(valueUnsignedIntIsSet(), "valueUnsignedInt");
      this.valueUnsignedInt = valueUnsignedInt.orElse(null);
      optBits |= OPT_BIT_VALUE_UNSIGNED_INT;
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
    @com.fasterxml.jackson.annotation.JsonProperty("valuePositiveInt")
    public final Builder valuePositiveInt(java.util.Optional<java.lang.Double> valuePositiveInt) {
      checkNotIsSet(valuePositiveIntIsSet(), "valuePositiveInt");
      this.valuePositiveInt = valuePositiveInt.orElse(null);
      optBits |= OPT_BIT_VALUE_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueContactPoint() valueContactPoint} to valueContactPoint.
     * @param valueContactPoint The value for valueContactPoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueContactPoint(com.fhir.ContactPoint valueContactPoint) {
      checkNotIsSet(valueContactPointIsSet(), "valueContactPoint");
      this.valueContactPoint = java.util.Objects.requireNonNull(valueContactPoint, "valueContactPoint");
      optBits |= OPT_BIT_VALUE_CONTACT_POINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueContactPoint() valueContactPoint} to valueContactPoint.
     * @param valueContactPoint The value for valueContactPoint
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueContactPoint")
    public final Builder valueContactPoint(java.util.Optional<? extends com.fhir.ContactPoint> valueContactPoint) {
      checkNotIsSet(valueContactPointIsSet(), "valueContactPoint");
      this.valueContactPoint = valueContactPoint.orElse(null);
      optBits |= OPT_BIT_VALUE_CONTACT_POINT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueRatio(com.fhir.Ratio valueRatio) {
      checkNotIsSet(valueRatioIsSet(), "valueRatio");
      this.valueRatio = java.util.Objects.requireNonNull(valueRatio, "valueRatio");
      optBits |= OPT_BIT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueRatio() valueRatio} to valueRatio.
     * @param valueRatio The value for valueRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueRatio")
    public final Builder valueRatio(java.util.Optional<? extends com.fhir.Ratio> valueRatio) {
      checkNotIsSet(valueRatioIsSet(), "valueRatio");
      this.valueRatio = valueRatio.orElse(null);
      optBits |= OPT_BIT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDateTime(java.lang.String valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = java.util.Objects.requireNonNull(valueDateTime, "valueDateTime");
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueDateTime() valueDateTime} to valueDateTime.
     * @param valueDateTime The value for valueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueDateTime")
    public final Builder valueDateTime(java.util.Optional<java.lang.String> valueDateTime) {
      checkNotIsSet(valueDateTimeIsSet(), "valueDateTime");
      this.valueDateTime = valueDateTime.orElse(null);
      optBits |= OPT_BIT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCode(java.lang.String valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = java.util.Objects.requireNonNull(valueCode, "valueCode");
      optBits |= OPT_BIT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueCode")
    public final Builder valueCode(java.util.Optional<java.lang.String> valueCode) {
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
    public final Builder valueRange(com.fhir.Range valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = java.util.Objects.requireNonNull(valueRange, "valueRange");
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueRange() valueRange} to valueRange.
     * @param valueRange The value for valueRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueRange")
    public final Builder valueRange(java.util.Optional<? extends com.fhir.Range> valueRange) {
      checkNotIsSet(valueRangeIsSet(), "valueRange");
      this.valueRange = valueRange.orElse(null);
      optBits |= OPT_BIT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueContributor() valueContributor} to valueContributor.
     * @param valueContributor The value for valueContributor
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueContributor(com.fhir.Contributor valueContributor) {
      checkNotIsSet(valueContributorIsSet(), "valueContributor");
      this.valueContributor = java.util.Objects.requireNonNull(valueContributor, "valueContributor");
      optBits |= OPT_BIT_VALUE_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueContributor() valueContributor} to valueContributor.
     * @param valueContributor The value for valueContributor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueContributor")
    public final Builder valueContributor(java.util.Optional<? extends com.fhir.Contributor> valueContributor) {
      checkNotIsSet(valueContributorIsSet(), "valueContributor");
      this.valueContributor = valueContributor.orElse(null);
      optBits |= OPT_BIT_VALUE_CONTRIBUTOR;
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
    @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
    public final Builder valueBoolean(java.util.Optional<java.lang.Boolean> valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean.orElse(null);
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueMarkdown() valueMarkdown} to valueMarkdown.
     * @param valueMarkdown The value for valueMarkdown
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueMarkdown(java.lang.String valueMarkdown) {
      checkNotIsSet(valueMarkdownIsSet(), "valueMarkdown");
      this.valueMarkdown = java.util.Objects.requireNonNull(valueMarkdown, "valueMarkdown");
      optBits |= OPT_BIT_VALUE_MARKDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueMarkdown() valueMarkdown} to valueMarkdown.
     * @param valueMarkdown The value for valueMarkdown
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueMarkdown")
    public final Builder valueMarkdown(java.util.Optional<java.lang.String> valueMarkdown) {
      checkNotIsSet(valueMarkdownIsSet(), "valueMarkdown");
      this.valueMarkdown = valueMarkdown.orElse(null);
      optBits |= OPT_BIT_VALUE_MARKDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder valuePeriod(com.fhir.Period valuePeriod) {
      checkNotIsSet(valuePeriodIsSet(), "valuePeriod");
      this.valuePeriod = java.util.Objects.requireNonNull(valuePeriod, "valuePeriod");
      optBits |= OPT_BIT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valuePeriod() valuePeriod} to valuePeriod.
     * @param valuePeriod The value for valuePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valuePeriod")
    public final Builder valuePeriod(java.util.Optional<? extends com.fhir.Period> valuePeriod) {
      checkNotIsSet(valuePeriodIsSet(), "valuePeriod");
      this.valuePeriod = valuePeriod.orElse(null);
      optBits |= OPT_BIT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueCanonical() valueCanonical} to valueCanonical.
     * @param valueCanonical The value for valueCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCanonical(java.lang.String valueCanonical) {
      checkNotIsSet(valueCanonicalIsSet(), "valueCanonical");
      this.valueCanonical = java.util.Objects.requireNonNull(valueCanonical, "valueCanonical");
      optBits |= OPT_BIT_VALUE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueCanonical() valueCanonical} to valueCanonical.
     * @param valueCanonical The value for valueCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueCanonical")
    public final Builder valueCanonical(java.util.Optional<java.lang.String> valueCanonical) {
      checkNotIsSet(valueCanonicalIsSet(), "valueCanonical");
      this.valueCanonical = valueCanonical.orElse(null);
      optBits |= OPT_BIT_VALUE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
     * @param valueBase64Binary The value for valueBase64Binary
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueBase64Binary(java.lang.String valueBase64Binary) {
      checkNotIsSet(valueBase64BinaryIsSet(), "valueBase64Binary");
      this.valueBase64Binary = java.util.Objects.requireNonNull(valueBase64Binary, "valueBase64Binary");
      optBits |= OPT_BIT_VALUE_BASE64_BINARY;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueBase64Binary() valueBase64Binary} to valueBase64Binary.
     * @param valueBase64Binary The value for valueBase64Binary
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueBase64Binary")
    public final Builder valueBase64Binary(java.util.Optional<java.lang.String> valueBase64Binary) {
      checkNotIsSet(valueBase64BinaryIsSet(), "valueBase64Binary");
      this.valueBase64Binary = valueBase64Binary.orElse(null);
      optBits |= OPT_BIT_VALUE_BASE64_BINARY;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueAge() valueAge} to valueAge.
     * @param valueAge The value for valueAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueAge(com.fhir.Age valueAge) {
      checkNotIsSet(valueAgeIsSet(), "valueAge");
      this.valueAge = java.util.Objects.requireNonNull(valueAge, "valueAge");
      optBits |= OPT_BIT_VALUE_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueAge() valueAge} to valueAge.
     * @param valueAge The value for valueAge
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueAge")
    public final Builder valueAge(java.util.Optional<? extends com.fhir.Age> valueAge) {
      checkNotIsSet(valueAgeIsSet(), "valueAge");
      this.valueAge = valueAge.orElse(null);
      optBits |= OPT_BIT_VALUE_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueAddress() valueAddress} to valueAddress.
     * @param valueAddress The value for valueAddress
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueAddress(com.fhir.Address valueAddress) {
      checkNotIsSet(valueAddressIsSet(), "valueAddress");
      this.valueAddress = java.util.Objects.requireNonNull(valueAddress, "valueAddress");
      optBits |= OPT_BIT_VALUE_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueAddress() valueAddress} to valueAddress.
     * @param valueAddress The value for valueAddress
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueAddress")
    public final Builder valueAddress(java.util.Optional<? extends com.fhir.Address> valueAddress) {
      checkNotIsSet(valueAddressIsSet(), "valueAddress");
      this.valueAddress = valueAddress.orElse(null);
      optBits |= OPT_BIT_VALUE_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCodeableConcept(com.fhir.CodeableConcept valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = java.util.Objects.requireNonNull(valueCodeableConcept, "valueCodeableConcept");
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueCodeableConcept() valueCodeableConcept} to valueCodeableConcept.
     * @param valueCodeableConcept The value for valueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueCodeableConcept")
    public final Builder valueCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> valueCodeableConcept) {
      checkNotIsSet(valueCodeableConceptIsSet(), "valueCodeableConcept");
      this.valueCodeableConcept = valueCodeableConcept.orElse(null);
      optBits |= OPT_BIT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueMoney() valueMoney} to valueMoney.
     * @param valueMoney The value for valueMoney
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueMoney(com.fhir.Money valueMoney) {
      checkNotIsSet(valueMoneyIsSet(), "valueMoney");
      this.valueMoney = java.util.Objects.requireNonNull(valueMoney, "valueMoney");
      optBits |= OPT_BIT_VALUE_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueMoney() valueMoney} to valueMoney.
     * @param valueMoney The value for valueMoney
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueMoney")
    public final Builder valueMoney(java.util.Optional<? extends com.fhir.Money> valueMoney) {
      checkNotIsSet(valueMoneyIsSet(), "valueMoney");
      this.valueMoney = valueMoney.orElse(null);
      optBits |= OPT_BIT_VALUE_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSampledData(com.fhir.SampledData valueSampledData) {
      checkNotIsSet(valueSampledDataIsSet(), "valueSampledData");
      this.valueSampledData = java.util.Objects.requireNonNull(valueSampledData, "valueSampledData");
      optBits |= OPT_BIT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueSampledData() valueSampledData} to valueSampledData.
     * @param valueSampledData The value for valueSampledData
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueSampledData")
    public final Builder valueSampledData(java.util.Optional<? extends com.fhir.SampledData> valueSampledData) {
      checkNotIsSet(valueSampledDataIsSet(), "valueSampledData");
      this.valueSampledData = valueSampledData.orElse(null);
      optBits |= OPT_BIT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueInstant() valueInstant} to valueInstant.
     * @param valueInstant The value for valueInstant
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueInstant(java.lang.String valueInstant) {
      checkNotIsSet(valueInstantIsSet(), "valueInstant");
      this.valueInstant = java.util.Objects.requireNonNull(valueInstant, "valueInstant");
      optBits |= OPT_BIT_VALUE_INSTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueInstant() valueInstant} to valueInstant.
     * @param valueInstant The value for valueInstant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueInstant")
    public final Builder valueInstant(java.util.Optional<java.lang.String> valueInstant) {
      checkNotIsSet(valueInstantIsSet(), "valueInstant");
      this.valueInstant = valueInstant.orElse(null);
      optBits |= OPT_BIT_VALUE_INSTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueParameterDefinition() valueParameterDefinition} to valueParameterDefinition.
     * @param valueParameterDefinition The value for valueParameterDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueParameterDefinition(com.fhir.ParameterDefinition valueParameterDefinition) {
      checkNotIsSet(valueParameterDefinitionIsSet(), "valueParameterDefinition");
      this.valueParameterDefinition = java.util.Objects.requireNonNull(valueParameterDefinition, "valueParameterDefinition");
      optBits |= OPT_BIT_VALUE_PARAMETER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueParameterDefinition() valueParameterDefinition} to valueParameterDefinition.
     * @param valueParameterDefinition The value for valueParameterDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueParameterDefinition")
    public final Builder valueParameterDefinition(java.util.Optional<? extends com.fhir.ParameterDefinition> valueParameterDefinition) {
      checkNotIsSet(valueParameterDefinitionIsSet(), "valueParameterDefinition");
      this.valueParameterDefinition = valueParameterDefinition.orElse(null);
      optBits |= OPT_BIT_VALUE_PARAMETER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(java.lang.String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = java.util.Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueString")
    public final Builder valueString(java.util.Optional<java.lang.String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueDuration() valueDuration} to valueDuration.
     * @param valueDuration The value for valueDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDuration(com.fhir.Duration valueDuration) {
      checkNotIsSet(valueDurationIsSet(), "valueDuration");
      this.valueDuration = java.util.Objects.requireNonNull(valueDuration, "valueDuration");
      optBits |= OPT_BIT_VALUE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueDuration() valueDuration} to valueDuration.
     * @param valueDuration The value for valueDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueDuration")
    public final Builder valueDuration(java.util.Optional<? extends com.fhir.Duration> valueDuration) {
      checkNotIsSet(valueDurationIsSet(), "valueDuration");
      this.valueDuration = valueDuration.orElse(null);
      optBits |= OPT_BIT_VALUE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueDistance() valueDistance} to valueDistance.
     * @param valueDistance The value for valueDistance
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDistance(com.fhir.Distance valueDistance) {
      checkNotIsSet(valueDistanceIsSet(), "valueDistance");
      this.valueDistance = java.util.Objects.requireNonNull(valueDistance, "valueDistance");
      optBits |= OPT_BIT_VALUE_DISTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueDistance() valueDistance} to valueDistance.
     * @param valueDistance The value for valueDistance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueDistance")
    public final Builder valueDistance(java.util.Optional<? extends com.fhir.Distance> valueDistance) {
      checkNotIsSet(valueDistanceIsSet(), "valueDistance");
      this.valueDistance = valueDistance.orElse(null);
      optBits |= OPT_BIT_VALUE_DISTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueHumanName() valueHumanName} to valueHumanName.
     * @param valueHumanName The value for valueHumanName
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueHumanName(com.fhir.HumanName valueHumanName) {
      checkNotIsSet(valueHumanNameIsSet(), "valueHumanName");
      this.valueHumanName = java.util.Objects.requireNonNull(valueHumanName, "valueHumanName");
      optBits |= OPT_BIT_VALUE_HUMAN_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueHumanName() valueHumanName} to valueHumanName.
     * @param valueHumanName The value for valueHumanName
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueHumanName")
    public final Builder valueHumanName(java.util.Optional<? extends com.fhir.HumanName> valueHumanName) {
      checkNotIsSet(valueHumanNameIsSet(), "valueHumanName");
      this.valueHumanName = valueHumanName.orElse(null);
      optBits |= OPT_BIT_VALUE_HUMAN_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#id() id} to id.
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
     * Initializes the optional value {@link Extension#id() id} to id.
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
     * Initializes the optional value {@link Extension#valueUuid() valueUuid} to valueUuid.
     * @param valueUuid The value for valueUuid
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueUuid(java.lang.String valueUuid) {
      checkNotIsSet(valueUuidIsSet(), "valueUuid");
      this.valueUuid = java.util.Objects.requireNonNull(valueUuid, "valueUuid");
      optBits |= OPT_BIT_VALUE_UUID;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueUuid() valueUuid} to valueUuid.
     * @param valueUuid The value for valueUuid
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueUuid")
    public final Builder valueUuid(java.util.Optional<java.lang.String> valueUuid) {
      checkNotIsSet(valueUuidIsSet(), "valueUuid");
      this.valueUuid = valueUuid.orElse(null);
      optBits |= OPT_BIT_VALUE_UUID;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueMeta() valueMeta} to valueMeta.
     * @param valueMeta The value for valueMeta
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueMeta(com.fhir.Meta valueMeta) {
      checkNotIsSet(valueMetaIsSet(), "valueMeta");
      this.valueMeta = java.util.Objects.requireNonNull(valueMeta, "valueMeta");
      optBits |= OPT_BIT_VALUE_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueMeta() valueMeta} to valueMeta.
     * @param valueMeta The value for valueMeta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueMeta")
    public final Builder valueMeta(java.util.Optional<? extends com.fhir.Meta> valueMeta) {
      checkNotIsSet(valueMetaIsSet(), "valueMeta");
      this.valueMeta = valueMeta.orElse(null);
      optBits |= OPT_BIT_VALUE_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#extension() extension} to extension.
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
     * Initializes the optional value {@link Extension#extension() extension} to extension.
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
     * Initializes the optional value {@link Extension#valueUrl() valueUrl} to valueUrl.
     * @param valueUrl The value for valueUrl
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueUrl(java.lang.String valueUrl) {
      checkNotIsSet(valueUrlIsSet(), "valueUrl");
      this.valueUrl = java.util.Objects.requireNonNull(valueUrl, "valueUrl");
      optBits |= OPT_BIT_VALUE_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueUrl() valueUrl} to valueUrl.
     * @param valueUrl The value for valueUrl
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueUrl")
    public final Builder valueUrl(java.util.Optional<java.lang.String> valueUrl) {
      checkNotIsSet(valueUrlIsSet(), "valueUrl");
      this.valueUrl = valueUrl.orElse(null);
      optBits |= OPT_BIT_VALUE_URL;
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
    @com.fasterxml.jackson.annotation.JsonProperty("valueInteger")
    public final Builder valueInteger(java.util.Optional<java.lang.Double> valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger.orElse(null);
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueDataRequirement() valueDataRequirement} to valueDataRequirement.
     * @param valueDataRequirement The value for valueDataRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDataRequirement(com.fhir.DataRequirement valueDataRequirement) {
      checkNotIsSet(valueDataRequirementIsSet(), "valueDataRequirement");
      this.valueDataRequirement = java.util.Objects.requireNonNull(valueDataRequirement, "valueDataRequirement");
      optBits |= OPT_BIT_VALUE_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueDataRequirement() valueDataRequirement} to valueDataRequirement.
     * @param valueDataRequirement The value for valueDataRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueDataRequirement")
    public final Builder valueDataRequirement(java.util.Optional<? extends com.fhir.DataRequirement> valueDataRequirement) {
      checkNotIsSet(valueDataRequirementIsSet(), "valueDataRequirement");
      this.valueDataRequirement = valueDataRequirement.orElse(null);
      optBits |= OPT_BIT_VALUE_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueExpression() valueExpression} to valueExpression.
     * @param valueExpression The value for valueExpression
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueExpression(com.fhir.Expression valueExpression) {
      checkNotIsSet(valueExpressionIsSet(), "valueExpression");
      this.valueExpression = java.util.Objects.requireNonNull(valueExpression, "valueExpression");
      optBits |= OPT_BIT_VALUE_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Extension#valueExpression() valueExpression} to valueExpression.
     * @param valueExpression The value for valueExpression
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueExpression")
    public final Builder valueExpression(java.util.Optional<? extends com.fhir.Expression> valueExpression) {
      checkNotIsSet(valueExpressionIsSet(), "valueExpression");
      this.valueExpression = valueExpression.orElse(null);
      optBits |= OPT_BIT_VALUE_EXPRESSION;
      return this;
    }

    /**
     * Builds a new {@link Extension Extension}.
     * @return An immutable instance of Extension
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Extension build() {
      return new ImmutableExtension(
          valueAnnotation,
          valueCount,
          valueTriggerDefinition,
          valueSignature,
          valueDate,
          valueAttachment,
          valueUri,
          valueIdentifier,
          url,
          valueOid,
          valueTiming,
          valueUsageContext,
          valueTime,
          valueRelatedArtifact,
          valueDecimal,
          valueContactDetail,
          valueReference,
          valueQuantity,
          valueDosage,
          valueCoding,
          valueId,
          valueUnsignedInt,
          valuePositiveInt,
          valueContactPoint,
          valueRatio,
          valueDateTime,
          valueCode,
          valueRange,
          valueContributor,
          valueBoolean,
          valueMarkdown,
          valuePeriod,
          valueCanonical,
          valueBase64Binary,
          valueAge,
          valueAddress,
          valueCodeableConcept,
          valueMoney,
          valueSampledData,
          valueInstant,
          valueParameterDefinition,
          valueString,
          valueDuration,
          valueDistance,
          valueHumanName,
          id,
          valueUuid,
          valueMeta,
          extension,
          valueUrl,
          valueInteger,
          valueDataRequirement,
          valueExpression);
    }

    private boolean valueAnnotationIsSet() {
      return (optBits & OPT_BIT_VALUE_ANNOTATION) != 0;
    }

    private boolean valueCountIsSet() {
      return (optBits & OPT_BIT_VALUE_COUNT) != 0;
    }

    private boolean valueTriggerDefinitionIsSet() {
      return (optBits & OPT_BIT_VALUE_TRIGGER_DEFINITION) != 0;
    }

    private boolean valueSignatureIsSet() {
      return (optBits & OPT_BIT_VALUE_SIGNATURE) != 0;
    }

    private boolean valueDateIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE) != 0;
    }

    private boolean valueAttachmentIsSet() {
      return (optBits & OPT_BIT_VALUE_ATTACHMENT) != 0;
    }

    private boolean valueUriIsSet() {
      return (optBits & OPT_BIT_VALUE_URI) != 0;
    }

    private boolean valueIdentifierIsSet() {
      return (optBits & OPT_BIT_VALUE_IDENTIFIER) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean valueOidIsSet() {
      return (optBits & OPT_BIT_VALUE_OID) != 0;
    }

    private boolean valueTimingIsSet() {
      return (optBits & OPT_BIT_VALUE_TIMING) != 0;
    }

    private boolean valueUsageContextIsSet() {
      return (optBits & OPT_BIT_VALUE_USAGE_CONTEXT) != 0;
    }

    private boolean valueTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_TIME) != 0;
    }

    private boolean valueRelatedArtifactIsSet() {
      return (optBits & OPT_BIT_VALUE_RELATED_ARTIFACT) != 0;
    }

    private boolean valueDecimalIsSet() {
      return (optBits & OPT_BIT_VALUE_DECIMAL) != 0;
    }

    private boolean valueContactDetailIsSet() {
      return (optBits & OPT_BIT_VALUE_CONTACT_DETAIL) != 0;
    }

    private boolean valueReferenceIsSet() {
      return (optBits & OPT_BIT_VALUE_REFERENCE) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean valueDosageIsSet() {
      return (optBits & OPT_BIT_VALUE_DOSAGE) != 0;
    }

    private boolean valueCodingIsSet() {
      return (optBits & OPT_BIT_VALUE_CODING) != 0;
    }

    private boolean valueIdIsSet() {
      return (optBits & OPT_BIT_VALUE_ID) != 0;
    }

    private boolean valueUnsignedIntIsSet() {
      return (optBits & OPT_BIT_VALUE_UNSIGNED_INT) != 0;
    }

    private boolean valuePositiveIntIsSet() {
      return (optBits & OPT_BIT_VALUE_POSITIVE_INT) != 0;
    }

    private boolean valueContactPointIsSet() {
      return (optBits & OPT_BIT_VALUE_CONTACT_POINT) != 0;
    }

    private boolean valueRatioIsSet() {
      return (optBits & OPT_BIT_VALUE_RATIO) != 0;
    }

    private boolean valueDateTimeIsSet() {
      return (optBits & OPT_BIT_VALUE_DATE_TIME) != 0;
    }

    private boolean valueCodeIsSet() {
      return (optBits & OPT_BIT_VALUE_CODE) != 0;
    }

    private boolean valueRangeIsSet() {
      return (optBits & OPT_BIT_VALUE_RANGE) != 0;
    }

    private boolean valueContributorIsSet() {
      return (optBits & OPT_BIT_VALUE_CONTRIBUTOR) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valueMarkdownIsSet() {
      return (optBits & OPT_BIT_VALUE_MARKDOWN) != 0;
    }

    private boolean valuePeriodIsSet() {
      return (optBits & OPT_BIT_VALUE_PERIOD) != 0;
    }

    private boolean valueCanonicalIsSet() {
      return (optBits & OPT_BIT_VALUE_CANONICAL) != 0;
    }

    private boolean valueBase64BinaryIsSet() {
      return (optBits & OPT_BIT_VALUE_BASE64_BINARY) != 0;
    }

    private boolean valueAgeIsSet() {
      return (optBits & OPT_BIT_VALUE_AGE) != 0;
    }

    private boolean valueAddressIsSet() {
      return (optBits & OPT_BIT_VALUE_ADDRESS) != 0;
    }

    private boolean valueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private boolean valueMoneyIsSet() {
      return (optBits & OPT_BIT_VALUE_MONEY) != 0;
    }

    private boolean valueSampledDataIsSet() {
      return (optBits & OPT_BIT_VALUE_SAMPLED_DATA) != 0;
    }

    private boolean valueInstantIsSet() {
      return (optBits & OPT_BIT_VALUE_INSTANT) != 0;
    }

    private boolean valueParameterDefinitionIsSet() {
      return (optBits & OPT_BIT_VALUE_PARAMETER_DEFINITION) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueDurationIsSet() {
      return (optBits & OPT_BIT_VALUE_DURATION) != 0;
    }

    private boolean valueDistanceIsSet() {
      return (optBits & OPT_BIT_VALUE_DISTANCE) != 0;
    }

    private boolean valueHumanNameIsSet() {
      return (optBits & OPT_BIT_VALUE_HUMAN_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueUuidIsSet() {
      return (optBits & OPT_BIT_VALUE_UUID) != 0;
    }

    private boolean valueMetaIsSet() {
      return (optBits & OPT_BIT_VALUE_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueUrlIsSet() {
      return (optBits & OPT_BIT_VALUE_URL) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean valueDataRequirementIsSet() {
      return (optBits & OPT_BIT_VALUE_DATA_REQUIREMENT) != 0;
    }

    private boolean valueExpressionIsSet() {
      return (optBits & OPT_BIT_VALUE_EXPRESSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Extension is strict, attribute is already set: ".concat(name));
    }
  }
}
