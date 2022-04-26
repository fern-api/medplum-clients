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
 * Immutable implementation of {@link RequestGroup_RelatedAction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRequestGroup_RelatedAction.builder()}.
 */
@Generated(from = "RequestGroup_RelatedAction", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRequestGroup_RelatedAction
    implements RequestGroup_RelatedAction {
  private final @Nullable Range offsetRange;
  private final @Nullable Id actionId;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable Duration offsetDuration;
  private final @Nullable Code relationship;
  private final @Nullable List<Extension> extension;

  private ImmutableRequestGroup_RelatedAction(
      @Nullable Range offsetRange,
      @Nullable Id actionId,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable Duration offsetDuration,
      @Nullable Code relationship,
      @Nullable List<Extension> extension) {
    this.offsetRange = offsetRange;
    this.actionId = actionId;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.offsetDuration = offsetDuration;
    this.relationship = relationship;
    this.extension = extension;
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
   * @return The value of the {@code actionId} attribute
   */
  @JsonProperty("actionId")
  @Override
  public Optional<Id> actionId() {
    return Optional.ofNullable(actionId);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
  public Optional<Code> relationship() {
    return Optional.ofNullable(relationship);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#offsetRange() offsetRange} attribute.
   * @param value The value for offsetRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withOffsetRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "offsetRange");
    if (this.offsetRange == newValue) return this;
    return new ImmutableRequestGroup_RelatedAction(
        newValue,
        this.actionId,
        this.modifierExtension,
        this.id,
        this.offsetDuration,
        this.relationship,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#offsetRange() offsetRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for offsetRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_RelatedAction withOffsetRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.offsetRange == value) return this;
    return new ImmutableRequestGroup_RelatedAction(
        value,
        this.actionId,
        this.modifierExtension,
        this.id,
        this.offsetDuration,
        this.relationship,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#actionId() actionId} attribute.
   * @param value The value for actionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withActionId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "actionId");
    if (this.actionId == newValue) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.offsetRange,
        newValue,
        this.modifierExtension,
        this.id,
        this.offsetDuration,
        this.relationship,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#actionId() actionId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actionId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_RelatedAction withActionId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.actionId == value) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.offsetRange,
        value,
        this.modifierExtension,
        this.id,
        this.offsetDuration,
        this.relationship,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.offsetRange,
        this.actionId,
        newValue,
        this.id,
        this.offsetDuration,
        this.relationship,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_RelatedAction withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.offsetRange,
        this.actionId,
        value,
        this.id,
        this.offsetDuration,
        this.relationship,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.offsetRange,
        this.actionId,
        this.modifierExtension,
        newValue,
        this.offsetDuration,
        this.relationship,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.offsetRange,
        this.actionId,
        this.modifierExtension,
        value,
        this.offsetDuration,
        this.relationship,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#offsetDuration() offsetDuration} attribute.
   * @param value The value for offsetDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withOffsetDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "offsetDuration");
    if (this.offsetDuration == newValue) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.offsetRange,
        this.actionId,
        this.modifierExtension,
        this.id,
        newValue,
        this.relationship,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#offsetDuration() offsetDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for offsetDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_RelatedAction withOffsetDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.offsetDuration == value) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.offsetRange,
        this.actionId,
        this.modifierExtension,
        this.id,
        value,
        this.relationship,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#relationship() relationship} attribute.
   * @param value The value for relationship
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withRelationship(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "relationship");
    if (this.relationship == newValue) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.offsetRange,
        this.actionId,
        this.modifierExtension,
        this.id,
        this.offsetDuration,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#relationship() relationship} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationship
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_RelatedAction withRelationship(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.relationship == value) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.offsetRange,
        this.actionId,
        this.modifierExtension,
        this.id,
        this.offsetDuration,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.offsetRange,
        this.actionId,
        this.modifierExtension,
        this.id,
        this.offsetDuration,
        this.relationship,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_RelatedAction withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.offsetRange,
        this.actionId,
        this.modifierExtension,
        this.id,
        this.offsetDuration,
        this.relationship,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRequestGroup_RelatedAction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRequestGroup_RelatedAction
        && equalTo((ImmutableRequestGroup_RelatedAction) another);
  }

  private boolean equalTo(ImmutableRequestGroup_RelatedAction another) {
    return Objects.equals(offsetRange, another.offsetRange)
        && Objects.equals(actionId, another.actionId)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(offsetDuration, another.offsetDuration)
        && Objects.equals(relationship, another.relationship)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code offsetRange}, {@code actionId}, {@code modifierExtension}, {@code id}, {@code offsetDuration}, {@code relationship}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(offsetRange);
    h += (h << 5) + Objects.hashCode(actionId);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(offsetDuration);
    h += (h << 5) + Objects.hashCode(relationship);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code RequestGroup_RelatedAction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RequestGroup_RelatedAction{");
    if (offsetRange != null) {
      builder.append("offsetRange=").append(offsetRange);
    }
    if (actionId != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("actionId=").append(actionId);
    }
    if (modifierExtension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (offsetDuration != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("offsetDuration=").append(offsetDuration);
    }
    if (relationship != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("relationship=").append(relationship);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RequestGroup_RelatedAction", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RequestGroup_RelatedAction {
    @Nullable Optional<Range> offsetRange = Optional.empty();
    boolean offsetRangeIsSet;
    @Nullable Optional<Id> actionId = Optional.empty();
    boolean actionIdIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Duration> offsetDuration = Optional.empty();
    boolean offsetDurationIsSet;
    @Nullable Optional<Code> relationship = Optional.empty();
    boolean relationshipIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("offsetRange")
    public void setOffsetRange(Optional<Range> offsetRange) {
      this.offsetRange = offsetRange;
      this.offsetRangeIsSet = true;
    }
    @JsonProperty("actionId")
    public void setActionId(Optional<Id> actionId) {
      this.actionId = actionId;
      this.actionIdIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("offsetDuration")
    public void setOffsetDuration(Optional<Duration> offsetDuration) {
      this.offsetDuration = offsetDuration;
      this.offsetDurationIsSet = true;
    }
    @JsonProperty("relationship")
    public void setRelationship(Optional<Code> relationship) {
      this.relationship = relationship;
      this.relationshipIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<Range> offsetRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> actionId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> offsetDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> relationship() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRequestGroup_RelatedAction fromJson(Json json) {
    ImmutableRequestGroup_RelatedAction.Builder builder = ImmutableRequestGroup_RelatedAction.builder();
    if (json.offsetRangeIsSet) {
      builder.offsetRange(json.offsetRange);
    }
    if (json.actionIdIsSet) {
      builder.actionId(json.actionId);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.offsetDurationIsSet) {
      builder.offsetDuration(json.offsetDuration);
    }
    if (json.relationshipIsSet) {
      builder.relationship(json.relationship);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableRequestGroup_RelatedAction) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RequestGroup_RelatedAction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RequestGroup_RelatedAction instance
   */
  public static RequestGroup_RelatedAction copyOf(RequestGroup_RelatedAction instance) {
    if (instance instanceof ImmutableRequestGroup_RelatedAction) {
      return (ImmutableRequestGroup_RelatedAction) instance;
    }
    return ImmutableRequestGroup_RelatedAction.builder()
        .offsetRange(instance.offsetRange())
        .actionId(instance.actionId())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .offsetDuration(instance.offsetDuration())
        .relationship(instance.relationship())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link RequestGroup_RelatedAction RequestGroup_RelatedAction}.
   * <pre>
   * ImmutableRequestGroup_RelatedAction.builder()
   *    .offsetRange(com.medplum.types.fhir.Range) // optional {@link RequestGroup_RelatedAction#offsetRange() offsetRange}
   *    .actionId(com.medplum.types.fhir.Id) // optional {@link RequestGroup_RelatedAction#actionId() actionId}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RequestGroup_RelatedAction#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link RequestGroup_RelatedAction#id() id}
   *    .offsetDuration(com.medplum.types.fhir.Duration) // optional {@link RequestGroup_RelatedAction#offsetDuration() offsetDuration}
   *    .relationship(com.medplum.types.fhir.Code) // optional {@link RequestGroup_RelatedAction#relationship() relationship}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RequestGroup_RelatedAction#extension() extension}
   *    .build();
   * </pre>
   * @return A new RequestGroup_RelatedAction builder
   */
  public static ImmutableRequestGroup_RelatedAction.Builder builder() {
    return new ImmutableRequestGroup_RelatedAction.Builder();
  }

  /**
   * Builds instances of type {@link RequestGroup_RelatedAction RequestGroup_RelatedAction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RequestGroup_RelatedAction", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_OFFSET_RANGE = 0x1L;
    private static final long OPT_BIT_ACTION_ID = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_OFFSET_DURATION = 0x10L;
    private static final long OPT_BIT_RELATIONSHIP = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable Range offsetRange;
    private @Nullable Id actionId;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Duration offsetDuration;
    private @Nullable Code relationship;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RequestGroup_RelatedAction#offsetRange() offsetRange} to offsetRange.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#offsetRange() offsetRange} to offsetRange.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#actionId() actionId} to actionId.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#actionId() actionId} to actionId.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#offsetDuration() offsetDuration} to offsetDuration.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#offsetDuration() offsetDuration} to offsetDuration.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationship(Code relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = Objects.requireNonNull(relationship, "relationship");
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_RelatedAction#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationship")
    public final Builder relationship(Optional<? extends Code> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = relationship.orElse(null);
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_RelatedAction#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#extension() extension} to extension.
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
     * Builds a new {@link RequestGroup_RelatedAction RequestGroup_RelatedAction}.
     * @return An immutable instance of RequestGroup_RelatedAction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public RequestGroup_RelatedAction build() {
      return new ImmutableRequestGroup_RelatedAction(offsetRange, actionId, modifierExtension, id, offsetDuration, relationship, extension);
    }

    private boolean offsetRangeIsSet() {
      return (optBits & OPT_BIT_OFFSET_RANGE) != 0;
    }

    private boolean actionIdIsSet() {
      return (optBits & OPT_BIT_ACTION_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean offsetDurationIsSet() {
      return (optBits & OPT_BIT_OFFSET_DURATION) != 0;
    }

    private boolean relationshipIsSet() {
      return (optBits & OPT_BIT_RELATIONSHIP) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RequestGroup_RelatedAction is strict, attribute is already set: ".concat(name));
    }
  }
}
