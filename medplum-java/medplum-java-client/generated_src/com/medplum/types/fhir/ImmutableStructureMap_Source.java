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
 * Immutable implementation of {@link StructureMap_Source}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap_Source.builder()}.
 */
@Generated(from = "StructureMap_Source", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap_Source implements StructureMap_Source {
  private final @Nullable String type;
  private final @Nullable Reference defaultValueReference;
  private final @Nullable String defaultValueInstant;
  private final @Nullable String defaultValueDate;
  private final @Nullable String condition;
  private final @Nullable String defaultValueOid;
  private final @Nullable Id context;
  private final @Nullable String defaultValueId;
  private final @Nullable Money defaultValueMoney;
  private final @Nullable String check;
  private final @Nullable String defaultValueCode;
  private final @Nullable Duration defaultValueDuration;
  private final @Nullable Dosage defaultValueDosage;
  private final @Nullable Boolean defaultValueBoolean;
  private final @Nullable ContactDetail defaultValueContactDetail;
  private final @Nullable Contributor defaultValueContributor;
  private final @Nullable Range defaultValueRange;
  private final @Nullable ParameterDefinition defaultValueParameterDefinition;
  private final @Nullable Age defaultValueAge;
  private final @Nullable Annotation defaultValueAnnotation;
  private final @Nullable Quantity defaultValueQuantity;
  private final @Nullable List<Extension> extension;
  private final @Nullable Meta defaultValueMeta;
  private final @Nullable CodeableConcept defaultValueCodeableConcept;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Distance defaultValueDistance;
  private final @Nullable Coding defaultValueCoding;
  private final @Nullable String defaultValueCanonical;
  private final @Nullable Double defaultValuePositiveInt;
  private final @Nullable String defaultValueUrl;
  private final @Nullable Count defaultValueCount;
  private final @Nullable Double defaultValueDecimal;
  private final @Nullable Timing defaultValueTiming;
  private final @Nullable String logMessage;
  private final @Nullable String defaultValueTime;
  private final @Nullable String defaultValueDateTime;
  private final @Nullable String element;
  private final @Nullable Double defaultValueUnsignedInt;
  private final @Nullable String id;
  private final @Nullable String defaultValueMarkdown;
  private final @Nullable String defaultValueBase64Binary;
  private final @Nullable HumanName defaultValueHumanName;
  private final @Nullable ContactPoint defaultValueContactPoint;
  private final @Nullable SampledData defaultValueSampledData;
  private final @Nullable Id variable;
  private final @Nullable String defaultValueUuid;
  private final @Nullable Integer min;
  private final @Nullable Signature defaultValueSignature;
  private final @Nullable String max;
  private final @Nullable Attachment defaultValueAttachment;
  private final @Nullable String defaultValueUri;
  private final @Nullable Ratio defaultValueRatio;
  private final @Nullable Expression defaultValueExpression;
  private final @Nullable Structuremap_sourceListmode listMode;
  private final @Nullable Double defaultValueInteger;
  private final @Nullable String defaultValueString;
  private final @Nullable Address defaultValueAddress;
  private final @Nullable UsageContext defaultValueUsageContext;
  private final @Nullable TriggerDefinition defaultValueTriggerDefinition;
  private final @Nullable Period defaultValuePeriod;
  private final @Nullable RelatedArtifact defaultValueRelatedArtifact;
  private final @Nullable Identifier defaultValueIdentifier;
  private final @Nullable DataRequirement defaultValueDataRequirement;

  private ImmutableStructureMap_Source(
      @Nullable String type,
      @Nullable Reference defaultValueReference,
      @Nullable String defaultValueInstant,
      @Nullable String defaultValueDate,
      @Nullable String condition,
      @Nullable String defaultValueOid,
      @Nullable Id context,
      @Nullable String defaultValueId,
      @Nullable Money defaultValueMoney,
      @Nullable String check,
      @Nullable String defaultValueCode,
      @Nullable Duration defaultValueDuration,
      @Nullable Dosage defaultValueDosage,
      @Nullable Boolean defaultValueBoolean,
      @Nullable ContactDetail defaultValueContactDetail,
      @Nullable Contributor defaultValueContributor,
      @Nullable Range defaultValueRange,
      @Nullable ParameterDefinition defaultValueParameterDefinition,
      @Nullable Age defaultValueAge,
      @Nullable Annotation defaultValueAnnotation,
      @Nullable Quantity defaultValueQuantity,
      @Nullable List<Extension> extension,
      @Nullable Meta defaultValueMeta,
      @Nullable CodeableConcept defaultValueCodeableConcept,
      @Nullable List<Extension> modifierExtension,
      @Nullable Distance defaultValueDistance,
      @Nullable Coding defaultValueCoding,
      @Nullable String defaultValueCanonical,
      @Nullable Double defaultValuePositiveInt,
      @Nullable String defaultValueUrl,
      @Nullable Count defaultValueCount,
      @Nullable Double defaultValueDecimal,
      @Nullable Timing defaultValueTiming,
      @Nullable String logMessage,
      @Nullable String defaultValueTime,
      @Nullable String defaultValueDateTime,
      @Nullable String element,
      @Nullable Double defaultValueUnsignedInt,
      @Nullable String id,
      @Nullable String defaultValueMarkdown,
      @Nullable String defaultValueBase64Binary,
      @Nullable HumanName defaultValueHumanName,
      @Nullable ContactPoint defaultValueContactPoint,
      @Nullable SampledData defaultValueSampledData,
      @Nullable Id variable,
      @Nullable String defaultValueUuid,
      @Nullable Integer min,
      @Nullable Signature defaultValueSignature,
      @Nullable String max,
      @Nullable Attachment defaultValueAttachment,
      @Nullable String defaultValueUri,
      @Nullable Ratio defaultValueRatio,
      @Nullable Expression defaultValueExpression,
      @Nullable Structuremap_sourceListmode listMode,
      @Nullable Double defaultValueInteger,
      @Nullable String defaultValueString,
      @Nullable Address defaultValueAddress,
      @Nullable UsageContext defaultValueUsageContext,
      @Nullable TriggerDefinition defaultValueTriggerDefinition,
      @Nullable Period defaultValuePeriod,
      @Nullable RelatedArtifact defaultValueRelatedArtifact,
      @Nullable Identifier defaultValueIdentifier,
      @Nullable DataRequirement defaultValueDataRequirement) {
    this.type = type;
    this.defaultValueReference = defaultValueReference;
    this.defaultValueInstant = defaultValueInstant;
    this.defaultValueDate = defaultValueDate;
    this.condition = condition;
    this.defaultValueOid = defaultValueOid;
    this.context = context;
    this.defaultValueId = defaultValueId;
    this.defaultValueMoney = defaultValueMoney;
    this.check = check;
    this.defaultValueCode = defaultValueCode;
    this.defaultValueDuration = defaultValueDuration;
    this.defaultValueDosage = defaultValueDosage;
    this.defaultValueBoolean = defaultValueBoolean;
    this.defaultValueContactDetail = defaultValueContactDetail;
    this.defaultValueContributor = defaultValueContributor;
    this.defaultValueRange = defaultValueRange;
    this.defaultValueParameterDefinition = defaultValueParameterDefinition;
    this.defaultValueAge = defaultValueAge;
    this.defaultValueAnnotation = defaultValueAnnotation;
    this.defaultValueQuantity = defaultValueQuantity;
    this.extension = extension;
    this.defaultValueMeta = defaultValueMeta;
    this.defaultValueCodeableConcept = defaultValueCodeableConcept;
    this.modifierExtension = modifierExtension;
    this.defaultValueDistance = defaultValueDistance;
    this.defaultValueCoding = defaultValueCoding;
    this.defaultValueCanonical = defaultValueCanonical;
    this.defaultValuePositiveInt = defaultValuePositiveInt;
    this.defaultValueUrl = defaultValueUrl;
    this.defaultValueCount = defaultValueCount;
    this.defaultValueDecimal = defaultValueDecimal;
    this.defaultValueTiming = defaultValueTiming;
    this.logMessage = logMessage;
    this.defaultValueTime = defaultValueTime;
    this.defaultValueDateTime = defaultValueDateTime;
    this.element = element;
    this.defaultValueUnsignedInt = defaultValueUnsignedInt;
    this.id = id;
    this.defaultValueMarkdown = defaultValueMarkdown;
    this.defaultValueBase64Binary = defaultValueBase64Binary;
    this.defaultValueHumanName = defaultValueHumanName;
    this.defaultValueContactPoint = defaultValueContactPoint;
    this.defaultValueSampledData = defaultValueSampledData;
    this.variable = variable;
    this.defaultValueUuid = defaultValueUuid;
    this.min = min;
    this.defaultValueSignature = defaultValueSignature;
    this.max = max;
    this.defaultValueAttachment = defaultValueAttachment;
    this.defaultValueUri = defaultValueUri;
    this.defaultValueRatio = defaultValueRatio;
    this.defaultValueExpression = defaultValueExpression;
    this.listMode = listMode;
    this.defaultValueInteger = defaultValueInteger;
    this.defaultValueString = defaultValueString;
    this.defaultValueAddress = defaultValueAddress;
    this.defaultValueUsageContext = defaultValueUsageContext;
    this.defaultValueTriggerDefinition = defaultValueTriggerDefinition;
    this.defaultValuePeriod = defaultValuePeriod;
    this.defaultValueRelatedArtifact = defaultValueRelatedArtifact;
    this.defaultValueIdentifier = defaultValueIdentifier;
    this.defaultValueDataRequirement = defaultValueDataRequirement;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<String> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code defaultValueReference} attribute
   */
  @JsonProperty("defaultValueReference")
  @Override
  public Optional<Reference> defaultValueReference() {
    return Optional.ofNullable(defaultValueReference);
  }

  /**
   * @return The value of the {@code defaultValueInstant} attribute
   */
  @JsonProperty("defaultValueInstant")
  @Override
  public Optional<String> defaultValueInstant() {
    return Optional.ofNullable(defaultValueInstant);
  }

  /**
   * @return The value of the {@code defaultValueDate} attribute
   */
  @JsonProperty("defaultValueDate")
  @Override
  public Optional<String> defaultValueDate() {
    return Optional.ofNullable(defaultValueDate);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public Optional<String> condition() {
    return Optional.ofNullable(condition);
  }

  /**
   * @return The value of the {@code defaultValueOid} attribute
   */
  @JsonProperty("defaultValueOid")
  @Override
  public Optional<String> defaultValueOid() {
    return Optional.ofNullable(defaultValueOid);
  }

  /**
   * @return The value of the {@code context} attribute
   */
  @JsonProperty("context")
  @Override
  public Optional<Id> context() {
    return Optional.ofNullable(context);
  }

  /**
   * @return The value of the {@code defaultValueId} attribute
   */
  @JsonProperty("defaultValueId")
  @Override
  public Optional<String> defaultValueId() {
    return Optional.ofNullable(defaultValueId);
  }

  /**
   * @return The value of the {@code defaultValueMoney} attribute
   */
  @JsonProperty("defaultValueMoney")
  @Override
  public Optional<Money> defaultValueMoney() {
    return Optional.ofNullable(defaultValueMoney);
  }

  /**
   * @return The value of the {@code check} attribute
   */
  @JsonProperty("check")
  @Override
  public Optional<String> check() {
    return Optional.ofNullable(check);
  }

  /**
   * @return The value of the {@code defaultValueCode} attribute
   */
  @JsonProperty("defaultValueCode")
  @Override
  public Optional<String> defaultValueCode() {
    return Optional.ofNullable(defaultValueCode);
  }

  /**
   * @return The value of the {@code defaultValueDuration} attribute
   */
  @JsonProperty("defaultValueDuration")
  @Override
  public Optional<Duration> defaultValueDuration() {
    return Optional.ofNullable(defaultValueDuration);
  }

  /**
   * @return The value of the {@code defaultValueDosage} attribute
   */
  @JsonProperty("defaultValueDosage")
  @Override
  public Optional<Dosage> defaultValueDosage() {
    return Optional.ofNullable(defaultValueDosage);
  }

  /**
   * @return The value of the {@code defaultValueBoolean} attribute
   */
  @JsonProperty("defaultValueBoolean")
  @Override
  public Optional<Boolean> defaultValueBoolean() {
    return Optional.ofNullable(defaultValueBoolean);
  }

  /**
   * @return The value of the {@code defaultValueContactDetail} attribute
   */
  @JsonProperty("defaultValueContactDetail")
  @Override
  public Optional<ContactDetail> defaultValueContactDetail() {
    return Optional.ofNullable(defaultValueContactDetail);
  }

  /**
   * @return The value of the {@code defaultValueContributor} attribute
   */
  @JsonProperty("defaultValueContributor")
  @Override
  public Optional<Contributor> defaultValueContributor() {
    return Optional.ofNullable(defaultValueContributor);
  }

  /**
   * @return The value of the {@code defaultValueRange} attribute
   */
  @JsonProperty("defaultValueRange")
  @Override
  public Optional<Range> defaultValueRange() {
    return Optional.ofNullable(defaultValueRange);
  }

  /**
   * @return The value of the {@code defaultValueParameterDefinition} attribute
   */
  @JsonProperty("defaultValueParameterDefinition")
  @Override
  public Optional<ParameterDefinition> defaultValueParameterDefinition() {
    return Optional.ofNullable(defaultValueParameterDefinition);
  }

  /**
   * @return The value of the {@code defaultValueAge} attribute
   */
  @JsonProperty("defaultValueAge")
  @Override
  public Optional<Age> defaultValueAge() {
    return Optional.ofNullable(defaultValueAge);
  }

  /**
   * @return The value of the {@code defaultValueAnnotation} attribute
   */
  @JsonProperty("defaultValueAnnotation")
  @Override
  public Optional<Annotation> defaultValueAnnotation() {
    return Optional.ofNullable(defaultValueAnnotation);
  }

  /**
   * @return The value of the {@code defaultValueQuantity} attribute
   */
  @JsonProperty("defaultValueQuantity")
  @Override
  public Optional<Quantity> defaultValueQuantity() {
    return Optional.ofNullable(defaultValueQuantity);
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
   * @return The value of the {@code defaultValueMeta} attribute
   */
  @JsonProperty("defaultValueMeta")
  @Override
  public Optional<Meta> defaultValueMeta() {
    return Optional.ofNullable(defaultValueMeta);
  }

  /**
   * @return The value of the {@code defaultValueCodeableConcept} attribute
   */
  @JsonProperty("defaultValueCodeableConcept")
  @Override
  public Optional<CodeableConcept> defaultValueCodeableConcept() {
    return Optional.ofNullable(defaultValueCodeableConcept);
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
   * @return The value of the {@code defaultValueDistance} attribute
   */
  @JsonProperty("defaultValueDistance")
  @Override
  public Optional<Distance> defaultValueDistance() {
    return Optional.ofNullable(defaultValueDistance);
  }

  /**
   * @return The value of the {@code defaultValueCoding} attribute
   */
  @JsonProperty("defaultValueCoding")
  @Override
  public Optional<Coding> defaultValueCoding() {
    return Optional.ofNullable(defaultValueCoding);
  }

  /**
   * @return The value of the {@code defaultValueCanonical} attribute
   */
  @JsonProperty("defaultValueCanonical")
  @Override
  public Optional<String> defaultValueCanonical() {
    return Optional.ofNullable(defaultValueCanonical);
  }

  /**
   * @return The value of the {@code defaultValuePositiveInt} attribute
   */
  @JsonProperty("defaultValuePositiveInt")
  @Override
  public Optional<Double> defaultValuePositiveInt() {
    return Optional.ofNullable(defaultValuePositiveInt);
  }

  /**
   * @return The value of the {@code defaultValueUrl} attribute
   */
  @JsonProperty("defaultValueUrl")
  @Override
  public Optional<String> defaultValueUrl() {
    return Optional.ofNullable(defaultValueUrl);
  }

  /**
   * @return The value of the {@code defaultValueCount} attribute
   */
  @JsonProperty("defaultValueCount")
  @Override
  public Optional<Count> defaultValueCount() {
    return Optional.ofNullable(defaultValueCount);
  }

  /**
   * @return The value of the {@code defaultValueDecimal} attribute
   */
  @JsonProperty("defaultValueDecimal")
  @Override
  public Optional<Double> defaultValueDecimal() {
    return Optional.ofNullable(defaultValueDecimal);
  }

  /**
   * @return The value of the {@code defaultValueTiming} attribute
   */
  @JsonProperty("defaultValueTiming")
  @Override
  public Optional<Timing> defaultValueTiming() {
    return Optional.ofNullable(defaultValueTiming);
  }

  /**
   * @return The value of the {@code logMessage} attribute
   */
  @JsonProperty("logMessage")
  @Override
  public Optional<String> logMessage() {
    return Optional.ofNullable(logMessage);
  }

  /**
   * @return The value of the {@code defaultValueTime} attribute
   */
  @JsonProperty("defaultValueTime")
  @Override
  public Optional<String> defaultValueTime() {
    return Optional.ofNullable(defaultValueTime);
  }

  /**
   * @return The value of the {@code defaultValueDateTime} attribute
   */
  @JsonProperty("defaultValueDateTime")
  @Override
  public Optional<String> defaultValueDateTime() {
    return Optional.ofNullable(defaultValueDateTime);
  }

  /**
   * @return The value of the {@code element} attribute
   */
  @JsonProperty("element")
  @Override
  public Optional<String> element() {
    return Optional.ofNullable(element);
  }

  /**
   * @return The value of the {@code defaultValueUnsignedInt} attribute
   */
  @JsonProperty("defaultValueUnsignedInt")
  @Override
  public Optional<Double> defaultValueUnsignedInt() {
    return Optional.ofNullable(defaultValueUnsignedInt);
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
   * @return The value of the {@code defaultValueMarkdown} attribute
   */
  @JsonProperty("defaultValueMarkdown")
  @Override
  public Optional<String> defaultValueMarkdown() {
    return Optional.ofNullable(defaultValueMarkdown);
  }

  /**
   * @return The value of the {@code defaultValueBase64Binary} attribute
   */
  @JsonProperty("defaultValueBase64Binary")
  @Override
  public Optional<String> defaultValueBase64Binary() {
    return Optional.ofNullable(defaultValueBase64Binary);
  }

  /**
   * @return The value of the {@code defaultValueHumanName} attribute
   */
  @JsonProperty("defaultValueHumanName")
  @Override
  public Optional<HumanName> defaultValueHumanName() {
    return Optional.ofNullable(defaultValueHumanName);
  }

  /**
   * @return The value of the {@code defaultValueContactPoint} attribute
   */
  @JsonProperty("defaultValueContactPoint")
  @Override
  public Optional<ContactPoint> defaultValueContactPoint() {
    return Optional.ofNullable(defaultValueContactPoint);
  }

  /**
   * @return The value of the {@code defaultValueSampledData} attribute
   */
  @JsonProperty("defaultValueSampledData")
  @Override
  public Optional<SampledData> defaultValueSampledData() {
    return Optional.ofNullable(defaultValueSampledData);
  }

  /**
   * @return The value of the {@code variable} attribute
   */
  @JsonProperty("variable")
  @Override
  public Optional<Id> variable() {
    return Optional.ofNullable(variable);
  }

  /**
   * @return The value of the {@code defaultValueUuid} attribute
   */
  @JsonProperty("defaultValueUuid")
  @Override
  public Optional<String> defaultValueUuid() {
    return Optional.ofNullable(defaultValueUuid);
  }

  /**
   * @return The value of the {@code min} attribute
   */
  @JsonProperty("min")
  @Override
  public Optional<Integer> min() {
    return Optional.ofNullable(min);
  }

  /**
   * @return The value of the {@code defaultValueSignature} attribute
   */
  @JsonProperty("defaultValueSignature")
  @Override
  public Optional<Signature> defaultValueSignature() {
    return Optional.ofNullable(defaultValueSignature);
  }

  /**
   * @return The value of the {@code max} attribute
   */
  @JsonProperty("max")
  @Override
  public Optional<String> max() {
    return Optional.ofNullable(max);
  }

  /**
   * @return The value of the {@code defaultValueAttachment} attribute
   */
  @JsonProperty("defaultValueAttachment")
  @Override
  public Optional<Attachment> defaultValueAttachment() {
    return Optional.ofNullable(defaultValueAttachment);
  }

  /**
   * @return The value of the {@code defaultValueUri} attribute
   */
  @JsonProperty("defaultValueUri")
  @Override
  public Optional<String> defaultValueUri() {
    return Optional.ofNullable(defaultValueUri);
  }

  /**
   * @return The value of the {@code defaultValueRatio} attribute
   */
  @JsonProperty("defaultValueRatio")
  @Override
  public Optional<Ratio> defaultValueRatio() {
    return Optional.ofNullable(defaultValueRatio);
  }

  /**
   * @return The value of the {@code defaultValueExpression} attribute
   */
  @JsonProperty("defaultValueExpression")
  @Override
  public Optional<Expression> defaultValueExpression() {
    return Optional.ofNullable(defaultValueExpression);
  }

  /**
   * @return The value of the {@code listMode} attribute
   */
  @JsonProperty("listMode")
  @Override
  public Optional<Structuremap_sourceListmode> listMode() {
    return Optional.ofNullable(listMode);
  }

  /**
   * @return The value of the {@code defaultValueInteger} attribute
   */
  @JsonProperty("defaultValueInteger")
  @Override
  public Optional<Double> defaultValueInteger() {
    return Optional.ofNullable(defaultValueInteger);
  }

  /**
   * @return The value of the {@code defaultValueString} attribute
   */
  @JsonProperty("defaultValueString")
  @Override
  public Optional<String> defaultValueString() {
    return Optional.ofNullable(defaultValueString);
  }

  /**
   * @return The value of the {@code defaultValueAddress} attribute
   */
  @JsonProperty("defaultValueAddress")
  @Override
  public Optional<Address> defaultValueAddress() {
    return Optional.ofNullable(defaultValueAddress);
  }

  /**
   * @return The value of the {@code defaultValueUsageContext} attribute
   */
  @JsonProperty("defaultValueUsageContext")
  @Override
  public Optional<UsageContext> defaultValueUsageContext() {
    return Optional.ofNullable(defaultValueUsageContext);
  }

  /**
   * @return The value of the {@code defaultValueTriggerDefinition} attribute
   */
  @JsonProperty("defaultValueTriggerDefinition")
  @Override
  public Optional<TriggerDefinition> defaultValueTriggerDefinition() {
    return Optional.ofNullable(defaultValueTriggerDefinition);
  }

  /**
   * @return The value of the {@code defaultValuePeriod} attribute
   */
  @JsonProperty("defaultValuePeriod")
  @Override
  public Optional<Period> defaultValuePeriod() {
    return Optional.ofNullable(defaultValuePeriod);
  }

  /**
   * @return The value of the {@code defaultValueRelatedArtifact} attribute
   */
  @JsonProperty("defaultValueRelatedArtifact")
  @Override
  public Optional<RelatedArtifact> defaultValueRelatedArtifact() {
    return Optional.ofNullable(defaultValueRelatedArtifact);
  }

  /**
   * @return The value of the {@code defaultValueIdentifier} attribute
   */
  @JsonProperty("defaultValueIdentifier")
  @Override
  public Optional<Identifier> defaultValueIdentifier() {
    return Optional.ofNullable(defaultValueIdentifier);
  }

  /**
   * @return The value of the {@code defaultValueDataRequirement} attribute
   */
  @JsonProperty("defaultValueDataRequirement")
  @Override
  public Optional<DataRequirement> defaultValueDataRequirement() {
    return Optional.ofNullable(defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "type");
    if (Objects.equals(this.type, newValue)) return this;
    return new ImmutableStructureMap_Source(
        newValue,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#type() type} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.type, value)) return this;
    return new ImmutableStructureMap_Source(
        value,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueReference() defaultValueReference} attribute.
   * @param value The value for defaultValueReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "defaultValueReference");
    if (this.defaultValueReference == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        newValue,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueReference() defaultValueReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.defaultValueReference == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        value,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueInstant() defaultValueInstant} attribute.
   * @param value The value for defaultValueInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueInstant(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueInstant");
    if (Objects.equals(this.defaultValueInstant, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        newValue,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueInstant() defaultValueInstant} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueInstant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueInstant(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueInstant, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        value,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDate() defaultValueDate} attribute.
   * @param value The value for defaultValueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueDate");
    if (Objects.equals(this.defaultValueDate, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        newValue,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDate() defaultValueDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueDate, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        value,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withCondition(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "condition");
    if (Objects.equals(this.condition, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        newValue,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#condition() condition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withCondition(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.condition, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        value,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueOid() defaultValueOid} attribute.
   * @param value The value for defaultValueOid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueOid(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueOid");
    if (Objects.equals(this.defaultValueOid, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        newValue,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueOid() defaultValueOid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueOid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueOid(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueOid, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        value,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withContext(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        newValue,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withContext(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        value,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueId() defaultValueId} attribute.
   * @param value The value for defaultValueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueId");
    if (Objects.equals(this.defaultValueId, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        newValue,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueId() defaultValueId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueId, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        value,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueMoney() defaultValueMoney} attribute.
   * @param value The value for defaultValueMoney
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueMoney(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "defaultValueMoney");
    if (this.defaultValueMoney == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        newValue,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueMoney() defaultValueMoney} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueMoney
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueMoney(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.defaultValueMoney == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        value,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#check() check} attribute.
   * @param value The value for check
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withCheck(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "check");
    if (Objects.equals(this.check, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        newValue,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#check() check} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for check
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withCheck(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.check, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        value,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueCode() defaultValueCode} attribute.
   * @param value The value for defaultValueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCode(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueCode");
    if (Objects.equals(this.defaultValueCode, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        newValue,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueCode() defaultValueCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCode(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueCode, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        value,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDuration() defaultValueDuration} attribute.
   * @param value The value for defaultValueDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "defaultValueDuration");
    if (this.defaultValueDuration == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        newValue,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDuration() defaultValueDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.defaultValueDuration == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        value,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDosage() defaultValueDosage} attribute.
   * @param value The value for defaultValueDosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDosage(Dosage value) {
    @Nullable Dosage newValue = Objects.requireNonNull(value, "defaultValueDosage");
    if (this.defaultValueDosage == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        newValue,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDosage() defaultValueDosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueDosage(Optional<? extends Dosage> optional) {
    @Nullable Dosage value = optional.orElse(null);
    if (this.defaultValueDosage == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        value,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueBoolean() defaultValueBoolean} attribute.
   * @param value The value for defaultValueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.defaultValueBoolean, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        newValue,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueBoolean() defaultValueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.defaultValueBoolean, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        value,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueContactDetail() defaultValueContactDetail} attribute.
   * @param value The value for defaultValueContactDetail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueContactDetail(ContactDetail value) {
    @Nullable ContactDetail newValue = Objects.requireNonNull(value, "defaultValueContactDetail");
    if (this.defaultValueContactDetail == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        newValue,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueContactDetail() defaultValueContactDetail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueContactDetail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueContactDetail(Optional<? extends ContactDetail> optional) {
    @Nullable ContactDetail value = optional.orElse(null);
    if (this.defaultValueContactDetail == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        value,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueContributor() defaultValueContributor} attribute.
   * @param value The value for defaultValueContributor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueContributor(Contributor value) {
    @Nullable Contributor newValue = Objects.requireNonNull(value, "defaultValueContributor");
    if (this.defaultValueContributor == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        newValue,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueContributor() defaultValueContributor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueContributor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueContributor(Optional<? extends Contributor> optional) {
    @Nullable Contributor value = optional.orElse(null);
    if (this.defaultValueContributor == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        value,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueRange() defaultValueRange} attribute.
   * @param value The value for defaultValueRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "defaultValueRange");
    if (this.defaultValueRange == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        newValue,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueRange() defaultValueRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.defaultValueRange == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        value,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueParameterDefinition() defaultValueParameterDefinition} attribute.
   * @param value The value for defaultValueParameterDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueParameterDefinition(ParameterDefinition value) {
    @Nullable ParameterDefinition newValue = Objects.requireNonNull(value, "defaultValueParameterDefinition");
    if (this.defaultValueParameterDefinition == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        newValue,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueParameterDefinition() defaultValueParameterDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueParameterDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueParameterDefinition(Optional<? extends ParameterDefinition> optional) {
    @Nullable ParameterDefinition value = optional.orElse(null);
    if (this.defaultValueParameterDefinition == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        value,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueAge() defaultValueAge} attribute.
   * @param value The value for defaultValueAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "defaultValueAge");
    if (this.defaultValueAge == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        newValue,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueAge() defaultValueAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.defaultValueAge == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        value,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueAnnotation() defaultValueAnnotation} attribute.
   * @param value The value for defaultValueAnnotation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueAnnotation(Annotation value) {
    @Nullable Annotation newValue = Objects.requireNonNull(value, "defaultValueAnnotation");
    if (this.defaultValueAnnotation == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        newValue,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueAnnotation() defaultValueAnnotation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueAnnotation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueAnnotation(Optional<? extends Annotation> optional) {
    @Nullable Annotation value = optional.orElse(null);
    if (this.defaultValueAnnotation == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        value,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueQuantity() defaultValueQuantity} attribute.
   * @param value The value for defaultValueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "defaultValueQuantity");
    if (this.defaultValueQuantity == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        newValue,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueQuantity() defaultValueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.defaultValueQuantity == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        value,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        newValue,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        value,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueMeta() defaultValueMeta} attribute.
   * @param value The value for defaultValueMeta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "defaultValueMeta");
    if (this.defaultValueMeta == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        newValue,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueMeta() defaultValueMeta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueMeta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.defaultValueMeta == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        value,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueCodeableConcept() defaultValueCodeableConcept} attribute.
   * @param value The value for defaultValueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "defaultValueCodeableConcept");
    if (this.defaultValueCodeableConcept == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        newValue,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueCodeableConcept() defaultValueCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.defaultValueCodeableConcept == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        value,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        newValue,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        value,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDistance() defaultValueDistance} attribute.
   * @param value The value for defaultValueDistance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDistance(Distance value) {
    @Nullable Distance newValue = Objects.requireNonNull(value, "defaultValueDistance");
    if (this.defaultValueDistance == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        newValue,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDistance() defaultValueDistance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDistance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueDistance(Optional<? extends Distance> optional) {
    @Nullable Distance value = optional.orElse(null);
    if (this.defaultValueDistance == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        value,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueCoding() defaultValueCoding} attribute.
   * @param value The value for defaultValueCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCoding(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "defaultValueCoding");
    if (this.defaultValueCoding == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        newValue,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueCoding() defaultValueCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueCoding(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.defaultValueCoding == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        value,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueCanonical() defaultValueCanonical} attribute.
   * @param value The value for defaultValueCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCanonical(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueCanonical");
    if (Objects.equals(this.defaultValueCanonical, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        newValue,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueCanonical() defaultValueCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCanonical(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueCanonical, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        value,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValuePositiveInt() defaultValuePositiveInt} attribute.
   * @param value The value for defaultValuePositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValuePositiveInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.defaultValuePositiveInt, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        newValue,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValuePositiveInt() defaultValuePositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValuePositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValuePositiveInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.defaultValuePositiveInt, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        value,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueUrl() defaultValueUrl} attribute.
   * @param value The value for defaultValueUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUrl(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueUrl");
    if (Objects.equals(this.defaultValueUrl, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        newValue,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueUrl() defaultValueUrl} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUrl(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueUrl, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        value,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueCount() defaultValueCount} attribute.
   * @param value The value for defaultValueCount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueCount(Count value) {
    @Nullable Count newValue = Objects.requireNonNull(value, "defaultValueCount");
    if (this.defaultValueCount == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        newValue,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueCount() defaultValueCount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueCount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueCount(Optional<? extends Count> optional) {
    @Nullable Count value = optional.orElse(null);
    if (this.defaultValueCount == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        value,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDecimal() defaultValueDecimal} attribute.
   * @param value The value for defaultValueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDecimal(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.defaultValueDecimal, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        newValue,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDecimal() defaultValueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDecimal(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.defaultValueDecimal, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        value,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueTiming() defaultValueTiming} attribute.
   * @param value The value for defaultValueTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "defaultValueTiming");
    if (this.defaultValueTiming == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        newValue,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueTiming() defaultValueTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.defaultValueTiming == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        value,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#logMessage() logMessage} attribute.
   * @param value The value for logMessage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withLogMessage(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "logMessage");
    if (Objects.equals(this.logMessage, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        newValue,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#logMessage() logMessage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for logMessage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withLogMessage(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.logMessage, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        value,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueTime() defaultValueTime} attribute.
   * @param value The value for defaultValueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueTime");
    if (Objects.equals(this.defaultValueTime, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        newValue,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueTime() defaultValueTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueTime, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        value,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDateTime() defaultValueDateTime} attribute.
   * @param value The value for defaultValueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueDateTime");
    if (Objects.equals(this.defaultValueDateTime, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        newValue,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDateTime() defaultValueDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueDateTime, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        value,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#element() element} attribute.
   * @param value The value for element
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withElement(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "element");
    if (Objects.equals(this.element, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        newValue,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#element() element} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for element
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withElement(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.element, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        value,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueUnsignedInt() defaultValueUnsignedInt} attribute.
   * @param value The value for defaultValueUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUnsignedInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.defaultValueUnsignedInt, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        newValue,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueUnsignedInt() defaultValueUnsignedInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueUnsignedInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUnsignedInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.defaultValueUnsignedInt, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        value,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        newValue,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        value,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueMarkdown() defaultValueMarkdown} attribute.
   * @param value The value for defaultValueMarkdown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueMarkdown(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueMarkdown");
    if (Objects.equals(this.defaultValueMarkdown, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        newValue,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueMarkdown() defaultValueMarkdown} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueMarkdown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueMarkdown(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueMarkdown, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        value,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueBase64Binary() defaultValueBase64Binary} attribute.
   * @param value The value for defaultValueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueBase64Binary(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueBase64Binary");
    if (Objects.equals(this.defaultValueBase64Binary, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        newValue,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueBase64Binary() defaultValueBase64Binary} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueBase64Binary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueBase64Binary(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueBase64Binary, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        value,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueHumanName() defaultValueHumanName} attribute.
   * @param value The value for defaultValueHumanName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueHumanName(HumanName value) {
    @Nullable HumanName newValue = Objects.requireNonNull(value, "defaultValueHumanName");
    if (this.defaultValueHumanName == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        newValue,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueHumanName() defaultValueHumanName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueHumanName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueHumanName(Optional<? extends HumanName> optional) {
    @Nullable HumanName value = optional.orElse(null);
    if (this.defaultValueHumanName == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        value,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueContactPoint() defaultValueContactPoint} attribute.
   * @param value The value for defaultValueContactPoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueContactPoint(ContactPoint value) {
    @Nullable ContactPoint newValue = Objects.requireNonNull(value, "defaultValueContactPoint");
    if (this.defaultValueContactPoint == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        newValue,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueContactPoint() defaultValueContactPoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueContactPoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueContactPoint(Optional<? extends ContactPoint> optional) {
    @Nullable ContactPoint value = optional.orElse(null);
    if (this.defaultValueContactPoint == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        value,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueSampledData() defaultValueSampledData} attribute.
   * @param value The value for defaultValueSampledData
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueSampledData(SampledData value) {
    @Nullable SampledData newValue = Objects.requireNonNull(value, "defaultValueSampledData");
    if (this.defaultValueSampledData == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        newValue,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueSampledData() defaultValueSampledData} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueSampledData
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueSampledData(Optional<? extends SampledData> optional) {
    @Nullable SampledData value = optional.orElse(null);
    if (this.defaultValueSampledData == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        value,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#variable() variable} attribute.
   * @param value The value for variable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withVariable(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "variable");
    if (this.variable == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        newValue,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#variable() variable} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variable
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withVariable(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.variable == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        value,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueUuid() defaultValueUuid} attribute.
   * @param value The value for defaultValueUuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUuid(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueUuid");
    if (Objects.equals(this.defaultValueUuid, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        newValue,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueUuid() defaultValueUuid} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueUuid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUuid(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueUuid, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        value,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#min() min} attribute.
   * @param value The value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withMin(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.min, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        newValue,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#min() min} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withMin(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.min, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        value,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueSignature() defaultValueSignature} attribute.
   * @param value The value for defaultValueSignature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueSignature(Signature value) {
    @Nullable Signature newValue = Objects.requireNonNull(value, "defaultValueSignature");
    if (this.defaultValueSignature == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        newValue,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueSignature() defaultValueSignature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueSignature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueSignature(Optional<? extends Signature> optional) {
    @Nullable Signature value = optional.orElse(null);
    if (this.defaultValueSignature == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        value,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#max() max} attribute.
   * @param value The value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withMax(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "max");
    if (Objects.equals(this.max, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        newValue,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#max() max} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withMax(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.max, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        value,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueAttachment() defaultValueAttachment} attribute.
   * @param value The value for defaultValueAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "defaultValueAttachment");
    if (this.defaultValueAttachment == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        newValue,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueAttachment() defaultValueAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.defaultValueAttachment == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        value,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueUri() defaultValueUri} attribute.
   * @param value The value for defaultValueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueUri");
    if (Objects.equals(this.defaultValueUri, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        newValue,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueUri() defaultValueUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueUri, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        value,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueRatio() defaultValueRatio} attribute.
   * @param value The value for defaultValueRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueRatio(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "defaultValueRatio");
    if (this.defaultValueRatio == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        newValue,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueRatio() defaultValueRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueRatio(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.defaultValueRatio == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        value,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueExpression() defaultValueExpression} attribute.
   * @param value The value for defaultValueExpression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueExpression(Expression value) {
    @Nullable Expression newValue = Objects.requireNonNull(value, "defaultValueExpression");
    if (this.defaultValueExpression == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        newValue,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueExpression() defaultValueExpression} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueExpression
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueExpression(Optional<? extends Expression> optional) {
    @Nullable Expression value = optional.orElse(null);
    if (this.defaultValueExpression == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        value,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#listMode() listMode} attribute.
   * @param value The value for listMode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withListMode(Structuremap_sourceListmode value) {
    @Nullable Structuremap_sourceListmode newValue = Objects.requireNonNull(value, "listMode");
    if (this.listMode == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        newValue,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#listMode() listMode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for listMode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withListMode(Optional<? extends Structuremap_sourceListmode> optional) {
    @Nullable Structuremap_sourceListmode value = optional.orElse(null);
    if (this.listMode == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        value,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueInteger() defaultValueInteger} attribute.
   * @param value The value for defaultValueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.defaultValueInteger, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        newValue,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueInteger() defaultValueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.defaultValueInteger, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        value,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueString() defaultValueString} attribute.
   * @param value The value for defaultValueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "defaultValueString");
    if (Objects.equals(this.defaultValueString, newValue)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        newValue,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueString() defaultValueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.defaultValueString, value)) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        value,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueAddress() defaultValueAddress} attribute.
   * @param value The value for defaultValueAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueAddress(Address value) {
    @Nullable Address newValue = Objects.requireNonNull(value, "defaultValueAddress");
    if (this.defaultValueAddress == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        newValue,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueAddress() defaultValueAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueAddress(Optional<? extends Address> optional) {
    @Nullable Address value = optional.orElse(null);
    if (this.defaultValueAddress == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        value,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueUsageContext() defaultValueUsageContext} attribute.
   * @param value The value for defaultValueUsageContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueUsageContext(UsageContext value) {
    @Nullable UsageContext newValue = Objects.requireNonNull(value, "defaultValueUsageContext");
    if (this.defaultValueUsageContext == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        newValue,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueUsageContext() defaultValueUsageContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueUsageContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueUsageContext(Optional<? extends UsageContext> optional) {
    @Nullable UsageContext value = optional.orElse(null);
    if (this.defaultValueUsageContext == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        value,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueTriggerDefinition() defaultValueTriggerDefinition} attribute.
   * @param value The value for defaultValueTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueTriggerDefinition(TriggerDefinition value) {
    @Nullable TriggerDefinition newValue = Objects.requireNonNull(value, "defaultValueTriggerDefinition");
    if (this.defaultValueTriggerDefinition == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        newValue,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueTriggerDefinition() defaultValueTriggerDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueTriggerDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueTriggerDefinition(Optional<? extends TriggerDefinition> optional) {
    @Nullable TriggerDefinition value = optional.orElse(null);
    if (this.defaultValueTriggerDefinition == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        value,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValuePeriod() defaultValuePeriod} attribute.
   * @param value The value for defaultValuePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValuePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "defaultValuePeriod");
    if (this.defaultValuePeriod == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        newValue,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValuePeriod() defaultValuePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValuePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValuePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.defaultValuePeriod == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        value,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueRelatedArtifact() defaultValueRelatedArtifact} attribute.
   * @param value The value for defaultValueRelatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueRelatedArtifact(RelatedArtifact value) {
    @Nullable RelatedArtifact newValue = Objects.requireNonNull(value, "defaultValueRelatedArtifact");
    if (this.defaultValueRelatedArtifact == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        newValue,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueRelatedArtifact() defaultValueRelatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueRelatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueRelatedArtifact(Optional<? extends RelatedArtifact> optional) {
    @Nullable RelatedArtifact value = optional.orElse(null);
    if (this.defaultValueRelatedArtifact == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        value,
        this.defaultValueIdentifier,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueIdentifier() defaultValueIdentifier} attribute.
   * @param value The value for defaultValueIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "defaultValueIdentifier");
    if (this.defaultValueIdentifier == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        newValue,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueIdentifier() defaultValueIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.defaultValueIdentifier == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        value,
        this.defaultValueDataRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Source#defaultValueDataRequirement() defaultValueDataRequirement} attribute.
   * @param value The value for defaultValueDataRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Source withDefaultValueDataRequirement(DataRequirement value) {
    @Nullable DataRequirement newValue = Objects.requireNonNull(value, "defaultValueDataRequirement");
    if (this.defaultValueDataRequirement == newValue) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Source#defaultValueDataRequirement() defaultValueDataRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultValueDataRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Source withDefaultValueDataRequirement(Optional<? extends DataRequirement> optional) {
    @Nullable DataRequirement value = optional.orElse(null);
    if (this.defaultValueDataRequirement == value) return this;
    return new ImmutableStructureMap_Source(
        this.type,
        this.defaultValueReference,
        this.defaultValueInstant,
        this.defaultValueDate,
        this.condition,
        this.defaultValueOid,
        this.context,
        this.defaultValueId,
        this.defaultValueMoney,
        this.check,
        this.defaultValueCode,
        this.defaultValueDuration,
        this.defaultValueDosage,
        this.defaultValueBoolean,
        this.defaultValueContactDetail,
        this.defaultValueContributor,
        this.defaultValueRange,
        this.defaultValueParameterDefinition,
        this.defaultValueAge,
        this.defaultValueAnnotation,
        this.defaultValueQuantity,
        this.extension,
        this.defaultValueMeta,
        this.defaultValueCodeableConcept,
        this.modifierExtension,
        this.defaultValueDistance,
        this.defaultValueCoding,
        this.defaultValueCanonical,
        this.defaultValuePositiveInt,
        this.defaultValueUrl,
        this.defaultValueCount,
        this.defaultValueDecimal,
        this.defaultValueTiming,
        this.logMessage,
        this.defaultValueTime,
        this.defaultValueDateTime,
        this.element,
        this.defaultValueUnsignedInt,
        this.id,
        this.defaultValueMarkdown,
        this.defaultValueBase64Binary,
        this.defaultValueHumanName,
        this.defaultValueContactPoint,
        this.defaultValueSampledData,
        this.variable,
        this.defaultValueUuid,
        this.min,
        this.defaultValueSignature,
        this.max,
        this.defaultValueAttachment,
        this.defaultValueUri,
        this.defaultValueRatio,
        this.defaultValueExpression,
        this.listMode,
        this.defaultValueInteger,
        this.defaultValueString,
        this.defaultValueAddress,
        this.defaultValueUsageContext,
        this.defaultValueTriggerDefinition,
        this.defaultValuePeriod,
        this.defaultValueRelatedArtifact,
        this.defaultValueIdentifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap_Source} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap_Source
        && equalTo((ImmutableStructureMap_Source) another);
  }

  private boolean equalTo(ImmutableStructureMap_Source another) {
    return Objects.equals(type, another.type)
        && Objects.equals(defaultValueReference, another.defaultValueReference)
        && Objects.equals(defaultValueInstant, another.defaultValueInstant)
        && Objects.equals(defaultValueDate, another.defaultValueDate)
        && Objects.equals(condition, another.condition)
        && Objects.equals(defaultValueOid, another.defaultValueOid)
        && Objects.equals(context, another.context)
        && Objects.equals(defaultValueId, another.defaultValueId)
        && Objects.equals(defaultValueMoney, another.defaultValueMoney)
        && Objects.equals(check, another.check)
        && Objects.equals(defaultValueCode, another.defaultValueCode)
        && Objects.equals(defaultValueDuration, another.defaultValueDuration)
        && Objects.equals(defaultValueDosage, another.defaultValueDosage)
        && Objects.equals(defaultValueBoolean, another.defaultValueBoolean)
        && Objects.equals(defaultValueContactDetail, another.defaultValueContactDetail)
        && Objects.equals(defaultValueContributor, another.defaultValueContributor)
        && Objects.equals(defaultValueRange, another.defaultValueRange)
        && Objects.equals(defaultValueParameterDefinition, another.defaultValueParameterDefinition)
        && Objects.equals(defaultValueAge, another.defaultValueAge)
        && Objects.equals(defaultValueAnnotation, another.defaultValueAnnotation)
        && Objects.equals(defaultValueQuantity, another.defaultValueQuantity)
        && Objects.equals(extension, another.extension)
        && Objects.equals(defaultValueMeta, another.defaultValueMeta)
        && Objects.equals(defaultValueCodeableConcept, another.defaultValueCodeableConcept)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(defaultValueDistance, another.defaultValueDistance)
        && Objects.equals(defaultValueCoding, another.defaultValueCoding)
        && Objects.equals(defaultValueCanonical, another.defaultValueCanonical)
        && Objects.equals(defaultValuePositiveInt, another.defaultValuePositiveInt)
        && Objects.equals(defaultValueUrl, another.defaultValueUrl)
        && Objects.equals(defaultValueCount, another.defaultValueCount)
        && Objects.equals(defaultValueDecimal, another.defaultValueDecimal)
        && Objects.equals(defaultValueTiming, another.defaultValueTiming)
        && Objects.equals(logMessage, another.logMessage)
        && Objects.equals(defaultValueTime, another.defaultValueTime)
        && Objects.equals(defaultValueDateTime, another.defaultValueDateTime)
        && Objects.equals(element, another.element)
        && Objects.equals(defaultValueUnsignedInt, another.defaultValueUnsignedInt)
        && Objects.equals(id, another.id)
        && Objects.equals(defaultValueMarkdown, another.defaultValueMarkdown)
        && Objects.equals(defaultValueBase64Binary, another.defaultValueBase64Binary)
        && Objects.equals(defaultValueHumanName, another.defaultValueHumanName)
        && Objects.equals(defaultValueContactPoint, another.defaultValueContactPoint)
        && Objects.equals(defaultValueSampledData, another.defaultValueSampledData)
        && Objects.equals(variable, another.variable)
        && Objects.equals(defaultValueUuid, another.defaultValueUuid)
        && Objects.equals(min, another.min)
        && Objects.equals(defaultValueSignature, another.defaultValueSignature)
        && Objects.equals(max, another.max)
        && Objects.equals(defaultValueAttachment, another.defaultValueAttachment)
        && Objects.equals(defaultValueUri, another.defaultValueUri)
        && Objects.equals(defaultValueRatio, another.defaultValueRatio)
        && Objects.equals(defaultValueExpression, another.defaultValueExpression)
        && Objects.equals(listMode, another.listMode)
        && Objects.equals(defaultValueInteger, another.defaultValueInteger)
        && Objects.equals(defaultValueString, another.defaultValueString)
        && Objects.equals(defaultValueAddress, another.defaultValueAddress)
        && Objects.equals(defaultValueUsageContext, another.defaultValueUsageContext)
        && Objects.equals(defaultValueTriggerDefinition, another.defaultValueTriggerDefinition)
        && Objects.equals(defaultValuePeriod, another.defaultValuePeriod)
        && Objects.equals(defaultValueRelatedArtifact, another.defaultValueRelatedArtifact)
        && Objects.equals(defaultValueIdentifier, another.defaultValueIdentifier)
        && Objects.equals(defaultValueDataRequirement, another.defaultValueDataRequirement);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code defaultValueReference}, {@code defaultValueInstant}, {@code defaultValueDate}, {@code condition}, {@code defaultValueOid}, {@code context}, {@code defaultValueId}, {@code defaultValueMoney}, {@code check}, {@code defaultValueCode}, {@code defaultValueDuration}, {@code defaultValueDosage}, {@code defaultValueBoolean}, {@code defaultValueContactDetail}, {@code defaultValueContributor}, {@code defaultValueRange}, {@code defaultValueParameterDefinition}, {@code defaultValueAge}, {@code defaultValueAnnotation}, {@code defaultValueQuantity}, {@code extension}, {@code defaultValueMeta}, {@code defaultValueCodeableConcept}, {@code modifierExtension}, {@code defaultValueDistance}, {@code defaultValueCoding}, {@code defaultValueCanonical}, {@code defaultValuePositiveInt}, {@code defaultValueUrl}, {@code defaultValueCount}, {@code defaultValueDecimal}, {@code defaultValueTiming}, {@code logMessage}, {@code defaultValueTime}, {@code defaultValueDateTime}, {@code element}, {@code defaultValueUnsignedInt}, {@code id}, {@code defaultValueMarkdown}, {@code defaultValueBase64Binary}, {@code defaultValueHumanName}, {@code defaultValueContactPoint}, {@code defaultValueSampledData}, {@code variable}, {@code defaultValueUuid}, {@code min}, {@code defaultValueSignature}, {@code max}, {@code defaultValueAttachment}, {@code defaultValueUri}, {@code defaultValueRatio}, {@code defaultValueExpression}, {@code listMode}, {@code defaultValueInteger}, {@code defaultValueString}, {@code defaultValueAddress}, {@code defaultValueUsageContext}, {@code defaultValueTriggerDefinition}, {@code defaultValuePeriod}, {@code defaultValueRelatedArtifact}, {@code defaultValueIdentifier}, {@code defaultValueDataRequirement}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(defaultValueReference);
    h += (h << 5) + Objects.hashCode(defaultValueInstant);
    h += (h << 5) + Objects.hashCode(defaultValueDate);
    h += (h << 5) + Objects.hashCode(condition);
    h += (h << 5) + Objects.hashCode(defaultValueOid);
    h += (h << 5) + Objects.hashCode(context);
    h += (h << 5) + Objects.hashCode(defaultValueId);
    h += (h << 5) + Objects.hashCode(defaultValueMoney);
    h += (h << 5) + Objects.hashCode(check);
    h += (h << 5) + Objects.hashCode(defaultValueCode);
    h += (h << 5) + Objects.hashCode(defaultValueDuration);
    h += (h << 5) + Objects.hashCode(defaultValueDosage);
    h += (h << 5) + Objects.hashCode(defaultValueBoolean);
    h += (h << 5) + Objects.hashCode(defaultValueContactDetail);
    h += (h << 5) + Objects.hashCode(defaultValueContributor);
    h += (h << 5) + Objects.hashCode(defaultValueRange);
    h += (h << 5) + Objects.hashCode(defaultValueParameterDefinition);
    h += (h << 5) + Objects.hashCode(defaultValueAge);
    h += (h << 5) + Objects.hashCode(defaultValueAnnotation);
    h += (h << 5) + Objects.hashCode(defaultValueQuantity);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(defaultValueMeta);
    h += (h << 5) + Objects.hashCode(defaultValueCodeableConcept);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(defaultValueDistance);
    h += (h << 5) + Objects.hashCode(defaultValueCoding);
    h += (h << 5) + Objects.hashCode(defaultValueCanonical);
    h += (h << 5) + Objects.hashCode(defaultValuePositiveInt);
    h += (h << 5) + Objects.hashCode(defaultValueUrl);
    h += (h << 5) + Objects.hashCode(defaultValueCount);
    h += (h << 5) + Objects.hashCode(defaultValueDecimal);
    h += (h << 5) + Objects.hashCode(defaultValueTiming);
    h += (h << 5) + Objects.hashCode(logMessage);
    h += (h << 5) + Objects.hashCode(defaultValueTime);
    h += (h << 5) + Objects.hashCode(defaultValueDateTime);
    h += (h << 5) + Objects.hashCode(element);
    h += (h << 5) + Objects.hashCode(defaultValueUnsignedInt);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(defaultValueMarkdown);
    h += (h << 5) + Objects.hashCode(defaultValueBase64Binary);
    h += (h << 5) + Objects.hashCode(defaultValueHumanName);
    h += (h << 5) + Objects.hashCode(defaultValueContactPoint);
    h += (h << 5) + Objects.hashCode(defaultValueSampledData);
    h += (h << 5) + Objects.hashCode(variable);
    h += (h << 5) + Objects.hashCode(defaultValueUuid);
    h += (h << 5) + Objects.hashCode(min);
    h += (h << 5) + Objects.hashCode(defaultValueSignature);
    h += (h << 5) + Objects.hashCode(max);
    h += (h << 5) + Objects.hashCode(defaultValueAttachment);
    h += (h << 5) + Objects.hashCode(defaultValueUri);
    h += (h << 5) + Objects.hashCode(defaultValueRatio);
    h += (h << 5) + Objects.hashCode(defaultValueExpression);
    h += (h << 5) + Objects.hashCode(listMode);
    h += (h << 5) + Objects.hashCode(defaultValueInteger);
    h += (h << 5) + Objects.hashCode(defaultValueString);
    h += (h << 5) + Objects.hashCode(defaultValueAddress);
    h += (h << 5) + Objects.hashCode(defaultValueUsageContext);
    h += (h << 5) + Objects.hashCode(defaultValueTriggerDefinition);
    h += (h << 5) + Objects.hashCode(defaultValuePeriod);
    h += (h << 5) + Objects.hashCode(defaultValueRelatedArtifact);
    h += (h << 5) + Objects.hashCode(defaultValueIdentifier);
    h += (h << 5) + Objects.hashCode(defaultValueDataRequirement);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap_Source} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StructureMap_Source{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (defaultValueReference != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueReference=").append(defaultValueReference);
    }
    if (defaultValueInstant != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueInstant=").append(defaultValueInstant);
    }
    if (defaultValueDate != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDate=").append(defaultValueDate);
    }
    if (condition != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (defaultValueOid != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueOid=").append(defaultValueOid);
    }
    if (context != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("context=").append(context);
    }
    if (defaultValueId != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueId=").append(defaultValueId);
    }
    if (defaultValueMoney != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueMoney=").append(defaultValueMoney);
    }
    if (check != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("check=").append(check);
    }
    if (defaultValueCode != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueCode=").append(defaultValueCode);
    }
    if (defaultValueDuration != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDuration=").append(defaultValueDuration);
    }
    if (defaultValueDosage != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDosage=").append(defaultValueDosage);
    }
    if (defaultValueBoolean != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueBoolean=").append(defaultValueBoolean);
    }
    if (defaultValueContactDetail != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueContactDetail=").append(defaultValueContactDetail);
    }
    if (defaultValueContributor != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueContributor=").append(defaultValueContributor);
    }
    if (defaultValueRange != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueRange=").append(defaultValueRange);
    }
    if (defaultValueParameterDefinition != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueParameterDefinition=").append(defaultValueParameterDefinition);
    }
    if (defaultValueAge != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueAge=").append(defaultValueAge);
    }
    if (defaultValueAnnotation != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueAnnotation=").append(defaultValueAnnotation);
    }
    if (defaultValueQuantity != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueQuantity=").append(defaultValueQuantity);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (defaultValueMeta != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueMeta=").append(defaultValueMeta);
    }
    if (defaultValueCodeableConcept != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueCodeableConcept=").append(defaultValueCodeableConcept);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (defaultValueDistance != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDistance=").append(defaultValueDistance);
    }
    if (defaultValueCoding != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueCoding=").append(defaultValueCoding);
    }
    if (defaultValueCanonical != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueCanonical=").append(defaultValueCanonical);
    }
    if (defaultValuePositiveInt != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValuePositiveInt=").append(defaultValuePositiveInt);
    }
    if (defaultValueUrl != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueUrl=").append(defaultValueUrl);
    }
    if (defaultValueCount != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueCount=").append(defaultValueCount);
    }
    if (defaultValueDecimal != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDecimal=").append(defaultValueDecimal);
    }
    if (defaultValueTiming != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueTiming=").append(defaultValueTiming);
    }
    if (logMessage != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("logMessage=").append(logMessage);
    }
    if (defaultValueTime != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueTime=").append(defaultValueTime);
    }
    if (defaultValueDateTime != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDateTime=").append(defaultValueDateTime);
    }
    if (element != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("element=").append(element);
    }
    if (defaultValueUnsignedInt != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueUnsignedInt=").append(defaultValueUnsignedInt);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (defaultValueMarkdown != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueMarkdown=").append(defaultValueMarkdown);
    }
    if (defaultValueBase64Binary != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueBase64Binary=").append(defaultValueBase64Binary);
    }
    if (defaultValueHumanName != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueHumanName=").append(defaultValueHumanName);
    }
    if (defaultValueContactPoint != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueContactPoint=").append(defaultValueContactPoint);
    }
    if (defaultValueSampledData != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueSampledData=").append(defaultValueSampledData);
    }
    if (variable != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("variable=").append(variable);
    }
    if (defaultValueUuid != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueUuid=").append(defaultValueUuid);
    }
    if (min != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("min=").append(min);
    }
    if (defaultValueSignature != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueSignature=").append(defaultValueSignature);
    }
    if (max != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("max=").append(max);
    }
    if (defaultValueAttachment != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueAttachment=").append(defaultValueAttachment);
    }
    if (defaultValueUri != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueUri=").append(defaultValueUri);
    }
    if (defaultValueRatio != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueRatio=").append(defaultValueRatio);
    }
    if (defaultValueExpression != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueExpression=").append(defaultValueExpression);
    }
    if (listMode != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("listMode=").append(listMode);
    }
    if (defaultValueInteger != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueInteger=").append(defaultValueInteger);
    }
    if (defaultValueString != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueString=").append(defaultValueString);
    }
    if (defaultValueAddress != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueAddress=").append(defaultValueAddress);
    }
    if (defaultValueUsageContext != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueUsageContext=").append(defaultValueUsageContext);
    }
    if (defaultValueTriggerDefinition != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueTriggerDefinition=").append(defaultValueTriggerDefinition);
    }
    if (defaultValuePeriod != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValuePeriod=").append(defaultValuePeriod);
    }
    if (defaultValueRelatedArtifact != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueRelatedArtifact=").append(defaultValueRelatedArtifact);
    }
    if (defaultValueIdentifier != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueIdentifier=").append(defaultValueIdentifier);
    }
    if (defaultValueDataRequirement != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("defaultValueDataRequirement=").append(defaultValueDataRequirement);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "StructureMap_Source", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements StructureMap_Source {
    @Nullable Optional<String> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Reference> defaultValueReference = Optional.empty();
    boolean defaultValueReferenceIsSet;
    @Nullable Optional<String> defaultValueInstant = Optional.empty();
    boolean defaultValueInstantIsSet;
    @Nullable Optional<String> defaultValueDate = Optional.empty();
    boolean defaultValueDateIsSet;
    @Nullable Optional<String> condition = Optional.empty();
    boolean conditionIsSet;
    @Nullable Optional<String> defaultValueOid = Optional.empty();
    boolean defaultValueOidIsSet;
    @Nullable Optional<Id> context = Optional.empty();
    boolean contextIsSet;
    @Nullable Optional<String> defaultValueId = Optional.empty();
    boolean defaultValueIdIsSet;
    @Nullable Optional<Money> defaultValueMoney = Optional.empty();
    boolean defaultValueMoneyIsSet;
    @Nullable Optional<String> check = Optional.empty();
    boolean checkIsSet;
    @Nullable Optional<String> defaultValueCode = Optional.empty();
    boolean defaultValueCodeIsSet;
    @Nullable Optional<Duration> defaultValueDuration = Optional.empty();
    boolean defaultValueDurationIsSet;
    @Nullable Optional<Dosage> defaultValueDosage = Optional.empty();
    boolean defaultValueDosageIsSet;
    @Nullable Optional<Boolean> defaultValueBoolean = Optional.empty();
    boolean defaultValueBooleanIsSet;
    @Nullable Optional<ContactDetail> defaultValueContactDetail = Optional.empty();
    boolean defaultValueContactDetailIsSet;
    @Nullable Optional<Contributor> defaultValueContributor = Optional.empty();
    boolean defaultValueContributorIsSet;
    @Nullable Optional<Range> defaultValueRange = Optional.empty();
    boolean defaultValueRangeIsSet;
    @Nullable Optional<ParameterDefinition> defaultValueParameterDefinition = Optional.empty();
    boolean defaultValueParameterDefinitionIsSet;
    @Nullable Optional<Age> defaultValueAge = Optional.empty();
    boolean defaultValueAgeIsSet;
    @Nullable Optional<Annotation> defaultValueAnnotation = Optional.empty();
    boolean defaultValueAnnotationIsSet;
    @Nullable Optional<Quantity> defaultValueQuantity = Optional.empty();
    boolean defaultValueQuantityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Meta> defaultValueMeta = Optional.empty();
    boolean defaultValueMetaIsSet;
    @Nullable Optional<CodeableConcept> defaultValueCodeableConcept = Optional.empty();
    boolean defaultValueCodeableConceptIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Distance> defaultValueDistance = Optional.empty();
    boolean defaultValueDistanceIsSet;
    @Nullable Optional<Coding> defaultValueCoding = Optional.empty();
    boolean defaultValueCodingIsSet;
    @Nullable Optional<String> defaultValueCanonical = Optional.empty();
    boolean defaultValueCanonicalIsSet;
    @Nullable Optional<Double> defaultValuePositiveInt = Optional.empty();
    boolean defaultValuePositiveIntIsSet;
    @Nullable Optional<String> defaultValueUrl = Optional.empty();
    boolean defaultValueUrlIsSet;
    @Nullable Optional<Count> defaultValueCount = Optional.empty();
    boolean defaultValueCountIsSet;
    @Nullable Optional<Double> defaultValueDecimal = Optional.empty();
    boolean defaultValueDecimalIsSet;
    @Nullable Optional<Timing> defaultValueTiming = Optional.empty();
    boolean defaultValueTimingIsSet;
    @Nullable Optional<String> logMessage = Optional.empty();
    boolean logMessageIsSet;
    @Nullable Optional<String> defaultValueTime = Optional.empty();
    boolean defaultValueTimeIsSet;
    @Nullable Optional<String> defaultValueDateTime = Optional.empty();
    boolean defaultValueDateTimeIsSet;
    @Nullable Optional<String> element = Optional.empty();
    boolean elementIsSet;
    @Nullable Optional<Double> defaultValueUnsignedInt = Optional.empty();
    boolean defaultValueUnsignedIntIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> defaultValueMarkdown = Optional.empty();
    boolean defaultValueMarkdownIsSet;
    @Nullable Optional<String> defaultValueBase64Binary = Optional.empty();
    boolean defaultValueBase64BinaryIsSet;
    @Nullable Optional<HumanName> defaultValueHumanName = Optional.empty();
    boolean defaultValueHumanNameIsSet;
    @Nullable Optional<ContactPoint> defaultValueContactPoint = Optional.empty();
    boolean defaultValueContactPointIsSet;
    @Nullable Optional<SampledData> defaultValueSampledData = Optional.empty();
    boolean defaultValueSampledDataIsSet;
    @Nullable Optional<Id> variable = Optional.empty();
    boolean variableIsSet;
    @Nullable Optional<String> defaultValueUuid = Optional.empty();
    boolean defaultValueUuidIsSet;
    @Nullable Optional<Integer> min = Optional.empty();
    boolean minIsSet;
    @Nullable Optional<Signature> defaultValueSignature = Optional.empty();
    boolean defaultValueSignatureIsSet;
    @Nullable Optional<String> max = Optional.empty();
    boolean maxIsSet;
    @Nullable Optional<Attachment> defaultValueAttachment = Optional.empty();
    boolean defaultValueAttachmentIsSet;
    @Nullable Optional<String> defaultValueUri = Optional.empty();
    boolean defaultValueUriIsSet;
    @Nullable Optional<Ratio> defaultValueRatio = Optional.empty();
    boolean defaultValueRatioIsSet;
    @Nullable Optional<Expression> defaultValueExpression = Optional.empty();
    boolean defaultValueExpressionIsSet;
    @Nullable Optional<Structuremap_sourceListmode> listMode = Optional.empty();
    boolean listModeIsSet;
    @Nullable Optional<Double> defaultValueInteger = Optional.empty();
    boolean defaultValueIntegerIsSet;
    @Nullable Optional<String> defaultValueString = Optional.empty();
    boolean defaultValueStringIsSet;
    @Nullable Optional<Address> defaultValueAddress = Optional.empty();
    boolean defaultValueAddressIsSet;
    @Nullable Optional<UsageContext> defaultValueUsageContext = Optional.empty();
    boolean defaultValueUsageContextIsSet;
    @Nullable Optional<TriggerDefinition> defaultValueTriggerDefinition = Optional.empty();
    boolean defaultValueTriggerDefinitionIsSet;
    @Nullable Optional<Period> defaultValuePeriod = Optional.empty();
    boolean defaultValuePeriodIsSet;
    @Nullable Optional<RelatedArtifact> defaultValueRelatedArtifact = Optional.empty();
    boolean defaultValueRelatedArtifactIsSet;
    @Nullable Optional<Identifier> defaultValueIdentifier = Optional.empty();
    boolean defaultValueIdentifierIsSet;
    @Nullable Optional<DataRequirement> defaultValueDataRequirement = Optional.empty();
    boolean defaultValueDataRequirementIsSet;
    @JsonProperty("type")
    public void setType(Optional<String> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("defaultValueReference")
    public void setDefaultValueReference(Optional<Reference> defaultValueReference) {
      this.defaultValueReference = defaultValueReference;
      this.defaultValueReferenceIsSet = true;
    }
    @JsonProperty("defaultValueInstant")
    public void setDefaultValueInstant(Optional<String> defaultValueInstant) {
      this.defaultValueInstant = defaultValueInstant;
      this.defaultValueInstantIsSet = true;
    }
    @JsonProperty("defaultValueDate")
    public void setDefaultValueDate(Optional<String> defaultValueDate) {
      this.defaultValueDate = defaultValueDate;
      this.defaultValueDateIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Optional<String> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @JsonProperty("defaultValueOid")
    public void setDefaultValueOid(Optional<String> defaultValueOid) {
      this.defaultValueOid = defaultValueOid;
      this.defaultValueOidIsSet = true;
    }
    @JsonProperty("context")
    public void setContext(Optional<Id> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @JsonProperty("defaultValueId")
    public void setDefaultValueId(Optional<String> defaultValueId) {
      this.defaultValueId = defaultValueId;
      this.defaultValueIdIsSet = true;
    }
    @JsonProperty("defaultValueMoney")
    public void setDefaultValueMoney(Optional<Money> defaultValueMoney) {
      this.defaultValueMoney = defaultValueMoney;
      this.defaultValueMoneyIsSet = true;
    }
    @JsonProperty("check")
    public void setCheck(Optional<String> check) {
      this.check = check;
      this.checkIsSet = true;
    }
    @JsonProperty("defaultValueCode")
    public void setDefaultValueCode(Optional<String> defaultValueCode) {
      this.defaultValueCode = defaultValueCode;
      this.defaultValueCodeIsSet = true;
    }
    @JsonProperty("defaultValueDuration")
    public void setDefaultValueDuration(Optional<Duration> defaultValueDuration) {
      this.defaultValueDuration = defaultValueDuration;
      this.defaultValueDurationIsSet = true;
    }
    @JsonProperty("defaultValueDosage")
    public void setDefaultValueDosage(Optional<Dosage> defaultValueDosage) {
      this.defaultValueDosage = defaultValueDosage;
      this.defaultValueDosageIsSet = true;
    }
    @JsonProperty("defaultValueBoolean")
    public void setDefaultValueBoolean(Optional<Boolean> defaultValueBoolean) {
      this.defaultValueBoolean = defaultValueBoolean;
      this.defaultValueBooleanIsSet = true;
    }
    @JsonProperty("defaultValueContactDetail")
    public void setDefaultValueContactDetail(Optional<ContactDetail> defaultValueContactDetail) {
      this.defaultValueContactDetail = defaultValueContactDetail;
      this.defaultValueContactDetailIsSet = true;
    }
    @JsonProperty("defaultValueContributor")
    public void setDefaultValueContributor(Optional<Contributor> defaultValueContributor) {
      this.defaultValueContributor = defaultValueContributor;
      this.defaultValueContributorIsSet = true;
    }
    @JsonProperty("defaultValueRange")
    public void setDefaultValueRange(Optional<Range> defaultValueRange) {
      this.defaultValueRange = defaultValueRange;
      this.defaultValueRangeIsSet = true;
    }
    @JsonProperty("defaultValueParameterDefinition")
    public void setDefaultValueParameterDefinition(Optional<ParameterDefinition> defaultValueParameterDefinition) {
      this.defaultValueParameterDefinition = defaultValueParameterDefinition;
      this.defaultValueParameterDefinitionIsSet = true;
    }
    @JsonProperty("defaultValueAge")
    public void setDefaultValueAge(Optional<Age> defaultValueAge) {
      this.defaultValueAge = defaultValueAge;
      this.defaultValueAgeIsSet = true;
    }
    @JsonProperty("defaultValueAnnotation")
    public void setDefaultValueAnnotation(Optional<Annotation> defaultValueAnnotation) {
      this.defaultValueAnnotation = defaultValueAnnotation;
      this.defaultValueAnnotationIsSet = true;
    }
    @JsonProperty("defaultValueQuantity")
    public void setDefaultValueQuantity(Optional<Quantity> defaultValueQuantity) {
      this.defaultValueQuantity = defaultValueQuantity;
      this.defaultValueQuantityIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("defaultValueMeta")
    public void setDefaultValueMeta(Optional<Meta> defaultValueMeta) {
      this.defaultValueMeta = defaultValueMeta;
      this.defaultValueMetaIsSet = true;
    }
    @JsonProperty("defaultValueCodeableConcept")
    public void setDefaultValueCodeableConcept(Optional<CodeableConcept> defaultValueCodeableConcept) {
      this.defaultValueCodeableConcept = defaultValueCodeableConcept;
      this.defaultValueCodeableConceptIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("defaultValueDistance")
    public void setDefaultValueDistance(Optional<Distance> defaultValueDistance) {
      this.defaultValueDistance = defaultValueDistance;
      this.defaultValueDistanceIsSet = true;
    }
    @JsonProperty("defaultValueCoding")
    public void setDefaultValueCoding(Optional<Coding> defaultValueCoding) {
      this.defaultValueCoding = defaultValueCoding;
      this.defaultValueCodingIsSet = true;
    }
    @JsonProperty("defaultValueCanonical")
    public void setDefaultValueCanonical(Optional<String> defaultValueCanonical) {
      this.defaultValueCanonical = defaultValueCanonical;
      this.defaultValueCanonicalIsSet = true;
    }
    @JsonProperty("defaultValuePositiveInt")
    public void setDefaultValuePositiveInt(Optional<Double> defaultValuePositiveInt) {
      this.defaultValuePositiveInt = defaultValuePositiveInt;
      this.defaultValuePositiveIntIsSet = true;
    }
    @JsonProperty("defaultValueUrl")
    public void setDefaultValueUrl(Optional<String> defaultValueUrl) {
      this.defaultValueUrl = defaultValueUrl;
      this.defaultValueUrlIsSet = true;
    }
    @JsonProperty("defaultValueCount")
    public void setDefaultValueCount(Optional<Count> defaultValueCount) {
      this.defaultValueCount = defaultValueCount;
      this.defaultValueCountIsSet = true;
    }
    @JsonProperty("defaultValueDecimal")
    public void setDefaultValueDecimal(Optional<Double> defaultValueDecimal) {
      this.defaultValueDecimal = defaultValueDecimal;
      this.defaultValueDecimalIsSet = true;
    }
    @JsonProperty("defaultValueTiming")
    public void setDefaultValueTiming(Optional<Timing> defaultValueTiming) {
      this.defaultValueTiming = defaultValueTiming;
      this.defaultValueTimingIsSet = true;
    }
    @JsonProperty("logMessage")
    public void setLogMessage(Optional<String> logMessage) {
      this.logMessage = logMessage;
      this.logMessageIsSet = true;
    }
    @JsonProperty("defaultValueTime")
    public void setDefaultValueTime(Optional<String> defaultValueTime) {
      this.defaultValueTime = defaultValueTime;
      this.defaultValueTimeIsSet = true;
    }
    @JsonProperty("defaultValueDateTime")
    public void setDefaultValueDateTime(Optional<String> defaultValueDateTime) {
      this.defaultValueDateTime = defaultValueDateTime;
      this.defaultValueDateTimeIsSet = true;
    }
    @JsonProperty("element")
    public void setElement(Optional<String> element) {
      this.element = element;
      this.elementIsSet = true;
    }
    @JsonProperty("defaultValueUnsignedInt")
    public void setDefaultValueUnsignedInt(Optional<Double> defaultValueUnsignedInt) {
      this.defaultValueUnsignedInt = defaultValueUnsignedInt;
      this.defaultValueUnsignedIntIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("defaultValueMarkdown")
    public void setDefaultValueMarkdown(Optional<String> defaultValueMarkdown) {
      this.defaultValueMarkdown = defaultValueMarkdown;
      this.defaultValueMarkdownIsSet = true;
    }
    @JsonProperty("defaultValueBase64Binary")
    public void setDefaultValueBase64Binary(Optional<String> defaultValueBase64Binary) {
      this.defaultValueBase64Binary = defaultValueBase64Binary;
      this.defaultValueBase64BinaryIsSet = true;
    }
    @JsonProperty("defaultValueHumanName")
    public void setDefaultValueHumanName(Optional<HumanName> defaultValueHumanName) {
      this.defaultValueHumanName = defaultValueHumanName;
      this.defaultValueHumanNameIsSet = true;
    }
    @JsonProperty("defaultValueContactPoint")
    public void setDefaultValueContactPoint(Optional<ContactPoint> defaultValueContactPoint) {
      this.defaultValueContactPoint = defaultValueContactPoint;
      this.defaultValueContactPointIsSet = true;
    }
    @JsonProperty("defaultValueSampledData")
    public void setDefaultValueSampledData(Optional<SampledData> defaultValueSampledData) {
      this.defaultValueSampledData = defaultValueSampledData;
      this.defaultValueSampledDataIsSet = true;
    }
    @JsonProperty("variable")
    public void setVariable(Optional<Id> variable) {
      this.variable = variable;
      this.variableIsSet = true;
    }
    @JsonProperty("defaultValueUuid")
    public void setDefaultValueUuid(Optional<String> defaultValueUuid) {
      this.defaultValueUuid = defaultValueUuid;
      this.defaultValueUuidIsSet = true;
    }
    @JsonProperty("min")
    public void setMin(Optional<Integer> min) {
      this.min = min;
      this.minIsSet = true;
    }
    @JsonProperty("defaultValueSignature")
    public void setDefaultValueSignature(Optional<Signature> defaultValueSignature) {
      this.defaultValueSignature = defaultValueSignature;
      this.defaultValueSignatureIsSet = true;
    }
    @JsonProperty("max")
    public void setMax(Optional<String> max) {
      this.max = max;
      this.maxIsSet = true;
    }
    @JsonProperty("defaultValueAttachment")
    public void setDefaultValueAttachment(Optional<Attachment> defaultValueAttachment) {
      this.defaultValueAttachment = defaultValueAttachment;
      this.defaultValueAttachmentIsSet = true;
    }
    @JsonProperty("defaultValueUri")
    public void setDefaultValueUri(Optional<String> defaultValueUri) {
      this.defaultValueUri = defaultValueUri;
      this.defaultValueUriIsSet = true;
    }
    @JsonProperty("defaultValueRatio")
    public void setDefaultValueRatio(Optional<Ratio> defaultValueRatio) {
      this.defaultValueRatio = defaultValueRatio;
      this.defaultValueRatioIsSet = true;
    }
    @JsonProperty("defaultValueExpression")
    public void setDefaultValueExpression(Optional<Expression> defaultValueExpression) {
      this.defaultValueExpression = defaultValueExpression;
      this.defaultValueExpressionIsSet = true;
    }
    @JsonProperty("listMode")
    public void setListMode(Optional<Structuremap_sourceListmode> listMode) {
      this.listMode = listMode;
      this.listModeIsSet = true;
    }
    @JsonProperty("defaultValueInteger")
    public void setDefaultValueInteger(Optional<Double> defaultValueInteger) {
      this.defaultValueInteger = defaultValueInteger;
      this.defaultValueIntegerIsSet = true;
    }
    @JsonProperty("defaultValueString")
    public void setDefaultValueString(Optional<String> defaultValueString) {
      this.defaultValueString = defaultValueString;
      this.defaultValueStringIsSet = true;
    }
    @JsonProperty("defaultValueAddress")
    public void setDefaultValueAddress(Optional<Address> defaultValueAddress) {
      this.defaultValueAddress = defaultValueAddress;
      this.defaultValueAddressIsSet = true;
    }
    @JsonProperty("defaultValueUsageContext")
    public void setDefaultValueUsageContext(Optional<UsageContext> defaultValueUsageContext) {
      this.defaultValueUsageContext = defaultValueUsageContext;
      this.defaultValueUsageContextIsSet = true;
    }
    @JsonProperty("defaultValueTriggerDefinition")
    public void setDefaultValueTriggerDefinition(Optional<TriggerDefinition> defaultValueTriggerDefinition) {
      this.defaultValueTriggerDefinition = defaultValueTriggerDefinition;
      this.defaultValueTriggerDefinitionIsSet = true;
    }
    @JsonProperty("defaultValuePeriod")
    public void setDefaultValuePeriod(Optional<Period> defaultValuePeriod) {
      this.defaultValuePeriod = defaultValuePeriod;
      this.defaultValuePeriodIsSet = true;
    }
    @JsonProperty("defaultValueRelatedArtifact")
    public void setDefaultValueRelatedArtifact(Optional<RelatedArtifact> defaultValueRelatedArtifact) {
      this.defaultValueRelatedArtifact = defaultValueRelatedArtifact;
      this.defaultValueRelatedArtifactIsSet = true;
    }
    @JsonProperty("defaultValueIdentifier")
    public void setDefaultValueIdentifier(Optional<Identifier> defaultValueIdentifier) {
      this.defaultValueIdentifier = defaultValueIdentifier;
      this.defaultValueIdentifierIsSet = true;
    }
    @JsonProperty("defaultValueDataRequirement")
    public void setDefaultValueDataRequirement(Optional<DataRequirement> defaultValueDataRequirement) {
      this.defaultValueDataRequirement = defaultValueDataRequirement;
      this.defaultValueDataRequirementIsSet = true;
    }
    @Override
    public Optional<String> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> defaultValueReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueInstant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> condition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueOid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> context() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> defaultValueMoney() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> check() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> defaultValueDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Dosage> defaultValueDosage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> defaultValueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ContactDetail> defaultValueContactDetail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Contributor> defaultValueContributor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> defaultValueRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ParameterDefinition> defaultValueParameterDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> defaultValueAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Annotation> defaultValueAnnotation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> defaultValueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> defaultValueMeta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> defaultValueCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Distance> defaultValueDistance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> defaultValueCoding() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> defaultValuePositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueUrl() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Count> defaultValueCount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> defaultValueDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> defaultValueTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> logMessage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> element() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> defaultValueUnsignedInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueMarkdown() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueBase64Binary() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<HumanName> defaultValueHumanName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ContactPoint> defaultValueContactPoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SampledData> defaultValueSampledData() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> variable() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueUuid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> min() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Signature> defaultValueSignature() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> max() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> defaultValueAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> defaultValueRatio() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Expression> defaultValueExpression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Structuremap_sourceListmode> listMode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> defaultValueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> defaultValueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Address> defaultValueAddress() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UsageContext> defaultValueUsageContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TriggerDefinition> defaultValueTriggerDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> defaultValuePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<RelatedArtifact> defaultValueRelatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> defaultValueIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DataRequirement> defaultValueDataRequirement() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap_Source fromJson(Json json) {
    ImmutableStructureMap_Source.Builder builder = ImmutableStructureMap_Source.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.defaultValueReferenceIsSet) {
      builder.defaultValueReference(json.defaultValueReference);
    }
    if (json.defaultValueInstantIsSet) {
      builder.defaultValueInstant(json.defaultValueInstant);
    }
    if (json.defaultValueDateIsSet) {
      builder.defaultValueDate(json.defaultValueDate);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.defaultValueOidIsSet) {
      builder.defaultValueOid(json.defaultValueOid);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.defaultValueIdIsSet) {
      builder.defaultValueId(json.defaultValueId);
    }
    if (json.defaultValueMoneyIsSet) {
      builder.defaultValueMoney(json.defaultValueMoney);
    }
    if (json.checkIsSet) {
      builder.check(json.check);
    }
    if (json.defaultValueCodeIsSet) {
      builder.defaultValueCode(json.defaultValueCode);
    }
    if (json.defaultValueDurationIsSet) {
      builder.defaultValueDuration(json.defaultValueDuration);
    }
    if (json.defaultValueDosageIsSet) {
      builder.defaultValueDosage(json.defaultValueDosage);
    }
    if (json.defaultValueBooleanIsSet) {
      builder.defaultValueBoolean(json.defaultValueBoolean);
    }
    if (json.defaultValueContactDetailIsSet) {
      builder.defaultValueContactDetail(json.defaultValueContactDetail);
    }
    if (json.defaultValueContributorIsSet) {
      builder.defaultValueContributor(json.defaultValueContributor);
    }
    if (json.defaultValueRangeIsSet) {
      builder.defaultValueRange(json.defaultValueRange);
    }
    if (json.defaultValueParameterDefinitionIsSet) {
      builder.defaultValueParameterDefinition(json.defaultValueParameterDefinition);
    }
    if (json.defaultValueAgeIsSet) {
      builder.defaultValueAge(json.defaultValueAge);
    }
    if (json.defaultValueAnnotationIsSet) {
      builder.defaultValueAnnotation(json.defaultValueAnnotation);
    }
    if (json.defaultValueQuantityIsSet) {
      builder.defaultValueQuantity(json.defaultValueQuantity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.defaultValueMetaIsSet) {
      builder.defaultValueMeta(json.defaultValueMeta);
    }
    if (json.defaultValueCodeableConceptIsSet) {
      builder.defaultValueCodeableConcept(json.defaultValueCodeableConcept);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.defaultValueDistanceIsSet) {
      builder.defaultValueDistance(json.defaultValueDistance);
    }
    if (json.defaultValueCodingIsSet) {
      builder.defaultValueCoding(json.defaultValueCoding);
    }
    if (json.defaultValueCanonicalIsSet) {
      builder.defaultValueCanonical(json.defaultValueCanonical);
    }
    if (json.defaultValuePositiveIntIsSet) {
      builder.defaultValuePositiveInt(json.defaultValuePositiveInt);
    }
    if (json.defaultValueUrlIsSet) {
      builder.defaultValueUrl(json.defaultValueUrl);
    }
    if (json.defaultValueCountIsSet) {
      builder.defaultValueCount(json.defaultValueCount);
    }
    if (json.defaultValueDecimalIsSet) {
      builder.defaultValueDecimal(json.defaultValueDecimal);
    }
    if (json.defaultValueTimingIsSet) {
      builder.defaultValueTiming(json.defaultValueTiming);
    }
    if (json.logMessageIsSet) {
      builder.logMessage(json.logMessage);
    }
    if (json.defaultValueTimeIsSet) {
      builder.defaultValueTime(json.defaultValueTime);
    }
    if (json.defaultValueDateTimeIsSet) {
      builder.defaultValueDateTime(json.defaultValueDateTime);
    }
    if (json.elementIsSet) {
      builder.element(json.element);
    }
    if (json.defaultValueUnsignedIntIsSet) {
      builder.defaultValueUnsignedInt(json.defaultValueUnsignedInt);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.defaultValueMarkdownIsSet) {
      builder.defaultValueMarkdown(json.defaultValueMarkdown);
    }
    if (json.defaultValueBase64BinaryIsSet) {
      builder.defaultValueBase64Binary(json.defaultValueBase64Binary);
    }
    if (json.defaultValueHumanNameIsSet) {
      builder.defaultValueHumanName(json.defaultValueHumanName);
    }
    if (json.defaultValueContactPointIsSet) {
      builder.defaultValueContactPoint(json.defaultValueContactPoint);
    }
    if (json.defaultValueSampledDataIsSet) {
      builder.defaultValueSampledData(json.defaultValueSampledData);
    }
    if (json.variableIsSet) {
      builder.variable(json.variable);
    }
    if (json.defaultValueUuidIsSet) {
      builder.defaultValueUuid(json.defaultValueUuid);
    }
    if (json.minIsSet) {
      builder.min(json.min);
    }
    if (json.defaultValueSignatureIsSet) {
      builder.defaultValueSignature(json.defaultValueSignature);
    }
    if (json.maxIsSet) {
      builder.max(json.max);
    }
    if (json.defaultValueAttachmentIsSet) {
      builder.defaultValueAttachment(json.defaultValueAttachment);
    }
    if (json.defaultValueUriIsSet) {
      builder.defaultValueUri(json.defaultValueUri);
    }
    if (json.defaultValueRatioIsSet) {
      builder.defaultValueRatio(json.defaultValueRatio);
    }
    if (json.defaultValueExpressionIsSet) {
      builder.defaultValueExpression(json.defaultValueExpression);
    }
    if (json.listModeIsSet) {
      builder.listMode(json.listMode);
    }
    if (json.defaultValueIntegerIsSet) {
      builder.defaultValueInteger(json.defaultValueInteger);
    }
    if (json.defaultValueStringIsSet) {
      builder.defaultValueString(json.defaultValueString);
    }
    if (json.defaultValueAddressIsSet) {
      builder.defaultValueAddress(json.defaultValueAddress);
    }
    if (json.defaultValueUsageContextIsSet) {
      builder.defaultValueUsageContext(json.defaultValueUsageContext);
    }
    if (json.defaultValueTriggerDefinitionIsSet) {
      builder.defaultValueTriggerDefinition(json.defaultValueTriggerDefinition);
    }
    if (json.defaultValuePeriodIsSet) {
      builder.defaultValuePeriod(json.defaultValuePeriod);
    }
    if (json.defaultValueRelatedArtifactIsSet) {
      builder.defaultValueRelatedArtifact(json.defaultValueRelatedArtifact);
    }
    if (json.defaultValueIdentifierIsSet) {
      builder.defaultValueIdentifier(json.defaultValueIdentifier);
    }
    if (json.defaultValueDataRequirementIsSet) {
      builder.defaultValueDataRequirement(json.defaultValueDataRequirement);
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
        .type(instance.type())
        .defaultValueReference(instance.defaultValueReference())
        .defaultValueInstant(instance.defaultValueInstant())
        .defaultValueDate(instance.defaultValueDate())
        .condition(instance.condition())
        .defaultValueOid(instance.defaultValueOid())
        .context(instance.context())
        .defaultValueId(instance.defaultValueId())
        .defaultValueMoney(instance.defaultValueMoney())
        .check(instance.check())
        .defaultValueCode(instance.defaultValueCode())
        .defaultValueDuration(instance.defaultValueDuration())
        .defaultValueDosage(instance.defaultValueDosage())
        .defaultValueBoolean(instance.defaultValueBoolean())
        .defaultValueContactDetail(instance.defaultValueContactDetail())
        .defaultValueContributor(instance.defaultValueContributor())
        .defaultValueRange(instance.defaultValueRange())
        .defaultValueParameterDefinition(instance.defaultValueParameterDefinition())
        .defaultValueAge(instance.defaultValueAge())
        .defaultValueAnnotation(instance.defaultValueAnnotation())
        .defaultValueQuantity(instance.defaultValueQuantity())
        .extension(instance.extension())
        .defaultValueMeta(instance.defaultValueMeta())
        .defaultValueCodeableConcept(instance.defaultValueCodeableConcept())
        .modifierExtension(instance.modifierExtension())
        .defaultValueDistance(instance.defaultValueDistance())
        .defaultValueCoding(instance.defaultValueCoding())
        .defaultValueCanonical(instance.defaultValueCanonical())
        .defaultValuePositiveInt(instance.defaultValuePositiveInt())
        .defaultValueUrl(instance.defaultValueUrl())
        .defaultValueCount(instance.defaultValueCount())
        .defaultValueDecimal(instance.defaultValueDecimal())
        .defaultValueTiming(instance.defaultValueTiming())
        .logMessage(instance.logMessage())
        .defaultValueTime(instance.defaultValueTime())
        .defaultValueDateTime(instance.defaultValueDateTime())
        .element(instance.element())
        .defaultValueUnsignedInt(instance.defaultValueUnsignedInt())
        .id(instance.id())
        .defaultValueMarkdown(instance.defaultValueMarkdown())
        .defaultValueBase64Binary(instance.defaultValueBase64Binary())
        .defaultValueHumanName(instance.defaultValueHumanName())
        .defaultValueContactPoint(instance.defaultValueContactPoint())
        .defaultValueSampledData(instance.defaultValueSampledData())
        .variable(instance.variable())
        .defaultValueUuid(instance.defaultValueUuid())
        .min(instance.min())
        .defaultValueSignature(instance.defaultValueSignature())
        .max(instance.max())
        .defaultValueAttachment(instance.defaultValueAttachment())
        .defaultValueUri(instance.defaultValueUri())
        .defaultValueRatio(instance.defaultValueRatio())
        .defaultValueExpression(instance.defaultValueExpression())
        .listMode(instance.listMode())
        .defaultValueInteger(instance.defaultValueInteger())
        .defaultValueString(instance.defaultValueString())
        .defaultValueAddress(instance.defaultValueAddress())
        .defaultValueUsageContext(instance.defaultValueUsageContext())
        .defaultValueTriggerDefinition(instance.defaultValueTriggerDefinition())
        .defaultValuePeriod(instance.defaultValuePeriod())
        .defaultValueRelatedArtifact(instance.defaultValueRelatedArtifact())
        .defaultValueIdentifier(instance.defaultValueIdentifier())
        .defaultValueDataRequirement(instance.defaultValueDataRequirement())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap_Source StructureMap_Source}.
   * <pre>
   * ImmutableStructureMap_Source.builder()
   *    .type(String) // optional {@link StructureMap_Source#type() type}
   *    .defaultValueReference(com.medplum.types.fhir.Reference) // optional {@link StructureMap_Source#defaultValueReference() defaultValueReference}
   *    .defaultValueInstant(String) // optional {@link StructureMap_Source#defaultValueInstant() defaultValueInstant}
   *    .defaultValueDate(String) // optional {@link StructureMap_Source#defaultValueDate() defaultValueDate}
   *    .condition(String) // optional {@link StructureMap_Source#condition() condition}
   *    .defaultValueOid(String) // optional {@link StructureMap_Source#defaultValueOid() defaultValueOid}
   *    .context(com.medplum.types.fhir.Id) // optional {@link StructureMap_Source#context() context}
   *    .defaultValueId(String) // optional {@link StructureMap_Source#defaultValueId() defaultValueId}
   *    .defaultValueMoney(com.medplum.types.fhir.Money) // optional {@link StructureMap_Source#defaultValueMoney() defaultValueMoney}
   *    .check(String) // optional {@link StructureMap_Source#check() check}
   *    .defaultValueCode(String) // optional {@link StructureMap_Source#defaultValueCode() defaultValueCode}
   *    .defaultValueDuration(com.medplum.types.fhir.Duration) // optional {@link StructureMap_Source#defaultValueDuration() defaultValueDuration}
   *    .defaultValueDosage(com.medplum.types.fhir.Dosage) // optional {@link StructureMap_Source#defaultValueDosage() defaultValueDosage}
   *    .defaultValueBoolean(Boolean) // optional {@link StructureMap_Source#defaultValueBoolean() defaultValueBoolean}
   *    .defaultValueContactDetail(com.medplum.types.fhir.ContactDetail) // optional {@link StructureMap_Source#defaultValueContactDetail() defaultValueContactDetail}
   *    .defaultValueContributor(com.medplum.types.fhir.Contributor) // optional {@link StructureMap_Source#defaultValueContributor() defaultValueContributor}
   *    .defaultValueRange(com.medplum.types.fhir.Range) // optional {@link StructureMap_Source#defaultValueRange() defaultValueRange}
   *    .defaultValueParameterDefinition(com.medplum.types.fhir.ParameterDefinition) // optional {@link StructureMap_Source#defaultValueParameterDefinition() defaultValueParameterDefinition}
   *    .defaultValueAge(com.medplum.types.fhir.Age) // optional {@link StructureMap_Source#defaultValueAge() defaultValueAge}
   *    .defaultValueAnnotation(com.medplum.types.fhir.Annotation) // optional {@link StructureMap_Source#defaultValueAnnotation() defaultValueAnnotation}
   *    .defaultValueQuantity(com.medplum.types.fhir.Quantity) // optional {@link StructureMap_Source#defaultValueQuantity() defaultValueQuantity}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Source#extension() extension}
   *    .defaultValueMeta(com.medplum.types.fhir.Meta) // optional {@link StructureMap_Source#defaultValueMeta() defaultValueMeta}
   *    .defaultValueCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link StructureMap_Source#defaultValueCodeableConcept() defaultValueCodeableConcept}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Source#modifierExtension() modifierExtension}
   *    .defaultValueDistance(com.medplum.types.fhir.Distance) // optional {@link StructureMap_Source#defaultValueDistance() defaultValueDistance}
   *    .defaultValueCoding(com.medplum.types.fhir.Coding) // optional {@link StructureMap_Source#defaultValueCoding() defaultValueCoding}
   *    .defaultValueCanonical(String) // optional {@link StructureMap_Source#defaultValueCanonical() defaultValueCanonical}
   *    .defaultValuePositiveInt(Double) // optional {@link StructureMap_Source#defaultValuePositiveInt() defaultValuePositiveInt}
   *    .defaultValueUrl(String) // optional {@link StructureMap_Source#defaultValueUrl() defaultValueUrl}
   *    .defaultValueCount(com.medplum.types.fhir.Count) // optional {@link StructureMap_Source#defaultValueCount() defaultValueCount}
   *    .defaultValueDecimal(Double) // optional {@link StructureMap_Source#defaultValueDecimal() defaultValueDecimal}
   *    .defaultValueTiming(com.medplum.types.fhir.Timing) // optional {@link StructureMap_Source#defaultValueTiming() defaultValueTiming}
   *    .logMessage(String) // optional {@link StructureMap_Source#logMessage() logMessage}
   *    .defaultValueTime(String) // optional {@link StructureMap_Source#defaultValueTime() defaultValueTime}
   *    .defaultValueDateTime(String) // optional {@link StructureMap_Source#defaultValueDateTime() defaultValueDateTime}
   *    .element(String) // optional {@link StructureMap_Source#element() element}
   *    .defaultValueUnsignedInt(Double) // optional {@link StructureMap_Source#defaultValueUnsignedInt() defaultValueUnsignedInt}
   *    .id(String) // optional {@link StructureMap_Source#id() id}
   *    .defaultValueMarkdown(String) // optional {@link StructureMap_Source#defaultValueMarkdown() defaultValueMarkdown}
   *    .defaultValueBase64Binary(String) // optional {@link StructureMap_Source#defaultValueBase64Binary() defaultValueBase64Binary}
   *    .defaultValueHumanName(com.medplum.types.fhir.HumanName) // optional {@link StructureMap_Source#defaultValueHumanName() defaultValueHumanName}
   *    .defaultValueContactPoint(com.medplum.types.fhir.ContactPoint) // optional {@link StructureMap_Source#defaultValueContactPoint() defaultValueContactPoint}
   *    .defaultValueSampledData(com.medplum.types.fhir.SampledData) // optional {@link StructureMap_Source#defaultValueSampledData() defaultValueSampledData}
   *    .variable(com.medplum.types.fhir.Id) // optional {@link StructureMap_Source#variable() variable}
   *    .defaultValueUuid(String) // optional {@link StructureMap_Source#defaultValueUuid() defaultValueUuid}
   *    .min(Integer) // optional {@link StructureMap_Source#min() min}
   *    .defaultValueSignature(com.medplum.types.fhir.Signature) // optional {@link StructureMap_Source#defaultValueSignature() defaultValueSignature}
   *    .max(String) // optional {@link StructureMap_Source#max() max}
   *    .defaultValueAttachment(com.medplum.types.fhir.Attachment) // optional {@link StructureMap_Source#defaultValueAttachment() defaultValueAttachment}
   *    .defaultValueUri(String) // optional {@link StructureMap_Source#defaultValueUri() defaultValueUri}
   *    .defaultValueRatio(com.medplum.types.fhir.Ratio) // optional {@link StructureMap_Source#defaultValueRatio() defaultValueRatio}
   *    .defaultValueExpression(com.medplum.types.fhir.Expression) // optional {@link StructureMap_Source#defaultValueExpression() defaultValueExpression}
   *    .listMode(com.medplum.types.fhir.Structuremap_sourceListmode) // optional {@link StructureMap_Source#listMode() listMode}
   *    .defaultValueInteger(Double) // optional {@link StructureMap_Source#defaultValueInteger() defaultValueInteger}
   *    .defaultValueString(String) // optional {@link StructureMap_Source#defaultValueString() defaultValueString}
   *    .defaultValueAddress(com.medplum.types.fhir.Address) // optional {@link StructureMap_Source#defaultValueAddress() defaultValueAddress}
   *    .defaultValueUsageContext(com.medplum.types.fhir.UsageContext) // optional {@link StructureMap_Source#defaultValueUsageContext() defaultValueUsageContext}
   *    .defaultValueTriggerDefinition(com.medplum.types.fhir.TriggerDefinition) // optional {@link StructureMap_Source#defaultValueTriggerDefinition() defaultValueTriggerDefinition}
   *    .defaultValuePeriod(com.medplum.types.fhir.Period) // optional {@link StructureMap_Source#defaultValuePeriod() defaultValuePeriod}
   *    .defaultValueRelatedArtifact(com.medplum.types.fhir.RelatedArtifact) // optional {@link StructureMap_Source#defaultValueRelatedArtifact() defaultValueRelatedArtifact}
   *    .defaultValueIdentifier(com.medplum.types.fhir.Identifier) // optional {@link StructureMap_Source#defaultValueIdentifier() defaultValueIdentifier}
   *    .defaultValueDataRequirement(com.medplum.types.fhir.DataRequirement) // optional {@link StructureMap_Source#defaultValueDataRequirement() defaultValueDataRequirement}
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
  @Generated(from = "StructureMap_Source", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_DEFAULT_VALUE_REFERENCE = 0x2L;
    private static final long OPT_BIT_DEFAULT_VALUE_INSTANT = 0x4L;
    private static final long OPT_BIT_DEFAULT_VALUE_DATE = 0x8L;
    private static final long OPT_BIT_CONDITION = 0x10L;
    private static final long OPT_BIT_DEFAULT_VALUE_OID = 0x20L;
    private static final long OPT_BIT_CONTEXT = 0x40L;
    private static final long OPT_BIT_DEFAULT_VALUE_ID = 0x80L;
    private static final long OPT_BIT_DEFAULT_VALUE_MONEY = 0x100L;
    private static final long OPT_BIT_CHECK = 0x200L;
    private static final long OPT_BIT_DEFAULT_VALUE_CODE = 0x400L;
    private static final long OPT_BIT_DEFAULT_VALUE_DURATION = 0x800L;
    private static final long OPT_BIT_DEFAULT_VALUE_DOSAGE = 0x1000L;
    private static final long OPT_BIT_DEFAULT_VALUE_BOOLEAN = 0x2000L;
    private static final long OPT_BIT_DEFAULT_VALUE_CONTACT_DETAIL = 0x4000L;
    private static final long OPT_BIT_DEFAULT_VALUE_CONTRIBUTOR = 0x8000L;
    private static final long OPT_BIT_DEFAULT_VALUE_RANGE = 0x10000L;
    private static final long OPT_BIT_DEFAULT_VALUE_PARAMETER_DEFINITION = 0x20000L;
    private static final long OPT_BIT_DEFAULT_VALUE_AGE = 0x40000L;
    private static final long OPT_BIT_DEFAULT_VALUE_ANNOTATION = 0x80000L;
    private static final long OPT_BIT_DEFAULT_VALUE_QUANTITY = 0x100000L;
    private static final long OPT_BIT_EXTENSION = 0x200000L;
    private static final long OPT_BIT_DEFAULT_VALUE_META = 0x400000L;
    private static final long OPT_BIT_DEFAULT_VALUE_CODEABLE_CONCEPT = 0x800000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_DISTANCE = 0x2000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_CODING = 0x4000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_CANONICAL = 0x8000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_POSITIVE_INT = 0x10000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_URL = 0x20000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_COUNT = 0x40000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_DECIMAL = 0x80000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_TIMING = 0x100000000L;
    private static final long OPT_BIT_LOG_MESSAGE = 0x200000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_TIME = 0x400000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_DATE_TIME = 0x800000000L;
    private static final long OPT_BIT_ELEMENT = 0x1000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_UNSIGNED_INT = 0x2000000000L;
    private static final long OPT_BIT_ID = 0x4000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_MARKDOWN = 0x8000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_BASE64_BINARY = 0x10000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_HUMAN_NAME = 0x20000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_CONTACT_POINT = 0x40000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_SAMPLED_DATA = 0x80000000000L;
    private static final long OPT_BIT_VARIABLE = 0x100000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_UUID = 0x200000000000L;
    private static final long OPT_BIT_MIN = 0x400000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_SIGNATURE = 0x800000000000L;
    private static final long OPT_BIT_MAX = 0x1000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_ATTACHMENT = 0x2000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_URI = 0x4000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_RATIO = 0x8000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_EXPRESSION = 0x10000000000000L;
    private static final long OPT_BIT_LIST_MODE = 0x20000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_INTEGER = 0x40000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_STRING = 0x80000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_ADDRESS = 0x100000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_USAGE_CONTEXT = 0x200000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_TRIGGER_DEFINITION = 0x400000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_PERIOD = 0x800000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_RELATED_ARTIFACT = 0x1000000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_IDENTIFIER = 0x2000000000000000L;
    private static final long OPT_BIT_DEFAULT_VALUE_DATA_REQUIREMENT = 0x4000000000000000L;
    private long optBits;

    private @Nullable String type;
    private @Nullable Reference defaultValueReference;
    private @Nullable String defaultValueInstant;
    private @Nullable String defaultValueDate;
    private @Nullable String condition;
    private @Nullable String defaultValueOid;
    private @Nullable Id context;
    private @Nullable String defaultValueId;
    private @Nullable Money defaultValueMoney;
    private @Nullable String check;
    private @Nullable String defaultValueCode;
    private @Nullable Duration defaultValueDuration;
    private @Nullable Dosage defaultValueDosage;
    private @Nullable Boolean defaultValueBoolean;
    private @Nullable ContactDetail defaultValueContactDetail;
    private @Nullable Contributor defaultValueContributor;
    private @Nullable Range defaultValueRange;
    private @Nullable ParameterDefinition defaultValueParameterDefinition;
    private @Nullable Age defaultValueAge;
    private @Nullable Annotation defaultValueAnnotation;
    private @Nullable Quantity defaultValueQuantity;
    private @Nullable List<Extension> extension;
    private @Nullable Meta defaultValueMeta;
    private @Nullable CodeableConcept defaultValueCodeableConcept;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Distance defaultValueDistance;
    private @Nullable Coding defaultValueCoding;
    private @Nullable String defaultValueCanonical;
    private @Nullable Double defaultValuePositiveInt;
    private @Nullable String defaultValueUrl;
    private @Nullable Count defaultValueCount;
    private @Nullable Double defaultValueDecimal;
    private @Nullable Timing defaultValueTiming;
    private @Nullable String logMessage;
    private @Nullable String defaultValueTime;
    private @Nullable String defaultValueDateTime;
    private @Nullable String element;
    private @Nullable Double defaultValueUnsignedInt;
    private @Nullable String id;
    private @Nullable String defaultValueMarkdown;
    private @Nullable String defaultValueBase64Binary;
    private @Nullable HumanName defaultValueHumanName;
    private @Nullable ContactPoint defaultValueContactPoint;
    private @Nullable SampledData defaultValueSampledData;
    private @Nullable Id variable;
    private @Nullable String defaultValueUuid;
    private @Nullable Integer min;
    private @Nullable Signature defaultValueSignature;
    private @Nullable String max;
    private @Nullable Attachment defaultValueAttachment;
    private @Nullable String defaultValueUri;
    private @Nullable Ratio defaultValueRatio;
    private @Nullable Expression defaultValueExpression;
    private @Nullable Structuremap_sourceListmode listMode;
    private @Nullable Double defaultValueInteger;
    private @Nullable String defaultValueString;
    private @Nullable Address defaultValueAddress;
    private @Nullable UsageContext defaultValueUsageContext;
    private @Nullable TriggerDefinition defaultValueTriggerDefinition;
    private @Nullable Period defaultValuePeriod;
    private @Nullable RelatedArtifact defaultValueRelatedArtifact;
    private @Nullable Identifier defaultValueIdentifier;
    private @Nullable DataRequirement defaultValueDataRequirement;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(String type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<String> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueReference() defaultValueReference} to defaultValueReference.
     * @param defaultValueReference The value for defaultValueReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueReference(Reference defaultValueReference) {
      checkNotIsSet(defaultValueReferenceIsSet(), "defaultValueReference");
      this.defaultValueReference = Objects.requireNonNull(defaultValueReference, "defaultValueReference");
      optBits |= OPT_BIT_DEFAULT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueReference() defaultValueReference} to defaultValueReference.
     * @param defaultValueReference The value for defaultValueReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueReference")
    public final Builder defaultValueReference(Optional<? extends Reference> defaultValueReference) {
      checkNotIsSet(defaultValueReferenceIsSet(), "defaultValueReference");
      this.defaultValueReference = defaultValueReference.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueInstant() defaultValueInstant} to defaultValueInstant.
     * @param defaultValueInstant The value for defaultValueInstant
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueInstant(String defaultValueInstant) {
      checkNotIsSet(defaultValueInstantIsSet(), "defaultValueInstant");
      this.defaultValueInstant = Objects.requireNonNull(defaultValueInstant, "defaultValueInstant");
      optBits |= OPT_BIT_DEFAULT_VALUE_INSTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueInstant() defaultValueInstant} to defaultValueInstant.
     * @param defaultValueInstant The value for defaultValueInstant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueInstant")
    public final Builder defaultValueInstant(Optional<String> defaultValueInstant) {
      checkNotIsSet(defaultValueInstantIsSet(), "defaultValueInstant");
      this.defaultValueInstant = defaultValueInstant.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_INSTANT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDate() defaultValueDate} to defaultValueDate.
     * @param defaultValueDate The value for defaultValueDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDate(String defaultValueDate) {
      checkNotIsSet(defaultValueDateIsSet(), "defaultValueDate");
      this.defaultValueDate = Objects.requireNonNull(defaultValueDate, "defaultValueDate");
      optBits |= OPT_BIT_DEFAULT_VALUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDate() defaultValueDate} to defaultValueDate.
     * @param defaultValueDate The value for defaultValueDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueDate")
    public final Builder defaultValueDate(Optional<String> defaultValueDate) {
      checkNotIsSet(defaultValueDateIsSet(), "defaultValueDate");
      this.defaultValueDate = defaultValueDate.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(String condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("condition")
    public final Builder condition(Optional<String> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueOid() defaultValueOid} to defaultValueOid.
     * @param defaultValueOid The value for defaultValueOid
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueOid(String defaultValueOid) {
      checkNotIsSet(defaultValueOidIsSet(), "defaultValueOid");
      this.defaultValueOid = Objects.requireNonNull(defaultValueOid, "defaultValueOid");
      optBits |= OPT_BIT_DEFAULT_VALUE_OID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueOid() defaultValueOid} to defaultValueOid.
     * @param defaultValueOid The value for defaultValueOid
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueOid")
    public final Builder defaultValueOid(Optional<String> defaultValueOid) {
      checkNotIsSet(defaultValueOidIsSet(), "defaultValueOid");
      this.defaultValueOid = defaultValueOid.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_OID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(Id context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("context")
    public final Builder context(Optional<? extends Id> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueId() defaultValueId} to defaultValueId.
     * @param defaultValueId The value for defaultValueId
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueId(String defaultValueId) {
      checkNotIsSet(defaultValueIdIsSet(), "defaultValueId");
      this.defaultValueId = Objects.requireNonNull(defaultValueId, "defaultValueId");
      optBits |= OPT_BIT_DEFAULT_VALUE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueId() defaultValueId} to defaultValueId.
     * @param defaultValueId The value for defaultValueId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueId")
    public final Builder defaultValueId(Optional<String> defaultValueId) {
      checkNotIsSet(defaultValueIdIsSet(), "defaultValueId");
      this.defaultValueId = defaultValueId.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueMoney() defaultValueMoney} to defaultValueMoney.
     * @param defaultValueMoney The value for defaultValueMoney
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueMoney(Money defaultValueMoney) {
      checkNotIsSet(defaultValueMoneyIsSet(), "defaultValueMoney");
      this.defaultValueMoney = Objects.requireNonNull(defaultValueMoney, "defaultValueMoney");
      optBits |= OPT_BIT_DEFAULT_VALUE_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueMoney() defaultValueMoney} to defaultValueMoney.
     * @param defaultValueMoney The value for defaultValueMoney
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueMoney")
    public final Builder defaultValueMoney(Optional<? extends Money> defaultValueMoney) {
      checkNotIsSet(defaultValueMoneyIsSet(), "defaultValueMoney");
      this.defaultValueMoney = defaultValueMoney.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#check() check} to check.
     * @param check The value for check
     * @return {@code this} builder for chained invocation
     */
    public final Builder check(String check) {
      checkNotIsSet(checkIsSet(), "check");
      this.check = Objects.requireNonNull(check, "check");
      optBits |= OPT_BIT_CHECK;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#check() check} to check.
     * @param check The value for check
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("check")
    public final Builder check(Optional<String> check) {
      checkNotIsSet(checkIsSet(), "check");
      this.check = check.orElse(null);
      optBits |= OPT_BIT_CHECK;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCode() defaultValueCode} to defaultValueCode.
     * @param defaultValueCode The value for defaultValueCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueCode(String defaultValueCode) {
      checkNotIsSet(defaultValueCodeIsSet(), "defaultValueCode");
      this.defaultValueCode = Objects.requireNonNull(defaultValueCode, "defaultValueCode");
      optBits |= OPT_BIT_DEFAULT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCode() defaultValueCode} to defaultValueCode.
     * @param defaultValueCode The value for defaultValueCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueCode")
    public final Builder defaultValueCode(Optional<String> defaultValueCode) {
      checkNotIsSet(defaultValueCodeIsSet(), "defaultValueCode");
      this.defaultValueCode = defaultValueCode.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDuration() defaultValueDuration} to defaultValueDuration.
     * @param defaultValueDuration The value for defaultValueDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDuration(Duration defaultValueDuration) {
      checkNotIsSet(defaultValueDurationIsSet(), "defaultValueDuration");
      this.defaultValueDuration = Objects.requireNonNull(defaultValueDuration, "defaultValueDuration");
      optBits |= OPT_BIT_DEFAULT_VALUE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDuration() defaultValueDuration} to defaultValueDuration.
     * @param defaultValueDuration The value for defaultValueDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueDuration")
    public final Builder defaultValueDuration(Optional<? extends Duration> defaultValueDuration) {
      checkNotIsSet(defaultValueDurationIsSet(), "defaultValueDuration");
      this.defaultValueDuration = defaultValueDuration.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDosage() defaultValueDosage} to defaultValueDosage.
     * @param defaultValueDosage The value for defaultValueDosage
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDosage(Dosage defaultValueDosage) {
      checkNotIsSet(defaultValueDosageIsSet(), "defaultValueDosage");
      this.defaultValueDosage = Objects.requireNonNull(defaultValueDosage, "defaultValueDosage");
      optBits |= OPT_BIT_DEFAULT_VALUE_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDosage() defaultValueDosage} to defaultValueDosage.
     * @param defaultValueDosage The value for defaultValueDosage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueDosage")
    public final Builder defaultValueDosage(Optional<? extends Dosage> defaultValueDosage) {
      checkNotIsSet(defaultValueDosageIsSet(), "defaultValueDosage");
      this.defaultValueDosage = defaultValueDosage.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DOSAGE;
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
    @JsonProperty("defaultValueBoolean")
    public final Builder defaultValueBoolean(Optional<Boolean> defaultValueBoolean) {
      checkNotIsSet(defaultValueBooleanIsSet(), "defaultValueBoolean");
      this.defaultValueBoolean = defaultValueBoolean.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueContactDetail() defaultValueContactDetail} to defaultValueContactDetail.
     * @param defaultValueContactDetail The value for defaultValueContactDetail
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueContactDetail(ContactDetail defaultValueContactDetail) {
      checkNotIsSet(defaultValueContactDetailIsSet(), "defaultValueContactDetail");
      this.defaultValueContactDetail = Objects.requireNonNull(defaultValueContactDetail, "defaultValueContactDetail");
      optBits |= OPT_BIT_DEFAULT_VALUE_CONTACT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueContactDetail() defaultValueContactDetail} to defaultValueContactDetail.
     * @param defaultValueContactDetail The value for defaultValueContactDetail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueContactDetail")
    public final Builder defaultValueContactDetail(Optional<? extends ContactDetail> defaultValueContactDetail) {
      checkNotIsSet(defaultValueContactDetailIsSet(), "defaultValueContactDetail");
      this.defaultValueContactDetail = defaultValueContactDetail.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CONTACT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueContributor() defaultValueContributor} to defaultValueContributor.
     * @param defaultValueContributor The value for defaultValueContributor
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueContributor(Contributor defaultValueContributor) {
      checkNotIsSet(defaultValueContributorIsSet(), "defaultValueContributor");
      this.defaultValueContributor = Objects.requireNonNull(defaultValueContributor, "defaultValueContributor");
      optBits |= OPT_BIT_DEFAULT_VALUE_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueContributor() defaultValueContributor} to defaultValueContributor.
     * @param defaultValueContributor The value for defaultValueContributor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueContributor")
    public final Builder defaultValueContributor(Optional<? extends Contributor> defaultValueContributor) {
      checkNotIsSet(defaultValueContributorIsSet(), "defaultValueContributor");
      this.defaultValueContributor = defaultValueContributor.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueRange() defaultValueRange} to defaultValueRange.
     * @param defaultValueRange The value for defaultValueRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueRange(Range defaultValueRange) {
      checkNotIsSet(defaultValueRangeIsSet(), "defaultValueRange");
      this.defaultValueRange = Objects.requireNonNull(defaultValueRange, "defaultValueRange");
      optBits |= OPT_BIT_DEFAULT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueRange() defaultValueRange} to defaultValueRange.
     * @param defaultValueRange The value for defaultValueRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueRange")
    public final Builder defaultValueRange(Optional<? extends Range> defaultValueRange) {
      checkNotIsSet(defaultValueRangeIsSet(), "defaultValueRange");
      this.defaultValueRange = defaultValueRange.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueParameterDefinition() defaultValueParameterDefinition} to defaultValueParameterDefinition.
     * @param defaultValueParameterDefinition The value for defaultValueParameterDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueParameterDefinition(ParameterDefinition defaultValueParameterDefinition) {
      checkNotIsSet(defaultValueParameterDefinitionIsSet(), "defaultValueParameterDefinition");
      this.defaultValueParameterDefinition = Objects.requireNonNull(defaultValueParameterDefinition, "defaultValueParameterDefinition");
      optBits |= OPT_BIT_DEFAULT_VALUE_PARAMETER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueParameterDefinition() defaultValueParameterDefinition} to defaultValueParameterDefinition.
     * @param defaultValueParameterDefinition The value for defaultValueParameterDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueParameterDefinition")
    public final Builder defaultValueParameterDefinition(Optional<? extends ParameterDefinition> defaultValueParameterDefinition) {
      checkNotIsSet(defaultValueParameterDefinitionIsSet(), "defaultValueParameterDefinition");
      this.defaultValueParameterDefinition = defaultValueParameterDefinition.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_PARAMETER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAge() defaultValueAge} to defaultValueAge.
     * @param defaultValueAge The value for defaultValueAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueAge(Age defaultValueAge) {
      checkNotIsSet(defaultValueAgeIsSet(), "defaultValueAge");
      this.defaultValueAge = Objects.requireNonNull(defaultValueAge, "defaultValueAge");
      optBits |= OPT_BIT_DEFAULT_VALUE_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAge() defaultValueAge} to defaultValueAge.
     * @param defaultValueAge The value for defaultValueAge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueAge")
    public final Builder defaultValueAge(Optional<? extends Age> defaultValueAge) {
      checkNotIsSet(defaultValueAgeIsSet(), "defaultValueAge");
      this.defaultValueAge = defaultValueAge.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAnnotation() defaultValueAnnotation} to defaultValueAnnotation.
     * @param defaultValueAnnotation The value for defaultValueAnnotation
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueAnnotation(Annotation defaultValueAnnotation) {
      checkNotIsSet(defaultValueAnnotationIsSet(), "defaultValueAnnotation");
      this.defaultValueAnnotation = Objects.requireNonNull(defaultValueAnnotation, "defaultValueAnnotation");
      optBits |= OPT_BIT_DEFAULT_VALUE_ANNOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAnnotation() defaultValueAnnotation} to defaultValueAnnotation.
     * @param defaultValueAnnotation The value for defaultValueAnnotation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueAnnotation")
    public final Builder defaultValueAnnotation(Optional<? extends Annotation> defaultValueAnnotation) {
      checkNotIsSet(defaultValueAnnotationIsSet(), "defaultValueAnnotation");
      this.defaultValueAnnotation = defaultValueAnnotation.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_ANNOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueQuantity() defaultValueQuantity} to defaultValueQuantity.
     * @param defaultValueQuantity The value for defaultValueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueQuantity(Quantity defaultValueQuantity) {
      checkNotIsSet(defaultValueQuantityIsSet(), "defaultValueQuantity");
      this.defaultValueQuantity = Objects.requireNonNull(defaultValueQuantity, "defaultValueQuantity");
      optBits |= OPT_BIT_DEFAULT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueQuantity() defaultValueQuantity} to defaultValueQuantity.
     * @param defaultValueQuantity The value for defaultValueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueQuantity")
    public final Builder defaultValueQuantity(Optional<? extends Quantity> defaultValueQuantity) {
      checkNotIsSet(defaultValueQuantityIsSet(), "defaultValueQuantity");
      this.defaultValueQuantity = defaultValueQuantity.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Source#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Source#defaultValueMeta() defaultValueMeta} to defaultValueMeta.
     * @param defaultValueMeta The value for defaultValueMeta
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueMeta(Meta defaultValueMeta) {
      checkNotIsSet(defaultValueMetaIsSet(), "defaultValueMeta");
      this.defaultValueMeta = Objects.requireNonNull(defaultValueMeta, "defaultValueMeta");
      optBits |= OPT_BIT_DEFAULT_VALUE_META;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueMeta() defaultValueMeta} to defaultValueMeta.
     * @param defaultValueMeta The value for defaultValueMeta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueMeta")
    public final Builder defaultValueMeta(Optional<? extends Meta> defaultValueMeta) {
      checkNotIsSet(defaultValueMetaIsSet(), "defaultValueMeta");
      this.defaultValueMeta = defaultValueMeta.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_META;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCodeableConcept() defaultValueCodeableConcept} to defaultValueCodeableConcept.
     * @param defaultValueCodeableConcept The value for defaultValueCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueCodeableConcept(CodeableConcept defaultValueCodeableConcept) {
      checkNotIsSet(defaultValueCodeableConceptIsSet(), "defaultValueCodeableConcept");
      this.defaultValueCodeableConcept = Objects.requireNonNull(defaultValueCodeableConcept, "defaultValueCodeableConcept");
      optBits |= OPT_BIT_DEFAULT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCodeableConcept() defaultValueCodeableConcept} to defaultValueCodeableConcept.
     * @param defaultValueCodeableConcept The value for defaultValueCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueCodeableConcept")
    public final Builder defaultValueCodeableConcept(Optional<? extends CodeableConcept> defaultValueCodeableConcept) {
      checkNotIsSet(defaultValueCodeableConceptIsSet(), "defaultValueCodeableConcept");
      this.defaultValueCodeableConcept = defaultValueCodeableConcept.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Source#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Source#defaultValueDistance() defaultValueDistance} to defaultValueDistance.
     * @param defaultValueDistance The value for defaultValueDistance
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDistance(Distance defaultValueDistance) {
      checkNotIsSet(defaultValueDistanceIsSet(), "defaultValueDistance");
      this.defaultValueDistance = Objects.requireNonNull(defaultValueDistance, "defaultValueDistance");
      optBits |= OPT_BIT_DEFAULT_VALUE_DISTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDistance() defaultValueDistance} to defaultValueDistance.
     * @param defaultValueDistance The value for defaultValueDistance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueDistance")
    public final Builder defaultValueDistance(Optional<? extends Distance> defaultValueDistance) {
      checkNotIsSet(defaultValueDistanceIsSet(), "defaultValueDistance");
      this.defaultValueDistance = defaultValueDistance.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DISTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCoding() defaultValueCoding} to defaultValueCoding.
     * @param defaultValueCoding The value for defaultValueCoding
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueCoding(Coding defaultValueCoding) {
      checkNotIsSet(defaultValueCodingIsSet(), "defaultValueCoding");
      this.defaultValueCoding = Objects.requireNonNull(defaultValueCoding, "defaultValueCoding");
      optBits |= OPT_BIT_DEFAULT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCoding() defaultValueCoding} to defaultValueCoding.
     * @param defaultValueCoding The value for defaultValueCoding
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueCoding")
    public final Builder defaultValueCoding(Optional<? extends Coding> defaultValueCoding) {
      checkNotIsSet(defaultValueCodingIsSet(), "defaultValueCoding");
      this.defaultValueCoding = defaultValueCoding.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCanonical() defaultValueCanonical} to defaultValueCanonical.
     * @param defaultValueCanonical The value for defaultValueCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueCanonical(String defaultValueCanonical) {
      checkNotIsSet(defaultValueCanonicalIsSet(), "defaultValueCanonical");
      this.defaultValueCanonical = Objects.requireNonNull(defaultValueCanonical, "defaultValueCanonical");
      optBits |= OPT_BIT_DEFAULT_VALUE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCanonical() defaultValueCanonical} to defaultValueCanonical.
     * @param defaultValueCanonical The value for defaultValueCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueCanonical")
    public final Builder defaultValueCanonical(Optional<String> defaultValueCanonical) {
      checkNotIsSet(defaultValueCanonicalIsSet(), "defaultValueCanonical");
      this.defaultValueCanonical = defaultValueCanonical.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CANONICAL;
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
    @JsonProperty("defaultValuePositiveInt")
    public final Builder defaultValuePositiveInt(Optional<Double> defaultValuePositiveInt) {
      checkNotIsSet(defaultValuePositiveIntIsSet(), "defaultValuePositiveInt");
      this.defaultValuePositiveInt = defaultValuePositiveInt.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUrl() defaultValueUrl} to defaultValueUrl.
     * @param defaultValueUrl The value for defaultValueUrl
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueUrl(String defaultValueUrl) {
      checkNotIsSet(defaultValueUrlIsSet(), "defaultValueUrl");
      this.defaultValueUrl = Objects.requireNonNull(defaultValueUrl, "defaultValueUrl");
      optBits |= OPT_BIT_DEFAULT_VALUE_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUrl() defaultValueUrl} to defaultValueUrl.
     * @param defaultValueUrl The value for defaultValueUrl
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueUrl")
    public final Builder defaultValueUrl(Optional<String> defaultValueUrl) {
      checkNotIsSet(defaultValueUrlIsSet(), "defaultValueUrl");
      this.defaultValueUrl = defaultValueUrl.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCount() defaultValueCount} to defaultValueCount.
     * @param defaultValueCount The value for defaultValueCount
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueCount(Count defaultValueCount) {
      checkNotIsSet(defaultValueCountIsSet(), "defaultValueCount");
      this.defaultValueCount = Objects.requireNonNull(defaultValueCount, "defaultValueCount");
      optBits |= OPT_BIT_DEFAULT_VALUE_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueCount() defaultValueCount} to defaultValueCount.
     * @param defaultValueCount The value for defaultValueCount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueCount")
    public final Builder defaultValueCount(Optional<? extends Count> defaultValueCount) {
      checkNotIsSet(defaultValueCountIsSet(), "defaultValueCount");
      this.defaultValueCount = defaultValueCount.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_COUNT;
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
    @JsonProperty("defaultValueDecimal")
    public final Builder defaultValueDecimal(Optional<Double> defaultValueDecimal) {
      checkNotIsSet(defaultValueDecimalIsSet(), "defaultValueDecimal");
      this.defaultValueDecimal = defaultValueDecimal.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueTiming() defaultValueTiming} to defaultValueTiming.
     * @param defaultValueTiming The value for defaultValueTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueTiming(Timing defaultValueTiming) {
      checkNotIsSet(defaultValueTimingIsSet(), "defaultValueTiming");
      this.defaultValueTiming = Objects.requireNonNull(defaultValueTiming, "defaultValueTiming");
      optBits |= OPT_BIT_DEFAULT_VALUE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueTiming() defaultValueTiming} to defaultValueTiming.
     * @param defaultValueTiming The value for defaultValueTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueTiming")
    public final Builder defaultValueTiming(Optional<? extends Timing> defaultValueTiming) {
      checkNotIsSet(defaultValueTimingIsSet(), "defaultValueTiming");
      this.defaultValueTiming = defaultValueTiming.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#logMessage() logMessage} to logMessage.
     * @param logMessage The value for logMessage
     * @return {@code this} builder for chained invocation
     */
    public final Builder logMessage(String logMessage) {
      checkNotIsSet(logMessageIsSet(), "logMessage");
      this.logMessage = Objects.requireNonNull(logMessage, "logMessage");
      optBits |= OPT_BIT_LOG_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#logMessage() logMessage} to logMessage.
     * @param logMessage The value for logMessage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("logMessage")
    public final Builder logMessage(Optional<String> logMessage) {
      checkNotIsSet(logMessageIsSet(), "logMessage");
      this.logMessage = logMessage.orElse(null);
      optBits |= OPT_BIT_LOG_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueTime() defaultValueTime} to defaultValueTime.
     * @param defaultValueTime The value for defaultValueTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueTime(String defaultValueTime) {
      checkNotIsSet(defaultValueTimeIsSet(), "defaultValueTime");
      this.defaultValueTime = Objects.requireNonNull(defaultValueTime, "defaultValueTime");
      optBits |= OPT_BIT_DEFAULT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueTime() defaultValueTime} to defaultValueTime.
     * @param defaultValueTime The value for defaultValueTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueTime")
    public final Builder defaultValueTime(Optional<String> defaultValueTime) {
      checkNotIsSet(defaultValueTimeIsSet(), "defaultValueTime");
      this.defaultValueTime = defaultValueTime.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDateTime() defaultValueDateTime} to defaultValueDateTime.
     * @param defaultValueDateTime The value for defaultValueDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDateTime(String defaultValueDateTime) {
      checkNotIsSet(defaultValueDateTimeIsSet(), "defaultValueDateTime");
      this.defaultValueDateTime = Objects.requireNonNull(defaultValueDateTime, "defaultValueDateTime");
      optBits |= OPT_BIT_DEFAULT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDateTime() defaultValueDateTime} to defaultValueDateTime.
     * @param defaultValueDateTime The value for defaultValueDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueDateTime")
    public final Builder defaultValueDateTime(Optional<String> defaultValueDateTime) {
      checkNotIsSet(defaultValueDateTimeIsSet(), "defaultValueDateTime");
      this.defaultValueDateTime = defaultValueDateTime.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#element() element} to element.
     * @param element The value for element
     * @return {@code this} builder for chained invocation
     */
    public final Builder element(String element) {
      checkNotIsSet(elementIsSet(), "element");
      this.element = Objects.requireNonNull(element, "element");
      optBits |= OPT_BIT_ELEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#element() element} to element.
     * @param element The value for element
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("element")
    public final Builder element(Optional<String> element) {
      checkNotIsSet(elementIsSet(), "element");
      this.element = element.orElse(null);
      optBits |= OPT_BIT_ELEMENT;
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
    @JsonProperty("defaultValueUnsignedInt")
    public final Builder defaultValueUnsignedInt(Optional<Double> defaultValueUnsignedInt) {
      checkNotIsSet(defaultValueUnsignedIntIsSet(), "defaultValueUnsignedInt");
      this.defaultValueUnsignedInt = defaultValueUnsignedInt.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_UNSIGNED_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Source#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Source#defaultValueMarkdown() defaultValueMarkdown} to defaultValueMarkdown.
     * @param defaultValueMarkdown The value for defaultValueMarkdown
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueMarkdown(String defaultValueMarkdown) {
      checkNotIsSet(defaultValueMarkdownIsSet(), "defaultValueMarkdown");
      this.defaultValueMarkdown = Objects.requireNonNull(defaultValueMarkdown, "defaultValueMarkdown");
      optBits |= OPT_BIT_DEFAULT_VALUE_MARKDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueMarkdown() defaultValueMarkdown} to defaultValueMarkdown.
     * @param defaultValueMarkdown The value for defaultValueMarkdown
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueMarkdown")
    public final Builder defaultValueMarkdown(Optional<String> defaultValueMarkdown) {
      checkNotIsSet(defaultValueMarkdownIsSet(), "defaultValueMarkdown");
      this.defaultValueMarkdown = defaultValueMarkdown.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_MARKDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueBase64Binary() defaultValueBase64Binary} to defaultValueBase64Binary.
     * @param defaultValueBase64Binary The value for defaultValueBase64Binary
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueBase64Binary(String defaultValueBase64Binary) {
      checkNotIsSet(defaultValueBase64BinaryIsSet(), "defaultValueBase64Binary");
      this.defaultValueBase64Binary = Objects.requireNonNull(defaultValueBase64Binary, "defaultValueBase64Binary");
      optBits |= OPT_BIT_DEFAULT_VALUE_BASE64_BINARY;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueBase64Binary() defaultValueBase64Binary} to defaultValueBase64Binary.
     * @param defaultValueBase64Binary The value for defaultValueBase64Binary
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueBase64Binary")
    public final Builder defaultValueBase64Binary(Optional<String> defaultValueBase64Binary) {
      checkNotIsSet(defaultValueBase64BinaryIsSet(), "defaultValueBase64Binary");
      this.defaultValueBase64Binary = defaultValueBase64Binary.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_BASE64_BINARY;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueHumanName() defaultValueHumanName} to defaultValueHumanName.
     * @param defaultValueHumanName The value for defaultValueHumanName
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueHumanName(HumanName defaultValueHumanName) {
      checkNotIsSet(defaultValueHumanNameIsSet(), "defaultValueHumanName");
      this.defaultValueHumanName = Objects.requireNonNull(defaultValueHumanName, "defaultValueHumanName");
      optBits |= OPT_BIT_DEFAULT_VALUE_HUMAN_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueHumanName() defaultValueHumanName} to defaultValueHumanName.
     * @param defaultValueHumanName The value for defaultValueHumanName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueHumanName")
    public final Builder defaultValueHumanName(Optional<? extends HumanName> defaultValueHumanName) {
      checkNotIsSet(defaultValueHumanNameIsSet(), "defaultValueHumanName");
      this.defaultValueHumanName = defaultValueHumanName.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_HUMAN_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueContactPoint() defaultValueContactPoint} to defaultValueContactPoint.
     * @param defaultValueContactPoint The value for defaultValueContactPoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueContactPoint(ContactPoint defaultValueContactPoint) {
      checkNotIsSet(defaultValueContactPointIsSet(), "defaultValueContactPoint");
      this.defaultValueContactPoint = Objects.requireNonNull(defaultValueContactPoint, "defaultValueContactPoint");
      optBits |= OPT_BIT_DEFAULT_VALUE_CONTACT_POINT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueContactPoint() defaultValueContactPoint} to defaultValueContactPoint.
     * @param defaultValueContactPoint The value for defaultValueContactPoint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueContactPoint")
    public final Builder defaultValueContactPoint(Optional<? extends ContactPoint> defaultValueContactPoint) {
      checkNotIsSet(defaultValueContactPointIsSet(), "defaultValueContactPoint");
      this.defaultValueContactPoint = defaultValueContactPoint.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_CONTACT_POINT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueSampledData() defaultValueSampledData} to defaultValueSampledData.
     * @param defaultValueSampledData The value for defaultValueSampledData
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueSampledData(SampledData defaultValueSampledData) {
      checkNotIsSet(defaultValueSampledDataIsSet(), "defaultValueSampledData");
      this.defaultValueSampledData = Objects.requireNonNull(defaultValueSampledData, "defaultValueSampledData");
      optBits |= OPT_BIT_DEFAULT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueSampledData() defaultValueSampledData} to defaultValueSampledData.
     * @param defaultValueSampledData The value for defaultValueSampledData
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueSampledData")
    public final Builder defaultValueSampledData(Optional<? extends SampledData> defaultValueSampledData) {
      checkNotIsSet(defaultValueSampledDataIsSet(), "defaultValueSampledData");
      this.defaultValueSampledData = defaultValueSampledData.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_SAMPLED_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for chained invocation
     */
    public final Builder variable(Id variable) {
      checkNotIsSet(variableIsSet(), "variable");
      this.variable = Objects.requireNonNull(variable, "variable");
      optBits |= OPT_BIT_VARIABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#variable() variable} to variable.
     * @param variable The value for variable
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("variable")
    public final Builder variable(Optional<? extends Id> variable) {
      checkNotIsSet(variableIsSet(), "variable");
      this.variable = variable.orElse(null);
      optBits |= OPT_BIT_VARIABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUuid() defaultValueUuid} to defaultValueUuid.
     * @param defaultValueUuid The value for defaultValueUuid
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueUuid(String defaultValueUuid) {
      checkNotIsSet(defaultValueUuidIsSet(), "defaultValueUuid");
      this.defaultValueUuid = Objects.requireNonNull(defaultValueUuid, "defaultValueUuid");
      optBits |= OPT_BIT_DEFAULT_VALUE_UUID;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUuid() defaultValueUuid} to defaultValueUuid.
     * @param defaultValueUuid The value for defaultValueUuid
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueUuid")
    public final Builder defaultValueUuid(Optional<String> defaultValueUuid) {
      checkNotIsSet(defaultValueUuidIsSet(), "defaultValueUuid");
      this.defaultValueUuid = defaultValueUuid.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_UUID;
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
    @JsonProperty("min")
    public final Builder min(Optional<Integer> min) {
      checkNotIsSet(minIsSet(), "min");
      this.min = min.orElse(null);
      optBits |= OPT_BIT_MIN;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueSignature() defaultValueSignature} to defaultValueSignature.
     * @param defaultValueSignature The value for defaultValueSignature
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueSignature(Signature defaultValueSignature) {
      checkNotIsSet(defaultValueSignatureIsSet(), "defaultValueSignature");
      this.defaultValueSignature = Objects.requireNonNull(defaultValueSignature, "defaultValueSignature");
      optBits |= OPT_BIT_DEFAULT_VALUE_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueSignature() defaultValueSignature} to defaultValueSignature.
     * @param defaultValueSignature The value for defaultValueSignature
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueSignature")
    public final Builder defaultValueSignature(Optional<? extends Signature> defaultValueSignature) {
      checkNotIsSet(defaultValueSignatureIsSet(), "defaultValueSignature");
      this.defaultValueSignature = defaultValueSignature.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#max() max} to max.
     * @param max The value for max
     * @return {@code this} builder for chained invocation
     */
    public final Builder max(String max) {
      checkNotIsSet(maxIsSet(), "max");
      this.max = Objects.requireNonNull(max, "max");
      optBits |= OPT_BIT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#max() max} to max.
     * @param max The value for max
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("max")
    public final Builder max(Optional<String> max) {
      checkNotIsSet(maxIsSet(), "max");
      this.max = max.orElse(null);
      optBits |= OPT_BIT_MAX;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAttachment() defaultValueAttachment} to defaultValueAttachment.
     * @param defaultValueAttachment The value for defaultValueAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueAttachment(Attachment defaultValueAttachment) {
      checkNotIsSet(defaultValueAttachmentIsSet(), "defaultValueAttachment");
      this.defaultValueAttachment = Objects.requireNonNull(defaultValueAttachment, "defaultValueAttachment");
      optBits |= OPT_BIT_DEFAULT_VALUE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAttachment() defaultValueAttachment} to defaultValueAttachment.
     * @param defaultValueAttachment The value for defaultValueAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueAttachment")
    public final Builder defaultValueAttachment(Optional<? extends Attachment> defaultValueAttachment) {
      checkNotIsSet(defaultValueAttachmentIsSet(), "defaultValueAttachment");
      this.defaultValueAttachment = defaultValueAttachment.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUri() defaultValueUri} to defaultValueUri.
     * @param defaultValueUri The value for defaultValueUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueUri(String defaultValueUri) {
      checkNotIsSet(defaultValueUriIsSet(), "defaultValueUri");
      this.defaultValueUri = Objects.requireNonNull(defaultValueUri, "defaultValueUri");
      optBits |= OPT_BIT_DEFAULT_VALUE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUri() defaultValueUri} to defaultValueUri.
     * @param defaultValueUri The value for defaultValueUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueUri")
    public final Builder defaultValueUri(Optional<String> defaultValueUri) {
      checkNotIsSet(defaultValueUriIsSet(), "defaultValueUri");
      this.defaultValueUri = defaultValueUri.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueRatio() defaultValueRatio} to defaultValueRatio.
     * @param defaultValueRatio The value for defaultValueRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueRatio(Ratio defaultValueRatio) {
      checkNotIsSet(defaultValueRatioIsSet(), "defaultValueRatio");
      this.defaultValueRatio = Objects.requireNonNull(defaultValueRatio, "defaultValueRatio");
      optBits |= OPT_BIT_DEFAULT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueRatio() defaultValueRatio} to defaultValueRatio.
     * @param defaultValueRatio The value for defaultValueRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueRatio")
    public final Builder defaultValueRatio(Optional<? extends Ratio> defaultValueRatio) {
      checkNotIsSet(defaultValueRatioIsSet(), "defaultValueRatio");
      this.defaultValueRatio = defaultValueRatio.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueExpression() defaultValueExpression} to defaultValueExpression.
     * @param defaultValueExpression The value for defaultValueExpression
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueExpression(Expression defaultValueExpression) {
      checkNotIsSet(defaultValueExpressionIsSet(), "defaultValueExpression");
      this.defaultValueExpression = Objects.requireNonNull(defaultValueExpression, "defaultValueExpression");
      optBits |= OPT_BIT_DEFAULT_VALUE_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueExpression() defaultValueExpression} to defaultValueExpression.
     * @param defaultValueExpression The value for defaultValueExpression
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueExpression")
    public final Builder defaultValueExpression(Optional<? extends Expression> defaultValueExpression) {
      checkNotIsSet(defaultValueExpressionIsSet(), "defaultValueExpression");
      this.defaultValueExpression = defaultValueExpression.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#listMode() listMode} to listMode.
     * @param listMode The value for listMode
     * @return {@code this} builder for chained invocation
     */
    public final Builder listMode(Structuremap_sourceListmode listMode) {
      checkNotIsSet(listModeIsSet(), "listMode");
      this.listMode = Objects.requireNonNull(listMode, "listMode");
      optBits |= OPT_BIT_LIST_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#listMode() listMode} to listMode.
     * @param listMode The value for listMode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("listMode")
    public final Builder listMode(Optional<? extends Structuremap_sourceListmode> listMode) {
      checkNotIsSet(listModeIsSet(), "listMode");
      this.listMode = listMode.orElse(null);
      optBits |= OPT_BIT_LIST_MODE;
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
    @JsonProperty("defaultValueInteger")
    public final Builder defaultValueInteger(Optional<Double> defaultValueInteger) {
      checkNotIsSet(defaultValueIntegerIsSet(), "defaultValueInteger");
      this.defaultValueInteger = defaultValueInteger.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueString() defaultValueString} to defaultValueString.
     * @param defaultValueString The value for defaultValueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueString(String defaultValueString) {
      checkNotIsSet(defaultValueStringIsSet(), "defaultValueString");
      this.defaultValueString = Objects.requireNonNull(defaultValueString, "defaultValueString");
      optBits |= OPT_BIT_DEFAULT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueString() defaultValueString} to defaultValueString.
     * @param defaultValueString The value for defaultValueString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueString")
    public final Builder defaultValueString(Optional<String> defaultValueString) {
      checkNotIsSet(defaultValueStringIsSet(), "defaultValueString");
      this.defaultValueString = defaultValueString.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAddress() defaultValueAddress} to defaultValueAddress.
     * @param defaultValueAddress The value for defaultValueAddress
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueAddress(Address defaultValueAddress) {
      checkNotIsSet(defaultValueAddressIsSet(), "defaultValueAddress");
      this.defaultValueAddress = Objects.requireNonNull(defaultValueAddress, "defaultValueAddress");
      optBits |= OPT_BIT_DEFAULT_VALUE_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueAddress() defaultValueAddress} to defaultValueAddress.
     * @param defaultValueAddress The value for defaultValueAddress
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueAddress")
    public final Builder defaultValueAddress(Optional<? extends Address> defaultValueAddress) {
      checkNotIsSet(defaultValueAddressIsSet(), "defaultValueAddress");
      this.defaultValueAddress = defaultValueAddress.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUsageContext() defaultValueUsageContext} to defaultValueUsageContext.
     * @param defaultValueUsageContext The value for defaultValueUsageContext
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueUsageContext(UsageContext defaultValueUsageContext) {
      checkNotIsSet(defaultValueUsageContextIsSet(), "defaultValueUsageContext");
      this.defaultValueUsageContext = Objects.requireNonNull(defaultValueUsageContext, "defaultValueUsageContext");
      optBits |= OPT_BIT_DEFAULT_VALUE_USAGE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueUsageContext() defaultValueUsageContext} to defaultValueUsageContext.
     * @param defaultValueUsageContext The value for defaultValueUsageContext
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueUsageContext")
    public final Builder defaultValueUsageContext(Optional<? extends UsageContext> defaultValueUsageContext) {
      checkNotIsSet(defaultValueUsageContextIsSet(), "defaultValueUsageContext");
      this.defaultValueUsageContext = defaultValueUsageContext.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_USAGE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueTriggerDefinition() defaultValueTriggerDefinition} to defaultValueTriggerDefinition.
     * @param defaultValueTriggerDefinition The value for defaultValueTriggerDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueTriggerDefinition(TriggerDefinition defaultValueTriggerDefinition) {
      checkNotIsSet(defaultValueTriggerDefinitionIsSet(), "defaultValueTriggerDefinition");
      this.defaultValueTriggerDefinition = Objects.requireNonNull(defaultValueTriggerDefinition, "defaultValueTriggerDefinition");
      optBits |= OPT_BIT_DEFAULT_VALUE_TRIGGER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueTriggerDefinition() defaultValueTriggerDefinition} to defaultValueTriggerDefinition.
     * @param defaultValueTriggerDefinition The value for defaultValueTriggerDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueTriggerDefinition")
    public final Builder defaultValueTriggerDefinition(Optional<? extends TriggerDefinition> defaultValueTriggerDefinition) {
      checkNotIsSet(defaultValueTriggerDefinitionIsSet(), "defaultValueTriggerDefinition");
      this.defaultValueTriggerDefinition = defaultValueTriggerDefinition.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_TRIGGER_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValuePeriod() defaultValuePeriod} to defaultValuePeriod.
     * @param defaultValuePeriod The value for defaultValuePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValuePeriod(Period defaultValuePeriod) {
      checkNotIsSet(defaultValuePeriodIsSet(), "defaultValuePeriod");
      this.defaultValuePeriod = Objects.requireNonNull(defaultValuePeriod, "defaultValuePeriod");
      optBits |= OPT_BIT_DEFAULT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValuePeriod() defaultValuePeriod} to defaultValuePeriod.
     * @param defaultValuePeriod The value for defaultValuePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValuePeriod")
    public final Builder defaultValuePeriod(Optional<? extends Period> defaultValuePeriod) {
      checkNotIsSet(defaultValuePeriodIsSet(), "defaultValuePeriod");
      this.defaultValuePeriod = defaultValuePeriod.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueRelatedArtifact() defaultValueRelatedArtifact} to defaultValueRelatedArtifact.
     * @param defaultValueRelatedArtifact The value for defaultValueRelatedArtifact
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueRelatedArtifact(RelatedArtifact defaultValueRelatedArtifact) {
      checkNotIsSet(defaultValueRelatedArtifactIsSet(), "defaultValueRelatedArtifact");
      this.defaultValueRelatedArtifact = Objects.requireNonNull(defaultValueRelatedArtifact, "defaultValueRelatedArtifact");
      optBits |= OPT_BIT_DEFAULT_VALUE_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueRelatedArtifact() defaultValueRelatedArtifact} to defaultValueRelatedArtifact.
     * @param defaultValueRelatedArtifact The value for defaultValueRelatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueRelatedArtifact")
    public final Builder defaultValueRelatedArtifact(Optional<? extends RelatedArtifact> defaultValueRelatedArtifact) {
      checkNotIsSet(defaultValueRelatedArtifactIsSet(), "defaultValueRelatedArtifact");
      this.defaultValueRelatedArtifact = defaultValueRelatedArtifact.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueIdentifier() defaultValueIdentifier} to defaultValueIdentifier.
     * @param defaultValueIdentifier The value for defaultValueIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueIdentifier(Identifier defaultValueIdentifier) {
      checkNotIsSet(defaultValueIdentifierIsSet(), "defaultValueIdentifier");
      this.defaultValueIdentifier = Objects.requireNonNull(defaultValueIdentifier, "defaultValueIdentifier");
      optBits |= OPT_BIT_DEFAULT_VALUE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueIdentifier() defaultValueIdentifier} to defaultValueIdentifier.
     * @param defaultValueIdentifier The value for defaultValueIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueIdentifier")
    public final Builder defaultValueIdentifier(Optional<? extends Identifier> defaultValueIdentifier) {
      checkNotIsSet(defaultValueIdentifierIsSet(), "defaultValueIdentifier");
      this.defaultValueIdentifier = defaultValueIdentifier.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDataRequirement() defaultValueDataRequirement} to defaultValueDataRequirement.
     * @param defaultValueDataRequirement The value for defaultValueDataRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultValueDataRequirement(DataRequirement defaultValueDataRequirement) {
      checkNotIsSet(defaultValueDataRequirementIsSet(), "defaultValueDataRequirement");
      this.defaultValueDataRequirement = Objects.requireNonNull(defaultValueDataRequirement, "defaultValueDataRequirement");
      optBits |= OPT_BIT_DEFAULT_VALUE_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Source#defaultValueDataRequirement() defaultValueDataRequirement} to defaultValueDataRequirement.
     * @param defaultValueDataRequirement The value for defaultValueDataRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultValueDataRequirement")
    public final Builder defaultValueDataRequirement(Optional<? extends DataRequirement> defaultValueDataRequirement) {
      checkNotIsSet(defaultValueDataRequirementIsSet(), "defaultValueDataRequirement");
      this.defaultValueDataRequirement = defaultValueDataRequirement.orElse(null);
      optBits |= OPT_BIT_DEFAULT_VALUE_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Builds a new {@link StructureMap_Source StructureMap_Source}.
     * @return An immutable instance of StructureMap_Source
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public StructureMap_Source build() {
      return new ImmutableStructureMap_Source(
          type,
          defaultValueReference,
          defaultValueInstant,
          defaultValueDate,
          condition,
          defaultValueOid,
          context,
          defaultValueId,
          defaultValueMoney,
          check,
          defaultValueCode,
          defaultValueDuration,
          defaultValueDosage,
          defaultValueBoolean,
          defaultValueContactDetail,
          defaultValueContributor,
          defaultValueRange,
          defaultValueParameterDefinition,
          defaultValueAge,
          defaultValueAnnotation,
          defaultValueQuantity,
          extension,
          defaultValueMeta,
          defaultValueCodeableConcept,
          modifierExtension,
          defaultValueDistance,
          defaultValueCoding,
          defaultValueCanonical,
          defaultValuePositiveInt,
          defaultValueUrl,
          defaultValueCount,
          defaultValueDecimal,
          defaultValueTiming,
          logMessage,
          defaultValueTime,
          defaultValueDateTime,
          element,
          defaultValueUnsignedInt,
          id,
          defaultValueMarkdown,
          defaultValueBase64Binary,
          defaultValueHumanName,
          defaultValueContactPoint,
          defaultValueSampledData,
          variable,
          defaultValueUuid,
          min,
          defaultValueSignature,
          max,
          defaultValueAttachment,
          defaultValueUri,
          defaultValueRatio,
          defaultValueExpression,
          listMode,
          defaultValueInteger,
          defaultValueString,
          defaultValueAddress,
          defaultValueUsageContext,
          defaultValueTriggerDefinition,
          defaultValuePeriod,
          defaultValueRelatedArtifact,
          defaultValueIdentifier,
          defaultValueDataRequirement);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean defaultValueReferenceIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_REFERENCE) != 0;
    }

    private boolean defaultValueInstantIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_INSTANT) != 0;
    }

    private boolean defaultValueDateIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DATE) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean defaultValueOidIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_OID) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean defaultValueIdIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_ID) != 0;
    }

    private boolean defaultValueMoneyIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_MONEY) != 0;
    }

    private boolean checkIsSet() {
      return (optBits & OPT_BIT_CHECK) != 0;
    }

    private boolean defaultValueCodeIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CODE) != 0;
    }

    private boolean defaultValueDurationIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DURATION) != 0;
    }

    private boolean defaultValueDosageIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DOSAGE) != 0;
    }

    private boolean defaultValueBooleanIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_BOOLEAN) != 0;
    }

    private boolean defaultValueContactDetailIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CONTACT_DETAIL) != 0;
    }

    private boolean defaultValueContributorIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CONTRIBUTOR) != 0;
    }

    private boolean defaultValueRangeIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_RANGE) != 0;
    }

    private boolean defaultValueParameterDefinitionIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_PARAMETER_DEFINITION) != 0;
    }

    private boolean defaultValueAgeIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_AGE) != 0;
    }

    private boolean defaultValueAnnotationIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_ANNOTATION) != 0;
    }

    private boolean defaultValueQuantityIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_QUANTITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean defaultValueMetaIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_META) != 0;
    }

    private boolean defaultValueCodeableConceptIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CODEABLE_CONCEPT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean defaultValueDistanceIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DISTANCE) != 0;
    }

    private boolean defaultValueCodingIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CODING) != 0;
    }

    private boolean defaultValueCanonicalIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CANONICAL) != 0;
    }

    private boolean defaultValuePositiveIntIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_POSITIVE_INT) != 0;
    }

    private boolean defaultValueUrlIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_URL) != 0;
    }

    private boolean defaultValueCountIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_COUNT) != 0;
    }

    private boolean defaultValueDecimalIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DECIMAL) != 0;
    }

    private boolean defaultValueTimingIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_TIMING) != 0;
    }

    private boolean logMessageIsSet() {
      return (optBits & OPT_BIT_LOG_MESSAGE) != 0;
    }

    private boolean defaultValueTimeIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_TIME) != 0;
    }

    private boolean defaultValueDateTimeIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DATE_TIME) != 0;
    }

    private boolean elementIsSet() {
      return (optBits & OPT_BIT_ELEMENT) != 0;
    }

    private boolean defaultValueUnsignedIntIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_UNSIGNED_INT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean defaultValueMarkdownIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_MARKDOWN) != 0;
    }

    private boolean defaultValueBase64BinaryIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_BASE64_BINARY) != 0;
    }

    private boolean defaultValueHumanNameIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_HUMAN_NAME) != 0;
    }

    private boolean defaultValueContactPointIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_CONTACT_POINT) != 0;
    }

    private boolean defaultValueSampledDataIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_SAMPLED_DATA) != 0;
    }

    private boolean variableIsSet() {
      return (optBits & OPT_BIT_VARIABLE) != 0;
    }

    private boolean defaultValueUuidIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_UUID) != 0;
    }

    private boolean minIsSet() {
      return (optBits & OPT_BIT_MIN) != 0;
    }

    private boolean defaultValueSignatureIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_SIGNATURE) != 0;
    }

    private boolean maxIsSet() {
      return (optBits & OPT_BIT_MAX) != 0;
    }

    private boolean defaultValueAttachmentIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_ATTACHMENT) != 0;
    }

    private boolean defaultValueUriIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_URI) != 0;
    }

    private boolean defaultValueRatioIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_RATIO) != 0;
    }

    private boolean defaultValueExpressionIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_EXPRESSION) != 0;
    }

    private boolean listModeIsSet() {
      return (optBits & OPT_BIT_LIST_MODE) != 0;
    }

    private boolean defaultValueIntegerIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_INTEGER) != 0;
    }

    private boolean defaultValueStringIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_STRING) != 0;
    }

    private boolean defaultValueAddressIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_ADDRESS) != 0;
    }

    private boolean defaultValueUsageContextIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_USAGE_CONTEXT) != 0;
    }

    private boolean defaultValueTriggerDefinitionIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_TRIGGER_DEFINITION) != 0;
    }

    private boolean defaultValuePeriodIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_PERIOD) != 0;
    }

    private boolean defaultValueRelatedArtifactIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_RELATED_ARTIFACT) != 0;
    }

    private boolean defaultValueIdentifierIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_IDENTIFIER) != 0;
    }

    private boolean defaultValueDataRequirementIsSet() {
      return (optBits & OPT_BIT_DEFAULT_VALUE_DATA_REQUIREMENT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of StructureMap_Source is strict, attribute is already set: ".concat(name));
    }
  }
}