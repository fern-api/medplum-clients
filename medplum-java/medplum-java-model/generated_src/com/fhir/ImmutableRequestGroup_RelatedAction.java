//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link RequestGroup_RelatedAction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRequestGroup_RelatedAction.builder()}.
 */
@org.immutables.value.Generated(from = "RequestGroup_RelatedAction", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRequestGroup_RelatedAction implements com.fhir.RequestGroup_RelatedAction {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Duration offsetDuration;
  private final @javax.annotation.Nullable com.fhir.code relationship;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.id actionId;
  private final @javax.annotation.Nullable com.fhir.Range offsetRange;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableRequestGroup_RelatedAction(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Duration offsetDuration,
      @javax.annotation.Nullable com.fhir.code relationship,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.id actionId,
      @javax.annotation.Nullable com.fhir.Range offsetRange,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.extension = extension;
    this.offsetDuration = offsetDuration;
    this.relationship = relationship;
    this.id = id;
    this.actionId = actionId;
    this.offsetRange = offsetRange;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code offsetDuration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("offsetDuration")
  @Override
  public java.util.Optional<com.fhir.Duration> offsetDuration() {
    return java.util.Optional.ofNullable(offsetDuration);
  }

  /**
   * @return The value of the {@code relationship} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relationship")
  @Override
  public java.util.Optional<com.fhir.code> relationship() {
    return java.util.Optional.ofNullable(relationship);
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
   * @return The value of the {@code actionId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("actionId")
  @Override
  public java.util.Optional<com.fhir.id> actionId() {
    return java.util.Optional.ofNullable(actionId);
  }

  /**
   * @return The value of the {@code offsetRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("offsetRange")
  @Override
  public java.util.Optional<com.fhir.Range> offsetRange() {
    return java.util.Optional.ofNullable(offsetRange);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRequestGroup_RelatedAction(
        newValue,
        this.offsetDuration,
        this.relationship,
        this.id,
        this.actionId,
        this.offsetRange,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_RelatedAction withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRequestGroup_RelatedAction(
        value,
        this.offsetDuration,
        this.relationship,
        this.id,
        this.actionId,
        this.offsetRange,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#offsetDuration() offsetDuration} attribute.
   * @param value The value for offsetDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withOffsetDuration(com.fhir.Duration value) {
    @javax.annotation.Nullable com.fhir.Duration newValue = java.util.Objects.requireNonNull(value, "offsetDuration");
    if (this.offsetDuration == newValue) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.extension,
        newValue,
        this.relationship,
        this.id,
        this.actionId,
        this.offsetRange,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#offsetDuration() offsetDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for offsetDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_RelatedAction withOffsetDuration(java.util.Optional<? extends com.fhir.Duration> optional) {
    @javax.annotation.Nullable com.fhir.Duration value = optional.orElse(null);
    if (this.offsetDuration == value) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.extension,
        value,
        this.relationship,
        this.id,
        this.actionId,
        this.offsetRange,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#relationship() relationship} attribute.
   * @param value The value for relationship
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withRelationship(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "relationship");
    if (this.relationship == newValue) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.extension,
        this.offsetDuration,
        newValue,
        this.id,
        this.actionId,
        this.offsetRange,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#relationship() relationship} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationship
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_RelatedAction withRelationship(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.relationship == value) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.extension,
        this.offsetDuration,
        value,
        this.id,
        this.actionId,
        this.offsetRange,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.extension,
        this.offsetDuration,
        this.relationship,
        newValue,
        this.actionId,
        this.offsetRange,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.extension,
        this.offsetDuration,
        this.relationship,
        value,
        this.actionId,
        this.offsetRange,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#actionId() actionId} attribute.
   * @param value The value for actionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withActionId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "actionId");
    if (this.actionId == newValue) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.extension,
        this.offsetDuration,
        this.relationship,
        this.id,
        newValue,
        this.offsetRange,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#actionId() actionId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actionId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_RelatedAction withActionId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.actionId == value) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.extension,
        this.offsetDuration,
        this.relationship,
        this.id,
        value,
        this.offsetRange,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#offsetRange() offsetRange} attribute.
   * @param value The value for offsetRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withOffsetRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "offsetRange");
    if (this.offsetRange == newValue) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.extension,
        this.offsetDuration,
        this.relationship,
        this.id,
        this.actionId,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#offsetRange() offsetRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for offsetRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_RelatedAction withOffsetRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.offsetRange == value) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.extension,
        this.offsetDuration,
        this.relationship,
        this.id,
        this.actionId,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RequestGroup_RelatedAction#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestGroup_RelatedAction withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.extension,
        this.offsetDuration,
        this.relationship,
        this.id,
        this.actionId,
        this.offsetRange,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RequestGroup_RelatedAction#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRequestGroup_RelatedAction withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRequestGroup_RelatedAction(
        this.extension,
        this.offsetDuration,
        this.relationship,
        this.id,
        this.actionId,
        this.offsetRange,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRequestGroup_RelatedAction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRequestGroup_RelatedAction
        && equalTo((ImmutableRequestGroup_RelatedAction) another);
  }

  private boolean equalTo(ImmutableRequestGroup_RelatedAction another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(offsetDuration, another.offsetDuration)
        && java.util.Objects.equals(relationship, another.relationship)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(actionId, another.actionId)
        && java.util.Objects.equals(offsetRange, another.offsetRange)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code offsetDuration}, {@code relationship}, {@code id}, {@code actionId}, {@code offsetRange}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(offsetDuration);
    h += (h << 5) + java.util.Objects.hashCode(relationship);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(actionId);
    h += (h << 5) + java.util.Objects.hashCode(offsetRange);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code RequestGroup_RelatedAction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("RequestGroup_RelatedAction{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (offsetDuration != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("offsetDuration=").append(offsetDuration);
    }
    if (relationship != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("relationship=").append(relationship);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (actionId != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("actionId=").append(actionId);
    }
    if (offsetRange != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("offsetRange=").append(offsetRange);
    }
    if (modifierExtension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "RequestGroup_RelatedAction", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.RequestGroup_RelatedAction {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Duration> offsetDuration = java.util.Optional.empty();
    boolean offsetDurationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> relationship = java.util.Optional.empty();
    boolean relationshipIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> actionId = java.util.Optional.empty();
    boolean actionIdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> offsetRange = java.util.Optional.empty();
    boolean offsetRangeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("offsetDuration")
    public void setOffsetDuration(java.util.Optional<com.fhir.Duration> offsetDuration) {
      this.offsetDuration = offsetDuration;
      this.offsetDurationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relationship")
    public void setRelationship(java.util.Optional<com.fhir.code> relationship) {
      this.relationship = relationship;
      this.relationshipIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("actionId")
    public void setActionId(java.util.Optional<com.fhir.id> actionId) {
      this.actionId = actionId;
      this.actionIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("offsetRange")
    public void setOffsetRange(java.util.Optional<com.fhir.Range> offsetRange) {
      this.offsetRange = offsetRange;
      this.offsetRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Duration> offsetDuration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> relationship() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> actionId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> offsetRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableRequestGroup_RelatedAction fromJson(Json json) {
    ImmutableRequestGroup_RelatedAction.Builder builder = ImmutableRequestGroup_RelatedAction.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
    if (json.actionIdIsSet) {
      builder.actionId(json.actionId);
    }
    if (json.offsetRangeIsSet) {
      builder.offsetRange(json.offsetRange);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .extension(instance.extension())
        .offsetDuration(instance.offsetDuration())
        .relationship(instance.relationship())
        .id(instance.id())
        .actionId(instance.actionId())
        .offsetRange(instance.offsetRange())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link RequestGroup_RelatedAction RequestGroup_RelatedAction}.
   * <pre>
   * ImmutableRequestGroup_RelatedAction.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RequestGroup_RelatedAction#extension() extension}
   *    .offsetDuration(com.fhir.Duration) // optional {@link RequestGroup_RelatedAction#offsetDuration() offsetDuration}
   *    .relationship(com.fhir.code) // optional {@link RequestGroup_RelatedAction#relationship() relationship}
   *    .id(String) // optional {@link RequestGroup_RelatedAction#id() id}
   *    .actionId(com.fhir.id) // optional {@link RequestGroup_RelatedAction#actionId() actionId}
   *    .offsetRange(com.fhir.Range) // optional {@link RequestGroup_RelatedAction#offsetRange() offsetRange}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RequestGroup_RelatedAction#modifierExtension() modifierExtension}
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
  @org.immutables.value.Generated(from = "RequestGroup_RelatedAction", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_OFFSET_DURATION = 0x2L;
    private static final long OPT_BIT_RELATIONSHIP = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_ACTION_ID = 0x10L;
    private static final long OPT_BIT_OFFSET_RANGE = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Duration offsetDuration;
    private @javax.annotation.Nullable com.fhir.code relationship;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.id actionId;
    private @javax.annotation.Nullable com.fhir.Range offsetRange;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RequestGroup_RelatedAction#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#extension() extension} to extension.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#offsetDuration() offsetDuration} to offsetDuration.
     * @param offsetDuration The value for offsetDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder offsetDuration(com.fhir.Duration offsetDuration) {
      checkNotIsSet(offsetDurationIsSet(), "offsetDuration");
      this.offsetDuration = java.util.Objects.requireNonNull(offsetDuration, "offsetDuration");
      optBits |= OPT_BIT_OFFSET_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_RelatedAction#offsetDuration() offsetDuration} to offsetDuration.
     * @param offsetDuration The value for offsetDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offsetDuration")
    public final Builder offsetDuration(java.util.Optional<? extends com.fhir.Duration> offsetDuration) {
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
    public final Builder relationship(com.fhir.code relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = java.util.Objects.requireNonNull(relationship, "relationship");
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_RelatedAction#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relationship")
    public final Builder relationship(java.util.Optional<? extends com.fhir.code> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = relationship.orElse(null);
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_RelatedAction#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#id() id} to id.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#actionId() actionId} to actionId.
     * @param actionId The value for actionId
     * @return {@code this} builder for chained invocation
     */
    public final Builder actionId(com.fhir.id actionId) {
      checkNotIsSet(actionIdIsSet(), "actionId");
      this.actionId = java.util.Objects.requireNonNull(actionId, "actionId");
      optBits |= OPT_BIT_ACTION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_RelatedAction#actionId() actionId} to actionId.
     * @param actionId The value for actionId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actionId")
    public final Builder actionId(java.util.Optional<? extends com.fhir.id> actionId) {
      checkNotIsSet(actionIdIsSet(), "actionId");
      this.actionId = actionId.orElse(null);
      optBits |= OPT_BIT_ACTION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_RelatedAction#offsetRange() offsetRange} to offsetRange.
     * @param offsetRange The value for offsetRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder offsetRange(com.fhir.Range offsetRange) {
      checkNotIsSet(offsetRangeIsSet(), "offsetRange");
      this.offsetRange = java.util.Objects.requireNonNull(offsetRange, "offsetRange");
      optBits |= OPT_BIT_OFFSET_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_RelatedAction#offsetRange() offsetRange} to offsetRange.
     * @param offsetRange The value for offsetRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offsetRange")
    public final Builder offsetRange(java.util.Optional<? extends com.fhir.Range> offsetRange) {
      checkNotIsSet(offsetRangeIsSet(), "offsetRange");
      this.offsetRange = offsetRange.orElse(null);
      optBits |= OPT_BIT_OFFSET_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link RequestGroup_RelatedAction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RequestGroup_RelatedAction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link RequestGroup_RelatedAction RequestGroup_RelatedAction}.
     * @return An immutable instance of RequestGroup_RelatedAction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.RequestGroup_RelatedAction build() {
      return new ImmutableRequestGroup_RelatedAction(extension, offsetDuration, relationship, id, actionId, offsetRange, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
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

    private boolean actionIdIsSet() {
      return (optBits & OPT_BIT_ACTION_ID) != 0;
    }

    private boolean offsetRangeIsSet() {
      return (optBits & OPT_BIT_OFFSET_RANGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of RequestGroup_RelatedAction is strict, attribute is already set: ".concat(name));
    }
  }
}
