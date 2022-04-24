//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link EpisodeOfCare_Diagnosis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEpisodeOfCare_Diagnosis.builder()}.
 */
@org.immutables.value.Generated(from = "EpisodeOfCare_Diagnosis", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEpisodeOfCare_Diagnosis implements com.fhir.EpisodeOfCare_Diagnosis {
  private final @javax.annotation.Nullable com.fhir.CodeableConcept role;
  private final @javax.annotation.Nullable com.fhir.positiveInt rank;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final com.fhir.Reference condition;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableEpisodeOfCare_Diagnosis(
      @javax.annotation.Nullable com.fhir.CodeableConcept role,
      @javax.annotation.Nullable com.fhir.positiveInt rank,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id,
      com.fhir.Reference condition,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.role = role;
    this.rank = rank;
    this.extension = extension;
    this.id = id;
    this.condition = condition;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("role")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> role() {
    return java.util.Optional.ofNullable(role);
  }

  /**
   * @return The value of the {@code rank} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("rank")
  @Override
  public java.util.Optional<com.fhir.positiveInt> rank() {
    return java.util.Optional.ofNullable(rank);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("condition")
  @Override
  public com.fhir.Reference condition() {
    return condition;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare_Diagnosis#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withRole(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(newValue, this.rank, this.extension, this.id, this.condition, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare_Diagnosis#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare_Diagnosis withRole(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(value, this.rank, this.extension, this.id, this.condition, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare_Diagnosis#rank() rank} attribute.
   * @param value The value for rank
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withRank(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "rank");
    if (this.rank == newValue) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.role, newValue, this.extension, this.id, this.condition, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare_Diagnosis#rank() rank} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rank
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare_Diagnosis withRank(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.rank == value) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.role, value, this.extension, this.id, this.condition, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare_Diagnosis#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.role, this.rank, newValue, this.id, this.condition, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare_Diagnosis#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare_Diagnosis withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.role, this.rank, value, this.id, this.condition, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare_Diagnosis#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.role, this.rank, this.extension, newValue, this.condition, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare_Diagnosis#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.role, this.rank, this.extension, value, this.condition, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EpisodeOfCare_Diagnosis#condition() condition} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for condition
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withCondition(com.fhir.Reference value) {
    if (this.condition == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "condition");
    return new ImmutableEpisodeOfCare_Diagnosis(this.role, this.rank, this.extension, this.id, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEpisodeOfCare_Diagnosis withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.role, this.rank, this.extension, this.id, this.condition, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEpisodeOfCare_Diagnosis withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEpisodeOfCare_Diagnosis(this.role, this.rank, this.extension, this.id, this.condition, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEpisodeOfCare_Diagnosis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEpisodeOfCare_Diagnosis
        && equalTo((ImmutableEpisodeOfCare_Diagnosis) another);
  }

  private boolean equalTo(ImmutableEpisodeOfCare_Diagnosis another) {
    return java.util.Objects.equals(role, another.role)
        && java.util.Objects.equals(rank, another.rank)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && condition.equals(another.condition)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code role}, {@code rank}, {@code extension}, {@code id}, {@code condition}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(role);
    h += (h << 5) + java.util.Objects.hashCode(rank);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + condition.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code EpisodeOfCare_Diagnosis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("EpisodeOfCare_Diagnosis{");
    if (role != null) {
      builder.append("role=").append(role);
    }
    if (rank != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("rank=").append(rank);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("condition=").append(condition);
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
  @org.immutables.value.Generated(from = "EpisodeOfCare_Diagnosis", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.EpisodeOfCare_Diagnosis {
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> role = java.util.Optional.empty();
    boolean roleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> rank = java.util.Optional.empty();
    boolean rankIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable com.fhir.Reference condition;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    public void setRole(java.util.Optional<com.fhir.CodeableConcept> role) {
      this.role = role;
      this.roleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("rank")
    public void setRank(java.util.Optional<com.fhir.positiveInt> rank) {
      this.rank = rank;
      this.rankIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public void setCondition(com.fhir.Reference condition) {
      this.condition = condition;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> role() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> rank() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference condition() { throw new UnsupportedOperationException(); }
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
  static ImmutableEpisodeOfCare_Diagnosis fromJson(Json json) {
    ImmutableEpisodeOfCare_Diagnosis.Builder builder = ((ImmutableEpisodeOfCare_Diagnosis.Builder) ImmutableEpisodeOfCare_Diagnosis.builder());
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.rankIsSet) {
      builder.rank(json.rank);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.condition != null) {
      builder.condition(json.condition);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .role(instance.role())
        .rank(instance.rank())
        .extension(instance.extension())
        .id(instance.id())
        .condition(instance.condition())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link EpisodeOfCare_Diagnosis EpisodeOfCare_Diagnosis}.
   * <pre>
   * ImmutableEpisodeOfCare_Diagnosis.builder()
   *    .role(com.fhir.CodeableConcept) // optional {@link EpisodeOfCare_Diagnosis#role() role}
   *    .rank(com.fhir.positiveInt) // optional {@link EpisodeOfCare_Diagnosis#rank() rank}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EpisodeOfCare_Diagnosis#extension() extension}
   *    .id(String) // optional {@link EpisodeOfCare_Diagnosis#id() id}
   *    .condition(com.fhir.Reference) // required {@link EpisodeOfCare_Diagnosis#condition() condition}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension}
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
  @org.immutables.value.Generated(from = "EpisodeOfCare_Diagnosis", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ConditionBuildStage, BuildFinal {
    private static final long INIT_BIT_CONDITION = 0x1L;
    private static final long OPT_BIT_ROLE = 0x1L;
    private static final long OPT_BIT_RANK = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept role;
    private @javax.annotation.Nullable com.fhir.positiveInt rank;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Reference condition;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(com.fhir.CodeableConcept role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = java.util.Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    public final Builder role(java.util.Optional<? extends com.fhir.CodeableConcept> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for chained invocation
     */
    public final Builder rank(com.fhir.positiveInt rank) {
      checkNotIsSet(rankIsSet(), "rank");
      this.rank = java.util.Objects.requireNonNull(rank, "rank");
      optBits |= OPT_BIT_RANK;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rank")
    public final Builder rank(java.util.Optional<? extends com.fhir.positiveInt> rank) {
      checkNotIsSet(rankIsSet(), "rank");
      this.rank = rank.orElse(null);
      optBits |= OPT_BIT_RANK;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#extension() extension} to extension.
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
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#extension() extension} to extension.
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
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#id() id} to id.
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
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#id() id} to id.
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
     * Initializes the value for the {@link EpisodeOfCare_Diagnosis#condition() condition} attribute.
     * @param condition The value for condition 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public final Builder condition(com.fhir.Reference condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = java.util.Objects.requireNonNull(condition, "condition");
      initBits &= ~INIT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link EpisodeOfCare_Diagnosis EpisodeOfCare_Diagnosis}.
     * @return An immutable instance of EpisodeOfCare_Diagnosis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.EpisodeOfCare_Diagnosis build() {
      checkRequiredAttributes();
      return new ImmutableEpisodeOfCare_Diagnosis(role, rank, extension, id, condition, modifierExtension);
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private boolean rankIsSet() {
      return (optBits & OPT_BIT_RANK) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean conditionIsSet() {
      return (initBits & INIT_BIT_CONDITION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of EpisodeOfCare_Diagnosis is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!conditionIsSet()) attributes.add("condition");
      return "Cannot build EpisodeOfCare_Diagnosis, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "EpisodeOfCare_Diagnosis", generator = "Immutables")
  public interface ConditionBuildStage {
    /**
     * Initializes the value for the {@link EpisodeOfCare_Diagnosis#condition() condition} attribute.
     * @param condition The value for condition 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal condition(com.fhir.Reference condition);
  }

  @org.immutables.value.Generated(from = "EpisodeOfCare_Diagnosis", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    BuildFinal role(com.fhir.CodeableConcept role);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal role(java.util.Optional<? extends com.fhir.CodeableConcept> role);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for chained invocation
     */
    BuildFinal rank(com.fhir.positiveInt rank);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal rank(java.util.Optional<? extends com.fhir.positiveInt> rank);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link EpisodeOfCare_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link EpisodeOfCare_Diagnosis EpisodeOfCare_Diagnosis}.
     * @return An immutable instance of EpisodeOfCare_Diagnosis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    EpisodeOfCare_Diagnosis build();
  }
}
