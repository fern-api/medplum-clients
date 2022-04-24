//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link StructureMap_Source}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap_Source.builder()}.
 */
@org.immutables.value.Generated(from = "StructureMap_Source", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap_Source implements com.fhir.StructureMap_Source {
  private final @javax.annotation.Nullable java.lang.String defaultValueUrl;
  private final @javax.annotation.Nullable java.lang.String defaultValueMarkdown;
  private final @javax.annotation.Nullable java.lang.Double defaultValuePositiveInt;
  private final @javax.annotation.Nullable java.lang.String element;
  private final @javax.annotation.Nullable java.lang.String condition;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String defaultValueCanonical;
  private final @javax.annotation.Nullable com.fhir.Period defaultValuePeriod;
  private final @javax.annotation.Nullable com.fhir.UsageContext defaultValueUsageContext;
  private final @javax.annotation.Nullable java.lang.String defaultValueDate;
  private final @javax.annotation.Nullable com.fhir.Address defaultValueAddress;
  private final @javax.annotation.Nullable java.lang.Double defaultValueDecimal;
  private final @javax.annotation.Nullable com.fhir.Identifier defaultValueIdentifier;
  private final @javax.annotation.Nullable com.fhir.Structuremap_sourceListmode listMode;
  private final @javax.annotation.Nullable com.fhir.Distance defaultValueDistance;
  private final @javax.annotation.Nullable java.lang.String defaultValueDateTime;
  private final @javax.annotation.Nullable com.fhir.ContactPoint defaultValueContactPoint;
  private final @javax.annotation.Nullable com.fhir.Age defaultValueAge;
  private final @javax.annotation.Nullable com.fhir.Range defaultValueRange;
  private final @javax.annotation.Nullable com.fhir.Count defaultValueCount;
  private final @javax.annotation.Nullable com.fhir.DataRequirement defaultValueDataRequirement;
  private final @javax.annotation.Nullable java.lang.Integer min;
  private final @javax.annotation.Nullable com.fhir.ParameterDefinition defaultValueParameterDefinition;
  private final @javax.annotation.Nullable java.lang.String type;
  private final @javax.annotation.Nullable com.fhir.Duration defaultValueDuration;
  private final @javax.annotation.Nullable com.fhir.Attachment defaultValueAttachment;
  private final @javax.annotation.Nullable com.fhir.Quantity defaultValueQuantity;
  private final @javax.annotation.Nullable com.fhir.id variable;
  private final @javax.annotation.Nullable java.lang.Double defaultValueInteger;
  private final @javax.annotation.Nullable java.lang.String defaultValueUri;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept defaultValueCodeableConcept;
  private final @javax.annotation.Nullable java.lang.String logMessage;
  private final @javax.annotation.Nullable com.fhir.Coding defaultValueCoding;
  private final @javax.annotation.Nullable com.fhir.HumanName defaultValueHumanName;
  private final @javax.annotation.Nullable java.lang.String max;
  private final @javax.annotation.Nullable java.lang.String defaultValueInstant;
  private final @javax.annotation.Nullable com.fhir.RelatedArtifact defaultValueRelatedArtifact;
  private final @javax.annotation.Nullable java.lang.String defaultValueId;
  private final @javax.annotation.Nullable com.fhir.TriggerDefinition defaultValueTriggerDefinition;
  private final @javax.annotation.Nullable com.fhir.Contributor defaultValueContributor;
  private final @javax.annotation.Nullable com.fhir.Dosage defaultValueDosage;
  private final @javax.annotation.Nullable com.fhir.Meta defaultValueMeta;
  private final @javax.annotation.Nullable com.fhir.Ratio defaultValueRatio;
  private final @javax.annotation.Nullable com.fhir.SampledData defaultValueSampledData;
  private final @javax.annotation.Nullable java.lang.String defaultValueString;
  private final @javax.annotation.Nullable com.fhir.id context;
  private final @javax.annotation.Nullable java.lang.Double defaultValueUnsignedInt;
  private final @javax.annotation.Nullable java.lang.Boolean defaultValueBoolean;
  private final @javax.annotation.Nullable com.fhir.Annotation defaultValueAnnotation;
  private final @javax.annotation.Nullable java.lang.String defaultValueBase64Binary;
  private final @javax.annotation.Nullable java.lang.String defaultValueUuid;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String check;
  private final @javax.annotation.Nullable java.lang.String defaultValueTime;
  private final @javax.annotation.Nullable java.lang.String defaultValueCode;
  private final @javax.annotation.Nullable com.fhir.ContactDetail defaultValueContactDetail;
  private final @javax.annotation.Nullable com.fhir.Expression defaultValueExpression;
  private final @javax.annotation.Nullable com.fhir.Money defaultValueMoney;
  private final @javax.annotation.Nullable com.fhir.Signature defaultValueSignature;
  private final @javax.annotation.Nullable com.fhir.Timing defaultValueTiming;
  private final @javax.annotation.Nullable com.fhir.Reference defaultValueReference;
  private final @javax.annotation.Nullable java.lang.String defaultValueOid;

  private ImmutableStructureMap_Source(
      @javax.annotation.Nullable java.lang.String defaultValueUrl,
      @javax.annotation.Nullable java.lang.String defaultValueMarkdown,
      @javax.annotation.Nullable java.lang.Double defaultValuePositiveInt,
      @javax.annotation.Nullable java.lang.String element,
      @javax.annotation.Nullable java.lang.String condition,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String defaultValueCanonical,
      @javax.annotation.Nullable com.fhir.Period defaultValuePeriod,
      @javax.annotation.Nullable com.fhir.UsageContext defaultValueUsageContext,
      @javax.annotation.Nullable java.lang.String defaultValueDate,
      @javax.annotation.Nullable com.fhir.Address defaultValueAddress,
      @javax.annotation.Nullable java.lang.Double defaultValueDecimal,
      @javax.annotation.Nullable com.fhir.Identifier defaultValueIdentifier,
      @javax.annotation.Nullable com.fhir.Structuremap_sourceListmode listMode,
      @javax.annotation.Nullable com.fhir.Distance defaultValueDistance,
      @javax.annotation.Nullable java.lang.String defaultValueDateTime,
      @javax.annotation.Nullable com.fhir.ContactPoint defaultValueContactPoint,
      @javax.annotation.Nullable com.fhir.Age defaultValueAge,
      @javax.annotation.Nullable com.fhir.Range defaultValueRange,
      @javax.annotation.Nullable com.fhir.Count defaultValueCount,
      @javax.annotation.Nullable com.fhir.DataRequirement defaultValueDataRequirement,
      @javax.annotation.Nullable java.lang.Integer min,
      @javax.annotation.Nullable com.fhir.ParameterDefinition defaultValueParameterDefinition,
      @javax.annotation.Nullable java.lang.String type,
      @javax.annotation.Nullable com.fhir.Duration defaultValueDuration,
      @javax.annotation.Nullable com.fhir.Attachment defaultValueAttachment,
      @javax.annotation.Nullable com.fhir.Quantity defaultValueQuantity,
      @javax.annotation.Nullable com.fhir.id variable,
      @javax.annotation.Nullable java.lang.Double defaultValueInteger,
      @javax.annotation.Nullable java.lang.String defaultValueUri,
      @javax.annotation.Nullable com.fhir.CodeableConcept defaultValueCodeableConcept,
      @javax.annotation.Nullable java.lang.String logMessage,
      @javax.annotation.Nullable com.fhir.Coding defaultValueCoding,
      @javax.annotation.Nullable com.fhir.HumanName defaultValueHumanName,
      @javax.annotation.Nullable java.lang.String max,
      @javax.annotation.Nullable java.lang.String defaultValueInstant,
      @javax.annotation.Nullable com.fhir.RelatedArtifact defaultValueRelatedArtifact,
      @javax.annotation.Nullable java.lang.String defaultValueId,
      @javax.annotation.Nullable com.fhir.TriggerDefinition defaultValueTriggerDefinition,
      @javax.annotation.Nullable com.fhir.Contributor defaultValueContributor,
      @javax.annotation.Nullable com.fhir.Dosage defaultValueDosage,
      @javax.annotation.Nullable com.fhir.Meta defaultValueMeta,
      @javax.annotation.Nullable com.fhir.Ratio defaultValueRatio,
      @javax.annotation.Nullable com.fhir.SampledData defaultValueSampledData,
      @javax.annotation.Nullable java.lang.String defaultValueString,
      @javax.annotation.Nullable com.fhir.id context,
      @javax.annotation.Nullable java.lang.Double defaultValueUnsignedInt,
      @javax.annotation.Nullable java.lang.Boolean defaultValueBoolean,
      @javax.annotation.Nullable com.fhir.Annotation defaultValueAnnotation,
      @javax.annotation.Nullable java.lang.String defaultValueBase64Binary,
      @javax.annotation.Nullable java.lang.String defaultValueUuid,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String check,
      @javax.annotation.Nullable java.lang.String defaultValueTime,
      @javax.annotation.Nullable java.lang.String defaultValueCode,
      @javax.annotation.Nullable com.fhir.ContactDetail defaultValueContactDetail,
      @javax.annotation.Nullable com.fhir.Expression defaultValueExpression,
      @javax.annotation.Nullable com.fhir.Money defaultValueMoney,
      @javax.annotation.Nullable com.fhir.Signature defaultValueSignature,
      @javax.annotation.Nullable com.fhir.Timing defaultValueTiming,
      @javax.annotation.Nullable com.fhir.Reference defaultValueReference,
      @javax.annotation.Nullable java.lang.String defaultValueOid) {
    this.defaultValueUrl = defaultValueUrl;
    this.defaultValueMarkdown = defaultValueMarkdown;
    this.defaultValuePositiveInt = defaultValuePositiveInt;
    this.element = element;
    this.condition = condition;
    this.id = id;
    this.defaultValueCanonical = defaultValueCanonical;
    this.defaultValuePeriod = defaultValuePeriod;
    this.defaultValueUsageContext = defaultValueUsageContext;
    this.defaultValueDate = defaultValueDate;
    this.defaultValueAddress = defaultValueAddress;
    this.defaultValueDecimal = defaultValueDecimal;
    this.defaultValueIdentifier = defaultValueIdentifier;
    this.listMode = listMode;
    this.defaultValueDistance = defaultValueDistance;
    this.defaultValueDateTime = defaultValueDateTime;
    this.defaultValueContactPoint = defaultValueContactPoint;
    this.defaultValueAge = defaultValueAge;
    this.defaultValueRange = defaultValueRange;
    this.defaultValueCount = defaultValueCount;
    this.defaultValueDataRequirement = defaultValueDataRequirement;
    this.min = min;
    this.defaultValueParameterDefinition = defaultValueParameterDefinition;
    this.type = type;
    this.defaultValueDuration = defaultValueDuration;
    this.defaultValueAttachment = defaultValueAttachment;
    this.defaultValueQuantity = defaultValueQuantity;
    this.variable = variable;
    this.defaultValueInteger = defaultValueInteger;
    this.defaultValueUri = defaultValueUri;
    this.defaultValueCodeableConcept = defaultValueCodeableConcept;
    this.logMessage = logMessage;
    this.defaultValueCoding = defaultValueCoding;
    this.defaultValueHumanName = defaultValueHumanName;
    this.max = max;
    this.defaultValueInstant = defaultValueInstant;
    this.defaultValueRelatedArtifact = defaultValueRelatedArtifact;
    this.defaultValueId = defaultValueId;
    this.defaultValueTriggerDefinition = defaultValueTriggerDefinition;
    this.defaultValueContributor = defaultValueContributor;
    this.defaultValueDosage = defaultValueDosage;
    this.defaultValueMeta = defaultValueMeta;
    this.defaultValueRatio = defaultValueRatio;
    this.defaultValueSampledData = defaultValueSampledData;
    this.defaultValueString = defaultValueString;
    this.context = context;
    this.defaultValueUnsignedInt = defaultValueUnsignedInt;
    this.defaultValueBoolean = defaultValueBoolean;
    this.defaultValueAnnotation = defaultValueAnnotation;
    this.defaultValueBase64Binary = defaultValueBase64Binary;
    this.defaultValueUuid = defaultValueUuid;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.check = check;
    this.defaultValueTime = defaultValueTime;
    this.defaultValueCode = defaultValueCode;
    this.defaultValueContactDetail = defaultValueContactDetail;
    this.defaultValueExpression = defaultValueExpression;
    this.defaultValueMoney = defaultValueMoney;
    this.defaultValueSignature = defaultValueSignature;
    this.defaultValueTiming = defaultValueTiming;
    this.defaultValueReference = defaultValueReference;
    this.defaultValueOid = defaultValueOid;
  }

  /**
   * @return The value of the {@code defaultValueUrl} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUrl")
  @Override
  public java.util.Optional<java.lang.String> defaultValueUrl() {
    return java.util.Optional.ofNullable(defaultValueUrl);
  }

  /**
   * @return The value of the {@code defaultValueMarkdown} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueMarkdown")
  @Override
  public java.util.Optional<java.lang.String> defaultValueMarkdown() {
    return java.util.Optional.ofNullable(defaultValueMarkdown);
  }

  /**
   * @return The value of the {@code defaultValuePositiveInt} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValuePositiveInt")
  @Override
  public java.util.Optional<java.lang.Double> defaultValuePositiveInt() {
    return java.util.Optional.ofNullable(defaultValuePositiveInt);
  }

  /**
   * @return The value of the {@code element} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("element")
  @Override
  public java.util.Optional<java.lang.String> element() {
    return java.util.Optional.ofNullable(element);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("condition")
  @Override
  public java.util.Optional<java.lang.String> condition() {
    return java.util.Optional.ofNullable(condition);
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
   * @return The value of the {@code defaultValueCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCanonical")
  @Override
  public java.util.Optional<java.lang.String> defaultValueCanonical() {
    return java.util.Optional.ofNullable(defaultValueCanonical);
  }

  /**
   * @return The value of the {@code defaultValuePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValuePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> defaultValuePeriod() {
    return java.util.Optional.ofNullable(defaultValuePeriod);
  }

  /**
   * @return The value of the {@code defaultValueUsageContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUsageContext")
  @Override
  public java.util.Optional<com.fhir.UsageContext> defaultValueUsageContext() {
    return java.util.Optional.ofNullable(defaultValueUsageContext);
  }

  /**
   * @return The value of the {@code defaultValueDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDate")
  @Override
  public java.util.Optional<java.lang.String> defaultValueDate() {
    return java.util.Optional.ofNullable(defaultValueDate);
  }

  /**
   * @return The value of the {@code defaultValueAddress} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueAddress")
  @Override
  public java.util.Optional<com.fhir.Address> defaultValueAddress() {
    return java.util.Optional.ofNullable(defaultValueAddress);
  }

  /**
   * @return The value of the {@code defaultValueDecimal} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDecimal")
  @Override
  public java.util.Optional<java.lang.Double> defaultValueDecimal() {
    return java.util.Optional.ofNullable(defaultValueDecimal);
  }

  /**
   * @return The value of the {@code defaultValueIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueIdentifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> defaultValueIdentifier() {
    return java.util.Optional.ofNullable(defaultValueIdentifier);
  }

  /**
   * @return The value of the {@code listMode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("listMode")
  @Override
  public java.util.Optional<com.fhir.Structuremap_sourceListmode> listMode() {
    return java.util.Optional.ofNullable(listMode);
  }

  /**
   * @return The value of the {@code defaultValueDistance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDistance")
  @Override
  public java.util.Optional<com.fhir.Distance> defaultValueDistance() {
    return java.util.Optional.ofNullable(defaultValueDistance);
  }

  /**
   * @return The value of the {@code defaultValueDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDateTime")
  @Override
  public java.util.Optional<java.lang.String> defaultValueDateTime() {
    return java.util.Optional.ofNullable(defaultValueDateTime);
  }

  /**
   * @return The value of the {@code defaultValueContactPoint} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueContactPoint")
  @Override
  public java.util.Optional<com.fhir.ContactPoint> defaultValueContactPoint() {
    return java.util.Optional.ofNullable(defaultValueContactPoint);
  }

  /**
   * @return The value of the {@code defaultValueAge} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueAge")
  @Override
  public java.util.Optional<com.fhir.Age> defaultValueAge() {
    return java.util.Optional.ofNullable(defaultValueAge);
  }

  /**
   * @return The value of the {@code defaultValueRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueRange")
  @Override
  public java.util.Optional<com.fhir.Range> defaultValueRange() {
    return java.util.Optional.ofNullable(defaultValueRange);
  }

  /**
   * @return The value of the {@code defaultValueCount} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCount")
  @Override
  public java.util.Optional<com.fhir.Count> defaultValueCount() {
    return java.util.Optional.ofNullable(defaultValueCount);
  }

  /**
   * @return The value of the {@code defaultValueDataRequirement} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDataRequirement")
  @Override
  public java.util.Optional<com.fhir.DataRequirement> defaultValueDataRequirement() {
    return java.util.Optional.ofNullable(defaultValueDataRequirement);
  }

  /**
   * @return The value of the {@code min} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("min")
  @Override
  public java.util.Optional<java.lang.Integer> min() {
    return java.util.Optional.ofNullable(min);
  }

  /**
   * @return The value of the {@code defaultValueParameterDefinition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueParameterDefinition")
  @Override
  public java.util.Optional<com.fhir.ParameterDefinition> defaultValueParameterDefinition() {
    return java.util.Optional.ofNullable(defaultValueParameterDefinition);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<java.lang.String> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code defaultValueDuration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDuration")
  @Override
  public java.util.Optional<com.fhir.Duration> defaultValueDuration() {
    return java.util.Optional.ofNullable(defaultValueDuration);
  }

  /**
   * @return The value of the {@code defaultValueAttachment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueAttachment")
  @Override
  public java.util.Optional<com.fhir.Attachment> defaultValueAttachment() {
    return java.util.Optional.ofNullable(defaultValueAttachment);
  }

  /**
   * @return The value of the {@code defaultValueQuantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueQuantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> defaultValueQuantity() {
    return java.util.Optional.ofNullable(defaultValueQuantity);
  }

  /**
   * @return The value of the {@code variable} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("variable")
  @Override
  public java.util.Optional<com.fhir.id> variable() {
    return java.util.Optional.ofNullable(variable);
  }

  /**
   * @return The value of the {@code defaultValueInteger} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueInteger")
  @Override
  public java.util.Optional<java.lang.Double> defaultValueInteger() {
    return java.util.Optional.ofNullable(defaultValueInteger);
  }

  /**
   * @return The value of the {@code defaultValueUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUri")
  @Override
  public java.util.Optional<java.lang.String> defaultValueUri() {
    return java.util.Optional.ofNullable(defaultValueUri);
  }

  /**
   * @return The value of the {@code defaultValueCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> defaultValueCodeableConcept() {
    return java.util.Optional.ofNullable(defaultValueCodeableConcept);
  }

  /**
   * @return The value of the {@code logMessage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("logMessage")
  @Override
  public java.util.Optional<java.lang.String> logMessage() {
    return java.util.Optional.ofNullable(logMessage);
  }

  /**
   * @return The value of the {@code defaultValueCoding} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCoding")
  @Override
  public java.util.Optional<com.fhir.Coding> defaultValueCoding() {
    return java.util.Optional.ofNullable(defaultValueCoding);
  }

  /**
   * @return The value of the {@code defaultValueHumanName} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueHumanName")
  @Override
  public java.util.Optional<com.fhir.HumanName> defaultValueHumanName() {
    return java.util.Optional.ofNullable(defaultValueHumanName);
  }

  /**
   * @return The value of the {@code max} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("max")
  @Override
  public java.util.Optional<java.lang.String> max() {
    return java.util.Optional.ofNullable(max);
  }

  /**
   * @return The value of the {@code defaultValueInstant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueInstant")
  @Override
  public java.util.Optional<java.lang.String> defaultValueInstant() {
    return java.util.Optional.ofNullable(defaultValueInstant);
  }

  /**
   * @return The value of the {@code defaultValueRelatedArtifact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueRelatedArtifact")
  @Override
  public java.util.Optional<com.fhir.RelatedArtifact> defaultValueRelatedArtifact() {
    return java.util.Optional.ofNullable(defaultValueRelatedArtifact);
  }

  /**
   * @return The value of the {@code defaultValueId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueId")
  @Override
  public java.util.Optional<java.lang.String> defaultValueId() {
    return java.util.Optional.ofNullable(defaultValueId);
  }

  /**
   * @return The value of the {@code defaultValueTriggerDefinition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueTriggerDefinition")
  @Override
  public java.util.Optional<com.fhir.TriggerDefinition> defaultValueTriggerDefinition() {
    return java.util.Optional.ofNullable(defaultValueTriggerDefinition);
  }

  /**
   * @return The value of the {@code defaultValueContributor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueContributor")
  @Override
  public java.util.Optional<com.fhir.Contributor> defaultValueContributor() {
    return java.util.Optional.ofNullable(defaultValueContributor);
  }

  /**
   * @return The value of the {@code defaultValueDosage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDosage")
  @Override
  public java.util.Optional<com.fhir.Dosage> defaultValueDosage() {
    return java.util.Optional.ofNullable(defaultValueDosage);
  }

  /**
   * @return The value of the {@code defaultValueMeta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueMeta")
  @Override
  public java.util.Optional<com.fhir.Meta> defaultValueMeta() {
    return java.util.Optional.ofNullable(defaultValueMeta);
  }

  /**
   * @return The value of the {@code defaultValueRatio} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueRatio")
  @Override
  public java.util.Optional<com.fhir.Ratio> defaultValueRatio() {
    return java.util.Optional.ofNullable(defaultValueRatio);
  }

  /**
   * @return The value of the {@code defaultValueSampledData} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueSampledData")
  @Override
  public java.util.Optional<com.fhir.SampledData> defaultValueSampledData() {
    return java.util.Optional.ofNullable(defaultValueSampledData);
  }

  /**
   * @return The value of the {@code defaultValueString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueString")
  @Override
  public java.util.Optional<java.lang.String> defaultValueString() {
    return java.util.Optional.ofNullable(defaultValueString);
  }

  /**
   * @return The value of the {@code context} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("context")
  @Override
  public java.util.Optional<com.fhir.id> context() {
    return java.util.Optional.ofNullable(context);
  }

  /**
   * @return The value of the {@code defaultValueUnsignedInt} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUnsignedInt")
  @Override
  public java.util.Optional<java.lang.Double> defaultValueUnsignedInt() {
    return java.util.Optional.ofNullable(defaultValueUnsignedInt);
  }

  /**
   * @return The value of the {@code defaultValueBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> defaultValueBoolean() {
    return java.util.Optional.ofNullable(defaultValueBoolean);
  }

  /**
   * @return The value of the {@code defaultValueAnnotation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueAnnotation")
  @Override
  public java.util.Optional<com.fhir.Annotation> defaultValueAnnotation() {
    return java.util.Optional.ofNullable(defaultValueAnnotation);
  }

  /**
   * @return The value of the {@code defaultValueBase64Binary} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueBase64Binary")
  @Override
  public java.util.Optional<java.lang.String> defaultValueBase64Binary() {
    return java.util.Optional.ofNullable(defaultValueBase64Binary);
  }

  /**
   * @return The value of the {@code defaultValueUuid} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUuid")
  @Override
  public java.util.Optional<java.lang.String> defaultValueUuid() {
    return java.util.Optional.ofNullable(defaultValueUuid);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code check} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("check")
  @Override
  public java.util.Optional<java.lang.String> check() {
    return java.util.Optional.ofNullable(check);
  }

  /**
   * @return The value of the {@code defaultValueTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueTime")
  @Override
  public java.util.Optional<java.lang.String> defaultValueTime() {
    return java.util.Optional.ofNullable(defaultValueTime);
  }

  /**
   * @return The value of the {@code defaultValueCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCode")
  @Override
  public java.util.Optional<java.lang.String> defaultValueCode() {
    return java.util.Optional.ofNullable(defaultValueCode);
  }

  /**
   * @return The value of the {@code defaultValueContactDetail} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueContactDetail")
  @Override
  public java.util.Optional<com.fhir.ContactDetail> defaultValueContactDetail() {
    return java.util.Optional.ofNullable(defaultValueContactDetail);
  }

  /**
   * @return The value of the {@code defaultValueExpression} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueExpression")
  @Override
  public java.util.Optional<com.fhir.Expression> defaultValueExpression() {
    return java.util.Optional.ofNullable(defaultValueExpression);
  }

  /**
   * @return The value of the {@code defaultValueMoney} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueMoney")
  @Override
  public java.util.Optional<com.fhir.Money> defaultValueMoney() {
    return java.util.Optional.ofNullable(defaultValueMoney);
  }

  /**
   * @return The value of the {@code defaultValueSignature} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueSignature")
  @Override
  public java.util.Optional<com.fhir.Signature> defaultValueSignature() {
    return java.util.Optional.ofNullable(defaultValueSignature);
  }

  /**
   * @return The value of the {@code defaultValueTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> defaultValueTiming() {
    return java.util.Optional.ofNullable(defaultValueTiming);
  }

  /**
   * @return The value of the {@code defaultValueReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueReference")
  @Override
  public java.util.Optional<com.fhir.Reference> defaultValueReference() {
    return java.util.Optional.ofNullable(defaultValueReference);
  }

  /**
   * @return The value of the {@code defaultValueOid} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultValueOid")
  @Override
  public java.util.Optional<java.lang.String> defaultValueOid() {
    return java.util.Optional.ofNullable(defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueUrl() defaultValueUrl} attribute.
   * @param value The value for defaultValueUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUrl(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueUrl");
    if (java.util.Objects.equals(this.defaultValueUrl, newValue)) return this;
    return new ImmutableStructureMap_Source(
        newValue,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueUrl() defaultValueUrl} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUrl(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueUrl, value)) return this;
    return new ImmutableStructureMap_Source(
        value,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueMarkdown() defaultValueMarkdown} attribute.
   * @param value The value for defaultValueMarkdown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueMarkdown(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueMarkdown");
    if (java.util.Objects.equals(this.defaultValueMarkdown, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        newValue,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueMarkdown() defaultValueMarkdown} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueMarkdown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueMarkdown(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueMarkdown, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        value,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValuePositiveInt() defaultValuePositiveInt} attribute.
   * @param value The value for defaultValuePositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValuePositiveInt(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.defaultValuePositiveInt, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        newValue,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValuePositiveInt() defaultValuePositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValuePositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValuePositiveInt(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValuePositiveInt, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        value,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#element() element} attribute.
   * @param value The value for element
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withElement(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "element");
    if (java.util.Objects.equals(this.element, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        newValue,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#element() element} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for element
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withElement(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.element, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        value,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withCondition(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "condition");
    if (java.util.Objects.equals(this.condition, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        newValue,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#condition() condition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withCondition(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.condition, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        value,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        newValue,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        value,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueCanonical() defaultValueCanonical} attribute.
   * @param value The value for defaultValueCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCanonical(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueCanonical");
    if (java.util.Objects.equals(this.defaultValueCanonical, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        newValue,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueCanonical() defaultValueCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCanonical(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueCanonical, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        value,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValuePeriod() defaultValuePeriod} attribute.
   * @param value The value for defaultValuePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValuePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "defaultValuePeriod");
    if (this.defaultValuePeriod == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        newValue,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValuePeriod() defaultValuePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValuePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValuePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.defaultValuePeriod == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        value,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueUsageContext() defaultValueUsageContext} attribute.
   * @param value The value for defaultValueUsageContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUsageContext(com.fhir.UsageContext value) {
    @javax.annotation.Nullable com.fhir.UsageContext newValue = java.util.Objects.requireNonNull(value, "defaultValueUsageContext");
    if (this.defaultValueUsageContext == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        newValue,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueUsageContext() defaultValueUsageContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueUsageContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueUsageContext(java.util.Optional<? extends com.fhir.UsageContext> optional) {
    @javax.annotation.Nullable com.fhir.UsageContext value = optional.orElse(null);
    if (this.defaultValueUsageContext == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        value,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDate() defaultValueDate} attribute.
   * @param value The value for defaultValueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDate(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueDate");
    if (java.util.Objects.equals(this.defaultValueDate, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        newValue,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDate() defaultValueDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDate(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueDate, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        value,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueAddress() defaultValueAddress} attribute.
   * @param value The value for defaultValueAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueAddress(com.fhir.Address value) {
    @javax.annotation.Nullable com.fhir.Address newValue = java.util.Objects.requireNonNull(value, "defaultValueAddress");
    if (this.defaultValueAddress == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        newValue,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueAddress() defaultValueAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueAddress(java.util.Optional<? extends com.fhir.Address> optional) {
    @javax.annotation.Nullable com.fhir.Address value = optional.orElse(null);
    if (this.defaultValueAddress == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        value,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDecimal() defaultValueDecimal} attribute.
   * @param value The value for defaultValueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDecimal(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.defaultValueDecimal, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        newValue,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDecimal() defaultValueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDecimal(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueDecimal, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        value,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueIdentifier() defaultValueIdentifier} attribute.
   * @param value The value for defaultValueIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "defaultValueIdentifier");
    if (this.defaultValueIdentifier == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        newValue,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueIdentifier() defaultValueIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.defaultValueIdentifier == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        value,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#listMode() listMode} attribute.
   * @param value The value for listMode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withListMode(com.fhir.Structuremap_sourceListmode value) {
    @javax.annotation.Nullable com.fhir.Structuremap_sourceListmode newValue = java.util.Objects.requireNonNull(value, "listMode");
    if (this.listMode == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        newValue,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#listMode() listMode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for listMode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withListMode(java.util.Optional<? extends com.fhir.Structuremap_sourceListmode> optional) {
    @javax.annotation.Nullable com.fhir.Structuremap_sourceListmode value = optional.orElse(null);
    if (this.listMode == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        value,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDistance() defaultValueDistance} attribute.
   * @param value The value for defaultValueDistance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDistance(com.fhir.Distance value) {
    @javax.annotation.Nullable com.fhir.Distance newValue = java.util.Objects.requireNonNull(value, "defaultValueDistance");
    if (this.defaultValueDistance == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        newValue,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDistance() defaultValueDistance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDistance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueDistance(java.util.Optional<? extends com.fhir.Distance> optional) {
    @javax.annotation.Nullable com.fhir.Distance value = optional.orElse(null);
    if (this.defaultValueDistance == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        value,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDateTime() defaultValueDateTime} attribute.
   * @param value The value for defaultValueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueDateTime");
    if (java.util.Objects.equals(this.defaultValueDateTime, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        newValue,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDateTime() defaultValueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueDateTime, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        value,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueContactPoint() defaultValueContactPoint} attribute.
   * @param value The value for defaultValueContactPoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueContactPoint(com.fhir.ContactPoint value) {
    @javax.annotation.Nullable com.fhir.ContactPoint newValue = java.util.Objects.requireNonNull(value, "defaultValueContactPoint");
    if (this.defaultValueContactPoint == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        newValue,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueContactPoint() defaultValueContactPoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueContactPoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueContactPoint(java.util.Optional<? extends com.fhir.ContactPoint> optional) {
    @javax.annotation.Nullable com.fhir.ContactPoint value = optional.orElse(null);
    if (this.defaultValueContactPoint == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        value,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueAge() defaultValueAge} attribute.
   * @param value The value for defaultValueAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueAge(com.fhir.Age value) {
    @javax.annotation.Nullable com.fhir.Age newValue = java.util.Objects.requireNonNull(value, "defaultValueAge");
    if (this.defaultValueAge == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        newValue,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueAge() defaultValueAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueAge(java.util.Optional<? extends com.fhir.Age> optional) {
    @javax.annotation.Nullable com.fhir.Age value = optional.orElse(null);
    if (this.defaultValueAge == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        value,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueRange() defaultValueRange} attribute.
   * @param value The value for defaultValueRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "defaultValueRange");
    if (this.defaultValueRange == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        newValue,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueRange() defaultValueRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.defaultValueRange == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        value,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueCount() defaultValueCount} attribute.
   * @param value The value for defaultValueCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCount(com.fhir.Count value) {
    @javax.annotation.Nullable com.fhir.Count newValue = java.util.Objects.requireNonNull(value, "defaultValueCount");
    if (this.defaultValueCount == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        newValue,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueCount() defaultValueCount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueCount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueCount(java.util.Optional<? extends com.fhir.Count> optional) {
    @javax.annotation.Nullable com.fhir.Count value = optional.orElse(null);
    if (this.defaultValueCount == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        value,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDataRequirement() defaultValueDataRequirement} attribute.
   * @param value The value for defaultValueDataRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDataRequirement(com.fhir.DataRequirement value) {
    @javax.annotation.Nullable com.fhir.DataRequirement newValue = java.util.Objects.requireNonNull(value, "defaultValueDataRequirement");
    if (this.defaultValueDataRequirement == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        newValue,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDataRequirement() defaultValueDataRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDataRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueDataRequirement(java.util.Optional<? extends com.fhir.DataRequirement> optional) {
    @javax.annotation.Nullable com.fhir.DataRequirement value = optional.orElse(null);
    if (this.defaultValueDataRequirement == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        value,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#min() min} attribute.
   * @param value The value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withMin(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.min, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        newValue,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#min() min} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withMin(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.min, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        value,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueParameterDefinition() defaultValueParameterDefinition} attribute.
   * @param value The value for defaultValueParameterDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueParameterDefinition(com.fhir.ParameterDefinition value) {
    @javax.annotation.Nullable com.fhir.ParameterDefinition newValue = java.util.Objects.requireNonNull(value, "defaultValueParameterDefinition");
    if (this.defaultValueParameterDefinition == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        newValue,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueParameterDefinition() defaultValueParameterDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueParameterDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueParameterDefinition(java.util.Optional<? extends com.fhir.ParameterDefinition> optional) {
    @javax.annotation.Nullable com.fhir.ParameterDefinition value = optional.orElse(null);
    if (this.defaultValueParameterDefinition == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        value,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withType(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "type");
    if (java.util.Objects.equals(this.type, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        newValue,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#type() type} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withType(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.type, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        value,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDuration() defaultValueDuration} attribute.
   * @param value The value for defaultValueDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDuration(com.fhir.Duration value) {
    @javax.annotation.Nullable com.fhir.Duration newValue = java.util.Objects.requireNonNull(value, "defaultValueDuration");
    if (this.defaultValueDuration == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        newValue,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDuration() defaultValueDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueDuration(java.util.Optional<? extends com.fhir.Duration> optional) {
    @javax.annotation.Nullable com.fhir.Duration value = optional.orElse(null);
    if (this.defaultValueDuration == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        value,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueAttachment() defaultValueAttachment} attribute.
   * @param value The value for defaultValueAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueAttachment(com.fhir.Attachment value) {
    @javax.annotation.Nullable com.fhir.Attachment newValue = java.util.Objects.requireNonNull(value, "defaultValueAttachment");
    if (this.defaultValueAttachment == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        newValue,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueAttachment() defaultValueAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueAttachment(java.util.Optional<? extends com.fhir.Attachment> optional) {
    @javax.annotation.Nullable com.fhir.Attachment value = optional.orElse(null);
    if (this.defaultValueAttachment == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        value,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueQuantity() defaultValueQuantity} attribute.
   * @param value The value for defaultValueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "defaultValueQuantity");
    if (this.defaultValueQuantity == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        newValue,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueQuantity() defaultValueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.defaultValueQuantity == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        value,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#variable() variable} attribute.
   * @param value The value for variable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withVariable(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "variable");
    if (this.variable == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        newValue,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#variable() variable} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variable
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withVariable(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.variable == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        value,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueInteger() defaultValueInteger} attribute.
   * @param value The value for defaultValueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueInteger(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.defaultValueInteger, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        newValue,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueInteger() defaultValueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueInteger(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueInteger, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        value,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueUri() defaultValueUri} attribute.
   * @param value The value for defaultValueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUri(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueUri");
    if (java.util.Objects.equals(this.defaultValueUri, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        newValue,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueUri() defaultValueUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUri(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueUri, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        value,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueCodeableConcept() defaultValueCodeableConcept} attribute.
   * @param value The value for defaultValueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "defaultValueCodeableConcept");
    if (this.defaultValueCodeableConcept == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        newValue,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueCodeableConcept() defaultValueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.defaultValueCodeableConcept == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        value,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#logMessage() logMessage} attribute.
   * @param value The value for logMessage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withLogMessage(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "logMessage");
    if (java.util.Objects.equals(this.logMessage, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        newValue,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#logMessage() logMessage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for logMessage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withLogMessage(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.logMessage, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        value,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueCoding() defaultValueCoding} attribute.
   * @param value The value for defaultValueCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCoding(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "defaultValueCoding");
    if (this.defaultValueCoding == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        newValue,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueCoding() defaultValueCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueCoding(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.defaultValueCoding == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        value,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueHumanName() defaultValueHumanName} attribute.
   * @param value The value for defaultValueHumanName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueHumanName(com.fhir.HumanName value) {
    @javax.annotation.Nullable com.fhir.HumanName newValue = java.util.Objects.requireNonNull(value, "defaultValueHumanName");
    if (this.defaultValueHumanName == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        newValue,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueHumanName() defaultValueHumanName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueHumanName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueHumanName(java.util.Optional<? extends com.fhir.HumanName> optional) {
    @javax.annotation.Nullable com.fhir.HumanName value = optional.orElse(null);
    if (this.defaultValueHumanName == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        value,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#max() max} attribute.
   * @param value The value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withMax(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "max");
    if (java.util.Objects.equals(this.max, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        newValue,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#max() max} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withMax(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.max, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        value,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueInstant() defaultValueInstant} attribute.
   * @param value The value for defaultValueInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueInstant(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueInstant");
    if (java.util.Objects.equals(this.defaultValueInstant, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        newValue,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueInstant() defaultValueInstant} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueInstant(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueInstant, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        value,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueRelatedArtifact() defaultValueRelatedArtifact} attribute.
   * @param value The value for defaultValueRelatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueRelatedArtifact(com.fhir.RelatedArtifact value) {
    @javax.annotation.Nullable com.fhir.RelatedArtifact newValue = java.util.Objects.requireNonNull(value, "defaultValueRelatedArtifact");
    if (this.defaultValueRelatedArtifact == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        newValue,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueRelatedArtifact() defaultValueRelatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueRelatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueRelatedArtifact(java.util.Optional<? extends com.fhir.RelatedArtifact> optional) {
    @javax.annotation.Nullable com.fhir.RelatedArtifact value = optional.orElse(null);
    if (this.defaultValueRelatedArtifact == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        value,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueId() defaultValueId} attribute.
   * @param value The value for defaultValueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueId");
    if (java.util.Objects.equals(this.defaultValueId, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        newValue,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueId() defaultValueId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueId, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        value,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueTriggerDefinition() defaultValueTriggerDefinition} attribute.
   * @param value The value for defaultValueTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueTriggerDefinition(com.fhir.TriggerDefinition value) {
    @javax.annotation.Nullable com.fhir.TriggerDefinition newValue = java.util.Objects.requireNonNull(value, "defaultValueTriggerDefinition");
    if (this.defaultValueTriggerDefinition == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        newValue,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueTriggerDefinition() defaultValueTriggerDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueTriggerDefinition(java.util.Optional<? extends com.fhir.TriggerDefinition> optional) {
    @javax.annotation.Nullable com.fhir.TriggerDefinition value = optional.orElse(null);
    if (this.defaultValueTriggerDefinition == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        value,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueContributor() defaultValueContributor} attribute.
   * @param value The value for defaultValueContributor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueContributor(com.fhir.Contributor value) {
    @javax.annotation.Nullable com.fhir.Contributor newValue = java.util.Objects.requireNonNull(value, "defaultValueContributor");
    if (this.defaultValueContributor == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        newValue,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueContributor() defaultValueContributor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueContributor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueContributor(java.util.Optional<? extends com.fhir.Contributor> optional) {
    @javax.annotation.Nullable com.fhir.Contributor value = optional.orElse(null);
    if (this.defaultValueContributor == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        value,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDosage() defaultValueDosage} attribute.
   * @param value The value for defaultValueDosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDosage(com.fhir.Dosage value) {
    @javax.annotation.Nullable com.fhir.Dosage newValue = java.util.Objects.requireNonNull(value, "defaultValueDosage");
    if (this.defaultValueDosage == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        newValue,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDosage() defaultValueDosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueDosage(java.util.Optional<? extends com.fhir.Dosage> optional) {
    @javax.annotation.Nullable com.fhir.Dosage value = optional.orElse(null);
    if (this.defaultValueDosage == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        value,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueMeta() defaultValueMeta} attribute.
   * @param value The value for defaultValueMeta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "defaultValueMeta");
    if (this.defaultValueMeta == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        newValue,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueMeta() defaultValueMeta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueMeta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.defaultValueMeta == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        value,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueRatio() defaultValueRatio} attribute.
   * @param value The value for defaultValueRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueRatio(com.fhir.Ratio value) {
    @javax.annotation.Nullable com.fhir.Ratio newValue = java.util.Objects.requireNonNull(value, "defaultValueRatio");
    if (this.defaultValueRatio == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        newValue,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueRatio() defaultValueRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueRatio(java.util.Optional<? extends com.fhir.Ratio> optional) {
    @javax.annotation.Nullable com.fhir.Ratio value = optional.orElse(null);
    if (this.defaultValueRatio == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        value,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueSampledData() defaultValueSampledData} attribute.
   * @param value The value for defaultValueSampledData
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueSampledData(com.fhir.SampledData value) {
    @javax.annotation.Nullable com.fhir.SampledData newValue = java.util.Objects.requireNonNull(value, "defaultValueSampledData");
    if (this.defaultValueSampledData == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        newValue,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueSampledData() defaultValueSampledData} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueSampledData
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueSampledData(java.util.Optional<? extends com.fhir.SampledData> optional) {
    @javax.annotation.Nullable com.fhir.SampledData value = optional.orElse(null);
    if (this.defaultValueSampledData == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        value,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueString() defaultValueString} attribute.
   * @param value The value for defaultValueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueString");
    if (java.util.Objects.equals(this.defaultValueString, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        newValue,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueString() defaultValueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueString, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        value,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withContext(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        newValue,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withContext(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        value,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueUnsignedInt() defaultValueUnsignedInt} attribute.
   * @param value The value for defaultValueUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUnsignedInt(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.defaultValueUnsignedInt, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        newValue,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueUnsignedInt() defaultValueUnsignedInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUnsignedInt(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueUnsignedInt, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        value,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueBoolean() defaultValueBoolean} attribute.
   * @param value The value for defaultValueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.defaultValueBoolean, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        newValue,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueBoolean() defaultValueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueBoolean, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        value,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueAnnotation() defaultValueAnnotation} attribute.
   * @param value The value for defaultValueAnnotation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueAnnotation(com.fhir.Annotation value) {
    @javax.annotation.Nullable com.fhir.Annotation newValue = java.util.Objects.requireNonNull(value, "defaultValueAnnotation");
    if (this.defaultValueAnnotation == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        newValue,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueAnnotation() defaultValueAnnotation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueAnnotation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueAnnotation(java.util.Optional<? extends com.fhir.Annotation> optional) {
    @javax.annotation.Nullable com.fhir.Annotation value = optional.orElse(null);
    if (this.defaultValueAnnotation == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        value,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueBase64Binary() defaultValueBase64Binary} attribute.
   * @param value The value for defaultValueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueBase64Binary(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueBase64Binary");
    if (java.util.Objects.equals(this.defaultValueBase64Binary, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        newValue,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueBase64Binary() defaultValueBase64Binary} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueBase64Binary(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueBase64Binary, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        value,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueUuid() defaultValueUuid} attribute.
   * @param value The value for defaultValueUuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUuid(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueUuid");
    if (java.util.Objects.equals(this.defaultValueUuid, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        newValue,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueUuid() defaultValueUuid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueUuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUuid(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueUuid, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        value,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        newValue,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        value,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        newValue,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        value,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#check() check} attribute.
   * @param value The value for check
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withCheck(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "check");
    if (java.util.Objects.equals(this.check, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        newValue,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#check() check} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for check
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withCheck(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.check, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        value,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueTime() defaultValueTime} attribute.
   * @param value The value for defaultValueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueTime");
    if (java.util.Objects.equals(this.defaultValueTime, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        newValue,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueTime() defaultValueTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueTime, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        value,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueCode() defaultValueCode} attribute.
   * @param value The value for defaultValueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCode(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueCode");
    if (java.util.Objects.equals(this.defaultValueCode, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        newValue,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueCode() defaultValueCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCode(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueCode, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        value,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueContactDetail() defaultValueContactDetail} attribute.
   * @param value The value for defaultValueContactDetail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueContactDetail(com.fhir.ContactDetail value) {
    @javax.annotation.Nullable com.fhir.ContactDetail newValue = java.util.Objects.requireNonNull(value, "defaultValueContactDetail");
    if (this.defaultValueContactDetail == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        newValue,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueContactDetail() defaultValueContactDetail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueContactDetail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueContactDetail(java.util.Optional<? extends com.fhir.ContactDetail> optional) {
    @javax.annotation.Nullable com.fhir.ContactDetail value = optional.orElse(null);
    if (this.defaultValueContactDetail == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        value,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueExpression() defaultValueExpression} attribute.
   * @param value The value for defaultValueExpression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueExpression(com.fhir.Expression value) {
    @javax.annotation.Nullable com.fhir.Expression newValue = java.util.Objects.requireNonNull(value, "defaultValueExpression");
    if (this.defaultValueExpression == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        newValue,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueExpression() defaultValueExpression} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueExpression
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueExpression(java.util.Optional<? extends com.fhir.Expression> optional) {
    @javax.annotation.Nullable com.fhir.Expression value = optional.orElse(null);
    if (this.defaultValueExpression == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        value,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueMoney() defaultValueMoney} attribute.
   * @param value The value for defaultValueMoney
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueMoney(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "defaultValueMoney");
    if (this.defaultValueMoney == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        newValue,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueMoney() defaultValueMoney} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueMoney
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueMoney(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.defaultValueMoney == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        value,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueSignature() defaultValueSignature} attribute.
   * @param value The value for defaultValueSignature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueSignature(com.fhir.Signature value) {
    @javax.annotation.Nullable com.fhir.Signature newValue = java.util.Objects.requireNonNull(value, "defaultValueSignature");
    if (this.defaultValueSignature == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        newValue,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueSignature() defaultValueSignature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueSignature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueSignature(java.util.Optional<? extends com.fhir.Signature> optional) {
    @javax.annotation.Nullable com.fhir.Signature value = optional.orElse(null);
    if (this.defaultValueSignature == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        value,
        this.defaultValueTiming,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueTiming() defaultValueTiming} attribute.
   * @param value The value for defaultValueTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "defaultValueTiming");
    if (this.defaultValueTiming == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        newValue,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueTiming() defaultValueTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.defaultValueTiming == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        value,
        this.defaultValueReference,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueReference() defaultValueReference} attribute.
   * @param value The value for defaultValueReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "defaultValueReference");
    if (this.defaultValueReference == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        newValue,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueReference() defaultValueReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.defaultValueReference == value) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        value,
        this.defaultValueOid);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueOid() defaultValueOid} attribute.
   * @param value The value for defaultValueOid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueOid(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "defaultValueOid");
    if (java.util.Objects.equals(this.defaultValueOid, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueOid() defaultValueOid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueOid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueOid(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.defaultValueOid, value)) return this;
    return new ImmutableStructureMap_Source(
        this.defaultValueUrl,
        this.defaultValueMarkdown,
        this.defaultValuePositiveInt,
        this.element,
        this.condition,
        this.id,
        this.defaultValueCanonical,
        this.defaultValuePeriod,
        this.defaultValueUsageContext,
        this.defaultValueDate,
        this.defaultValueAddress,
        this.defaultValueDecimal,
        this.defaultValueIdentifier,
        this.listMode,
        this.defaultValueDistance,
        this.defaultValueDateTime,
        this.defaultValueContactPoint,
        this.defaultValueAge,
        this.defaultValueRange,
        this.defaultValueCount,
        this.defaultValueDataRequirement,
        this.min,
        this.defaultValueParameterDefinition,
        this.type,
        this.defaultValueDuration,
        this.defaultValueAttachment,
        this.defaultValueQuantity,
        this.variable,
        this.defaultValueInteger,
        this.defaultValueUri,
        this.defaultValueCodeableConcept,
        this.logMessage,
        this.defaultValueCoding,
        this.defaultValueHumanName,
        this.max,
        this.defaultValueInstant,
        this.defaultValueRelatedArtifact,
        this.defaultValueId,
        this.defaultValueTriggerDefinition,
        this.defaultValueContributor,
        this.defaultValueDosage,
        this.defaultValueMeta,
        this.defaultValueRatio,
        this.defaultValueSampledData,
        this.defaultValueString,
        this.context,
        this.defaultValueUnsignedInt,
        this.defaultValueBoolean,
        this.defaultValueAnnotation,
        this.defaultValueBase64Binary,
        this.defaultValueUuid,
        this.modifierExtension,
        this.extension,
        this.check,
        this.defaultValueTime,
        this.defaultValueCode,
        this.defaultValueContactDetail,
        this.defaultValueExpression,
        this.defaultValueMoney,
        this.defaultValueSignature,
        this.defaultValueTiming,
        this.defaultValueReference,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap_Source} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap_Source
        && equalTo((ImmutableStructureMap_Source) another);
  }

  private boolean equalTo(ImmutableStructureMap_Source another) {
    return java.util.Objects.equals(defaultValueUrl, another.defaultValueUrl)
        && java.util.Objects.equals(defaultValueMarkdown, another.defaultValueMarkdown)
        && java.util.Objects.equals(defaultValuePositiveInt, another.defaultValuePositiveInt)
        && java.util.Objects.equals(element, another.element)
        && java.util.Objects.equals(condition, another.condition)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(defaultValueCanonical, another.defaultValueCanonical)
        && java.util.Objects.equals(defaultValuePeriod, another.defaultValuePeriod)
        && java.util.Objects.equals(defaultValueUsageContext, another.defaultValueUsageContext)
        && java.util.Objects.equals(defaultValueDate, another.defaultValueDate)
        && java.util.Objects.equals(defaultValueAddress, another.defaultValueAddress)
        && java.util.Objects.equals(defaultValueDecimal, another.defaultValueDecimal)
        && java.util.Objects.equals(defaultValueIdentifier, another.defaultValueIdentifier)
        && java.util.Objects.equals(listMode, another.listMode)
        && java.util.Objects.equals(defaultValueDistance, another.defaultValueDistance)
        && java.util.Objects.equals(defaultValueDateTime, another.defaultValueDateTime)
        && java.util.Objects.equals(defaultValueContactPoint, another.defaultValueContactPoint)
        && java.util.Objects.equals(defaultValueAge, another.defaultValueAge)
        && java.util.Objects.equals(defaultValueRange, another.defaultValueRange)
        && java.util.Objects.equals(defaultValueCount, another.defaultValueCount)
        && java.util.Objects.equals(defaultValueDataRequirement, another.defaultValueDataRequirement)
        && java.util.Objects.equals(min, another.min)
        && java.util.Objects.equals(defaultValueParameterDefinition, another.defaultValueParameterDefinition)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(defaultValueDuration, another.defaultValueDuration)
        && java.util.Objects.equals(defaultValueAttachment, another.defaultValueAttachment)
        && java.util.Objects.equals(defaultValueQuantity, another.defaultValueQuantity)
        && java.util.Objects.equals(variable, another.variable)
        && java.util.Objects.equals(defaultValueInteger, another.defaultValueInteger)
        && java.util.Objects.equals(defaultValueUri, another.defaultValueUri)
        && java.util.Objects.equals(defaultValueCodeableConcept, another.defaultValueCodeableConcept)
        && java.util.Objects.equals(logMessage, another.logMessage)
        && java.util.Objects.equals(defaultValueCoding, another.defaultValueCoding)
        && java.util.Objects.equals(defaultValueHumanName, another.defaultValueHumanName)
        && java.util.Objects.equals(max, another.max)
        && java.util.Objects.equals(defaultValueInstant, another.defaultValueInstant)
        && java.util.Objects.equals(defaultValueRelatedArtifact, another.defaultValueRelatedArtifact)
        && java.util.Objects.equals(defaultValueId, another.defaultValueId)
        && java.util.Objects.equals(defaultValueTriggerDefinition, another.defaultValueTriggerDefinition)
        && java.util.Objects.equals(defaultValueContributor, another.defaultValueContributor)
        && java.util.Objects.equals(defaultValueDosage, another.defaultValueDosage)
        && java.util.Objects.equals(defaultValueMeta, another.defaultValueMeta)
        && java.util.Objects.equals(defaultValueRatio, another.defaultValueRatio)
        && java.util.Objects.equals(defaultValueSampledData, another.defaultValueSampledData)
        && java.util.Objects.equals(defaultValueString, another.defaultValueString)
        && java.util.Objects.equals(context, another.context)
        && java.util.Objects.equals(defaultValueUnsignedInt, another.defaultValueUnsignedInt)
        && java.util.Objects.equals(defaultValueBoolean, another.defaultValueBoolean)
        && java.util.Objects.equals(defaultValueAnnotation, another.defaultValueAnnotation)
        && java.util.Objects.equals(defaultValueBase64Binary, another.defaultValueBase64Binary)
        && java.util.Objects.equals(defaultValueUuid, another.defaultValueUuid)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(check, another.check)
        && java.util.Objects.equals(defaultValueTime, another.defaultValueTime)
        && java.util.Objects.equals(defaultValueCode, another.defaultValueCode)
        && java.util.Objects.equals(defaultValueContactDetail, another.defaultValueContactDetail)
        && java.util.Objects.equals(defaultValueExpression, another.defaultValueExpression)
        && java.util.Objects.equals(defaultValueMoney, another.defaultValueMoney)
        && java.util.Objects.equals(defaultValueSignature, another.defaultValueSignature)
        && java.util.Objects.equals(defaultValueTiming, another.defaultValueTiming)
        && java.util.Objects.equals(defaultValueReference, another.defaultValueReference)
        && java.util.Objects.equals(defaultValueOid, another.defaultValueOid);
  }

  /**
   * Computes a hash code from attributes: {@code defaultValueUrl}, {@code defaultValueMarkdown}, {@code defaultValuePositiveInt}, {@code element}, {@code condition}, {@code id}, {@code defaultValueCanonical}, {@code defaultValuePeriod}, {@code defaultValueUsageContext}, {@code defaultValueDate}, {@code defaultValueAddress}, {@code defaultValueDecimal}, {@code defaultValueIdentifier}, {@code listMode}, {@code defaultValueDistance}, {@code defaultValueDateTime}, {@code defaultValueContactPoint}, {@code defaultValueAge}, {@code defaultValueRange}, {@code defaultValueCount}, {@code defaultValueDataRequirement}, {@code min}, {@code defaultValueParameterDefinition}, {@code type}, {@code defaultValueDuration}, {@code defaultValueAttachment}, {@code defaultValueQuantity}, {@code variable}, {@code defaultValueInteger}, {@code defaultValueUri}, {@code defaultValueCodeableConcept}, {@code logMessage}, {@code defaultValueCoding}, {@code defaultValueHumanName}, {@code max}, {@code defaultValueInstant}, {@code defaultValueRelatedArtifact}, {@code defaultValueId}, {@code defaultValueTriggerDefinition}, {@code defaultValueContributor}, {@code defaultValueDosage}, {@code defaultValueMeta}, {@code defaultValueRatio}, {@code defaultValueSampledData}, {@code defaultValueString}, {@code context}, {@code defaultValueUnsignedInt}, {@code defaultValueBoolean}, {@code defaultValueAnnotation}, {@code defaultValueBase64Binary}, {@code defaultValueUuid}, {@code modifierExtension}, {@code extension}, {@code check}, {@code defaultValueTime}, {@code defaultValueCode}, {@code defaultValueContactDetail}, {@code defaultValueExpression}, {@code defaultValueMoney}, {@code defaultValueSignature}, {@code defaultValueTiming}, {@code defaultValueReference}, {@code defaultValueOid}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(defaultValueUrl);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueMarkdown);
    h += (h << 5) + java.util.Objects.hashCode(defaultValuePositiveInt);
    h += (h << 5) + java.util.Objects.hashCode(element);
    h += (h << 5) + java.util.Objects.hashCode(condition);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueCanonical);
    h += (h << 5) + java.util.Objects.hashCode(defaultValuePeriod);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueUsageContext);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueDate);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueAddress);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueDecimal);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(listMode);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueDistance);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueDateTime);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueContactPoint);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueAge);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueRange);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueCount);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueDataRequirement);
    h += (h << 5) + java.util.Objects.hashCode(min);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueParameterDefinition);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueDuration);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueAttachment);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueQuantity);
    h += (h << 5) + java.util.Objects.hashCode(variable);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueInteger);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueUri);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(logMessage);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueCoding);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueHumanName);
    h += (h << 5) + java.util.Objects.hashCode(max);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueInstant);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueRelatedArtifact);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueId);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueTriggerDefinition);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueContributor);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueDosage);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueMeta);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueRatio);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueSampledData);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueString);
    h += (h << 5) + java.util.Objects.hashCode(context);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueUnsignedInt);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueBoolean);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueAnnotation);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueBase64Binary);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueUuid);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(check);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueTime);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueCode);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueContactDetail);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueExpression);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueMoney);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueSignature);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueTiming);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueReference);
    h += (h << 5) + java.util.Objects.hashCode(defaultValueOid);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap_Source} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("StructureMap_Source{");
    if (defaultValueUrl != null) {
      builder.append("defaultValueUrl=").append(defaultValueUrl);
    }
    if (defaultValueMarkdown != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueMarkdown=").append(defaultValueMarkdown);
    }
    if (defaultValuePositiveInt != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValuePositiveInt=").append(defaultValuePositiveInt);
    }
    if (element != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("element=").append(element);
    }
    if (condition != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (defaultValueCanonical != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueCanonical=").append(defaultValueCanonical);
    }
    if (defaultValuePeriod != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValuePeriod=").append(defaultValuePeriod);
    }
    if (defaultValueUsageContext != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueUsageContext=").append(defaultValueUsageContext);
    }
    if (defaultValueDate != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDate=").append(defaultValueDate);
    }
    if (defaultValueAddress != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueAddress=").append(defaultValueAddress);
    }
    if (defaultValueDecimal != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDecimal=").append(defaultValueDecimal);
    }
    if (defaultValueIdentifier != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueIdentifier=").append(defaultValueIdentifier);
    }
    if (listMode != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("listMode=").append(listMode);
    }
    if (defaultValueDistance != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDistance=").append(defaultValueDistance);
    }
    if (defaultValueDateTime != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDateTime=").append(defaultValueDateTime);
    }
    if (defaultValueContactPoint != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueContactPoint=").append(defaultValueContactPoint);
    }
    if (defaultValueAge != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueAge=").append(defaultValueAge);
    }
    if (defaultValueRange != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueRange=").append(defaultValueRange);
    }
    if (defaultValueCount != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueCount=").append(defaultValueCount);
    }
    if (defaultValueDataRequirement != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDataRequirement=").append(defaultValueDataRequirement);
    }
    if (min != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("min=").append(min);
    }
    if (defaultValueParameterDefinition != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueParameterDefinition=").append(defaultValueParameterDefinition);
    }
    if (type != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (defaultValueDuration != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDuration=").append(defaultValueDuration);
    }
    if (defaultValueAttachment != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueAttachment=").append(defaultValueAttachment);
    }
    if (defaultValueQuantity != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueQuantity=").append(defaultValueQuantity);
    }
    if (variable != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("variable=").append(variable);
    }
    if (defaultValueInteger != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueInteger=").append(defaultValueInteger);
    }
    if (defaultValueUri != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueUri=").append(defaultValueUri);
    }
    if (defaultValueCodeableConcept != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueCodeableConcept=").append(defaultValueCodeableConcept);
    }
    if (logMessage != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("logMessage=").append(logMessage);
    }
    if (defaultValueCoding != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueCoding=").append(defaultValueCoding);
    }
    if (defaultValueHumanName != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueHumanName=").append(defaultValueHumanName);
    }
    if (max != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("max=").append(max);
    }
    if (defaultValueInstant != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueInstant=").append(defaultValueInstant);
    }
    if (defaultValueRelatedArtifact != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueRelatedArtifact=").append(defaultValueRelatedArtifact);
    }
    if (defaultValueId != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueId=").append(defaultValueId);
    }
    if (defaultValueTriggerDefinition != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueTriggerDefinition=").append(defaultValueTriggerDefinition);
    }
    if (defaultValueContributor != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueContributor=").append(defaultValueContributor);
    }
    if (defaultValueDosage != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDosage=").append(defaultValueDosage);
    }
    if (defaultValueMeta != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueMeta=").append(defaultValueMeta);
    }
    if (defaultValueRatio != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueRatio=").append(defaultValueRatio);
    }
    if (defaultValueSampledData != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueSampledData=").append(defaultValueSampledData);
    }
    if (defaultValueString != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueString=").append(defaultValueString);
    }
    if (context != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("context=").append(context);
    }
    if (defaultValueUnsignedInt != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueUnsignedInt=").append(defaultValueUnsignedInt);
    }
    if (defaultValueBoolean != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueBoolean=").append(defaultValueBoolean);
    }
    if (defaultValueAnnotation != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueAnnotation=").append(defaultValueAnnotation);
    }
    if (defaultValueBase64Binary != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueBase64Binary=").append(defaultValueBase64Binary);
    }
    if (defaultValueUuid != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueUuid=").append(defaultValueUuid);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (check != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("check=").append(check);
    }
    if (defaultValueTime != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueTime=").append(defaultValueTime);
    }
    if (defaultValueCode != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueCode=").append(defaultValueCode);
    }
    if (defaultValueContactDetail != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueContactDetail=").append(defaultValueContactDetail);
    }
    if (defaultValueExpression != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueExpression=").append(defaultValueExpression);
    }
    if (defaultValueMoney != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueMoney=").append(defaultValueMoney);
    }
    if (defaultValueSignature != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueSignature=").append(defaultValueSignature);
    }
    if (defaultValueTiming != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueTiming=").append(defaultValueTiming);
    }
    if (defaultValueReference != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueReference=").append(defaultValueReference);
    }
    if (defaultValueOid != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueOid=").append(defaultValueOid);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "StructureMap_Source", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.StructureMap_Source {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueUrl = java.util.Optional.empty();
    boolean defaultValueUrlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueMarkdown = java.util.Optional.empty();
    boolean defaultValueMarkdownIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> defaultValuePositiveInt = java.util.Optional.empty();
    boolean defaultValuePositiveIntIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> element = java.util.Optional.empty();
    boolean elementIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> condition = java.util.Optional.empty();
    boolean conditionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueCanonical = java.util.Optional.empty();
    boolean defaultValueCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> defaultValuePeriod = java.util.Optional.empty();
    boolean defaultValuePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.UsageContext> defaultValueUsageContext = java.util.Optional.empty();
    boolean defaultValueUsageContextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueDate = java.util.Optional.empty();
    boolean defaultValueDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Address> defaultValueAddress = java.util.Optional.empty();
    boolean defaultValueAddressIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> defaultValueDecimal = java.util.Optional.empty();
    boolean defaultValueDecimalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> defaultValueIdentifier = java.util.Optional.empty();
    boolean defaultValueIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Structuremap_sourceListmode> listMode = java.util.Optional.empty();
    boolean listModeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Distance> defaultValueDistance = java.util.Optional.empty();
    boolean defaultValueDistanceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueDateTime = java.util.Optional.empty();
    boolean defaultValueDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ContactPoint> defaultValueContactPoint = java.util.Optional.empty();
    boolean defaultValueContactPointIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Age> defaultValueAge = java.util.Optional.empty();
    boolean defaultValueAgeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> defaultValueRange = java.util.Optional.empty();
    boolean defaultValueRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Count> defaultValueCount = java.util.Optional.empty();
    boolean defaultValueCountIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.DataRequirement> defaultValueDataRequirement = java.util.Optional.empty();
    boolean defaultValueDataRequirementIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> min = java.util.Optional.empty();
    boolean minIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ParameterDefinition> defaultValueParameterDefinition = java.util.Optional.empty();
    boolean defaultValueParameterDefinitionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Duration> defaultValueDuration = java.util.Optional.empty();
    boolean defaultValueDurationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Attachment> defaultValueAttachment = java.util.Optional.empty();
    boolean defaultValueAttachmentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> defaultValueQuantity = java.util.Optional.empty();
    boolean defaultValueQuantityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> variable = java.util.Optional.empty();
    boolean variableIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> defaultValueInteger = java.util.Optional.empty();
    boolean defaultValueIntegerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueUri = java.util.Optional.empty();
    boolean defaultValueUriIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> defaultValueCodeableConcept = java.util.Optional.empty();
    boolean defaultValueCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> logMessage = java.util.Optional.empty();
    boolean logMessageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> defaultValueCoding = java.util.Optional.empty();
    boolean defaultValueCodingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.HumanName> defaultValueHumanName = java.util.Optional.empty();
    boolean defaultValueHumanNameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> max = java.util.Optional.empty();
    boolean maxIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueInstant = java.util.Optional.empty();
    boolean defaultValueInstantIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.RelatedArtifact> defaultValueRelatedArtifact = java.util.Optional.empty();
    boolean defaultValueRelatedArtifactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueId = java.util.Optional.empty();
    boolean defaultValueIdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TriggerDefinition> defaultValueTriggerDefinition = java.util.Optional.empty();
    boolean defaultValueTriggerDefinitionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Contributor> defaultValueContributor = java.util.Optional.empty();
    boolean defaultValueContributorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Dosage> defaultValueDosage = java.util.Optional.empty();
    boolean defaultValueDosageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> defaultValueMeta = java.util.Optional.empty();
    boolean defaultValueMetaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Ratio> defaultValueRatio = java.util.Optional.empty();
    boolean defaultValueRatioIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SampledData> defaultValueSampledData = java.util.Optional.empty();
    boolean defaultValueSampledDataIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueString = java.util.Optional.empty();
    boolean defaultValueStringIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> context = java.util.Optional.empty();
    boolean contextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> defaultValueUnsignedInt = java.util.Optional.empty();
    boolean defaultValueUnsignedIntIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> defaultValueBoolean = java.util.Optional.empty();
    boolean defaultValueBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Annotation> defaultValueAnnotation = java.util.Optional.empty();
    boolean defaultValueAnnotationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueBase64Binary = java.util.Optional.empty();
    boolean defaultValueBase64BinaryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueUuid = java.util.Optional.empty();
    boolean defaultValueUuidIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> check = java.util.Optional.empty();
    boolean checkIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueTime = java.util.Optional.empty();
    boolean defaultValueTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueCode = java.util.Optional.empty();
    boolean defaultValueCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ContactDetail> defaultValueContactDetail = java.util.Optional.empty();
    boolean defaultValueContactDetailIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Expression> defaultValueExpression = java.util.Optional.empty();
    boolean defaultValueExpressionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> defaultValueMoney = java.util.Optional.empty();
    boolean defaultValueMoneyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Signature> defaultValueSignature = java.util.Optional.empty();
    boolean defaultValueSignatureIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> defaultValueTiming = java.util.Optional.empty();
    boolean defaultValueTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> defaultValueReference = java.util.Optional.empty();
    boolean defaultValueReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> defaultValueOid = java.util.Optional.empty();
    boolean defaultValueOidIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUrl")
    public void setDefaultValueUrl(java.util.Optional<java.lang.String> defaultValueUrl) {
      this.defaultValueUrl = defaultValueUrl;
      this.defaultValueUrlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueMarkdown")
    public void setDefaultValueMarkdown(java.util.Optional<java.lang.String> defaultValueMarkdown) {
      this.defaultValueMarkdown = defaultValueMarkdown;
      this.defaultValueMarkdownIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValuePositiveInt")
    public void setDefaultValuePositiveInt(java.util.Optional<java.lang.Double> defaultValuePositiveInt) {
      this.defaultValuePositiveInt = defaultValuePositiveInt;
      this.defaultValuePositiveIntIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("element")
    public void setElement(java.util.Optional<java.lang.String> element) {
      this.element = element;
      this.elementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public void setCondition(java.util.Optional<java.lang.String> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCanonical")
    public void setDefaultValueCanonical(java.util.Optional<java.lang.String> defaultValueCanonical) {
      this.defaultValueCanonical = defaultValueCanonical;
      this.defaultValueCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValuePeriod")
    public void setDefaultValuePeriod(java.util.Optional<com.fhir.Period> defaultValuePeriod) {
      this.defaultValuePeriod = defaultValuePeriod;
      this.defaultValuePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUsageContext")
    public void setDefaultValueUsageContext(java.util.Optional<com.fhir.UsageContext> defaultValueUsageContext) {
      this.defaultValueUsageContext = defaultValueUsageContext;
      this.defaultValueUsageContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDate")
    public void setDefaultValueDate(java.util.Optional<java.lang.String> defaultValueDate) {
      this.defaultValueDate = defaultValueDate;
      this.defaultValueDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueAddress")
    public void setDefaultValueAddress(java.util.Optional<com.fhir.Address> defaultValueAddress) {
      this.defaultValueAddress = defaultValueAddress;
      this.defaultValueAddressIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDecimal")
    public void setDefaultValueDecimal(java.util.Optional<java.lang.Double> defaultValueDecimal) {
      this.defaultValueDecimal = defaultValueDecimal;
      this.defaultValueDecimalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueIdentifier")
    public void setDefaultValueIdentifier(java.util.Optional<com.fhir.Identifier> defaultValueIdentifier) {
      this.defaultValueIdentifier = defaultValueIdentifier;
      this.defaultValueIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("listMode")
    public void setListMode(java.util.Optional<com.fhir.Structuremap_sourceListmode> listMode) {
      this.listMode = listMode;
      this.listModeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDistance")
    public void setDefaultValueDistance(java.util.Optional<com.fhir.Distance> defaultValueDistance) {
      this.defaultValueDistance = defaultValueDistance;
      this.defaultValueDistanceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDateTime")
    public void setDefaultValueDateTime(java.util.Optional<java.lang.String> defaultValueDateTime) {
      this.defaultValueDateTime = defaultValueDateTime;
      this.defaultValueDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueContactPoint")
    public void setDefaultValueContactPoint(java.util.Optional<com.fhir.ContactPoint> defaultValueContactPoint) {
      this.defaultValueContactPoint = defaultValueContactPoint;
      this.defaultValueContactPointIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueAge")
    public void setDefaultValueAge(java.util.Optional<com.fhir.Age> defaultValueAge) {
      this.defaultValueAge = defaultValueAge;
      this.defaultValueAgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueRange")
    public void setDefaultValueRange(java.util.Optional<com.fhir.Range> defaultValueRange) {
      this.defaultValueRange = defaultValueRange;
      this.defaultValueRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCount")
    public void setDefaultValueCount(java.util.Optional<com.fhir.Count> defaultValueCount) {
      this.defaultValueCount = defaultValueCount;
      this.defaultValueCountIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDataRequirement")
    public void setDefaultValueDataRequirement(java.util.Optional<com.fhir.DataRequirement> defaultValueDataRequirement) {
      this.defaultValueDataRequirement = defaultValueDataRequirement;
      this.defaultValueDataRequirementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    public void setMin(java.util.Optional<java.lang.Integer> min) {
      this.min = min;
      this.minIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueParameterDefinition")
    public void setDefaultValueParameterDefinition(java.util.Optional<com.fhir.ParameterDefinition> defaultValueParameterDefinition) {
      this.defaultValueParameterDefinition = defaultValueParameterDefinition;
      this.defaultValueParameterDefinitionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.lang.String> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDuration")
    public void setDefaultValueDuration(java.util.Optional<com.fhir.Duration> defaultValueDuration) {
      this.defaultValueDuration = defaultValueDuration;
      this.defaultValueDurationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueAttachment")
    public void setDefaultValueAttachment(java.util.Optional<com.fhir.Attachment> defaultValueAttachment) {
      this.defaultValueAttachment = defaultValueAttachment;
      this.defaultValueAttachmentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueQuantity")
    public void setDefaultValueQuantity(java.util.Optional<com.fhir.Quantity> defaultValueQuantity) {
      this.defaultValueQuantity = defaultValueQuantity;
      this.defaultValueQuantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("variable")
    public void setVariable(java.util.Optional<com.fhir.id> variable) {
      this.variable = variable;
      this.variableIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueInteger")
    public void setDefaultValueInteger(java.util.Optional<java.lang.Double> defaultValueInteger) {
      this.defaultValueInteger = defaultValueInteger;
      this.defaultValueIntegerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUri")
    public void setDefaultValueUri(java.util.Optional<java.lang.String> defaultValueUri) {
      this.defaultValueUri = defaultValueUri;
      this.defaultValueUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCodeableConcept")
    public void setDefaultValueCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> defaultValueCodeableConcept) {
      this.defaultValueCodeableConcept = defaultValueCodeableConcept;
      this.defaultValueCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("logMessage")
    public void setLogMessage(java.util.Optional<java.lang.String> logMessage) {
      this.logMessage = logMessage;
      this.logMessageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCoding")
    public void setDefaultValueCoding(java.util.Optional<com.fhir.Coding> defaultValueCoding) {
      this.defaultValueCoding = defaultValueCoding;
      this.defaultValueCodingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueHumanName")
    public void setDefaultValueHumanName(java.util.Optional<com.fhir.HumanName> defaultValueHumanName) {
      this.defaultValueHumanName = defaultValueHumanName;
      this.defaultValueHumanNameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    public void setMax(java.util.Optional<java.lang.String> max) {
      this.max = max;
      this.maxIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueInstant")
    public void setDefaultValueInstant(java.util.Optional<java.lang.String> defaultValueInstant) {
      this.defaultValueInstant = defaultValueInstant;
      this.defaultValueInstantIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueRelatedArtifact")
    public void setDefaultValueRelatedArtifact(java.util.Optional<com.fhir.RelatedArtifact> defaultValueRelatedArtifact) {
      this.defaultValueRelatedArtifact = defaultValueRelatedArtifact;
      this.defaultValueRelatedArtifactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueId")
    public void setDefaultValueId(java.util.Optional<java.lang.String> defaultValueId) {
      this.defaultValueId = defaultValueId;
      this.defaultValueIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueTriggerDefinition")
    public void setDefaultValueTriggerDefinition(java.util.Optional<com.fhir.TriggerDefinition> defaultValueTriggerDefinition) {
      this.defaultValueTriggerDefinition = defaultValueTriggerDefinition;
      this.defaultValueTriggerDefinitionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueContributor")
    public void setDefaultValueContributor(java.util.Optional<com.fhir.Contributor> defaultValueContributor) {
      this.defaultValueContributor = defaultValueContributor;
      this.defaultValueContributorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDosage")
    public void setDefaultValueDosage(java.util.Optional<com.fhir.Dosage> defaultValueDosage) {
      this.defaultValueDosage = defaultValueDosage;
      this.defaultValueDosageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueMeta")
    public void setDefaultValueMeta(java.util.Optional<com.fhir.Meta> defaultValueMeta) {
      this.defaultValueMeta = defaultValueMeta;
      this.defaultValueMetaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueRatio")
    public void setDefaultValueRatio(java.util.Optional<com.fhir.Ratio> defaultValueRatio) {
      this.defaultValueRatio = defaultValueRatio;
      this.defaultValueRatioIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueSampledData")
    public void setDefaultValueSampledData(java.util.Optional<com.fhir.SampledData> defaultValueSampledData) {
      this.defaultValueSampledData = defaultValueSampledData;
      this.defaultValueSampledDataIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueString")
    public void setDefaultValueString(java.util.Optional<java.lang.String> defaultValueString) {
      this.defaultValueString = defaultValueString;
      this.defaultValueStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public void setContext(java.util.Optional<com.fhir.id> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUnsignedInt")
    public void setDefaultValueUnsignedInt(java.util.Optional<java.lang.Double> defaultValueUnsignedInt) {
      this.defaultValueUnsignedInt = defaultValueUnsignedInt;
      this.defaultValueUnsignedIntIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueBoolean")
    public void setDefaultValueBoolean(java.util.Optional<java.lang.Boolean> defaultValueBoolean) {
      this.defaultValueBoolean = defaultValueBoolean;
      this.defaultValueBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueAnnotation")
    public void setDefaultValueAnnotation(java.util.Optional<com.fhir.Annotation> defaultValueAnnotation) {
      this.defaultValueAnnotation = defaultValueAnnotation;
      this.defaultValueAnnotationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueBase64Binary")
    public void setDefaultValueBase64Binary(java.util.Optional<java.lang.String> defaultValueBase64Binary) {
      this.defaultValueBase64Binary = defaultValueBase64Binary;
      this.defaultValueBase64BinaryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUuid")
    public void setDefaultValueUuid(java.util.Optional<java.lang.String> defaultValueUuid) {
      this.defaultValueUuid = defaultValueUuid;
      this.defaultValueUuidIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("check")
    public void setCheck(java.util.Optional<java.lang.String> check) {
      this.check = check;
      this.checkIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueTime")
    public void setDefaultValueTime(java.util.Optional<java.lang.String> defaultValueTime) {
      this.defaultValueTime = defaultValueTime;
      this.defaultValueTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCode")
    public void setDefaultValueCode(java.util.Optional<java.lang.String> defaultValueCode) {
      this.defaultValueCode = defaultValueCode;
      this.defaultValueCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueContactDetail")
    public void setDefaultValueContactDetail(java.util.Optional<com.fhir.ContactDetail> defaultValueContactDetail) {
      this.defaultValueContactDetail = defaultValueContactDetail;
      this.defaultValueContactDetailIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueExpression")
    public void setDefaultValueExpression(java.util.Optional<com.fhir.Expression> defaultValueExpression) {
      this.defaultValueExpression = defaultValueExpression;
      this.defaultValueExpressionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueMoney")
    public void setDefaultValueMoney(java.util.Optional<com.fhir.Money> defaultValueMoney) {
      this.defaultValueMoney = defaultValueMoney;
      this.defaultValueMoneyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueSignature")
    public void setDefaultValueSignature(java.util.Optional<com.fhir.Signature> defaultValueSignature) {
      this.defaultValueSignature = defaultValueSignature;
      this.defaultValueSignatureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueTiming")
    public void setDefaultValueTiming(java.util.Optional<com.fhir.Timing> defaultValueTiming) {
      this.defaultValueTiming = defaultValueTiming;
      this.defaultValueTimingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueReference")
    public void setDefaultValueReference(java.util.Optional<com.fhir.Reference> defaultValueReference) {
      this.defaultValueReference = defaultValueReference;
      this.defaultValueReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueOid")
    public void setDefaultValueOid(java.util.Optional<java.lang.String> defaultValueOid) {
      this.defaultValueOid = defaultValueOid;
      this.defaultValueOidIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> defaultValueUrl() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueMarkdown() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> defaultValuePositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> element() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> condition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> defaultValuePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.UsageContext> defaultValueUsageContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Address> defaultValueAddress() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> defaultValueDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> defaultValueIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Structuremap_sourceListmode> listMode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Distance> defaultValueDistance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ContactPoint> defaultValueContactPoint() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Age> defaultValueAge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> defaultValueRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Count> defaultValueCount() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.DataRequirement> defaultValueDataRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> min() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ParameterDefinition> defaultValueParameterDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Duration> defaultValueDuration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Attachment> defaultValueAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> defaultValueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> variable() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> defaultValueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> defaultValueCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> logMessage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> defaultValueCoding() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.HumanName> defaultValueHumanName() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> max() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueInstant() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.RelatedArtifact> defaultValueRelatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TriggerDefinition> defaultValueTriggerDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Contributor> defaultValueContributor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Dosage> defaultValueDosage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> defaultValueMeta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Ratio> defaultValueRatio() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SampledData> defaultValueSampledData() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> context() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> defaultValueUnsignedInt() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> defaultValueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Annotation> defaultValueAnnotation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueBase64Binary() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueUuid() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> check() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ContactDetail> defaultValueContactDetail() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Expression> defaultValueExpression() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> defaultValueMoney() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Signature> defaultValueSignature() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> defaultValueTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> defaultValueReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> defaultValueOid() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap_Source fromJson(Json json) {
    ImmutableStructureMap_Source.Builder builder = ImmutableStructureMap_Source.builder();
    if (json.defaultValueUrlIsSet) {
      builder.defaultValueUrl(json.defaultValueUrl);
    }
    if (json.defaultValueMarkdownIsSet) {
      builder.defaultValueMarkdown(json.defaultValueMarkdown);
    }
    if (json.defaultValuePositiveIntIsSet) {
      builder.defaultValuePositiveInt(json.defaultValuePositiveInt);
    }
    if (json.elementIsSet) {
      builder.element(json.element);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.defaultValueCanonicalIsSet) {
      builder.defaultValueCanonical(json.defaultValueCanonical);
    }
    if (json.defaultValuePeriodIsSet) {
      builder.defaultValuePeriod(json.defaultValuePeriod);
    }
    if (json.defaultValueUsageContextIsSet) {
      builder.defaultValueUsageContext(json.defaultValueUsageContext);
    }
    if (json.defaultValueDateIsSet) {
      builder.defaultValueDate(json.defaultValueDate);
    }
    if (json.defaultValueAddressIsSet) {
      builder.defaultValueAddress(json.defaultValueAddress);
    }
    if (json.defaultValueDecimalIsSet) {
      builder.defaultValueDecimal(json.defaultValueDecimal);
    }
    if (json.defaultValueIdentifierIsSet) {
      builder.defaultValueIdentifier(json.defaultValueIdentifier);
    }
    if (json.listModeIsSet) {
      builder.listMode(json.listMode);
    }
    if (json.defaultValueDistanceIsSet) {
      builder.defaultValueDistance(json.defaultValueDistance);
    }
    if (json.defaultValueDateTimeIsSet) {
      builder.defaultValueDateTime(json.defaultValueDateTime);
    }
    if (json.defaultValueContactPointIsSet) {
      builder.defaultValueContactPoint(json.defaultValueContactPoint);
    }
    if (json.defaultValueAgeIsSet) {
      builder.defaultValueAge(json.defaultValueAge);
    }
    if (json.defaultValueRangeIsSet) {
      builder.defaultValueRange(json.defaultValueRange);
    }
    if (json.defaultValueCountIsSet) {
      builder.defaultValueCount(json.defaultValueCount);
    }
    if (json.defaultValueDataRequirementIsSet) {
      builder.defaultValueDataRequirement(json.defaultValueDataRequirement);
    }
    if (json.minIsSet) {
      builder.min(json.min);
    }
    if (json.defaultValueParameterDefinitionIsSet) {
      builder.defaultValueParameterDefinition(json.defaultValueParameterDefinition);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.defaultValueDurationIsSet) {
      builder.defaultValueDuration(json.defaultValueDuration);
    }
    if (json.defaultValueAttachmentIsSet) {
      builder.defaultValueAttachment(json.defaultValueAttachment);
    }
    if (json.defaultValueQuantityIsSet) {
      builder.defaultValueQuantity(json.defaultValueQuantity);
    }
    if (json.variableIsSet) {
      builder.variable(json.variable);
    }
    if (json.defaultValueIntegerIsSet) {
      builder.defaultValueInteger(json.defaultValueInteger);
    }
    if (json.defaultValueUriIsSet) {
      builder.defaultValueUri(json.defaultValueUri);
    }
    if (json.defaultValueCodeableConceptIsSet) {
      builder.defaultValueCodeableConcept(json.defaultValueCodeableConcept);
    }
    if (json.logMessageIsSet) {
      builder.logMessage(json.logMessage);
    }
    if (json.defaultValueCodingIsSet) {
      builder.defaultValueCoding(json.defaultValueCoding);
    }
    if (json.defaultValueHumanNameIsSet) {
      builder.defaultValueHumanName(json.defaultValueHumanName);
    }
    if (json.maxIsSet) {
      builder.max(json.max);
    }
    if (json.defaultValueInstantIsSet) {
      builder.defaultValueInstant(json.defaultValueInstant);
    }
    if (json.defaultValueRelatedArtifactIsSet) {
      builder.defaultValueRelatedArtifact(json.defaultValueRelatedArtifact);
    }
    if (json.defaultValueIdIsSet) {
      builder.defaultValueId(json.defaultValueId);
    }
    if (json.defaultValueTriggerDefinitionIsSet) {
      builder.defaultValueTriggerDefinition(json.defaultValueTriggerDefinition);
    }
    if (json.defaultValueContributorIsSet) {
      builder.defaultValueContributor(json.defaultValueContributor);
    }
    if (json.defaultValueDosageIsSet) {
      builder.defaultValueDosage(json.defaultValueDosage);
    }
    if (json.defaultValueMetaIsSet) {
      builder.defaultValueMeta(json.defaultValueMeta);
    }
    if (json.defaultValueRatioIsSet) {
      builder.defaultValueRatio(json.defaultValueRatio);
    }
    if (json.defaultValueSampledDataIsSet) {
      builder.defaultValueSampledData(json.defaultValueSampledData);
    }
    if (json.defaultValueStringIsSet) {
      builder.defaultValueString(json.defaultValueString);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.defaultValueUnsignedIntIsSet) {
      builder.defaultValueUnsignedInt(json.defaultValueUnsignedInt);
    }
    if (json.defaultValueBooleanIsSet) {
      builder.defaultValueBoolean(json.defaultValueBoolean);
    }
    if (json.defaultValueAnnotationIsSet) {
      builder.defaultValueAnnotation(json.defaultValueAnnotation);
    }
    if (json.defaultValueBase64BinaryIsSet) {
      builder.defaultValueBase64Binary(json.defaultValueBase64Binary);
    }
    if (json.defaultValueUuidIsSet) {
      builder.defaultValueUuid(json.defaultValueUuid);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.checkIsSet) {
      builder.check(json.check);
    }
    if (json.defaultValueTimeIsSet) {
      builder.defaultValueTime(json.defaultValueTime);
    }
    if (json.defaultValueCodeIsSet) {
      builder.defaultValueCode(json.defaultValueCode);
    }
    if (json.defaultValueContactDetailIsSet) {
      builder.defaultValueContactDetail(json.defaultValueContactDetail);
    }
    if (json.defaultValueExpressionIsSet) {
      builder.defaultValueExpression(json.defaultValueExpression);
    }
    if (json.defaultValueMoneyIsSet) {
      builder.defaultValueMoney(json.defaultValueMoney);
    }
    if (json.defaultValueSignatureIsSet) {
      builder.defaultValueSignature(json.defaultValueSignature);
    }
    if (json.defaultValueTimingIsSet) {
      builder.defaultValueTiming(json.defaultValueTiming);
    }
    if (json.defaultValueReferenceIsSet) {
      builder.defaultValueReference(json.defaultValueReference);
    }
    if (json.defaultValueOidIsSet) {
      builder.defaultValueOid(json.defaultValueOid);
    }
    return (ImmutableStructureMap_Source) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureMap_Source} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureMap_Source instance
   */
  public static StructureMap_Source copyOf(StructureMap_Source instance) {
    if (instance instanceof ImmutableStructureMap_Source) {
      return (ImmutableStructureMap_Source) instance;
    }
    return ImmutableStructureMap_Source.builder()
        .defaultValueUrl(instance.defaultValueUrl())
        .defaultValueMarkdown(instance.defaultValueMarkdown())
        .defaultValuePositiveInt(instance.defaultValuePositiveInt())
        .element(instance.element())
        .condition(instance.condition())
        .id(instance.id())
        .defaultValueCanonical(instance.defaultValueCanonical())
        .defaultValuePeriod(instance.defaultValuePeriod())
        .defaultValueUsageContext(instance.defaultValueUsageContext())
        .defaultValueDate(instance.defaultValueDate())
        .defaultValueAddress(instance.defaultValueAddress())
        .defaultValueDecimal(instance.defaultValueDecimal())
        .defaultValueIdentifier(instance.defaultValueIdentifier())
        .listMode(instance.listMode())
        .defaultValueDistance(instance.defaultValueDistance())
        .defaultValueDateTime(instance.defaultValueDateTime())
        .defaultValueContactPoint(instance.defaultValueContactPoint())
        .defaultValueAge(instance.defaultValueAge())
        .defaultValueRange(instance.defaultValueRange())
        .defaultValueCount(instance.defaultValueCount())
        .defaultValueDataRequirement(instance.defaultValueDataRequirement())
        .min(instance.min())
        .defaultValueParameterDefinition(instance.defaultValueParameterDefinition())
        .type(instance.type())
        .defaultValueDuration(instance.defaultValueDuration())
        .defaultValueAttachment(instance.defaultValueAttachment())
        .defaultValueQuantity(instance.defaultValueQuantity())
        .variable(instance.variable())
        .defaultValueInteger(instance.defaultValueInteger())
        .defaultValueUri(instance.defaultValueUri())
        .defaultValueCodeableConcept(instance.defaultValueCodeableConcept())
        .logMessage(instance.logMessage())
        .defaultValueCoding(instance.defaultValueCoding())
        .defaultValueHumanName(instance.defaultValueHumanName())
        .max(instance.max())
        .defaultValueInstant(instance.defaultValueInstant())
        .defaultValueRelatedArtifact(instance.defaultValueRelatedArtifact())
        .defaultValueId(instance.defaultValueId())
        .defaultValueTriggerDefinition(instance.defaultValueTriggerDefinition())
        .defaultValueContributor(instance.defaultValueContributor())
        .defaultValueDosage(instance.defaultValueDosage())
        .defaultValueMeta(instance.defaultValueMeta())
        .defaultValueRatio(instance.defaultValueRatio())
        .defaultValueSampledData(instance.defaultValueSampledData())
        .defaultValueString(instance.defaultValueString())
        .context(instance.context())
        .defaultValueUnsignedInt(instance.defaultValueUnsignedInt())
        .defaultValueBoolean(instance.defaultValueBoolean())
        .defaultValueAnnotation(instance.defaultValueAnnotation())
        .defaultValueBase64Binary(instance.defaultValueBase64Binary())
        .defaultValueUuid(instance.defaultValueUuid())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .check(instance.check())
        .defaultValueTime(instance.defaultValueTime())
        .defaultValueCode(instance.defaultValueCode())
        .defaultValueContactDetail(instance.defaultValueContactDetail())
        .defaultValueExpression(instance.defaultValueExpression())
        .defaultValueMoney(instance.defaultValueMoney())
        .defaultValueSignature(instance.defaultValueSignature())
        .defaultValueTiming(instance.defaultValueTiming())
        .defaultValueReference(instance.defaultValueReference())
        .defaultValueOid(instance.defaultValueOid())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap_Source StructureMap_Source}.
   * <pre>
   * ImmutableStructureMap_Source.builder()
   *    .defaultValueUrl(String) // optional {@link StructureMap_Source#defaultValueUrl() defaultValueUrl}
   *    .defaultValueMarkdown(String) // optional {@link StructureMap_Source#defaultValueMarkdown() defaultValueMarkdown}
   *    .defaultValuePositiveInt(Double) // optional {@link StructureMap_Source#defaultValuePositiveInt() defaultValuePositiveInt}
   *    .element(String) // optional {@link StructureMap_Source#element() element}
   *    .condition(String) // optional {@link StructureMap_Source#condition() condition}
   *    .id(String) // optional {@link StructureMap_Source#id() id}
   *    .defaultValueCanonical(String) // optional {@link StructureMap_Source#defaultValueCanonical() defaultValueCanonical}
   *    .defaultValuePeriod(com.fhir.Period) // optional {@link StructureMap_Source#defaultValuePeriod() defaultValuePeriod}
   *    .defaultValueUsageContext(com.fhir.UsageContext) // optional {@link StructureMap_Source#defaultValueUsageContext() defaultValueUsageContext}
   *    .defaultValueDate(String) // optional {@link StructureMap_Source#defaultValueDate() defaultValueDate}
   *    .defaultValueAddress(com.fhir.Address) // optional {@link StructureMap_Source#defaultValueAddress() defaultValueAddress}
   *    .defaultValueDecimal(Double) // optional {@link StructureMap_Source#defaultValueDecimal() defaultValueDecimal}
   *    .defaultValueIdentifier(com.fhir.Identifier) // optional {@link StructureMap_Source#defaultValueIdentifier() defaultValueIdentifier}
   *    .listMode(com.fhir.Structuremap_sourceListmode) // optional {@link StructureMap_Source#listMode() listMode}
   *    .defaultValueDistance(com.fhir.Distance) // optional {@link StructureMap_Source#defaultValueDistance() defaultValueDistance}
   *    .defaultValueDateTime(String) // optional {@link StructureMap_Source#defaultValueDateTime() defaultValueDateTime}
   *    .defaultValueContactPoint(com.fhir.ContactPoint) // optional {@link StructureMap_Source#defaultValueContactPoint() defaultValueContactPoint}
   *    .defaultValueAge(com.fhir.Age) // optional {@link StructureMap_Source#defaultValueAge() defaultValueAge}
   *    .defaultValueRange(com.fhir.Range) // optional {@link StructureMap_Source#defaultValueRange() defaultValueRange}
   *    .defaultValueCount(com.fhir.Count) // optional {@link StructureMap_Source#defaultValueCount() defaultValueCount}
   *    .defaultValueDataRequirement(com.fhir.DataRequirement) // optional {@link StructureMap_Source#defaultValueDataRequirement() defaultValueDataRequirement}
   *    .min(Integer) // optional {@link StructureMap_Source#min() min}
   *    .defaultValueParameterDefinition(com.fhir.ParameterDefinition) // optional {@link StructureMap_Source#defaultValueParameterDefinition() defaultValueParameterDefinition}
   *    .type(String) // optional {@link StructureMap_Source#type() type}
   *    .defaultValueDuration(com.fhir.Duration) // optional {@link StructureMap_Source#defaultValueDuration() defaultValueDuration}
   *    .defaultValueAttachment(com.fhir.Attachment) // optional {@link StructureMap_Source#defaultValueAttachment() defaultValueAttachment}
   *    .defaultValueQuantity(com.fhir.Quantity) // optional {@link StructureMap_Source#defaultValueQuantity() defaultValueQuantity}
   *    .variable(com.fhir.id) // optional {@link StructureMap_Source#variable() variable}
   *    .defaultValueInteger(Double) // optional {@link StructureMap_Source#defaultValueInteger() defaultValueInteger}
   *    .defaultValueUri(String) // optional {@link StructureMap_Source#defaultValueUri() defaultValueUri}
   *    .defaultValueCodeableConcept(com.fhir.CodeableConcept) // optional {@link StructureMap_Source#defaultValueCodeableConcept() defaultValueCodeableConcept}
   *    .logMessage(String) // optional {@link StructureMap_Source#logMessage() logMessage}
   *    .defaultValueCoding(com.fhir.Coding) // optional {@link StructureMap_Source#defaultValueCoding() defaultValueCoding}
   *    .defaultValueHumanName(com.fhir.HumanName) // optional {@link StructureMap_Source#defaultValueHumanName() defaultValueHumanName}
   *    .max(String) // optional {@link StructureMap_Source#max() max}
   *    .defaultValueInstant(String) // optional {@link StructureMap_Source#defaultValueInstant() defaultValueInstant}
   *    .defaultValueRelatedArtifact(com.fhir.RelatedArtifact) // optional {@link StructureMap_Source#defaultValueRelatedArtifact() defaultValueRelatedArtifact}
   *    .defaultValueId(String) // optional {@link StructureMap_Source#defaultValueId() defaultValueId}
   *    .defaultValueTriggerDefinition(com.fhir.TriggerDefinition) // optional {@link StructureMap_Source#defaultValueTriggerDefinition() defaultValueTriggerDefinition}
   *    .defaultValueContributor(com.fhir.Contributor) // optional {@link StructureMap_Source#defaultValueContributor() defaultValueContributor}
   *    .defaultValueDosage(com.fhir.Dosage) // optional {@link StructureMap_Source#defaultValueDosage() defaultValueDosage}
   *    .defaultValueMeta(com.fhir.Meta) // optional {@link StructureMap_Source#defaultValueMeta() defaultValueMeta}
   *    .defaultValueRatio(com.fhir.Ratio) // optional {@link StructureMap_Source#defaultValueRatio() defaultValueRatio}
   *    .defaultValueSampledData(com.fhir.SampledData) // optional {@link StructureMap_Source#defaultValueSampledData() defaultValueSampledData}
   *    .defaultValueString(String) // optional {@link StructureMap_Source#defaultValueString() defaultValueString}
   *    .context(com.fhir.id) // optional {@link StructureMap_Source#context() context}
   *    .defaultValueUnsignedInt(Double) // optional {@link StructureMap_Source#defaultValueUnsignedInt() defaultValueUnsignedInt}
   *    .defaultValueBoolean(Boolean) // optional {@link StructureMap_Source#defaultValueBoolean() defaultValueBoolean}
   *    .defaultValueAnnotation(com.fhir.Annotation) // optional {@link StructureMap_Source#defaultValueAnnotation() defaultValueAnnotation}
   *    .defaultValueBase64Binary(String) // optional {@link StructureMap_Source#defaultValueBase64Binary() defaultValueBase64Binary}
   *    .defaultValueUuid(String) // optional {@link StructureMap_Source#defaultValueUuid() defaultValueUuid}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureMap_Source#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link StructureMap_Source#extension() extension}
   *    .check(String) // optional {@link StructureMap_Source#check() check}
   *    .defaultValueTime(String) // optional {@link StructureMap_Source#defaultValueTime() defaultValueTime}
   *    .defaultValueCode(String) // optional {@link StructureMap_Source#defaultValueCode() defaultValueCode}
   *    .defaultValueContactDetail(com.fhir.ContactDetail) // optional {@link StructureMap_Source#defaultValueContactDetail() defaultValueContactDetail}
   *    .defaultValueExpression(com.fhir.Expression) // optional {@link StructureMap_Source#defaultValueExpression() defaultValueExpression}
   *    .defaultValueMoney(com.fhir.Money) // optional {@link StructureMap_Source#defaultValueMoney() defaultValueMoney}
   *    .defaultValueSignature(com.fhir.Signature) // optional {@link StructureMap_Source#defaultValueSignature() defaultValueSignature}
   *    .defaultValueTiming(com.fhir.Timing) // optional {@link StructureMap_Source#defaultValueTiming() defaultValueTiming}
   *    .defaultValueReference(com.fhir.Reference) // optional {@link StructureMap_Source#defaultValueReference() defaultValueReference}
   *    .defaultValueOid(String) // optional {@link StructureMap_Source#defaultValueOid() defaultValueOid}
   *    .build();
   * </pre>
   * @return A new StructureMap_Source builder
   */
  public static ImmutableStructureMap_Source.Builder builder() {
    return new ImmutableStructureMap_Source.Builder();
  }

  /**
   * Builds instances of type {@link StructureMap_Source StructureMap_Source}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "StructureMap_Source", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DEFAULT_VALUE_URL = 0x1L;
    private static final long OPT_BIT_DEFAULT_VALUE_MARKDOWN = 0x2L;
    private static final long OPT_BIT_DEFAULT_VALUE_POSITIVE_INT = 0x4L;
    private static final long OPT_BIT_ELEMENT = 0x8L;
    private static final long OPT_BIT_CONDITION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_DEFAULT_VALUE_CANONICAL = 0x40L;
    private static final long OPT_BIT_DEFAULT_VALUE_PERIOD = 0x80L;
    private static final long OPT_BIT_DEFAULT_VALUE_USAGE_CONTEXT = 0x100L;
    private static final long OPT_BIT_DEFAULT_VALUE_DATE = 0x200L;
    private static final long OPT_BIT_DEFAULT_VALUE_ADDRESS = 0x400L;
    private static final long OPT_BIT_DEFAULT_VALUE_DECIMAL = 0x800L;
    private static final long OPT_BIT_DEFAULT_VALUE_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_LIST_MODE = 0x2000L;
    private static final long OPT_BIT_DEFAULT_VALUE_DISTANCE = 0x4000L;
    private static final long OPT_BIT_DEFAULT_VALUE_DATE_TIME = 0x8000L;
    private static final long OPT_BIT_DEFAULT_VALUE_CONTACT_POINT = 0x10000L;
    private static final long OPT_BIT_DEFAULT_VALUE_AGE = 0x20000L;
    private static final long OPT_BIT_DEFAULT_VALUE_RANGE = 0x40000L;
    private static final long OPT_BIT_DEFAULT_VALUE_COUNT = 0x80000L;
    private static final long OPT_BIT_DEFAULT_VALUE_DATA_REQUIREMENT = 0x100000L;
    private static final long OPT_BIT_MIN = 0x200000L;
    private static final long OPT_BIT_DEFAULT_VALUE_PARAMETER_DEFINITION = 0x400000L;
    private static final long OPT_BIT_TYPE = 0x800000L;
    private static final long OPT_BIT_DEFAULT_VALUE_DURATION = 0x1000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_ATTACHMENT = 0x2000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_QUANTITY = 0x4000000L;
    private static final long OPT_BIT_VARIABLE = 0x8000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_INTEGER = 0x10000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_URI = 0x20000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_CODEABLE_CONCEPT = 0x40000000L;
    private static final long OPT_BIT_LOG_MESSAGE = 0x80000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_CODING = 0x100000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_HUMAN_NAME = 0x200000000L;
    private static final long OPT_BIT_MAX = 0x400000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_INSTANT = 0x800000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_RELATED_ARTIFACT = 0x1000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_ID = 0x2000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_TRIGGER_DEFINITION = 0x4000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_CONTRIBUTOR = 0x8000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_DOSAGE = 0x10000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_META = 0x20000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_RATIO = 0x40000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_SAMPLED_DATA = 0x80000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_STRING = 0x100000000000L;
    private static final long OPT_BIT_CONTEXT = 0x200000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_UNSIGNED_INT = 0x400000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_BOOLEAN = 0x800000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_ANNOTATION = 0x1000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_BASE64_BINARY = 0x2000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_UUID = 0x4000000000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8000000000000L;
    private static final long OPT_BIT_EXTENSION = 0x10000000000000L;
    private static final long OPT_BIT_CHECK = 0x20000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_TIME = 0x40000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_CODE = 0x80000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_CONTACT_DETAIL = 0x100000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_EXPRESSION = 0x200000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_MONEY = 0x400000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_SIGNATURE = 0x800000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_TIMING = 0x1000000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_REFERENCE = 0x2000000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_OID = 0x4000000000000000L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String defaultValueUrl;
    private @javax.annotation.Nullable java.lang.String defaultValueMarkdown;
    private @javax.annotation.Nullable java.lang.Double defaultValuePositiveInt;
    private @javax.annotation.Nullable java.lang.String element;
    private @javax.annotation.Nullable java.lang.String condition;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String defaultValueCanonical;
    private @javax.annotation.Nullable com.fhir.Period defaultValuePeriod;
    private @javax.annotation.Nullable com.fhir.UsageContext defaultValueUsageContext;
    private @javax.annotation.Nullable java.lang.String defaultValueDate;
    private @javax.annotation.Nullable com.fhir.Address defaultValueAddress;
    private @javax.annotation.Nullable java.lang.Double defaultValueDecimal;
    private @javax.annotation.Nullable com.fhir.Identifier defaultValueIdentifier;
    private @javax.annotation.Nullable com.fhir.Structuremap_sourceListmode listMode;
    private @javax.annotation.Nullable com.fhir.Distance defaultValueDistance;
    private @javax.annotation.Nullable java.lang.String defaultValueDateTime;
    private @javax.annotation.Nullable com.fhir.ContactPoint defaultValueContactPoint;
    private @javax.annotation.Nullable com.fhir.Age defaultValueAge;
    private @javax.annotation.Nullable com.fhir.Range defaultValueRange;
    private @javax.annotation.Nullable com.fhir.Count defaultValueCount;
    private @javax.annotation.Nullable com.fhir.DataRequirement defaultValueDataRequirement;
    private @javax.annotation.Nullable java.lang.Integer min;
    private @javax.annotation.Nullable com.fhir.ParameterDefinition defaultValueParameterDefinition;
    private @javax.annotation.Nullable java.lang.String type;
    private @javax.annotation.Nullable com.fhir.Duration defaultValueDuration;
    private @javax.annotation.Nullable com.fhir.Attachment defaultValueAttachment;
    private @javax.annotation.Nullable com.fhir.Quantity defaultValueQuantity;
    private @javax.annotation.Nullable com.fhir.id variable;
    private @javax.annotation.Nullable java.lang.Double defaultValueInteger;
    private @javax.annotation.Nullable java.lang.String defaultValueUri;
    private @javax.annotation.Nullable com.fhir.CodeableConcept defaultValueCodeableConcept;
    private @javax.annotation.Nullable java.lang.String logMessage;
    private @javax.annotation.Nullable com.fhir.Coding defaultValueCoding;
    private @javax.annotation.Nullable com.fhir.HumanName defaultValueHumanName;
    private @javax.annotation.Nullable java.lang.String max;
    private @javax.annotation.Nullable java.lang.String defaultValueInstant;
    private @javax.annotation.Nullable com.fhir.RelatedArtifact defaultValueRelatedArtifact;
    private @javax.annotation.Nullable java.lang.String defaultValueId;
    private @javax.annotation.Nullable com.fhir.TriggerDefinition defaultValueTriggerDefinition;
    private @javax.annotation.Nullable com.fhir.Contributor defaultValueContributor;
    private @javax.annotation.Nullable com.fhir.Dosage defaultValueDosage;
    private @javax.annotation.Nullable com.fhir.Meta defaultValueMeta;
    private @javax.annotation.Nullable com.fhir.Ratio defaultValueRatio;
    private @javax.annotation.Nullable com.fhir.SampledData defaultValueSampledData;
    private @javax.annotation.Nullable java.lang.String defaultValueString;
    private @javax.annotation.Nullable com.fhir.id context;
    private @javax.annotation.Nullable java.lang.Double defaultValueUnsignedInt;
    private @javax.annotation.Nullable java.lang.Boolean defaultValueBoolean;
    private @javax.annotation.Nullable com.fhir.Annotation defaultValueAnnotation;
    private @javax.annotation.Nullable java.lang.String defaultValueBase64Binary;
    private @javax.annotation.Nullable java.lang.String defaultValueUuid;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String check;
    private @javax.annotation.Nullable java.lang.String defaultValueTime;
    private @javax.annotation.Nullable java.lang.String defaultValueCode;
    private @javax.annotation.Nullable com.fhir.ContactDetail defaultValueContactDetail;
    private @javax.annotation.Nullable com.fhir.Expression defaultValueExpression;
    private @javax.annotation.Nullable com.fhir.Money defaultValueMoney;
    private @javax.annotation.Nullable com.fhir.Signature defaultValueSignature;
    private @javax.annotation.Nullable com.fhir.Timing defaultValueTiming;
    private @javax.annotation.Nullable com.fhir.Reference defaultValueReference;
    private @javax.annotation.Nullable java.lang.String defaultValueOid;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUrl() defaultValueUrl} to defaultValueUrl.
     * @param defaultValueUrl The value for defaultValueUrl
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueUrl(java.lang.String defaultValueUrl) {
      checkNotIsSet(defaultValueUrlIsSet(), "defaultValueUrl");
      this.defaultValueUrl = java.util.Objects.requireNonNull(defaultValueUrl, "defaultValueUrl");
      optBits |= OPT_BIT_DEFAULT_VALUE_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUrl() defaultValueUrl} to defaultValueUrl.
     * @param defaultValueUrl The value for defaultValueUrl
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUrl")
    public final Builder defaultValueUrl(java.util.Optional<java.lang.String> defaultValueUrl) {
      checkNotIsSet(defaultValueUrlIsSet(), "defaultValueUrl");
      this.defaultValueUrl = defaultValueUrl.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueMarkdown() defaultValueMarkdown} to defaultValueMarkdown.
     * @param defaultValueMarkdown The value for defaultValueMarkdown
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueMarkdown(java.lang.String defaultValueMarkdown) {
      checkNotIsSet(defaultValueMarkdownIsSet(), "defaultValueMarkdown");
      this.defaultValueMarkdown = java.util.Objects.requireNonNull(defaultValueMarkdown, "defaultValueMarkdown");
      optBits |= OPT_BIT_DEFAULT_VALUE_MARKDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueMarkdown() defaultValueMarkdown} to defaultValueMarkdown.
     * @param defaultValueMarkdown The value for defaultValueMarkdown
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueMarkdown")
    public final Builder defaultValueMarkdown(java.util.Optional<java.lang.String> defaultValueMarkdown) {
      checkNotIsSet(defaultValueMarkdownIsSet(), "defaultValueMarkdown");
      this.defaultValueMarkdown = defaultValueMarkdown.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_MARKDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValuePositiveInt() defaultValuePositiveInt} to defaultValuePositiveInt.
     * @param defaultValuePositiveInt The value for defaultValuePositiveInt
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValuePositiveInt(double defaultValuePositiveInt) {
      checkNotIsSet(defaultValuePositiveIntIsSet(), "defaultValuePositiveInt");
      this.defaultValuePositiveInt = defaultValuePositiveInt;
      optBits |= OPT_BIT_DEFAULT_VALUE_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValuePositiveInt() defaultValuePositiveInt} to defaultValuePositiveInt.
     * @param defaultValuePositiveInt The value for defaultValuePositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValuePositiveInt")
    public final Builder defaultValuePositiveInt(java.util.Optional<java.lang.Double> defaultValuePositiveInt) {
      checkNotIsSet(defaultValuePositiveIntIsSet(), "defaultValuePositiveInt");
      this.defaultValuePositiveInt = defaultValuePositiveInt.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#element() element} to element.
     * @param element The value for element
     * @return {@code this} builder for chained invocation
     */
    public final Builder element(java.lang.String element) {
      checkNotIsSet(elementIsSet(), "element");
      this.element = java.util.Objects.requireNonNull(element, "element");
      optBits |= OPT_BIT_ELEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#element() element} to element.
     * @param element The value for element
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("element")
    public final Builder element(java.util.Optional<java.lang.String> element) {
      checkNotIsSet(elementIsSet(), "element");
      this.element = element.orElse(null);
      optBits |= OPT_BIT_ELEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(java.lang.String condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = java.util.Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public final Builder condition(java.util.Optional<java.lang.String> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Source#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Source#defaultValueCanonical() defaultValueCanonical} to defaultValueCanonical.
     * @param defaultValueCanonical The value for defaultValueCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueCanonical(java.lang.String defaultValueCanonical) {
      checkNotIsSet(defaultValueCanonicalIsSet(), "defaultValueCanonical");
      this.defaultValueCanonical = java.util.Objects.requireNonNull(defaultValueCanonical, "defaultValueCanonical");
      optBits |= OPT_BIT_DEFAULT_VALUE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCanonical() defaultValueCanonical} to defaultValueCanonical.
     * @param defaultValueCanonical The value for defaultValueCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCanonical")
    public final Builder defaultValueCanonical(java.util.Optional<java.lang.String> defaultValueCanonical) {
      checkNotIsSet(defaultValueCanonicalIsSet(), "defaultValueCanonical");
      this.defaultValueCanonical = defaultValueCanonical.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValuePeriod() defaultValuePeriod} to defaultValuePeriod.
     * @param defaultValuePeriod The value for defaultValuePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValuePeriod(com.fhir.Period defaultValuePeriod) {
      checkNotIsSet(defaultValuePeriodIsSet(), "defaultValuePeriod");
      this.defaultValuePeriod = java.util.Objects.requireNonNull(defaultValuePeriod, "defaultValuePeriod");
      optBits |= OPT_BIT_DEFAULT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValuePeriod() defaultValuePeriod} to defaultValuePeriod.
     * @param defaultValuePeriod The value for defaultValuePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValuePeriod")
    public final Builder defaultValuePeriod(java.util.Optional<? extends com.fhir.Period> defaultValuePeriod) {
      checkNotIsSet(defaultValuePeriodIsSet(), "defaultValuePeriod");
      this.defaultValuePeriod = defaultValuePeriod.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUsageContext() defaultValueUsageContext} to defaultValueUsageContext.
     * @param defaultValueUsageContext The value for defaultValueUsageContext
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueUsageContext(com.fhir.UsageContext defaultValueUsageContext) {
      checkNotIsSet(defaultValueUsageContextIsSet(), "defaultValueUsageContext");
      this.defaultValueUsageContext = java.util.Objects.requireNonNull(defaultValueUsageContext, "defaultValueUsageContext");
      optBits |= OPT_BIT_DEFAULT_VALUE_USAGE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUsageContext() defaultValueUsageContext} to defaultValueUsageContext.
     * @param defaultValueUsageContext The value for defaultValueUsageContext
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUsageContext")
    public final Builder defaultValueUsageContext(java.util.Optional<? extends com.fhir.UsageContext> defaultValueUsageContext) {
      checkNotIsSet(defaultValueUsageContextIsSet(), "defaultValueUsageContext");
      this.defaultValueUsageContext = defaultValueUsageContext.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_USAGE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDate() defaultValueDate} to defaultValueDate.
     * @param defaultValueDate The value for defaultValueDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDate(java.lang.String defaultValueDate) {
      checkNotIsSet(defaultValueDateIsSet(), "defaultValueDate");
      this.defaultValueDate = java.util.Objects.requireNonNull(defaultValueDate, "defaultValueDate");
      optBits |= OPT_BIT_DEFAULT_VALUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDate() defaultValueDate} to defaultValueDate.
     * @param defaultValueDate The value for defaultValueDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDate")
    public final Builder defaultValueDate(java.util.Optional<java.lang.String> defaultValueDate) {
      checkNotIsSet(defaultValueDateIsSet(), "defaultValueDate");
      this.defaultValueDate = defaultValueDate.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAddress() defaultValueAddress} to defaultValueAddress.
     * @param defaultValueAddress The value for defaultValueAddress
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueAddress(com.fhir.Address defaultValueAddress) {
      checkNotIsSet(defaultValueAddressIsSet(), "defaultValueAddress");
      this.defaultValueAddress = java.util.Objects.requireNonNull(defaultValueAddress, "defaultValueAddress");
      optBits |= OPT_BIT_DEFAULT_VALUE_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAddress() defaultValueAddress} to defaultValueAddress.
     * @param defaultValueAddress The value for defaultValueAddress
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueAddress")
    public final Builder defaultValueAddress(java.util.Optional<? extends com.fhir.Address> defaultValueAddress) {
      checkNotIsSet(defaultValueAddressIsSet(), "defaultValueAddress");
      this.defaultValueAddress = defaultValueAddress.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDecimal() defaultValueDecimal} to defaultValueDecimal.
     * @param defaultValueDecimal The value for defaultValueDecimal
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDecimal(double defaultValueDecimal) {
      checkNotIsSet(defaultValueDecimalIsSet(), "defaultValueDecimal");
      this.defaultValueDecimal = defaultValueDecimal;
      optBits |= OPT_BIT_DEFAULT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDecimal() defaultValueDecimal} to defaultValueDecimal.
     * @param defaultValueDecimal The value for defaultValueDecimal
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDecimal")
    public final Builder defaultValueDecimal(java.util.Optional<java.lang.Double> defaultValueDecimal) {
      checkNotIsSet(defaultValueDecimalIsSet(), "defaultValueDecimal");
      this.defaultValueDecimal = defaultValueDecimal.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueIdentifier() defaultValueIdentifier} to defaultValueIdentifier.
     * @param defaultValueIdentifier The value for defaultValueIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueIdentifier(com.fhir.Identifier defaultValueIdentifier) {
      checkNotIsSet(defaultValueIdentifierIsSet(), "defaultValueIdentifier");
      this.defaultValueIdentifier = java.util.Objects.requireNonNull(defaultValueIdentifier, "defaultValueIdentifier");
      optBits |= OPT_BIT_DEFAULT_VALUE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueIdentifier() defaultValueIdentifier} to defaultValueIdentifier.
     * @param defaultValueIdentifier The value for defaultValueIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueIdentifier")
    public final Builder defaultValueIdentifier(java.util.Optional<? extends com.fhir.Identifier> defaultValueIdentifier) {
      checkNotIsSet(defaultValueIdentifierIsSet(), "defaultValueIdentifier");
      this.defaultValueIdentifier = defaultValueIdentifier.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#listMode() listMode} to listMode.
     * @param listMode The value for listMode
     * @return {@code this} builder for chained invocation
     */
    public final Builder listMode(com.fhir.Structuremap_sourceListmode listMode) {
      checkNotIsSet(listModeIsSet(), "listMode");
      this.listMode = java.util.Objects.requireNonNull(listMode, "listMode");
      optBits |= OPT_BIT_LIST_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#listMode() listMode} to listMode.
     * @param listMode The value for listMode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listMode")
    public final Builder listMode(java.util.Optional<? extends com.fhir.Structuremap_sourceListmode> listMode) {
      checkNotIsSet(listModeIsSet(), "listMode");
      this.listMode = listMode.orElse(null);
      optBits |= OPT_BIT_LIST_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDistance() defaultValueDistance} to defaultValueDistance.
     * @param defaultValueDistance The value for defaultValueDistance
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDistance(com.fhir.Distance defaultValueDistance) {
      checkNotIsSet(defaultValueDistanceIsSet(), "defaultValueDistance");
      this.defaultValueDistance = java.util.Objects.requireNonNull(defaultValueDistance, "defaultValueDistance");
      optBits |= OPT_BIT_DEFAULT_VALUE_DISTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDistance() defaultValueDistance} to defaultValueDistance.
     * @param defaultValueDistance The value for defaultValueDistance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDistance")
    public final Builder defaultValueDistance(java.util.Optional<? extends com.fhir.Distance> defaultValueDistance) {
      checkNotIsSet(defaultValueDistanceIsSet(), "defaultValueDistance");
      this.defaultValueDistance = defaultValueDistance.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DISTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDateTime() defaultValueDateTime} to defaultValueDateTime.
     * @param defaultValueDateTime The value for defaultValueDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDateTime(java.lang.String defaultValueDateTime) {
      checkNotIsSet(defaultValueDateTimeIsSet(), "defaultValueDateTime");
      this.defaultValueDateTime = java.util.Objects.requireNonNull(defaultValueDateTime, "defaultValueDateTime");
      optBits |= OPT_BIT_DEFAULT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDateTime() defaultValueDateTime} to defaultValueDateTime.
     * @param defaultValueDateTime The value for defaultValueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDateTime")
    public final Builder defaultValueDateTime(java.util.Optional<java.lang.String> defaultValueDateTime) {
      checkNotIsSet(defaultValueDateTimeIsSet(), "defaultValueDateTime");
      this.defaultValueDateTime = defaultValueDateTime.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueContactPoint() defaultValueContactPoint} to defaultValueContactPoint.
     * @param defaultValueContactPoint The value for defaultValueContactPoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueContactPoint(com.fhir.ContactPoint defaultValueContactPoint) {
      checkNotIsSet(defaultValueContactPointIsSet(), "defaultValueContactPoint");
      this.defaultValueContactPoint = java.util.Objects.requireNonNull(defaultValueContactPoint, "defaultValueContactPoint");
      optBits |= OPT_BIT_DEFAULT_VALUE_CONTACT_POINT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueContactPoint() defaultValueContactPoint} to defaultValueContactPoint.
     * @param defaultValueContactPoint The value for defaultValueContactPoint
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueContactPoint")
    public final Builder defaultValueContactPoint(java.util.Optional<? extends com.fhir.ContactPoint> defaultValueContactPoint) {
      checkNotIsSet(defaultValueContactPointIsSet(), "defaultValueContactPoint");
      this.defaultValueContactPoint = defaultValueContactPoint.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CONTACT_POINT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAge() defaultValueAge} to defaultValueAge.
     * @param defaultValueAge The value for defaultValueAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueAge(com.fhir.Age defaultValueAge) {
      checkNotIsSet(defaultValueAgeIsSet(), "defaultValueAge");
      this.defaultValueAge = java.util.Objects.requireNonNull(defaultValueAge, "defaultValueAge");
      optBits |= OPT_BIT_DEFAULT_VALUE_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAge() defaultValueAge} to defaultValueAge.
     * @param defaultValueAge The value for defaultValueAge
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueAge")
    public final Builder defaultValueAge(java.util.Optional<? extends com.fhir.Age> defaultValueAge) {
      checkNotIsSet(defaultValueAgeIsSet(), "defaultValueAge");
      this.defaultValueAge = defaultValueAge.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueRange() defaultValueRange} to defaultValueRange.
     * @param defaultValueRange The value for defaultValueRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueRange(com.fhir.Range defaultValueRange) {
      checkNotIsSet(defaultValueRangeIsSet(), "defaultValueRange");
      this.defaultValueRange = java.util.Objects.requireNonNull(defaultValueRange, "defaultValueRange");
      optBits |= OPT_BIT_DEFAULT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueRange() defaultValueRange} to defaultValueRange.
     * @param defaultValueRange The value for defaultValueRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueRange")
    public final Builder defaultValueRange(java.util.Optional<? extends com.fhir.Range> defaultValueRange) {
      checkNotIsSet(defaultValueRangeIsSet(), "defaultValueRange");
      this.defaultValueRange = defaultValueRange.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCount() defaultValueCount} to defaultValueCount.
     * @param defaultValueCount The value for defaultValueCount
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueCount(com.fhir.Count defaultValueCount) {
      checkNotIsSet(defaultValueCountIsSet(), "defaultValueCount");
      this.defaultValueCount = java.util.Objects.requireNonNull(defaultValueCount, "defaultValueCount");
      optBits |= OPT_BIT_DEFAULT_VALUE_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCount() defaultValueCount} to defaultValueCount.
     * @param defaultValueCount The value for defaultValueCount
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCount")
    public final Builder defaultValueCount(java.util.Optional<? extends com.fhir.Count> defaultValueCount) {
      checkNotIsSet(defaultValueCountIsSet(), "defaultValueCount");
      this.defaultValueCount = defaultValueCount.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDataRequirement() defaultValueDataRequirement} to defaultValueDataRequirement.
     * @param defaultValueDataRequirement The value for defaultValueDataRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDataRequirement(com.fhir.DataRequirement defaultValueDataRequirement) {
      checkNotIsSet(defaultValueDataRequirementIsSet(), "defaultValueDataRequirement");
      this.defaultValueDataRequirement = java.util.Objects.requireNonNull(defaultValueDataRequirement, "defaultValueDataRequirement");
      optBits |= OPT_BIT_DEFAULT_VALUE_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDataRequirement() defaultValueDataRequirement} to defaultValueDataRequirement.
     * @param defaultValueDataRequirement The value for defaultValueDataRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDataRequirement")
    public final Builder defaultValueDataRequirement(java.util.Optional<? extends com.fhir.DataRequirement> defaultValueDataRequirement) {
      checkNotIsSet(defaultValueDataRequirementIsSet(), "defaultValueDataRequirement");
      this.defaultValueDataRequirement = defaultValueDataRequirement.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#min() min} to min.
     * @param min The value for min
     * @return {@code this} builder for chained invocation
     */
    public final Builder min(int min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = min;
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#min() min} to min.
     * @param min The value for min
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    public final Builder min(java.util.Optional<java.lang.Integer> min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = min.orElse(null);
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueParameterDefinition() defaultValueParameterDefinition} to defaultValueParameterDefinition.
     * @param defaultValueParameterDefinition The value for defaultValueParameterDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueParameterDefinition(com.fhir.ParameterDefinition defaultValueParameterDefinition) {
      checkNotIsSet(defaultValueParameterDefinitionIsSet(), "defaultValueParameterDefinition");
      this.defaultValueParameterDefinition = java.util.Objects.requireNonNull(defaultValueParameterDefinition, "defaultValueParameterDefinition");
      optBits |= OPT_BIT_DEFAULT_VALUE_PARAMETER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueParameterDefinition() defaultValueParameterDefinition} to defaultValueParameterDefinition.
     * @param defaultValueParameterDefinition The value for defaultValueParameterDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueParameterDefinition")
    public final Builder defaultValueParameterDefinition(java.util.Optional<? extends com.fhir.ParameterDefinition> defaultValueParameterDefinition) {
      checkNotIsSet(defaultValueParameterDefinitionIsSet(), "defaultValueParameterDefinition");
      this.defaultValueParameterDefinition = defaultValueParameterDefinition.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_PARAMETER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(java.lang.String type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<java.lang.String> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDuration() defaultValueDuration} to defaultValueDuration.
     * @param defaultValueDuration The value for defaultValueDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDuration(com.fhir.Duration defaultValueDuration) {
      checkNotIsSet(defaultValueDurationIsSet(), "defaultValueDuration");
      this.defaultValueDuration = java.util.Objects.requireNonNull(defaultValueDuration, "defaultValueDuration");
      optBits |= OPT_BIT_DEFAULT_VALUE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDuration() defaultValueDuration} to defaultValueDuration.
     * @param defaultValueDuration The value for defaultValueDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDuration")
    public final Builder defaultValueDuration(java.util.Optional<? extends com.fhir.Duration> defaultValueDuration) {
      checkNotIsSet(defaultValueDurationIsSet(), "defaultValueDuration");
      this.defaultValueDuration = defaultValueDuration.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAttachment() defaultValueAttachment} to defaultValueAttachment.
     * @param defaultValueAttachment The value for defaultValueAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueAttachment(com.fhir.Attachment defaultValueAttachment) {
      checkNotIsSet(defaultValueAttachmentIsSet(), "defaultValueAttachment");
      this.defaultValueAttachment = java.util.Objects.requireNonNull(defaultValueAttachment, "defaultValueAttachment");
      optBits |= OPT_BIT_DEFAULT_VALUE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAttachment() defaultValueAttachment} to defaultValueAttachment.
     * @param defaultValueAttachment The value for defaultValueAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueAttachment")
    public final Builder defaultValueAttachment(java.util.Optional<? extends com.fhir.Attachment> defaultValueAttachment) {
      checkNotIsSet(defaultValueAttachmentIsSet(), "defaultValueAttachment");
      this.defaultValueAttachment = defaultValueAttachment.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueQuantity() defaultValueQuantity} to defaultValueQuantity.
     * @param defaultValueQuantity The value for defaultValueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueQuantity(com.fhir.Quantity defaultValueQuantity) {
      checkNotIsSet(defaultValueQuantityIsSet(), "defaultValueQuantity");
      this.defaultValueQuantity = java.util.Objects.requireNonNull(defaultValueQuantity, "defaultValueQuantity");
      optBits |= OPT_BIT_DEFAULT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueQuantity() defaultValueQuantity} to defaultValueQuantity.
     * @param defaultValueQuantity The value for defaultValueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueQuantity")
    public final Builder defaultValueQuantity(java.util.Optional<? extends com.fhir.Quantity> defaultValueQuantity) {
      checkNotIsSet(defaultValueQuantityIsSet(), "defaultValueQuantity");
      this.defaultValueQuantity = defaultValueQuantity.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for chained invocation
     */
    public final Builder variable(com.fhir.id variable) {
      checkNotIsSet(variableIsSet(), "variable");
      this.variable = java.util.Objects.requireNonNull(variable, "variable");
      optBits |= OPT_BIT_VARIABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("variable")
    public final Builder variable(java.util.Optional<? extends com.fhir.id> variable) {
      checkNotIsSet(variableIsSet(), "variable");
      this.variable = variable.orElse(null);
      optBits |= OPT_BIT_VARIABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueInteger() defaultValueInteger} to defaultValueInteger.
     * @param defaultValueInteger The value for defaultValueInteger
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueInteger(double defaultValueInteger) {
      checkNotIsSet(defaultValueIntegerIsSet(), "defaultValueInteger");
      this.defaultValueInteger = defaultValueInteger;
      optBits |= OPT_BIT_DEFAULT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueInteger() defaultValueInteger} to defaultValueInteger.
     * @param defaultValueInteger The value for defaultValueInteger
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueInteger")
    public final Builder defaultValueInteger(java.util.Optional<java.lang.Double> defaultValueInteger) {
      checkNotIsSet(defaultValueIntegerIsSet(), "defaultValueInteger");
      this.defaultValueInteger = defaultValueInteger.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUri() defaultValueUri} to defaultValueUri.
     * @param defaultValueUri The value for defaultValueUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueUri(java.lang.String defaultValueUri) {
      checkNotIsSet(defaultValueUriIsSet(), "defaultValueUri");
      this.defaultValueUri = java.util.Objects.requireNonNull(defaultValueUri, "defaultValueUri");
      optBits |= OPT_BIT_DEFAULT_VALUE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUri() defaultValueUri} to defaultValueUri.
     * @param defaultValueUri The value for defaultValueUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUri")
    public final Builder defaultValueUri(java.util.Optional<java.lang.String> defaultValueUri) {
      checkNotIsSet(defaultValueUriIsSet(), "defaultValueUri");
      this.defaultValueUri = defaultValueUri.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCodeableConcept() defaultValueCodeableConcept} to defaultValueCodeableConcept.
     * @param defaultValueCodeableConcept The value for defaultValueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueCodeableConcept(com.fhir.CodeableConcept defaultValueCodeableConcept) {
      checkNotIsSet(defaultValueCodeableConceptIsSet(), "defaultValueCodeableConcept");
      this.defaultValueCodeableConcept = java.util.Objects.requireNonNull(defaultValueCodeableConcept, "defaultValueCodeableConcept");
      optBits |= OPT_BIT_DEFAULT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCodeableConcept() defaultValueCodeableConcept} to defaultValueCodeableConcept.
     * @param defaultValueCodeableConcept The value for defaultValueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCodeableConcept")
    public final Builder defaultValueCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> defaultValueCodeableConcept) {
      checkNotIsSet(defaultValueCodeableConceptIsSet(), "defaultValueCodeableConcept");
      this.defaultValueCodeableConcept = defaultValueCodeableConcept.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#logMessage() logMessage} to logMessage.
     * @param logMessage The value for logMessage
     * @return {@code this} builder for chained invocation
     */
    public final Builder logMessage(java.lang.String logMessage) {
      checkNotIsSet(logMessageIsSet(), "logMessage");
      this.logMessage = java.util.Objects.requireNonNull(logMessage, "logMessage");
      optBits |= OPT_BIT_LOG_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#logMessage() logMessage} to logMessage.
     * @param logMessage The value for logMessage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logMessage")
    public final Builder logMessage(java.util.Optional<java.lang.String> logMessage) {
      checkNotIsSet(logMessageIsSet(), "logMessage");
      this.logMessage = logMessage.orElse(null);
      optBits |= OPT_BIT_LOG_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCoding() defaultValueCoding} to defaultValueCoding.
     * @param defaultValueCoding The value for defaultValueCoding
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueCoding(com.fhir.Coding defaultValueCoding) {
      checkNotIsSet(defaultValueCodingIsSet(), "defaultValueCoding");
      this.defaultValueCoding = java.util.Objects.requireNonNull(defaultValueCoding, "defaultValueCoding");
      optBits |= OPT_BIT_DEFAULT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCoding() defaultValueCoding} to defaultValueCoding.
     * @param defaultValueCoding The value for defaultValueCoding
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCoding")
    public final Builder defaultValueCoding(java.util.Optional<? extends com.fhir.Coding> defaultValueCoding) {
      checkNotIsSet(defaultValueCodingIsSet(), "defaultValueCoding");
      this.defaultValueCoding = defaultValueCoding.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueHumanName() defaultValueHumanName} to defaultValueHumanName.
     * @param defaultValueHumanName The value for defaultValueHumanName
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueHumanName(com.fhir.HumanName defaultValueHumanName) {
      checkNotIsSet(defaultValueHumanNameIsSet(), "defaultValueHumanName");
      this.defaultValueHumanName = java.util.Objects.requireNonNull(defaultValueHumanName, "defaultValueHumanName");
      optBits |= OPT_BIT_DEFAULT_VALUE_HUMAN_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueHumanName() defaultValueHumanName} to defaultValueHumanName.
     * @param defaultValueHumanName The value for defaultValueHumanName
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueHumanName")
    public final Builder defaultValueHumanName(java.util.Optional<? extends com.fhir.HumanName> defaultValueHumanName) {
      checkNotIsSet(defaultValueHumanNameIsSet(), "defaultValueHumanName");
      this.defaultValueHumanName = defaultValueHumanName.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_HUMAN_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#max() max} to max.
     * @param max The value for max
     * @return {@code this} builder for chained invocation
     */
    public final Builder max(java.lang.String max) {
      checkNotIsSet(maxIsSet(), "max");
      this.max = java.util.Objects.requireNonNull(max, "max");
      optBits |= OPT_BIT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#max() max} to max.
     * @param max The value for max
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    public final Builder max(java.util.Optional<java.lang.String> max) {
      checkNotIsSet(maxIsSet(), "max");
      this.max = max.orElse(null);
      optBits |= OPT_BIT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueInstant() defaultValueInstant} to defaultValueInstant.
     * @param defaultValueInstant The value for defaultValueInstant
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueInstant(java.lang.String defaultValueInstant) {
      checkNotIsSet(defaultValueInstantIsSet(), "defaultValueInstant");
      this.defaultValueInstant = java.util.Objects.requireNonNull(defaultValueInstant, "defaultValueInstant");
      optBits |= OPT_BIT_DEFAULT_VALUE_INSTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueInstant() defaultValueInstant} to defaultValueInstant.
     * @param defaultValueInstant The value for defaultValueInstant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueInstant")
    public final Builder defaultValueInstant(java.util.Optional<java.lang.String> defaultValueInstant) {
      checkNotIsSet(defaultValueInstantIsSet(), "defaultValueInstant");
      this.defaultValueInstant = defaultValueInstant.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_INSTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueRelatedArtifact() defaultValueRelatedArtifact} to defaultValueRelatedArtifact.
     * @param defaultValueRelatedArtifact The value for defaultValueRelatedArtifact
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueRelatedArtifact(com.fhir.RelatedArtifact defaultValueRelatedArtifact) {
      checkNotIsSet(defaultValueRelatedArtifactIsSet(), "defaultValueRelatedArtifact");
      this.defaultValueRelatedArtifact = java.util.Objects.requireNonNull(defaultValueRelatedArtifact, "defaultValueRelatedArtifact");
      optBits |= OPT_BIT_DEFAULT_VALUE_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueRelatedArtifact() defaultValueRelatedArtifact} to defaultValueRelatedArtifact.
     * @param defaultValueRelatedArtifact The value for defaultValueRelatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueRelatedArtifact")
    public final Builder defaultValueRelatedArtifact(java.util.Optional<? extends com.fhir.RelatedArtifact> defaultValueRelatedArtifact) {
      checkNotIsSet(defaultValueRelatedArtifactIsSet(), "defaultValueRelatedArtifact");
      this.defaultValueRelatedArtifact = defaultValueRelatedArtifact.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueId() defaultValueId} to defaultValueId.
     * @param defaultValueId The value for defaultValueId
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueId(java.lang.String defaultValueId) {
      checkNotIsSet(defaultValueIdIsSet(), "defaultValueId");
      this.defaultValueId = java.util.Objects.requireNonNull(defaultValueId, "defaultValueId");
      optBits |= OPT_BIT_DEFAULT_VALUE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueId() defaultValueId} to defaultValueId.
     * @param defaultValueId The value for defaultValueId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueId")
    public final Builder defaultValueId(java.util.Optional<java.lang.String> defaultValueId) {
      checkNotIsSet(defaultValueIdIsSet(), "defaultValueId");
      this.defaultValueId = defaultValueId.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueTriggerDefinition() defaultValueTriggerDefinition} to defaultValueTriggerDefinition.
     * @param defaultValueTriggerDefinition The value for defaultValueTriggerDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueTriggerDefinition(com.fhir.TriggerDefinition defaultValueTriggerDefinition) {
      checkNotIsSet(defaultValueTriggerDefinitionIsSet(), "defaultValueTriggerDefinition");
      this.defaultValueTriggerDefinition = java.util.Objects.requireNonNull(defaultValueTriggerDefinition, "defaultValueTriggerDefinition");
      optBits |= OPT_BIT_DEFAULT_VALUE_TRIGGER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueTriggerDefinition() defaultValueTriggerDefinition} to defaultValueTriggerDefinition.
     * @param defaultValueTriggerDefinition The value for defaultValueTriggerDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueTriggerDefinition")
    public final Builder defaultValueTriggerDefinition(java.util.Optional<? extends com.fhir.TriggerDefinition> defaultValueTriggerDefinition) {
      checkNotIsSet(defaultValueTriggerDefinitionIsSet(), "defaultValueTriggerDefinition");
      this.defaultValueTriggerDefinition = defaultValueTriggerDefinition.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_TRIGGER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueContributor() defaultValueContributor} to defaultValueContributor.
     * @param defaultValueContributor The value for defaultValueContributor
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueContributor(com.fhir.Contributor defaultValueContributor) {
      checkNotIsSet(defaultValueContributorIsSet(), "defaultValueContributor");
      this.defaultValueContributor = java.util.Objects.requireNonNull(defaultValueContributor, "defaultValueContributor");
      optBits |= OPT_BIT_DEFAULT_VALUE_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueContributor() defaultValueContributor} to defaultValueContributor.
     * @param defaultValueContributor The value for defaultValueContributor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueContributor")
    public final Builder defaultValueContributor(java.util.Optional<? extends com.fhir.Contributor> defaultValueContributor) {
      checkNotIsSet(defaultValueContributorIsSet(), "defaultValueContributor");
      this.defaultValueContributor = defaultValueContributor.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDosage() defaultValueDosage} to defaultValueDosage.
     * @param defaultValueDosage The value for defaultValueDosage
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDosage(com.fhir.Dosage defaultValueDosage) {
      checkNotIsSet(defaultValueDosageIsSet(), "defaultValueDosage");
      this.defaultValueDosage = java.util.Objects.requireNonNull(defaultValueDosage, "defaultValueDosage");
      optBits |= OPT_BIT_DEFAULT_VALUE_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDosage() defaultValueDosage} to defaultValueDosage.
     * @param defaultValueDosage The value for defaultValueDosage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueDosage")
    public final Builder defaultValueDosage(java.util.Optional<? extends com.fhir.Dosage> defaultValueDosage) {
      checkNotIsSet(defaultValueDosageIsSet(), "defaultValueDosage");
      this.defaultValueDosage = defaultValueDosage.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueMeta() defaultValueMeta} to defaultValueMeta.
     * @param defaultValueMeta The value for defaultValueMeta
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueMeta(com.fhir.Meta defaultValueMeta) {
      checkNotIsSet(defaultValueMetaIsSet(), "defaultValueMeta");
      this.defaultValueMeta = java.util.Objects.requireNonNull(defaultValueMeta, "defaultValueMeta");
      optBits |= OPT_BIT_DEFAULT_VALUE_META;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueMeta() defaultValueMeta} to defaultValueMeta.
     * @param defaultValueMeta The value for defaultValueMeta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueMeta")
    public final Builder defaultValueMeta(java.util.Optional<? extends com.fhir.Meta> defaultValueMeta) {
      checkNotIsSet(defaultValueMetaIsSet(), "defaultValueMeta");
      this.defaultValueMeta = defaultValueMeta.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_META;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueRatio() defaultValueRatio} to defaultValueRatio.
     * @param defaultValueRatio The value for defaultValueRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueRatio(com.fhir.Ratio defaultValueRatio) {
      checkNotIsSet(defaultValueRatioIsSet(), "defaultValueRatio");
      this.defaultValueRatio = java.util.Objects.requireNonNull(defaultValueRatio, "defaultValueRatio");
      optBits |= OPT_BIT_DEFAULT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueRatio() defaultValueRatio} to defaultValueRatio.
     * @param defaultValueRatio The value for defaultValueRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueRatio")
    public final Builder defaultValueRatio(java.util.Optional<? extends com.fhir.Ratio> defaultValueRatio) {
      checkNotIsSet(defaultValueRatioIsSet(), "defaultValueRatio");
      this.defaultValueRatio = defaultValueRatio.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueSampledData() defaultValueSampledData} to defaultValueSampledData.
     * @param defaultValueSampledData The value for defaultValueSampledData
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueSampledData(com.fhir.SampledData defaultValueSampledData) {
      checkNotIsSet(defaultValueSampledDataIsSet(), "defaultValueSampledData");
      this.defaultValueSampledData = java.util.Objects.requireNonNull(defaultValueSampledData, "defaultValueSampledData");
      optBits |= OPT_BIT_DEFAULT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueSampledData() defaultValueSampledData} to defaultValueSampledData.
     * @param defaultValueSampledData The value for defaultValueSampledData
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueSampledData")
    public final Builder defaultValueSampledData(java.util.Optional<? extends com.fhir.SampledData> defaultValueSampledData) {
      checkNotIsSet(defaultValueSampledDataIsSet(), "defaultValueSampledData");
      this.defaultValueSampledData = defaultValueSampledData.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueString() defaultValueString} to defaultValueString.
     * @param defaultValueString The value for defaultValueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueString(java.lang.String defaultValueString) {
      checkNotIsSet(defaultValueStringIsSet(), "defaultValueString");
      this.defaultValueString = java.util.Objects.requireNonNull(defaultValueString, "defaultValueString");
      optBits |= OPT_BIT_DEFAULT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueString() defaultValueString} to defaultValueString.
     * @param defaultValueString The value for defaultValueString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueString")
    public final Builder defaultValueString(java.util.Optional<java.lang.String> defaultValueString) {
      checkNotIsSet(defaultValueStringIsSet(), "defaultValueString");
      this.defaultValueString = defaultValueString.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(com.fhir.id context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = java.util.Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public final Builder context(java.util.Optional<? extends com.fhir.id> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUnsignedInt() defaultValueUnsignedInt} to defaultValueUnsignedInt.
     * @param defaultValueUnsignedInt The value for defaultValueUnsignedInt
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueUnsignedInt(double defaultValueUnsignedInt) {
      checkNotIsSet(defaultValueUnsignedIntIsSet(), "defaultValueUnsignedInt");
      this.defaultValueUnsignedInt = defaultValueUnsignedInt;
      optBits |= OPT_BIT_DEFAULT_VALUE_UNSIGNED_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUnsignedInt() defaultValueUnsignedInt} to defaultValueUnsignedInt.
     * @param defaultValueUnsignedInt The value for defaultValueUnsignedInt
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUnsignedInt")
    public final Builder defaultValueUnsignedInt(java.util.Optional<java.lang.Double> defaultValueUnsignedInt) {
      checkNotIsSet(defaultValueUnsignedIntIsSet(), "defaultValueUnsignedInt");
      this.defaultValueUnsignedInt = defaultValueUnsignedInt.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_UNSIGNED_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueBoolean() defaultValueBoolean} to defaultValueBoolean.
     * @param defaultValueBoolean The value for defaultValueBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueBoolean(boolean defaultValueBoolean) {
      checkNotIsSet(defaultValueBooleanIsSet(), "defaultValueBoolean");
      this.defaultValueBoolean = defaultValueBoolean;
      optBits |= OPT_BIT_DEFAULT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueBoolean() defaultValueBoolean} to defaultValueBoolean.
     * @param defaultValueBoolean The value for defaultValueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueBoolean")
    public final Builder defaultValueBoolean(java.util.Optional<java.lang.Boolean> defaultValueBoolean) {
      checkNotIsSet(defaultValueBooleanIsSet(), "defaultValueBoolean");
      this.defaultValueBoolean = defaultValueBoolean.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAnnotation() defaultValueAnnotation} to defaultValueAnnotation.
     * @param defaultValueAnnotation The value for defaultValueAnnotation
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueAnnotation(com.fhir.Annotation defaultValueAnnotation) {
      checkNotIsSet(defaultValueAnnotationIsSet(), "defaultValueAnnotation");
      this.defaultValueAnnotation = java.util.Objects.requireNonNull(defaultValueAnnotation, "defaultValueAnnotation");
      optBits |= OPT_BIT_DEFAULT_VALUE_ANNOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAnnotation() defaultValueAnnotation} to defaultValueAnnotation.
     * @param defaultValueAnnotation The value for defaultValueAnnotation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueAnnotation")
    public final Builder defaultValueAnnotation(java.util.Optional<? extends com.fhir.Annotation> defaultValueAnnotation) {
      checkNotIsSet(defaultValueAnnotationIsSet(), "defaultValueAnnotation");
      this.defaultValueAnnotation = defaultValueAnnotation.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_ANNOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueBase64Binary() defaultValueBase64Binary} to defaultValueBase64Binary.
     * @param defaultValueBase64Binary The value for defaultValueBase64Binary
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueBase64Binary(java.lang.String defaultValueBase64Binary) {
      checkNotIsSet(defaultValueBase64BinaryIsSet(), "defaultValueBase64Binary");
      this.defaultValueBase64Binary = java.util.Objects.requireNonNull(defaultValueBase64Binary, "defaultValueBase64Binary");
      optBits |= OPT_BIT_DEFAULT_VALUE_BASE64_BINARY;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueBase64Binary() defaultValueBase64Binary} to defaultValueBase64Binary.
     * @param defaultValueBase64Binary The value for defaultValueBase64Binary
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueBase64Binary")
    public final Builder defaultValueBase64Binary(java.util.Optional<java.lang.String> defaultValueBase64Binary) {
      checkNotIsSet(defaultValueBase64BinaryIsSet(), "defaultValueBase64Binary");
      this.defaultValueBase64Binary = defaultValueBase64Binary.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_BASE64_BINARY;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUuid() defaultValueUuid} to defaultValueUuid.
     * @param defaultValueUuid The value for defaultValueUuid
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueUuid(java.lang.String defaultValueUuid) {
      checkNotIsSet(defaultValueUuidIsSet(), "defaultValueUuid");
      this.defaultValueUuid = java.util.Objects.requireNonNull(defaultValueUuid, "defaultValueUuid");
      optBits |= OPT_BIT_DEFAULT_VALUE_UUID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUuid() defaultValueUuid} to defaultValueUuid.
     * @param defaultValueUuid The value for defaultValueUuid
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueUuid")
    public final Builder defaultValueUuid(java.util.Optional<java.lang.String> defaultValueUuid) {
      checkNotIsSet(defaultValueUuidIsSet(), "defaultValueUuid");
      this.defaultValueUuid = defaultValueUuid.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_UUID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Source#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Source#check() check} to check.
     * @param check The value for check
     * @return {@code this} builder for chained invocation
     */
    public final Builder check(java.lang.String check) {
      checkNotIsSet(checkIsSet(), "check");
      this.check = java.util.Objects.requireNonNull(check, "check");
      optBits |= OPT_BIT_CHECK;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#check() check} to check.
     * @param check The value for check
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("check")
    public final Builder check(java.util.Optional<java.lang.String> check) {
      checkNotIsSet(checkIsSet(), "check");
      this.check = check.orElse(null);
      optBits |= OPT_BIT_CHECK;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueTime() defaultValueTime} to defaultValueTime.
     * @param defaultValueTime The value for defaultValueTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueTime(java.lang.String defaultValueTime) {
      checkNotIsSet(defaultValueTimeIsSet(), "defaultValueTime");
      this.defaultValueTime = java.util.Objects.requireNonNull(defaultValueTime, "defaultValueTime");
      optBits |= OPT_BIT_DEFAULT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueTime() defaultValueTime} to defaultValueTime.
     * @param defaultValueTime The value for defaultValueTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueTime")
    public final Builder defaultValueTime(java.util.Optional<java.lang.String> defaultValueTime) {
      checkNotIsSet(defaultValueTimeIsSet(), "defaultValueTime");
      this.defaultValueTime = defaultValueTime.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCode() defaultValueCode} to defaultValueCode.
     * @param defaultValueCode The value for defaultValueCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueCode(java.lang.String defaultValueCode) {
      checkNotIsSet(defaultValueCodeIsSet(), "defaultValueCode");
      this.defaultValueCode = java.util.Objects.requireNonNull(defaultValueCode, "defaultValueCode");
      optBits |= OPT_BIT_DEFAULT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCode() defaultValueCode} to defaultValueCode.
     * @param defaultValueCode The value for defaultValueCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueCode")
    public final Builder defaultValueCode(java.util.Optional<java.lang.String> defaultValueCode) {
      checkNotIsSet(defaultValueCodeIsSet(), "defaultValueCode");
      this.defaultValueCode = defaultValueCode.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueContactDetail() defaultValueContactDetail} to defaultValueContactDetail.
     * @param defaultValueContactDetail The value for defaultValueContactDetail
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueContactDetail(com.fhir.ContactDetail defaultValueContactDetail) {
      checkNotIsSet(defaultValueContactDetailIsSet(), "defaultValueContactDetail");
      this.defaultValueContactDetail = java.util.Objects.requireNonNull(defaultValueContactDetail, "defaultValueContactDetail");
      optBits |= OPT_BIT_DEFAULT_VALUE_CONTACT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueContactDetail() defaultValueContactDetail} to defaultValueContactDetail.
     * @param defaultValueContactDetail The value for defaultValueContactDetail
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueContactDetail")
    public final Builder defaultValueContactDetail(java.util.Optional<? extends com.fhir.ContactDetail> defaultValueContactDetail) {
      checkNotIsSet(defaultValueContactDetailIsSet(), "defaultValueContactDetail");
      this.defaultValueContactDetail = defaultValueContactDetail.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CONTACT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueExpression() defaultValueExpression} to defaultValueExpression.
     * @param defaultValueExpression The value for defaultValueExpression
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueExpression(com.fhir.Expression defaultValueExpression) {
      checkNotIsSet(defaultValueExpressionIsSet(), "defaultValueExpression");
      this.defaultValueExpression = java.util.Objects.requireNonNull(defaultValueExpression, "defaultValueExpression");
      optBits |= OPT_BIT_DEFAULT_VALUE_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueExpression() defaultValueExpression} to defaultValueExpression.
     * @param defaultValueExpression The value for defaultValueExpression
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueExpression")
    public final Builder defaultValueExpression(java.util.Optional<? extends com.fhir.Expression> defaultValueExpression) {
      checkNotIsSet(defaultValueExpressionIsSet(), "defaultValueExpression");
      this.defaultValueExpression = defaultValueExpression.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueMoney() defaultValueMoney} to defaultValueMoney.
     * @param defaultValueMoney The value for defaultValueMoney
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueMoney(com.fhir.Money defaultValueMoney) {
      checkNotIsSet(defaultValueMoneyIsSet(), "defaultValueMoney");
      this.defaultValueMoney = java.util.Objects.requireNonNull(defaultValueMoney, "defaultValueMoney");
      optBits |= OPT_BIT_DEFAULT_VALUE_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueMoney() defaultValueMoney} to defaultValueMoney.
     * @param defaultValueMoney The value for defaultValueMoney
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueMoney")
    public final Builder defaultValueMoney(java.util.Optional<? extends com.fhir.Money> defaultValueMoney) {
      checkNotIsSet(defaultValueMoneyIsSet(), "defaultValueMoney");
      this.defaultValueMoney = defaultValueMoney.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueSignature() defaultValueSignature} to defaultValueSignature.
     * @param defaultValueSignature The value for defaultValueSignature
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueSignature(com.fhir.Signature defaultValueSignature) {
      checkNotIsSet(defaultValueSignatureIsSet(), "defaultValueSignature");
      this.defaultValueSignature = java.util.Objects.requireNonNull(defaultValueSignature, "defaultValueSignature");
      optBits |= OPT_BIT_DEFAULT_VALUE_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueSignature() defaultValueSignature} to defaultValueSignature.
     * @param defaultValueSignature The value for defaultValueSignature
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueSignature")
    public final Builder defaultValueSignature(java.util.Optional<? extends com.fhir.Signature> defaultValueSignature) {
      checkNotIsSet(defaultValueSignatureIsSet(), "defaultValueSignature");
      this.defaultValueSignature = defaultValueSignature.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueTiming() defaultValueTiming} to defaultValueTiming.
     * @param defaultValueTiming The value for defaultValueTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueTiming(com.fhir.Timing defaultValueTiming) {
      checkNotIsSet(defaultValueTimingIsSet(), "defaultValueTiming");
      this.defaultValueTiming = java.util.Objects.requireNonNull(defaultValueTiming, "defaultValueTiming");
      optBits |= OPT_BIT_DEFAULT_VALUE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueTiming() defaultValueTiming} to defaultValueTiming.
     * @param defaultValueTiming The value for defaultValueTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueTiming")
    public final Builder defaultValueTiming(java.util.Optional<? extends com.fhir.Timing> defaultValueTiming) {
      checkNotIsSet(defaultValueTimingIsSet(), "defaultValueTiming");
      this.defaultValueTiming = defaultValueTiming.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueReference() defaultValueReference} to defaultValueReference.
     * @param defaultValueReference The value for defaultValueReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueReference(com.fhir.Reference defaultValueReference) {
      checkNotIsSet(defaultValueReferenceIsSet(), "defaultValueReference");
      this.defaultValueReference = java.util.Objects.requireNonNull(defaultValueReference, "defaultValueReference");
      optBits |= OPT_BIT_DEFAULT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueReference() defaultValueReference} to defaultValueReference.
     * @param defaultValueReference The value for defaultValueReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueReference")
    public final Builder defaultValueReference(java.util.Optional<? extends com.fhir.Reference> defaultValueReference) {
      checkNotIsSet(defaultValueReferenceIsSet(), "defaultValueReference");
      this.defaultValueReference = defaultValueReference.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueOid() defaultValueOid} to defaultValueOid.
     * @param defaultValueOid The value for defaultValueOid
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueOid(java.lang.String defaultValueOid) {
      checkNotIsSet(defaultValueOidIsSet(), "defaultValueOid");
      this.defaultValueOid = java.util.Objects.requireNonNull(defaultValueOid, "defaultValueOid");
      optBits |= OPT_BIT_DEFAULT_VALUE_OID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueOid() defaultValueOid} to defaultValueOid.
     * @param defaultValueOid The value for defaultValueOid
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueOid")
    public final Builder defaultValueOid(java.util.Optional<java.lang.String> defaultValueOid) {
      checkNotIsSet(defaultValueOidIsSet(), "defaultValueOid");
      this.defaultValueOid = defaultValueOid.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_OID;
      return this;
    }

    /**
     * Builds a new {@link StructureMap_Source StructureMap_Source}.
     * @return An immutable instance of StructureMap_Source
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.StructureMap_Source build() {
      return new ImmutableStructureMap_Source(
          defaultValueUrl,
          defaultValueMarkdown,
          defaultValuePositiveInt,
          element,
          condition,
          id,
          defaultValueCanonical,
          defaultValuePeriod,
          defaultValueUsageContext,
          defaultValueDate,
          defaultValueAddress,
          defaultValueDecimal,
          defaultValueIdentifier,
          listMode,
          defaultValueDistance,
          defaultValueDateTime,
          defaultValueContactPoint,
          defaultValueAge,
          defaultValueRange,
          defaultValueCount,
          defaultValueDataRequirement,
          min,
          defaultValueParameterDefinition,
          type,
          defaultValueDuration,
          defaultValueAttachment,
          defaultValueQuantity,
          variable,
          defaultValueInteger,
          defaultValueUri,
          defaultValueCodeableConcept,
          logMessage,
          defaultValueCoding,
          defaultValueHumanName,
          max,
          defaultValueInstant,
          defaultValueRelatedArtifact,
          defaultValueId,
          defaultValueTriggerDefinition,
          defaultValueContributor,
          defaultValueDosage,
          defaultValueMeta,
          defaultValueRatio,
          defaultValueSampledData,
          defaultValueString,
          context,
          defaultValueUnsignedInt,
          defaultValueBoolean,
          defaultValueAnnotation,
          defaultValueBase64Binary,
          defaultValueUuid,
          modifierExtension,
          extension,
          check,
          defaultValueTime,
          defaultValueCode,
          defaultValueContactDetail,
          defaultValueExpression,
          defaultValueMoney,
          defaultValueSignature,
          defaultValueTiming,
          defaultValueReference,
          defaultValueOid);
    }

    private boolean defaultValueUrlIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_URL) != 0;
    }

    private boolean defaultValueMarkdownIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_MARKDOWN) != 0;
    }

    private boolean defaultValuePositiveIntIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_POSITIVE_INT) != 0;
    }

    private boolean elementIsSet() {
      return (optBits & OPT_BIT_ELEMENT) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean defaultValueCanonicalIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CANONICAL) != 0;
    }

    private boolean defaultValuePeriodIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_PERIOD) != 0;
    }

    private boolean defaultValueUsageContextIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_USAGE_CONTEXT) != 0;
    }

    private boolean defaultValueDateIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DATE) != 0;
    }

    private boolean defaultValueAddressIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_ADDRESS) != 0;
    }

    private boolean defaultValueDecimalIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DECIMAL) != 0;
    }

    private boolean defaultValueIdentifierIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_IDENTIFIER) != 0;
    }

    private boolean listModeIsSet() {
      return (optBits & OPT_BIT_LIST_MODE) != 0;
    }

    private boolean defaultValueDistanceIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DISTANCE) != 0;
    }

    private boolean defaultValueDateTimeIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DATE_TIME) != 0;
    }

    private boolean defaultValueContactPointIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CONTACT_POINT) != 0;
    }

    private boolean defaultValueAgeIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_AGE) != 0;
    }

    private boolean defaultValueRangeIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_RANGE) != 0;
    }

    private boolean defaultValueCountIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_COUNT) != 0;
    }

    private boolean defaultValueDataRequirementIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DATA_REQUIREMENT) != 0;
    }

    private boolean minIsSet() {
      return (optBits & OPT_BIT_MIN) != 0;
    }

    private boolean defaultValueParameterDefinitionIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_PARAMETER_DEFINITION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean defaultValueDurationIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DURATION) != 0;
    }

    private boolean defaultValueAttachmentIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_ATTACHMENT) != 0;
    }

    private boolean defaultValueQuantityIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_QUANTITY) != 0;
    }

    private boolean variableIsSet() {
      return (optBits & OPT_BIT_VARIABLE) != 0;
    }

    private boolean defaultValueIntegerIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_INTEGER) != 0;
    }

    private boolean defaultValueUriIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_URI) != 0;
    }

    private boolean defaultValueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private boolean logMessageIsSet() {
      return (optBits & OPT_BIT_LOG_MESSAGE) != 0;
    }

    private boolean defaultValueCodingIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CODING) != 0;
    }

    private boolean defaultValueHumanNameIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_HUMAN_NAME) != 0;
    }

    private boolean maxIsSet() {
      return (optBits & OPT_BIT_MAX) != 0;
    }

    private boolean defaultValueInstantIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_INSTANT) != 0;
    }

    private boolean defaultValueRelatedArtifactIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_RELATED_ARTIFACT) != 0;
    }

    private boolean defaultValueIdIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_ID) != 0;
    }

    private boolean defaultValueTriggerDefinitionIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_TRIGGER_DEFINITION) != 0;
    }

    private boolean defaultValueContributorIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CONTRIBUTOR) != 0;
    }

    private boolean defaultValueDosageIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DOSAGE) != 0;
    }

    private boolean defaultValueMetaIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_META) != 0;
    }

    private boolean defaultValueRatioIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_RATIO) != 0;
    }

    private boolean defaultValueSampledDataIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_SAMPLED_DATA) != 0;
    }

    private boolean defaultValueStringIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_STRING) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean defaultValueUnsignedIntIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_UNSIGNED_INT) != 0;
    }

    private boolean defaultValueBooleanIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_BOOLEAN) != 0;
    }

    private boolean defaultValueAnnotationIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_ANNOTATION) != 0;
    }

    private boolean defaultValueBase64BinaryIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_BASE64_BINARY) != 0;
    }

    private boolean defaultValueUuidIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_UUID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean checkIsSet() {
      return (optBits & OPT_BIT_CHECK) != 0;
    }

    private boolean defaultValueTimeIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_TIME) != 0;
    }

    private boolean defaultValueCodeIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CODE) != 0;
    }

    private boolean defaultValueContactDetailIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CONTACT_DETAIL) != 0;
    }

    private boolean defaultValueExpressionIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_EXPRESSION) != 0;
    }

    private boolean defaultValueMoneyIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_MONEY) != 0;
    }

    private boolean defaultValueSignatureIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_SIGNATURE) != 0;
    }

    private boolean defaultValueTimingIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_TIMING) != 0;
    }

    private boolean defaultValueReferenceIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_REFERENCE) != 0;
    }

    private boolean defaultValueOidIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_OID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of StructureMap_Source is strict, attribute is already set: ".concat(name));
    }
  }
}
