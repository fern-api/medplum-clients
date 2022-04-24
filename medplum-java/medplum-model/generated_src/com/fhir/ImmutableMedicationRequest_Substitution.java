package com.fhir;

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
 * Immutable implementation of {@link MedicationRequest_Substitution}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationRequest_Substitution.builder()}.
 */
@Generated(from = "MedicationRequest_Substitution", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationRequest_Substitution implements MedicationRequest_Substitution {
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept reason;
  private final @Nullable String id;
  private final @Nullable Boolean allowedBoolean;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept allowedCodeableConcept;

  private ImmutableMedicationRequest_Substitution(
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept reason,
      @Nullable String id,
      @Nullable Boolean allowedBoolean,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept allowedCodeableConcept) {
    this.extension = extension;
    this.reason = reason;
    this.id = id;
    this.allowedBoolean = allowedBoolean;
    this.modifierExtension = modifierExtension;
    this.allowedCodeableConcept = allowedCodeableConcept;
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
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public Optional<CodeableConcept> reason() {
    return Optional.ofNullable(reason);
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
   * @return The value of the {@code allowedBoolean} attribute
   */
  @JsonProperty("allowedBoolean")
  @Override
  public Optional<Boolean> allowedBoolean() {
    return Optional.ofNullable(allowedBoolean);
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
   * @return The value of the {@code allowedCodeableConcept} attribute
   */
  @JsonProperty("allowedCodeableConcept")
  @Override
  public Optional<CodeableConcept> allowedCodeableConcept() {
    return Optional.ofNullable(allowedCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_Substitution#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_Substitution withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationRequest_Substitution(
        newValue,
        this.reason,
        this.id,
        this.allowedBoolean,
        this.modifierExtension,
        this.allowedCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_Substitution#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_Substitution withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationRequest_Substitution(
        value,
        this.reason,
        this.id,
        this.allowedBoolean,
        this.modifierExtension,
        this.allowedCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_Substitution#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_Substitution withReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableMedicationRequest_Substitution(
        this.extension,
        newValue,
        this.id,
        this.allowedBoolean,
        this.modifierExtension,
        this.allowedCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_Substitution#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_Substitution withReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableMedicationRequest_Substitution(
        this.extension,
        value,
        this.id,
        this.allowedBoolean,
        this.modifierExtension,
        this.allowedCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_Substitution#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_Substitution withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationRequest_Substitution(
        this.extension,
        this.reason,
        newValue,
        this.allowedBoolean,
        this.modifierExtension,
        this.allowedCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_Substitution#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_Substitution withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationRequest_Substitution(
        this.extension,
        this.reason,
        value,
        this.allowedBoolean,
        this.modifierExtension,
        this.allowedCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_Substitution#allowedBoolean() allowedBoolean} attribute.
   * @param value The value for allowedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_Substitution withAllowedBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.allowedBoolean, newValue)) return this;
    return new ImmutableMedicationRequest_Substitution(
        this.extension,
        this.reason,
        this.id,
        newValue,
        this.modifierExtension,
        this.allowedCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_Substitution#allowedBoolean() allowedBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allowedBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_Substitution withAllowedBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.allowedBoolean, value)) return this;
    return new ImmutableMedicationRequest_Substitution(
        this.extension,
        this.reason,
        this.id,
        value,
        this.modifierExtension,
        this.allowedCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_Substitution#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_Substitution withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationRequest_Substitution(
        this.extension,
        this.reason,
        this.id,
        this.allowedBoolean,
        newValue,
        this.allowedCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_Substitution#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_Substitution withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationRequest_Substitution(this.extension, this.reason, this.id, this.allowedBoolean, value, this.allowedCodeableConcept);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_Substitution#allowedCodeableConcept() allowedCodeableConcept} attribute.
   * @param value The value for allowedCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_Substitution withAllowedCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "allowedCodeableConcept");
    if (this.allowedCodeableConcept == newValue) return this;
    return new ImmutableMedicationRequest_Substitution(this.extension, this.reason, this.id, this.allowedBoolean, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_Substitution#allowedCodeableConcept() allowedCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allowedCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_Substitution withAllowedCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.allowedCodeableConcept == value) return this;
    return new ImmutableMedicationRequest_Substitution(this.extension, this.reason, this.id, this.allowedBoolean, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationRequest_Substitution} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationRequest_Substitution
        && equalTo((ImmutableMedicationRequest_Substitution) another);
  }

  private boolean equalTo(ImmutableMedicationRequest_Substitution another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(reason, another.reason)
        && Objects.equals(id, another.id)
        && Objects.equals(allowedBoolean, another.allowedBoolean)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(allowedCodeableConcept, another.allowedCodeableConcept);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code reason}, {@code id}, {@code allowedBoolean}, {@code modifierExtension}, {@code allowedCodeableConcept}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(reason);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(allowedBoolean);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(allowedCodeableConcept);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationRequest_Substitution} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationRequest_Substitution{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (reason != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (allowedBoolean != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("allowedBoolean=").append(allowedBoolean);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (allowedCodeableConcept != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("allowedCodeableConcept=").append(allowedCodeableConcept);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationRequest_Substitution", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationRequest_Substitution {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> reason = Optional.empty();
    boolean reasonIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Boolean> allowedBoolean = Optional.empty();
    boolean allowedBooleanIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> allowedCodeableConcept = Optional.empty();
    boolean allowedCodeableConceptIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("reason")
    public void setReason(Optional<CodeableConcept> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("allowedBoolean")
    public void setAllowedBoolean(Optional<Boolean> allowedBoolean) {
      this.allowedBoolean = allowedBoolean;
      this.allowedBooleanIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("allowedCodeableConcept")
    public void setAllowedCodeableConcept(Optional<CodeableConcept> allowedCodeableConcept) {
      this.allowedCodeableConcept = allowedCodeableConcept;
      this.allowedCodeableConceptIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> reason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> allowedBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> allowedCodeableConcept() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationRequest_Substitution fromJson(Json json) {
    ImmutableMedicationRequest_Substitution.Builder builder = ImmutableMedicationRequest_Substitution.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.allowedBooleanIsSet) {
      builder.allowedBoolean(json.allowedBoolean);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.allowedCodeableConceptIsSet) {
      builder.allowedCodeableConcept(json.allowedCodeableConcept);
    }
    return (ImmutableMedicationRequest_Substitution) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationRequest_Substitution} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationRequest_Substitution instance
   */
  public static MedicationRequest_Substitution copyOf(MedicationRequest_Substitution instance) {
    if (instance instanceof ImmutableMedicationRequest_Substitution) {
      return (ImmutableMedicationRequest_Substitution) instance;
    }
    return ImmutableMedicationRequest_Substitution.builder()
        .extension(instance.extension())
        .reason(instance.reason())
        .id(instance.id())
        .allowedBoolean(instance.allowedBoolean())
        .modifierExtension(instance.modifierExtension())
        .allowedCodeableConcept(instance.allowedCodeableConcept())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationRequest_Substitution MedicationRequest_Substitution}.
   * <pre>
   * ImmutableMedicationRequest_Substitution.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationRequest_Substitution#extension() extension}
   *    .reason(com.fhir.CodeableConcept) // optional {@link MedicationRequest_Substitution#reason() reason}
   *    .id(String) // optional {@link MedicationRequest_Substitution#id() id}
   *    .allowedBoolean(Boolean) // optional {@link MedicationRequest_Substitution#allowedBoolean() allowedBoolean}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationRequest_Substitution#modifierExtension() modifierExtension}
   *    .allowedCodeableConcept(com.fhir.CodeableConcept) // optional {@link MedicationRequest_Substitution#allowedCodeableConcept() allowedCodeableConcept}
   *    .build();
   * </pre>
   * @return A new MedicationRequest_Substitution builder
   */
  public static ImmutableMedicationRequest_Substitution.Builder builder() {
    return new ImmutableMedicationRequest_Substitution.Builder();
  }

  /**
   * Builds instances of type {@link MedicationRequest_Substitution MedicationRequest_Substitution}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationRequest_Substitution", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_REASON = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_ALLOWED_BOOLEAN = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_ALLOWED_CODEABLE_CONCEPT = 0x20L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept reason;
    private @Nullable String id;
    private @Nullable Boolean allowedBoolean;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept allowedCodeableConcept;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationRequest_Substitution#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationRequest_Substitution#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationRequest_Substitution#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(CodeableConcept reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_Substitution#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(Optional<? extends CodeableConcept> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_Substitution#id() id} to id.
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
     * Initializes the optional value {@link MedicationRequest_Substitution#id() id} to id.
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
     * Initializes the optional value {@link MedicationRequest_Substitution#allowedBoolean() allowedBoolean} to allowedBoolean.
     * @param allowedBoolean The value for allowedBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder allowedBoolean(boolean allowedBoolean) {
      checkNotIsSet(allowedBooleanIsSet(), "allowedBoolean");
      this.allowedBoolean = allowedBoolean;
      optBits |= OPT_BIT_ALLOWED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_Substitution#allowedBoolean() allowedBoolean} to allowedBoolean.
     * @param allowedBoolean The value for allowedBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("allowedBoolean")
    public final Builder allowedBoolean(Optional<Boolean> allowedBoolean) {
      checkNotIsSet(allowedBooleanIsSet(), "allowedBoolean");
      this.allowedBoolean = allowedBoolean.orElse(null);
      optBits |= OPT_BIT_ALLOWED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_Substitution#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationRequest_Substitution#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationRequest_Substitution#allowedCodeableConcept() allowedCodeableConcept} to allowedCodeableConcept.
     * @param allowedCodeableConcept The value for allowedCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder allowedCodeableConcept(CodeableConcept allowedCodeableConcept) {
      checkNotIsSet(allowedCodeableConceptIsSet(), "allowedCodeableConcept");
      this.allowedCodeableConcept = Objects.requireNonNull(allowedCodeableConcept, "allowedCodeableConcept");
      optBits |= OPT_BIT_ALLOWED_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_Substitution#allowedCodeableConcept() allowedCodeableConcept} to allowedCodeableConcept.
     * @param allowedCodeableConcept The value for allowedCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("allowedCodeableConcept")
    public final Builder allowedCodeableConcept(Optional<? extends CodeableConcept> allowedCodeableConcept) {
      checkNotIsSet(allowedCodeableConceptIsSet(), "allowedCodeableConcept");
      this.allowedCodeableConcept = allowedCodeableConcept.orElse(null);
      optBits |= OPT_BIT_ALLOWED_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Builds a new {@link MedicationRequest_Substitution MedicationRequest_Substitution}.
     * @return An immutable instance of MedicationRequest_Substitution
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationRequest_Substitution build() {
      return new ImmutableMedicationRequest_Substitution(extension, reason, id, allowedBoolean, modifierExtension, allowedCodeableConcept);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean allowedBooleanIsSet() {
      return (optBits & OPT_BIT_ALLOWED_BOOLEAN) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean allowedCodeableConceptIsSet() {
      return (optBits & OPT_BIT_ALLOWED_CODEABLE_CONCEPT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationRequest_Substitution is strict, attribute is already set: ".concat(name));
    }
  }
}
