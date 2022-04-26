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
 * Immutable implementation of {@link CareTeam_Participant}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCareTeam_Participant.builder()}.
 */
@Generated(from = "CareTeam_Participant", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCareTeam_Participant implements CareTeam_Participant {
  private final @Nullable String id;
  private final @Nullable Reference member;
  private final @Nullable Period period;
  private final @Nullable List<CodeableConcept> role;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference onBehalfOf;

  private ImmutableCareTeam_Participant(
      @Nullable String id,
      @Nullable Reference member,
      @Nullable Period period,
      @Nullable List<CodeableConcept> role,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference onBehalfOf) {
    this.id = id;
    this.member = member;
    this.period = period;
    this.role = role;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.onBehalfOf = onBehalfOf;
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
   * @return The value of the {@code member} attribute
   */
  @JsonProperty("member")
  @Override
  public Optional<Reference> member() {
    return Optional.ofNullable(member);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public Optional<List<CodeableConcept>> role() {
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code onBehalfOf} attribute
   */
  @JsonProperty("onBehalfOf")
  @Override
  public Optional<Reference> onBehalfOf() {
    return Optional.ofNullable(onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam_Participant#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam_Participant withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCareTeam_Participant(
        newValue,
        this.member,
        this.period,
        this.role,
        this.extension,
        this.modifierExtension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam_Participant#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam_Participant withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCareTeam_Participant(
        value,
        this.member,
        this.period,
        this.role,
        this.extension,
        this.modifierExtension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam_Participant#member() member} attribute.
   * @param value The value for member
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam_Participant withMember(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "member");
    if (this.member == newValue) return this;
    return new ImmutableCareTeam_Participant(
        this.id,
        newValue,
        this.period,
        this.role,
        this.extension,
        this.modifierExtension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam_Participant#member() member} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for member
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam_Participant withMember(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.member == value) return this;
    return new ImmutableCareTeam_Participant(this.id, value, this.period, this.role, this.extension, this.modifierExtension, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam_Participant#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam_Participant withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableCareTeam_Participant(
        this.id,
        this.member,
        newValue,
        this.role,
        this.extension,
        this.modifierExtension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam_Participant#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam_Participant withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableCareTeam_Participant(this.id, this.member, value, this.role, this.extension, this.modifierExtension, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam_Participant#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam_Participant withRole(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableCareTeam_Participant(
        this.id,
        this.member,
        this.period,
        newValue,
        this.extension,
        this.modifierExtension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam_Participant#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam_Participant withRole(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableCareTeam_Participant(
        this.id,
        this.member,
        this.period,
        value,
        this.extension,
        this.modifierExtension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam_Participant#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam_Participant withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCareTeam_Participant(this.id, this.member, this.period, this.role, newValue, this.modifierExtension, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam_Participant#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam_Participant withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCareTeam_Participant(this.id, this.member, this.period, this.role, value, this.modifierExtension, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam_Participant#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam_Participant withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCareTeam_Participant(this.id, this.member, this.period, this.role, this.extension, newValue, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam_Participant#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam_Participant withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCareTeam_Participant(this.id, this.member, this.period, this.role, this.extension, value, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CareTeam_Participant#onBehalfOf() onBehalfOf} attribute.
   * @param value The value for onBehalfOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCareTeam_Participant withOnBehalfOf(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "onBehalfOf");
    if (this.onBehalfOf == newValue) return this;
    return new ImmutableCareTeam_Participant(this.id, this.member, this.period, this.role, this.extension, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CareTeam_Participant#onBehalfOf() onBehalfOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onBehalfOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCareTeam_Participant withOnBehalfOf(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.onBehalfOf == value) return this;
    return new ImmutableCareTeam_Participant(this.id, this.member, this.period, this.role, this.extension, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCareTeam_Participant} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCareTeam_Participant
        && equalTo((ImmutableCareTeam_Participant) another);
  }

  private boolean equalTo(ImmutableCareTeam_Participant another) {
    return Objects.equals(id, another.id)
        && Objects.equals(member, another.member)
        && Objects.equals(period, another.period)
        && Objects.equals(role, another.role)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(onBehalfOf, another.onBehalfOf);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code member}, {@code period}, {@code role}, {@code extension}, {@code modifierExtension}, {@code onBehalfOf}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(member);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(role);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(onBehalfOf);
    return h;
  }

  /**
   * Prints the immutable value {@code CareTeam_Participant} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CareTeam_Participant{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (member != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("member=").append(member);
    }
    if (period != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (role != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("role=").append(role);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (onBehalfOf != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("onBehalfOf=").append(onBehalfOf);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CareTeam_Participant", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CareTeam_Participant {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> member = Optional.empty();
    boolean memberIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<List<CodeableConcept>> role = Optional.empty();
    boolean roleIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> onBehalfOf = Optional.empty();
    boolean onBehalfOfIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("member")
    public void setMember(Optional<Reference> member) {
      this.member = member;
      this.memberIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("role")
    public void setRole(Optional<List<CodeableConcept>> role) {
      this.role = role;
      this.roleIsSet = true;
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
    @JsonProperty("onBehalfOf")
    public void setOnBehalfOf(Optional<Reference> onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      this.onBehalfOfIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> member() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> role() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> onBehalfOf() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCareTeam_Participant fromJson(Json json) {
    ImmutableCareTeam_Participant.Builder builder = ImmutableCareTeam_Participant.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.memberIsSet) {
      builder.member(json.member);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.onBehalfOfIsSet) {
      builder.onBehalfOf(json.onBehalfOf);
    }
    return (ImmutableCareTeam_Participant) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CareTeam_Participant} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CareTeam_Participant instance
   */
  public static CareTeam_Participant copyOf(CareTeam_Participant instance) {
    if (instance instanceof ImmutableCareTeam_Participant) {
      return (ImmutableCareTeam_Participant) instance;
    }
    return ImmutableCareTeam_Participant.builder()
        .id(instance.id())
        .member(instance.member())
        .period(instance.period())
        .role(instance.role())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .onBehalfOf(instance.onBehalfOf())
        .build();
  }

  /**
   * Creates a builder for {@link CareTeam_Participant CareTeam_Participant}.
   * <pre>
   * ImmutableCareTeam_Participant.builder()
   *    .id(String) // optional {@link CareTeam_Participant#id() id}
   *    .member(com.medplum.types.fhir.Reference) // optional {@link CareTeam_Participant#member() member}
   *    .period(com.medplum.types.fhir.Period) // optional {@link CareTeam_Participant#period() period}
   *    .role(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link CareTeam_Participant#role() role}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CareTeam_Participant#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CareTeam_Participant#modifierExtension() modifierExtension}
   *    .onBehalfOf(com.medplum.types.fhir.Reference) // optional {@link CareTeam_Participant#onBehalfOf() onBehalfOf}
   *    .build();
   * </pre>
   * @return A new CareTeam_Participant builder
   */
  public static ImmutableCareTeam_Participant.Builder builder() {
    return new ImmutableCareTeam_Participant.Builder();
  }

  /**
   * Builds instances of type {@link CareTeam_Participant CareTeam_Participant}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CareTeam_Participant", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MEMBER = 0x2L;
    private static final long OPT_BIT_PERIOD = 0x4L;
    private static final long OPT_BIT_ROLE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_ON_BEHALF_OF = 0x40L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Reference member;
    private @Nullable Period period;
    private @Nullable List<CodeableConcept> role;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference onBehalfOf;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CareTeam_Participant#id() id} to id.
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
     * Initializes the optional value {@link CareTeam_Participant#id() id} to id.
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
     * Initializes the optional value {@link CareTeam_Participant#member() member} to member.
     * @param member The value for member
     * @return {@code this} builder for chained invocation
     */
    public final Builder member(Reference member) {
      checkNotIsSet(memberIsSet(), "member");
      this.member = Objects.requireNonNull(member, "member");
      optBits |= OPT_BIT_MEMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam_Participant#member() member} to member.
     * @param member The value for member
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("member")
    public final Builder member(Optional<? extends Reference> member) {
      checkNotIsSet(memberIsSet(), "member");
      this.member = member.orElse(null);
      optBits |= OPT_BIT_MEMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam_Participant#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam_Participant#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam_Participant#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(List<CodeableConcept> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam_Participant#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(Optional<? extends List<CodeableConcept>> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam_Participant#extension() extension} to extension.
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
     * Initializes the optional value {@link CareTeam_Participant#extension() extension} to extension.
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
     * Initializes the optional value {@link CareTeam_Participant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CareTeam_Participant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CareTeam_Participant#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder onBehalfOf(Reference onBehalfOf) {
      checkNotIsSet(onBehalfOfIsSet(), "onBehalfOf");
      this.onBehalfOf = Objects.requireNonNull(onBehalfOf, "onBehalfOf");
      optBits |= OPT_BIT_ON_BEHALF_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link CareTeam_Participant#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onBehalfOf")
    public final Builder onBehalfOf(Optional<? extends Reference> onBehalfOf) {
      checkNotIsSet(onBehalfOfIsSet(), "onBehalfOf");
      this.onBehalfOf = onBehalfOf.orElse(null);
      optBits |= OPT_BIT_ON_BEHALF_OF;
      return this;
    }

    /**
     * Builds a new {@link CareTeam_Participant CareTeam_Participant}.
     * @return An immutable instance of CareTeam_Participant
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CareTeam_Participant build() {
      return new ImmutableCareTeam_Participant(id, member, period, role, extension, modifierExtension, onBehalfOf);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean memberIsSet() {
      return (optBits & OPT_BIT_MEMBER) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
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

    private boolean onBehalfOfIsSet() {
      return (optBits & OPT_BIT_ON_BEHALF_OF) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CareTeam_Participant is strict, attribute is already set: ".concat(name));
    }
  }
}
