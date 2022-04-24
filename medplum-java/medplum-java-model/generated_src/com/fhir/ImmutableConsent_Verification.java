//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Consent_Verification}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConsent_Verification.builder()}.
 */
@org.immutables.value.Generated(from = "Consent_Verification", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConsent_Verification implements com.fhir.Consent_Verification {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.dateTime verificationDate;
  private final @javax.annotation.Nullable java.lang.Boolean verified;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference verifiedWith;
  private final @javax.annotation.Nullable java.lang.String id;

  private ImmutableConsent_Verification(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.dateTime verificationDate,
      @javax.annotation.Nullable java.lang.Boolean verified,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference verifiedWith,
      @javax.annotation.Nullable java.lang.String id) {
    this.modifierExtension = modifierExtension;
    this.verificationDate = verificationDate;
    this.verified = verified;
    this.extension = extension;
    this.verifiedWith = verifiedWith;
    this.id = id;
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
   * @return The value of the {@code verificationDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("verificationDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> verificationDate() {
    return java.util.Optional.ofNullable(verificationDate);
  }

  /**
   * @return The value of the {@code verified} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("verified")
  @Override
  public java.util.Optional<java.lang.Boolean> verified() {
    return java.util.Optional.ofNullable(verified);
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
   * @return The value of the {@code verifiedWith} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("verifiedWith")
  @Override
  public java.util.Optional<com.fhir.Reference> verifiedWith() {
    return java.util.Optional.ofNullable(verifiedWith);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Verification#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConsent_Verification(newValue, this.verificationDate, this.verified, this.extension, this.verifiedWith, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Verification#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Verification withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConsent_Verification(value, this.verificationDate, this.verified, this.extension, this.verifiedWith, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Verification#verificationDate() verificationDate} attribute.
   * @param value The value for verificationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withVerificationDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "verificationDate");
    if (this.verificationDate == newValue) return this;
    return new ImmutableConsent_Verification(this.modifierExtension, newValue, this.verified, this.extension, this.verifiedWith, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Verification#verificationDate() verificationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for verificationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Verification withVerificationDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.verificationDate == value) return this;
    return new ImmutableConsent_Verification(this.modifierExtension, value, this.verified, this.extension, this.verifiedWith, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Verification#verified() verified} attribute.
   * @param value The value for verified
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withVerified(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.verified, newValue)) return this;
    return new ImmutableConsent_Verification(
        this.modifierExtension,
        this.verificationDate,
        newValue,
        this.extension,
        this.verifiedWith,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Verification#verified() verified} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for verified
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withVerified(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.verified, value)) return this;
    return new ImmutableConsent_Verification(
        this.modifierExtension,
        this.verificationDate,
        value,
        this.extension,
        this.verifiedWith,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Verification#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConsent_Verification(
        this.modifierExtension,
        this.verificationDate,
        this.verified,
        newValue,
        this.verifiedWith,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Verification#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Verification withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConsent_Verification(this.modifierExtension, this.verificationDate, this.verified, value, this.verifiedWith, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Verification#verifiedWith() verifiedWith} attribute.
   * @param value The value for verifiedWith
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withVerifiedWith(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "verifiedWith");
    if (this.verifiedWith == newValue) return this;
    return new ImmutableConsent_Verification(this.modifierExtension, this.verificationDate, this.verified, this.extension, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Verification#verifiedWith() verifiedWith} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for verifiedWith
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Verification withVerifiedWith(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.verifiedWith == value) return this;
    return new ImmutableConsent_Verification(this.modifierExtension, this.verificationDate, this.verified, this.extension, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Verification#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableConsent_Verification(
        this.modifierExtension,
        this.verificationDate,
        this.verified,
        this.extension,
        this.verifiedWith,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Verification#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Verification withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableConsent_Verification(
        this.modifierExtension,
        this.verificationDate,
        this.verified,
        this.extension,
        this.verifiedWith,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConsent_Verification} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConsent_Verification
        && equalTo((ImmutableConsent_Verification) another);
  }

  private boolean equalTo(ImmutableConsent_Verification another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(verificationDate, another.verificationDate)
        && java.util.Objects.equals(verified, another.verified)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(verifiedWith, another.verifiedWith)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code verificationDate}, {@code verified}, {@code extension}, {@code verifiedWith}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(verificationDate);
    h += (h << 5) + java.util.Objects.hashCode(verified);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(verifiedWith);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Consent_Verification} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Consent_Verification{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (verificationDate != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("verificationDate=").append(verificationDate);
    }
    if (verified != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("verified=").append(verified);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (verifiedWith != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("verifiedWith=").append(verifiedWith);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Consent_Verification", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Consent_Verification {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> verificationDate = java.util.Optional.empty();
    boolean verificationDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> verified = java.util.Optional.empty();
    boolean verifiedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> verifiedWith = java.util.Optional.empty();
    boolean verifiedWithIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("verificationDate")
    public void setVerificationDate(java.util.Optional<com.fhir.dateTime> verificationDate) {
      this.verificationDate = verificationDate;
      this.verificationDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("verified")
    public void setVerified(java.util.Optional<java.lang.Boolean> verified) {
      this.verified = verified;
      this.verifiedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("verifiedWith")
    public void setVerifiedWith(java.util.Optional<com.fhir.Reference> verifiedWith) {
      this.verifiedWith = verifiedWith;
      this.verifiedWithIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> verificationDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> verified() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> verifiedWith() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableConsent_Verification fromJson(Json json) {
    ImmutableConsent_Verification.Builder builder = ImmutableConsent_Verification.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.verificationDateIsSet) {
      builder.verificationDate(json.verificationDate);
    }
    if (json.verifiedIsSet) {
      builder.verified(json.verified);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.verifiedWithIsSet) {
      builder.verifiedWith(json.verifiedWith);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .modifierExtension(instance.modifierExtension())
        .verificationDate(instance.verificationDate())
        .verified(instance.verified())
        .extension(instance.extension())
        .verifiedWith(instance.verifiedWith())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Consent_Verification Consent_Verification}.
   * <pre>
   * ImmutableConsent_Verification.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Consent_Verification#modifierExtension() modifierExtension}
   *    .verificationDate(com.fhir.dateTime) // optional {@link Consent_Verification#verificationDate() verificationDate}
   *    .verified(Boolean) // optional {@link Consent_Verification#verified() verified}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Consent_Verification#extension() extension}
   *    .verifiedWith(com.fhir.Reference) // optional {@link Consent_Verification#verifiedWith() verifiedWith}
   *    .id(String) // optional {@link Consent_Verification#id() id}
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
  @org.immutables.value.Generated(from = "Consent_Verification", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_VERIFICATION_DATE = 0x2L;
    private static final long OPT_BIT_VERIFIED = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_VERIFIED_WITH = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.dateTime verificationDate;
    private @javax.annotation.Nullable java.lang.Boolean verified;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference verifiedWith;
    private @javax.annotation.Nullable java.lang.String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Consent_Verification#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent_Verification#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent_Verification#verificationDate() verificationDate} to verificationDate.
     * @param verificationDate The value for verificationDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder verificationDate(com.fhir.dateTime verificationDate) {
      checkNotIsSet(verificationDateIsSet(), "verificationDate");
      this.verificationDate = java.util.Objects.requireNonNull(verificationDate, "verificationDate");
      optBits |= OPT_BIT_VERIFICATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Verification#verificationDate() verificationDate} to verificationDate.
     * @param verificationDate The value for verificationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verificationDate")
    public final Builder verificationDate(java.util.Optional<? extends com.fhir.dateTime> verificationDate) {
      checkNotIsSet(verificationDateIsSet(), "verificationDate");
      this.verificationDate = verificationDate.orElse(null);
      optBits |= OPT_BIT_VERIFICATION_DATE;
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
    @com.fasterxml.jackson.annotation.JsonProperty("verified")
    public final Builder verified(java.util.Optional<java.lang.Boolean> verified) {
      checkNotIsSet(verifiedIsSet(), "verified");
      this.verified = verified.orElse(null);
      optBits |= OPT_BIT_VERIFIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Verification#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent_Verification#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent_Verification#verifiedWith() verifiedWith} to verifiedWith.
     * @param verifiedWith The value for verifiedWith
     * @return {@code this} builder for chained invocation
     */
    public final Builder verifiedWith(com.fhir.Reference verifiedWith) {
      checkNotIsSet(verifiedWithIsSet(), "verifiedWith");
      this.verifiedWith = java.util.Objects.requireNonNull(verifiedWith, "verifiedWith");
      optBits |= OPT_BIT_VERIFIED_WITH;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Verification#verifiedWith() verifiedWith} to verifiedWith.
     * @param verifiedWith The value for verifiedWith
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verifiedWith")
    public final Builder verifiedWith(java.util.Optional<? extends com.fhir.Reference> verifiedWith) {
      checkNotIsSet(verifiedWithIsSet(), "verifiedWith");
      this.verifiedWith = verifiedWith.orElse(null);
      optBits |= OPT_BIT_VERIFIED_WITH;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Verification#id() id} to id.
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
     * Initializes the optional value {@link Consent_Verification#id() id} to id.
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
     * Builds a new {@link Consent_Verification Consent_Verification}.
     * @return An immutable instance of Consent_Verification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Consent_Verification build() {
      return new ImmutableConsent_Verification(modifierExtension, verificationDate, verified, extension, verifiedWith, id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean verificationDateIsSet() {
      return (optBits & OPT_BIT_VERIFICATION_DATE) != 0;
    }

    private boolean verifiedIsSet() {
      return (optBits & OPT_BIT_VERIFIED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean verifiedWithIsSet() {
      return (optBits & OPT_BIT_VERIFIED_WITH) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Consent_Verification is strict, attribute is already set: ".concat(name));
    }
  }
}
