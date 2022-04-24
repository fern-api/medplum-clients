package com.fhir;

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
 * Immutable implementation of {@link InsurancePlan_Benefit1}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInsurancePlan_Benefit1.builder()}.
 */
@Generated(from = "InsurancePlan_Benefit1", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInsurancePlan_Benefit1 implements InsurancePlan_Benefit1 {
  private final CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable List<InsurancePlan_Cost> cost;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableInsurancePlan_Benefit1(
      CodeableConcept type,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable List<InsurancePlan_Cost> cost,
      @Nullable List<Extension> modifierExtension) {
    this.type = type;
    this.extension = extension;
    this.id = id;
    this.cost = cost;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code cost} attribute
   */
  @JsonProperty("cost")
  @Override
  public Optional<List<InsurancePlan_Cost>> cost() {
    return Optional.ofNullable(cost);
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
   * Copy the current immutable object by setting a value for the {@link InsurancePlan_Benefit1#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit1 withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableInsurancePlan_Benefit1(newValue, this.extension, this.id, this.cost, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Benefit1#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit1 withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInsurancePlan_Benefit1(this.type, newValue, this.id, this.cost, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Benefit1#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Benefit1 withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInsurancePlan_Benefit1(this.type, value, this.id, this.cost, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Benefit1#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit1 withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableInsurancePlan_Benefit1(this.type, this.extension, newValue, this.cost, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Benefit1#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit1 withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableInsurancePlan_Benefit1(this.type, this.extension, value, this.cost, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Benefit1#cost() cost} attribute.
   * @param value The value for cost
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit1 withCost(List<InsurancePlan_Cost> value) {
    @Nullable List<InsurancePlan_Cost> newValue = Objects.requireNonNull(value, "cost");
    if (this.cost == newValue) return this;
    return new ImmutableInsurancePlan_Benefit1(this.type, this.extension, this.id, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Benefit1#cost() cost} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cost
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Benefit1 withCost(Optional<? extends List<InsurancePlan_Cost>> optional) {
    @Nullable List<InsurancePlan_Cost> value = optional.orElse(null);
    if (this.cost == value) return this;
    return new ImmutableInsurancePlan_Benefit1(this.type, this.extension, this.id, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Benefit1#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit1 withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInsurancePlan_Benefit1(this.type, this.extension, this.id, this.cost, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Benefit1#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Benefit1 withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInsurancePlan_Benefit1(this.type, this.extension, this.id, this.cost, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInsurancePlan_Benefit1} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInsurancePlan_Benefit1
        && equalTo((ImmutableInsurancePlan_Benefit1) another);
  }

  private boolean equalTo(ImmutableInsurancePlan_Benefit1 another) {
    return type.equals(another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(cost, another.cost)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code extension}, {@code id}, {@code cost}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(cost);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code InsurancePlan_Benefit1} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("InsurancePlan_Benefit1{");
    builder.append("type=").append(type);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (cost != null) {
      builder.append(", ");
      builder.append("cost=").append(cost);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "InsurancePlan_Benefit1", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements InsurancePlan_Benefit1 {
    @Nullable CodeableConcept type;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<InsurancePlan_Cost>> cost = Optional.empty();
    boolean costIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("cost")
    public void setCost(Optional<List<InsurancePlan_Cost>> cost) {
      this.cost = cost;
      this.costIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<InsurancePlan_Cost>> cost() { throw new UnsupportedOperationException(); }
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
  static ImmutableInsurancePlan_Benefit1 fromJson(Json json) {
    ImmutableInsurancePlan_Benefit1.Builder builder = ((ImmutableInsurancePlan_Benefit1.Builder) ImmutableInsurancePlan_Benefit1.builder());
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.costIsSet) {
      builder.cost(json.cost);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableInsurancePlan_Benefit1) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InsurancePlan_Benefit1} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InsurancePlan_Benefit1 instance
   */
  public static InsurancePlan_Benefit1 copyOf(InsurancePlan_Benefit1 instance) {
    if (instance instanceof ImmutableInsurancePlan_Benefit1) {
      return (ImmutableInsurancePlan_Benefit1) instance;
    }
    return ((ImmutableInsurancePlan_Benefit1.Builder) ImmutableInsurancePlan_Benefit1.builder())
        .type(instance.type())
        .extension(instance.extension())
        .id(instance.id())
        .cost(instance.cost())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link InsurancePlan_Benefit1 InsurancePlan_Benefit1}.
   * <pre>
   * ImmutableInsurancePlan_Benefit1.builder()
   *    .type(com.fhir.CodeableConcept) // required {@link InsurancePlan_Benefit1#type() type}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_Benefit1#extension() extension}
   *    .id(String) // optional {@link InsurancePlan_Benefit1#id() id}
   *    .cost(List&amp;lt;com.fhir.InsurancePlan_Cost&amp;gt;) // optional {@link InsurancePlan_Benefit1#cost() cost}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_Benefit1#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new InsurancePlan_Benefit1 builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableInsurancePlan_Benefit1.Builder();
  }

  /**
   * Builds instances of type {@link InsurancePlan_Benefit1 InsurancePlan_Benefit1}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "InsurancePlan_Benefit1", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_COST = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable List<InsurancePlan_Cost> cost;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link InsurancePlan_Benefit1#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit1#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_Benefit1#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_Benefit1#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_Benefit1#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_Benefit1#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for chained invocation
     */
    public final Builder cost(List<InsurancePlan_Cost> cost) {
      checkNotIsSet(costIsSet(), "cost");
      this.cost = Objects.requireNonNull(cost, "cost");
      optBits |= OPT_BIT_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit1#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cost")
    public final Builder cost(Optional<? extends List<InsurancePlan_Cost>> cost) {
      checkNotIsSet(costIsSet(), "cost");
      this.cost = cost.orElse(null);
      optBits |= OPT_BIT_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_Benefit1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link InsurancePlan_Benefit1 InsurancePlan_Benefit1}.
     * @return An immutable instance of InsurancePlan_Benefit1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public InsurancePlan_Benefit1 build() {
      checkRequiredAttributes();
      return new ImmutableInsurancePlan_Benefit1(type, extension, id, cost, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean costIsSet() {
      return (optBits & OPT_BIT_COST) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of InsurancePlan_Benefit1 is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build InsurancePlan_Benefit1, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "InsurancePlan_Benefit1", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link InsurancePlan_Benefit1#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "InsurancePlan_Benefit1", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit1#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit1#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit1#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit1#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit1#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for chained invocation
     */
    BuildFinal cost(List<InsurancePlan_Cost> cost);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit1#cost() cost} to cost.
     * @param cost The value for cost
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal cost(Optional<? extends List<InsurancePlan_Cost>> cost);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit1#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit1#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link InsurancePlan_Benefit1 InsurancePlan_Benefit1}.
     * @return An immutable instance of InsurancePlan_Benefit1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    InsurancePlan_Benefit1 build();
  }
}
