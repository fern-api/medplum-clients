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
 * Immutable implementation of {@link PlanDefinition_RelatedAction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePlanDefinition_RelatedAction.builder()}.
 */
@Generated(from = "PlanDefinition_RelatedAction", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePlanDefinition_RelatedAction
    implements PlanDefinition_RelatedAction {
  private final @Nullable Range offsetRange;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Id actionId;
  private final @Nullable Duration offsetDuration;
  private final @Nullable Plandefinition_RelatedactionRelationship relationship;
  private final @Nullable String id;

  private ImmutablePlanDefinition_RelatedAction(
      @Nullable Range offsetRange,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Id actionId,
      @Nullable Duration offsetDuration,
      @Nullable Plandefinition_RelatedactionRelationship relationship,
      @Nullable String id) {
    this.offsetRange = offsetRange;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.actionId = actionId;
    this.offsetDuration = offsetDuration;
    this.relationship = relationship;
    this.id = id;
  }

  /**
   * @return The value of the {@code offsetRange} attribute
   */
  @JsonProperty("offsetRange")
  @Override
  public Optional<Range> offsetRange() {
    return Optional.ofNullable(offsetRange);
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
   * @return The value of the {@code actionId} attribute
   */
  @JsonProperty("actionId")
  @Override
  public Optional<Id> actionId() {
    return Optional.ofNullable(actionId);
  }

  /**
   * @return The value of the {@code offsetDuration} attribute
   */
  @JsonProperty("offsetDuration")
  @Override
  public Optional<Duration> offsetDuration() {
    return Optional.ofNullable(offsetDuration);
  }

  /**
   * @return The value of the {@code relationship} attribute
   */
  @JsonProperty("relationship")
  @Override
  public Optional<Plandefinition_RelatedactionRelationship> relationship() {
    return Optional.ofNullable(relationship);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_RelatedAction#offsetRange() offsetRange} attribute.
   * @param value The value for offsetRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_RelatedAction withOffsetRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "offsetRange");
    if (this.offsetRange == newValue) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        newValue,
        this.extension,
        this.modifierExtension,
        this.actionId,
        this.offsetDuration,
        this.relationship,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_RelatedAction#offsetRange() offsetRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for offsetRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_RelatedAction withOffsetRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.offsetRange == value) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        value,
        this.extension,
        this.modifierExtension,
        this.actionId,
        this.offsetDuration,
        this.relationship,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_RelatedAction#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_RelatedAction withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        this.offsetRange,
        newValue,
        this.modifierExtension,
        this.actionId,
        this.offsetDuration,
        this.relationship,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_RelatedAction#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_RelatedAction withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        this.offsetRange,
        value,
        this.modifierExtension,
        this.actionId,
        this.offsetDuration,
        this.relationship,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_RelatedAction#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_RelatedAction withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        this.offsetRange,
        this.extension,
        newValue,
        this.actionId,
        this.offsetDuration,
        this.relationship,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_RelatedAction#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_RelatedAction withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        this.offsetRange,
        this.extension,
        value,
        this.actionId,
        this.offsetDuration,
        this.relationship,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_RelatedAction#actionId() actionId} attribute.
   * @param value The value for actionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_RelatedAction withActionId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "actionId");
    if (this.actionId == newValue) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        this.offsetRange,
        this.extension,
        this.modifierExtension,
        newValue,
        this.offsetDuration,
        this.relationship,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_RelatedAction#actionId() actionId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actionId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_RelatedAction withActionId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.actionId == value) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        this.offsetRange,
        this.extension,
        this.modifierExtension,
        value,
        this.offsetDuration,
        this.relationship,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_RelatedAction#offsetDuration() offsetDuration} attribute.
   * @param value The value for offsetDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_RelatedAction withOffsetDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "offsetDuration");
    if (this.offsetDuration == newValue) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        this.offsetRange,
        this.extension,
        this.modifierExtension,
        this.actionId,
        newValue,
        this.relationship,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_RelatedAction#offsetDuration() offsetDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for offsetDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_RelatedAction withOffsetDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.offsetDuration == value) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        this.offsetRange,
        this.extension,
        this.modifierExtension,
        this.actionId,
        value,
        this.relationship,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_RelatedAction#relationship() relationship} attribute.
   * @param value The value for relationship
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_RelatedAction withRelationship(Plandefinition_RelatedactionRelationship value) {
    @Nullable Plandefinition_RelatedactionRelationship newValue = Objects.requireNonNull(value, "relationship");
    if (this.relationship == newValue) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        this.offsetRange,
        this.extension,
        this.modifierExtension,
        this.actionId,
        this.offsetDuration,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_RelatedAction#relationship() relationship} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationship
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_RelatedAction withRelationship(Optional<? extends Plandefinition_RelatedactionRelationship> optional) {
    @Nullable Plandefinition_RelatedactionRelationship value = optional.orElse(null);
    if (this.relationship == value) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        this.offsetRange,
        this.extension,
        this.modifierExtension,
        this.actionId,
        this.offsetDuration,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_RelatedAction#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_RelatedAction withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        this.offsetRange,
        this.extension,
        this.modifierExtension,
        this.actionId,
        this.offsetDuration,
        this.relationship,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_RelatedAction#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_RelatedAction withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePlanDefinition_RelatedAction(
        this.offsetRange,
        this.extension,
        this.modifierExtension,
        this.actionId,
        this.offsetDuration,
        this.relationship,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePlanDefinition_RelatedAction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePlanDefinition_RelatedAction
        && equalTo((ImmutablePlanDefinition_RelatedAction) another);
  }

  private boolean equalTo(ImmutablePlanDefinition_RelatedAction another) {
    return Objects.equals(offsetRange, another.offsetRange)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(actionId, another.actionId)
        && Objects.equals(offsetDuration, another.offsetDuration)
        && Objects.equals(relationship, another.relationship)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code offsetRange}, {@code extension}, {@code modifierExtension}, {@code actionId}, {@code offsetDuration}, {@code relationship}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(offsetRange);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(actionId);
    h += (h << 5) + Objects.hashCode(offsetDuration);
    h += (h << 5) + Objects.hashCode(relationship);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code PlanDefinition_RelatedAction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PlanDefinition_RelatedAction{");
    if (offsetRange != null) {
      builder.append("offsetRange=").append(offsetRange);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (actionId != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("actionId=").append(actionId);
    }
    if (offsetDuration != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("offsetDuration=").append(offsetDuration);
    }
    if (relationship != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("relationship=").append(relationship);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PlanDefinition_RelatedAction", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PlanDefinition_RelatedAction {
    @Nullable Optional<Range> offsetRange = Optional.empty();
    boolean offsetRangeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Id> actionId = Optional.empty();
    boolean actionIdIsSet;
    @Nullable Optional<Duration> offsetDuration = Optional.empty();
    boolean offsetDurationIsSet;
    @Nullable Optional<Plandefinition_RelatedactionRelationship> relationship = Optional.empty();
    boolean relationshipIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("offsetRange")
    public void setOffsetRange(Optional<Range> offsetRange) {
      this.offsetRange = offsetRange;
      this.offsetRangeIsSet = true;
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
    @JsonProperty("actionId")
    public void setActionId(Optional<Id> actionId) {
      this.actionId = actionId;
      this.actionIdIsSet = true;
    }
    @JsonProperty("offsetDuration")
    public void setOffsetDuration(Optional<Duration> offsetDuration) {
      this.offsetDuration = offsetDuration;
      this.offsetDurationIsSet = true;
    }
    @JsonProperty("relationship")
    public void setRelationship(Optional<Plandefinition_RelatedactionRelationship> relationship) {
      this.relationship = relationship;
      this.relationshipIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<Range> offsetRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> actionId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> offsetDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Plandefinition_RelatedactionRelationship> relationship() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePlanDefinition_RelatedAction fromJson(Json json) {
    ImmutablePlanDefinition_RelatedAction.Builder builder = ImmutablePlanDefinition_RelatedAction.builder();
    if (json.offsetRangeIsSet) {
      builder.offsetRange(json.offsetRange);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.actionIdIsSet) {
      builder.actionId(json.actionId);
    }
    if (json.offsetDurationIsSet) {
      builder.offsetDuration(json.offsetDuration);
    }
    if (json.relationshipIsSet) {
      builder.relationship(json.relationship);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutablePlanDefinition_RelatedAction) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PlanDefinition_RelatedAction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PlanDefinition_RelatedAction instance
   */
  public static PlanDefinition_RelatedAction copyOf(PlanDefinition_RelatedAction instance) {
    if (instance instanceof ImmutablePlanDefinition_RelatedAction) {
      return (ImmutablePlanDefinition_RelatedAction) instance;
    }
    return ImmutablePlanDefinition_RelatedAction.builder()
        .offsetRange(instance.offsetRange())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .actionId(instance.actionId())
        .offsetDuration(instance.offsetDuration())
        .relationship(instance.relationship())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link PlanDefinition_RelatedAction PlanDefinition_RelatedAction}.
   * <pre>
   * ImmutablePlanDefinition_RelatedAction.builder()
   *    .offsetRange(com.fhir.types.fhir.Range) // optional {@link PlanDefinition_RelatedAction#offsetRange() offsetRange}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_RelatedAction#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_RelatedAction#modifierExtension() modifierExtension}
   *    .actionId(com.fhir.types.fhir.Id) // optional {@link PlanDefinition_RelatedAction#actionId() actionId}
   *    .offsetDuration(com.fhir.types.fhir.Duration) // optional {@link PlanDefinition_RelatedAction#offsetDuration() offsetDuration}
   *    .relationship(Plandefinition_RelatedactionRelationship) // optional {@link PlanDefinition_RelatedAction#relationship() relationship}
   *    .id(String) // optional {@link PlanDefinition_RelatedAction#id() id}
   *    .build();
   * </pre>
   * @return A new PlanDefinition_RelatedAction builder
   */
  public static ImmutablePlanDefinition_RelatedAction.Builder builder() {
    return new ImmutablePlanDefinition_RelatedAction.Builder();
  }

  /**
   * Builds instances of type {@link PlanDefinition_RelatedAction PlanDefinition_RelatedAction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PlanDefinition_RelatedAction", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_OFFSET_RANGE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ACTION_ID = 0x8L;
    private static final long OPT_BIT_OFFSET_DURATION = 0x10L;
    private static final long OPT_BIT_RELATIONSHIP = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private long optBits;

    private @Nullable Range offsetRange;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Id actionId;
    private @Nullable Duration offsetDuration;
    private @Nullable Plandefinition_RelatedactionRelationship relationship;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PlanDefinition_RelatedAction#offsetRange() offsetRange} to offsetRange.
     * @param offsetRange The value for offsetRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder offsetRange(Range offsetRange) {
      checkNotIsSet(offsetRangeIsSet(), "offsetRange");
      this.offsetRange = Objects.requireNonNull(offsetRange, "offsetRange");
      optBits |= OPT_BIT_OFFSET_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_RelatedAction#offsetRange() offsetRange} to offsetRange.
     * @param offsetRange The value for offsetRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("offsetRange")
    public final Builder offsetRange(Optional<? extends Range> offsetRange) {
      checkNotIsSet(offsetRangeIsSet(), "offsetRange");
      this.offsetRange = offsetRange.orElse(null);
      optBits |= OPT_BIT_OFFSET_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_RelatedAction#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition_RelatedAction#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition_RelatedAction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_RelatedAction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_RelatedAction#actionId() actionId} to actionId.
     * @param actionId The value for actionId
     * @return {@code this} builder for chained invocation
     */
    public final Builder actionId(Id actionId) {
      checkNotIsSet(actionIdIsSet(), "actionId");
      this.actionId = Objects.requireNonNull(actionId, "actionId");
      optBits |= OPT_BIT_ACTION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_RelatedAction#actionId() actionId} to actionId.
     * @param actionId The value for actionId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("actionId")
    public final Builder actionId(Optional<? extends Id> actionId) {
      checkNotIsSet(actionIdIsSet(), "actionId");
      this.actionId = actionId.orElse(null);
      optBits |= OPT_BIT_ACTION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_RelatedAction#offsetDuration() offsetDuration} to offsetDuration.
     * @param offsetDuration The value for offsetDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder offsetDuration(Duration offsetDuration) {
      checkNotIsSet(offsetDurationIsSet(), "offsetDuration");
      this.offsetDuration = Objects.requireNonNull(offsetDuration, "offsetDuration");
      optBits |= OPT_BIT_OFFSET_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_RelatedAction#offsetDuration() offsetDuration} to offsetDuration.
     * @param offsetDuration The value for offsetDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("offsetDuration")
    public final Builder offsetDuration(Optional<? extends Duration> offsetDuration) {
      checkNotIsSet(offsetDurationIsSet(), "offsetDuration");
      this.offsetDuration = offsetDuration.orElse(null);
      optBits |= OPT_BIT_OFFSET_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_RelatedAction#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationship(Plandefinition_RelatedactionRelationship relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = Objects.requireNonNull(relationship, "relationship");
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_RelatedAction#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationship")
    public final Builder relationship(Optional<? extends Plandefinition_RelatedactionRelationship> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = relationship.orElse(null);
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_RelatedAction#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition_RelatedAction#id() id} to id.
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
     * Builds a new {@link PlanDefinition_RelatedAction PlanDefinition_RelatedAction}.
     * @return An immutable instance of PlanDefinition_RelatedAction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PlanDefinition_RelatedAction build() {
      return new ImmutablePlanDefinition_RelatedAction(offsetRange, extension, modifierExtension, actionId, offsetDuration, relationship, id);
    }

    private boolean offsetRangeIsSet() {
      return (optBits & OPT_BIT_OFFSET_RANGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean actionIdIsSet() {
      return (optBits & OPT_BIT_ACTION_ID) != 0;
    }

    private boolean offsetDurationIsSet() {
      return (optBits & OPT_BIT_OFFSET_DURATION) != 0;
    }

    private boolean relationshipIsSet() {
      return (optBits & OPT_BIT_RELATIONSHIP) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PlanDefinition_RelatedAction is strict, attribute is already set: ".concat(name));
    }
  }
}
