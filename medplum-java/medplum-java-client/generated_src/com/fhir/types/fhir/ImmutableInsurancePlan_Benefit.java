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
 * Immutable implementation of {@link InsurancePlan_Benefit}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInsurancePlan_Benefit.builder()}.
 */
@Generated(from = "InsurancePlan_Benefit", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInsurancePlan_Benefit implements InsurancePlan_Benefit {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<InsurancePlan_Limit> limit;
  private final @Nullable String requirement;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final CodeableConcept type;

  private ImmutableInsurancePlan_Benefit(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<InsurancePlan_Limit> limit,
      @Nullable String requirement,
      @Nullable String id,
      @Nullable List<Extension> extension,
      CodeableConcept type) {
    this.modifierExtension = modifierExtension;
    this.limit = limit;
    this.requirement = requirement;
    this.id = id;
    this.extension = extension;
    this.type = type;
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
   * @return The value of the {@code limit} attribute
   */
  @JsonProperty("limit")
  @Override
  public Optional<List<InsurancePlan_Limit>> limit() {
    return Optional.ofNullable(limit);
  }

  /**
   * @return The value of the {@code requirement} attribute
   */
  @JsonProperty("requirement")
  @Override
  public Optional<String> requirement() {
    return Optional.ofNullable(requirement);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Benefit#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInsurancePlan_Benefit(newValue, this.limit, this.requirement, this.id, this.extension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Benefit#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Benefit withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInsurancePlan_Benefit(value, this.limit, this.requirement, this.id, this.extension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Benefit#limit() limit} attribute.
   * @param value The value for limit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit withLimit(List<InsurancePlan_Limit> value) {
    @Nullable List<InsurancePlan_Limit> newValue = Objects.requireNonNull(value, "limit");
    if (this.limit == newValue) return this;
    return new ImmutableInsurancePlan_Benefit(this.modifierExtension, newValue, this.requirement, this.id, this.extension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Benefit#limit() limit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for limit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Benefit withLimit(Optional<? extends List<InsurancePlan_Limit>> optional) {
    @Nullable List<InsurancePlan_Limit> value = optional.orElse(null);
    if (this.limit == value) return this;
    return new ImmutableInsurancePlan_Benefit(this.modifierExtension, value, this.requirement, this.id, this.extension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Benefit#requirement() requirement} attribute.
   * @param value The value for requirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit withRequirement(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "requirement");
    if (Objects.equals(this.requirement, newValue)) return this;
    return new ImmutableInsurancePlan_Benefit(this.modifierExtension, this.limit, newValue, this.id, this.extension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Benefit#requirement() requirement} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit withRequirement(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.requirement, value)) return this;
    return new ImmutableInsurancePlan_Benefit(this.modifierExtension, this.limit, value, this.id, this.extension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Benefit#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableInsurancePlan_Benefit(this.modifierExtension, this.limit, this.requirement, newValue, this.extension, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Benefit#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableInsurancePlan_Benefit(this.modifierExtension, this.limit, this.requirement, value, this.extension, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Benefit#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInsurancePlan_Benefit(this.modifierExtension, this.limit, this.requirement, this.id, newValue, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Benefit#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Benefit withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInsurancePlan_Benefit(this.modifierExtension, this.limit, this.requirement, this.id, value, this.type);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InsurancePlan_Benefit#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInsurancePlan_Benefit withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableInsurancePlan_Benefit(this.modifierExtension, this.limit, this.requirement, this.id, this.extension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInsurancePlan_Benefit} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInsurancePlan_Benefit
        && equalTo((ImmutableInsurancePlan_Benefit) another);
  }

  private boolean equalTo(ImmutableInsurancePlan_Benefit another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(limit, another.limit)
        && Objects.equals(requirement, another.requirement)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && type.equals(another.type);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code limit}, {@code requirement}, {@code id}, {@code extension}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(limit);
    h += (h << 5) + Objects.hashCode(requirement);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + type.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code InsurancePlan_Benefit} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("InsurancePlan_Benefit{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (limit != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("limit=").append(limit);
    }
    if (requirement != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("requirement=").append(requirement);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("type=").append(type);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "InsurancePlan_Benefit", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements InsurancePlan_Benefit {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<InsurancePlan_Limit>> limit = Optional.empty();
    boolean limitIsSet;
    @Nullable Optional<String> requirement = Optional.empty();
    boolean requirementIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable CodeableConcept type;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("limit")
    public void setLimit(Optional<List<InsurancePlan_Limit>> limit) {
      this.limit = limit;
      this.limitIsSet = true;
    }
    @JsonProperty("requirement")
    public void setRequirement(Optional<String> requirement) {
      this.requirement = requirement;
      this.requirementIsSet = true;
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
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<InsurancePlan_Limit>> limit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> requirement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableInsurancePlan_Benefit fromJson(Json json) {
    ImmutableInsurancePlan_Benefit.Builder builder = ((ImmutableInsurancePlan_Benefit.Builder) ImmutableInsurancePlan_Benefit.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.limitIsSet) {
      builder.limit(json.limit);
    }
    if (json.requirementIsSet) {
      builder.requirement(json.requirement);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    return (ImmutableInsurancePlan_Benefit) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InsurancePlan_Benefit} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InsurancePlan_Benefit instance
   */
  public static InsurancePlan_Benefit copyOf(InsurancePlan_Benefit instance) {
    if (instance instanceof ImmutableInsurancePlan_Benefit) {
      return (ImmutableInsurancePlan_Benefit) instance;
    }
    return ((ImmutableInsurancePlan_Benefit.Builder) ImmutableInsurancePlan_Benefit.builder())
        .modifierExtension(instance.modifierExtension())
        .limit(instance.limit())
        .requirement(instance.requirement())
        .id(instance.id())
        .extension(instance.extension())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link InsurancePlan_Benefit InsurancePlan_Benefit}.
   * <pre>
   * ImmutableInsurancePlan_Benefit.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_Benefit#modifierExtension() modifierExtension}
   *    .limit(List&amp;lt;com.fhir.types.fhir.InsurancePlan_Limit&amp;gt;) // optional {@link InsurancePlan_Benefit#limit() limit}
   *    .requirement(String) // optional {@link InsurancePlan_Benefit#requirement() requirement}
   *    .id(String) // optional {@link InsurancePlan_Benefit#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_Benefit#extension() extension}
   *    .type(com.fhir.types.fhir.CodeableConcept) // required {@link InsurancePlan_Benefit#type() type}
   *    .build();
   * </pre>
   * @return A new InsurancePlan_Benefit builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableInsurancePlan_Benefit.Builder();
  }

  /**
   * Builds instances of type {@link InsurancePlan_Benefit InsurancePlan_Benefit}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "InsurancePlan_Benefit", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_LIMIT = 0x2L;
    private static final long OPT_BIT_REQUIREMENT = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<InsurancePlan_Limit> limit;
    private @Nullable String requirement;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_Benefit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_Benefit#limit() limit} to limit.
     * @param limit The value for limit
     * @return {@code this} builder for chained invocation
     */
    public final Builder limit(List<InsurancePlan_Limit> limit) {
      checkNotIsSet(limitIsSet(), "limit");
      this.limit = Objects.requireNonNull(limit, "limit");
      optBits |= OPT_BIT_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#limit() limit} to limit.
     * @param limit The value for limit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("limit")
    public final Builder limit(Optional<? extends List<InsurancePlan_Limit>> limit) {
      checkNotIsSet(limitIsSet(), "limit");
      this.limit = limit.orElse(null);
      optBits |= OPT_BIT_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#requirement() requirement} to requirement.
     * @param requirement The value for requirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder requirement(String requirement) {
      checkNotIsSet(requirementIsSet(), "requirement");
      this.requirement = Objects.requireNonNull(requirement, "requirement");
      optBits |= OPT_BIT_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#requirement() requirement} to requirement.
     * @param requirement The value for requirement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requirement")
    public final Builder requirement(Optional<String> requirement) {
      checkNotIsSet(requirementIsSet(), "requirement");
      this.requirement = requirement.orElse(null);
      optBits |= OPT_BIT_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_Benefit#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_Benefit#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_Benefit#extension() extension} to extension.
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
     * Initializes the value for the {@link InsurancePlan_Benefit#type() type} attribute.
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
     * Builds a new {@link InsurancePlan_Benefit InsurancePlan_Benefit}.
     * @return An immutable instance of InsurancePlan_Benefit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public InsurancePlan_Benefit build() {
      checkRequiredAttributes();
      return new ImmutableInsurancePlan_Benefit(modifierExtension, limit, requirement, id, extension, type);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean limitIsSet() {
      return (optBits & OPT_BIT_LIMIT) != 0;
    }

    private boolean requirementIsSet() {
      return (optBits & OPT_BIT_REQUIREMENT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of InsurancePlan_Benefit is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build InsurancePlan_Benefit, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "InsurancePlan_Benefit", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link InsurancePlan_Benefit#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "InsurancePlan_Benefit", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#limit() limit} to limit.
     * @param limit The value for limit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal limit(List<InsurancePlan_Limit> limit);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#limit() limit} to limit.
     * @param limit The value for limit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal limit(Optional<? extends List<InsurancePlan_Limit>> limit);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#requirement() requirement} to requirement.
     * @param requirement The value for requirement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requirement(String requirement);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#requirement() requirement} to requirement.
     * @param requirement The value for requirement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requirement(Optional<String> requirement);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link InsurancePlan_Benefit#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link InsurancePlan_Benefit InsurancePlan_Benefit}.
     * @return An immutable instance of InsurancePlan_Benefit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    InsurancePlan_Benefit build();
  }
}
