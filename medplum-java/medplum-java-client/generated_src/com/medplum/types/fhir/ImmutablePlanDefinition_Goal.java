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
 * Immutable implementation of {@link PlanDefinition_Goal}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePlanDefinition_Goal.builder()}.
 */
@Generated(from = "PlanDefinition_Goal", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePlanDefinition_Goal implements PlanDefinition_Goal {
  private final @Nullable CodeableConcept start;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<RelatedArtifact> documentation;
  private final @Nullable List<PlanDefinition_Target> target;
  private final @Nullable List<CodeableConcept> addresses;
  private final @Nullable CodeableConcept category;
  private final @Nullable String id;
  private final @Nullable CodeableConcept priority;
  private final CodeableConcept description;

  private ImmutablePlanDefinition_Goal(
      @Nullable CodeableConcept start,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<RelatedArtifact> documentation,
      @Nullable List<PlanDefinition_Target> target,
      @Nullable List<CodeableConcept> addresses,
      @Nullable CodeableConcept category,
      @Nullable String id,
      @Nullable CodeableConcept priority,
      CodeableConcept description) {
    this.start = start;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.documentation = documentation;
    this.target = target;
    this.addresses = addresses;
    this.category = category;
    this.id = id;
    this.priority = priority;
    this.description = description;
  }

  /**
   * @return The value of the {@code start} attribute
   */
  @JsonProperty("start")
  @Override
  public Optional<CodeableConcept> start() {
    return Optional.ofNullable(start);
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
   * @return The value of the {@code documentation} attribute
   */
  @JsonProperty("documentation")
  @Override
  public Optional<List<RelatedArtifact>> documentation() {
    return Optional.ofNullable(documentation);
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Optional<List<PlanDefinition_Target>> target() {
    return Optional.ofNullable(target);
  }

  /**
   * @return The value of the {@code addresses} attribute
   */
  @JsonProperty("addresses")
  @Override
  public Optional<List<CodeableConcept>> addresses() {
    return Optional.ofNullable(addresses);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<CodeableConcept> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<CodeableConcept> priority() {
    return Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public CodeableConcept description() {
    return description;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Goal#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Goal withStart(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "start");
    if (this.start == newValue) return this;
    return new ImmutablePlanDefinition_Goal(
        newValue,
        this.extension,
        this.modifierExtension,
        this.documentation,
        this.target,
        this.addresses,
        this.category,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Goal#start() start} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Goal withStart(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.start == value) return this;
    return new ImmutablePlanDefinition_Goal(
        value,
        this.extension,
        this.modifierExtension,
        this.documentation,
        this.target,
        this.addresses,
        this.category,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Goal#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Goal withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        newValue,
        this.modifierExtension,
        this.documentation,
        this.target,
        this.addresses,
        this.category,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Goal#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Goal withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        value,
        this.modifierExtension,
        this.documentation,
        this.target,
        this.addresses,
        this.category,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Goal#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Goal withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        newValue,
        this.documentation,
        this.target,
        this.addresses,
        this.category,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Goal#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Goal withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        value,
        this.documentation,
        this.target,
        this.addresses,
        this.category,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Goal#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Goal withDocumentation(List<RelatedArtifact> value) {
    @Nullable List<RelatedArtifact> newValue = Objects.requireNonNull(value, "documentation");
    if (this.documentation == newValue) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        newValue,
        this.target,
        this.addresses,
        this.category,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Goal#documentation() documentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Goal withDocumentation(Optional<? extends List<RelatedArtifact>> optional) {
    @Nullable List<RelatedArtifact> value = optional.orElse(null);
    if (this.documentation == value) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        value,
        this.target,
        this.addresses,
        this.category,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Goal#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Goal withTarget(List<PlanDefinition_Target> value) {
    @Nullable List<PlanDefinition_Target> newValue = Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        this.documentation,
        newValue,
        this.addresses,
        this.category,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Goal#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Goal withTarget(Optional<? extends List<PlanDefinition_Target>> optional) {
    @Nullable List<PlanDefinition_Target> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        this.documentation,
        value,
        this.addresses,
        this.category,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Goal#addresses() addresses} attribute.
   * @param value The value for addresses
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Goal withAddresses(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "addresses");
    if (this.addresses == newValue) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        this.documentation,
        this.target,
        newValue,
        this.category,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Goal#addresses() addresses} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for addresses
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Goal withAddresses(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.addresses == value) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        this.documentation,
        this.target,
        value,
        this.category,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Goal#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Goal withCategory(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        this.documentation,
        this.target,
        this.addresses,
        newValue,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Goal#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Goal withCategory(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        this.documentation,
        this.target,
        this.addresses,
        value,
        this.id,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Goal#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Goal withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        this.documentation,
        this.target,
        this.addresses,
        this.category,
        newValue,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Goal#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Goal withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        this.documentation,
        this.target,
        this.addresses,
        this.category,
        value,
        this.priority,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Goal#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Goal withPriority(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        this.documentation,
        this.target,
        this.addresses,
        this.category,
        this.id,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Goal#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Goal withPriority(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        this.documentation,
        this.target,
        this.addresses,
        this.category,
        this.id,
        value,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PlanDefinition_Goal#description() description} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePlanDefinition_Goal withDescription(CodeableConcept value) {
    if (this.description == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "description");
    return new ImmutablePlanDefinition_Goal(
        this.start,
        this.extension,
        this.modifierExtension,
        this.documentation,
        this.target,
        this.addresses,
        this.category,
        this.id,
        this.priority,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePlanDefinition_Goal} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePlanDefinition_Goal
        && equalTo((ImmutablePlanDefinition_Goal) another);
  }

  private boolean equalTo(ImmutablePlanDefinition_Goal another) {
    return Objects.equals(start, another.start)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(documentation, another.documentation)
        && Objects.equals(target, another.target)
        && Objects.equals(addresses, another.addresses)
        && Objects.equals(category, another.category)
        && Objects.equals(id, another.id)
        && Objects.equals(priority, another.priority)
        && description.equals(another.description);
  }

  /**
   * Computes a hash code from attributes: {@code start}, {@code extension}, {@code modifierExtension}, {@code documentation}, {@code target}, {@code addresses}, {@code category}, {@code id}, {@code priority}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(start);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + Objects.hashCode(target);
    h += (h << 5) + Objects.hashCode(addresses);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + description.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PlanDefinition_Goal} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PlanDefinition_Goal{");
    if (start != null) {
      builder.append("start=").append(start);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (documentation != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (target != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("target=").append(target);
    }
    if (addresses != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("addresses=").append(addresses);
    }
    if (category != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (priority != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("description=").append(description);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PlanDefinition_Goal", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PlanDefinition_Goal {
    @Nullable Optional<CodeableConcept> start = Optional.empty();
    boolean startIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<RelatedArtifact>> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable Optional<List<PlanDefinition_Target>> target = Optional.empty();
    boolean targetIsSet;
    @Nullable Optional<List<CodeableConcept>> addresses = Optional.empty();
    boolean addressesIsSet;
    @Nullable Optional<CodeableConcept> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable CodeableConcept description;
    @JsonProperty("start")
    public void setStart(Optional<CodeableConcept> start) {
      this.start = start;
      this.startIsSet = true;
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
    @JsonProperty("documentation")
    public void setDocumentation(Optional<List<RelatedArtifact>> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @JsonProperty("target")
    public void setTarget(Optional<List<PlanDefinition_Target>> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @JsonProperty("addresses")
    public void setAddresses(Optional<List<CodeableConcept>> addresses) {
      this.addresses = addresses;
      this.addressesIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<CodeableConcept> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(CodeableConcept description) {
      this.description = description;
    }
    @Override
    public Optional<CodeableConcept> start() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RelatedArtifact>> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PlanDefinition_Target>> target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> addresses() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> priority() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePlanDefinition_Goal fromJson(Json json) {
    ImmutablePlanDefinition_Goal.Builder builder = ((ImmutablePlanDefinition_Goal.Builder) ImmutablePlanDefinition_Goal.builder());
    if (json.startIsSet) {
      builder.start(json.start);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.addressesIsSet) {
      builder.addresses(json.addresses);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    return (ImmutablePlanDefinition_Goal) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PlanDefinition_Goal} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PlanDefinition_Goal instance
   */
  public static PlanDefinition_Goal copyOf(PlanDefinition_Goal instance) {
    if (instance instanceof ImmutablePlanDefinition_Goal) {
      return (ImmutablePlanDefinition_Goal) instance;
    }
    return ((ImmutablePlanDefinition_Goal.Builder) ImmutablePlanDefinition_Goal.builder())
        .start(instance.start())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .documentation(instance.documentation())
        .target(instance.target())
        .addresses(instance.addresses())
        .category(instance.category())
        .id(instance.id())
        .priority(instance.priority())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link PlanDefinition_Goal PlanDefinition_Goal}.
   * <pre>
   * ImmutablePlanDefinition_Goal.builder()
   *    .start(com.medplum.types.fhir.CodeableConcept) // optional {@link PlanDefinition_Goal#start() start}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_Goal#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_Goal#modifierExtension() modifierExtension}
   *    .documentation(List&amp;lt;com.medplum.types.fhir.RelatedArtifact&amp;gt;) // optional {@link PlanDefinition_Goal#documentation() documentation}
   *    .target(List&amp;lt;com.medplum.types.fhir.PlanDefinition_Target&amp;gt;) // optional {@link PlanDefinition_Goal#target() target}
   *    .addresses(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link PlanDefinition_Goal#addresses() addresses}
   *    .category(com.medplum.types.fhir.CodeableConcept) // optional {@link PlanDefinition_Goal#category() category}
   *    .id(String) // optional {@link PlanDefinition_Goal#id() id}
   *    .priority(com.medplum.types.fhir.CodeableConcept) // optional {@link PlanDefinition_Goal#priority() priority}
   *    .description(com.medplum.types.fhir.CodeableConcept) // required {@link PlanDefinition_Goal#description() description}
   *    .build();
   * </pre>
   * @return A new PlanDefinition_Goal builder
   */
  public static DescriptionBuildStage builder() {
    return new ImmutablePlanDefinition_Goal.Builder();
  }

  /**
   * Builds instances of type {@link PlanDefinition_Goal PlanDefinition_Goal}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PlanDefinition_Goal", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements DescriptionBuildStage, BuildFinal {
    private static final long INIT_BIT_DESCRIPTION = 0x1L;
    private static final long OPT_BIT_START = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_DOCUMENTATION = 0x8L;
    private static final long OPT_BIT_TARGET = 0x10L;
    private static final long OPT_BIT_ADDRESSES = 0x20L;
    private static final long OPT_BIT_CATEGORY = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_PRIORITY = 0x100L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable CodeableConcept start;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<RelatedArtifact> documentation;
    private @Nullable List<PlanDefinition_Target> target;
    private @Nullable List<CodeableConcept> addresses;
    private @Nullable CodeableConcept category;
    private @Nullable String id;
    private @Nullable CodeableConcept priority;
    private @Nullable CodeableConcept description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    public final Builder start(CodeableConcept start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = Objects.requireNonNull(start, "start");
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("start")
    public final Builder start(Optional<? extends CodeableConcept> start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = start.orElse(null);
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition_Goal#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition_Goal#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_Goal#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_Goal#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(List<RelatedArtifact> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("documentation")
    public final Builder documentation(Optional<? extends List<RelatedArtifact>> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(List<PlanDefinition_Target> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Optional<? extends List<PlanDefinition_Target>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for chained invocation
     */
    public final Builder addresses(List<CodeableConcept> addresses) {
      checkNotIsSet(addressesIsSet(), "addresses");
      this.addresses = Objects.requireNonNull(addresses, "addresses");
      optBits |= OPT_BIT_ADDRESSES;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("addresses")
    public final Builder addresses(Optional<? extends List<CodeableConcept>> addresses) {
      checkNotIsSet(addressesIsSet(), "addresses");
      this.addresses = addresses.orElse(null);
      optBits |= OPT_BIT_ADDRESSES;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition_Goal#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition_Goal#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(CodeableConcept priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(Optional<? extends CodeableConcept> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the value for the {@link PlanDefinition_Goal#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(CodeableConcept description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Builds a new {@link PlanDefinition_Goal PlanDefinition_Goal}.
     * @return An immutable instance of PlanDefinition_Goal
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PlanDefinition_Goal build() {
      checkRequiredAttributes();
      return new ImmutablePlanDefinition_Goal(
          start,
          extension,
          modifierExtension,
          documentation,
          target,
          addresses,
          category,
          id,
          priority,
          description);
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean addressesIsSet() {
      return (optBits & OPT_BIT_ADDRESSES) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean descriptionIsSet() {
      return (initBits & INIT_BIT_DESCRIPTION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PlanDefinition_Goal is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!descriptionIsSet()) attributes.add("description");
      return "Cannot build PlanDefinition_Goal, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "PlanDefinition_Goal", generator = "Immutables")
  public interface DescriptionBuildStage {
    /**
     * Initializes the value for the {@link PlanDefinition_Goal#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(CodeableConcept description);
  }

  @Generated(from = "PlanDefinition_Goal", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    BuildFinal start(CodeableConcept start);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal start(Optional<? extends CodeableConcept> start);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal documentation(List<RelatedArtifact> documentation);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal documentation(Optional<? extends List<RelatedArtifact>> documentation);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    BuildFinal target(List<PlanDefinition_Target> target);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal target(Optional<? extends List<PlanDefinition_Target>> target);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for chained invocation
     */
    BuildFinal addresses(List<CodeableConcept> addresses);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addresses(Optional<? extends List<CodeableConcept>> addresses);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(CodeableConcept category);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends CodeableConcept> category);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(CodeableConcept priority);

    /**
     * Initializes the optional value {@link PlanDefinition_Goal#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends CodeableConcept> priority);

    /**
     * Builds a new {@link PlanDefinition_Goal PlanDefinition_Goal}.
     * @return An immutable instance of PlanDefinition_Goal
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    PlanDefinition_Goal build();
  }
}
