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
 * Immutable implementation of {@link CoverageEligibilityRequest_SupportingInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverageEligibilityRequest_SupportingInfo.builder()}.
 */
@Generated(from = "CoverageEligibilityRequest_SupportingInfo", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverageEligibilityRequest_SupportingInfo
    implements CoverageEligibilityRequest_SupportingInfo {
  private final @Nullable List<Extension> extension;
  private final Reference information;
  private final @Nullable Boolean appliesToAll;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable PositiveInt sequence;
  private final @Nullable String id;

  private ImmutableCoverageEligibilityRequest_SupportingInfo(
      @Nullable List<Extension> extension,
      Reference information,
      @Nullable Boolean appliesToAll,
      @Nullable List<Extension> modifierExtension,
      @Nullable PositiveInt sequence,
      @Nullable String id) {
    this.extension = extension;
    this.information = information;
    this.appliesToAll = appliesToAll;
    this.modifierExtension = modifierExtension;
    this.sequence = sequence;
    this.id = id;
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
   * @return The value of the {@code information} attribute
   */
  @JsonProperty("information")
  @Override
  public Reference information() {
    return information;
  }

  /**
   * @return The value of the {@code appliesToAll} attribute
   */
  @JsonProperty("appliesToAll")
  @Override
  public Optional<Boolean> appliesToAll() {
    return Optional.ofNullable(appliesToAll);
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
   * @return The value of the {@code sequence} attribute
   */
  @JsonProperty("sequence")
  @Override
  public Optional<PositiveInt> sequence() {
    return Optional.ofNullable(sequence);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_SupportingInfo#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(newValue, this.information, this.appliesToAll, this.modifierExtension, this.sequence, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_SupportingInfo#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(value, this.information, this.appliesToAll, this.modifierExtension, this.sequence, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CoverageEligibilityRequest_SupportingInfo#information() information} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for information
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withInformation(Reference value) {
    if (this.information == value) return this;
    Reference newValue = Objects.requireNonNull(value, "information");
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, newValue, this.appliesToAll, this.modifierExtension, this.sequence, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll} attribute.
   * @param value The value for appliesToAll
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withAppliesToAll(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.appliesToAll, newValue)) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.information, newValue, this.modifierExtension, this.sequence, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for appliesToAll
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withAppliesToAll(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.appliesToAll, value)) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.information, value, this.modifierExtension, this.sequence, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.information, this.appliesToAll, newValue, this.sequence, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.information, this.appliesToAll, value, this.sequence, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.information, this.appliesToAll, this.modifierExtension, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(this.extension, this.information, this.appliesToAll, this.modifierExtension, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CoverageEligibilityRequest_SupportingInfo#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(
        this.extension,
        this.information,
        this.appliesToAll,
        this.modifierExtension,
        this.sequence,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CoverageEligibilityRequest_SupportingInfo#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverageEligibilityRequest_SupportingInfo withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCoverageEligibilityRequest_SupportingInfo(
        this.extension,
        this.information,
        this.appliesToAll,
        this.modifierExtension,
        this.sequence,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverageEligibilityRequest_SupportingInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverageEligibilityRequest_SupportingInfo
        && equalTo((ImmutableCoverageEligibilityRequest_SupportingInfo) another);
  }

  private boolean equalTo(ImmutableCoverageEligibilityRequest_SupportingInfo another) {
    return Objects.equals(extension, another.extension)
        && information.equals(another.information)
        && Objects.equals(appliesToAll, another.appliesToAll)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(sequence, another.sequence)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code information}, {@code appliesToAll}, {@code modifierExtension}, {@code sequence}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + information.hashCode();
    h += (h << 5) + Objects.hashCode(appliesToAll);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code CoverageEligibilityRequest_SupportingInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CoverageEligibilityRequest_SupportingInfo{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 42) builder.append(", ");
    builder.append("information=").append(information);
    if (appliesToAll != null) {
      builder.append(", ");
      builder.append("appliesToAll=").append(appliesToAll);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (sequence != null) {
      builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CoverageEligibilityRequest_SupportingInfo", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CoverageEligibilityRequest_SupportingInfo {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Reference information;
    @Nullable Optional<Boolean> appliesToAll = Optional.empty();
    boolean appliesToAllIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("information")
    public void setInformation(Reference information) {
      this.information = information;
    }
    @JsonProperty("appliesToAll")
    public void setAppliesToAll(Optional<Boolean> appliesToAll) {
      this.appliesToAll = appliesToAll;
      this.appliesToAllIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("sequence")
    public void setSequence(Optional<PositiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference information() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> appliesToAll() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCoverageEligibilityRequest_SupportingInfo fromJson(Json json) {
    ImmutableCoverageEligibilityRequest_SupportingInfo.Builder builder = ((ImmutableCoverageEligibilityRequest_SupportingInfo.Builder) ImmutableCoverageEligibilityRequest_SupportingInfo.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.information != null) {
      builder.information(json.information);
    }
    if (json.appliesToAllIsSet) {
      builder.appliesToAll(json.appliesToAll);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableCoverageEligibilityRequest_SupportingInfo) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CoverageEligibilityRequest_SupportingInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CoverageEligibilityRequest_SupportingInfo instance
   */
  public static CoverageEligibilityRequest_SupportingInfo copyOf(CoverageEligibilityRequest_SupportingInfo instance) {
    if (instance instanceof ImmutableCoverageEligibilityRequest_SupportingInfo) {
      return (ImmutableCoverageEligibilityRequest_SupportingInfo) instance;
    }
    return ((ImmutableCoverageEligibilityRequest_SupportingInfo.Builder) ImmutableCoverageEligibilityRequest_SupportingInfo.builder())
        .extension(instance.extension())
        .information(instance.information())
        .appliesToAll(instance.appliesToAll())
        .modifierExtension(instance.modifierExtension())
        .sequence(instance.sequence())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link CoverageEligibilityRequest_SupportingInfo CoverageEligibilityRequest_SupportingInfo}.
   * <pre>
   * ImmutableCoverageEligibilityRequest_SupportingInfo.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest_SupportingInfo#extension() extension}
   *    .information(com.medplum.types.fhir.Reference) // required {@link CoverageEligibilityRequest_SupportingInfo#information() information}
   *    .appliesToAll(Boolean) // optional {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension}
   *    .sequence(com.medplum.types.fhir.PositiveInt) // optional {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence}
   *    .id(String) // optional {@link CoverageEligibilityRequest_SupportingInfo#id() id}
   *    .build();
   * </pre>
   * @return A new CoverageEligibilityRequest_SupportingInfo builder
   */
  public static InformationBuildStage builder() {
    return new ImmutableCoverageEligibilityRequest_SupportingInfo.Builder();
  }

  /**
   * Builds instances of type {@link CoverageEligibilityRequest_SupportingInfo CoverageEligibilityRequest_SupportingInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CoverageEligibilityRequest_SupportingInfo", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements InformationBuildStage, BuildFinal {
    private static final long INIT_BIT_INFORMATION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_APPLIES_TO_ALL = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_SEQUENCE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Reference information;
    private @Nullable Boolean appliesToAll;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable PositiveInt sequence;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#extension() extension} to extension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#extension() extension} to extension.
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
     * Initializes the value for the {@link CoverageEligibilityRequest_SupportingInfo#information() information} attribute.
     * @param information The value for information 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("information")
    public final Builder information(Reference information) {
      checkNotIsSet(informationIsSet(), "information");
      this.information = Objects.requireNonNull(information, "information");
      initBits &= ~INIT_BIT_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll} to appliesToAll.
     * @param appliesToAll The value for appliesToAll
     * @return {@code this} builder for chained invocation
     */
    public final Builder appliesToAll(boolean appliesToAll) {
      checkNotIsSet(appliesToAllIsSet(), "appliesToAll");
      this.appliesToAll = appliesToAll;
      optBits |= OPT_BIT_APPLIES_TO_ALL;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll} to appliesToAll.
     * @param appliesToAll The value for appliesToAll
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("appliesToAll")
    public final Builder appliesToAll(Optional<Boolean> appliesToAll) {
      checkNotIsSet(appliesToAllIsSet(), "appliesToAll");
      this.appliesToAll = appliesToAll.orElse(null);
      optBits |= OPT_BIT_APPLIES_TO_ALL;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(PositiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequence")
    public final Builder sequence(Optional<? extends PositiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#id() id} to id.
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
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#id() id} to id.
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
     * Builds a new {@link CoverageEligibilityRequest_SupportingInfo CoverageEligibilityRequest_SupportingInfo}.
     * @return An immutable instance of CoverageEligibilityRequest_SupportingInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CoverageEligibilityRequest_SupportingInfo build() {
      checkRequiredAttributes();
      return new ImmutableCoverageEligibilityRequest_SupportingInfo(extension, information, appliesToAll, modifierExtension, sequence, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean appliesToAllIsSet() {
      return (optBits & OPT_BIT_APPLIES_TO_ALL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean informationIsSet() {
      return (initBits & INIT_BIT_INFORMATION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CoverageEligibilityRequest_SupportingInfo is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!informationIsSet()) attributes.add("information");
      return "Cannot build CoverageEligibilityRequest_SupportingInfo, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CoverageEligibilityRequest_SupportingInfo", generator = "Immutables")
  public interface InformationBuildStage {
    /**
     * Initializes the value for the {@link CoverageEligibilityRequest_SupportingInfo#information() information} attribute.
     * @param information The value for information 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal information(Reference information);
  }

  @Generated(from = "CoverageEligibilityRequest_SupportingInfo", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll} to appliesToAll.
     * @param appliesToAll The value for appliesToAll
     * @return {@code this} builder for chained invocation
     */
    BuildFinal appliesToAll(boolean appliesToAll);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#appliesToAll() appliesToAll} to appliesToAll.
     * @param appliesToAll The value for appliesToAll
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal appliesToAll(Optional<Boolean> appliesToAll);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sequence(PositiveInt sequence);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sequence(Optional<? extends PositiveInt> sequence);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link CoverageEligibilityRequest_SupportingInfo#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link CoverageEligibilityRequest_SupportingInfo CoverageEligibilityRequest_SupportingInfo}.
     * @return An immutable instance of CoverageEligibilityRequest_SupportingInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CoverageEligibilityRequest_SupportingInfo build();
  }
}
