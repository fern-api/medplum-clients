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
 * Immutable implementation of {@link Consent_Verification}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConsent_Verification.builder()}.
 */
@Generated(from = "Consent_Verification", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConsent_Verification implements Consent_Verification {
  private final @Nullable String id;
  private final @Nullable DateTime verificationDate;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference verifiedWith;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean verified;

  private ImmutableConsent_Verification(
      @Nullable String id,
      @Nullable DateTime verificationDate,
      @Nullable List<Extension> extension,
      @Nullable Reference verifiedWith,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean verified) {
    this.id = id;
    this.verificationDate = verificationDate;
    this.extension = extension;
    this.verifiedWith = verifiedWith;
    this.modifierExtension = modifierExtension;
    this.verified = verified;
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
   * @return The value of the {@code verificationDate} attribute
   */
  @JsonProperty("verificationDate")
  @Override
  public Optional<DateTime> verificationDate() {
    return Optional.ofNullable(verificationDate);
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
   * @return The value of the {@code verifiedWith} attribute
   */
  @JsonProperty("verifiedWith")
  @Override
  public Optional<Reference> verifiedWith() {
    return Optional.ofNullable(verifiedWith);
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
   * @return The value of the {@code verified} attribute
   */
  @JsonProperty("verified")
  @Override
  public Optional<Boolean> verified() {
    return Optional.ofNullable(verified);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Verification#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableConsent_Verification(
        newValue,
        this.verificationDate,
        this.extension,
        this.verifiedWith,
        this.modifierExtension,
        this.verified);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Verification#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableConsent_Verification(
        value,
        this.verificationDate,
        this.extension,
        this.verifiedWith,
        this.modifierExtension,
        this.verified);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Verification#verificationDate() verificationDate} attribute.
   * @param value The value for verificationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withVerificationDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "verificationDate");
    if (this.verificationDate == newValue) return this;
    return new ImmutableConsent_Verification(this.id, newValue, this.extension, this.verifiedWith, this.modifierExtension, this.verified);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Verification#verificationDate() verificationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for verificationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Verification withVerificationDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.verificationDate == value) return this;
    return new ImmutableConsent_Verification(this.id, value, this.extension, this.verifiedWith, this.modifierExtension, this.verified);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Verification#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConsent_Verification(
        this.id,
        this.verificationDate,
        newValue,
        this.verifiedWith,
        this.modifierExtension,
        this.verified);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Verification#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Verification withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConsent_Verification(this.id, this.verificationDate, value, this.verifiedWith, this.modifierExtension, this.verified);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Verification#verifiedWith() verifiedWith} attribute.
   * @param value The value for verifiedWith
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withVerifiedWith(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "verifiedWith");
    if (this.verifiedWith == newValue) return this;
    return new ImmutableConsent_Verification(this.id, this.verificationDate, this.extension, newValue, this.modifierExtension, this.verified);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Verification#verifiedWith() verifiedWith} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for verifiedWith
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Verification withVerifiedWith(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.verifiedWith == value) return this;
    return new ImmutableConsent_Verification(this.id, this.verificationDate, this.extension, value, this.modifierExtension, this.verified);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Verification#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConsent_Verification(this.id, this.verificationDate, this.extension, this.verifiedWith, newValue, this.verified);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Verification#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Verification withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConsent_Verification(this.id, this.verificationDate, this.extension, this.verifiedWith, value, this.verified);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Verification#verified() verified} attribute.
   * @param value The value for verified
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withVerified(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.verified, newValue)) return this;
    return new ImmutableConsent_Verification(
        this.id,
        this.verificationDate,
        this.extension,
        this.verifiedWith,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Verification#verified() verified} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for verified
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withVerified(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.verified, value)) return this;
    return new ImmutableConsent_Verification(
        this.id,
        this.verificationDate,
        this.extension,
        this.verifiedWith,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConsent_Verification} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConsent_Verification
        && equalTo((ImmutableConsent_Verification) another);
  }

  private boolean equalTo(ImmutableConsent_Verification another) {
    return Objects.equals(id, another.id)
        && Objects.equals(verificationDate, another.verificationDate)
        && Objects.equals(extension, another.extension)
        && Objects.equals(verifiedWith, another.verifiedWith)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(verified, another.verified);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code verificationDate}, {@code extension}, {@code verifiedWith}, {@code modifierExtension}, {@code verified}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(verificationDate);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(verifiedWith);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(verified);
    return h;
  }

  /**
   * Prints the immutable value {@code Consent_Verification} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Consent_Verification{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (verificationDate != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("verificationDate=").append(verificationDate);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (verifiedWith != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("verifiedWith=").append(verifiedWith);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (verified != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("verified=").append(verified);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Consent_Verification", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Consent_Verification {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<DateTime> verificationDate = Optional.empty();
    boolean verificationDateIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> verifiedWith = Optional.empty();
    boolean verifiedWithIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> verified = Optional.empty();
    boolean verifiedIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("verificationDate")
    public void setVerificationDate(Optional<DateTime> verificationDate) {
      this.verificationDate = verificationDate;
      this.verificationDateIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("verifiedWith")
    public void setVerifiedWith(Optional<Reference> verifiedWith) {
      this.verifiedWith = verifiedWith;
      this.verifiedWithIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("verified")
    public void setVerified(Optional<Boolean> verified) {
      this.verified = verified;
      this.verifiedIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> verificationDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> verifiedWith() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> verified() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableConsent_Verification fromJson(Json json) {
    ImmutableConsent_Verification.Builder builder = ImmutableConsent_Verification.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.verificationDateIsSet) {
      builder.verificationDate(json.verificationDate);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.verifiedWithIsSet) {
      builder.verifiedWith(json.verifiedWith);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.verifiedIsSet) {
      builder.verified(json.verified);
    }
    return (ImmutableConsent_Verification) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Consent_Verification} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Consent_Verification instance
   */
  public static Consent_Verification copyOf(Consent_Verification instance) {
    if (instance instanceof ImmutableConsent_Verification) {
      return (ImmutableConsent_Verification) instance;
    }
    return ImmutableConsent_Verification.builder()
        .id(instance.id())
        .verificationDate(instance.verificationDate())
        .extension(instance.extension())
        .verifiedWith(instance.verifiedWith())
        .modifierExtension(instance.modifierExtension())
        .verified(instance.verified())
        .build();
  }

  /**
   * Creates a builder for {@link Consent_Verification Consent_Verification}.
   * <pre>
   * ImmutableConsent_Verification.builder()
   *    .id(String) // optional {@link Consent_Verification#id() id}
   *    .verificationDate(com.medplum.types.fhir.DateTime) // optional {@link Consent_Verification#verificationDate() verificationDate}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Consent_Verification#extension() extension}
   *    .verifiedWith(com.medplum.types.fhir.Reference) // optional {@link Consent_Verification#verifiedWith() verifiedWith}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Consent_Verification#modifierExtension() modifierExtension}
   *    .verified(Boolean) // optional {@link Consent_Verification#verified() verified}
   *    .build();
   * </pre>
   * @return A new Consent_Verification builder
   */
  public static ImmutableConsent_Verification.Builder builder() {
    return new ImmutableConsent_Verification.Builder();
  }

  /**
   * Builds instances of type {@link Consent_Verification Consent_Verification}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Consent_Verification", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_VERIFICATION_DATE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_VERIFIED_WITH = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_VERIFIED = 0x20L;
    private long optBits;

    private @Nullable String id;
    private @Nullable DateTime verificationDate;
    private @Nullable List<Extension> extension;
    private @Nullable Reference verifiedWith;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean verified;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Consent_Verification#id() id} to id.
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
     * Initializes the optional value {@link Consent_Verification#id() id} to id.
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
     * Initializes the optional value {@link Consent_Verification#verificationDate() verificationDate} to verificationDate.
     * @param verificationDate The value for verificationDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder verificationDate(DateTime verificationDate) {
      checkNotIsSet(verificationDateIsSet(), "verificationDate");
      this.verificationDate = Objects.requireNonNull(verificationDate, "verificationDate");
      optBits |= OPT_BIT_VERIFICATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Verification#verificationDate() verificationDate} to verificationDate.
     * @param verificationDate The value for verificationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("verificationDate")
    public final Builder verificationDate(Optional<? extends DateTime> verificationDate) {
      checkNotIsSet(verificationDateIsSet(), "verificationDate");
      this.verificationDate = verificationDate.orElse(null);
      optBits |= OPT_BIT_VERIFICATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Verification#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent_Verification#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent_Verification#verifiedWith() verifiedWith} to verifiedWith.
     * @param verifiedWith The value for verifiedWith
     * @return {@code this} builder for chained invocation
     */
    public final Builder verifiedWith(Reference verifiedWith) {
      checkNotIsSet(verifiedWithIsSet(), "verifiedWith");
      this.verifiedWith = Objects.requireNonNull(verifiedWith, "verifiedWith");
      optBits |= OPT_BIT_VERIFIED_WITH;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Verification#verifiedWith() verifiedWith} to verifiedWith.
     * @param verifiedWith The value for verifiedWith
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("verifiedWith")
    public final Builder verifiedWith(Optional<? extends Reference> verifiedWith) {
      checkNotIsSet(verifiedWithIsSet(), "verifiedWith");
      this.verifiedWith = verifiedWith.orElse(null);
      optBits |= OPT_BIT_VERIFIED_WITH;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Verification#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent_Verification#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent_Verification#verified() verified} to verified.
     * @param verified The value for verified
     * @return {@code this} builder for chained invocation
     */
    public final Builder verified(boolean verified) {
      checkNotIsSet(verifiedIsSet(), "verified");
      this.verified = verified;
      optBits |= OPT_BIT_VERIFIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Verification#verified() verified} to verified.
     * @param verified The value for verified
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("verified")
    public final Builder verified(Optional<Boolean> verified) {
      checkNotIsSet(verifiedIsSet(), "verified");
      this.verified = verified.orElse(null);
      optBits |= OPT_BIT_VERIFIED;
      return this;
    }

    /**
     * Builds a new {@link Consent_Verification Consent_Verification}.
     * @return An immutable instance of Consent_Verification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Consent_Verification build() {
      return new ImmutableConsent_Verification(id, verificationDate, extension, verifiedWith, modifierExtension, verified);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean verificationDateIsSet() {
      return (optBits & OPT_BIT_VERIFICATION_DATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean verifiedWithIsSet() {
      return (optBits & OPT_BIT_VERIFIED_WITH) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean verifiedIsSet() {
      return (optBits & OPT_BIT_VERIFIED) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Consent_Verification is strict, attribute is already set: ".concat(name));
    }
  }
}
