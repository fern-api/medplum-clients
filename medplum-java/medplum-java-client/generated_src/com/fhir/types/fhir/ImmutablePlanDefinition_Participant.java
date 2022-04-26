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
 * Immutable implementation of {@link PlanDefinition_Participant}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePlanDefinition_Participant.builder()}.
 */
@Generated(from = "PlanDefinition_Participant", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePlanDefinition_Participant
    implements PlanDefinition_Participant {
  private final @Nullable CodeableConcept role;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Plandefinition_ParticipantType type;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;

  private ImmutablePlanDefinition_Participant(
      @Nullable CodeableConcept role,
      @Nullable List<Extension> modifierExtension,
      @Nullable Plandefinition_ParticipantType type,
      @Nullable String id,
      @Nullable List<Extension> extension) {
    this.role = role;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.id = id;
    this.extension = extension;
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
  public Optional<Plandefinition_ParticipantType> type() {
    return Optional.ofNullable(type);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Participant#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Participant withRole(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutablePlanDefinition_Participant(newValue, this.modifierExtension, this.type, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Participant#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Participant withRole(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutablePlanDefinition_Participant(value, this.modifierExtension, this.type, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Participant#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Participant withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePlanDefinition_Participant(this.role, newValue, this.type, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Participant#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Participant withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePlanDefinition_Participant(this.role, value, this.type, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Participant#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Participant withType(Plandefinition_ParticipantType value) {
    @Nullable Plandefinition_ParticipantType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutablePlanDefinition_Participant(this.role, this.modifierExtension, newValue, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Participant#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Participant withType(Optional<? extends Plandefinition_ParticipantType> optional) {
    @Nullable Plandefinition_ParticipantType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutablePlanDefinition_Participant(this.role, this.modifierExtension, value, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Participant#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Participant withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePlanDefinition_Participant(this.role, this.modifierExtension, this.type, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Participant#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Participant withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePlanDefinition_Participant(this.role, this.modifierExtension, this.type, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Participant#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Participant withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePlanDefinition_Participant(this.role, this.modifierExtension, this.type, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Participant#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Participant withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePlanDefinition_Participant(this.role, this.modifierExtension, this.type, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePlanDefinition_Participant} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePlanDefinition_Participant
        && equalTo((ImmutablePlanDefinition_Participant) another);
  }

  private boolean equalTo(ImmutablePlanDefinition_Participant another) {
    return Objects.equals(role, another.role)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(type, another.type)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code role}, {@code modifierExtension}, {@code type}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(role);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code PlanDefinition_Participant} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PlanDefinition_Participant{");
    if (role != null) {
      builder.append("role=").append(role);
    }
    if (modifierExtension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
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
  @Generated(from = "PlanDefinition_Participant", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PlanDefinition_Participant {
    @Nullable Optional<CodeableConcept> role = Optional.empty();
    boolean roleIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Plandefinition_ParticipantType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("role")
    public void setRole(Optional<CodeableConcept> role) {
      this.role = role;
      this.roleIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Plandefinition_ParticipantType> type) {
      this.type = type;
      this.typeIsSet = true;
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
    @Override
    public Optional<CodeableConcept> role() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Plandefinition_ParticipantType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
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
  static ImmutablePlanDefinition_Participant fromJson(Json json) {
    ImmutablePlanDefinition_Participant.Builder builder = ImmutablePlanDefinition_Participant.builder();
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutablePlanDefinition_Participant) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PlanDefinition_Participant} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PlanDefinition_Participant instance
   */
  public static PlanDefinition_Participant copyOf(PlanDefinition_Participant instance) {
    if (instance instanceof ImmutablePlanDefinition_Participant) {
      return (ImmutablePlanDefinition_Participant) instance;
    }
    return ImmutablePlanDefinition_Participant.builder()
        .role(instance.role())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link PlanDefinition_Participant PlanDefinition_Participant}.
   * <pre>
   * ImmutablePlanDefinition_Participant.builder()
   *    .role(com.fhir.types.fhir.CodeableConcept) // optional {@link PlanDefinition_Participant#role() role}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_Participant#modifierExtension() modifierExtension}
   *    .type(Plandefinition_ParticipantType) // optional {@link PlanDefinition_Participant#type() type}
   *    .id(String) // optional {@link PlanDefinition_Participant#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_Participant#extension() extension}
   *    .build();
   * </pre>
   * @return A new PlanDefinition_Participant builder
   */
  public static ImmutablePlanDefinition_Participant.Builder builder() {
    return new ImmutablePlanDefinition_Participant.Builder();
  }

  /**
   * Builds instances of type {@link PlanDefinition_Participant PlanDefinition_Participant}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PlanDefinition_Participant", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ROLE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable CodeableConcept role;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Plandefinition_ParticipantType type;
    private @Nullable String id;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Participant#role() role} to role.
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
     * Initializes the optional value {@link PlanDefinition_Participant#role() role} to role.
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
     * Initializes the optional value {@link PlanDefinition_Participant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_Participant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_Participant#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Plandefinition_ParticipantType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Participant#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Plandefinition_ParticipantType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Participant#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition_Participant#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition_Participant#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition_Participant#extension() extension} to extension.
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
     * Builds a new {@link PlanDefinition_Participant PlanDefinition_Participant}.
     * @return An immutable instance of PlanDefinition_Participant
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PlanDefinition_Participant build() {
      return new ImmutablePlanDefinition_Participant(role, modifierExtension, type, id, extension);
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PlanDefinition_Participant is strict, attribute is already set: ".concat(name));
    }
  }
}
