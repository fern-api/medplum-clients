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
 * Immutable implementation of {@link OperationDefinition_Parameter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOperationDefinition_Parameter.builder()}.
 */
@Generated(from = "OperationDefinition_Parameter", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOperationDefinition_Parameter
    implements OperationDefinition_Parameter {
  private final @Nullable List<Canonical> targetProfile;
  private final @Nullable Operationdefinition_parameterUse use;
  private final @Nullable Integer min;
  private final @Nullable Operationdefinition_parameterSearchtype searchType;
  private final @Nullable Code name;
  private final @Nullable Code type;
  private final @Nullable List<OperationDefinition_Parameter> part;
  private final @Nullable List<Extension> extension;
  private final @Nullable String max;
  private final @Nullable String documentation;
  private final @Nullable OperationDefinition_Binding binding;
  private final @Nullable List<OperationDefinition_ReferencedFrom> referencedFrom;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableOperationDefinition_Parameter(
      @Nullable List<Canonical> targetProfile,
      @Nullable Operationdefinition_parameterUse use,
      @Nullable Integer min,
      @Nullable Operationdefinition_parameterSearchtype searchType,
      @Nullable Code name,
      @Nullable Code type,
      @Nullable List<OperationDefinition_Parameter> part,
      @Nullable List<Extension> extension,
      @Nullable String max,
      @Nullable String documentation,
      @Nullable OperationDefinition_Binding binding,
      @Nullable List<OperationDefinition_ReferencedFrom> referencedFrom,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension) {
    this.targetProfile = targetProfile;
    this.use = use;
    this.min = min;
    this.searchType = searchType;
    this.name = name;
    this.type = type;
    this.part = part;
    this.extension = extension;
    this.max = max;
    this.documentation = documentation;
    this.binding = binding;
    this.referencedFrom = referencedFrom;
    this.id = id;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code targetProfile} attribute
   */
  @JsonProperty("targetProfile")
  @Override
  public Optional<List<Canonical>> targetProfile() {
    return Optional.ofNullable(targetProfile);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @JsonProperty("use")
  @Override
  public Optional<Operationdefinition_parameterUse> use() {
    return Optional.ofNullable(use);
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
   * @return The value of the {@code searchType} attribute
   */
  @JsonProperty("searchType")
  @Override
  public Optional<Operationdefinition_parameterSearchtype> searchType() {
    return Optional.ofNullable(searchType);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<Code> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Code> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code part} attribute
   */
  @JsonProperty("part")
  @Override
  public Optional<List<OperationDefinition_Parameter>> part() {
    return Optional.ofNullable(part);
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
   * @return The value of the {@code max} attribute
   */
  @JsonProperty("max")
  @Override
  public Optional<String> max() {
    return Optional.ofNullable(max);
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @JsonProperty("documentation")
  @Override
  public Optional<String> documentation() {
    return Optional.ofNullable(documentation);
  }

  /**
   * @return The value of the {@code binding} attribute
   */
  @JsonProperty("binding")
  @Override
  public Optional<OperationDefinition_Binding> binding() {
    return Optional.ofNullable(binding);
  }

  /**
   * @return The value of the {@code referencedFrom} attribute
   */
  @JsonProperty("referencedFrom")
  @Override
  public Optional<List<OperationDefinition_ReferencedFrom>> referencedFrom() {
    return Optional.ofNullable(referencedFrom);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#targetProfile() targetProfile} attribute.
   * @param value The value for targetProfile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withTargetProfile(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "targetProfile");
    if (this.targetProfile == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        newValue,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#targetProfile() targetProfile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetProfile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withTargetProfile(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.targetProfile == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        value,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withUse(Operationdefinition_parameterUse value) {
    @Nullable Operationdefinition_parameterUse newValue = Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        newValue,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withUse(Optional<? extends Operationdefinition_parameterUse> optional) {
    @Nullable Operationdefinition_parameterUse value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        value,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#min() min} attribute.
   * @param value The value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withMin(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.min, newValue)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        newValue,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#min() min} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for min
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withMin(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.min, value)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        value,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#searchType() searchType} attribute.
   * @param value The value for searchType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withSearchType(Operationdefinition_parameterSearchtype value) {
    @Nullable Operationdefinition_parameterSearchtype newValue = Objects.requireNonNull(value, "searchType");
    if (this.searchType == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        newValue,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#searchType() searchType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withSearchType(Optional<? extends Operationdefinition_parameterSearchtype> optional) {
    @Nullable Operationdefinition_parameterSearchtype value = optional.orElse(null);
    if (this.searchType == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        value,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withName(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        newValue,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withName(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        value,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withType(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        newValue,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withType(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        value,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#part() part} attribute.
   * @param value The value for part
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withPart(List<OperationDefinition_Parameter> value) {
    @Nullable List<OperationDefinition_Parameter> newValue = Objects.requireNonNull(value, "part");
    if (this.part == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        newValue,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#part() part} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for part
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withPart(Optional<? extends List<OperationDefinition_Parameter>> optional) {
    @Nullable List<OperationDefinition_Parameter> value = optional.orElse(null);
    if (this.part == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        value,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        newValue,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        value,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#max() max} attribute.
   * @param value The value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withMax(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "max");
    if (Objects.equals(this.max, newValue)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        newValue,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#max() max} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for max
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withMax(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.max, value)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        value,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withDocumentation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "documentation");
    if (Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        newValue,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withDocumentation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.documentation, value)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        value,
        this.binding,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#binding() binding} attribute.
   * @param value The value for binding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withBinding(OperationDefinition_Binding value) {
    @Nullable OperationDefinition_Binding newValue = Objects.requireNonNull(value, "binding");
    if (this.binding == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        newValue,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#binding() binding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for binding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withBinding(Optional<? extends OperationDefinition_Binding> optional) {
    @Nullable OperationDefinition_Binding value = optional.orElse(null);
    if (this.binding == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        value,
        this.referencedFrom,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#referencedFrom() referencedFrom} attribute.
   * @param value The value for referencedFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withReferencedFrom(List<OperationDefinition_ReferencedFrom> value) {
    @Nullable List<OperationDefinition_ReferencedFrom> newValue = Objects.requireNonNull(value, "referencedFrom");
    if (this.referencedFrom == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        newValue,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#referencedFrom() referencedFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referencedFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withReferencedFrom(Optional<? extends List<OperationDefinition_ReferencedFrom>> optional) {
    @Nullable List<OperationDefinition_ReferencedFrom> value = optional.orElse(null);
    if (this.referencedFrom == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        value,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Parameter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Parameter withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Parameter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Parameter withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOperationDefinition_Parameter(
        this.targetProfile,
        this.use,
        this.min,
        this.searchType,
        this.name,
        this.type,
        this.part,
        this.extension,
        this.max,
        this.documentation,
        this.binding,
        this.referencedFrom,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOperationDefinition_Parameter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOperationDefinition_Parameter
        && equalTo((ImmutableOperationDefinition_Parameter) another);
  }

  private boolean equalTo(ImmutableOperationDefinition_Parameter another) {
    return Objects.equals(targetProfile, another.targetProfile)
        && Objects.equals(use, another.use)
        && Objects.equals(min, another.min)
        && Objects.equals(searchType, another.searchType)
        && Objects.equals(name, another.name)
        && Objects.equals(type, another.type)
        && Objects.equals(part, another.part)
        && Objects.equals(extension, another.extension)
        && Objects.equals(max, another.max)
        && Objects.equals(documentation, another.documentation)
        && Objects.equals(binding, another.binding)
        && Objects.equals(referencedFrom, another.referencedFrom)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code targetProfile}, {@code use}, {@code min}, {@code searchType}, {@code name}, {@code type}, {@code part}, {@code extension}, {@code max}, {@code documentation}, {@code binding}, {@code referencedFrom}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(targetProfile);
    h += (h << 5) + Objects.hashCode(use);
    h += (h << 5) + Objects.hashCode(min);
    h += (h << 5) + Objects.hashCode(searchType);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(part);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(max);
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + Objects.hashCode(binding);
    h += (h << 5) + Objects.hashCode(referencedFrom);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code OperationDefinition_Parameter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("OperationDefinition_Parameter{");
    if (targetProfile != null) {
      builder.append("targetProfile=").append(targetProfile);
    }
    if (use != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (min != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("min=").append(min);
    }
    if (searchType != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("searchType=").append(searchType);
    }
    if (name != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (type != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (part != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("part=").append(part);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (max != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("max=").append(max);
    }
    if (documentation != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (binding != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("binding=").append(binding);
    }
    if (referencedFrom != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("referencedFrom=").append(referencedFrom);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "OperationDefinition_Parameter", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements OperationDefinition_Parameter {
    @Nullable Optional<List<Canonical>> targetProfile = Optional.empty();
    boolean targetProfileIsSet;
    @Nullable Optional<Operationdefinition_parameterUse> use = Optional.empty();
    boolean useIsSet;
    @Nullable Optional<Integer> min = Optional.empty();
    boolean minIsSet;
    @Nullable Optional<Operationdefinition_parameterSearchtype> searchType = Optional.empty();
    boolean searchTypeIsSet;
    @Nullable Optional<Code> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Code> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<OperationDefinition_Parameter>> part = Optional.empty();
    boolean partIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> max = Optional.empty();
    boolean maxIsSet;
    @Nullable Optional<String> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable Optional<OperationDefinition_Binding> binding = Optional.empty();
    boolean bindingIsSet;
    @Nullable Optional<List<OperationDefinition_ReferencedFrom>> referencedFrom = Optional.empty();
    boolean referencedFromIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("targetProfile")
    public void setTargetProfile(Optional<List<Canonical>> targetProfile) {
      this.targetProfile = targetProfile;
      this.targetProfileIsSet = true;
    }
    @JsonProperty("use")
    public void setUse(Optional<Operationdefinition_parameterUse> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @JsonProperty("min")
    public void setMin(Optional<Integer> min) {
      this.min = min;
      this.minIsSet = true;
    }
    @JsonProperty("searchType")
    public void setSearchType(Optional<Operationdefinition_parameterSearchtype> searchType) {
      this.searchType = searchType;
      this.searchTypeIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<Code> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Code> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("part")
    public void setPart(Optional<List<OperationDefinition_Parameter>> part) {
      this.part = part;
      this.partIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("max")
    public void setMax(Optional<String> max) {
      this.max = max;
      this.maxIsSet = true;
    }
    @JsonProperty("documentation")
    public void setDocumentation(Optional<String> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @JsonProperty("binding")
    public void setBinding(Optional<OperationDefinition_Binding> binding) {
      this.binding = binding;
      this.bindingIsSet = true;
    }
    @JsonProperty("referencedFrom")
    public void setReferencedFrom(Optional<List<OperationDefinition_ReferencedFrom>> referencedFrom) {
      this.referencedFrom = referencedFrom;
      this.referencedFromIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Canonical>> targetProfile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Operationdefinition_parameterUse> use() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> min() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Operationdefinition_parameterSearchtype> searchType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<OperationDefinition_Parameter>> part() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> max() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<OperationDefinition_Binding> binding() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<OperationDefinition_ReferencedFrom>> referencedFrom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableOperationDefinition_Parameter fromJson(Json json) {
    ImmutableOperationDefinition_Parameter.Builder builder = ImmutableOperationDefinition_Parameter.builder();
    if (json.targetProfileIsSet) {
      builder.targetProfile(json.targetProfile);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.minIsSet) {
      builder.min(json.min);
    }
    if (json.searchTypeIsSet) {
      builder.searchType(json.searchType);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.partIsSet) {
      builder.part(json.part);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.maxIsSet) {
      builder.max(json.max);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.bindingIsSet) {
      builder.binding(json.binding);
    }
    if (json.referencedFromIsSet) {
      builder.referencedFrom(json.referencedFrom);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableOperationDefinition_Parameter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OperationDefinition_Parameter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OperationDefinition_Parameter instance
   */
  public static OperationDefinition_Parameter copyOf(OperationDefinition_Parameter instance) {
    if (instance instanceof ImmutableOperationDefinition_Parameter) {
      return (ImmutableOperationDefinition_Parameter) instance;
    }
    return ImmutableOperationDefinition_Parameter.builder()
        .targetProfile(instance.targetProfile())
        .use(instance.use())
        .min(instance.min())
        .searchType(instance.searchType())
        .name(instance.name())
        .type(instance.type())
        .part(instance.part())
        .extension(instance.extension())
        .max(instance.max())
        .documentation(instance.documentation())
        .binding(instance.binding())
        .referencedFrom(instance.referencedFrom())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link OperationDefinition_Parameter OperationDefinition_Parameter}.
   * <pre>
   * ImmutableOperationDefinition_Parameter.builder()
   *    .targetProfile(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link OperationDefinition_Parameter#targetProfile() targetProfile}
   *    .use(com.medplum.types.fhir.Operationdefinition_parameterUse) // optional {@link OperationDefinition_Parameter#use() use}
   *    .min(Integer) // optional {@link OperationDefinition_Parameter#min() min}
   *    .searchType(com.medplum.types.fhir.Operationdefinition_parameterSearchtype) // optional {@link OperationDefinition_Parameter#searchType() searchType}
   *    .name(com.medplum.types.fhir.Code) // optional {@link OperationDefinition_Parameter#name() name}
   *    .type(com.medplum.types.fhir.Code) // optional {@link OperationDefinition_Parameter#type() type}
   *    .part(List&amp;lt;com.medplum.types.fhir.OperationDefinition_Parameter&amp;gt;) // optional {@link OperationDefinition_Parameter#part() part}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link OperationDefinition_Parameter#extension() extension}
   *    .max(String) // optional {@link OperationDefinition_Parameter#max() max}
   *    .documentation(String) // optional {@link OperationDefinition_Parameter#documentation() documentation}
   *    .binding(com.medplum.types.fhir.OperationDefinition_Binding) // optional {@link OperationDefinition_Parameter#binding() binding}
   *    .referencedFrom(List&amp;lt;com.medplum.types.fhir.OperationDefinition_ReferencedFrom&amp;gt;) // optional {@link OperationDefinition_Parameter#referencedFrom() referencedFrom}
   *    .id(String) // optional {@link OperationDefinition_Parameter#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link OperationDefinition_Parameter#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new OperationDefinition_Parameter builder
   */
  public static ImmutableOperationDefinition_Parameter.Builder builder() {
    return new ImmutableOperationDefinition_Parameter.Builder();
  }

  /**
   * Builds instances of type {@link OperationDefinition_Parameter OperationDefinition_Parameter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "OperationDefinition_Parameter", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TARGET_PROFILE = 0x1L;
    private static final long OPT_BIT_USE = 0x2L;
    private static final long OPT_BIT_MIN = 0x4L;
    private static final long OPT_BIT_SEARCH_TYPE = 0x8L;
    private static final long OPT_BIT_NAME = 0x10L;
    private static final long OPT_BIT_TYPE = 0x20L;
    private static final long OPT_BIT_PART = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_MAX = 0x100L;
    private static final long OPT_BIT_DOCUMENTATION = 0x200L;
    private static final long OPT_BIT_BINDING = 0x400L;
    private static final long OPT_BIT_REFERENCED_FROM = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private long optBits;

    private @Nullable List<Canonical> targetProfile;
    private @Nullable Operationdefinition_parameterUse use;
    private @Nullable Integer min;
    private @Nullable Operationdefinition_parameterSearchtype searchType;
    private @Nullable Code name;
    private @Nullable Code type;
    private @Nullable List<OperationDefinition_Parameter> part;
    private @Nullable List<Extension> extension;
    private @Nullable String max;
    private @Nullable String documentation;
    private @Nullable OperationDefinition_Binding binding;
    private @Nullable List<OperationDefinition_ReferencedFrom> referencedFrom;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#targetProfile() targetProfile} to targetProfile.
     * @param targetProfile The value for targetProfile
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetProfile(List<Canonical> targetProfile) {
      checkNotIsSet(targetProfileIsSet(), "targetProfile");
      this.targetProfile = Objects.requireNonNull(targetProfile, "targetProfile");
      optBits |= OPT_BIT_TARGET_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#targetProfile() targetProfile} to targetProfile.
     * @param targetProfile The value for targetProfile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetProfile")
    public final Builder targetProfile(Optional<? extends List<Canonical>> targetProfile) {
      checkNotIsSet(targetProfileIsSet(), "targetProfile");
      this.targetProfile = targetProfile.orElse(null);
      optBits |= OPT_BIT_TARGET_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(Operationdefinition_parameterUse use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("use")
    public final Builder use(Optional<? extends Operationdefinition_parameterUse> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#min() min} to min.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#min() min} to min.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#searchType() searchType} to searchType.
     * @param searchType The value for searchType
     * @return {@code this} builder for chained invocation
     */
    public final Builder searchType(Operationdefinition_parameterSearchtype searchType) {
      checkNotIsSet(searchTypeIsSet(), "searchType");
      this.searchType = Objects.requireNonNull(searchType, "searchType");
      optBits |= OPT_BIT_SEARCH_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#searchType() searchType} to searchType.
     * @param searchType The value for searchType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("searchType")
    public final Builder searchType(Optional<? extends Operationdefinition_parameterSearchtype> searchType) {
      checkNotIsSet(searchTypeIsSet(), "searchType");
      this.searchType = searchType.orElse(null);
      optBits |= OPT_BIT_SEARCH_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(Code name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<? extends Code> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Code type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Code> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#part() part} to part.
     * @param part The value for part
     * @return {@code this} builder for chained invocation
     */
    public final Builder part(List<OperationDefinition_Parameter> part) {
      checkNotIsSet(partIsSet(), "part");
      this.part = Objects.requireNonNull(part, "part");
      optBits |= OPT_BIT_PART;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#part() part} to part.
     * @param part The value for part
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("part")
    public final Builder part(Optional<? extends List<OperationDefinition_Parameter>> part) {
      checkNotIsSet(partIsSet(), "part");
      this.part = part.orElse(null);
      optBits |= OPT_BIT_PART;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#max() max} to max.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#max() max} to max.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(String documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("documentation")
    public final Builder documentation(Optional<String> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#binding() binding} to binding.
     * @param binding The value for binding
     * @return {@code this} builder for chained invocation
     */
    public final Builder binding(OperationDefinition_Binding binding) {
      checkNotIsSet(bindingIsSet(), "binding");
      this.binding = Objects.requireNonNull(binding, "binding");
      optBits |= OPT_BIT_BINDING;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#binding() binding} to binding.
     * @param binding The value for binding
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("binding")
    public final Builder binding(Optional<? extends OperationDefinition_Binding> binding) {
      checkNotIsSet(bindingIsSet(), "binding");
      this.binding = binding.orElse(null);
      optBits |= OPT_BIT_BINDING;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#referencedFrom() referencedFrom} to referencedFrom.
     * @param referencedFrom The value for referencedFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder referencedFrom(List<OperationDefinition_ReferencedFrom> referencedFrom) {
      checkNotIsSet(referencedFromIsSet(), "referencedFrom");
      this.referencedFrom = Objects.requireNonNull(referencedFrom, "referencedFrom");
      optBits |= OPT_BIT_REFERENCED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#referencedFrom() referencedFrom} to referencedFrom.
     * @param referencedFrom The value for referencedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referencedFrom")
    public final Builder referencedFrom(Optional<? extends List<OperationDefinition_ReferencedFrom>> referencedFrom) {
      checkNotIsSet(referencedFromIsSet(), "referencedFrom");
      this.referencedFrom = referencedFrom.orElse(null);
      optBits |= OPT_BIT_REFERENCED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Parameter#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationDefinition_Parameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link OperationDefinition_Parameter OperationDefinition_Parameter}.
     * @return An immutable instance of OperationDefinition_Parameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public OperationDefinition_Parameter build() {
      return new ImmutableOperationDefinition_Parameter(
          targetProfile,
          use,
          min,
          searchType,
          name,
          type,
          part,
          extension,
          max,
          documentation,
          binding,
          referencedFrom,
          id,
          modifierExtension);
    }

    private boolean targetProfileIsSet() {
      return (optBits & OPT_BIT_TARGET_PROFILE) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean minIsSet() {
      return (optBits & OPT_BIT_MIN) != 0;
    }

    private boolean searchTypeIsSet() {
      return (optBits & OPT_BIT_SEARCH_TYPE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean partIsSet() {
      return (optBits & OPT_BIT_PART) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean maxIsSet() {
      return (optBits & OPT_BIT_MAX) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean bindingIsSet() {
      return (optBits & OPT_BIT_BINDING) != 0;
    }

    private boolean referencedFromIsSet() {
      return (optBits & OPT_BIT_REFERENCED_FROM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of OperationDefinition_Parameter is strict, attribute is already set: ".concat(name));
    }
  }
}