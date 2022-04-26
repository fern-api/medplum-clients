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
 * Immutable implementation of {@link EpisodeOfCare_Diagnosis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEpisodeOfCare_Diagnosis.builder()}.
 */
@Generated(from = "EpisodeOfCare_Diagnosis", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEpisodeOfCare_Diagnosis implements EpisodeOfCare_Diagnosis {
  private final @Nullable String id;
  private final @Nullable CodeableConcept role;
  private final @Nullable List<Extension> extension;
  private final Reference condition;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable PositiveInt rank;

  private ImmutableEpisodeOfCare_Diagnosis(
      @Nullable String id,
      @Nullable CodeableConcept role,
      @Nullable List<Extension> extension,
      Reference condition,
      @Nullable List<Extension> modifierExtension,
      @Nullable PositiveInt rank) {
    this.id = id;
    this.role = role;
    this.extension = extension;
    this.condition = condition;
    this.modifierExtension = modifierExtension;
    this.rank = rank;
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
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public Optional<CodeableConcept> role() {
    return Optional.ofNullable(role);
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
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public Reference condition() {
    return condition;
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
   * @return The value of the {@code rank} attribute
   */
  @JsonProperty("rank")
  @Override
  public Optional<PositiveInt> rank() {
    return Optional.ofNullable(rank);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare_Diagnosis#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(newValue, this.role, this.extension, this.condition, this.modifierExtension, this.rank);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare_Diagnosis#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(value, this.role, this.extension, this.condition, this.modifierExtension, this.rank);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare_Diagnosis#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withRole(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.id, newValue, this.extension, this.condition, this.modifierExtension, this.rank);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare_Diagnosis#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare_Diagnosis withRole(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.id, value, this.extension, this.condition, this.modifierExtension, this.rank);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare_Diagnosis#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.id, this.role, newValue, this.condition, this.modifierExtension, this.rank);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare_Diagnosis#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare_Diagnosis withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.id, this.role, value, this.condition, this.modifierExtension, this.rank);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EpisodeOfCare_Diagnosis#condition() condition} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for condition
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withCondition(Reference value) {
    if (this.condition == value) return this;
    Reference newValue = Objects.requireNonNull(value, "condition");
    return new ImmutableEpisodeOfCare_Diagnosis(this.id, this.role, this.extension, newValue, this.modifierExtension, this.rank);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.id, this.role, this.extension, this.condition, newValue, this.rank);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare_Diagnosis withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.id, this.role, this.extension, this.condition, value, this.rank);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare_Diagnosis#rank() rank} attribute.
   * @param value The value for rank
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withRank(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "rank");
    if (this.rank == newValue) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.id, this.role, this.extension, this.condition, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare_Diagnosis#rank() rank} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rank
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare_Diagnosis withRank(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.rank == value) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.id, this.role, this.extension, this.condition, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEpisodeOfCare_Diagnosis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEpisodeOfCare_Diagnosis
        && equalTo((ImmutableEpisodeOfCare_Diagnosis) another);
  }

  private boolean equalTo(ImmutableEpisodeOfCare_Diagnosis another) {
    return Objects.equals(id, another.id)
        && Objects.equals(role, another.role)
        && Objects.equals(extension, another.extension)
        && condition.equals(another.condition)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(rank, another.rank);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code role}, {@code extension}, {@code condition}, {@code modifierExtension}, {@code rank}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(role);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + condition.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(rank);
    return h;
  }

  /**
   * Prints the immutable value {@code EpisodeOfCare_Diagnosis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EpisodeOfCare_Diagnosis{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (role != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("role=").append(role);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("condition=").append(condition);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (rank != null) {
      builder.append(", ");
      builder.append("rank=").append(rank);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "EpisodeOfCare_Diagnosis", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements EpisodeOfCare_Diagnosis {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> role = Optional.empty();
    boolean roleIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Reference condition;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<PositiveInt> rank = Optional.empty();
    boolean rankIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("role")
    public void setRole(Optional<CodeableConcept> role) {
      this.role = role;
      this.roleIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Reference condition) {
      this.condition = condition;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("rank")
    public void setRank(Optional<PositiveInt> rank) {
      this.rank = rank;
      this.rankIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> role() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference condition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> rank() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEpisodeOfCare_Diagnosis fromJson(Json json) {
    ImmutableEpisodeOfCare_Diagnosis.Builder builder = ((ImmutableEpisodeOfCare_Diagnosis.Builder) ImmutableEpisodeOfCare_Diagnosis.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.condition != null) {
      builder.condition(json.condition);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.rankIsSet) {
      builder.rank(json.rank);
    }
    return (ImmutableEpisodeOfCare_Diagnosis) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EpisodeOfCare_Diagnosis} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EpisodeOfCare_Diagnosis instance
   */
  public static EpisodeOfCare_Diagnosis copyOf(EpisodeOfCare_Diagnosis instance) {
    if (instance instanceof ImmutableEpisodeOfCare_Diagnosis) {
      return (ImmutableEpisodeOfCare_Diagnosis) instance;
    }
    return ((ImmutableEpisodeOfCare_Diagnosis.Builder) ImmutableEpisodeOfCare_Diagnosis.builder())
        .id(instance.id())
        .role(instance.role())
        .extension(instance.extension())
        .condition(instance.condition())
        .modifierExtension(instance.modifierExtension())
        .rank(instance.rank())
        .build();
  }

  /**
   * Creates a builder for {@link EpisodeOfCare_Diagnosis EpisodeOfCare_Diagnosis}.
   * <pre>
   * ImmutableEpisodeOfCare_Diagnosis.builder()
   *    .id(String) // optional {@link EpisodeOfCare_Diagnosis#id() id}
   *    .role(com.medplum.types.fhir.CodeableConcept) // optional {@link EpisodeOfCare_Diagnosis#role() role}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link EpisodeOfCare_Diagnosis#extension() extension}
   *    .condition(com.medplum.types.fhir.Reference) // required {@link EpisodeOfCare_Diagnosis#condition() condition}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension}
   *    .rank(com.medplum.types.fhir.PositiveInt) // optional {@link EpisodeOfCare_Diagnosis#rank() rank}
   *    .build();
   * </pre>
   * @return A new EpisodeOfCare_Diagnosis builder
   */
  public static ConditionBuildStage builder() {
    return new ImmutableEpisodeOfCare_Diagnosis.Builder();
  }

  /**
   * Builds instances of type {@link EpisodeOfCare_Diagnosis EpisodeOfCare_Diagnosis}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EpisodeOfCare_Diagnosis", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ConditionBuildStage, BuildFinal {
    private static final long INIT_BIT_CONDITION = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_ROLE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_RANK = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable CodeableConcept role;
    private @Nullable List<Extension> extension;
    private @Nullable Reference condition;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable PositiveInt rank;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#id() id} to id.
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
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#id() id} to id.
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
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(CodeableConcept role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(Optional<? extends CodeableConcept> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#extension() extension} to extension.
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
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#extension() extension} to extension.
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
     * Initializes the value for the {@link EpisodeOfCare_Diagnosis#condition() condition} attribute.
     * @param condition The value for condition 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("condition")
    public final Builder condition(Reference condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = Objects.requireNonNull(condition, "condition");
      initBits &= ~INIT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for chained invocation
     */
    public final Builder rank(PositiveInt rank) {
      checkNotIsSet(rankIsSet(), "rank");
      this.rank = Objects.requireNonNull(rank, "rank");
      optBits |= OPT_BIT_RANK;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rank")
    public final Builder rank(Optional<? extends PositiveInt> rank) {
      checkNotIsSet(rankIsSet(), "rank");
      this.rank = rank.orElse(null);
      optBits |= OPT_BIT_RANK;
      return this;
    }

    /**
     * Builds a new {@link EpisodeOfCare_Diagnosis EpisodeOfCare_Diagnosis}.
     * @return An immutable instance of EpisodeOfCare_Diagnosis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public EpisodeOfCare_Diagnosis build() {
      checkRequiredAttributes();
      return new ImmutableEpisodeOfCare_Diagnosis(id, role, extension, condition, modifierExtension, rank);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean rankIsSet() {
      return (optBits & OPT_BIT_RANK) != 0;
    }

    private boolean conditionIsSet() {
      return (initBits & INIT_BIT_CONDITION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of EpisodeOfCare_Diagnosis is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!conditionIsSet()) attributes.add("condition");
      return "Cannot build EpisodeOfCare_Diagnosis, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "EpisodeOfCare_Diagnosis", generator = "Immutables")
  public interface ConditionBuildStage {
    /**
     * Initializes the value for the {@link EpisodeOfCare_Diagnosis#condition() condition} attribute.
     * @param condition The value for condition 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal condition(Reference condition);
  }

  @Generated(from = "EpisodeOfCare_Diagnosis", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    BuildFinal role(CodeableConcept role);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal role(Optional<? extends CodeableConcept> role);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for chained invocation
     */
    BuildFinal rank(PositiveInt rank);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal rank(Optional<? extends PositiveInt> rank);

    /**
     * Builds a new {@link EpisodeOfCare_Diagnosis EpisodeOfCare_Diagnosis}.
     * @return An immutable instance of EpisodeOfCare_Diagnosis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    EpisodeOfCare_Diagnosis build();
  }
}
