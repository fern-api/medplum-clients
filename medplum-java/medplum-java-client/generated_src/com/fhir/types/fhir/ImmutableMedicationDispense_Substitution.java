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
 * Immutable implementation of {@link MedicationDispense_Substitution}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationDispense_Substitution.builder()}.
 */
@Generated(from = "MedicationDispense_Substitution", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationDispense_Substitution
    implements MedicationDispense_Substitution {
  private final @Nullable List<Reference> responsibleParty;
  private final @Nullable List<CodeableConcept> reason;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean wasSubstituted;
  private final @Nullable CodeableConcept type;

  private ImmutableMedicationDispense_Substitution(
      @Nullable List<Reference> responsibleParty,
      @Nullable List<CodeableConcept> reason,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean wasSubstituted,
      @Nullable CodeableConcept type) {
    this.responsibleParty = responsibleParty;
    this.reason = reason;
    this.extension = extension;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.wasSubstituted = wasSubstituted;
    this.type = type;
  }

  /**
   * @return The value of the {@code responsibleParty} attribute
   */
  @JsonProperty("responsibleParty")
  @Override
  public Optional<List<Reference>> responsibleParty() {
    return Optional.ofNullable(responsibleParty);
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public Optional<List<CodeableConcept>> reason() {
    return Optional.ofNullable(reason);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code wasSubstituted} attribute
   */
  @JsonProperty("wasSubstituted")
  @Override
  public Optional<Boolean> wasSubstituted() {
    return Optional.ofNullable(wasSubstituted);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense_Substitution#responsibleParty() responsibleParty} attribute.
   * @param value The value for responsibleParty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense_Substitution withResponsibleParty(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "responsibleParty");
    if (this.responsibleParty == newValue) return this;
    return new ImmutableMedicationDispense_Substitution(
        newValue,
        this.reason,
        this.extension,
        this.id,
        this.modifierExtension,
        this.wasSubstituted,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense_Substitution#responsibleParty() responsibleParty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responsibleParty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense_Substitution withResponsibleParty(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.responsibleParty == value) return this;
    return new ImmutableMedicationDispense_Substitution(
        value,
        this.reason,
        this.extension,
        this.id,
        this.modifierExtension,
        this.wasSubstituted,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense_Substitution#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense_Substitution withReason(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableMedicationDispense_Substitution(
        this.responsibleParty,
        newValue,
        this.extension,
        this.id,
        this.modifierExtension,
        this.wasSubstituted,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense_Substitution#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense_Substitution withReason(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableMedicationDispense_Substitution(
        this.responsibleParty,
        value,
        this.extension,
        this.id,
        this.modifierExtension,
        this.wasSubstituted,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense_Substitution#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense_Substitution withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationDispense_Substitution(
        this.responsibleParty,
        this.reason,
        newValue,
        this.id,
        this.modifierExtension,
        this.wasSubstituted,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense_Substitution#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense_Substitution withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationDispense_Substitution(
        this.responsibleParty,
        this.reason,
        value,
        this.id,
        this.modifierExtension,
        this.wasSubstituted,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense_Substitution#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense_Substitution withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationDispense_Substitution(
        this.responsibleParty,
        this.reason,
        this.extension,
        newValue,
        this.modifierExtension,
        this.wasSubstituted,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense_Substitution#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense_Substitution withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationDispense_Substitution(
        this.responsibleParty,
        this.reason,
        this.extension,
        value,
        this.modifierExtension,
        this.wasSubstituted,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense_Substitution#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense_Substitution withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationDispense_Substitution(
        this.responsibleParty,
        this.reason,
        this.extension,
        this.id,
        newValue,
        this.wasSubstituted,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense_Substitution#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense_Substitution withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationDispense_Substitution(
        this.responsibleParty,
        this.reason,
        this.extension,
        this.id,
        value,
        this.wasSubstituted,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense_Substitution#wasSubstituted() wasSubstituted} attribute.
   * @param value The value for wasSubstituted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense_Substitution withWasSubstituted(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.wasSubstituted, newValue)) return this;
    return new ImmutableMedicationDispense_Substitution(
        this.responsibleParty,
        this.reason,
        this.extension,
        this.id,
        this.modifierExtension,
        newValue,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense_Substitution#wasSubstituted() wasSubstituted} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for wasSubstituted
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense_Substitution withWasSubstituted(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.wasSubstituted, value)) return this;
    return new ImmutableMedicationDispense_Substitution(
        this.responsibleParty,
        this.reason,
        this.extension,
        this.id,
        this.modifierExtension,
        value,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationDispense_Substitution#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationDispense_Substitution withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedicationDispense_Substitution(
        this.responsibleParty,
        this.reason,
        this.extension,
        this.id,
        this.modifierExtension,
        this.wasSubstituted,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationDispense_Substitution#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationDispense_Substitution withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedicationDispense_Substitution(
        this.responsibleParty,
        this.reason,
        this.extension,
        this.id,
        this.modifierExtension,
        this.wasSubstituted,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationDispense_Substitution} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationDispense_Substitution
        && equalTo((ImmutableMedicationDispense_Substitution) another);
  }

  private boolean equalTo(ImmutableMedicationDispense_Substitution another) {
    return Objects.equals(responsibleParty, another.responsibleParty)
        && Objects.equals(reason, another.reason)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(wasSubstituted, another.wasSubstituted)
        && Objects.equals(type, another.type);
  }

  /**
   * Computes a hash code from attributes: {@code responsibleParty}, {@code reason}, {@code extension}, {@code id}, {@code modifierExtension}, {@code wasSubstituted}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(responsibleParty);
    h += (h << 5) + Objects.hashCode(reason);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(wasSubstituted);
    h += (h << 5) + Objects.hashCode(type);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationDispense_Substitution} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationDispense_Substitution{");
    if (responsibleParty != null) {
      builder.append("responsibleParty=").append(responsibleParty);
    }
    if (reason != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (extension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (wasSubstituted != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("wasSubstituted=").append(wasSubstituted);
    }
    if (type != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("type=").append(type);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationDispense_Substitution", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationDispense_Substitution {
    @Nullable Optional<List<Reference>> responsibleParty = Optional.empty();
    boolean responsiblePartyIsSet;
    @Nullable Optional<List<CodeableConcept>> reason = Optional.empty();
    boolean reasonIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> wasSubstituted = Optional.empty();
    boolean wasSubstitutedIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @JsonProperty("responsibleParty")
    public void setResponsibleParty(Optional<List<Reference>> responsibleParty) {
      this.responsibleParty = responsibleParty;
      this.responsiblePartyIsSet = true;
    }
    @JsonProperty("reason")
    public void setReason(Optional<List<CodeableConcept>> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("wasSubstituted")
    public void setWasSubstituted(Optional<Boolean> wasSubstituted) {
      this.wasSubstituted = wasSubstituted;
      this.wasSubstitutedIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @Override
    public Optional<List<Reference>> responsibleParty() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> wasSubstituted() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationDispense_Substitution fromJson(Json json) {
    ImmutableMedicationDispense_Substitution.Builder builder = ImmutableMedicationDispense_Substitution.builder();
    if (json.responsiblePartyIsSet) {
      builder.responsibleParty(json.responsibleParty);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.wasSubstitutedIsSet) {
      builder.wasSubstituted(json.wasSubstituted);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    return (ImmutableMedicationDispense_Substitution) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationDispense_Substitution} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationDispense_Substitution instance
   */
  public static MedicationDispense_Substitution copyOf(MedicationDispense_Substitution instance) {
    if (instance instanceof ImmutableMedicationDispense_Substitution) {
      return (ImmutableMedicationDispense_Substitution) instance;
    }
    return ImmutableMedicationDispense_Substitution.builder()
        .responsibleParty(instance.responsibleParty())
        .reason(instance.reason())
        .extension(instance.extension())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .wasSubstituted(instance.wasSubstituted())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationDispense_Substitution MedicationDispense_Substitution}.
   * <pre>
   * ImmutableMedicationDispense_Substitution.builder()
   *    .responsibleParty(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicationDispense_Substitution#responsibleParty() responsibleParty}
   *    .reason(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicationDispense_Substitution#reason() reason}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationDispense_Substitution#extension() extension}
   *    .id(String) // optional {@link MedicationDispense_Substitution#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationDispense_Substitution#modifierExtension() modifierExtension}
   *    .wasSubstituted(Boolean) // optional {@link MedicationDispense_Substitution#wasSubstituted() wasSubstituted}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationDispense_Substitution#type() type}
   *    .build();
   * </pre>
   * @return A new MedicationDispense_Substitution builder
   */
  public static ImmutableMedicationDispense_Substitution.Builder builder() {
    return new ImmutableMedicationDispense_Substitution.Builder();
  }

  /**
   * Builds instances of type {@link MedicationDispense_Substitution MedicationDispense_Substitution}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationDispense_Substitution", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_RESPONSIBLE_PARTY = 0x1L;
    private static final long OPT_BIT_REASON = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_WAS_SUBSTITUTED = 0x20L;
    private static final long OPT_BIT_TYPE = 0x40L;
    private long optBits;

    private @Nullable List<Reference> responsibleParty;
    private @Nullable List<CodeableConcept> reason;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean wasSubstituted;
    private @Nullable CodeableConcept type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationDispense_Substitution#responsibleParty() responsibleParty} to responsibleParty.
     * @param responsibleParty The value for responsibleParty
     * @return {@code this} builder for chained invocation
     */
    public final Builder responsibleParty(List<Reference> responsibleParty) {
      checkNotIsSet(responsiblePartyIsSet(), "responsibleParty");
      this.responsibleParty = Objects.requireNonNull(responsibleParty, "responsibleParty");
      optBits |= OPT_BIT_RESPONSIBLE_PARTY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense_Substitution#responsibleParty() responsibleParty} to responsibleParty.
     * @param responsibleParty The value for responsibleParty
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("responsibleParty")
    public final Builder responsibleParty(Optional<? extends List<Reference>> responsibleParty) {
      checkNotIsSet(responsiblePartyIsSet(), "responsibleParty");
      this.responsibleParty = responsibleParty.orElse(null);
      optBits |= OPT_BIT_RESPONSIBLE_PARTY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense_Substitution#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(List<CodeableConcept> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense_Substitution#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(Optional<? extends List<CodeableConcept>> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense_Substitution#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationDispense_Substitution#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationDispense_Substitution#id() id} to id.
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
     * Initializes the optional value {@link MedicationDispense_Substitution#id() id} to id.
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
     * Initializes the optional value {@link MedicationDispense_Substitution#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationDispense_Substitution#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationDispense_Substitution#wasSubstituted() wasSubstituted} to wasSubstituted.
     * @param wasSubstituted The value for wasSubstituted
     * @return {@code this} builder for chained invocation
     */
    public final Builder wasSubstituted(boolean wasSubstituted) {
      checkNotIsSet(wasSubstitutedIsSet(), "wasSubstituted");
      this.wasSubstituted = wasSubstituted;
      optBits |= OPT_BIT_WAS_SUBSTITUTED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense_Substitution#wasSubstituted() wasSubstituted} to wasSubstituted.
     * @param wasSubstituted The value for wasSubstituted
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("wasSubstituted")
    public final Builder wasSubstituted(Optional<Boolean> wasSubstituted) {
      checkNotIsSet(wasSubstitutedIsSet(), "wasSubstituted");
      this.wasSubstituted = wasSubstituted.orElse(null);
      optBits |= OPT_BIT_WAS_SUBSTITUTED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationDispense_Substitution#type() type} to type.
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
     * Initializes the optional value {@link MedicationDispense_Substitution#type() type} to type.
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
     * Builds a new {@link MedicationDispense_Substitution MedicationDispense_Substitution}.
     * @return An immutable instance of MedicationDispense_Substitution
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationDispense_Substitution build() {
      return new ImmutableMedicationDispense_Substitution(responsibleParty, reason, extension, id, modifierExtension, wasSubstituted, type);
    }

    private boolean responsiblePartyIsSet() {
      return (optBits & OPT_BIT_RESPONSIBLE_PARTY) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
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

    private boolean wasSubstitutedIsSet() {
      return (optBits & OPT_BIT_WAS_SUBSTITUTED) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationDispense_Substitution is strict, attribute is already set: ".concat(name));
    }
  }
}
