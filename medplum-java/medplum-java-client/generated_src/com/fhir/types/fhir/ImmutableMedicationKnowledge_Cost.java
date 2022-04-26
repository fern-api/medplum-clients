package com.fhir.types.fhir;

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
 * Immutable implementation of {@link MedicationKnowledge_Cost}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge_Cost.builder()}.
 */
@Generated(from = "MedicationKnowledge_Cost", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge_Cost implements MedicationKnowledge_Cost {
  private final @Nullable String id;
  private final @Nullable String source;
  private final Money cost;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final CodeableConcept type;

  private ImmutableMedicationKnowledge_Cost(
      @Nullable String id,
      @Nullable String source,
      Money cost,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      CodeableConcept type) {
    this.id = id;
    this.source = source;
    this.cost = cost;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.type = type;
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
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<String> source() {
    return Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code cost} attribute
   */
  @JsonProperty("cost")
  @Override
  public Money cost() {
    return cost;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Cost#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Cost withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationKnowledge_Cost(newValue, this.source, this.cost, this.extension, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Cost#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Cost withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationKnowledge_Cost(value, this.source, this.cost, this.extension, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Cost#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Cost withSource(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "source");
    if (Objects.equals(this.source, newValue)) return this;
    return new ImmutableMedicationKnowledge_Cost(this.id, newValue, this.cost, this.extension, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Cost#source() source} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Cost withSource(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.source, value)) return this;
    return new ImmutableMedicationKnowledge_Cost(this.id, value, this.cost, this.extension, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationKnowledge_Cost#cost() cost} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cost
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationKnowledge_Cost withCost(Money value) {
    if (this.cost == value) return this;
    Money newValue = Objects.requireNonNull(value, "cost");
    return new ImmutableMedicationKnowledge_Cost(this.id, this.source, newValue, this.extension, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Cost#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Cost withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge_Cost(this.id, this.source, this.cost, newValue, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Cost#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Cost withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge_Cost(this.id, this.source, this.cost, value, this.modifierExtension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Cost#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Cost withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge_Cost(this.id, this.source, this.cost, this.extension, newValue, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Cost#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Cost withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge_Cost(this.id, this.source, this.cost, this.extension, value, this.type);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationKnowledge_Cost#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationKnowledge_Cost withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableMedicationKnowledge_Cost(this.id, this.source, this.cost, this.extension, this.modifierExtension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge_Cost} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge_Cost
        && equalTo((ImmutableMedicationKnowledge_Cost) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge_Cost another) {
    return Objects.equals(id, another.id)
        && Objects.equals(source, another.source)
        && cost.equals(another.cost)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && type.equals(another.type);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code source}, {@code cost}, {@code extension}, {@code modifierExtension}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + cost.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + type.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge_Cost} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationKnowledge_Cost{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (source != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (builder.length() > 25) builder.append(", ");
    builder.append("cost=").append(cost);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationKnowledge_Cost", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationKnowledge_Cost {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Money cost;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable CodeableConcept type;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<String> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("cost")
    public void setCost(Money cost) {
      this.cost = cost;
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
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> source() { throw new UnsupportedOperationException(); }
    @Override
    public Money cost() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationKnowledge_Cost fromJson(Json json) {
    ImmutableMedicationKnowledge_Cost.Builder builder = ((ImmutableMedicationKnowledge_Cost.Builder) ImmutableMedicationKnowledge_Cost.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.cost != null) {
      builder.cost(json.cost);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    return (ImmutableMedicationKnowledge_Cost) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationKnowledge_Cost} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationKnowledge_Cost instance
   */
  public static MedicationKnowledge_Cost copyOf(MedicationKnowledge_Cost instance) {
    if (instance instanceof ImmutableMedicationKnowledge_Cost) {
      return (ImmutableMedicationKnowledge_Cost) instance;
    }
    return ((ImmutableMedicationKnowledge_Cost.Builder) ImmutableMedicationKnowledge_Cost.builder())
        .id(instance.id())
        .source(instance.source())
        .cost(instance.cost())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge_Cost MedicationKnowledge_Cost}.
   * <pre>
   * ImmutableMedicationKnowledge_Cost.builder()
   *    .id(String) // optional {@link MedicationKnowledge_Cost#id() id}
   *    .source(String) // optional {@link MedicationKnowledge_Cost#source() source}
   *    .cost(com.fhir.types.fhir.Money) // required {@link MedicationKnowledge_Cost#cost() cost}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Cost#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Cost#modifierExtension() modifierExtension}
   *    .type(com.fhir.types.fhir.CodeableConcept) // required {@link MedicationKnowledge_Cost#type() type}
   *    .build();
   * </pre>
   * @return A new MedicationKnowledge_Cost builder
   */
  public static CostBuildStage builder() {
    return new ImmutableMedicationKnowledge_Cost.Builder();
  }

  /**
   * Builds instances of type {@link MedicationKnowledge_Cost MedicationKnowledge_Cost}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationKnowledge_Cost", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CostBuildStage, TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_COST = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_SOURCE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable String id;
    private @Nullable String source;
    private @Nullable Money cost;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Cost#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Cost#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Cost#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(String source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Cost#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<String> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicationKnowledge_Cost#cost() cost} attribute.
     * @param cost The value for cost 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cost")
    public final Builder cost(Money cost) {
      checkNotIsSet(costIsSet(), "cost");
      this.cost = Objects.requireNonNull(cost, "cost");
      initBits &= ~INIT_BIT_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Cost#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_Cost#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_Cost#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_Cost#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link MedicationKnowledge_Cost#type() type} attribute.
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
     * Builds a new {@link MedicationKnowledge_Cost MedicationKnowledge_Cost}.
     * @return An immutable instance of MedicationKnowledge_Cost
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationKnowledge_Cost build() {
      checkRequiredAttributes();
      return new ImmutableMedicationKnowledge_Cost(id, source, cost, extension, modifierExtension, type);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean costIsSet() {
      return (initBits & INIT_BIT_COST) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationKnowledge_Cost is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!costIsSet()) attributes.add("cost");
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build MedicationKnowledge_Cost, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicationKnowledge_Cost", generator = "Immutables")
  public interface CostBuildStage {
    /**
     * Initializes the value for the {@link MedicationKnowledge_Cost#cost() cost} attribute.
     * @param cost The value for cost 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage cost(Money cost);
  }

  @Generated(from = "MedicationKnowledge_Cost", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link MedicationKnowledge_Cost#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "MedicationKnowledge_Cost", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationKnowledge_Cost#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Cost#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Cost#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(String source);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Cost#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(Optional<String> source);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Cost#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Cost#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Cost#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Cost#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link MedicationKnowledge_Cost MedicationKnowledge_Cost}.
     * @return An immutable instance of MedicationKnowledge_Cost
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationKnowledge_Cost build();
  }
}
