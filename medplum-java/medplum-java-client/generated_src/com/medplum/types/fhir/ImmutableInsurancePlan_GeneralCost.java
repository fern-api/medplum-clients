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
 * Immutable implementation of {@link InsurancePlan_GeneralCost}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInsurancePlan_GeneralCost.builder()}.
 */
@Generated(from = "InsurancePlan_GeneralCost", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInsurancePlan_GeneralCost
    implements InsurancePlan_GeneralCost {
  private final @Nullable PositiveInt groupSize;
  private final @Nullable CodeableConcept type;
  private final @Nullable Money cost;
  private final @Nullable String comment;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableInsurancePlan_GeneralCost(
      @Nullable PositiveInt groupSize,
      @Nullable CodeableConcept type,
      @Nullable Money cost,
      @Nullable String comment,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension) {
    this.groupSize = groupSize;
    this.type = type;
    this.cost = cost;
    this.comment = comment;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code groupSize} attribute
   */
  @JsonProperty("groupSize")
  @Override
  public Optional<PositiveInt> groupSize() {
    return Optional.ofNullable(groupSize);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code cost} attribute
   */
  @JsonProperty("cost")
  @Override
  public Optional<Money> cost() {
    return Optional.ofNullable(cost);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<String> comment() {
    return Optional.ofNullable(comment);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#groupSize() groupSize} attribute.
   * @param value The value for groupSize
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withGroupSize(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "groupSize");
    if (this.groupSize == newValue) return this;
    return new ImmutableInsurancePlan_GeneralCost(newValue, this.type, this.cost, this.comment, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#groupSize() groupSize} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupSize
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_GeneralCost withGroupSize(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.groupSize == value) return this;
    return new ImmutableInsurancePlan_GeneralCost(value, this.type, this.cost, this.comment, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableInsurancePlan_GeneralCost(
        this.groupSize,
        newValue,
        this.cost,
        this.comment,
        this.id,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_GeneralCost withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, value, this.cost, this.comment, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#cost() cost} attribute.
   * @param value The value for cost
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withCost(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "cost");
    if (this.cost == newValue) return this;
    return new ImmutableInsurancePlan_GeneralCost(
        this.groupSize,
        this.type,
        newValue,
        this.comment,
        this.id,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#cost() cost} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cost
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_GeneralCost withCost(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.cost == value) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.type, value, this.comment, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.type, this.cost, newValue, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.type, this.cost, value, this.id, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableInsurancePlan_GeneralCost(
        this.groupSize,
        this.type,
        this.cost,
        this.comment,
        newValue,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableInsurancePlan_GeneralCost(
        this.groupSize,
        this.type,
        this.cost,
        this.comment,
        value,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.type, this.cost, this.comment, this.id, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_GeneralCost withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.type, this.cost, this.comment, this.id, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_GeneralCost#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_GeneralCost withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.type, this.cost, this.comment, this.id, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_GeneralCost#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_GeneralCost withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInsurancePlan_GeneralCost(this.groupSize, this.type, this.cost, this.comment, this.id, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInsurancePlan_GeneralCost} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInsurancePlan_GeneralCost
        && equalTo((ImmutableInsurancePlan_GeneralCost) another);
  }

  private boolean equalTo(ImmutableInsurancePlan_GeneralCost another) {
    return Objects.equals(groupSize, another.groupSize)
        && Objects.equals(type, another.type)
        && Objects.equals(cost, another.cost)
        && Objects.equals(comment, another.comment)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code groupSize}, {@code type}, {@code cost}, {@code comment}, {@code id}, {@code extension}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(groupSize);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(cost);
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code InsurancePlan_GeneralCost} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("InsurancePlan_GeneralCost{");
    if (groupSize != null) {
      builder.append("groupSize=").append(groupSize);
    }
    if (type != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (cost != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("cost=").append(cost);
    }
    if (comment != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
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
  @Generated(from = "InsurancePlan_GeneralCost", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements InsurancePlan_GeneralCost {
    @Nullable Optional<PositiveInt> groupSize = Optional.empty();
    boolean groupSizeIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Money> cost = Optional.empty();
    boolean costIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("groupSize")
    public void setGroupSize(Optional<PositiveInt> groupSize) {
      this.groupSize = groupSize;
      this.groupSizeIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("cost")
    public void setCost(Optional<Money> cost) {
      this.cost = cost;
      this.costIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
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
    @Override
    public Optional<PositiveInt> groupSize() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> cost() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableInsurancePlan_GeneralCost fromJson(Json json) {
    ImmutableInsurancePlan_GeneralCost.Builder builder = ImmutableInsurancePlan_GeneralCost.builder();
    if (json.groupSizeIsSet) {
      builder.groupSize(json.groupSize);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.costIsSet) {
      builder.cost(json.cost);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
        .type(instance.type())
        .cost(instance.cost())
        .comment(instance.comment())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link InsurancePlan_GeneralCost InsurancePlan_GeneralCost}.
   * <pre>
   * ImmutableInsurancePlan_GeneralCost.builder()
   *    .groupSize(com.medplum.types.fhir.PositiveInt) // optional {@link InsurancePlan_GeneralCost#groupSize() groupSize}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link InsurancePlan_GeneralCost#type() type}
   *    .cost(com.medplum.types.fhir.Money) // optional {@link InsurancePlan_GeneralCost#cost() cost}
   *    .comment(String) // optional {@link InsurancePlan_GeneralCost#comment() comment}
   *    .id(String) // optional {@link InsurancePlan_GeneralCost#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_GeneralCost#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_GeneralCost#modifierExtension() modifierExtension}
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
  @Generated(from = "InsurancePlan_GeneralCost", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_GROUP_SIZE = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_COST = 0x4L;
    private static final long OPT_BIT_COMMENT = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable PositiveInt groupSize;
    private @Nullable CodeableConcept type;
    private @Nullable Money cost;
    private @Nullable String comment;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#groupSize() groupSize} to groupSize.
     * @param groupSize The value for groupSize
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupSize(PositiveInt groupSize) {
      checkNotIsSet(groupSizeIsSet(), "groupSize");
      this.groupSize = Objects.requireNonNull(groupSize, "groupSize");
      optBits |= OPT_BIT_GROUP_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#groupSize() groupSize} to groupSize.
     * @param groupSize The value for groupSize
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("groupSize")
    public final Builder groupSize(Optional<? extends PositiveInt> groupSize) {
      checkNotIsSet(groupSizeIsSet(), "groupSize");
      this.groupSize = groupSize.orElse(null);
      optBits |= OPT_BIT_GROUP_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for chained invocation
     */
    public final Builder cost(Money cost) {
      checkNotIsSet(costIsSet(), "cost");
      this.cost = Objects.requireNonNull(cost, "cost");
      optBits |= OPT_BIT_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cost")
    public final Builder cost(Optional<? extends Money> cost) {
      checkNotIsSet(costIsSet(), "cost");
      this.cost = cost.orElse(null);
      optBits |= OPT_BIT_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_GeneralCost#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_GeneralCost#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_GeneralCost#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_GeneralCost#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_GeneralCost#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_GeneralCost#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link InsurancePlan_GeneralCost InsurancePlan_GeneralCost}.
     * @return An immutable instance of InsurancePlan_GeneralCost
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public InsurancePlan_GeneralCost build() {
      return new ImmutableInsurancePlan_GeneralCost(groupSize, type, cost, comment, id, extension, modifierExtension);
    }

    private boolean groupSizeIsSet() {
      return (optBits & OPT_BIT_GROUP_SIZE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean costIsSet() {
      return (optBits & OPT_BIT_COST) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of InsurancePlan_GeneralCost is strict, attribute is already set: ".concat(name));
    }
  }
}
