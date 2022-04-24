//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link InsurancePlan_GeneralCost}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInsurancePlan_GeneralCost.builder()}.
 */
@org.immutables.value.Generated(from = "InsurancePlan_GeneralCost", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInsurancePlan_GeneralCost implements com.fhir.InsurancePlan_GeneralCost {
  private final @javax.annotation.Nullable com.fhir.positiveInt groupSize;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.lang.String comment;
  private final @javax.annotation.Nullable com.fhir.Money cost;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableInsurancePlan_GeneralCost(
      @javax.annotation.Nullable com.fhir.positiveInt groupSize,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.lang.String comment,
      @javax.annotation.Nullable com.fhir.Money cost,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.groupSize = groupSize;
    this.id = id;
    this.extension = extension;
    this.type = type;
    this.comment = comment;
    this.cost = cost;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code groupSize} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("groupSize")
  @Override
  public java.util.Optional<com.fhir.positiveInt> groupSize() {
    return java.util.Optional.ofNullable(groupSize);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comment")
  @Override
  public java.util.Optional<java.lang.String> comment() {
    return java.util.Optional.ofNullable(comment);
  }

  /**
   * @return The value of the {@code cost} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("cost")
  @Override
  public java.util.Optional<com.fhir.Money> cost() {
    return java.util.Optional.ofNullable(cost);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#groupSize() groupSize} attribute.
   * @param value The value for groupSize
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withGroupSize(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "groupSize");
    if (this.groupSize == newValue) return this;
    return new ImmutableInsurancePlan_GeneralCost(newValue, this.id, this.extension, this.type, this.comment, this.cost, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#groupSize() groupSize} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupSize
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_GeneralCost withGroupSize(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.groupSize == value) return this;
    return new ImmutableInsurancePlan_GeneralCost(value, this.id, this.extension, this.type, this.comment, this.cost, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableInsurancePlan_GeneralCost(
        this.groupSize,
        newValue,
        this.extension,
        this.type,
        this.comment,
        this.cost,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableInsurancePlan_GeneralCost(
        this.groupSize,
        value,
        this.extension,
        this.type,
        this.comment,
        this.cost,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.id, newValue, this.type, this.comment, this.cost, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_GeneralCost withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.id, value, this.type, this.comment, this.cost, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableInsurancePlan_GeneralCost(
        this.groupSize,
        this.id,
        this.extension,
        newValue,
        this.comment,
        this.cost,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_GeneralCost withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.id, this.extension, value, this.comment, this.cost, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withComment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "comment");
    if (java.util.Objects.equals(this.comment, newValue)) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.id, this.extension, this.type, newValue, this.cost, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withComment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.comment, value)) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.id, this.extension, this.type, value, this.cost, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#cost() cost} attribute.
   * @param value The value for cost
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withCost(com.fhir.Money value) {
    @javax.annotation.Nullable com.fhir.Money newValue = java.util.Objects.requireNonNull(value, "cost");
    if (this.cost == newValue) return this;
    return new ImmutableInsurancePlan_GeneralCost(
        this.groupSize,
        this.id,
        this.extension,
        this.type,
        this.comment,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#cost() cost} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cost
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_GeneralCost withCost(java.util.Optional<? extends com.fhir.Money> optional) {
    @javax.annotation.Nullable com.fhir.Money value = optional.orElse(null);
    if (this.cost == value) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.id, this.extension, this.type, this.comment, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.id, this.extension, this.type, this.comment, this.cost, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_GeneralCost withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.id, this.extension, this.type, this.comment, this.cost, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInsurancePlan_GeneralCost} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInsurancePlan_GeneralCost
        && equalTo((ImmutableInsurancePlan_GeneralCost) another);
  }

  private boolean equalTo(ImmutableInsurancePlan_GeneralCost another) {
    return java.util.Objects.equals(groupSize, another.groupSize)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(cost, another.cost)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code groupSize}, {@code id}, {@code extension}, {@code type}, {@code comment}, {@code cost}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(groupSize);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(cost);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code InsurancePlan_GeneralCost} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("InsurancePlan_GeneralCost{");
    if (groupSize != null) {
      builder.append("groupSize=").append(groupSize);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (comment != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (cost != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("cost=").append(cost);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "InsurancePlan_GeneralCost", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.InsurancePlan_GeneralCost {
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> groupSize = java.util.Optional.empty();
    boolean groupSizeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Money> cost = java.util.Optional.empty();
    boolean costIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("groupSize")
    public void setGroupSize(java.util.Optional<com.fhir.positiveInt> groupSize) {
      this.groupSize = groupSize;
      this.groupSizeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<java.lang.String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    public void setCost(java.util.Optional<com.fhir.Money> cost) {
      this.cost = cost;
      this.costIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.positiveInt> groupSize() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Money> cost() { throw new UnsupportedOperationException(); }
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
  static ImmutableInsurancePlan_GeneralCost fromJson(Json json) {
    ImmutableInsurancePlan_GeneralCost.Builder builder = ImmutableInsurancePlan_GeneralCost.builder();
    if (json.groupSizeIsSet) {
      builder.groupSize(json.groupSize);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.costIsSet) {
      builder.cost(json.cost);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableInsurancePlan_GeneralCost) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InsurancePlan_GeneralCost} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InsurancePlan_GeneralCost instance
   */
  public static InsurancePlan_GeneralCost copyOf(InsurancePlan_GeneralCost instance) {
    if (instance instanceof ImmutableInsurancePlan_GeneralCost) {
      return (ImmutableInsurancePlan_GeneralCost) instance;
    }
    return ImmutableInsurancePlan_GeneralCost.builder()
        .groupSize(instance.groupSize())
        .id(instance.id())
        .extension(instance.extension())
        .type(instance.type())
        .comment(instance.comment())
        .cost(instance.cost())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link InsurancePlan_GeneralCost InsurancePlan_GeneralCost}.
   * <pre>
   * ImmutableInsurancePlan_GeneralCost.builder()
   *    .groupSize(com.fhir.positiveInt) // optional {@link InsurancePlan_GeneralCost#groupSize() groupSize}
   *    .id(String) // optional {@link InsurancePlan_GeneralCost#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_GeneralCost#extension() extension}
   *    .type(com.fhir.CodeableConcept) // optional {@link InsurancePlan_GeneralCost#type() type}
   *    .comment(String) // optional {@link InsurancePlan_GeneralCost#comment() comment}
   *    .cost(com.fhir.Money) // optional {@link InsurancePlan_GeneralCost#cost() cost}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_GeneralCost#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new InsurancePlan_GeneralCost builder
   */
  public static ImmutableInsurancePlan_GeneralCost.Builder builder() {
    return new ImmutableInsurancePlan_GeneralCost.Builder();
  }

  /**
   * Builds instances of type {@link InsurancePlan_GeneralCost InsurancePlan_GeneralCost}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "InsurancePlan_GeneralCost", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_GROUP_SIZE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_COMMENT = 0x10L;
    private static final long OPT_BIT_COST = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.positiveInt groupSize;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.lang.String comment;
    private @javax.annotation.Nullable com.fhir.Money cost;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#groupSize() groupSize} to groupSize.
     * @param groupSize The value for groupSize
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupSize(com.fhir.positiveInt groupSize) {
      checkNotIsSet(groupSizeIsSet(), "groupSize");
      this.groupSize = java.util.Objects.requireNonNull(groupSize, "groupSize");
      optBits |= OPT_BIT_GROUP_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#groupSize() groupSize} to groupSize.
     * @param groupSize The value for groupSize
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupSize")
    public final Builder groupSize(java.util.Optional<? extends com.fhir.positiveInt> groupSize) {
      checkNotIsSet(groupSizeIsSet(), "groupSize");
      this.groupSize = groupSize.orElse(null);
      optBits |= OPT_BIT_GROUP_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_GeneralCost#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_GeneralCost#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_GeneralCost#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_GeneralCost#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(java.lang.String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = java.util.Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public final Builder comment(java.util.Optional<java.lang.String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for chained invocation
     */
    public final Builder cost(com.fhir.Money cost) {
      checkNotIsSet(costIsSet(), "cost");
      this.cost = java.util.Objects.requireNonNull(cost, "cost");
      optBits |= OPT_BIT_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    public final Builder cost(java.util.Optional<? extends com.fhir.Money> cost) {
      checkNotIsSet(costIsSet(), "cost");
      this.cost = cost.orElse(null);
      optBits |= OPT_BIT_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_GeneralCost#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link InsurancePlan_GeneralCost InsurancePlan_GeneralCost}.
     * @return An immutable instance of InsurancePlan_GeneralCost
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.InsurancePlan_GeneralCost build() {
      return new ImmutableInsurancePlan_GeneralCost(groupSize, id, extension, type, comment, cost, modifierExtension);
    }

    private boolean groupSizeIsSet() {
      return (optBits & OPT_BIT_GROUP_SIZE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean costIsSet() {
      return (optBits & OPT_BIT_COST) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of InsurancePlan_GeneralCost is strict, attribute is already set: ".concat(name));
    }
  }
}
